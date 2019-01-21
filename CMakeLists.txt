cmake_minimum_required(VERSION 3.11)

if(WIN32)
  set(db_sln_dir ${CMAKE_CURRENT_SOURCE_DIR}/build_windows/VS15)
  
  if(${CMAKE_VS_WINDOWS_TARGET_PLATFORM_VERSION} MATCHES 10.0.17763.0)
    set(db_patch ${db_sln_dir}/../../../patches/berkeleydb_141_17763_retargeting.patch)
  else()
    set(db_patch ${db_sln_dir}/../../../patches/berkeleydb_141_17134_retargeting.patch)
  endif()
  
  execute_process(COMMAND git apply --ignore-space-change ${db_patch}
                  WORKING_DIRECTORY ${db_sln_dir})
				  
  if(CMAKE_BUILD_TYPE MATCHES Debug)
    set(msbuild_config "/p:Configuration=Static Debug")
    set(build_type_folder "Static Debug")
    set(_bdb_debug_suffix d)
  else()
    set(msbuild_config "/p:Configuration=Static Release")
    set(build_type_folder "Static Release")
  endif()
  
  set(msbuild_parallel "/m")
  set(msbuild_platform "/p:platform=x64")
  set(proj_to_build "db.vcxproj")
  execute_process(COMMAND ${CMAKE_VS_MSBUILD_COMMAND} ${msbuild_parallel} ${proj_to_build} ${msbuild_config} ${msbuild_platform}
				  WORKING_DIRECTORY ${db_sln_dir})
				  
  execute_process(COMMAND git apply ${db_patch} -R
                  WORKING_DIRECTORY ${db_sln_dir})
				  
  set(_db_lib_folder ${db_sln_dir}/../x64)
  set(_bdb_lib_name libdb181s)
  set(include_files_location ${CMAKE_CURRENT_SOURCE_DIR}/build_windows)

else()
  set(_db_working_folder ${CMAKE_CURRENT_SOURCE_DIR}/build_unix)
  
  if(CMAKE_BUILD_TYPE MATCHES Debug)
    set(build_debug_option "--enable-debug")
  endif()

  execute_process(COMMAND sh ../dist/configure --prefix=${_db_working_folder}/build --disable-shared --with-repmgr-ssl=no --enable-cxx ${build_debug_option}
                  WORKING_DIRECTORY ${_db_working_folder})

  execute_process(COMMAND make -j4
                  WORKING_DIRECTORY ${_db_working_folder})
                  
  execute_process(COMMAND make install
                  WORKING_DIRECTORY ${_db_working_folder})

  set(_db_lib_folder ${_db_working_folder}/build/lib)
  set(build_type_folder .)
  set(_bdb_lib_name libdb_cxx-18.1)
  set(include_files_location ${_db_working_folder}/build/include)
endif()



add_library(BerkeleyDB STATIC IMPORTED GLOBAL)
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELEASE
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELWITHDEBINFO
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_DEBUG
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${_bdb_debug_suffix}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
  
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELMONITOR
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELSPAM
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELWALLET
  ${_db_lib_folder}/${build_type_folder}/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
  
target_include_directories(BerkeleyDB SYSTEM INTERFACE ${include_files_location})

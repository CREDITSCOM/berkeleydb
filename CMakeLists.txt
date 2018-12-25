cmake_minimum_required(VERSION 3.11)

if(WIN32)
  set(db_sln_dir ${CMAKE_CURRENT_SOURCE_DIR}/build_windows)
  
  if(${CMAKE_VS_WINDOWS_TARGET_PLATFORM_VERSION} MATCHES 10.0.17763.0)
    set(db_patch ${db_sln_dir}/../berkeleydb_141_17763.patch)
  else()
    set(db_patch ${db_sln_dir}/../berkeleydb_141_17134.patch)
  endif()
  
  execute_process(COMMAND git apply ${db_patch}
                  WORKING_DIRECTORY ${db_sln_dir})
				  
  if(CMAKE_BUILD_TYPE MATCHES Debug)
    set(msbuild_property "/p:Configuration=Debug")
  else()
    set(msbuild_property "/p:Configuration=Release")
  endif()
  
  set(msbuild_parallel "/m")
  set(msbuild_platform "/p:platform=x64")
  set(proj_to_build "Berkeley_DB_vs2015.sln")
  execute_process(COMMAND ${CMAKE_VS_MSBUILD_COMMAND} ${msbuild_parallel} ${proj_to_build} ${msbuild_property} ${msbuild_platform}
				  WORKING_DIRECTORY ${db_sln_dir})
				  
  execute_process(COMMAND git apply ${db_patch} -R
                  WORKING_DIRECTORY ${db_sln_dir})
				  
  set(_db_lib_folder ${db_sln_dir}/x64)

else()

endif()

set(_bdb_lib_name libdb181)

add_library(BerkeleyDB STATIC IMPORTED GLOBAL)
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELEASE
  ${_db_lib_folder}/Release/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_RELWITHDEBINFO
  ${_db_lib_folder}/Release/${_bdb_lib_name}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
set_property(TARGET BerkeleyDB PROPERTY IMPORTED_LOCATION_DEBUG
  ${_db_lib_folder}/Debug/${_bdb_lib_name}${_bdb_debug_suffix}${CMAKE_STATIC_LIBRARY_SUFFIX}
  )
  
target_include_directories(BerkeleyDB SYSTEM INTERFACE
  ${CMAKE_CURRENT_SOURCE_DIR}/build_windows)
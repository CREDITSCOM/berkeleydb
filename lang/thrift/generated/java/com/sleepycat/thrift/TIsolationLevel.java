/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TIsolationLevel implements org.apache.thrift.TEnum {
  READ_COMMITTED(1),
  READ_UNCOMMITTED(2),
  SNAPSHOT(3);

  private final int value;

  private TIsolationLevel(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TIsolationLevel findByValue(int value) { 
    switch (value) {
      case 1:
        return READ_COMMITTED;
      case 2:
        return READ_UNCOMMITTED;
      case 3:
        return SNAPSHOT;
      default:
        return null;
    }
  }
}

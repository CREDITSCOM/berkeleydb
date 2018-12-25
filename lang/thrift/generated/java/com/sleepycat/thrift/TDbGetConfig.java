/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-25")
public class TDbGetConfig implements org.apache.thrift.TBase<TDbGetConfig, TDbGetConfig._Fields>, java.io.Serializable, Cloneable, Comparable<TDbGetConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDbGetConfig");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MULTIPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("multiple", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField RMW_FIELD_DESC = new org.apache.thrift.protocol.TField("rmw", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField ISO_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("isoLevel", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDbGetConfigStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDbGetConfigTupleSchemeFactory();

  /**
   * 
   * @see TDbGetMode
   */
  public TDbGetMode mode; // required
  public boolean multiple; // optional
  public boolean rmw; // optional
  /**
   * 
   * @see TIsolationLevel
   */
  public TIsolationLevel isoLevel; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TDbGetMode
     */
    MODE((short)1, "mode"),
    MULTIPLE((short)2, "multiple"),
    RMW((short)3, "rmw"),
    /**
     * 
     * @see TIsolationLevel
     */
    ISO_LEVEL((short)4, "isoLevel");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MODE
          return MODE;
        case 2: // MULTIPLE
          return MULTIPLE;
        case 3: // RMW
          return RMW;
        case 4: // ISO_LEVEL
          return ISO_LEVEL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MULTIPLE_ISSET_ID = 0;
  private static final int __RMW_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MULTIPLE,_Fields.RMW,_Fields.ISO_LEVEL};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDbGetMode.class)));
    tmpMap.put(_Fields.MULTIPLE, new org.apache.thrift.meta_data.FieldMetaData("multiple", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RMW, new org.apache.thrift.meta_data.FieldMetaData("rmw", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ISO_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("isoLevel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TIsolationLevel.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDbGetConfig.class, metaDataMap);
  }

  public TDbGetConfig() {
  }

  public TDbGetConfig(
    TDbGetMode mode)
  {
    this();
    this.mode = mode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDbGetConfig(TDbGetConfig other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    this.multiple = other.multiple;
    this.rmw = other.rmw;
    if (other.isSetIsoLevel()) {
      this.isoLevel = other.isoLevel;
    }
  }

  public TDbGetConfig deepCopy() {
    return new TDbGetConfig(this);
  }

  @Override
  public void clear() {
    this.mode = null;
    setMultipleIsSet(false);
    this.multiple = false;
    setRmwIsSet(false);
    this.rmw = false;
    this.isoLevel = null;
  }

  /**
   * 
   * @see TDbGetMode
   */
  public TDbGetMode getMode() {
    return this.mode;
  }

  /**
   * 
   * @see TDbGetMode
   */
  public TDbGetConfig setMode(TDbGetMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public boolean isMultiple() {
    return this.multiple;
  }

  public TDbGetConfig setMultiple(boolean multiple) {
    this.multiple = multiple;
    setMultipleIsSet(true);
    return this;
  }

  public void unsetMultiple() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MULTIPLE_ISSET_ID);
  }

  /** Returns true if field multiple is set (has been assigned a value) and false otherwise */
  public boolean isSetMultiple() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MULTIPLE_ISSET_ID);
  }

  public void setMultipleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MULTIPLE_ISSET_ID, value);
  }

  public boolean isRmw() {
    return this.rmw;
  }

  public TDbGetConfig setRmw(boolean rmw) {
    this.rmw = rmw;
    setRmwIsSet(true);
    return this;
  }

  public void unsetRmw() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RMW_ISSET_ID);
  }

  /** Returns true if field rmw is set (has been assigned a value) and false otherwise */
  public boolean isSetRmw() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RMW_ISSET_ID);
  }

  public void setRmwIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RMW_ISSET_ID, value);
  }

  /**
   * 
   * @see TIsolationLevel
   */
  public TIsolationLevel getIsoLevel() {
    return this.isoLevel;
  }

  /**
   * 
   * @see TIsolationLevel
   */
  public TDbGetConfig setIsoLevel(TIsolationLevel isoLevel) {
    this.isoLevel = isoLevel;
    return this;
  }

  public void unsetIsoLevel() {
    this.isoLevel = null;
  }

  /** Returns true if field isoLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetIsoLevel() {
    return this.isoLevel != null;
  }

  public void setIsoLevelIsSet(boolean value) {
    if (!value) {
      this.isoLevel = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((TDbGetMode)value);
      }
      break;

    case MULTIPLE:
      if (value == null) {
        unsetMultiple();
      } else {
        setMultiple((java.lang.Boolean)value);
      }
      break;

    case RMW:
      if (value == null) {
        unsetRmw();
      } else {
        setRmw((java.lang.Boolean)value);
      }
      break;

    case ISO_LEVEL:
      if (value == null) {
        unsetIsoLevel();
      } else {
        setIsoLevel((TIsolationLevel)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return getMode();

    case MULTIPLE:
      return isMultiple();

    case RMW:
      return isRmw();

    case ISO_LEVEL:
      return getIsoLevel();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case MULTIPLE:
      return isSetMultiple();
    case RMW:
      return isSetRmw();
    case ISO_LEVEL:
      return isSetIsoLevel();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDbGetConfig)
      return this.equals((TDbGetConfig)that);
    return false;
  }

  public boolean equals(TDbGetConfig that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_multiple = true && this.isSetMultiple();
    boolean that_present_multiple = true && that.isSetMultiple();
    if (this_present_multiple || that_present_multiple) {
      if (!(this_present_multiple && that_present_multiple))
        return false;
      if (this.multiple != that.multiple)
        return false;
    }

    boolean this_present_rmw = true && this.isSetRmw();
    boolean that_present_rmw = true && that.isSetRmw();
    if (this_present_rmw || that_present_rmw) {
      if (!(this_present_rmw && that_present_rmw))
        return false;
      if (this.rmw != that.rmw)
        return false;
    }

    boolean this_present_isoLevel = true && this.isSetIsoLevel();
    boolean that_present_isoLevel = true && that.isSetIsoLevel();
    if (this_present_isoLevel || that_present_isoLevel) {
      if (!(this_present_isoLevel && that_present_isoLevel))
        return false;
      if (!this.isoLevel.equals(that.isoLevel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMode()) ? 131071 : 524287);
    if (isSetMode())
      hashCode = hashCode * 8191 + mode.getValue();

    hashCode = hashCode * 8191 + ((isSetMultiple()) ? 131071 : 524287);
    if (isSetMultiple())
      hashCode = hashCode * 8191 + ((multiple) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetRmw()) ? 131071 : 524287);
    if (isSetRmw())
      hashCode = hashCode * 8191 + ((rmw) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetIsoLevel()) ? 131071 : 524287);
    if (isSetIsoLevel())
      hashCode = hashCode * 8191 + isoLevel.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDbGetConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMultiple()).compareTo(other.isSetMultiple());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMultiple()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.multiple, other.multiple);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRmw()).compareTo(other.isSetRmw());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRmw()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rmw, other.rmw);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsoLevel()).compareTo(other.isSetIsoLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsoLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isoLevel, other.isoLevel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDbGetConfig(");
    boolean first = true;

    sb.append("mode:");
    if (this.mode == null) {
      sb.append("null");
    } else {
      sb.append(this.mode);
    }
    first = false;
    if (isSetMultiple()) {
      if (!first) sb.append(", ");
      sb.append("multiple:");
      sb.append(this.multiple);
      first = false;
    }
    if (isSetRmw()) {
      if (!first) sb.append(", ");
      sb.append("rmw:");
      sb.append(this.rmw);
      first = false;
    }
    if (isSetIsoLevel()) {
      if (!first) sb.append(", ");
      sb.append("isoLevel:");
      if (this.isoLevel == null) {
        sb.append("null");
      } else {
        sb.append(this.isoLevel);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDbGetConfigStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDbGetConfigStandardScheme getScheme() {
      return new TDbGetConfigStandardScheme();
    }
  }

  private static class TDbGetConfigStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDbGetConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDbGetConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = com.sleepycat.thrift.TDbGetMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MULTIPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.multiple = iprot.readBool();
              struct.setMultipleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RMW
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.rmw = iprot.readBool();
              struct.setRmwIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ISO_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isoLevel = com.sleepycat.thrift.TIsolationLevel.findByValue(iprot.readI32());
              struct.setIsoLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDbGetConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mode != null) {
        oprot.writeFieldBegin(MODE_FIELD_DESC);
        oprot.writeI32(struct.mode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetMultiple()) {
        oprot.writeFieldBegin(MULTIPLE_FIELD_DESC);
        oprot.writeBool(struct.multiple);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRmw()) {
        oprot.writeFieldBegin(RMW_FIELD_DESC);
        oprot.writeBool(struct.rmw);
        oprot.writeFieldEnd();
      }
      if (struct.isoLevel != null) {
        if (struct.isSetIsoLevel()) {
          oprot.writeFieldBegin(ISO_LEVEL_FIELD_DESC);
          oprot.writeI32(struct.isoLevel.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDbGetConfigTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDbGetConfigTupleScheme getScheme() {
      return new TDbGetConfigTupleScheme();
    }
  }

  private static class TDbGetConfigTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDbGetConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDbGetConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetMultiple()) {
        optionals.set(1);
      }
      if (struct.isSetRmw()) {
        optionals.set(2);
      }
      if (struct.isSetIsoLevel()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetMultiple()) {
        oprot.writeBool(struct.multiple);
      }
      if (struct.isSetRmw()) {
        oprot.writeBool(struct.rmw);
      }
      if (struct.isSetIsoLevel()) {
        oprot.writeI32(struct.isoLevel.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDbGetConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.mode = com.sleepycat.thrift.TDbGetMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.multiple = iprot.readBool();
        struct.setMultipleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rmw = iprot.readBool();
        struct.setRmwIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isoLevel = com.sleepycat.thrift.TIsolationLevel.findByValue(iprot.readI32());
        struct.setIsoLevelIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


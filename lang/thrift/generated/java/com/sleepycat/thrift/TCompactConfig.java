/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-25")
public class TCompactConfig implements org.apache.thrift.TBase<TCompactConfig, TCompactConfig._Fields>, java.io.Serializable, Cloneable, Comparable<TCompactConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCompactConfig");

  private static final org.apache.thrift.protocol.TField FILL_PERCENT_FIELD_DESC = new org.apache.thrift.protocol.TField("fillPercent", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FREE_LIST_ONLY_FIELD_DESC = new org.apache.thrift.protocol.TField("freeListOnly", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField FREE_SPACE_FIELD_DESC = new org.apache.thrift.protocol.TField("freeSpace", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_PAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("maxPages", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCompactConfigStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCompactConfigTupleSchemeFactory();

  public int fillPercent; // optional
  public boolean freeListOnly; // optional
  public boolean freeSpace; // optional
  public int maxPages; // optional
  public int timeout; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILL_PERCENT((short)1, "fillPercent"),
    FREE_LIST_ONLY((short)2, "freeListOnly"),
    FREE_SPACE((short)3, "freeSpace"),
    MAX_PAGES((short)4, "maxPages"),
    TIMEOUT((short)5, "timeout");

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
        case 1: // FILL_PERCENT
          return FILL_PERCENT;
        case 2: // FREE_LIST_ONLY
          return FREE_LIST_ONLY;
        case 3: // FREE_SPACE
          return FREE_SPACE;
        case 4: // MAX_PAGES
          return MAX_PAGES;
        case 5: // TIMEOUT
          return TIMEOUT;
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
  private static final int __FILLPERCENT_ISSET_ID = 0;
  private static final int __FREELISTONLY_ISSET_ID = 1;
  private static final int __FREESPACE_ISSET_ID = 2;
  private static final int __MAXPAGES_ISSET_ID = 3;
  private static final int __TIMEOUT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FILL_PERCENT,_Fields.FREE_LIST_ONLY,_Fields.FREE_SPACE,_Fields.MAX_PAGES,_Fields.TIMEOUT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILL_PERCENT, new org.apache.thrift.meta_data.FieldMetaData("fillPercent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_LIST_ONLY, new org.apache.thrift.meta_data.FieldMetaData("freeListOnly", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FREE_SPACE, new org.apache.thrift.meta_data.FieldMetaData("freeSpace", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.MAX_PAGES, new org.apache.thrift.meta_data.FieldMetaData("maxPages", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("timeout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCompactConfig.class, metaDataMap);
  }

  public TCompactConfig() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCompactConfig(TCompactConfig other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fillPercent = other.fillPercent;
    this.freeListOnly = other.freeListOnly;
    this.freeSpace = other.freeSpace;
    this.maxPages = other.maxPages;
    this.timeout = other.timeout;
  }

  public TCompactConfig deepCopy() {
    return new TCompactConfig(this);
  }

  @Override
  public void clear() {
    setFillPercentIsSet(false);
    this.fillPercent = 0;
    setFreeListOnlyIsSet(false);
    this.freeListOnly = false;
    setFreeSpaceIsSet(false);
    this.freeSpace = false;
    setMaxPagesIsSet(false);
    this.maxPages = 0;
    setTimeoutIsSet(false);
    this.timeout = 0;
  }

  public int getFillPercent() {
    return this.fillPercent;
  }

  public TCompactConfig setFillPercent(int fillPercent) {
    this.fillPercent = fillPercent;
    setFillPercentIsSet(true);
    return this;
  }

  public void unsetFillPercent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FILLPERCENT_ISSET_ID);
  }

  /** Returns true if field fillPercent is set (has been assigned a value) and false otherwise */
  public boolean isSetFillPercent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FILLPERCENT_ISSET_ID);
  }

  public void setFillPercentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FILLPERCENT_ISSET_ID, value);
  }

  public boolean isFreeListOnly() {
    return this.freeListOnly;
  }

  public TCompactConfig setFreeListOnly(boolean freeListOnly) {
    this.freeListOnly = freeListOnly;
    setFreeListOnlyIsSet(true);
    return this;
  }

  public void unsetFreeListOnly() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FREELISTONLY_ISSET_ID);
  }

  /** Returns true if field freeListOnly is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeListOnly() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FREELISTONLY_ISSET_ID);
  }

  public void setFreeListOnlyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FREELISTONLY_ISSET_ID, value);
  }

  public boolean isFreeSpace() {
    return this.freeSpace;
  }

  public TCompactConfig setFreeSpace(boolean freeSpace) {
    this.freeSpace = freeSpace;
    setFreeSpaceIsSet(true);
    return this;
  }

  public void unsetFreeSpace() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FREESPACE_ISSET_ID);
  }

  /** Returns true if field freeSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeSpace() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FREESPACE_ISSET_ID);
  }

  public void setFreeSpaceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FREESPACE_ISSET_ID, value);
  }

  public int getMaxPages() {
    return this.maxPages;
  }

  public TCompactConfig setMaxPages(int maxPages) {
    this.maxPages = maxPages;
    setMaxPagesIsSet(true);
    return this;
  }

  public void unsetMaxPages() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXPAGES_ISSET_ID);
  }

  /** Returns true if field maxPages is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxPages() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXPAGES_ISSET_ID);
  }

  public void setMaxPagesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXPAGES_ISSET_ID, value);
  }

  public int getTimeout() {
    return this.timeout;
  }

  public TCompactConfig setTimeout(int timeout) {
    this.timeout = timeout;
    setTimeoutIsSet(true);
    return this;
  }

  public void unsetTimeout() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  /** Returns true if field timeout is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  public void setTimeoutIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMEOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case FILL_PERCENT:
      if (value == null) {
        unsetFillPercent();
      } else {
        setFillPercent((java.lang.Integer)value);
      }
      break;

    case FREE_LIST_ONLY:
      if (value == null) {
        unsetFreeListOnly();
      } else {
        setFreeListOnly((java.lang.Boolean)value);
      }
      break;

    case FREE_SPACE:
      if (value == null) {
        unsetFreeSpace();
      } else {
        setFreeSpace((java.lang.Boolean)value);
      }
      break;

    case MAX_PAGES:
      if (value == null) {
        unsetMaxPages();
      } else {
        setMaxPages((java.lang.Integer)value);
      }
      break;

    case TIMEOUT:
      if (value == null) {
        unsetTimeout();
      } else {
        setTimeout((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FILL_PERCENT:
      return getFillPercent();

    case FREE_LIST_ONLY:
      return isFreeListOnly();

    case FREE_SPACE:
      return isFreeSpace();

    case MAX_PAGES:
      return getMaxPages();

    case TIMEOUT:
      return getTimeout();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FILL_PERCENT:
      return isSetFillPercent();
    case FREE_LIST_ONLY:
      return isSetFreeListOnly();
    case FREE_SPACE:
      return isSetFreeSpace();
    case MAX_PAGES:
      return isSetMaxPages();
    case TIMEOUT:
      return isSetTimeout();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCompactConfig)
      return this.equals((TCompactConfig)that);
    return false;
  }

  public boolean equals(TCompactConfig that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fillPercent = true && this.isSetFillPercent();
    boolean that_present_fillPercent = true && that.isSetFillPercent();
    if (this_present_fillPercent || that_present_fillPercent) {
      if (!(this_present_fillPercent && that_present_fillPercent))
        return false;
      if (this.fillPercent != that.fillPercent)
        return false;
    }

    boolean this_present_freeListOnly = true && this.isSetFreeListOnly();
    boolean that_present_freeListOnly = true && that.isSetFreeListOnly();
    if (this_present_freeListOnly || that_present_freeListOnly) {
      if (!(this_present_freeListOnly && that_present_freeListOnly))
        return false;
      if (this.freeListOnly != that.freeListOnly)
        return false;
    }

    boolean this_present_freeSpace = true && this.isSetFreeSpace();
    boolean that_present_freeSpace = true && that.isSetFreeSpace();
    if (this_present_freeSpace || that_present_freeSpace) {
      if (!(this_present_freeSpace && that_present_freeSpace))
        return false;
      if (this.freeSpace != that.freeSpace)
        return false;
    }

    boolean this_present_maxPages = true && this.isSetMaxPages();
    boolean that_present_maxPages = true && that.isSetMaxPages();
    if (this_present_maxPages || that_present_maxPages) {
      if (!(this_present_maxPages && that_present_maxPages))
        return false;
      if (this.maxPages != that.maxPages)
        return false;
    }

    boolean this_present_timeout = true && this.isSetTimeout();
    boolean that_present_timeout = true && that.isSetTimeout();
    if (this_present_timeout || that_present_timeout) {
      if (!(this_present_timeout && that_present_timeout))
        return false;
      if (this.timeout != that.timeout)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFillPercent()) ? 131071 : 524287);
    if (isSetFillPercent())
      hashCode = hashCode * 8191 + fillPercent;

    hashCode = hashCode * 8191 + ((isSetFreeListOnly()) ? 131071 : 524287);
    if (isSetFreeListOnly())
      hashCode = hashCode * 8191 + ((freeListOnly) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetFreeSpace()) ? 131071 : 524287);
    if (isSetFreeSpace())
      hashCode = hashCode * 8191 + ((freeSpace) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetMaxPages()) ? 131071 : 524287);
    if (isSetMaxPages())
      hashCode = hashCode * 8191 + maxPages;

    hashCode = hashCode * 8191 + ((isSetTimeout()) ? 131071 : 524287);
    if (isSetTimeout())
      hashCode = hashCode * 8191 + timeout;

    return hashCode;
  }

  @Override
  public int compareTo(TCompactConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFillPercent()).compareTo(other.isSetFillPercent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFillPercent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fillPercent, other.fillPercent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFreeListOnly()).compareTo(other.isSetFreeListOnly());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeListOnly()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeListOnly, other.freeListOnly);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFreeSpace()).compareTo(other.isSetFreeSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeSpace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeSpace, other.freeSpace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMaxPages()).compareTo(other.isSetMaxPages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxPages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxPages, other.maxPages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeout()).compareTo(other.isSetTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout, other.timeout);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCompactConfig(");
    boolean first = true;

    if (isSetFillPercent()) {
      sb.append("fillPercent:");
      sb.append(this.fillPercent);
      first = false;
    }
    if (isSetFreeListOnly()) {
      if (!first) sb.append(", ");
      sb.append("freeListOnly:");
      sb.append(this.freeListOnly);
      first = false;
    }
    if (isSetFreeSpace()) {
      if (!first) sb.append(", ");
      sb.append("freeSpace:");
      sb.append(this.freeSpace);
      first = false;
    }
    if (isSetMaxPages()) {
      if (!first) sb.append(", ");
      sb.append("maxPages:");
      sb.append(this.maxPages);
      first = false;
    }
    if (isSetTimeout()) {
      if (!first) sb.append(", ");
      sb.append("timeout:");
      sb.append(this.timeout);
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

  private static class TCompactConfigStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCompactConfigStandardScheme getScheme() {
      return new TCompactConfigStandardScheme();
    }
  }

  private static class TCompactConfigStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCompactConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCompactConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILL_PERCENT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fillPercent = iprot.readI32();
              struct.setFillPercentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FREE_LIST_ONLY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.freeListOnly = iprot.readBool();
              struct.setFreeListOnlyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FREE_SPACE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.freeSpace = iprot.readBool();
              struct.setFreeSpaceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_PAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxPages = iprot.readI32();
              struct.setMaxPagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMEOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeout = iprot.readI32();
              struct.setTimeoutIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCompactConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetFillPercent()) {
        oprot.writeFieldBegin(FILL_PERCENT_FIELD_DESC);
        oprot.writeI32(struct.fillPercent);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFreeListOnly()) {
        oprot.writeFieldBegin(FREE_LIST_ONLY_FIELD_DESC);
        oprot.writeBool(struct.freeListOnly);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFreeSpace()) {
        oprot.writeFieldBegin(FREE_SPACE_FIELD_DESC);
        oprot.writeBool(struct.freeSpace);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxPages()) {
        oprot.writeFieldBegin(MAX_PAGES_FIELD_DESC);
        oprot.writeI32(struct.maxPages);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimeout()) {
        oprot.writeFieldBegin(TIMEOUT_FIELD_DESC);
        oprot.writeI32(struct.timeout);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCompactConfigTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCompactConfigTupleScheme getScheme() {
      return new TCompactConfigTupleScheme();
    }
  }

  private static class TCompactConfigTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCompactConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCompactConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFillPercent()) {
        optionals.set(0);
      }
      if (struct.isSetFreeListOnly()) {
        optionals.set(1);
      }
      if (struct.isSetFreeSpace()) {
        optionals.set(2);
      }
      if (struct.isSetMaxPages()) {
        optionals.set(3);
      }
      if (struct.isSetTimeout()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetFillPercent()) {
        oprot.writeI32(struct.fillPercent);
      }
      if (struct.isSetFreeListOnly()) {
        oprot.writeBool(struct.freeListOnly);
      }
      if (struct.isSetFreeSpace()) {
        oprot.writeBool(struct.freeSpace);
      }
      if (struct.isSetMaxPages()) {
        oprot.writeI32(struct.maxPages);
      }
      if (struct.isSetTimeout()) {
        oprot.writeI32(struct.timeout);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCompactConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.fillPercent = iprot.readI32();
        struct.setFillPercentIsSet(true);
      }
      if (incoming.get(1)) {
        struct.freeListOnly = iprot.readBool();
        struct.setFreeListOnlyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.freeSpace = iprot.readBool();
        struct.setFreeSpaceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.maxPages = iprot.readI32();
        struct.setMaxPagesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.timeout = iprot.readI32();
        struct.setTimeoutIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


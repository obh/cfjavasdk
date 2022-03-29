// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.cashfree.pg.generated;

/**
 * Protobuf type {@code com.cashfree.pg.generated.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.cashfree.pg.generated.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    id_ = "";
    orderCurrency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            id_ = s;
            break;
          }
          case 17: {

            orderAmount_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            orderCurrency_ = s;
            break;
          }
          case 34: {
            com.cashfree.pg.generated.CustomerDetails.Builder subBuilder = null;
            if (customerDetails_ != null) {
              subBuilder = customerDetails_.toBuilder();
            }
            customerDetails_ = input.readMessage(com.cashfree.pg.generated.CustomerDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customerDetails_);
              customerDetails_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cashfree.pg.generated.OrderOuterClass.internal_static_com_cashfree_pg_generated_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cashfree.pg.generated.OrderOuterClass.internal_static_com_cashfree_pg_generated_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cashfree.pg.generated.Order.class, com.cashfree.pg.generated.Order.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>optional string id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>optional string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDER_AMOUNT_FIELD_NUMBER = 2;
  private double orderAmount_;
  /**
   * <code>double order_amount = 2;</code>
   * @return The orderAmount.
   */
  @java.lang.Override
  public double getOrderAmount() {
    return orderAmount_;
  }

  public static final int ORDER_CURRENCY_FIELD_NUMBER = 3;
  private volatile java.lang.Object orderCurrency_;
  /**
   * <code>optional string order_currency = 3;</code>
   * @return Whether the orderCurrency field is set.
   */
  @java.lang.Override
  public boolean hasOrderCurrency() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string order_currency = 3;</code>
   * @return The orderCurrency.
   */
  @java.lang.Override
  public java.lang.String getOrderCurrency() {
    java.lang.Object ref = orderCurrency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderCurrency_ = s;
      return s;
    }
  }
  /**
   * <code>optional string order_currency = 3;</code>
   * @return The bytes for orderCurrency.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderCurrencyBytes() {
    java.lang.Object ref = orderCurrency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderCurrency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_DETAILS_FIELD_NUMBER = 4;
  private com.cashfree.pg.generated.CustomerDetails customerDetails_;
  /**
   * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
   * @return Whether the customerDetails field is set.
   */
  @java.lang.Override
  public boolean hasCustomerDetails() {
    return customerDetails_ != null;
  }
  /**
   * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
   * @return The customerDetails.
   */
  @java.lang.Override
  public com.cashfree.pg.generated.CustomerDetails getCustomerDetails() {
    return customerDetails_ == null ? com.cashfree.pg.generated.CustomerDetails.getDefaultInstance() : customerDetails_;
  }
  /**
   * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
   */
  @java.lang.Override
  public com.cashfree.pg.generated.CustomerDetailsOrBuilder getCustomerDetailsOrBuilder() {
    return getCustomerDetails();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(orderAmount_) != 0) {
      output.writeDouble(2, orderAmount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orderCurrency_);
    }
    if (customerDetails_ != null) {
      output.writeMessage(4, getCustomerDetails());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(orderAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, orderAmount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orderCurrency_);
    }
    if (customerDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCustomerDetails());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cashfree.pg.generated.Order)) {
      return super.equals(obj);
    }
    com.cashfree.pg.generated.Order other = (com.cashfree.pg.generated.Order) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getOrderAmount())
        != java.lang.Double.doubleToLongBits(
            other.getOrderAmount())) return false;
    if (hasOrderCurrency() != other.hasOrderCurrency()) return false;
    if (hasOrderCurrency()) {
      if (!getOrderCurrency()
          .equals(other.getOrderCurrency())) return false;
    }
    if (hasCustomerDetails() != other.hasCustomerDetails()) return false;
    if (hasCustomerDetails()) {
      if (!getCustomerDetails()
          .equals(other.getCustomerDetails())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    hash = (37 * hash) + ORDER_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOrderAmount()));
    if (hasOrderCurrency()) {
      hash = (37 * hash) + ORDER_CURRENCY_FIELD_NUMBER;
      hash = (53 * hash) + getOrderCurrency().hashCode();
    }
    if (hasCustomerDetails()) {
      hash = (37 * hash) + CUSTOMER_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerDetails().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cashfree.pg.generated.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cashfree.pg.generated.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cashfree.pg.generated.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cashfree.pg.generated.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cashfree.pg.generated.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cashfree.pg.generated.Order parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cashfree.pg.generated.Order prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.cashfree.pg.generated.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.cashfree.pg.generated.Order)
      com.cashfree.pg.generated.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cashfree.pg.generated.OrderOuterClass.internal_static_com_cashfree_pg_generated_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cashfree.pg.generated.OrderOuterClass.internal_static_com_cashfree_pg_generated_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cashfree.pg.generated.Order.class, com.cashfree.pg.generated.Order.Builder.class);
    }

    // Construct using com.cashfree.pg.generated.Order.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      orderAmount_ = 0D;

      orderCurrency_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (customerDetailsBuilder_ == null) {
        customerDetails_ = null;
      } else {
        customerDetails_ = null;
        customerDetailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cashfree.pg.generated.OrderOuterClass.internal_static_com_cashfree_pg_generated_Order_descriptor;
    }

    @java.lang.Override
    public com.cashfree.pg.generated.Order getDefaultInstanceForType() {
      return com.cashfree.pg.generated.Order.getDefaultInstance();
    }

    @java.lang.Override
    public com.cashfree.pg.generated.Order build() {
      com.cashfree.pg.generated.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cashfree.pg.generated.Order buildPartial() {
      com.cashfree.pg.generated.Order result = new com.cashfree.pg.generated.Order(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.id_ = id_;
      result.orderAmount_ = orderAmount_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.orderCurrency_ = orderCurrency_;
      if (customerDetailsBuilder_ == null) {
        result.customerDetails_ = customerDetails_;
      } else {
        result.customerDetails_ = customerDetailsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cashfree.pg.generated.Order) {
        return mergeFrom((com.cashfree.pg.generated.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cashfree.pg.generated.Order other) {
      if (other == com.cashfree.pg.generated.Order.getDefaultInstance()) return this;
      if (other.hasId()) {
        bitField0_ |= 0x00000001;
        id_ = other.id_;
        onChanged();
      }
      if (other.getOrderAmount() != 0D) {
        setOrderAmount(other.getOrderAmount());
      }
      if (other.hasOrderCurrency()) {
        bitField0_ |= 0x00000002;
        orderCurrency_ = other.orderCurrency_;
        onChanged();
      }
      if (other.hasCustomerDetails()) {
        mergeCustomerDetails(other.getCustomerDetails());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cashfree.pg.generated.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cashfree.pg.generated.Order) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>optional string id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }

    private double orderAmount_ ;
    /**
     * <code>double order_amount = 2;</code>
     * @return The orderAmount.
     */
    @java.lang.Override
    public double getOrderAmount() {
      return orderAmount_;
    }
    /**
     * <code>double order_amount = 2;</code>
     * @param value The orderAmount to set.
     * @return This builder for chaining.
     */
    public Builder setOrderAmount(double value) {
      
      orderAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double order_amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderAmount() {
      
      orderAmount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object orderCurrency_ = "";
    /**
     * <code>optional string order_currency = 3;</code>
     * @return Whether the orderCurrency field is set.
     */
    public boolean hasOrderCurrency() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string order_currency = 3;</code>
     * @return The orderCurrency.
     */
    public java.lang.String getOrderCurrency() {
      java.lang.Object ref = orderCurrency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderCurrency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string order_currency = 3;</code>
     * @return The bytes for orderCurrency.
     */
    public com.google.protobuf.ByteString
        getOrderCurrencyBytes() {
      java.lang.Object ref = orderCurrency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderCurrency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string order_currency = 3;</code>
     * @param value The orderCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setOrderCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      orderCurrency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string order_currency = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderCurrency() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orderCurrency_ = getDefaultInstance().getOrderCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>optional string order_currency = 3;</code>
     * @param value The bytes for orderCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setOrderCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      orderCurrency_ = value;
      onChanged();
      return this;
    }

    private com.cashfree.pg.generated.CustomerDetails customerDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cashfree.pg.generated.CustomerDetails, com.cashfree.pg.generated.CustomerDetails.Builder, com.cashfree.pg.generated.CustomerDetailsOrBuilder> customerDetailsBuilder_;
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     * @return Whether the customerDetails field is set.
     */
    public boolean hasCustomerDetails() {
      return customerDetailsBuilder_ != null || customerDetails_ != null;
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     * @return The customerDetails.
     */
    public com.cashfree.pg.generated.CustomerDetails getCustomerDetails() {
      if (customerDetailsBuilder_ == null) {
        return customerDetails_ == null ? com.cashfree.pg.generated.CustomerDetails.getDefaultInstance() : customerDetails_;
      } else {
        return customerDetailsBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public Builder setCustomerDetails(com.cashfree.pg.generated.CustomerDetails value) {
      if (customerDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customerDetails_ = value;
        onChanged();
      } else {
        customerDetailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public Builder setCustomerDetails(
        com.cashfree.pg.generated.CustomerDetails.Builder builderForValue) {
      if (customerDetailsBuilder_ == null) {
        customerDetails_ = builderForValue.build();
        onChanged();
      } else {
        customerDetailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public Builder mergeCustomerDetails(com.cashfree.pg.generated.CustomerDetails value) {
      if (customerDetailsBuilder_ == null) {
        if (customerDetails_ != null) {
          customerDetails_ =
            com.cashfree.pg.generated.CustomerDetails.newBuilder(customerDetails_).mergeFrom(value).buildPartial();
        } else {
          customerDetails_ = value;
        }
        onChanged();
      } else {
        customerDetailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public Builder clearCustomerDetails() {
      if (customerDetailsBuilder_ == null) {
        customerDetails_ = null;
        onChanged();
      } else {
        customerDetails_ = null;
        customerDetailsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public com.cashfree.pg.generated.CustomerDetails.Builder getCustomerDetailsBuilder() {
      
      onChanged();
      return getCustomerDetailsFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    public com.cashfree.pg.generated.CustomerDetailsOrBuilder getCustomerDetailsOrBuilder() {
      if (customerDetailsBuilder_ != null) {
        return customerDetailsBuilder_.getMessageOrBuilder();
      } else {
        return customerDetails_ == null ?
            com.cashfree.pg.generated.CustomerDetails.getDefaultInstance() : customerDetails_;
      }
    }
    /**
     * <code>.com.cashfree.pg.generated.CustomerDetails customer_details = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cashfree.pg.generated.CustomerDetails, com.cashfree.pg.generated.CustomerDetails.Builder, com.cashfree.pg.generated.CustomerDetailsOrBuilder> 
        getCustomerDetailsFieldBuilder() {
      if (customerDetailsBuilder_ == null) {
        customerDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cashfree.pg.generated.CustomerDetails, com.cashfree.pg.generated.CustomerDetails.Builder, com.cashfree.pg.generated.CustomerDetailsOrBuilder>(
                getCustomerDetails(),
                getParentForChildren(),
                isClean());
        customerDetails_ = null;
      }
      return customerDetailsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.cashfree.pg.generated.Order)
  }

  // @@protoc_insertion_point(class_scope:com.cashfree.pg.generated.Order)
  private static final com.cashfree.pg.generated.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cashfree.pg.generated.Order();
  }

  public static com.cashfree.pg.generated.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cashfree.pg.generated.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


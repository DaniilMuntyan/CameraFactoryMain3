// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.example.demo.entities/cameraParts.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.CameraLensGrpc}
 */
public  final class CameraLensGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.CameraLensGrpc)
    CameraLensGrpcOrBuilder {
  // Use CameraLensGrpc.newBuilder() to construct.
  private CameraLensGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CameraLensGrpc() {
    focalLength_ = 0;
    lensType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CameraLensGrpc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            kpi.trspo.restapp.MyUuid.Builder subBuilder = null;
            if (lensId_ != null) {
              subBuilder = lensId_.toBuilder();
            }
            lensId_ = input.readMessage(kpi.trspo.restapp.MyUuid.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lensId_);
              lensId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            focalLength_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            lensType_ = rawValue;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraLensGrpc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraLensGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.CameraLensGrpc.class, kpi.trspo.restapp.CameraLensGrpc.Builder.class);
  }

  public static final int LENSID_FIELD_NUMBER = 1;
  private kpi.trspo.restapp.MyUuid lensId_;
  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  public boolean hasLensId() {
    return lensId_ != null;
  }
  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  public kpi.trspo.restapp.MyUuid getLensId() {
    return lensId_ == null ? kpi.trspo.restapp.MyUuid.getDefaultInstance() : lensId_;
  }
  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  public kpi.trspo.restapp.MyUuidOrBuilder getLensIdOrBuilder() {
    return getLensId();
  }

  public static final int FOCALLENGTH_FIELD_NUMBER = 2;
  private int focalLength_;
  /**
   * <code>int32 focalLength = 2;</code>
   */
  public int getFocalLength() {
    return focalLength_;
  }

  public static final int LENSTYPE_FIELD_NUMBER = 3;
  private int lensType_;
  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  public int getLensTypeValue() {
    return lensType_;
  }
  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  public kpi.trspo.restapp.LensType getLensType() {
    kpi.trspo.restapp.LensType result = kpi.trspo.restapp.LensType.valueOf(lensType_);
    return result == null ? kpi.trspo.restapp.LensType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (lensId_ != null) {
      output.writeMessage(1, getLensId());
    }
    if (focalLength_ != 0) {
      output.writeInt32(2, focalLength_);
    }
    if (lensType_ != kpi.trspo.restapp.LensType.WIDE_ANGLE.getNumber()) {
      output.writeEnum(3, lensType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lensId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLensId());
    }
    if (focalLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, focalLength_);
    }
    if (lensType_ != kpi.trspo.restapp.LensType.WIDE_ANGLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, lensType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kpi.trspo.restapp.CameraLensGrpc)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.CameraLensGrpc other = (kpi.trspo.restapp.CameraLensGrpc) obj;

    boolean result = true;
    result = result && (hasLensId() == other.hasLensId());
    if (hasLensId()) {
      result = result && getLensId()
          .equals(other.getLensId());
    }
    result = result && (getFocalLength()
        == other.getFocalLength());
    result = result && lensType_ == other.lensType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLensId()) {
      hash = (37 * hash) + LENSID_FIELD_NUMBER;
      hash = (53 * hash) + getLensId().hashCode();
    }
    hash = (37 * hash) + FOCALLENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getFocalLength();
    hash = (37 * hash) + LENSTYPE_FIELD_NUMBER;
    hash = (53 * hash) + lensType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraLensGrpc parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kpi.trspo.restapp.CameraLensGrpc prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code kpi.trspo.restapp.CameraLensGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.CameraLensGrpc)
      kpi.trspo.restapp.CameraLensGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraLensGrpc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraLensGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.CameraLensGrpc.class, kpi.trspo.restapp.CameraLensGrpc.Builder.class);
    }

    // Construct using kpi.trspo.restapp.CameraLensGrpc.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (lensIdBuilder_ == null) {
        lensId_ = null;
      } else {
        lensId_ = null;
        lensIdBuilder_ = null;
      }
      focalLength_ = 0;

      lensType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraLensGrpc_descriptor;
    }

    public kpi.trspo.restapp.CameraLensGrpc getDefaultInstanceForType() {
      return kpi.trspo.restapp.CameraLensGrpc.getDefaultInstance();
    }

    public kpi.trspo.restapp.CameraLensGrpc build() {
      kpi.trspo.restapp.CameraLensGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.CameraLensGrpc buildPartial() {
      kpi.trspo.restapp.CameraLensGrpc result = new kpi.trspo.restapp.CameraLensGrpc(this);
      if (lensIdBuilder_ == null) {
        result.lensId_ = lensId_;
      } else {
        result.lensId_ = lensIdBuilder_.build();
      }
      result.focalLength_ = focalLength_;
      result.lensType_ = lensType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kpi.trspo.restapp.CameraLensGrpc) {
        return mergeFrom((kpi.trspo.restapp.CameraLensGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.CameraLensGrpc other) {
      if (other == kpi.trspo.restapp.CameraLensGrpc.getDefaultInstance()) return this;
      if (other.hasLensId()) {
        mergeLensId(other.getLensId());
      }
      if (other.getFocalLength() != 0) {
        setFocalLength(other.getFocalLength());
      }
      if (other.lensType_ != 0) {
        setLensTypeValue(other.getLensTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kpi.trspo.restapp.CameraLensGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.CameraLensGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kpi.trspo.restapp.MyUuid lensId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder> lensIdBuilder_;
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public boolean hasLensId() {
      return lensIdBuilder_ != null || lensId_ != null;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuid getLensId() {
      if (lensIdBuilder_ == null) {
        return lensId_ == null ? kpi.trspo.restapp.MyUuid.getDefaultInstance() : lensId_;
      } else {
        return lensIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public Builder setLensId(kpi.trspo.restapp.MyUuid value) {
      if (lensIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lensId_ = value;
        onChanged();
      } else {
        lensIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public Builder setLensId(
        kpi.trspo.restapp.MyUuid.Builder builderForValue) {
      if (lensIdBuilder_ == null) {
        lensId_ = builderForValue.build();
        onChanged();
      } else {
        lensIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public Builder mergeLensId(kpi.trspo.restapp.MyUuid value) {
      if (lensIdBuilder_ == null) {
        if (lensId_ != null) {
          lensId_ =
            kpi.trspo.restapp.MyUuid.newBuilder(lensId_).mergeFrom(value).buildPartial();
        } else {
          lensId_ = value;
        }
        onChanged();
      } else {
        lensIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public Builder clearLensId() {
      if (lensIdBuilder_ == null) {
        lensId_ = null;
        onChanged();
      } else {
        lensId_ = null;
        lensIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuid.Builder getLensIdBuilder() {
      
      onChanged();
      return getLensIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuidOrBuilder getLensIdOrBuilder() {
      if (lensIdBuilder_ != null) {
        return lensIdBuilder_.getMessageOrBuilder();
      } else {
        return lensId_ == null ?
            kpi.trspo.restapp.MyUuid.getDefaultInstance() : lensId_;
      }
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder> 
        getLensIdFieldBuilder() {
      if (lensIdBuilder_ == null) {
        lensIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder>(
                getLensId(),
                getParentForChildren(),
                isClean());
        lensId_ = null;
      }
      return lensIdBuilder_;
    }

    private int focalLength_ ;
    /**
     * <code>int32 focalLength = 2;</code>
     */
    public int getFocalLength() {
      return focalLength_;
    }
    /**
     * <code>int32 focalLength = 2;</code>
     */
    public Builder setFocalLength(int value) {
      
      focalLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 focalLength = 2;</code>
     */
    public Builder clearFocalLength() {
      
      focalLength_ = 0;
      onChanged();
      return this;
    }

    private int lensType_ = 0;
    /**
     * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
     */
    public int getLensTypeValue() {
      return lensType_;
    }
    /**
     * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
     */
    public Builder setLensTypeValue(int value) {
      lensType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
     */
    public kpi.trspo.restapp.LensType getLensType() {
      kpi.trspo.restapp.LensType result = kpi.trspo.restapp.LensType.valueOf(lensType_);
      return result == null ? kpi.trspo.restapp.LensType.UNRECOGNIZED : result;
    }
    /**
     * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
     */
    public Builder setLensType(kpi.trspo.restapp.LensType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lensType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
     */
    public Builder clearLensType() {
      
      lensType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.CameraLensGrpc)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.CameraLensGrpc)
  private static final kpi.trspo.restapp.CameraLensGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.CameraLensGrpc();
  }

  public static kpi.trspo.restapp.CameraLensGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CameraLensGrpc>
      PARSER = new com.google.protobuf.AbstractParser<CameraLensGrpc>() {
    public CameraLensGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CameraLensGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CameraLensGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CameraLensGrpc> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.CameraLensGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


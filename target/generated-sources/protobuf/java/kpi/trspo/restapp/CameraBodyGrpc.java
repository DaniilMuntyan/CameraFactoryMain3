// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.example.demo.entities/cameraParts.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.CameraBodyGrpc}
 */
public  final class CameraBodyGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.CameraBodyGrpc)
    CameraBodyGrpcOrBuilder {
  // Use CameraBodyGrpc.newBuilder() to construct.
  private CameraBodyGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CameraBodyGrpc() {
    color_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CameraBodyGrpc(
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
            if (bodyId_ != null) {
              subBuilder = bodyId_.toBuilder();
            }
            bodyId_ = input.readMessage(kpi.trspo.restapp.MyUuid.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bodyId_);
              bodyId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            kpi.trspo.restapp.Dimensions.Builder subBuilder = null;
            if (dimensions_ != null) {
              subBuilder = dimensions_.toBuilder();
            }
            dimensions_ = input.readMessage(kpi.trspo.restapp.Dimensions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dimensions_);
              dimensions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            color_ = s;
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
    return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraBodyGrpc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraBodyGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.CameraBodyGrpc.class, kpi.trspo.restapp.CameraBodyGrpc.Builder.class);
  }

  public static final int BODYID_FIELD_NUMBER = 1;
  private kpi.trspo.restapp.MyUuid bodyId_;
  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  public boolean hasBodyId() {
    return bodyId_ != null;
  }
  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  public kpi.trspo.restapp.MyUuid getBodyId() {
    return bodyId_ == null ? kpi.trspo.restapp.MyUuid.getDefaultInstance() : bodyId_;
  }
  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  public kpi.trspo.restapp.MyUuidOrBuilder getBodyIdOrBuilder() {
    return getBodyId();
  }

  public static final int DIMENSIONS_FIELD_NUMBER = 2;
  private kpi.trspo.restapp.Dimensions dimensions_;
  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  public boolean hasDimensions() {
    return dimensions_ != null;
  }
  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  public kpi.trspo.restapp.Dimensions getDimensions() {
    return dimensions_ == null ? kpi.trspo.restapp.Dimensions.getDefaultInstance() : dimensions_;
  }
  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  public kpi.trspo.restapp.DimensionsOrBuilder getDimensionsOrBuilder() {
    return getDimensions();
  }

  public static final int COLOR_FIELD_NUMBER = 3;
  private volatile java.lang.Object color_;
  /**
   * <code>string color = 3;</code>
   */
  public java.lang.String getColor() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      color_ = s;
      return s;
    }
  }
  /**
   * <code>string color = 3;</code>
   */
  public com.google.protobuf.ByteString
      getColorBytes() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      color_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (bodyId_ != null) {
      output.writeMessage(1, getBodyId());
    }
    if (dimensions_ != null) {
      output.writeMessage(2, getDimensions());
    }
    if (!getColorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, color_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bodyId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBodyId());
    }
    if (dimensions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDimensions());
    }
    if (!getColorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, color_);
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
    if (!(obj instanceof kpi.trspo.restapp.CameraBodyGrpc)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.CameraBodyGrpc other = (kpi.trspo.restapp.CameraBodyGrpc) obj;

    boolean result = true;
    result = result && (hasBodyId() == other.hasBodyId());
    if (hasBodyId()) {
      result = result && getBodyId()
          .equals(other.getBodyId());
    }
    result = result && (hasDimensions() == other.hasDimensions());
    if (hasDimensions()) {
      result = result && getDimensions()
          .equals(other.getDimensions());
    }
    result = result && getColor()
        .equals(other.getColor());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBodyId()) {
      hash = (37 * hash) + BODYID_FIELD_NUMBER;
      hash = (53 * hash) + getBodyId().hashCode();
    }
    if (hasDimensions()) {
      hash = (37 * hash) + DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDimensions().hashCode();
    }
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.CameraBodyGrpc parseFrom(
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
  public static Builder newBuilder(kpi.trspo.restapp.CameraBodyGrpc prototype) {
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
   * Protobuf type {@code kpi.trspo.restapp.CameraBodyGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.CameraBodyGrpc)
      kpi.trspo.restapp.CameraBodyGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraBodyGrpc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraBodyGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.CameraBodyGrpc.class, kpi.trspo.restapp.CameraBodyGrpc.Builder.class);
    }

    // Construct using kpi.trspo.restapp.CameraBodyGrpc.newBuilder()
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
      if (bodyIdBuilder_ == null) {
        bodyId_ = null;
      } else {
        bodyId_ = null;
        bodyIdBuilder_ = null;
      }
      if (dimensionsBuilder_ == null) {
        dimensions_ = null;
      } else {
        dimensions_ = null;
        dimensionsBuilder_ = null;
      }
      color_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.CameraParts.internal_static_kpi_trspo_restapp_CameraBodyGrpc_descriptor;
    }

    public kpi.trspo.restapp.CameraBodyGrpc getDefaultInstanceForType() {
      return kpi.trspo.restapp.CameraBodyGrpc.getDefaultInstance();
    }

    public kpi.trspo.restapp.CameraBodyGrpc build() {
      kpi.trspo.restapp.CameraBodyGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.CameraBodyGrpc buildPartial() {
      kpi.trspo.restapp.CameraBodyGrpc result = new kpi.trspo.restapp.CameraBodyGrpc(this);
      if (bodyIdBuilder_ == null) {
        result.bodyId_ = bodyId_;
      } else {
        result.bodyId_ = bodyIdBuilder_.build();
      }
      if (dimensionsBuilder_ == null) {
        result.dimensions_ = dimensions_;
      } else {
        result.dimensions_ = dimensionsBuilder_.build();
      }
      result.color_ = color_;
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
      if (other instanceof kpi.trspo.restapp.CameraBodyGrpc) {
        return mergeFrom((kpi.trspo.restapp.CameraBodyGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.CameraBodyGrpc other) {
      if (other == kpi.trspo.restapp.CameraBodyGrpc.getDefaultInstance()) return this;
      if (other.hasBodyId()) {
        mergeBodyId(other.getBodyId());
      }
      if (other.hasDimensions()) {
        mergeDimensions(other.getDimensions());
      }
      if (!other.getColor().isEmpty()) {
        color_ = other.color_;
        onChanged();
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
      kpi.trspo.restapp.CameraBodyGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.CameraBodyGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kpi.trspo.restapp.MyUuid bodyId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder> bodyIdBuilder_;
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public boolean hasBodyId() {
      return bodyIdBuilder_ != null || bodyId_ != null;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuid getBodyId() {
      if (bodyIdBuilder_ == null) {
        return bodyId_ == null ? kpi.trspo.restapp.MyUuid.getDefaultInstance() : bodyId_;
      } else {
        return bodyIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public Builder setBodyId(kpi.trspo.restapp.MyUuid value) {
      if (bodyIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bodyId_ = value;
        onChanged();
      } else {
        bodyIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public Builder setBodyId(
        kpi.trspo.restapp.MyUuid.Builder builderForValue) {
      if (bodyIdBuilder_ == null) {
        bodyId_ = builderForValue.build();
        onChanged();
      } else {
        bodyIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public Builder mergeBodyId(kpi.trspo.restapp.MyUuid value) {
      if (bodyIdBuilder_ == null) {
        if (bodyId_ != null) {
          bodyId_ =
            kpi.trspo.restapp.MyUuid.newBuilder(bodyId_).mergeFrom(value).buildPartial();
        } else {
          bodyId_ = value;
        }
        onChanged();
      } else {
        bodyIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public Builder clearBodyId() {
      if (bodyIdBuilder_ == null) {
        bodyId_ = null;
        onChanged();
      } else {
        bodyId_ = null;
        bodyIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuid.Builder getBodyIdBuilder() {
      
      onChanged();
      return getBodyIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    public kpi.trspo.restapp.MyUuidOrBuilder getBodyIdOrBuilder() {
      if (bodyIdBuilder_ != null) {
        return bodyIdBuilder_.getMessageOrBuilder();
      } else {
        return bodyId_ == null ?
            kpi.trspo.restapp.MyUuid.getDefaultInstance() : bodyId_;
      }
    }
    /**
     * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder> 
        getBodyIdFieldBuilder() {
      if (bodyIdBuilder_ == null) {
        bodyIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kpi.trspo.restapp.MyUuid, kpi.trspo.restapp.MyUuid.Builder, kpi.trspo.restapp.MyUuidOrBuilder>(
                getBodyId(),
                getParentForChildren(),
                isClean());
        bodyId_ = null;
      }
      return bodyIdBuilder_;
    }

    private kpi.trspo.restapp.Dimensions dimensions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.Dimensions, kpi.trspo.restapp.Dimensions.Builder, kpi.trspo.restapp.DimensionsOrBuilder> dimensionsBuilder_;
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public boolean hasDimensions() {
      return dimensionsBuilder_ != null || dimensions_ != null;
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public kpi.trspo.restapp.Dimensions getDimensions() {
      if (dimensionsBuilder_ == null) {
        return dimensions_ == null ? kpi.trspo.restapp.Dimensions.getDefaultInstance() : dimensions_;
      } else {
        return dimensionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public Builder setDimensions(kpi.trspo.restapp.Dimensions value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dimensions_ = value;
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public Builder setDimensions(
        kpi.trspo.restapp.Dimensions.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        dimensions_ = builderForValue.build();
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public Builder mergeDimensions(kpi.trspo.restapp.Dimensions value) {
      if (dimensionsBuilder_ == null) {
        if (dimensions_ != null) {
          dimensions_ =
            kpi.trspo.restapp.Dimensions.newBuilder(dimensions_).mergeFrom(value).buildPartial();
        } else {
          dimensions_ = value;
        }
        onChanged();
      } else {
        dimensionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public Builder clearDimensions() {
      if (dimensionsBuilder_ == null) {
        dimensions_ = null;
        onChanged();
      } else {
        dimensions_ = null;
        dimensionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public kpi.trspo.restapp.Dimensions.Builder getDimensionsBuilder() {
      
      onChanged();
      return getDimensionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    public kpi.trspo.restapp.DimensionsOrBuilder getDimensionsOrBuilder() {
      if (dimensionsBuilder_ != null) {
        return dimensionsBuilder_.getMessageOrBuilder();
      } else {
        return dimensions_ == null ?
            kpi.trspo.restapp.Dimensions.getDefaultInstance() : dimensions_;
      }
    }
    /**
     * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.Dimensions, kpi.trspo.restapp.Dimensions.Builder, kpi.trspo.restapp.DimensionsOrBuilder> 
        getDimensionsFieldBuilder() {
      if (dimensionsBuilder_ == null) {
        dimensionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kpi.trspo.restapp.Dimensions, kpi.trspo.restapp.Dimensions.Builder, kpi.trspo.restapp.DimensionsOrBuilder>(
                getDimensions(),
                getParentForChildren(),
                isClean());
        dimensions_ = null;
      }
      return dimensionsBuilder_;
    }

    private java.lang.Object color_ = "";
    /**
     * <code>string color = 3;</code>
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string color = 3;</code>
     */
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string color = 3;</code>
     */
    public Builder setColor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string color = 3;</code>
     */
    public Builder clearColor() {
      
      color_ = getDefaultInstance().getColor();
      onChanged();
      return this;
    }
    /**
     * <code>string color = 3;</code>
     */
    public Builder setColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      color_ = value;
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


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.CameraBodyGrpc)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.CameraBodyGrpc)
  private static final kpi.trspo.restapp.CameraBodyGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.CameraBodyGrpc();
  }

  public static kpi.trspo.restapp.CameraBodyGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CameraBodyGrpc>
      PARSER = new com.google.protobuf.AbstractParser<CameraBodyGrpc>() {
    public CameraBodyGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CameraBodyGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CameraBodyGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CameraBodyGrpc> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.CameraBodyGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


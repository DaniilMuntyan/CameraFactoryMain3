// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/assembleBody.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.AssembleBodyResponse}
 */
public  final class AssembleBodyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.AssembleBodyResponse)
    AssembleBodyResponseOrBuilder {
  // Use AssembleBodyResponse.newBuilder() to construct.
  private AssembleBodyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssembleBodyResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AssembleBodyResponse(
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
            kpi.trspo.restapp.CameraBodyGrpc.Builder subBuilder = null;
            if (cameraBody_ != null) {
              subBuilder = cameraBody_.toBuilder();
            }
            cameraBody_ = input.readMessage(kpi.trspo.restapp.CameraBodyGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cameraBody_);
              cameraBody_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kpi.trspo.restapp.AssembleBody.internal_static_kpi_trspo_restapp_AssembleBodyResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.AssembleBody.internal_static_kpi_trspo_restapp_AssembleBodyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.AssembleBodyResponse.class, kpi.trspo.restapp.AssembleBodyResponse.Builder.class);
  }

  public static final int CAMERABODY_FIELD_NUMBER = 1;
  private kpi.trspo.restapp.CameraBodyGrpc cameraBody_;
  /**
   * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
   */
  public boolean hasCameraBody() {
    return cameraBody_ != null;
  }
  /**
   * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
   */
  public kpi.trspo.restapp.CameraBodyGrpc getCameraBody() {
    return cameraBody_ == null ? kpi.trspo.restapp.CameraBodyGrpc.getDefaultInstance() : cameraBody_;
  }
  /**
   * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
   */
  public kpi.trspo.restapp.CameraBodyGrpcOrBuilder getCameraBodyOrBuilder() {
    return getCameraBody();
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
    if (cameraBody_ != null) {
      output.writeMessage(1, getCameraBody());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cameraBody_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCameraBody());
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
    if (!(obj instanceof kpi.trspo.restapp.AssembleBodyResponse)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.AssembleBodyResponse other = (kpi.trspo.restapp.AssembleBodyResponse) obj;

    boolean result = true;
    result = result && (hasCameraBody() == other.hasCameraBody());
    if (hasCameraBody()) {
      result = result && getCameraBody()
          .equals(other.getCameraBody());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCameraBody()) {
      hash = (37 * hash) + CAMERABODY_FIELD_NUMBER;
      hash = (53 * hash) + getCameraBody().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBodyResponse parseFrom(
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
  public static Builder newBuilder(kpi.trspo.restapp.AssembleBodyResponse prototype) {
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
   * Protobuf type {@code kpi.trspo.restapp.AssembleBodyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.AssembleBodyResponse)
      kpi.trspo.restapp.AssembleBodyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.AssembleBody.internal_static_kpi_trspo_restapp_AssembleBodyResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.AssembleBody.internal_static_kpi_trspo_restapp_AssembleBodyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.AssembleBodyResponse.class, kpi.trspo.restapp.AssembleBodyResponse.Builder.class);
    }

    // Construct using kpi.trspo.restapp.AssembleBodyResponse.newBuilder()
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
      if (cameraBodyBuilder_ == null) {
        cameraBody_ = null;
      } else {
        cameraBody_ = null;
        cameraBodyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.AssembleBody.internal_static_kpi_trspo_restapp_AssembleBodyResponse_descriptor;
    }

    public kpi.trspo.restapp.AssembleBodyResponse getDefaultInstanceForType() {
      return kpi.trspo.restapp.AssembleBodyResponse.getDefaultInstance();
    }

    public kpi.trspo.restapp.AssembleBodyResponse build() {
      kpi.trspo.restapp.AssembleBodyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.AssembleBodyResponse buildPartial() {
      kpi.trspo.restapp.AssembleBodyResponse result = new kpi.trspo.restapp.AssembleBodyResponse(this);
      if (cameraBodyBuilder_ == null) {
        result.cameraBody_ = cameraBody_;
      } else {
        result.cameraBody_ = cameraBodyBuilder_.build();
      }
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
      if (other instanceof kpi.trspo.restapp.AssembleBodyResponse) {
        return mergeFrom((kpi.trspo.restapp.AssembleBodyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.AssembleBodyResponse other) {
      if (other == kpi.trspo.restapp.AssembleBodyResponse.getDefaultInstance()) return this;
      if (other.hasCameraBody()) {
        mergeCameraBody(other.getCameraBody());
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
      kpi.trspo.restapp.AssembleBodyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.AssembleBodyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kpi.trspo.restapp.CameraBodyGrpc cameraBody_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.CameraBodyGrpc, kpi.trspo.restapp.CameraBodyGrpc.Builder, kpi.trspo.restapp.CameraBodyGrpcOrBuilder> cameraBodyBuilder_;
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public boolean hasCameraBody() {
      return cameraBodyBuilder_ != null || cameraBody_ != null;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public kpi.trspo.restapp.CameraBodyGrpc getCameraBody() {
      if (cameraBodyBuilder_ == null) {
        return cameraBody_ == null ? kpi.trspo.restapp.CameraBodyGrpc.getDefaultInstance() : cameraBody_;
      } else {
        return cameraBodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public Builder setCameraBody(kpi.trspo.restapp.CameraBodyGrpc value) {
      if (cameraBodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cameraBody_ = value;
        onChanged();
      } else {
        cameraBodyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public Builder setCameraBody(
        kpi.trspo.restapp.CameraBodyGrpc.Builder builderForValue) {
      if (cameraBodyBuilder_ == null) {
        cameraBody_ = builderForValue.build();
        onChanged();
      } else {
        cameraBodyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public Builder mergeCameraBody(kpi.trspo.restapp.CameraBodyGrpc value) {
      if (cameraBodyBuilder_ == null) {
        if (cameraBody_ != null) {
          cameraBody_ =
            kpi.trspo.restapp.CameraBodyGrpc.newBuilder(cameraBody_).mergeFrom(value).buildPartial();
        } else {
          cameraBody_ = value;
        }
        onChanged();
      } else {
        cameraBodyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public Builder clearCameraBody() {
      if (cameraBodyBuilder_ == null) {
        cameraBody_ = null;
        onChanged();
      } else {
        cameraBody_ = null;
        cameraBodyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public kpi.trspo.restapp.CameraBodyGrpc.Builder getCameraBodyBuilder() {
      
      onChanged();
      return getCameraBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    public kpi.trspo.restapp.CameraBodyGrpcOrBuilder getCameraBodyOrBuilder() {
      if (cameraBodyBuilder_ != null) {
        return cameraBodyBuilder_.getMessageOrBuilder();
      } else {
        return cameraBody_ == null ?
            kpi.trspo.restapp.CameraBodyGrpc.getDefaultInstance() : cameraBody_;
      }
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBodyGrpc cameraBody = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.CameraBodyGrpc, kpi.trspo.restapp.CameraBodyGrpc.Builder, kpi.trspo.restapp.CameraBodyGrpcOrBuilder> 
        getCameraBodyFieldBuilder() {
      if (cameraBodyBuilder_ == null) {
        cameraBodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kpi.trspo.restapp.CameraBodyGrpc, kpi.trspo.restapp.CameraBodyGrpc.Builder, kpi.trspo.restapp.CameraBodyGrpcOrBuilder>(
                getCameraBody(),
                getParentForChildren(),
                isClean());
        cameraBody_ = null;
      }
      return cameraBodyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.AssembleBodyResponse)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.AssembleBodyResponse)
  private static final kpi.trspo.restapp.AssembleBodyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.AssembleBodyResponse();
  }

  public static kpi.trspo.restapp.AssembleBodyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssembleBodyResponse>
      PARSER = new com.google.protobuf.AbstractParser<AssembleBodyResponse>() {
    public AssembleBodyResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssembleBodyResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssembleBodyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssembleBodyResponse> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.AssembleBodyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

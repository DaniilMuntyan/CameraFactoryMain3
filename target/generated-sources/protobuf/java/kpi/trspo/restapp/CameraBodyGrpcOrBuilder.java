// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.example.demo.entities/cameraParts.proto

package kpi.trspo.restapp;

public interface CameraBodyGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.CameraBodyGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  boolean hasBodyId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  kpi.trspo.restapp.MyUuid getBodyId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid bodyId = 1;</code>
   */
  kpi.trspo.restapp.MyUuidOrBuilder getBodyIdOrBuilder();

  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  boolean hasDimensions();
  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  kpi.trspo.restapp.Dimensions getDimensions();
  /**
   * <code>.kpi.trspo.restapp.Dimensions dimensions = 2;</code>
   */
  kpi.trspo.restapp.DimensionsOrBuilder getDimensionsOrBuilder();

  /**
   * <code>string color = 3;</code>
   */
  java.lang.String getColor();
  /**
   * <code>string color = 3;</code>
   */
  com.google.protobuf.ByteString
      getColorBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.example.demo.entities/cameraParts.proto

package kpi.trspo.restapp;

public interface CameraLensGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.CameraLensGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  boolean hasLensId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  kpi.trspo.restapp.MyUuid getLensId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid lensId = 1;</code>
   */
  kpi.trspo.restapp.MyUuidOrBuilder getLensIdOrBuilder();

  /**
   * <code>int32 focalLength = 2;</code>
   */
  int getFocalLength();

  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  int getLensTypeValue();
  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  kpi.trspo.restapp.LensType getLensType();
}

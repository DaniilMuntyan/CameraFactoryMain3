// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/calibrateCamera.proto

package kpi.trspo.restapp;

public interface CalibrateCameraRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.CalibrateCameraRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kpi.trspo.restapp.MyUuid calibratorId = 1;</code>
   */
  boolean hasCalibratorId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid calibratorId = 1;</code>
   */
  kpi.trspo.restapp.MyUuid getCalibratorId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid calibratorId = 1;</code>
   */
  kpi.trspo.restapp.MyUuidOrBuilder getCalibratorIdOrBuilder();

  /**
   * <code>.kpi.trspo.restapp.CameraGrpc camera = 2;</code>
   */
  boolean hasCamera();
  /**
   * <code>.kpi.trspo.restapp.CameraGrpc camera = 2;</code>
   */
  kpi.trspo.restapp.CameraGrpc getCamera();
  /**
   * <code>.kpi.trspo.restapp.CameraGrpc camera = 2;</code>
   */
  kpi.trspo.restapp.CameraGrpcOrBuilder getCameraOrBuilder();
}

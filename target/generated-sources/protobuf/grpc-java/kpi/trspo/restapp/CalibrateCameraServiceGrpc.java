package kpi.trspo.restapp;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: services/calibrateCamera.proto")
public final class CalibrateCameraServiceGrpc {

  private CalibrateCameraServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CalibrateCameraService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CalibrateCameraRequest,
      kpi.trspo.restapp.CalibrateCameraResponse> METHOD_CALIBRATE =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CalibrateCameraRequest, kpi.trspo.restapp.CalibrateCameraResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CalibrateCameraService", "calibrate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CalibrateCameraRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CalibrateCameraResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalibrateCameraServiceStub newStub(io.grpc.Channel channel) {
    return new CalibrateCameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalibrateCameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalibrateCameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalibrateCameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalibrateCameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalibrateCameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calibrate(kpi.trspo.restapp.CalibrateCameraRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CalibrateCameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CALIBRATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CALIBRATE,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CalibrateCameraRequest,
                kpi.trspo.restapp.CalibrateCameraResponse>(
                  this, METHODID_CALIBRATE)))
          .build();
    }
  }

  /**
   */
  public static final class CalibrateCameraServiceStub extends io.grpc.stub.AbstractStub<CalibrateCameraServiceStub> {
    private CalibrateCameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalibrateCameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrateCameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalibrateCameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void calibrate(kpi.trspo.restapp.CalibrateCameraRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CalibrateCameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CALIBRATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalibrateCameraServiceBlockingStub extends io.grpc.stub.AbstractStub<CalibrateCameraServiceBlockingStub> {
    private CalibrateCameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalibrateCameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrateCameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalibrateCameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CalibrateCameraResponse calibrate(kpi.trspo.restapp.CalibrateCameraRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CALIBRATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalibrateCameraServiceFutureStub extends io.grpc.stub.AbstractStub<CalibrateCameraServiceFutureStub> {
    private CalibrateCameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalibrateCameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrateCameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalibrateCameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CalibrateCameraResponse> calibrate(
        kpi.trspo.restapp.CalibrateCameraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CALIBRATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CALIBRATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalibrateCameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalibrateCameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALIBRATE:
          serviceImpl.calibrate((kpi.trspo.restapp.CalibrateCameraRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CalibrateCameraResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CalibrateCameraServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.CalibrateCamera.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalibrateCameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalibrateCameraServiceDescriptorSupplier())
              .addMethod(METHOD_CALIBRATE)
              .build();
        }
      }
    }
    return result;
  }
}

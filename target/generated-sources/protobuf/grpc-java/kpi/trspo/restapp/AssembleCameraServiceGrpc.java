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
    comments = "Source: services/assembleCamera.proto")
public final class AssembleCameraServiceGrpc {

  private AssembleCameraServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.AssembleCameraService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.AssembleCameraRequest,
      kpi.trspo.restapp.AssembleCameraResponse> METHOD_ASSEMBLE_CAMERA =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.AssembleCameraRequest, kpi.trspo.restapp.AssembleCameraResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.AssembleCameraService", "assembleCamera"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleCameraRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleCameraResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssembleCameraServiceStub newStub(io.grpc.Channel channel) {
    return new AssembleCameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssembleCameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AssembleCameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssembleCameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AssembleCameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AssembleCameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assembleCamera(kpi.trspo.restapp.AssembleCameraRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleCameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ASSEMBLE_CAMERA, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ASSEMBLE_CAMERA,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.AssembleCameraRequest,
                kpi.trspo.restapp.AssembleCameraResponse>(
                  this, METHODID_ASSEMBLE_CAMERA)))
          .build();
    }
  }

  /**
   */
  public static final class AssembleCameraServiceStub extends io.grpc.stub.AbstractStub<AssembleCameraServiceStub> {
    private AssembleCameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleCameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleCameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleCameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void assembleCamera(kpi.trspo.restapp.AssembleCameraRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleCameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_CAMERA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssembleCameraServiceBlockingStub extends io.grpc.stub.AbstractStub<AssembleCameraServiceBlockingStub> {
    private AssembleCameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleCameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleCameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleCameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.AssembleCameraResponse assembleCamera(kpi.trspo.restapp.AssembleCameraRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ASSEMBLE_CAMERA, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssembleCameraServiceFutureStub extends io.grpc.stub.AbstractStub<AssembleCameraServiceFutureStub> {
    private AssembleCameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleCameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleCameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleCameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.AssembleCameraResponse> assembleCamera(
        kpi.trspo.restapp.AssembleCameraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_CAMERA, getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSEMBLE_CAMERA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssembleCameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssembleCameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSEMBLE_CAMERA:
          serviceImpl.assembleCamera((kpi.trspo.restapp.AssembleCameraRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleCameraResponse>) responseObserver);
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

  private static final class AssembleCameraServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.AssembleCamera.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AssembleCameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssembleCameraServiceDescriptorSupplier())
              .addMethod(METHOD_ASSEMBLE_CAMERA)
              .build();
        }
      }
    }
    return result;
  }
}

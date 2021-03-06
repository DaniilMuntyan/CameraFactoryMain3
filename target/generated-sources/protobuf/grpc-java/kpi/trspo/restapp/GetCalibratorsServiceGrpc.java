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
    comments = "Source: com.example.demo.entities/calibrator.proto")
public final class GetCalibratorsServiceGrpc {

  private GetCalibratorsServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.GetCalibratorsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.GetCalibratorsRequest,
      kpi.trspo.restapp.GetCalibratorsResponse> METHOD_GET_ALL_CALIBRATORS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.GetCalibratorsRequest, kpi.trspo.restapp.GetCalibratorsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.GetCalibratorsService", "getAllCalibrators"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetCalibratorsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetCalibratorsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetCalibratorsServiceStub newStub(io.grpc.Channel channel) {
    return new GetCalibratorsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetCalibratorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetCalibratorsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetCalibratorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetCalibratorsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetCalibratorsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCalibrators(kpi.trspo.restapp.GetCalibratorsRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetCalibratorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_CALIBRATORS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_CALIBRATORS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.GetCalibratorsRequest,
                kpi.trspo.restapp.GetCalibratorsResponse>(
                  this, METHODID_GET_ALL_CALIBRATORS)))
          .build();
    }
  }

  /**
   */
  public static final class GetCalibratorsServiceStub extends io.grpc.stub.AbstractStub<GetCalibratorsServiceStub> {
    private GetCalibratorsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCalibratorsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCalibratorsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCalibratorsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCalibrators(kpi.trspo.restapp.GetCalibratorsRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetCalibratorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CALIBRATORS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetCalibratorsServiceBlockingStub extends io.grpc.stub.AbstractStub<GetCalibratorsServiceBlockingStub> {
    private GetCalibratorsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCalibratorsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCalibratorsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCalibratorsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.GetCalibratorsResponse getAllCalibrators(kpi.trspo.restapp.GetCalibratorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_CALIBRATORS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetCalibratorsServiceFutureStub extends io.grpc.stub.AbstractStub<GetCalibratorsServiceFutureStub> {
    private GetCalibratorsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCalibratorsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCalibratorsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCalibratorsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.GetCalibratorsResponse> getAllCalibrators(
        kpi.trspo.restapp.GetCalibratorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CALIBRATORS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CALIBRATORS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetCalibratorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetCalibratorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CALIBRATORS:
          serviceImpl.getAllCalibrators((kpi.trspo.restapp.GetCalibratorsRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetCalibratorsResponse>) responseObserver);
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

  private static final class GetCalibratorsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Calibrator.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetCalibratorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetCalibratorsServiceDescriptorSupplier())
              .addMethod(METHOD_GET_ALL_CALIBRATORS)
              .build();
        }
      }
    }
    return result;
  }
}

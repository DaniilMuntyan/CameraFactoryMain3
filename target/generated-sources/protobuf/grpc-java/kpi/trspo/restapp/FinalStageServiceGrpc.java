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
    comments = "Source: services/finalStage.proto")
public final class FinalStageServiceGrpc {

  private FinalStageServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.FinalStageService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.FinalStageRequest,
      kpi.trspo.restapp.FinalStageResponse> METHOD_FINAL_STAGE =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.FinalStageRequest, kpi.trspo.restapp.FinalStageResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.FinalStageService", "finalStage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.FinalStageRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.FinalStageResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FinalStageServiceStub newStub(io.grpc.Channel channel) {
    return new FinalStageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FinalStageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FinalStageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FinalStageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FinalStageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FinalStageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void finalStage(kpi.trspo.restapp.FinalStageRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.FinalStageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FINAL_STAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FINAL_STAGE,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.FinalStageRequest,
                kpi.trspo.restapp.FinalStageResponse>(
                  this, METHODID_FINAL_STAGE)))
          .build();
    }
  }

  /**
   */
  public static final class FinalStageServiceStub extends io.grpc.stub.AbstractStub<FinalStageServiceStub> {
    private FinalStageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinalStageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinalStageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinalStageServiceStub(channel, callOptions);
    }

    /**
     */
    public void finalStage(kpi.trspo.restapp.FinalStageRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.FinalStageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FINAL_STAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FinalStageServiceBlockingStub extends io.grpc.stub.AbstractStub<FinalStageServiceBlockingStub> {
    private FinalStageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinalStageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinalStageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinalStageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.FinalStageResponse finalStage(kpi.trspo.restapp.FinalStageRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FINAL_STAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FinalStageServiceFutureStub extends io.grpc.stub.AbstractStub<FinalStageServiceFutureStub> {
    private FinalStageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinalStageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinalStageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinalStageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.FinalStageResponse> finalStage(
        kpi.trspo.restapp.FinalStageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FINAL_STAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_FINAL_STAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FinalStageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FinalStageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FINAL_STAGE:
          serviceImpl.finalStage((kpi.trspo.restapp.FinalStageRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.FinalStageResponse>) responseObserver);
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

  private static final class FinalStageServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.FinalStage.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FinalStageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FinalStageServiceDescriptorSupplier())
              .addMethod(METHOD_FINAL_STAGE)
              .build();
        }
      }
    }
    return result;
  }
}

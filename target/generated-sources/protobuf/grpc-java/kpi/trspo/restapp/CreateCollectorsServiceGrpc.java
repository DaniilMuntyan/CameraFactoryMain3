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
    comments = "Source: com.example.demo.entities/collector.proto")
public final class CreateCollectorsServiceGrpc {

  private CreateCollectorsServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CreateCollectorsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CreateCollectorRequest,
      kpi.trspo.restapp.CreateCollectorResponse> METHOD_CREATE_COLLECTORS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CreateCollectorRequest, kpi.trspo.restapp.CreateCollectorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CreateCollectorsService", "createCollectors"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateCollectorRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateCollectorResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateCollectorsServiceStub newStub(io.grpc.Channel channel) {
    return new CreateCollectorsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateCollectorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateCollectorsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateCollectorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateCollectorsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateCollectorsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCollectors(kpi.trspo.restapp.CreateCollectorRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCollectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_COLLECTORS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_COLLECTORS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CreateCollectorRequest,
                kpi.trspo.restapp.CreateCollectorResponse>(
                  this, METHODID_CREATE_COLLECTORS)))
          .build();
    }
  }

  /**
   */
  public static final class CreateCollectorsServiceStub extends io.grpc.stub.AbstractStub<CreateCollectorsServiceStub> {
    private CreateCollectorsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCollectorsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCollectorsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCollectorsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCollectors(kpi.trspo.restapp.CreateCollectorRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCollectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_COLLECTORS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateCollectorsServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateCollectorsServiceBlockingStub> {
    private CreateCollectorsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCollectorsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCollectorsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCollectorsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CreateCollectorResponse createCollectors(kpi.trspo.restapp.CreateCollectorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_COLLECTORS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateCollectorsServiceFutureStub extends io.grpc.stub.AbstractStub<CreateCollectorsServiceFutureStub> {
    private CreateCollectorsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCollectorsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCollectorsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCollectorsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CreateCollectorResponse> createCollectors(
        kpi.trspo.restapp.CreateCollectorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_COLLECTORS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COLLECTORS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateCollectorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateCollectorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COLLECTORS:
          serviceImpl.createCollectors((kpi.trspo.restapp.CreateCollectorRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCollectorResponse>) responseObserver);
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

  private static final class CreateCollectorsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Collector.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreateCollectorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateCollectorsServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_COLLECTORS)
              .build();
        }
      }
    }
    return result;
  }
}

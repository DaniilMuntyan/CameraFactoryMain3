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
    comments = "Source: com.example.demo.entities/manager.proto")
public final class CreateManagerServiceGrpc {

  private CreateManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CreateManagerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CreateManagerRequest,
      kpi.trspo.restapp.CreateManagerResponse> METHOD_CREATE_MANAGER =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CreateManagerRequest, kpi.trspo.restapp.CreateManagerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CreateManagerService", "createManager"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateManagerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateManagerResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateManagerServiceStub newStub(io.grpc.Channel channel) {
    return new CreateManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createManager(kpi.trspo.restapp.CreateManagerRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateManagerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_MANAGER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_MANAGER,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CreateManagerRequest,
                kpi.trspo.restapp.CreateManagerResponse>(
                  this, METHODID_CREATE_MANAGER)))
          .build();
    }
  }

  /**
   */
  public static final class CreateManagerServiceStub extends io.grpc.stub.AbstractStub<CreateManagerServiceStub> {
    private CreateManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createManager(kpi.trspo.restapp.CreateManagerRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateManagerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_MANAGER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateManagerServiceBlockingStub> {
    private CreateManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CreateManagerResponse createManager(kpi.trspo.restapp.CreateManagerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_MANAGER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateManagerServiceFutureStub extends io.grpc.stub.AbstractStub<CreateManagerServiceFutureStub> {
    private CreateManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CreateManagerResponse> createManager(
        kpi.trspo.restapp.CreateManagerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_MANAGER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MANAGER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MANAGER:
          serviceImpl.createManager((kpi.trspo.restapp.CreateManagerRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateManagerResponse>) responseObserver);
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

  private static final class CreateManagerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Manager.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreateManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateManagerServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_MANAGER)
              .build();
        }
      }
    }
    return result;
  }
}

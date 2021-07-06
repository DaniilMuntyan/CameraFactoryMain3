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
    comments = "Source: com.example.demo.entities/packer.proto")
public final class CreatePackersServiceGrpc {

  private CreatePackersServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CreatePackersService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CreatePackerRequest,
      kpi.trspo.restapp.CreatePackerResponse> METHOD_CREATE_PACKERS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CreatePackerRequest, kpi.trspo.restapp.CreatePackerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CreatePackersService", "createPackers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreatePackerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreatePackerResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreatePackersServiceStub newStub(io.grpc.Channel channel) {
    return new CreatePackersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreatePackersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreatePackersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreatePackersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreatePackersServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreatePackersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPackers(kpi.trspo.restapp.CreatePackerRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreatePackerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PACKERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PACKERS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CreatePackerRequest,
                kpi.trspo.restapp.CreatePackerResponse>(
                  this, METHODID_CREATE_PACKERS)))
          .build();
    }
  }

  /**
   */
  public static final class CreatePackersServiceStub extends io.grpc.stub.AbstractStub<CreatePackersServiceStub> {
    private CreatePackersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePackersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePackersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePackersServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPackers(kpi.trspo.restapp.CreatePackerRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreatePackerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PACKERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreatePackersServiceBlockingStub extends io.grpc.stub.AbstractStub<CreatePackersServiceBlockingStub> {
    private CreatePackersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePackersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePackersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePackersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CreatePackerResponse createPackers(kpi.trspo.restapp.CreatePackerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PACKERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreatePackersServiceFutureStub extends io.grpc.stub.AbstractStub<CreatePackersServiceFutureStub> {
    private CreatePackersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePackersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePackersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePackersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CreatePackerResponse> createPackers(
        kpi.trspo.restapp.CreatePackerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PACKERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PACKERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreatePackersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreatePackersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PACKERS:
          serviceImpl.createPackers((kpi.trspo.restapp.CreatePackerRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreatePackerResponse>) responseObserver);
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

  private static final class CreatePackersServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Packer.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreatePackersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreatePackersServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_PACKERS)
              .build();
        }
      }
    }
    return result;
  }
}

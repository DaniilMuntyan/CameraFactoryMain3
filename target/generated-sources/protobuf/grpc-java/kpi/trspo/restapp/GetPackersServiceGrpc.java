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
public final class GetPackersServiceGrpc {

  private GetPackersServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.GetPackersService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.GetAllPackersRequest,
      kpi.trspo.restapp.GetAllPackersResponse> METHOD_GET_ALL_PACKERS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.GetAllPackersRequest, kpi.trspo.restapp.GetAllPackersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.GetPackersService", "getAllPackers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetAllPackersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetAllPackersResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetPackersServiceStub newStub(io.grpc.Channel channel) {
    return new GetPackersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetPackersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetPackersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetPackersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetPackersServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetPackersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllPackers(kpi.trspo.restapp.GetAllPackersRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllPackersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_PACKERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_PACKERS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.GetAllPackersRequest,
                kpi.trspo.restapp.GetAllPackersResponse>(
                  this, METHODID_GET_ALL_PACKERS)))
          .build();
    }
  }

  /**
   */
  public static final class GetPackersServiceStub extends io.grpc.stub.AbstractStub<GetPackersServiceStub> {
    private GetPackersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetPackersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPackersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetPackersServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllPackers(kpi.trspo.restapp.GetAllPackersRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllPackersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PACKERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetPackersServiceBlockingStub extends io.grpc.stub.AbstractStub<GetPackersServiceBlockingStub> {
    private GetPackersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetPackersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPackersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetPackersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.GetAllPackersResponse getAllPackers(kpi.trspo.restapp.GetAllPackersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_PACKERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetPackersServiceFutureStub extends io.grpc.stub.AbstractStub<GetPackersServiceFutureStub> {
    private GetPackersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetPackersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPackersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetPackersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.GetAllPackersResponse> getAllPackers(
        kpi.trspo.restapp.GetAllPackersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PACKERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PACKERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetPackersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetPackersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PACKERS:
          serviceImpl.getAllPackers((kpi.trspo.restapp.GetAllPackersRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllPackersResponse>) responseObserver);
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

  private static final class GetPackersServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Packer.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetPackersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetPackersServiceDescriptorSupplier())
              .addMethod(METHOD_GET_ALL_PACKERS)
              .build();
        }
      }
    }
    return result;
  }
}

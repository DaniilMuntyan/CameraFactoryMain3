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
public final class GetManagersServiceGrpc {

  private GetManagersServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.GetManagersService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.GetManagersRequest,
      kpi.trspo.restapp.GetManagersResponse> METHOD_GET_MANAGERS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.GetManagersRequest, kpi.trspo.restapp.GetManagersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.GetManagersService", "getManagers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetManagersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetManagersResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetManagersServiceStub newStub(io.grpc.Channel channel) {
    return new GetManagersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetManagersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetManagersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetManagersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetManagersServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetManagersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getManagers(kpi.trspo.restapp.GetManagersRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetManagersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MANAGERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_MANAGERS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.GetManagersRequest,
                kpi.trspo.restapp.GetManagersResponse>(
                  this, METHODID_GET_MANAGERS)))
          .build();
    }
  }

  /**
   */
  public static final class GetManagersServiceStub extends io.grpc.stub.AbstractStub<GetManagersServiceStub> {
    private GetManagersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetManagersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetManagersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetManagersServiceStub(channel, callOptions);
    }

    /**
     */
    public void getManagers(kpi.trspo.restapp.GetManagersRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetManagersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MANAGERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetManagersServiceBlockingStub extends io.grpc.stub.AbstractStub<GetManagersServiceBlockingStub> {
    private GetManagersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetManagersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetManagersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetManagersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.GetManagersResponse getManagers(kpi.trspo.restapp.GetManagersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MANAGERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetManagersServiceFutureStub extends io.grpc.stub.AbstractStub<GetManagersServiceFutureStub> {
    private GetManagersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetManagersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetManagersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetManagersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.GetManagersResponse> getManagers(
        kpi.trspo.restapp.GetManagersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MANAGERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MANAGERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetManagersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetManagersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MANAGERS:
          serviceImpl.getManagers((kpi.trspo.restapp.GetManagersRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetManagersResponse>) responseObserver);
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

  private static final class GetManagersServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Manager.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetManagersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetManagersServiceDescriptorSupplier())
              .addMethod(METHOD_GET_MANAGERS)
              .build();
        }
      }
    }
    return result;
  }
}

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
public final class GetCollectorsServiceGrpc {

  private GetCollectorsServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.GetCollectorsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.GetAllCollectorsRequest,
      kpi.trspo.restapp.GetAllCollectorsResponse> METHOD_GET_ALL_COLLECTORS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.GetAllCollectorsRequest, kpi.trspo.restapp.GetAllCollectorsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.GetCollectorsService", "getAllCollectors"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetAllCollectorsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetAllCollectorsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetCollectorsServiceStub newStub(io.grpc.Channel channel) {
    return new GetCollectorsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetCollectorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetCollectorsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetCollectorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetCollectorsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetCollectorsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCollectors(kpi.trspo.restapp.GetAllCollectorsRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllCollectorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_COLLECTORS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_COLLECTORS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.GetAllCollectorsRequest,
                kpi.trspo.restapp.GetAllCollectorsResponse>(
                  this, METHODID_GET_ALL_COLLECTORS)))
          .build();
    }
  }

  /**
   */
  public static final class GetCollectorsServiceStub extends io.grpc.stub.AbstractStub<GetCollectorsServiceStub> {
    private GetCollectorsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCollectorsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCollectorsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCollectorsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCollectors(kpi.trspo.restapp.GetAllCollectorsRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllCollectorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_COLLECTORS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetCollectorsServiceBlockingStub extends io.grpc.stub.AbstractStub<GetCollectorsServiceBlockingStub> {
    private GetCollectorsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCollectorsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCollectorsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCollectorsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.GetAllCollectorsResponse getAllCollectors(kpi.trspo.restapp.GetAllCollectorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_COLLECTORS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetCollectorsServiceFutureStub extends io.grpc.stub.AbstractStub<GetCollectorsServiceFutureStub> {
    private GetCollectorsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetCollectorsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCollectorsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetCollectorsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.GetAllCollectorsResponse> getAllCollectors(
        kpi.trspo.restapp.GetAllCollectorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_COLLECTORS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_COLLECTORS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetCollectorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetCollectorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_COLLECTORS:
          serviceImpl.getAllCollectors((kpi.trspo.restapp.GetAllCollectorsRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetAllCollectorsResponse>) responseObserver);
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

  private static final class GetCollectorsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Collector.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetCollectorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetCollectorsServiceDescriptorSupplier())
              .addMethod(METHOD_GET_ALL_COLLECTORS)
              .build();
        }
      }
    }
    return result;
  }
}

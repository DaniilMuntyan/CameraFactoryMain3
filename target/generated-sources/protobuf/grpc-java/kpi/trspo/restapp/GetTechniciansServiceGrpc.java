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
    comments = "Source: com.example.demo.entities/technician.proto")
public final class GetTechniciansServiceGrpc {

  private GetTechniciansServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.GetTechniciansService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.GetTechniciansRequest,
      kpi.trspo.restapp.GetTechniciansResponse> METHOD_GET_TECHNICIANS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.GetTechniciansRequest, kpi.trspo.restapp.GetTechniciansResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.GetTechniciansService", "getTechnicians"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetTechniciansRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.GetTechniciansResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetTechniciansServiceStub newStub(io.grpc.Channel channel) {
    return new GetTechniciansServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetTechniciansServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetTechniciansServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetTechniciansServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetTechniciansServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetTechniciansServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTechnicians(kpi.trspo.restapp.GetTechniciansRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetTechniciansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TECHNICIANS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TECHNICIANS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.GetTechniciansRequest,
                kpi.trspo.restapp.GetTechniciansResponse>(
                  this, METHODID_GET_TECHNICIANS)))
          .build();
    }
  }

  /**
   */
  public static final class GetTechniciansServiceStub extends io.grpc.stub.AbstractStub<GetTechniciansServiceStub> {
    private GetTechniciansServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetTechniciansServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTechniciansServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetTechniciansServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTechnicians(kpi.trspo.restapp.GetTechniciansRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetTechniciansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TECHNICIANS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetTechniciansServiceBlockingStub extends io.grpc.stub.AbstractStub<GetTechniciansServiceBlockingStub> {
    private GetTechniciansServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetTechniciansServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTechniciansServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetTechniciansServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.GetTechniciansResponse getTechnicians(kpi.trspo.restapp.GetTechniciansRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TECHNICIANS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetTechniciansServiceFutureStub extends io.grpc.stub.AbstractStub<GetTechniciansServiceFutureStub> {
    private GetTechniciansServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetTechniciansServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTechniciansServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetTechniciansServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.GetTechniciansResponse> getTechnicians(
        kpi.trspo.restapp.GetTechniciansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TECHNICIANS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TECHNICIANS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetTechniciansServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetTechniciansServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TECHNICIANS:
          serviceImpl.getTechnicians((kpi.trspo.restapp.GetTechniciansRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.GetTechniciansResponse>) responseObserver);
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

  private static final class GetTechniciansServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Technician.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetTechniciansServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetTechniciansServiceDescriptorSupplier())
              .addMethod(METHOD_GET_TECHNICIANS)
              .build();
        }
      }
    }
    return result;
  }
}

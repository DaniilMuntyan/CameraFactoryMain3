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
    comments = "Source: services/assembleBack.proto")
public final class AssembleBackServiceGrpc {

  private AssembleBackServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.AssembleBackService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.AssembleBackRequest,
      kpi.trspo.restapp.AssembleBackResponse> METHOD_ASSEMBLE_BACK =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.AssembleBackRequest, kpi.trspo.restapp.AssembleBackResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.AssembleBackService", "assembleBack"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleBackRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleBackResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssembleBackServiceStub newStub(io.grpc.Channel channel) {
    return new AssembleBackServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssembleBackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AssembleBackServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssembleBackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AssembleBackServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AssembleBackServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assembleBack(kpi.trspo.restapp.AssembleBackRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ASSEMBLE_BACK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ASSEMBLE_BACK,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.AssembleBackRequest,
                kpi.trspo.restapp.AssembleBackResponse>(
                  this, METHODID_ASSEMBLE_BACK)))
          .build();
    }
  }

  /**
   */
  public static final class AssembleBackServiceStub extends io.grpc.stub.AbstractStub<AssembleBackServiceStub> {
    private AssembleBackServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBackServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBackServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBackServiceStub(channel, callOptions);
    }

    /**
     */
    public void assembleBack(kpi.trspo.restapp.AssembleBackRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_BACK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssembleBackServiceBlockingStub extends io.grpc.stub.AbstractStub<AssembleBackServiceBlockingStub> {
    private AssembleBackServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBackServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBackServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBackServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.AssembleBackResponse assembleBack(kpi.trspo.restapp.AssembleBackRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ASSEMBLE_BACK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssembleBackServiceFutureStub extends io.grpc.stub.AbstractStub<AssembleBackServiceFutureStub> {
    private AssembleBackServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBackServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBackServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBackServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.AssembleBackResponse> assembleBack(
        kpi.trspo.restapp.AssembleBackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_BACK, getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSEMBLE_BACK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssembleBackServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssembleBackServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSEMBLE_BACK:
          serviceImpl.assembleBack((kpi.trspo.restapp.AssembleBackRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBackResponse>) responseObserver);
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

  private static final class AssembleBackServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.AssembleBack.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AssembleBackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssembleBackServiceDescriptorSupplier())
              .addMethod(METHOD_ASSEMBLE_BACK)
              .build();
        }
      }
    }
    return result;
  }
}

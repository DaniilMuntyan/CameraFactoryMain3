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
    comments = "Source: services/assembleBody.proto")
public final class AssembleBodyServiceGrpc {

  private AssembleBodyServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.AssembleBodyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.AssembleBodyRequest,
      kpi.trspo.restapp.AssembleBodyResponse> METHOD_ASSEMBLE_BODY =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.AssembleBodyRequest, kpi.trspo.restapp.AssembleBodyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.AssembleBodyService", "assembleBody"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleBodyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleBodyResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssembleBodyServiceStub newStub(io.grpc.Channel channel) {
    return new AssembleBodyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssembleBodyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AssembleBodyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssembleBodyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AssembleBodyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AssembleBodyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assembleBody(kpi.trspo.restapp.AssembleBodyRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBodyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ASSEMBLE_BODY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ASSEMBLE_BODY,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.AssembleBodyRequest,
                kpi.trspo.restapp.AssembleBodyResponse>(
                  this, METHODID_ASSEMBLE_BODY)))
          .build();
    }
  }

  /**
   */
  public static final class AssembleBodyServiceStub extends io.grpc.stub.AbstractStub<AssembleBodyServiceStub> {
    private AssembleBodyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBodyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBodyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBodyServiceStub(channel, callOptions);
    }

    /**
     */
    public void assembleBody(kpi.trspo.restapp.AssembleBodyRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBodyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_BODY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssembleBodyServiceBlockingStub extends io.grpc.stub.AbstractStub<AssembleBodyServiceBlockingStub> {
    private AssembleBodyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBodyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBodyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBodyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.AssembleBodyResponse assembleBody(kpi.trspo.restapp.AssembleBodyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ASSEMBLE_BODY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssembleBodyServiceFutureStub extends io.grpc.stub.AbstractStub<AssembleBodyServiceFutureStub> {
    private AssembleBodyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleBodyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleBodyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleBodyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.AssembleBodyResponse> assembleBody(
        kpi.trspo.restapp.AssembleBodyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_BODY, getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSEMBLE_BODY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssembleBodyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssembleBodyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSEMBLE_BODY:
          serviceImpl.assembleBody((kpi.trspo.restapp.AssembleBodyRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleBodyResponse>) responseObserver);
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

  private static final class AssembleBodyServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.AssembleBody.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AssembleBodyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssembleBodyServiceDescriptorSupplier())
              .addMethod(METHOD_ASSEMBLE_BODY)
              .build();
        }
      }
    }
    return result;
  }
}

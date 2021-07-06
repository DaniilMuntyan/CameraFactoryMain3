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
    comments = "Source: services/assembleLens.proto")
public final class AssembleLensServiceGrpc {

  private AssembleLensServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.AssembleLensService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.AssembleLensRequest,
      kpi.trspo.restapp.AssembleLensResponse> METHOD_ASSEMBLE_LENS =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.AssembleLensRequest, kpi.trspo.restapp.AssembleLensResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.AssembleLensService", "assembleLens"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleLensRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.AssembleLensResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssembleLensServiceStub newStub(io.grpc.Channel channel) {
    return new AssembleLensServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssembleLensServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AssembleLensServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssembleLensServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AssembleLensServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AssembleLensServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assembleLens(kpi.trspo.restapp.AssembleLensRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleLensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ASSEMBLE_LENS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ASSEMBLE_LENS,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.AssembleLensRequest,
                kpi.trspo.restapp.AssembleLensResponse>(
                  this, METHODID_ASSEMBLE_LENS)))
          .build();
    }
  }

  /**
   */
  public static final class AssembleLensServiceStub extends io.grpc.stub.AbstractStub<AssembleLensServiceStub> {
    private AssembleLensServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleLensServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleLensServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleLensServiceStub(channel, callOptions);
    }

    /**
     */
    public void assembleLens(kpi.trspo.restapp.AssembleLensRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleLensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_LENS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssembleLensServiceBlockingStub extends io.grpc.stub.AbstractStub<AssembleLensServiceBlockingStub> {
    private AssembleLensServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleLensServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleLensServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleLensServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.AssembleLensResponse assembleLens(kpi.trspo.restapp.AssembleLensRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ASSEMBLE_LENS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssembleLensServiceFutureStub extends io.grpc.stub.AbstractStub<AssembleLensServiceFutureStub> {
    private AssembleLensServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssembleLensServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssembleLensServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssembleLensServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.AssembleLensResponse> assembleLens(
        kpi.trspo.restapp.AssembleLensRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ASSEMBLE_LENS, getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSEMBLE_LENS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssembleLensServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssembleLensServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSEMBLE_LENS:
          serviceImpl.assembleLens((kpi.trspo.restapp.AssembleLensRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.AssembleLensResponse>) responseObserver);
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

  private static final class AssembleLensServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.AssembleLens.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AssembleLensServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssembleLensServiceDescriptorSupplier())
              .addMethod(METHOD_ASSEMBLE_LENS)
              .build();
        }
      }
    }
    return result;
  }
}

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
public final class CreateTechnicianServiceGrpc {

  private CreateTechnicianServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CreateTechnicianService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CreateTechnicianRequest,
      kpi.trspo.restapp.CreateTechnicianResponse> METHOD_CREATE_TECHNICIAN =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CreateTechnicianRequest, kpi.trspo.restapp.CreateTechnicianResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CreateTechnicianService", "createTechnician"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateTechnicianRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateTechnicianResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateTechnicianServiceStub newStub(io.grpc.Channel channel) {
    return new CreateTechnicianServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateTechnicianServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateTechnicianServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateTechnicianServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateTechnicianServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateTechnicianServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTechnician(kpi.trspo.restapp.CreateTechnicianRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateTechnicianResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TECHNICIAN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_TECHNICIAN,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CreateTechnicianRequest,
                kpi.trspo.restapp.CreateTechnicianResponse>(
                  this, METHODID_CREATE_TECHNICIAN)))
          .build();
    }
  }

  /**
   */
  public static final class CreateTechnicianServiceStub extends io.grpc.stub.AbstractStub<CreateTechnicianServiceStub> {
    private CreateTechnicianServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateTechnicianServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateTechnicianServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateTechnicianServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTechnician(kpi.trspo.restapp.CreateTechnicianRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateTechnicianResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TECHNICIAN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateTechnicianServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateTechnicianServiceBlockingStub> {
    private CreateTechnicianServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateTechnicianServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateTechnicianServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateTechnicianServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CreateTechnicianResponse createTechnician(kpi.trspo.restapp.CreateTechnicianRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TECHNICIAN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateTechnicianServiceFutureStub extends io.grpc.stub.AbstractStub<CreateTechnicianServiceFutureStub> {
    private CreateTechnicianServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateTechnicianServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateTechnicianServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateTechnicianServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CreateTechnicianResponse> createTechnician(
        kpi.trspo.restapp.CreateTechnicianRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TECHNICIAN, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TECHNICIAN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateTechnicianServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateTechnicianServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TECHNICIAN:
          serviceImpl.createTechnician((kpi.trspo.restapp.CreateTechnicianRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateTechnicianResponse>) responseObserver);
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

  private static final class CreateTechnicianServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Technician.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreateTechnicianServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateTechnicianServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_TECHNICIAN)
              .build();
        }
      }
    }
    return result;
  }
}

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
    comments = "Source: com.example.demo.entities/calibrator.proto")
public final class CreateCalibratorsServiceGrpc {

  private CreateCalibratorsServiceGrpc() {}

  public static final String SERVICE_NAME = "kpi.trspo.restapp.CreateCalibratorsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kpi.trspo.restapp.CreateCalibratorRequest,
      kpi.trspo.restapp.CreateCalibratorResponse> METHOD_CREATE_CALIBRATOR =
      io.grpc.MethodDescriptor.<kpi.trspo.restapp.CreateCalibratorRequest, kpi.trspo.restapp.CreateCalibratorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kpi.trspo.restapp.CreateCalibratorsService", "createCalibrator"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateCalibratorRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kpi.trspo.restapp.CreateCalibratorResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateCalibratorsServiceStub newStub(io.grpc.Channel channel) {
    return new CreateCalibratorsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateCalibratorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateCalibratorsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateCalibratorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateCalibratorsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateCalibratorsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCalibrator(kpi.trspo.restapp.CreateCalibratorRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCalibratorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CALIBRATOR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CALIBRATOR,
            asyncUnaryCall(
              new MethodHandlers<
                kpi.trspo.restapp.CreateCalibratorRequest,
                kpi.trspo.restapp.CreateCalibratorResponse>(
                  this, METHODID_CREATE_CALIBRATOR)))
          .build();
    }
  }

  /**
   */
  public static final class CreateCalibratorsServiceStub extends io.grpc.stub.AbstractStub<CreateCalibratorsServiceStub> {
    private CreateCalibratorsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCalibratorsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCalibratorsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCalibratorsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCalibrator(kpi.trspo.restapp.CreateCalibratorRequest request,
        io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCalibratorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CALIBRATOR, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateCalibratorsServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateCalibratorsServiceBlockingStub> {
    private CreateCalibratorsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCalibratorsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCalibratorsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCalibratorsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kpi.trspo.restapp.CreateCalibratorResponse createCalibrator(kpi.trspo.restapp.CreateCalibratorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CALIBRATOR, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateCalibratorsServiceFutureStub extends io.grpc.stub.AbstractStub<CreateCalibratorsServiceFutureStub> {
    private CreateCalibratorsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCalibratorsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCalibratorsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCalibratorsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kpi.trspo.restapp.CreateCalibratorResponse> createCalibrator(
        kpi.trspo.restapp.CreateCalibratorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CALIBRATOR, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CALIBRATOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateCalibratorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateCalibratorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CALIBRATOR:
          serviceImpl.createCalibrator((kpi.trspo.restapp.CreateCalibratorRequest) request,
              (io.grpc.stub.StreamObserver<kpi.trspo.restapp.CreateCalibratorResponse>) responseObserver);
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

  private static final class CreateCalibratorsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kpi.trspo.restapp.Calibrator.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreateCalibratorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateCalibratorsServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_CALIBRATOR)
              .build();
        }
      }
    }
    return result;
  }
}

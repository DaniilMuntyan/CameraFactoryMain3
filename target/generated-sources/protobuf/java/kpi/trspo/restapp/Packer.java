// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.example.demo.entities/packer.proto

package kpi.trspo.restapp;

public final class Packer {
  private Packer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_PackerGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_PackerGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_GetAllPackersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_GetAllPackersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_GetAllPackersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_GetAllPackersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_CreatePackerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_CreatePackerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_CreatePackerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_CreatePackerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025entities/packer.proto\022\021kpi.trspo.resta" +
      "pp\032\033google/protobuf/empty.proto\032\025entitie" +
      "s/myUuid.proto\"G\n\nPackerGrpc\022+\n\010packerId" +
      "\030\001 \001(\0132\031.kpi.trspo.restapp.MyUuid\022\014\n\004nam" +
      "e\030\002 \001(\t\"=\n\024GetAllPackersRequest\022%\n\005value" +
      "\030\001 \001(\0132\026.google.protobuf.Empty\"G\n\025GetAll" +
      "PackersResponse\022.\n\007packers\030\001 \003(\0132\035.kpi.t" +
      "rspo.restapp.PackerGrpc\"#\n\023CreatePackerR" +
      "equest\022\014\n\004name\030\001 \001(\t\"E\n\024CreatePackerResp" +
      "onse\022-\n\006packer\030\001 \001(\0132\035.kpi.trspo.restapp",
      ".PackerGrpc2w\n\021GetPackersService\022b\n\rgetA" +
      "llPackers\022\'.kpi.trspo.restapp.GetAllPack" +
      "ersRequest\032(.kpi.trspo.restapp.GetAllPac" +
      "kersResponse2x\n\024CreatePackersService\022`\n\r" +
      "createPackers\022&.kpi.trspo.restapp.Create" +
      "PackerRequest\032\'.kpi.trspo.restapp.Create" +
      "PackerResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          kpi.trspo.restapp.MyUuidOuterClass.getDescriptor(),
        }, assigner);
    internal_static_kpi_trspo_restapp_PackerGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kpi_trspo_restapp_PackerGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_PackerGrpc_descriptor,
        new java.lang.String[] { "PackerId", "Name", });
    internal_static_kpi_trspo_restapp_GetAllPackersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kpi_trspo_restapp_GetAllPackersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_GetAllPackersRequest_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_kpi_trspo_restapp_GetAllPackersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kpi_trspo_restapp_GetAllPackersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_GetAllPackersResponse_descriptor,
        new java.lang.String[] { "Packers", });
    internal_static_kpi_trspo_restapp_CreatePackerRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kpi_trspo_restapp_CreatePackerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_CreatePackerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_kpi_trspo_restapp_CreatePackerResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_kpi_trspo_restapp_CreatePackerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_CreatePackerResponse_descriptor,
        new java.lang.String[] { "Packer", });
    com.google.protobuf.EmptyProto.getDescriptor();
    kpi.trspo.restapp.MyUuidOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

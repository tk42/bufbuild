// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pet/v1/pet.proto

package com.pet.v1;

public final class PetProto {
  private PetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_Pet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_Pet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_GetPetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_GetPetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_GetPetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_GetPetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_PutPetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_PutPetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_PutPetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_PutPetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_DeletePetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_DeletePetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pet_v1_DeletePetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pet_v1_DeletePetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020pet/v1/pet.proto\022\006pet.v1\032\032google/type/" +
      "datetime.proto\"\222\001\n\003Pet\022*\n\010pet_type\030\001 \001(\016" +
      "2\017.pet.v1.PetTypeR\007petType\022\025\n\006pet_id\030\002 \001" +
      "(\tR\005petId\022\022\n\004name\030\003 \001(\tR\004name\0224\n\ncreated" +
      "_at\030\004 \001(\0132\025.google.type.DateTimeR\tcreate" +
      "dAt\"&\n\rGetPetRequest\022\025\n\006pet_id\030\001 \001(\tR\005pe" +
      "tId\"/\n\016GetPetResponse\022\035\n\003pet\030\001 \001(\0132\013.pet" +
      ".v1.PetR\003pet\"O\n\rPutPetRequest\022*\n\010pet_typ" +
      "e\030\001 \001(\0162\017.pet.v1.PetTypeR\007petType\022\022\n\004nam" +
      "e\030\002 \001(\tR\004name\"/\n\016PutPetResponse\022\035\n\003pet\030\001" +
      " \001(\0132\013.pet.v1.PetR\003pet\")\n\020DeletePetReque" +
      "st\022\025\n\006pet_id\030\001 \001(\tR\005petId\"\023\n\021DeletePetRe" +
      "sponse*q\n\007PetType\022\030\n\024PET_TYPE_UNSPECIFIE" +
      "D\020\000\022\020\n\014PET_TYPE_CAT\020\001\022\020\n\014PET_TYPE_DOG\020\002\022" +
      "\022\n\016PET_TYPE_SNAKE\020\003\022\024\n\020PET_TYPE_HAMSTER\020" +
      "\0042\313\001\n\017PetStoreService\0229\n\006GetPet\022\025.pet.v1" +
      ".GetPetRequest\032\026.pet.v1.GetPetResponse\"\000" +
      "\0229\n\006PutPet\022\025.pet.v1.PutPetRequest\032\026.pet." +
      "v1.PutPetResponse\"\000\022B\n\tDeletePet\022\030.pet.v" +
      "1.DeletePetRequest\032\031.pet.v1.DeletePetRes" +
      "ponse\"\000B\222\001\n\ncom.pet.v1B\010PetProtoH\002P\001Z?gi" +
      "thub.com/bufbuild/buf-tour/petstore/gen/" +
      "proto/go/pet/v1;petv1\242\002\003PXX\252\002\006Pet.V1\312\002\006P" +
      "et\\V1\342\002\022Pet\\V1\\GPBMetadata\352\002\007Pet::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.type.DatetimeProto.getDescriptor(),
        });
    internal_static_pet_v1_Pet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pet_v1_Pet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_Pet_descriptor,
        new java.lang.String[] { "PetType", "PetId", "Name", "CreatedAt", });
    internal_static_pet_v1_GetPetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pet_v1_GetPetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_GetPetRequest_descriptor,
        new java.lang.String[] { "PetId", });
    internal_static_pet_v1_GetPetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_pet_v1_GetPetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_GetPetResponse_descriptor,
        new java.lang.String[] { "Pet", });
    internal_static_pet_v1_PutPetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_pet_v1_PutPetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_PutPetRequest_descriptor,
        new java.lang.String[] { "PetType", "Name", });
    internal_static_pet_v1_PutPetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_pet_v1_PutPetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_PutPetResponse_descriptor,
        new java.lang.String[] { "Pet", });
    internal_static_pet_v1_DeletePetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_pet_v1_DeletePetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_DeletePetRequest_descriptor,
        new java.lang.String[] { "PetId", });
    internal_static_pet_v1_DeletePetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_pet_v1_DeletePetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pet_v1_DeletePetResponse_descriptor,
        new java.lang.String[] { });
    com.google.type.DatetimeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

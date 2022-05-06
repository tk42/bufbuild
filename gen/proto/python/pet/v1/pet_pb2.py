# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: pet/v1/pet.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.type import datetime_pb2 as google_dot_type_dot_datetime__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x10pet/v1/pet.proto\x12\x06pet.v1\x1a\x1agoogle/type/datetime.proto\"\x92\x01\n\x03Pet\x12*\n\x08pet_type\x18\x01 \x01(\x0e\x32\x0f.pet.v1.PetTypeR\x07petType\x12\x15\n\x06pet_id\x18\x02 \x01(\tR\x05petId\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x34\n\ncreated_at\x18\x04 \x01(\x0b\x32\x15.google.type.DateTimeR\tcreatedAt\"&\n\rGetPetRequest\x12\x15\n\x06pet_id\x18\x01 \x01(\tR\x05petId\"/\n\x0eGetPetResponse\x12\x1d\n\x03pet\x18\x01 \x01(\x0b\x32\x0b.pet.v1.PetR\x03pet\"O\n\rPutPetRequest\x12*\n\x08pet_type\x18\x01 \x01(\x0e\x32\x0f.pet.v1.PetTypeR\x07petType\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\"/\n\x0ePutPetResponse\x12\x1d\n\x03pet\x18\x01 \x01(\x0b\x32\x0b.pet.v1.PetR\x03pet\")\n\x10\x44\x65letePetRequest\x12\x15\n\x06pet_id\x18\x01 \x01(\tR\x05petId\"\x13\n\x11\x44\x65letePetResponse*q\n\x07PetType\x12\x18\n\x14PET_TYPE_UNSPECIFIED\x10\x00\x12\x10\n\x0cPET_TYPE_CAT\x10\x01\x12\x10\n\x0cPET_TYPE_DOG\x10\x02\x12\x12\n\x0ePET_TYPE_SNAKE\x10\x03\x12\x14\n\x10PET_TYPE_HAMSTER\x10\x04\x32\xcb\x01\n\x0fPetStoreService\x12\x39\n\x06GetPet\x12\x15.pet.v1.GetPetRequest\x1a\x16.pet.v1.GetPetResponse\"\x00\x12\x39\n\x06PutPet\x12\x15.pet.v1.PutPetRequest\x1a\x16.pet.v1.PutPetResponse\"\x00\x12\x42\n\tDeletePet\x12\x18.pet.v1.DeletePetRequest\x1a\x19.pet.v1.DeletePetResponse\"\x00\x42\x41Z?github.com/bufbuild/buf-tour/petstore/gen/proto/go/pet/v1;petv1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'pet.v1.pet_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z?github.com/bufbuild/buf-tour/petstore/gen/proto/go/pet/v1;petv1'
  _PETTYPE._serialized_start=488
  _PETTYPE._serialized_end=601
  _PET._serialized_start=57
  _PET._serialized_end=203
  _GETPETREQUEST._serialized_start=205
  _GETPETREQUEST._serialized_end=243
  _GETPETRESPONSE._serialized_start=245
  _GETPETRESPONSE._serialized_end=292
  _PUTPETREQUEST._serialized_start=294
  _PUTPETREQUEST._serialized_end=373
  _PUTPETRESPONSE._serialized_start=375
  _PUTPETRESPONSE._serialized_end=422
  _DELETEPETREQUEST._serialized_start=424
  _DELETEPETREQUEST._serialized_end=465
  _DELETEPETRESPONSE._serialized_start=467
  _DELETEPETRESPONSE._serialized_end=486
  _PETSTORESERVICE._serialized_start=604
  _PETSTORESERVICE._serialized_end=807
# @@protoc_insertion_point(module_scope)

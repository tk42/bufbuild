// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pet/v1/pet.proto

package com.pet.v1;

public interface PutPetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pet.v1.PutPetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pet.v1.Pet pet = 1 [json_name = "pet"];</code>
   * @return Whether the pet field is set.
   */
  boolean hasPet();
  /**
   * <code>.pet.v1.Pet pet = 1 [json_name = "pet"];</code>
   * @return The pet.
   */
  com.pet.v1.Pet getPet();
  /**
   * <code>.pet.v1.Pet pet = 1 [json_name = "pet"];</code>
   */
  com.pet.v1.PetOrBuilder getPetOrBuilder();
}

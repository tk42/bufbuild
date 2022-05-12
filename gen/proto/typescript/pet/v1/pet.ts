// @generated by protobuf-ts 2.5.0
// @generated from protobuf file "pet/v1/pet.proto" (package "pet.v1", syntax proto3)
// tslint:disable
import { ServiceType } from "@protobuf-ts/runtime-rpc";
import { MessageType } from "@protobuf-ts/runtime";
import { DateTime } from "../../google/type/datetime";
/**
 * Pet represents a pet in the pet store.
 *
 * @generated from protobuf message pet.v1.Pet
 */
export interface Pet {
    /**
     * @generated from protobuf field: pet.v1.PetType pet_type = 1;
     */
    petType: PetType;
    /**
     * @generated from protobuf field: string pet_id = 2;
     */
    petId: string;
    /**
     * @generated from protobuf field: string name = 3;
     */
    name: string;
    /**
     * @generated from protobuf field: google.type.DateTime created_at = 4;
     */
    createdAt?: DateTime;
}
/**
 * @generated from protobuf message pet.v1.GetPetRequest
 */
export interface GetPetRequest {
    /**
     * @generated from protobuf field: string pet_id = 1;
     */
    petId: string;
}
/**
 * @generated from protobuf message pet.v1.GetPetResponse
 */
export interface GetPetResponse {
    /**
     * @generated from protobuf field: pet.v1.Pet pet = 1;
     */
    pet?: Pet;
}
/**
 * @generated from protobuf message pet.v1.PutPetRequest
 */
export interface PutPetRequest {
    /**
     * @generated from protobuf field: pet.v1.PetType pet_type = 1;
     */
    petType: PetType;
    /**
     * @generated from protobuf field: string name = 2;
     */
    name: string;
}
/**
 * @generated from protobuf message pet.v1.PutPetResponse
 */
export interface PutPetResponse {
    /**
     * @generated from protobuf field: pet.v1.Pet pet = 1;
     */
    pet?: Pet;
}
/**
 * @generated from protobuf message pet.v1.DeletePetRequest
 */
export interface DeletePetRequest {
    /**
     * @generated from protobuf field: string pet_id = 1;
     */
    petId: string;
}
/**
 * @generated from protobuf message pet.v1.DeletePetResponse
 */
export interface DeletePetResponse {
}
/**
 * PetType represents the different types of pets in the pet store.
 *
 * @generated from protobuf enum pet.v1.PetType
 */
export enum PetType {
    /**
     * @generated from protobuf enum value: PET_TYPE_UNSPECIFIED = 0;
     */
    UNSPECIFIED = 0,
    /**
     * @generated from protobuf enum value: PET_TYPE_CAT = 1;
     */
    CAT = 1,
    /**
     * @generated from protobuf enum value: PET_TYPE_DOG = 2;
     */
    DOG = 2,
    /**
     * @generated from protobuf enum value: PET_TYPE_SNAKE = 3;
     */
    SNAKE = 3,
    /**
     * @generated from protobuf enum value: PET_TYPE_HAMSTER = 4;
     */
    HAMSTER = 4
}
// @generated message type with reflection information, may provide speed optimized methods
class Pet$Type extends MessageType<Pet> {
    constructor() {
        super("pet.v1.Pet", [
            { no: 1, name: "pet_type", kind: "enum", T: () => ["pet.v1.PetType", PetType, "PET_TYPE_"] },
            { no: 2, name: "pet_id", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 3, name: "name", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 4, name: "created_at", kind: "message", T: () => DateTime }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.Pet
 */
export const Pet = new Pet$Type();
// @generated message type with reflection information, may provide speed optimized methods
class GetPetRequest$Type extends MessageType<GetPetRequest> {
    constructor() {
        super("pet.v1.GetPetRequest", [
            { no: 1, name: "pet_id", kind: "scalar", T: 9 /*ScalarType.STRING*/ }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.GetPetRequest
 */
export const GetPetRequest = new GetPetRequest$Type();
// @generated message type with reflection information, may provide speed optimized methods
class GetPetResponse$Type extends MessageType<GetPetResponse> {
    constructor() {
        super("pet.v1.GetPetResponse", [
            { no: 1, name: "pet", kind: "message", T: () => Pet }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.GetPetResponse
 */
export const GetPetResponse = new GetPetResponse$Type();
// @generated message type with reflection information, may provide speed optimized methods
class PutPetRequest$Type extends MessageType<PutPetRequest> {
    constructor() {
        super("pet.v1.PutPetRequest", [
            { no: 1, name: "pet_type", kind: "enum", T: () => ["pet.v1.PetType", PetType, "PET_TYPE_"] },
            { no: 2, name: "name", kind: "scalar", T: 9 /*ScalarType.STRING*/ }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.PutPetRequest
 */
export const PutPetRequest = new PutPetRequest$Type();
// @generated message type with reflection information, may provide speed optimized methods
class PutPetResponse$Type extends MessageType<PutPetResponse> {
    constructor() {
        super("pet.v1.PutPetResponse", [
            { no: 1, name: "pet", kind: "message", T: () => Pet }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.PutPetResponse
 */
export const PutPetResponse = new PutPetResponse$Type();
// @generated message type with reflection information, may provide speed optimized methods
class DeletePetRequest$Type extends MessageType<DeletePetRequest> {
    constructor() {
        super("pet.v1.DeletePetRequest", [
            { no: 1, name: "pet_id", kind: "scalar", T: 9 /*ScalarType.STRING*/ }
        ]);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.DeletePetRequest
 */
export const DeletePetRequest = new DeletePetRequest$Type();
// @generated message type with reflection information, may provide speed optimized methods
class DeletePetResponse$Type extends MessageType<DeletePetResponse> {
    constructor() {
        super("pet.v1.DeletePetResponse", []);
    }
}
/**
 * @generated MessageType for protobuf message pet.v1.DeletePetResponse
 */
export const DeletePetResponse = new DeletePetResponse$Type();
/**
 * @generated ServiceType for protobuf service pet.v1.PetStoreService
 */
export const PetStoreService = new ServiceType("pet.v1.PetStoreService", [
    { name: "GetPet", options: {}, I: GetPetRequest, O: GetPetResponse },
    { name: "PutPet", options: {}, I: PutPetRequest, O: PutPetResponse },
    { name: "DeletePet", options: {}, I: DeletePetRequest, O: DeletePetResponse }
]);

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public final class KmsResourcesProto {
  private KmsResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g" +
      "oogle.cloud.kms.v1\032\034google/api/annotatio" +
      "ns.proto\032\036google/protobuf/duration.proto" +
      "\032\037google/protobuf/timestamp.proto\"H\n\007Key" +
      "Ring\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132" +
      "\032.google.protobuf.Timestamp\"\377\003\n\tCryptoKe" +
      "y\022\014\n\004name\030\001 \001(\t\0226\n\007primary\030\002 \001(\0132%.googl" +
      "e.cloud.kms.v1.CryptoKeyVersion\022@\n\007purpo" +
      "se\030\003 \001(\0162/.google.cloud.kms.v1.CryptoKey" +
      ".CryptoKeyPurpose\022/\n\013create_time\030\005 \001(\0132\032" +
      ".google.protobuf.Timestamp\0226\n\022next_rotat" +
      "ion_time\030\007 \001(\0132\032.google.protobuf.Timesta" +
      "mp\0224\n\017rotation_period\030\010 \001(\0132\031.google.pro" +
      "tobuf.DurationH\000\022:\n\006labels\030\n \003(\0132*.googl" +
      "e.cloud.kms.v1.CryptoKey.LabelsEntry\032-\n\013" +
      "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001\"K\n\020CryptoKeyPurpose\022\"\n\036CRYPTO_KEY_PU" +
      "RPOSE_UNSPECIFIED\020\000\022\023\n\017ENCRYPT_DECRYPT\020\001" +
      "B\023\n\021rotation_schedule\"\214\003\n\020CryptoKeyVersi" +
      "on\022\014\n\004name\030\001 \001(\t\022J\n\005state\030\003 \001(\0162;.google" +
      ".cloud.kms.v1.CryptoKeyVersion.CryptoKey" +
      "VersionState\022/\n\013create_time\030\004 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\0220\n\014destroy_time\030\005 " +
      "\001(\0132\032.google.protobuf.Timestamp\0226\n\022destr" +
      "oy_event_time\030\006 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\"\202\001\n\025CryptoKeyVersionState\022(\n$CRY" +
      "PTO_KEY_VERSION_STATE_UNSPECIFIED\020\000\022\013\n\007E" +
      "NABLED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROYED\020\003\022\025\n" +
      "\021DESTROY_SCHEDULED\020\004B\225\001\n\027com.google.clou" +
      "d.kms.v1B\021KmsResourcesProtoP\001Z6google.go" +
      "lang.org/genproto/googleapis/cloud/kms/v" +
      "1;kms\370\001\001\252\002\023Google.Cloud.Kms.V1\312\002\023Google\\" +
      "Cloud\\Kms\\V1b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_KeyRing_descriptor,
        new java.lang.String[] { "Name", "CreateTime", });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
        new java.lang.String[] { "Name", "Primary", "Purpose", "CreateTime", "NextRotationTime", "RotationPeriod", "Labels", "RotationSchedule", });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
        new java.lang.String[] { "Name", "State", "CreateTime", "DestroyTime", "DestroyEventTime", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

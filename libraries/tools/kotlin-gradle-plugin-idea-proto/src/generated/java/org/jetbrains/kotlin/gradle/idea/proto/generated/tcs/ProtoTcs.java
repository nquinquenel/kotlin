// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_tcs.proto

package org.jetbrains.kotlin.gradle.idea.proto.generated.tcs;

public final class ProtoTcs {
  private ProtoTcs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinDependencyProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinDependencyProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceDependencyProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceDependencyProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinUnresolvedBinaryDependencyProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinUnresolvedBinaryDependencyProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinResolvedBinaryDependencyProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinResolvedBinaryDependencyProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinClasspathProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinClasspathProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectArtifactDependencyProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectArtifactDependencyProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectCoordinatesProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectCoordinatesProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinBinaryCoordinatesProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinBinaryCoordinatesProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceCoordinatesProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceCoordinatesProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017proto_tcs.proto\0224org.jetbrains.kotlin." +
      "gradle.idea.proto.generated.tcs\032\022proto_e" +
      "xtras.proto\"\265\004\n\031IdeaKotlinDependencyProt" +
      "o\022r\n\021source_dependency\030\001 \001(\0132U.org.jetbr" +
      "ains.kotlin.gradle.idea.proto.generated." +
      "tcs.IdeaKotlinSourceDependencyProtoH\000\022\203\001" +
      "\n\032resolved_binary_dependency\030\002 \001(\0132].org" +
      ".jetbrains.kotlin.gradle.idea.proto.gene" +
      "rated.tcs.IdeaKotlinResolvedBinaryDepend" +
      "encyProtoH\000\022\207\001\n\034unresolved_binary_depend" +
      "ency\030\003 \001(\0132_.org.jetbrains.kotlin.gradle" +
      ".idea.proto.generated.tcs.IdeaKotlinUnre" +
      "solvedBinaryDependencyProtoH\000\022\205\001\n\033projec" +
      "t_artifact_dependency\030\004 \001(\0132^.org.jetbra" +
      "ins.kotlin.gradle.idea.proto.generated.t" +
      "cs.IdeaKotlinProjectArtifactDependencyPr" +
      "otoH\000B\014\n\ndependency\"\257\003\n\037IdeaKotlinSource" +
      "DependencyProto\022V\n\006extras\030\001 \001(\0132A.org.je" +
      "tbrains.kotlin.gradle.idea.proto.generat" +
      "ed.IdeaExtrasProtoH\000\210\001\001\022m\n\004type\030\002 \001(\0162Z." +
      "org.jetbrains.kotlin.gradle.idea.proto.g" +
      "enerated.tcs.IdeaKotlinSourceDependencyP" +
      "roto.TypeH\001\210\001\001\022p\n\013coordinates\030\003 \001(\0132V.or" +
      "g.jetbrains.kotlin.gradle.idea.proto.gen" +
      "erated.tcs.IdeaKotlinSourceCoordinatesPr" +
      "otoH\002\210\001\001\"/\n\004Type\022\013\n\007REGULAR\020\000\022\n\n\006FRIEND\020" +
      "\001\022\016\n\nDEPENDS_ON\020\002B\t\n\007_extrasB\007\n\005_typeB\016\n" +
      "\014_coordinates\"\256\002\n)IdeaKotlinUnresolvedBi" +
      "naryDependencyProto\022V\n\006extras\030\001 \001(\0132A.or" +
      "g.jetbrains.kotlin.gradle.idea.proto.gen" +
      "erated.IdeaExtrasProtoH\000\210\001\001\022p\n\013coordinat" +
      "es\030\002 \001(\0132V.org.jetbrains.kotlin.gradle.i" +
      "dea.proto.generated.tcs.IdeaKotlinBinary" +
      "CoordinatesProtoH\001\210\001\001\022\022\n\005cause\030\003 \001(\tH\002\210\001" +
      "\001B\t\n\007_extrasB\016\n\014_coordinatesB\010\n\006_cause\"\256" +
      "\003\n\'IdeaKotlinResolvedBinaryDependencyPro" +
      "to\022V\n\006extras\030\001 \001(\0132A.org.jetbrains.kotli" +
      "n.gradle.idea.proto.generated.IdeaExtras" +
      "ProtoH\000\210\001\001\022p\n\013coordinates\030\002 \001(\0132V.org.je" +
      "tbrains.kotlin.gradle.idea.proto.generat" +
      "ed.tcs.IdeaKotlinBinaryCoordinatesProtoH" +
      "\001\210\001\001\022\030\n\013binary_type\030\003 \001(\tH\002\210\001\001\022f\n\tclassp" +
      "ath\030\004 \001(\0132N.org.jetbrains.kotlin.gradle." +
      "idea.proto.generated.tcs.IdeaKotlinClass" +
      "pathProtoH\003\210\001\001B\t\n\007_extrasB\016\n\014_coordinate" +
      "sB\016\n\014_binary_typeB\014\n\n_classpath\")\n\030IdeaK" +
      "otlinClasspathProto\022\r\n\005files\030\001 \003(\t\"\210\003\n(I" +
      "deaKotlinProjectArtifactDependencyProto\022" +
      "V\n\006extras\030\001 \001(\0132A.org.jetbrains.kotlin.g" +
      "radle.idea.proto.generated.IdeaExtrasPro" +
      "toH\000\210\001\001\022m\n\004type\030\002 \001(\0162Z.org.jetbrains.ko" +
      "tlin.gradle.idea.proto.generated.tcs.Ide" +
      "aKotlinSourceDependencyProto.TypeH\001\210\001\001\022q" +
      "\n\013coordinates\030\003 \001(\0132W.org.jetbrains.kotl" +
      "in.gradle.idea.proto.generated.tcs.IdeaK" +
      "otlinProjectCoordinatesProtoH\002\210\001\001B\t\n\007_ex" +
      "trasB\007\n\005_typeB\016\n\014_coordinates\"\237\001\n!IdeaKo" +
      "tlinProjectCoordinatesProto\022\025\n\010build_id\030" +
      "\001 \001(\tH\000\210\001\001\022\031\n\014project_path\030\002 \001(\tH\001\210\001\001\022\031\n" +
      "\014project_name\030\003 \001(\tH\002\210\001\001B\013\n\t_build_idB\017\n" +
      "\r_project_pathB\017\n\r_project_name\"\264\001\n Idea" +
      "KotlinBinaryCoordinatesProto\022\022\n\005group\030\001 " +
      "\001(\tH\000\210\001\001\022\023\n\006module\030\002 \001(\tH\001\210\001\001\022\024\n\007version" +
      "\030\003 \001(\tH\002\210\001\001\022\034\n\017source_set_name\030\004 \001(\tH\003\210\001" +
      "\001B\010\n\006_groupB\t\n\007_moduleB\n\n\010_versionB\022\n\020_s" +
      "ource_set_name\"\317\001\n IdeaKotlinSourceCoord" +
      "inatesProto\022m\n\007project\030\001 \001(\0132W.org.jetbr" +
      "ains.kotlin.gradle.idea.proto.generated." +
      "tcs.IdeaKotlinProjectCoordinatesProtoH\000\210" +
      "\001\001\022\034\n\017source_set_name\030\002 \001(\tH\001\210\001\001B\n\n\010_pro" +
      "jectB\022\n\020_source_set_nameB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.jetbrains.kotlin.gradle.idea.proto.generated.ProtoExtras.getDescriptor(),
        });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinDependencyProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinDependencyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinDependencyProto_descriptor,
        new java.lang.String[] { "SourceDependency", "ResolvedBinaryDependency", "UnresolvedBinaryDependency", "ProjectArtifactDependency", "Dependency", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceDependencyProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceDependencyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceDependencyProto_descriptor,
        new java.lang.String[] { "Extras", "Type", "Coordinates", "Extras", "Type", "Coordinates", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinUnresolvedBinaryDependencyProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinUnresolvedBinaryDependencyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinUnresolvedBinaryDependencyProto_descriptor,
        new java.lang.String[] { "Extras", "Coordinates", "Cause", "Extras", "Coordinates", "Cause", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinResolvedBinaryDependencyProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinResolvedBinaryDependencyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinResolvedBinaryDependencyProto_descriptor,
        new java.lang.String[] { "Extras", "Coordinates", "BinaryType", "Classpath", "Extras", "Coordinates", "BinaryType", "Classpath", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinClasspathProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinClasspathProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinClasspathProto_descriptor,
        new java.lang.String[] { "Files", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectArtifactDependencyProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectArtifactDependencyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectArtifactDependencyProto_descriptor,
        new java.lang.String[] { "Extras", "Type", "Coordinates", "Extras", "Type", "Coordinates", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectCoordinatesProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectCoordinatesProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinProjectCoordinatesProto_descriptor,
        new java.lang.String[] { "BuildId", "ProjectPath", "ProjectName", "BuildId", "ProjectPath", "ProjectName", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinBinaryCoordinatesProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinBinaryCoordinatesProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinBinaryCoordinatesProto_descriptor,
        new java.lang.String[] { "Group", "Module", "Version", "SourceSetName", "Group", "Module", "Version", "SourceSetName", });
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceCoordinatesProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceCoordinatesProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_tcs_IdeaKotlinSourceCoordinatesProto_descriptor,
        new java.lang.String[] { "Project", "SourceSetName", "Project", "SourceSetName", });
    org.jetbrains.kotlin.gradle.idea.proto.generated.ProtoExtras.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

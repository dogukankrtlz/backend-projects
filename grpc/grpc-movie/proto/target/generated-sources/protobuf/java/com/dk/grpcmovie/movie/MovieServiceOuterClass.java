// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

public final class MovieServiceOuterClass {
  private MovieServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MovieDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MovieDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MovieSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MovieSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllMovieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMovieResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023movie-service.proto\032\023common/common.pro" +
      "to\"e\n\010MovieDto\022\n\n\002id\030\001 \001(\005\022\r\n\005title\030\002 \001(" +
      "\t\022\020\n\010rel_year\030\003 \001(\005\022\016\n\006rating\030\004 \001(\001\022\034\n\005g" +
      "enre\030\005 \001(\0162\r.common.Genre\"2\n\022MovieSearch" +
      "Request\022\034\n\005genre\030\001 \001(\0162\r.common.Genre\"m\n" +
      "\020SaveMovieRequest\022\n\n\002id\030\001 \001(\005\022\r\n\005title\030\002" +
      " \001(\t\022\020\n\010rel_year\030\003 \001(\005\022\016\n\006rating\030\004 \001(\001\022\034" +
      "\n\005genre\030\005 \001(\0162\r.common.Genre\",\n\020AllMovie" +
      "Response\022\030\n\005movie\030\001 \003(\0132\t.MovieDto\"b\n\020Ge" +
      "tMovieResponse\022\032\n\005movie\030\001 \001(\0132\t.MovieDto" +
      "H\000\022 \n\006status\030\002 \001(\0132\016.common.StatusH\000B\020\n\016" +
      "movie_response2v\n\014MovieService\0223\n\tgetMov" +
      "ies\022\023.MovieSearchRequest\032\021.AllMovieRespo" +
      "nse\0221\n\tsaveMovie\022\021.SaveMovieRequest\032\021.Ge" +
      "tMovieResponseB\032\n\026com.dk.grpcmovie.movie" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dk.grpcmovie.common.Common.getDescriptor(),
        });
    internal_static_MovieDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MovieDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MovieDto_descriptor,
        new java.lang.String[] { "Id", "Title", "RelYear", "Rating", "Genre", });
    internal_static_MovieSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MovieSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MovieSearchRequest_descriptor,
        new java.lang.String[] { "Genre", });
    internal_static_SaveMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SaveMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveMovieRequest_descriptor,
        new java.lang.String[] { "Id", "Title", "RelYear", "Rating", "Genre", });
    internal_static_AllMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AllMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllMovieResponse_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_GetMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMovieResponse_descriptor,
        new java.lang.String[] { "Movie", "Status", "MovieResponse", });
    com.dk.grpcmovie.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
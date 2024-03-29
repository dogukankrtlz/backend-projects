// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

public interface MovieDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MovieDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>int32 rel_year = 3;</code>
   * @return The relYear.
   */
  int getRelYear();

  /**
   * <code>double rating = 4;</code>
   * @return The rating.
   */
  double getRating();

  /**
   * <code>.common.Genre genre = 5;</code>
   * @return The enum numeric value on the wire for genre.
   */
  int getGenreValue();
  /**
   * <code>.common.Genre genre = 5;</code>
   * @return The genre.
   */
  com.dk.grpcmovie.common.Genre getGenre();

  /**
   * <code>string image_url = 6;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <code>string image_url = 6;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <code>string summary = 7;</code>
   * @return The summary.
   */
  java.lang.String getSummary();
  /**
   * <code>string summary = 7;</code>
   * @return The bytes for summary.
   */
  com.google.protobuf.ByteString
      getSummaryBytes();
}

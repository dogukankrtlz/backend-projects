// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

public interface AllMovieResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AllMovieResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  java.util.List<com.dk.grpcmovie.movie.MovieDto> 
      getMovieList();
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  com.dk.grpcmovie.movie.MovieDto getMovie(int index);
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  int getMovieCount();
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  java.util.List<? extends com.dk.grpcmovie.movie.MovieDtoOrBuilder> 
      getMovieOrBuilderList();
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  com.dk.grpcmovie.movie.MovieDtoOrBuilder getMovieOrBuilder(
      int index);
}

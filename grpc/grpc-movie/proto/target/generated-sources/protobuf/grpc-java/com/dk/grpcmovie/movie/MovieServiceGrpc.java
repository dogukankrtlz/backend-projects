package com.dk.grpcmovie.movie;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: movie-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final String SERVICE_NAME = "MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.MovieSearchRequest,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovies",
      requestType = com.dk.grpcmovie.movie.MovieSearchRequest.class,
      responseType = com.dk.grpcmovie.movie.AllMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.MovieSearchRequest,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.MovieSearchRequest, com.dk.grpcmovie.movie.AllMovieResponse> getGetMoviesMethod;
    if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
          MovieServiceGrpc.getGetMoviesMethod = getGetMoviesMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.MovieSearchRequest, com.dk.grpcmovie.movie.AllMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.MovieSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AllMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getMovies"))
              .build();
        }
      }
    }
    return getGetMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.Empty,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetAllMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllMovies",
      requestType = com.dk.grpcmovie.movie.Empty.class,
      responseType = com.dk.grpcmovie.movie.AllMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.Empty,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetAllMoviesMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.Empty, com.dk.grpcmovie.movie.AllMovieResponse> getGetAllMoviesMethod;
    if ((getGetAllMoviesMethod = MovieServiceGrpc.getGetAllMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetAllMoviesMethod = MovieServiceGrpc.getGetAllMoviesMethod) == null) {
          MovieServiceGrpc.getGetAllMoviesMethod = getGetAllMoviesMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.Empty, com.dk.grpcmovie.movie.AllMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AllMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getAllMovies"))
              .build();
        }
      }
    }
    return getGetAllMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SaveMovieRequest,
      com.dk.grpcmovie.movie.GetMovieResponse> getSaveMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveMovie",
      requestType = com.dk.grpcmovie.movie.SaveMovieRequest.class,
      responseType = com.dk.grpcmovie.movie.GetMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SaveMovieRequest,
      com.dk.grpcmovie.movie.GetMovieResponse> getSaveMovieMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SaveMovieRequest, com.dk.grpcmovie.movie.GetMovieResponse> getSaveMovieMethod;
    if ((getSaveMovieMethod = MovieServiceGrpc.getSaveMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSaveMovieMethod = MovieServiceGrpc.getSaveMovieMethod) == null) {
          MovieServiceGrpc.getSaveMovieMethod = getSaveMovieMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.SaveMovieRequest, com.dk.grpcmovie.movie.GetMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.SaveMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("saveMovie"))
              .build();
        }
      }
    }
    return getSaveMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest,
      com.dk.grpcmovie.movie.AllFavResponse> getGetAllFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFavorite",
      requestType = com.dk.grpcmovie.movie.FavSearchRequest.class,
      responseType = com.dk.grpcmovie.movie.AllFavResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest,
      com.dk.grpcmovie.movie.AllFavResponse> getGetAllFavoriteMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest, com.dk.grpcmovie.movie.AllFavResponse> getGetAllFavoriteMethod;
    if ((getGetAllFavoriteMethod = MovieServiceGrpc.getGetAllFavoriteMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetAllFavoriteMethod = MovieServiceGrpc.getGetAllFavoriteMethod) == null) {
          MovieServiceGrpc.getGetAllFavoriteMethod = getGetAllFavoriteMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.FavSearchRequest, com.dk.grpcmovie.movie.AllFavResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.FavSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AllFavResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getAllFavorite"))
              .build();
        }
      }
    }
    return getGetAllFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSaveRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getSaveFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveFavorite",
      requestType = com.dk.grpcmovie.movie.FavSaveRequest.class,
      responseType = com.dk.grpcmovie.movie.GetFavResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSaveRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getSaveFavoriteMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSaveRequest, com.dk.grpcmovie.movie.GetFavResponse> getSaveFavoriteMethod;
    if ((getSaveFavoriteMethod = MovieServiceGrpc.getSaveFavoriteMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSaveFavoriteMethod = MovieServiceGrpc.getSaveFavoriteMethod) == null) {
          MovieServiceGrpc.getSaveFavoriteMethod = getSaveFavoriteMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.FavSaveRequest, com.dk.grpcmovie.movie.GetFavResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.FavSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetFavResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("saveFavorite"))
              .build();
        }
      }
    }
    return getSaveFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavDeleteRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFavorite",
      requestType = com.dk.grpcmovie.movie.FavDeleteRequest.class,
      responseType = com.dk.grpcmovie.movie.GetFavResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavDeleteRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavoriteMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavDeleteRequest, com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavoriteMethod;
    if ((getDeleteFavoriteMethod = MovieServiceGrpc.getDeleteFavoriteMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getDeleteFavoriteMethod = MovieServiceGrpc.getDeleteFavoriteMethod) == null) {
          MovieServiceGrpc.getDeleteFavoriteMethod = getDeleteFavoriteMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.FavDeleteRequest, com.dk.grpcmovie.movie.GetFavResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.FavDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetFavResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("deleteFavorite"))
              .build();
        }
      }
    }
    return getDeleteFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetALLFavMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getALLFavMovies",
      requestType = com.dk.grpcmovie.movie.FavSearchRequest.class,
      responseType = com.dk.grpcmovie.movie.AllMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest,
      com.dk.grpcmovie.movie.AllMovieResponse> getGetALLFavMoviesMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavSearchRequest, com.dk.grpcmovie.movie.AllMovieResponse> getGetALLFavMoviesMethod;
    if ((getGetALLFavMoviesMethod = MovieServiceGrpc.getGetALLFavMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetALLFavMoviesMethod = MovieServiceGrpc.getGetALLFavMoviesMethod) == null) {
          MovieServiceGrpc.getGetALLFavMoviesMethod = getGetALLFavMoviesMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.FavSearchRequest, com.dk.grpcmovie.movie.AllMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getALLFavMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.FavSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AllMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getALLFavMovies"))
              .build();
        }
      }
    }
    return getGetALLFavMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SingleFavSearchRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getGetFavMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFavMovie",
      requestType = com.dk.grpcmovie.movie.SingleFavSearchRequest.class,
      responseType = com.dk.grpcmovie.movie.GetFavResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SingleFavSearchRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getGetFavMovieMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.SingleFavSearchRequest, com.dk.grpcmovie.movie.GetFavResponse> getGetFavMovieMethod;
    if ((getGetFavMovieMethod = MovieServiceGrpc.getGetFavMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetFavMovieMethod = MovieServiceGrpc.getGetFavMovieMethod) == null) {
          MovieServiceGrpc.getGetFavMovieMethod = getGetFavMovieMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.SingleFavSearchRequest, com.dk.grpcmovie.movie.GetFavResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFavMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.SingleFavSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetFavResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getFavMovie"))
              .build();
        }
      }
    }
    return getGetFavMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavMovieDeleteRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFavMovie",
      requestType = com.dk.grpcmovie.movie.FavMovieDeleteRequest.class,
      responseType = com.dk.grpcmovie.movie.GetFavResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavMovieDeleteRequest,
      com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavMovieMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.FavMovieDeleteRequest, com.dk.grpcmovie.movie.GetFavResponse> getDeleteFavMovieMethod;
    if ((getDeleteFavMovieMethod = MovieServiceGrpc.getDeleteFavMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getDeleteFavMovieMethod = MovieServiceGrpc.getDeleteFavMovieMethod) == null) {
          MovieServiceGrpc.getDeleteFavMovieMethod = getDeleteFavMovieMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.FavMovieDeleteRequest, com.dk.grpcmovie.movie.GetFavResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFavMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.FavMovieDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetFavResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("deleteFavMovie"))
              .build();
        }
      }
    }
    return getDeleteFavMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.AddCommentRequest,
      com.dk.grpcmovie.movie.CommentResponse> getAddCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addComment",
      requestType = com.dk.grpcmovie.movie.AddCommentRequest.class,
      responseType = com.dk.grpcmovie.movie.CommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.AddCommentRequest,
      com.dk.grpcmovie.movie.CommentResponse> getAddCommentMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.AddCommentRequest, com.dk.grpcmovie.movie.CommentResponse> getAddCommentMethod;
    if ((getAddCommentMethod = MovieServiceGrpc.getAddCommentMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getAddCommentMethod = MovieServiceGrpc.getAddCommentMethod) == null) {
          MovieServiceGrpc.getAddCommentMethod = getAddCommentMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.AddCommentRequest, com.dk.grpcmovie.movie.CommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AddCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.CommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("addComment"))
              .build();
        }
      }
    }
    return getAddCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.GetCommentsRequest,
      com.dk.grpcmovie.movie.AllCommentResponse> getGetCommentsForMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCommentsForMovie",
      requestType = com.dk.grpcmovie.movie.GetCommentsRequest.class,
      responseType = com.dk.grpcmovie.movie.AllCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.GetCommentsRequest,
      com.dk.grpcmovie.movie.AllCommentResponse> getGetCommentsForMovieMethod() {
    io.grpc.MethodDescriptor<com.dk.grpcmovie.movie.GetCommentsRequest, com.dk.grpcmovie.movie.AllCommentResponse> getGetCommentsForMovieMethod;
    if ((getGetCommentsForMovieMethod = MovieServiceGrpc.getGetCommentsForMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetCommentsForMovieMethod = MovieServiceGrpc.getGetCommentsForMovieMethod) == null) {
          MovieServiceGrpc.getGetCommentsForMovieMethod = getGetCommentsForMovieMethod =
              io.grpc.MethodDescriptor.<com.dk.grpcmovie.movie.GetCommentsRequest, com.dk.grpcmovie.movie.AllCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCommentsForMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.GetCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dk.grpcmovie.movie.AllCommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getCommentsForMovie"))
              .build();
        }
      }
    }
    return getGetCommentsForMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {
        @java.lang.Override
        public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceStub(channel, callOptions);
        }
      };
    return MovieServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {
        @java.lang.Override
        public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceBlockingStub(channel, callOptions);
        }
      };
    return MovieServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {
        @java.lang.Override
        public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceFutureStub(channel, callOptions);
        }
      };
    return MovieServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MovieServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMovies(com.dk.grpcmovie.movie.MovieSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }

    /**
     */
    public void getAllMovies(com.dk.grpcmovie.movie.Empty request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMoviesMethod(), responseObserver);
    }

    /**
     */
    public void saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMovieMethod(), responseObserver);
    }

    /**
     */
    public void getAllFavorite(com.dk.grpcmovie.movie.FavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllFavResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void saveFavorite(com.dk.grpcmovie.movie.FavSaveRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void deleteFavorite(com.dk.grpcmovie.movie.FavDeleteRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void getALLFavMovies(com.dk.grpcmovie.movie.FavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetALLFavMoviesMethod(), responseObserver);
    }

    /**
     */
    public void getFavMovie(com.dk.grpcmovie.movie.SingleFavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFavMovieMethod(), responseObserver);
    }

    /**
     */
    public void deleteFavMovie(com.dk.grpcmovie.movie.FavMovieDeleteRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFavMovieMethod(), responseObserver);
    }

    /**
     */
    public void addComment(com.dk.grpcmovie.movie.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.CommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc deleteComment() returns(CommentResponse);
     * rpc updateComment() returns(CommentResponse);
     * </pre>
     */
    public void getCommentsForMovie(com.dk.grpcmovie.movie.GetCommentsRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllCommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentsForMovieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMoviesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.MovieSearchRequest,
                com.dk.grpcmovie.movie.AllMovieResponse>(
                  this, METHODID_GET_MOVIES)))
          .addMethod(
            getGetAllMoviesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.Empty,
                com.dk.grpcmovie.movie.AllMovieResponse>(
                  this, METHODID_GET_ALL_MOVIES)))
          .addMethod(
            getSaveMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.SaveMovieRequest,
                com.dk.grpcmovie.movie.GetMovieResponse>(
                  this, METHODID_SAVE_MOVIE)))
          .addMethod(
            getGetAllFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.FavSearchRequest,
                com.dk.grpcmovie.movie.AllFavResponse>(
                  this, METHODID_GET_ALL_FAVORITE)))
          .addMethod(
            getSaveFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.FavSaveRequest,
                com.dk.grpcmovie.movie.GetFavResponse>(
                  this, METHODID_SAVE_FAVORITE)))
          .addMethod(
            getDeleteFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.FavDeleteRequest,
                com.dk.grpcmovie.movie.GetFavResponse>(
                  this, METHODID_DELETE_FAVORITE)))
          .addMethod(
            getGetALLFavMoviesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.FavSearchRequest,
                com.dk.grpcmovie.movie.AllMovieResponse>(
                  this, METHODID_GET_ALLFAV_MOVIES)))
          .addMethod(
            getGetFavMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.SingleFavSearchRequest,
                com.dk.grpcmovie.movie.GetFavResponse>(
                  this, METHODID_GET_FAV_MOVIE)))
          .addMethod(
            getDeleteFavMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.FavMovieDeleteRequest,
                com.dk.grpcmovie.movie.GetFavResponse>(
                  this, METHODID_DELETE_FAV_MOVIE)))
          .addMethod(
            getAddCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.AddCommentRequest,
                com.dk.grpcmovie.movie.CommentResponse>(
                  this, METHODID_ADD_COMMENT)))
          .addMethod(
            getGetCommentsForMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.GetCommentsRequest,
                com.dk.grpcmovie.movie.AllCommentResponse>(
                  this, METHODID_GET_COMMENTS_FOR_MOVIE)))
          .build();
    }
  }

  /**
   */
  public static final class MovieServiceStub extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {
    private MovieServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMovies(com.dk.grpcmovie.movie.MovieSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllMovies(com.dk.grpcmovie.movie.Empty request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFavorite(com.dk.grpcmovie.movie.FavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllFavResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveFavorite(com.dk.grpcmovie.movie.FavSaveRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFavorite(com.dk.grpcmovie.movie.FavDeleteRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getALLFavMovies(com.dk.grpcmovie.movie.FavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetALLFavMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFavMovie(com.dk.grpcmovie.movie.SingleFavSearchRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFavMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFavMovie(com.dk.grpcmovie.movie.FavMovieDeleteRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFavMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addComment(com.dk.grpcmovie.movie.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.CommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc deleteComment() returns(CommentResponse);
     * rpc updateComment() returns(CommentResponse);
     * </pre>
     */
    public void getCommentsForMovie(com.dk.grpcmovie.movie.GetCommentsRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllCommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCommentsForMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MovieServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dk.grpcmovie.movie.AllMovieResponse getMovies(com.dk.grpcmovie.movie.MovieSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.AllMovieResponse getAllMovies(com.dk.grpcmovie.movie.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.GetMovieResponse saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.AllFavResponse getAllFavorite(com.dk.grpcmovie.movie.FavSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.GetFavResponse saveFavorite(com.dk.grpcmovie.movie.FavSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.GetFavResponse deleteFavorite(com.dk.grpcmovie.movie.FavDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.AllMovieResponse getALLFavMovies(com.dk.grpcmovie.movie.FavSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetALLFavMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.GetFavResponse getFavMovie(com.dk.grpcmovie.movie.SingleFavSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFavMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.GetFavResponse deleteFavMovie(com.dk.grpcmovie.movie.FavMovieDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFavMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dk.grpcmovie.movie.CommentResponse addComment(com.dk.grpcmovie.movie.AddCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc deleteComment() returns(CommentResponse);
     * rpc updateComment() returns(CommentResponse);
     * </pre>
     */
    public com.dk.grpcmovie.movie.AllCommentResponse getCommentsForMovie(com.dk.grpcmovie.movie.GetCommentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCommentsForMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovieServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.AllMovieResponse> getMovies(
        com.dk.grpcmovie.movie.MovieSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.AllMovieResponse> getAllMovies(
        com.dk.grpcmovie.movie.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetMovieResponse> saveMovie(
        com.dk.grpcmovie.movie.SaveMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.AllFavResponse> getAllFavorite(
        com.dk.grpcmovie.movie.FavSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetFavResponse> saveFavorite(
        com.dk.grpcmovie.movie.FavSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetFavResponse> deleteFavorite(
        com.dk.grpcmovie.movie.FavDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.AllMovieResponse> getALLFavMovies(
        com.dk.grpcmovie.movie.FavSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetALLFavMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetFavResponse> getFavMovie(
        com.dk.grpcmovie.movie.SingleFavSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFavMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetFavResponse> deleteFavMovie(
        com.dk.grpcmovie.movie.FavMovieDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFavMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.CommentResponse> addComment(
        com.dk.grpcmovie.movie.AddCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc deleteComment() returns(CommentResponse);
     * rpc updateComment() returns(CommentResponse);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.AllCommentResponse> getCommentsForMovie(
        com.dk.grpcmovie.movie.GetCommentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCommentsForMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIES = 0;
  private static final int METHODID_GET_ALL_MOVIES = 1;
  private static final int METHODID_SAVE_MOVIE = 2;
  private static final int METHODID_GET_ALL_FAVORITE = 3;
  private static final int METHODID_SAVE_FAVORITE = 4;
  private static final int METHODID_DELETE_FAVORITE = 5;
  private static final int METHODID_GET_ALLFAV_MOVIES = 6;
  private static final int METHODID_GET_FAV_MOVIE = 7;
  private static final int METHODID_DELETE_FAV_MOVIE = 8;
  private static final int METHODID_ADD_COMMENT = 9;
  private static final int METHODID_GET_COMMENTS_FOR_MOVIE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((com.dk.grpcmovie.movie.MovieSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MOVIES:
          serviceImpl.getAllMovies((com.dk.grpcmovie.movie.Empty) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse>) responseObserver);
          break;
        case METHODID_SAVE_MOVIE:
          serviceImpl.saveMovie((com.dk.grpcmovie.movie.SaveMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FAVORITE:
          serviceImpl.getAllFavorite((com.dk.grpcmovie.movie.FavSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllFavResponse>) responseObserver);
          break;
        case METHODID_SAVE_FAVORITE:
          serviceImpl.saveFavorite((com.dk.grpcmovie.movie.FavSaveRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse>) responseObserver);
          break;
        case METHODID_DELETE_FAVORITE:
          serviceImpl.deleteFavorite((com.dk.grpcmovie.movie.FavDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse>) responseObserver);
          break;
        case METHODID_GET_ALLFAV_MOVIES:
          serviceImpl.getALLFavMovies((com.dk.grpcmovie.movie.FavSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllMovieResponse>) responseObserver);
          break;
        case METHODID_GET_FAV_MOVIE:
          serviceImpl.getFavMovie((com.dk.grpcmovie.movie.SingleFavSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse>) responseObserver);
          break;
        case METHODID_DELETE_FAV_MOVIE:
          serviceImpl.deleteFavMovie((com.dk.grpcmovie.movie.FavMovieDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetFavResponse>) responseObserver);
          break;
        case METHODID_ADD_COMMENT:
          serviceImpl.addComment((com.dk.grpcmovie.movie.AddCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.CommentResponse>) responseObserver);
          break;
        case METHODID_GET_COMMENTS_FOR_MOVIE:
          serviceImpl.getCommentsForMovie((com.dk.grpcmovie.movie.GetCommentsRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.AllCommentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getGetMoviesMethod())
              .addMethod(getGetAllMoviesMethod())
              .addMethod(getSaveMovieMethod())
              .addMethod(getGetAllFavoriteMethod())
              .addMethod(getSaveFavoriteMethod())
              .addMethod(getDeleteFavoriteMethod())
              .addMethod(getGetALLFavMoviesMethod())
              .addMethod(getGetFavMovieMethod())
              .addMethod(getDeleteFavMovieMethod())
              .addMethod(getAddCommentMethod())
              .addMethod(getGetCommentsForMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}

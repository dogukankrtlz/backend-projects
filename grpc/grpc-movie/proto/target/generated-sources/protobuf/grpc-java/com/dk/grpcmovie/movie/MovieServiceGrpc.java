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
    public void saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMovieMethod(), responseObserver);
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
            getSaveMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dk.grpcmovie.movie.SaveMovieRequest,
                com.dk.grpcmovie.movie.GetMovieResponse>(
                  this, METHODID_SAVE_MOVIE)))
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
    public void saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request,
        io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMovieMethod(), getCallOptions()), request, responseObserver);
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
    public com.dk.grpcmovie.movie.GetMovieResponse saveMovie(com.dk.grpcmovie.movie.SaveMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMovieMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dk.grpcmovie.movie.GetMovieResponse> saveMovie(
        com.dk.grpcmovie.movie.SaveMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIES = 0;
  private static final int METHODID_SAVE_MOVIE = 1;

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
        case METHODID_SAVE_MOVIE:
          serviceImpl.saveMovie((com.dk.grpcmovie.movie.SaveMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.dk.grpcmovie.movie.GetMovieResponse>) responseObserver);
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
              .addMethod(getSaveMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}

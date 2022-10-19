// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code SingleFavSearchRequest}
 */
public final class SingleFavSearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SingleFavSearchRequest)
    SingleFavSearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleFavSearchRequest.newBuilder() to construct.
  private SingleFavSearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleFavSearchRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleFavSearchRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleFavSearchRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userId_ = input.readInt32();
            break;
          }
          case 16: {

            movieId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_SingleFavSearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_SingleFavSearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.SingleFavSearchRequest.class, com.dk.grpcmovie.movie.SingleFavSearchRequest.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private int userId_;
  /**
   * <code>int32 userId = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int MOVIEID_FIELD_NUMBER = 2;
  private int movieId_;
  /**
   * <code>int32 movieId = 2;</code>
   * @return The movieId.
   */
  @java.lang.Override
  public int getMovieId() {
    return movieId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (movieId_ != 0) {
      output.writeInt32(2, movieId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    if (movieId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, movieId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.dk.grpcmovie.movie.SingleFavSearchRequest)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.SingleFavSearchRequest other = (com.dk.grpcmovie.movie.SingleFavSearchRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getMovieId()
        != other.getMovieId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + MOVIEID_FIELD_NUMBER;
    hash = (53 * hash) + getMovieId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.SingleFavSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dk.grpcmovie.movie.SingleFavSearchRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SingleFavSearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SingleFavSearchRequest)
      com.dk.grpcmovie.movie.SingleFavSearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_SingleFavSearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_SingleFavSearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.SingleFavSearchRequest.class, com.dk.grpcmovie.movie.SingleFavSearchRequest.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.SingleFavSearchRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = 0;

      movieId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_SingleFavSearchRequest_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.SingleFavSearchRequest getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.SingleFavSearchRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.SingleFavSearchRequest build() {
      com.dk.grpcmovie.movie.SingleFavSearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.SingleFavSearchRequest buildPartial() {
      com.dk.grpcmovie.movie.SingleFavSearchRequest result = new com.dk.grpcmovie.movie.SingleFavSearchRequest(this);
      result.userId_ = userId_;
      result.movieId_ = movieId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dk.grpcmovie.movie.SingleFavSearchRequest) {
        return mergeFrom((com.dk.grpcmovie.movie.SingleFavSearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.SingleFavSearchRequest other) {
      if (other == com.dk.grpcmovie.movie.SingleFavSearchRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getMovieId() != 0) {
        setMovieId(other.getMovieId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.dk.grpcmovie.movie.SingleFavSearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.SingleFavSearchRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 userId = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private int movieId_ ;
    /**
     * <code>int32 movieId = 2;</code>
     * @return The movieId.
     */
    @java.lang.Override
    public int getMovieId() {
      return movieId_;
    }
    /**
     * <code>int32 movieId = 2;</code>
     * @param value The movieId to set.
     * @return This builder for chaining.
     */
    public Builder setMovieId(int value) {
      
      movieId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 movieId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMovieId() {
      
      movieId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SingleFavSearchRequest)
  }

  // @@protoc_insertion_point(class_scope:SingleFavSearchRequest)
  private static final com.dk.grpcmovie.movie.SingleFavSearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.SingleFavSearchRequest();
  }

  public static com.dk.grpcmovie.movie.SingleFavSearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleFavSearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<SingleFavSearchRequest>() {
    @java.lang.Override
    public SingleFavSearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleFavSearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleFavSearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleFavSearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.SingleFavSearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code MovieSearchRequest}
 */
public final class MovieSearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MovieSearchRequest)
    MovieSearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MovieSearchRequest.newBuilder() to construct.
  private MovieSearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MovieSearchRequest() {
    genre_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MovieSearchRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MovieSearchRequest(
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
            int rawValue = input.readEnum();

            genre_ = rawValue;
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
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieSearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieSearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.MovieSearchRequest.class, com.dk.grpcmovie.movie.MovieSearchRequest.Builder.class);
  }

  public static final int GENRE_FIELD_NUMBER = 1;
  private int genre_;
  /**
   * <code>.common.Genre genre = 1;</code>
   * @return The enum numeric value on the wire for genre.
   */
  @java.lang.Override public int getGenreValue() {
    return genre_;
  }
  /**
   * <code>.common.Genre genre = 1;</code>
   * @return The genre.
   */
  @java.lang.Override public com.dk.grpcmovie.common.Genre getGenre() {
    @SuppressWarnings("deprecation")
    com.dk.grpcmovie.common.Genre result = com.dk.grpcmovie.common.Genre.valueOf(genre_);
    return result == null ? com.dk.grpcmovie.common.Genre.UNRECOGNIZED : result;
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
    if (genre_ != com.dk.grpcmovie.common.Genre.DRAMA.getNumber()) {
      output.writeEnum(1, genre_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genre_ != com.dk.grpcmovie.common.Genre.DRAMA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, genre_);
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
    if (!(obj instanceof com.dk.grpcmovie.movie.MovieSearchRequest)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.MovieSearchRequest other = (com.dk.grpcmovie.movie.MovieSearchRequest) obj;

    if (genre_ != other.genre_) return false;
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
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + genre_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieSearchRequest parseFrom(
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
  public static Builder newBuilder(com.dk.grpcmovie.movie.MovieSearchRequest prototype) {
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
   * Protobuf type {@code MovieSearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MovieSearchRequest)
      com.dk.grpcmovie.movie.MovieSearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieSearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieSearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.MovieSearchRequest.class, com.dk.grpcmovie.movie.MovieSearchRequest.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.MovieSearchRequest.newBuilder()
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
      genre_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieSearchRequest_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieSearchRequest getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.MovieSearchRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieSearchRequest build() {
      com.dk.grpcmovie.movie.MovieSearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieSearchRequest buildPartial() {
      com.dk.grpcmovie.movie.MovieSearchRequest result = new com.dk.grpcmovie.movie.MovieSearchRequest(this);
      result.genre_ = genre_;
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
      if (other instanceof com.dk.grpcmovie.movie.MovieSearchRequest) {
        return mergeFrom((com.dk.grpcmovie.movie.MovieSearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.MovieSearchRequest other) {
      if (other == com.dk.grpcmovie.movie.MovieSearchRequest.getDefaultInstance()) return this;
      if (other.genre_ != 0) {
        setGenreValue(other.getGenreValue());
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
      com.dk.grpcmovie.movie.MovieSearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.MovieSearchRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int genre_ = 0;
    /**
     * <code>.common.Genre genre = 1;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>.common.Genre genre = 1;</code>
     * @param value The enum numeric value on the wire for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreValue(int value) {
      
      genre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 1;</code>
     * @return The genre.
     */
    @java.lang.Override
    public com.dk.grpcmovie.common.Genre getGenre() {
      @SuppressWarnings("deprecation")
      com.dk.grpcmovie.common.Genre result = com.dk.grpcmovie.common.Genre.valueOf(genre_);
      return result == null ? com.dk.grpcmovie.common.Genre.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.Genre genre = 1;</code>
     * @param value The genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenre(com.dk.grpcmovie.common.Genre value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      genre_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenre() {
      
      genre_ = 0;
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


    // @@protoc_insertion_point(builder_scope:MovieSearchRequest)
  }

  // @@protoc_insertion_point(class_scope:MovieSearchRequest)
  private static final com.dk.grpcmovie.movie.MovieSearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.MovieSearchRequest();
  }

  public static com.dk.grpcmovie.movie.MovieSearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MovieSearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<MovieSearchRequest>() {
    @java.lang.Override
    public MovieSearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MovieSearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MovieSearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MovieSearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.MovieSearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


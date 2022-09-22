// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code AllMovieResponse}
 */
public final class AllMovieResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AllMovieResponse)
    AllMovieResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllMovieResponse.newBuilder() to construct.
  private AllMovieResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllMovieResponse() {
    movie_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllMovieResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllMovieResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              movie_ = new java.util.ArrayList<com.dk.grpcmovie.movie.MovieDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            movie_.add(
                input.readMessage(com.dk.grpcmovie.movie.MovieDto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        movie_ = java.util.Collections.unmodifiableList(movie_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllMovieResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllMovieResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.AllMovieResponse.class, com.dk.grpcmovie.movie.AllMovieResponse.Builder.class);
  }

  public static final int MOVIE_FIELD_NUMBER = 1;
  private java.util.List<com.dk.grpcmovie.movie.MovieDto> movie_;
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.dk.grpcmovie.movie.MovieDto> getMovieList() {
    return movie_;
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.dk.grpcmovie.movie.MovieDtoOrBuilder> 
      getMovieOrBuilderList() {
    return movie_;
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public int getMovieCount() {
    return movie_.size();
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.MovieDto getMovie(int index) {
    return movie_.get(index);
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.MovieDtoOrBuilder getMovieOrBuilder(
      int index) {
    return movie_.get(index);
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
    for (int i = 0; i < movie_.size(); i++) {
      output.writeMessage(1, movie_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < movie_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, movie_.get(i));
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
    if (!(obj instanceof com.dk.grpcmovie.movie.AllMovieResponse)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.AllMovieResponse other = (com.dk.grpcmovie.movie.AllMovieResponse) obj;

    if (!getMovieList()
        .equals(other.getMovieList())) return false;
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
    if (getMovieCount() > 0) {
      hash = (37 * hash) + MOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getMovieList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllMovieResponse parseFrom(
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
  public static Builder newBuilder(com.dk.grpcmovie.movie.AllMovieResponse prototype) {
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
   * Protobuf type {@code AllMovieResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllMovieResponse)
      com.dk.grpcmovie.movie.AllMovieResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllMovieResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllMovieResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.AllMovieResponse.class, com.dk.grpcmovie.movie.AllMovieResponse.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.AllMovieResponse.newBuilder()
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
        getMovieFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (movieBuilder_ == null) {
        movie_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        movieBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllMovieResponse_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllMovieResponse getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.AllMovieResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllMovieResponse build() {
      com.dk.grpcmovie.movie.AllMovieResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllMovieResponse buildPartial() {
      com.dk.grpcmovie.movie.AllMovieResponse result = new com.dk.grpcmovie.movie.AllMovieResponse(this);
      int from_bitField0_ = bitField0_;
      if (movieBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          movie_ = java.util.Collections.unmodifiableList(movie_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.movie_ = movie_;
      } else {
        result.movie_ = movieBuilder_.build();
      }
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
      if (other instanceof com.dk.grpcmovie.movie.AllMovieResponse) {
        return mergeFrom((com.dk.grpcmovie.movie.AllMovieResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.AllMovieResponse other) {
      if (other == com.dk.grpcmovie.movie.AllMovieResponse.getDefaultInstance()) return this;
      if (movieBuilder_ == null) {
        if (!other.movie_.isEmpty()) {
          if (movie_.isEmpty()) {
            movie_ = other.movie_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMovieIsMutable();
            movie_.addAll(other.movie_);
          }
          onChanged();
        }
      } else {
        if (!other.movie_.isEmpty()) {
          if (movieBuilder_.isEmpty()) {
            movieBuilder_.dispose();
            movieBuilder_ = null;
            movie_ = other.movie_;
            bitField0_ = (bitField0_ & ~0x00000001);
            movieBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMovieFieldBuilder() : null;
          } else {
            movieBuilder_.addAllMessages(other.movie_);
          }
        }
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
      com.dk.grpcmovie.movie.AllMovieResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.AllMovieResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.dk.grpcmovie.movie.MovieDto> movie_ =
      java.util.Collections.emptyList();
    private void ensureMovieIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        movie_ = new java.util.ArrayList<com.dk.grpcmovie.movie.MovieDto>(movie_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.MovieDto, com.dk.grpcmovie.movie.MovieDto.Builder, com.dk.grpcmovie.movie.MovieDtoOrBuilder> movieBuilder_;

    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.MovieDto> getMovieList() {
      if (movieBuilder_ == null) {
        return java.util.Collections.unmodifiableList(movie_);
      } else {
        return movieBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public int getMovieCount() {
      if (movieBuilder_ == null) {
        return movie_.size();
      } else {
        return movieBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.dk.grpcmovie.movie.MovieDto getMovie(int index) {
      if (movieBuilder_ == null) {
        return movie_.get(index);
      } else {
        return movieBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder setMovie(
        int index, com.dk.grpcmovie.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.set(index, value);
        onChanged();
      } else {
        movieBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder setMovie(
        int index, com.dk.grpcmovie.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.set(index, builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(com.dk.grpcmovie.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.add(value);
        onChanged();
      } else {
        movieBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        int index, com.dk.grpcmovie.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.add(index, value);
        onChanged();
      } else {
        movieBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        com.dk.grpcmovie.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.add(builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        int index, com.dk.grpcmovie.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.add(index, builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addAllMovie(
        java.lang.Iterable<? extends com.dk.grpcmovie.movie.MovieDto> values) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, movie_);
        onChanged();
      } else {
        movieBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder clearMovie() {
      if (movieBuilder_ == null) {
        movie_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        movieBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder removeMovie(int index) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.remove(index);
        onChanged();
      } else {
        movieBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.dk.grpcmovie.movie.MovieDto.Builder getMovieBuilder(
        int index) {
      return getMovieFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.dk.grpcmovie.movie.MovieDtoOrBuilder getMovieOrBuilder(
        int index) {
      if (movieBuilder_ == null) {
        return movie_.get(index);  } else {
        return movieBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<? extends com.dk.grpcmovie.movie.MovieDtoOrBuilder> 
         getMovieOrBuilderList() {
      if (movieBuilder_ != null) {
        return movieBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(movie_);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.dk.grpcmovie.movie.MovieDto.Builder addMovieBuilder() {
      return getMovieFieldBuilder().addBuilder(
          com.dk.grpcmovie.movie.MovieDto.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.dk.grpcmovie.movie.MovieDto.Builder addMovieBuilder(
        int index) {
      return getMovieFieldBuilder().addBuilder(
          index, com.dk.grpcmovie.movie.MovieDto.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.MovieDto.Builder> 
         getMovieBuilderList() {
      return getMovieFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.MovieDto, com.dk.grpcmovie.movie.MovieDto.Builder, com.dk.grpcmovie.movie.MovieDtoOrBuilder> 
        getMovieFieldBuilder() {
      if (movieBuilder_ == null) {
        movieBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dk.grpcmovie.movie.MovieDto, com.dk.grpcmovie.movie.MovieDto.Builder, com.dk.grpcmovie.movie.MovieDtoOrBuilder>(
                movie_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        movie_ = null;
      }
      return movieBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AllMovieResponse)
  }

  // @@protoc_insertion_point(class_scope:AllMovieResponse)
  private static final com.dk.grpcmovie.movie.AllMovieResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.AllMovieResponse();
  }

  public static com.dk.grpcmovie.movie.AllMovieResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllMovieResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllMovieResponse>() {
    @java.lang.Override
    public AllMovieResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllMovieResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllMovieResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllMovieResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.AllMovieResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


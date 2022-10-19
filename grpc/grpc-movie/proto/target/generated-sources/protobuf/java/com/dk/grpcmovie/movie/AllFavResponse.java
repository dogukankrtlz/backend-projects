// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code AllFavResponse}
 */
public final class AllFavResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AllFavResponse)
    AllFavResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllFavResponse.newBuilder() to construct.
  private AllFavResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllFavResponse() {
    favori_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllFavResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllFavResponse(
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
              favori_ = new java.util.ArrayList<com.dk.grpcmovie.movie.FavoriteDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            favori_.add(
                input.readMessage(com.dk.grpcmovie.movie.FavoriteDto.parser(), extensionRegistry));
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
        favori_ = java.util.Collections.unmodifiableList(favori_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllFavResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllFavResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.AllFavResponse.class, com.dk.grpcmovie.movie.AllFavResponse.Builder.class);
  }

  public static final int FAVORI_FIELD_NUMBER = 1;
  private java.util.List<com.dk.grpcmovie.movie.FavoriteDto> favori_;
  /**
   * <code>repeated .FavoriteDto favori = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.dk.grpcmovie.movie.FavoriteDto> getFavoriList() {
    return favori_;
  }
  /**
   * <code>repeated .FavoriteDto favori = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.dk.grpcmovie.movie.FavoriteDtoOrBuilder> 
      getFavoriOrBuilderList() {
    return favori_;
  }
  /**
   * <code>repeated .FavoriteDto favori = 1;</code>
   */
  @java.lang.Override
  public int getFavoriCount() {
    return favori_.size();
  }
  /**
   * <code>repeated .FavoriteDto favori = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.FavoriteDto getFavori(int index) {
    return favori_.get(index);
  }
  /**
   * <code>repeated .FavoriteDto favori = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.FavoriteDtoOrBuilder getFavoriOrBuilder(
      int index) {
    return favori_.get(index);
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
    for (int i = 0; i < favori_.size(); i++) {
      output.writeMessage(1, favori_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < favori_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, favori_.get(i));
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
    if (!(obj instanceof com.dk.grpcmovie.movie.AllFavResponse)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.AllFavResponse other = (com.dk.grpcmovie.movie.AllFavResponse) obj;

    if (!getFavoriList()
        .equals(other.getFavoriList())) return false;
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
    if (getFavoriCount() > 0) {
      hash = (37 * hash) + FAVORI_FIELD_NUMBER;
      hash = (53 * hash) + getFavoriList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllFavResponse parseFrom(
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
  public static Builder newBuilder(com.dk.grpcmovie.movie.AllFavResponse prototype) {
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
   * Protobuf type {@code AllFavResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllFavResponse)
      com.dk.grpcmovie.movie.AllFavResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllFavResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllFavResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.AllFavResponse.class, com.dk.grpcmovie.movie.AllFavResponse.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.AllFavResponse.newBuilder()
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
        getFavoriFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (favoriBuilder_ == null) {
        favori_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        favoriBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllFavResponse_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllFavResponse getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.AllFavResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllFavResponse build() {
      com.dk.grpcmovie.movie.AllFavResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllFavResponse buildPartial() {
      com.dk.grpcmovie.movie.AllFavResponse result = new com.dk.grpcmovie.movie.AllFavResponse(this);
      int from_bitField0_ = bitField0_;
      if (favoriBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          favori_ = java.util.Collections.unmodifiableList(favori_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.favori_ = favori_;
      } else {
        result.favori_ = favoriBuilder_.build();
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
      if (other instanceof com.dk.grpcmovie.movie.AllFavResponse) {
        return mergeFrom((com.dk.grpcmovie.movie.AllFavResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.AllFavResponse other) {
      if (other == com.dk.grpcmovie.movie.AllFavResponse.getDefaultInstance()) return this;
      if (favoriBuilder_ == null) {
        if (!other.favori_.isEmpty()) {
          if (favori_.isEmpty()) {
            favori_ = other.favori_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFavoriIsMutable();
            favori_.addAll(other.favori_);
          }
          onChanged();
        }
      } else {
        if (!other.favori_.isEmpty()) {
          if (favoriBuilder_.isEmpty()) {
            favoriBuilder_.dispose();
            favoriBuilder_ = null;
            favori_ = other.favori_;
            bitField0_ = (bitField0_ & ~0x00000001);
            favoriBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFavoriFieldBuilder() : null;
          } else {
            favoriBuilder_.addAllMessages(other.favori_);
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
      com.dk.grpcmovie.movie.AllFavResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.AllFavResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.dk.grpcmovie.movie.FavoriteDto> favori_ =
      java.util.Collections.emptyList();
    private void ensureFavoriIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        favori_ = new java.util.ArrayList<com.dk.grpcmovie.movie.FavoriteDto>(favori_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.FavoriteDto, com.dk.grpcmovie.movie.FavoriteDto.Builder, com.dk.grpcmovie.movie.FavoriteDtoOrBuilder> favoriBuilder_;

    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.FavoriteDto> getFavoriList() {
      if (favoriBuilder_ == null) {
        return java.util.Collections.unmodifiableList(favori_);
      } else {
        return favoriBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public int getFavoriCount() {
      if (favoriBuilder_ == null) {
        return favori_.size();
      } else {
        return favoriBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public com.dk.grpcmovie.movie.FavoriteDto getFavori(int index) {
      if (favoriBuilder_ == null) {
        return favori_.get(index);
      } else {
        return favoriBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder setFavori(
        int index, com.dk.grpcmovie.movie.FavoriteDto value) {
      if (favoriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFavoriIsMutable();
        favori_.set(index, value);
        onChanged();
      } else {
        favoriBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder setFavori(
        int index, com.dk.grpcmovie.movie.FavoriteDto.Builder builderForValue) {
      if (favoriBuilder_ == null) {
        ensureFavoriIsMutable();
        favori_.set(index, builderForValue.build());
        onChanged();
      } else {
        favoriBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder addFavori(com.dk.grpcmovie.movie.FavoriteDto value) {
      if (favoriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFavoriIsMutable();
        favori_.add(value);
        onChanged();
      } else {
        favoriBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder addFavori(
        int index, com.dk.grpcmovie.movie.FavoriteDto value) {
      if (favoriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFavoriIsMutable();
        favori_.add(index, value);
        onChanged();
      } else {
        favoriBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder addFavori(
        com.dk.grpcmovie.movie.FavoriteDto.Builder builderForValue) {
      if (favoriBuilder_ == null) {
        ensureFavoriIsMutable();
        favori_.add(builderForValue.build());
        onChanged();
      } else {
        favoriBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder addFavori(
        int index, com.dk.grpcmovie.movie.FavoriteDto.Builder builderForValue) {
      if (favoriBuilder_ == null) {
        ensureFavoriIsMutable();
        favori_.add(index, builderForValue.build());
        onChanged();
      } else {
        favoriBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder addAllFavori(
        java.lang.Iterable<? extends com.dk.grpcmovie.movie.FavoriteDto> values) {
      if (favoriBuilder_ == null) {
        ensureFavoriIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, favori_);
        onChanged();
      } else {
        favoriBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder clearFavori() {
      if (favoriBuilder_ == null) {
        favori_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        favoriBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public Builder removeFavori(int index) {
      if (favoriBuilder_ == null) {
        ensureFavoriIsMutable();
        favori_.remove(index);
        onChanged();
      } else {
        favoriBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public com.dk.grpcmovie.movie.FavoriteDto.Builder getFavoriBuilder(
        int index) {
      return getFavoriFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public com.dk.grpcmovie.movie.FavoriteDtoOrBuilder getFavoriOrBuilder(
        int index) {
      if (favoriBuilder_ == null) {
        return favori_.get(index);  } else {
        return favoriBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public java.util.List<? extends com.dk.grpcmovie.movie.FavoriteDtoOrBuilder> 
         getFavoriOrBuilderList() {
      if (favoriBuilder_ != null) {
        return favoriBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(favori_);
      }
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public com.dk.grpcmovie.movie.FavoriteDto.Builder addFavoriBuilder() {
      return getFavoriFieldBuilder().addBuilder(
          com.dk.grpcmovie.movie.FavoriteDto.getDefaultInstance());
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public com.dk.grpcmovie.movie.FavoriteDto.Builder addFavoriBuilder(
        int index) {
      return getFavoriFieldBuilder().addBuilder(
          index, com.dk.grpcmovie.movie.FavoriteDto.getDefaultInstance());
    }
    /**
     * <code>repeated .FavoriteDto favori = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.FavoriteDto.Builder> 
         getFavoriBuilderList() {
      return getFavoriFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.FavoriteDto, com.dk.grpcmovie.movie.FavoriteDto.Builder, com.dk.grpcmovie.movie.FavoriteDtoOrBuilder> 
        getFavoriFieldBuilder() {
      if (favoriBuilder_ == null) {
        favoriBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dk.grpcmovie.movie.FavoriteDto, com.dk.grpcmovie.movie.FavoriteDto.Builder, com.dk.grpcmovie.movie.FavoriteDtoOrBuilder>(
                favori_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        favori_ = null;
      }
      return favoriBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AllFavResponse)
  }

  // @@protoc_insertion_point(class_scope:AllFavResponse)
  private static final com.dk.grpcmovie.movie.AllFavResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.AllFavResponse();
  }

  public static com.dk.grpcmovie.movie.AllFavResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllFavResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllFavResponse>() {
    @java.lang.Override
    public AllFavResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllFavResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllFavResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllFavResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.AllFavResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


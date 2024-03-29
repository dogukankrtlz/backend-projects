// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code AllCommentResponse}
 */
public final class AllCommentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AllCommentResponse)
    AllCommentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllCommentResponse.newBuilder() to construct.
  private AllCommentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllCommentResponse() {
    comment_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllCommentResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllCommentResponse(
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
              comment_ = new java.util.ArrayList<com.dk.grpcmovie.movie.Comment>();
              mutable_bitField0_ |= 0x00000001;
            }
            comment_.add(
                input.readMessage(com.dk.grpcmovie.movie.Comment.parser(), extensionRegistry));
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
        comment_ = java.util.Collections.unmodifiableList(comment_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllCommentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllCommentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.AllCommentResponse.class, com.dk.grpcmovie.movie.AllCommentResponse.Builder.class);
  }

  public static final int COMMENT_FIELD_NUMBER = 1;
  private java.util.List<com.dk.grpcmovie.movie.Comment> comment_;
  /**
   * <code>repeated .Comment comment = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.dk.grpcmovie.movie.Comment> getCommentList() {
    return comment_;
  }
  /**
   * <code>repeated .Comment comment = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.dk.grpcmovie.movie.CommentOrBuilder> 
      getCommentOrBuilderList() {
    return comment_;
  }
  /**
   * <code>repeated .Comment comment = 1;</code>
   */
  @java.lang.Override
  public int getCommentCount() {
    return comment_.size();
  }
  /**
   * <code>repeated .Comment comment = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.Comment getComment(int index) {
    return comment_.get(index);
  }
  /**
   * <code>repeated .Comment comment = 1;</code>
   */
  @java.lang.Override
  public com.dk.grpcmovie.movie.CommentOrBuilder getCommentOrBuilder(
      int index) {
    return comment_.get(index);
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
    for (int i = 0; i < comment_.size(); i++) {
      output.writeMessage(1, comment_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < comment_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, comment_.get(i));
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
    if (!(obj instanceof com.dk.grpcmovie.movie.AllCommentResponse)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.AllCommentResponse other = (com.dk.grpcmovie.movie.AllCommentResponse) obj;

    if (!getCommentList()
        .equals(other.getCommentList())) return false;
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
    if (getCommentCount() > 0) {
      hash = (37 * hash) + COMMENT_FIELD_NUMBER;
      hash = (53 * hash) + getCommentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.AllCommentResponse parseFrom(
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
  public static Builder newBuilder(com.dk.grpcmovie.movie.AllCommentResponse prototype) {
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
   * Protobuf type {@code AllCommentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllCommentResponse)
      com.dk.grpcmovie.movie.AllCommentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllCommentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllCommentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.AllCommentResponse.class, com.dk.grpcmovie.movie.AllCommentResponse.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.AllCommentResponse.newBuilder()
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
        getCommentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commentBuilder_ == null) {
        comment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        commentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_AllCommentResponse_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllCommentResponse getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.AllCommentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllCommentResponse build() {
      com.dk.grpcmovie.movie.AllCommentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.AllCommentResponse buildPartial() {
      com.dk.grpcmovie.movie.AllCommentResponse result = new com.dk.grpcmovie.movie.AllCommentResponse(this);
      int from_bitField0_ = bitField0_;
      if (commentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          comment_ = java.util.Collections.unmodifiableList(comment_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.comment_ = comment_;
      } else {
        result.comment_ = commentBuilder_.build();
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
      if (other instanceof com.dk.grpcmovie.movie.AllCommentResponse) {
        return mergeFrom((com.dk.grpcmovie.movie.AllCommentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.AllCommentResponse other) {
      if (other == com.dk.grpcmovie.movie.AllCommentResponse.getDefaultInstance()) return this;
      if (commentBuilder_ == null) {
        if (!other.comment_.isEmpty()) {
          if (comment_.isEmpty()) {
            comment_ = other.comment_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommentIsMutable();
            comment_.addAll(other.comment_);
          }
          onChanged();
        }
      } else {
        if (!other.comment_.isEmpty()) {
          if (commentBuilder_.isEmpty()) {
            commentBuilder_.dispose();
            commentBuilder_ = null;
            comment_ = other.comment_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommentFieldBuilder() : null;
          } else {
            commentBuilder_.addAllMessages(other.comment_);
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
      com.dk.grpcmovie.movie.AllCommentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.AllCommentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.dk.grpcmovie.movie.Comment> comment_ =
      java.util.Collections.emptyList();
    private void ensureCommentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        comment_ = new java.util.ArrayList<com.dk.grpcmovie.movie.Comment>(comment_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.Comment, com.dk.grpcmovie.movie.Comment.Builder, com.dk.grpcmovie.movie.CommentOrBuilder> commentBuilder_;

    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.Comment> getCommentList() {
      if (commentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(comment_);
      } else {
        return commentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public int getCommentCount() {
      if (commentBuilder_ == null) {
        return comment_.size();
      } else {
        return commentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public com.dk.grpcmovie.movie.Comment getComment(int index) {
      if (commentBuilder_ == null) {
        return comment_.get(index);
      } else {
        return commentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder setComment(
        int index, com.dk.grpcmovie.movie.Comment value) {
      if (commentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentIsMutable();
        comment_.set(index, value);
        onChanged();
      } else {
        commentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder setComment(
        int index, com.dk.grpcmovie.movie.Comment.Builder builderForValue) {
      if (commentBuilder_ == null) {
        ensureCommentIsMutable();
        comment_.set(index, builderForValue.build());
        onChanged();
      } else {
        commentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder addComment(com.dk.grpcmovie.movie.Comment value) {
      if (commentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentIsMutable();
        comment_.add(value);
        onChanged();
      } else {
        commentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder addComment(
        int index, com.dk.grpcmovie.movie.Comment value) {
      if (commentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentIsMutable();
        comment_.add(index, value);
        onChanged();
      } else {
        commentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder addComment(
        com.dk.grpcmovie.movie.Comment.Builder builderForValue) {
      if (commentBuilder_ == null) {
        ensureCommentIsMutable();
        comment_.add(builderForValue.build());
        onChanged();
      } else {
        commentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder addComment(
        int index, com.dk.grpcmovie.movie.Comment.Builder builderForValue) {
      if (commentBuilder_ == null) {
        ensureCommentIsMutable();
        comment_.add(index, builderForValue.build());
        onChanged();
      } else {
        commentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder addAllComment(
        java.lang.Iterable<? extends com.dk.grpcmovie.movie.Comment> values) {
      if (commentBuilder_ == null) {
        ensureCommentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, comment_);
        onChanged();
      } else {
        commentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder clearComment() {
      if (commentBuilder_ == null) {
        comment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public Builder removeComment(int index) {
      if (commentBuilder_ == null) {
        ensureCommentIsMutable();
        comment_.remove(index);
        onChanged();
      } else {
        commentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public com.dk.grpcmovie.movie.Comment.Builder getCommentBuilder(
        int index) {
      return getCommentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public com.dk.grpcmovie.movie.CommentOrBuilder getCommentOrBuilder(
        int index) {
      if (commentBuilder_ == null) {
        return comment_.get(index);  } else {
        return commentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public java.util.List<? extends com.dk.grpcmovie.movie.CommentOrBuilder> 
         getCommentOrBuilderList() {
      if (commentBuilder_ != null) {
        return commentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(comment_);
      }
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public com.dk.grpcmovie.movie.Comment.Builder addCommentBuilder() {
      return getCommentFieldBuilder().addBuilder(
          com.dk.grpcmovie.movie.Comment.getDefaultInstance());
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public com.dk.grpcmovie.movie.Comment.Builder addCommentBuilder(
        int index) {
      return getCommentFieldBuilder().addBuilder(
          index, com.dk.grpcmovie.movie.Comment.getDefaultInstance());
    }
    /**
     * <code>repeated .Comment comment = 1;</code>
     */
    public java.util.List<com.dk.grpcmovie.movie.Comment.Builder> 
         getCommentBuilderList() {
      return getCommentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dk.grpcmovie.movie.Comment, com.dk.grpcmovie.movie.Comment.Builder, com.dk.grpcmovie.movie.CommentOrBuilder> 
        getCommentFieldBuilder() {
      if (commentBuilder_ == null) {
        commentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dk.grpcmovie.movie.Comment, com.dk.grpcmovie.movie.Comment.Builder, com.dk.grpcmovie.movie.CommentOrBuilder>(
                comment_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        comment_ = null;
      }
      return commentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AllCommentResponse)
  }

  // @@protoc_insertion_point(class_scope:AllCommentResponse)
  private static final com.dk.grpcmovie.movie.AllCommentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.AllCommentResponse();
  }

  public static com.dk.grpcmovie.movie.AllCommentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllCommentResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllCommentResponse>() {
    @java.lang.Override
    public AllCommentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllCommentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllCommentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllCommentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.AllCommentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


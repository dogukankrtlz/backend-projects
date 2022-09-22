// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.dk.grpcmovie.movie;

/**
 * Protobuf type {@code MovieDto}
 */
public final class MovieDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MovieDto)
    MovieDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MovieDto.newBuilder() to construct.
  private MovieDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MovieDto() {
    title_ = "";
    genre_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MovieDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MovieDto(
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

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 24: {

            relYear_ = input.readInt32();
            break;
          }
          case 33: {

            rating_ = input.readDouble();
            break;
          }
          case 40: {
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
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dk.grpcmovie.movie.MovieDto.class, com.dk.grpcmovie.movie.MovieDto.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REL_YEAR_FIELD_NUMBER = 3;
  private int relYear_;
  /**
   * <code>int32 rel_year = 3;</code>
   * @return The relYear.
   */
  @java.lang.Override
  public int getRelYear() {
    return relYear_;
  }

  public static final int RATING_FIELD_NUMBER = 4;
  private double rating_;
  /**
   * <code>double rating = 4;</code>
   * @return The rating.
   */
  @java.lang.Override
  public double getRating() {
    return rating_;
  }

  public static final int GENRE_FIELD_NUMBER = 5;
  private int genre_;
  /**
   * <code>.common.Genre genre = 5;</code>
   * @return The enum numeric value on the wire for genre.
   */
  @java.lang.Override public int getGenreValue() {
    return genre_;
  }
  /**
   * <code>.common.Genre genre = 5;</code>
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (relYear_ != 0) {
      output.writeInt32(3, relYear_);
    }
    if (java.lang.Double.doubleToRawLongBits(rating_) != 0) {
      output.writeDouble(4, rating_);
    }
    if (genre_ != com.dk.grpcmovie.common.Genre.DRAMA.getNumber()) {
      output.writeEnum(5, genre_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (relYear_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, relYear_);
    }
    if (java.lang.Double.doubleToRawLongBits(rating_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, rating_);
    }
    if (genre_ != com.dk.grpcmovie.common.Genre.DRAMA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, genre_);
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
    if (!(obj instanceof com.dk.grpcmovie.movie.MovieDto)) {
      return super.equals(obj);
    }
    com.dk.grpcmovie.movie.MovieDto other = (com.dk.grpcmovie.movie.MovieDto) obj;

    if (getId()
        != other.getId()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (getRelYear()
        != other.getRelYear()) return false;
    if (java.lang.Double.doubleToLongBits(getRating())
        != java.lang.Double.doubleToLongBits(
            other.getRating())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + REL_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getRelYear();
    hash = (37 * hash) + RATING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRating()));
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + genre_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dk.grpcmovie.movie.MovieDto parseFrom(
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
  public static Builder newBuilder(com.dk.grpcmovie.movie.MovieDto prototype) {
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
   * Protobuf type {@code MovieDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MovieDto)
      com.dk.grpcmovie.movie.MovieDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dk.grpcmovie.movie.MovieDto.class, com.dk.grpcmovie.movie.MovieDto.Builder.class);
    }

    // Construct using com.dk.grpcmovie.movie.MovieDto.newBuilder()
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
      id_ = 0;

      title_ = "";

      relYear_ = 0;

      rating_ = 0D;

      genre_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dk.grpcmovie.movie.MovieServiceOuterClass.internal_static_MovieDto_descriptor;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieDto getDefaultInstanceForType() {
      return com.dk.grpcmovie.movie.MovieDto.getDefaultInstance();
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieDto build() {
      com.dk.grpcmovie.movie.MovieDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dk.grpcmovie.movie.MovieDto buildPartial() {
      com.dk.grpcmovie.movie.MovieDto result = new com.dk.grpcmovie.movie.MovieDto(this);
      result.id_ = id_;
      result.title_ = title_;
      result.relYear_ = relYear_;
      result.rating_ = rating_;
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
      if (other instanceof com.dk.grpcmovie.movie.MovieDto) {
        return mergeFrom((com.dk.grpcmovie.movie.MovieDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dk.grpcmovie.movie.MovieDto other) {
      if (other == com.dk.grpcmovie.movie.MovieDto.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (other.getRelYear() != 0) {
        setRelYear(other.getRelYear());
      }
      if (other.getRating() != 0D) {
        setRating(other.getRating());
      }
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
      com.dk.grpcmovie.movie.MovieDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dk.grpcmovie.movie.MovieDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private int relYear_ ;
    /**
     * <code>int32 rel_year = 3;</code>
     * @return The relYear.
     */
    @java.lang.Override
    public int getRelYear() {
      return relYear_;
    }
    /**
     * <code>int32 rel_year = 3;</code>
     * @param value The relYear to set.
     * @return This builder for chaining.
     */
    public Builder setRelYear(int value) {
      
      relYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rel_year = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelYear() {
      
      relYear_ = 0;
      onChanged();
      return this;
    }

    private double rating_ ;
    /**
     * <code>double rating = 4;</code>
     * @return The rating.
     */
    @java.lang.Override
    public double getRating() {
      return rating_;
    }
    /**
     * <code>double rating = 4;</code>
     * @param value The rating to set.
     * @return This builder for chaining.
     */
    public Builder setRating(double value) {
      
      rating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double rating = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRating() {
      
      rating_ = 0D;
      onChanged();
      return this;
    }

    private int genre_ = 0;
    /**
     * <code>.common.Genre genre = 5;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>.common.Genre genre = 5;</code>
     * @param value The enum numeric value on the wire for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreValue(int value) {
      
      genre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 5;</code>
     * @return The genre.
     */
    @java.lang.Override
    public com.dk.grpcmovie.common.Genre getGenre() {
      @SuppressWarnings("deprecation")
      com.dk.grpcmovie.common.Genre result = com.dk.grpcmovie.common.Genre.valueOf(genre_);
      return result == null ? com.dk.grpcmovie.common.Genre.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.Genre genre = 5;</code>
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
     * <code>.common.Genre genre = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:MovieDto)
  }

  // @@protoc_insertion_point(class_scope:MovieDto)
  private static final com.dk.grpcmovie.movie.MovieDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dk.grpcmovie.movie.MovieDto();
  }

  public static com.dk.grpcmovie.movie.MovieDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MovieDto>
      PARSER = new com.google.protobuf.AbstractParser<MovieDto>() {
    @java.lang.Override
    public MovieDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MovieDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MovieDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MovieDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dk.grpcmovie.movie.MovieDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


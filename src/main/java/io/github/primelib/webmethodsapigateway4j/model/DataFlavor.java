package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataFlavor
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "defaultRepresentationClassAsString",
    "flavorJavaFileListType",
    "flavorRemoteObjectType",
    "flavorSerializedObjectType",
    "flavorTextType",
    "humanPresentableName",
    "mimeType",
    "mimeTypeSerializedObject",
    "primaryType",
    "representationClassByteBuffer",
    "representationClassCharBuffer",
    "representationClassInputStream",
    "representationClassReader",
    "representationClassRemote",
    "representationClassSerializable",
    "subType"
})
@JsonTypeName("DataFlavor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataFlavor {

    @JsonProperty("defaultRepresentationClassAsString")
    protected String defaultRepresentationClassAsString;

    @JsonProperty("flavorJavaFileListType")
    protected Boolean flavorJavaFileListType;

    @JsonProperty("flavorRemoteObjectType")
    protected Boolean flavorRemoteObjectType;

    @JsonProperty("flavorSerializedObjectType")
    protected Boolean flavorSerializedObjectType;

    @JsonProperty("flavorTextType")
    protected Boolean flavorTextType;

    @JsonProperty("humanPresentableName")
    protected String humanPresentableName;

    @JsonProperty("mimeType")
    protected String mimeType;

    @JsonProperty("mimeTypeSerializedObject")
    protected Boolean mimeTypeSerializedObject;

    @JsonProperty("primaryType")
    protected String primaryType;

    @JsonProperty("representationClassByteBuffer")
    protected Boolean representationClassByteBuffer;

    @JsonProperty("representationClassCharBuffer")
    protected Boolean representationClassCharBuffer;

    @JsonProperty("representationClassInputStream")
    protected Boolean representationClassInputStream;

    @JsonProperty("representationClassReader")
    protected Boolean representationClassReader;

    @JsonProperty("representationClassRemote")
    protected Boolean representationClassRemote;

    @JsonProperty("representationClassSerializable")
    protected Boolean representationClassSerializable;

    @JsonProperty("subType")
    protected String subType;

    /**
     * Constructs a validated instance of {@link DataFlavor}.
     *
     * @param spec the specification to process
     */
    public DataFlavor(Consumer<DataFlavor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DataFlavor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DataFlavor(Consumer)} instead.
     * @param defaultRepresentationClassAsString defaultRepresentationClassAsString
     * @param flavorJavaFileListType flavorJavaFileListType
     * @param flavorRemoteObjectType flavorRemoteObjectType
     * @param flavorSerializedObjectType flavorSerializedObjectType
     * @param flavorTextType flavorTextType
     * @param humanPresentableName humanPresentableName
     * @param mimeType mimeType
     * @param mimeTypeSerializedObject mimeTypeSerializedObject
     * @param primaryType primaryType
     * @param representationClassByteBuffer representationClassByteBuffer
     * @param representationClassCharBuffer representationClassCharBuffer
     * @param representationClassInputStream representationClassInputStream
     * @param representationClassReader representationClassReader
     * @param representationClassRemote representationClassRemote
     * @param representationClassSerializable representationClassSerializable
     * @param subType subType
     */
    @ApiStatus.Internal
    public DataFlavor(String defaultRepresentationClassAsString, Boolean flavorJavaFileListType, Boolean flavorRemoteObjectType, Boolean flavorSerializedObjectType, Boolean flavorTextType, String humanPresentableName, String mimeType, Boolean mimeTypeSerializedObject, String primaryType, Boolean representationClassByteBuffer, Boolean representationClassCharBuffer, Boolean representationClassInputStream, Boolean representationClassReader, Boolean representationClassRemote, Boolean representationClassSerializable, String subType) {
        this.defaultRepresentationClassAsString = defaultRepresentationClassAsString;
        this.flavorJavaFileListType = flavorJavaFileListType;
        this.flavorRemoteObjectType = flavorRemoteObjectType;
        this.flavorSerializedObjectType = flavorSerializedObjectType;
        this.flavorTextType = flavorTextType;
        this.humanPresentableName = humanPresentableName;
        this.mimeType = mimeType;
        this.mimeTypeSerializedObject = mimeTypeSerializedObject;
        this.primaryType = primaryType;
        this.representationClassByteBuffer = representationClassByteBuffer;
        this.representationClassCharBuffer = representationClassCharBuffer;
        this.representationClassInputStream = representationClassInputStream;
        this.representationClassReader = representationClassReader;
        this.representationClassRemote = representationClassRemote;
        this.representationClassSerializable = representationClassSerializable;
        this.subType = subType;
    }

}

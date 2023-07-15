package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataFlavor
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link DataFlavor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DataFlavor(Consumer<DataFlavor> spec) {
        spec.accept(this);
    }

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


}

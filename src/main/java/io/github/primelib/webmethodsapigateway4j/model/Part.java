package io.github.primelib.webmethodsapigateway4j.model;

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
 * Part
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allHeaders",
    "content",
    "contentType",
    "dataHandler",
    "description",
    "disposition",
    "fileName",
    "inputStream",
    "lineCount",
    "size"
})
@JsonTypeName("Part")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Part {

    /**
     * Constructs a validated implementation of {@link Part}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Part(Consumer<Part> spec) {
        spec.accept(this);
    }

    @JsonProperty("allHeaders")
    protected Object allHeaders;

    @JsonProperty("content")
    protected Object content;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("dataHandler")
    protected DataHandler dataHandler;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("disposition")
    protected String disposition;

    @JsonProperty("fileName")
    protected String fileName;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("lineCount")
    protected Integer lineCount;

    @JsonProperty("size")
    protected Integer size;


}

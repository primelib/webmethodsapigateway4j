package io.github.primelib.webmethodsapigateway4j.model;

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
 * Part
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

    /**
     * Constructs a validated instance of {@link Part}.
     *
     * @param spec the specification to process
     */
    public Part(Consumer<Part> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Part}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Part(Consumer)} instead.
     * @param allHeaders allHeaders
     * @param content content
     * @param contentType contentType
     * @param dataHandler dataHandler
     * @param description description
     * @param disposition disposition
     * @param fileName fileName
     * @param inputStream inputStream
     * @param lineCount lineCount
     * @param size size
     */
    @ApiStatus.Internal
    public Part(Object allHeaders, Object content, String contentType, DataHandler dataHandler, String description, String disposition, String fileName, Object inputStream, Integer lineCount, Integer size) {
        this.allHeaders = allHeaders;
        this.content = content;
        this.contentType = contentType;
        this.dataHandler = dataHandler;
        this.description = description;
        this.disposition = disposition;
        this.fileName = fileName;
        this.inputStream = inputStream;
        this.lineCount = lineCount;
        this.size = size;
    }

}

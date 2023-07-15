package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MediaType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "example",
    "examples",
    "schema",
    "vendorExtensions"
})
@JsonTypeName("MediaType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MediaType {

    /**
     * Constructs a validated implementation of {@link MediaType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MediaType(Consumer<MediaType> spec) {
        spec.accept(this);
    }

    /**
     * Example of the media type. The example object SHOULD be in the correct format as specified by the media type. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema
     */
    @JsonProperty("example")
    protected Object example;

    /**
     * Examples of the media type. Each example object SHOULD match the media type and specified schema if present. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
     */
    @JsonProperty("examples")
    protected Map<String, Example> examples = new HashMap<>();

    @JsonProperty("schema")
    protected ParameterSchema schema;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

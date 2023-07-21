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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MediaType
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
    "example",
    "examples",
    "schema",
    "vendorExtensions"
})
@JsonTypeName("MediaType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MediaType {

    /**
     * Example of the media type. The example object SHOULD be in the correct format as specified by the media type. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema
     */
    @JsonProperty("example")
    protected Object example;

    /**
     * Examples of the media type. Each example object SHOULD match the media type and specified schema if present. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
     */
    @JsonProperty("examples")
    protected Map<String, Example> examples;

    @JsonProperty("schema")
    protected ParameterSchema schema;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link MediaType}.
     *
     * @param spec the specification to process
     */
    public MediaType(Consumer<MediaType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MediaType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MediaType(Consumer)} instead.
     * @param example Example of the media type. The example object SHOULD be in the correct format as specified by the media type. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema
     * @param examples Examples of the media type. Each example object SHOULD match the media type and specified schema if present. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
     * @param schema var.name
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public MediaType(Object example, Map<String, Example> examples, ParameterSchema schema, Map<String, Object> vendorExtensions) {
        this.example = example;
        this.examples = examples;
        this.schema = schema;
        this.vendorExtensions = vendorExtensions;
    }

}

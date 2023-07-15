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
 * Model
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "example",
    "externalDocs",
    "properties",
    "reference",
    "title",
    "type",
    "vendorExtensions"
})
@JsonTypeName("Model")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Model<T> {

    /**
     * Constructs a validated implementation of {@link Model}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Model(Consumer<Model> spec) {
        spec.accept(this);
    }

    @JsonProperty("description")
    protected String description;

    @JsonProperty("example")
    protected Object example;

    @JsonProperty("externalDocs")
    protected ExternalDocs externalDocs;

    @JsonProperty("properties")
    protected Map<String, T> properties = new HashMap<>();

    @JsonProperty("reference")
    protected String reference;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

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
 * Model
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
public class Model {

    @JsonProperty("description")
    protected String description;

    @JsonProperty("example")
    protected Object example;

    @JsonProperty("externalDocs")
    protected ExternalDocs externalDocs;

    @JsonProperty("properties")
    protected Map<String, Object> properties;

    @JsonProperty("reference")
    protected String reference;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Model}.
     *
     * @param spec the specification to process
     */
    public Model(Consumer<Model> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Model}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Model(Consumer)} instead.
     * @param description var.name
     * @param example var.name
     * @param externalDocs var.name
     * @param properties var.name
     * @param reference var.name
     * @param title var.name
     * @param type var.name
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public Model(String description, Object example, ExternalDocs externalDocs, Map<String, Object> properties, String reference, String title, String type, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.example = example;
        this.externalDocs = externalDocs;
        this.properties = properties;
        this.reference = reference;
        this.title = title;
        this.type = type;
        this.vendorExtensions = vendorExtensions;
    }

}

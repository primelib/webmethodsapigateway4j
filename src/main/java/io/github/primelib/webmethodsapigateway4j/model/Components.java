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
 * Components
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "callbacks",
    "examples",
    "headers",
    "links",
    "parameters",
    "requestBodies",
    "responses",
    "schemas",
    "securitySchemes",
    "vendorExtensions"
})
@JsonTypeName("Components")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Components {

    /**
     * Constructs a validated implementation of {@link Components}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Components(Consumer<Components> spec) {
        spec.accept(this);
    }

    /**
     * An object to hold reusable callback objects
     */
    @JsonProperty("callbacks")
    protected Map<String, Callback> callbacks = new HashMap<>();

    /**
     * An object to hold reusable example objects
     */
    @JsonProperty("examples")
    protected Map<String, Example> examples = new HashMap<>();

    /**
     * An object to hold reusable header objects
     */
    @JsonProperty("headers")
    protected Map<String, Header> headers = new HashMap<>();

    /**
     * An object to hold reusable link objects
     */
    @JsonProperty("links")
    protected Map<String, Link> links = new HashMap<>();

    /**
     * An object to hold reusable parameter objects
     */
    @JsonProperty("parameters")
    protected Map<String, Parameter> parameters = new HashMap<>();

    /**
     * An object to hold reusable requestBody objects
     */
    @JsonProperty("requestBodies")
    protected Map<String, RequestBody> requestBodies = new HashMap<>();

    /**
     * An object to hold reusable response objects
     */
    @JsonProperty("responses")
    protected Map<String, Response> responses = new HashMap<>();

    /**
     * An object to hold reusable schema objects
     */
    @JsonProperty("schemas")
    protected Map<String, ParameterSchema> schemas = new HashMap<>();

    /**
     * An object to hold reusable securityScheme objects
     */
    @JsonProperty("securitySchemes")
    protected Map<String, SecurityScheme> securitySchemes = new HashMap<>();

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

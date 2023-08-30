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
 * Components
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
     * An object to hold reusable callback objects
     */
    @JsonProperty("callbacks")
    protected Map<String, Callback> callbacks;

    /**
     * An object to hold reusable example objects
     */
    @JsonProperty("examples")
    protected Map<String, Example> examples;

    /**
     * An object to hold reusable header objects
     */
    @JsonProperty("headers")
    protected Map<String, Header> headers;

    /**
     * An object to hold reusable link objects
     */
    @JsonProperty("links")
    protected Map<String, Link> links;

    /**
     * An object to hold reusable parameter objects
     */
    @JsonProperty("parameters")
    protected Map<String, Parameter> parameters;

    /**
     * An object to hold reusable requestBody objects
     */
    @JsonProperty("requestBodies")
    protected Map<String, RequestBody> requestBodies;

    /**
     * An object to hold reusable response objects
     */
    @JsonProperty("responses")
    protected Map<String, Response> responses;

    /**
     * An object to hold reusable schema objects
     */
    @JsonProperty("schemas")
    protected Map<String, ParameterSchema> schemas;

    /**
     * An object to hold reusable securityScheme objects
     */
    @JsonProperty("securitySchemes")
    protected Map<String, SecurityScheme> securitySchemes;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Components}.
     *
     * @param spec the specification to process
     */
    public Components(Consumer<Components> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Components}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Components(Consumer)} instead.
     * @param callbacks An object to hold reusable callback objects
     * @param examples An object to hold reusable example objects
     * @param headers An object to hold reusable header objects
     * @param links An object to hold reusable link objects
     * @param parameters An object to hold reusable parameter objects
     * @param requestBodies An object to hold reusable requestBody objects
     * @param responses An object to hold reusable response objects
     * @param schemas An object to hold reusable schema objects
     * @param securitySchemes An object to hold reusable securityScheme objects
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Components(Map<String, Callback> callbacks, Map<String, Example> examples, Map<String, Header> headers, Map<String, Link> links, Map<String, Parameter> parameters, Map<String, RequestBody> requestBodies, Map<String, Response> responses, Map<String, ParameterSchema> schemas, Map<String, SecurityScheme> securitySchemes, Map<String, Object> vendorExtensions) {
        this.callbacks = callbacks;
        this.examples = examples;
        this.headers = headers;
        this.links = links;
        this.parameters = parameters;
        this.requestBodies = requestBodies;
        this.responses = responses;
        this.schemas = schemas;
        this.securitySchemes = securitySchemes;
        this.vendorExtensions = vendorExtensions;
    }

}

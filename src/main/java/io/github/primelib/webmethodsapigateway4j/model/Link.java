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
 * Link
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
    "get$ref",
    "operationId",
    "operationRef",
    "parameters",
    "requestBody",
    "vendorExtensions"
})
@JsonTypeName("Link")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Link {

    /**
     * A description of the link
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually exclusive of the operationRef field
     */
    @JsonProperty("operationId")
    protected String operationId;

    /**
     * A relative or absolute reference to an OAS operation. This field is mutually exclusive of the operationId field, and MUST point to an Operation Object. Relative operationRef values MAY be used to locate an existing Operation Object in the API definition
     */
    @JsonProperty("operationRef")
    protected String operationRef;

    /**
     * A map representing parameters to pass to an operation as specified with operationId or identified via operationRef. The key is the parameter name to be used, whereas the value can be a constant or an expression to be evaluated and passed to the linked operation. The parameter name can be qualified using the parameter location [{in}.]{name} for operations that use the same parameter name in different locations (e.g. path.id)
     */
    @JsonProperty("parameters")
    protected Map<String, String> parameters;

    /**
     * A literal value or {expression} to use as a request body when calling the target operation
     */
    @JsonProperty("requestBody")
    protected String requestBody;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Link}.
     *
     * @param spec the specification to process
     */
    public Link(Consumer<Link> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Link}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Link(Consumer)} instead.
     * @param description A description of the link
     * @param get$ref get$ref
     * @param operationId The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually exclusive of the operationRef field
     * @param operationRef A relative or absolute reference to an OAS operation. This field is mutually exclusive of the operationId field, and MUST point to an Operation Object. Relative operationRef values MAY be used to locate an existing Operation Object in the API definition
     * @param parameters A map representing parameters to pass to an operation as specified with operationId or identified via operationRef. The key is the parameter name to be used, whereas the value can be a constant or an expression to be evaluated and passed to the linked operation. The parameter name can be qualified using the parameter location [{in}.]{name} for operations that use the same parameter name in different locations (e.g. path.id)
     * @param requestBody A literal value or {expression} to use as a request body when calling the target operation
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Link(String description, String get$ref, String operationId, String operationRef, Map<String, String> parameters, String requestBody, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.get$ref = get$ref;
        this.operationId = operationId;
        this.operationRef = operationRef;
        this.parameters = parameters;
        this.requestBody = requestBody;
        this.vendorExtensions = vendorExtensions;
    }

}

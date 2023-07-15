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
 * Link
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Link}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Link(Consumer<Link> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> parameters = new HashMap<>();

    /**
     * A literal value or {expression} to use as a request body when calling the target operation
     */
    @JsonProperty("requestBody")
    protected String requestBody;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

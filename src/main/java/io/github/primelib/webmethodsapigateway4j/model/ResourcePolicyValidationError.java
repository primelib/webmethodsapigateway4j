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
 * ResourcePolicyValidationError
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conflictingPolicies",
    "error",
    "errorMessage",
    "method",
    "policyDetails",
    "resource"
})
@JsonTypeName("ResourcePolicyValidationError")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResourcePolicyValidationError {

    /**
     * Constructs a validated implementation of {@link ResourcePolicyValidationError}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResourcePolicyValidationError(Consumer<ResourcePolicyValidationError> spec) {
        spec.accept(this);
    }

    /**
     * Map of conflicting policy ids and its respective details
     */
    @JsonProperty("conflictingPolicies")
    protected Map<String, PolicyDetails> conflictingPolicies = new HashMap<>();

    @JsonProperty("error")
    protected EnforcementValidationError error;

    /**
     * Policy enforcement validation error message
     */
    @JsonProperty("errorMessage")
    protected String errorMessage;

    /**
     * Applicable for REST Services only. This will contain the HTTP method of the resource which is having policy enforcement validation error
     */
    @JsonProperty("method")
    protected String method;

    @JsonProperty("policyDetails")
    protected PolicyDetails policyDetails;

    /**
     * Resource/Operation name which is having the policy enforcement validation error
     */
    @JsonProperty("resource")
    protected String resource;


}

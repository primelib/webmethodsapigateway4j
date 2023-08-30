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
 * ResourcePolicyValidationError
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
     * Map of conflicting policy ids and its respective details
     */
    @JsonProperty("conflictingPolicies")
    protected Map<String, PolicyDetails> conflictingPolicies;

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

    /**
     * Constructs a validated instance of {@link ResourcePolicyValidationError}.
     *
     * @param spec the specification to process
     */
    public ResourcePolicyValidationError(Consumer<ResourcePolicyValidationError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResourcePolicyValidationError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResourcePolicyValidationError(Consumer)} instead.
     * @param conflictingPolicies Map of conflicting policy ids and its respective details
     * @param error error
     * @param errorMessage Policy enforcement validation error message
     * @param method Applicable for REST Services only. This will contain the HTTP method of the resource which is having policy enforcement validation error
     * @param policyDetails policyDetails
     * @param resource Resource/Operation name which is having the policy enforcement validation error
     */
    @ApiStatus.Internal
    public ResourcePolicyValidationError(Map<String, PolicyDetails> conflictingPolicies, EnforcementValidationError error, String errorMessage, String method, PolicyDetails policyDetails, String resource) {
        this.conflictingPolicies = conflictingPolicies;
        this.error = error;
        this.errorMessage = errorMessage;
        this.method = method;
        this.policyDetails = policyDetails;
        this.resource = resource;
    }

}

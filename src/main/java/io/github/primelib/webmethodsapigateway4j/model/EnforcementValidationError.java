package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EnforcementValidationError
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allowedOccurrence",
    "conflictingTemplateId",
    "errorType",
    "missingDependency",
    "policyActionName",
    "templateId"
})
@JsonTypeName("EnforcementValidationError")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EnforcementValidationError {

    /**
     * Constructs a validated implementation of {@link EnforcementValidationError}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EnforcementValidationError(Consumer<EnforcementValidationError> spec) {
        spec.accept(this);
    }

    /**
     * This value will be populated when the error occurred due to occurrence of policy enforcement
     */
    @JsonProperty("allowedOccurrence")
    protected AllowedOccurrenceEnum allowedOccurrence;

    /**
     * This value will be populated when the error occurred due to mutually exclusive policy enforcement are available at the runtime enforcement of an API
     */
    @JsonProperty("conflictingTemplateId")
    protected String conflictingTemplateId;

    /**
     * The type of the policy enforcement validation error
     */
    @JsonProperty("errorType")
    protected ErrorTypeEnum errorType;

    /**
     * The value of the list of missed policy enforcement which are dependent for this policy enforcement. This will be populated when the policy enforcement validation error occurred due to dependency missing
     */
    @JsonProperty("missingDependency")
    protected List<String> missingDependency;

    /**
     * The name of the policy enforcement which is having the validation error
     */
    @JsonProperty("policyActionName")
    protected String policyActionName;

    /**
     * The template Id of the policy enforcement which is having the validation error
     */
    @JsonProperty("templateId")
    protected String templateId;


    /**
     * This value will be populated when the error occurred due to occurrence of policy enforcement
     */
    @AllArgsConstructor
    public enum AllowedOccurrenceEnum {
        ONCE("once"),
        MULTIPLE("multiple");

        private final String value;
    }

    /**
     * The type of the policy enforcement validation error
     */
    @AllArgsConstructor
    public enum ErrorTypeEnum {
        DEPENDENCYMISSING("dependencyMissing"),
        MUTUALLYEXCLUSIVE("mutuallyExclusive"),
        OCCURRENCE("occurrence");

        private final String value;
    }

}

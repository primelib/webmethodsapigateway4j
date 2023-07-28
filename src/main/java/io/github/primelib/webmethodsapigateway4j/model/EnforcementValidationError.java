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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EnforcementValidationError
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
     * Constructs a validated instance of {@link EnforcementValidationError}.
     *
     * @param spec the specification to process
     */
    public EnforcementValidationError(Consumer<EnforcementValidationError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EnforcementValidationError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EnforcementValidationError(Consumer)} instead.
     * @param allowedOccurrence This value will be populated when the error occurred due to occurrence of policy enforcement
     * @param conflictingTemplateId This value will be populated when the error occurred due to mutually exclusive policy enforcement are available at the runtime enforcement of an API
     * @param errorType The type of the policy enforcement validation error
     * @param missingDependency The value of the list of missed policy enforcement which are dependent for this policy enforcement. This will be populated when the policy enforcement validation error occurred due to dependency missing
     * @param policyActionName The name of the policy enforcement which is having the validation error
     * @param templateId The template Id of the policy enforcement which is having the validation error
     */
    @ApiStatus.Internal
    public EnforcementValidationError(AllowedOccurrenceEnum allowedOccurrence, String conflictingTemplateId, ErrorTypeEnum errorType, List<String> missingDependency, String policyActionName, String templateId) {
        this.allowedOccurrence = allowedOccurrence;
        this.conflictingTemplateId = conflictingTemplateId;
        this.errorType = errorType;
        this.missingDependency = missingDependency;
        this.policyActionName = policyActionName;
        this.templateId = templateId;
    }

    /**
     * This value will be populated when the error occurred due to occurrence of policy enforcement
     */
    @AllArgsConstructor
    public enum AllowedOccurrenceEnum {
        ONCE("once"),
        MULTIPLE("multiple");

        private static final AllowedOccurrenceEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AllowedOccurrenceEnum of(String input) {
            if (input != null) {
                for (AllowedOccurrenceEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The type of the policy enforcement validation error
     */
    @AllArgsConstructor
    public enum ErrorTypeEnum {
        DEPENDENCYMISSING("dependencyMissing"),
        MUTUALLYEXCLUSIVE("mutuallyExclusive"),
        OCCURRENCE("occurrence");

        private static final ErrorTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ErrorTypeEnum of(String input) {
            if (input != null) {
                for (ErrorTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

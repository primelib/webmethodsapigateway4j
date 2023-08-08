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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EnforcementValidationMessage
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
    "apiId",
    "apiName",
    "apiType",
    "apiVersion",
    "errorOnResource"
})
@JsonTypeName("EnforcementValidationMessage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EnforcementValidationMessage {

    /**
     * ID of the API which is having the policy enforcement violation
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * Name of the API which is having the policy enforcement violation
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * Type of the API which is having the policy enforcement violation
     */
    @JsonProperty("apiType")
    protected String apiType;

    /**
     * Version of the API which is having the policy enforcement violation
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("errorOnResource")
    protected List<ResourcePolicyValidationError> errorOnResource;

    /**
     * Constructs a validated instance of {@link EnforcementValidationMessage}.
     *
     * @param spec the specification to process
     */
    public EnforcementValidationMessage(Consumer<EnforcementValidationMessage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EnforcementValidationMessage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EnforcementValidationMessage(Consumer)} instead.
     * @param apiId ID of the API which is having the policy enforcement violation
     * @param apiName Name of the API which is having the policy enforcement violation
     * @param apiType Type of the API which is having the policy enforcement violation
     * @param apiVersion Version of the API which is having the policy enforcement violation
     * @param errorOnResource errorOnResource
     */
    @ApiStatus.Internal
    public EnforcementValidationMessage(String apiId, String apiName, String apiType, String apiVersion, List<ResourcePolicyValidationError> errorOnResource) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.errorOnResource = errorOnResource;
    }

}

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
 * EnforcementValidationMessage
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link EnforcementValidationMessage}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EnforcementValidationMessage(Consumer<EnforcementValidationMessage> spec) {
        spec.accept(this);
    }

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


}

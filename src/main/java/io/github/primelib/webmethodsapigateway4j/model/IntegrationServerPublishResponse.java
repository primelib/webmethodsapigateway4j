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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationServerPublishResponse
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
    "failureReason",
    "integrationServerId",
    "integrationServerName",
    "status",
    "success"
})
@JsonTypeName("IntegrationServerPublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegrationServerPublishResponse {

    /**
     * Represents the status of the publish operation of the API to the service registry eg: Publish successful, Publish failed, etc
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Provides the reason for the failure when the publish operation is not successful
     */
    @JsonProperty("failureReason")
    protected String failureReason;

    /**
     * Id i.e, UDDI key of the service registry
     */
    @JsonProperty("integrationServerId")
    protected String integrationServerId;

    @JsonProperty("integrationServerName")
    protected String integrationServerName;

    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @JsonProperty("success")
    protected Boolean success;

    /**
     * Constructs a validated instance of {@link IntegrationServerPublishResponse}.
     *
     * @param spec the specification to process
     */
    public IntegrationServerPublishResponse(Consumer<IntegrationServerPublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IntegrationServerPublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IntegrationServerPublishResponse(Consumer)} instead.
     * @param description Represents the status of the publish operation of the API to the service registry eg: Publish successful, Publish failed, etc
     * @param failureReason Provides the reason for the failure when the publish operation is not successful
     * @param integrationServerId Id i.e, UDDI key of the service registry
     * @param integrationServerName var.name
     * @param status var.name
     * @param success Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @ApiStatus.Internal
    public IntegrationServerPublishResponse(String description, String failureReason, String integrationServerId, String integrationServerName, StatusEnum status, Boolean success) {
        this.description = description;
        this.failureReason = failureReason;
        this.integrationServerId = integrationServerId;
        this.integrationServerName = integrationServerName;
        this.status = status;
        this.success = success;
    }

    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}

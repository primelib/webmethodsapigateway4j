// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtIntegrationServerPublishResponse
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtIntegrationServerPublishResponse")
@JsonPropertyOrder({
    "description",
    "failureReason",
    "integrationServerId",
    "integrationServerName",
    "status",
    "success"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtIntegrationServerPublishResponse {

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

    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @JsonProperty("success")
    protected Boolean success;

    /**
     * Constructs a validated instance of {@link ServiceMgmtIntegrationServerPublishResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtIntegrationServerPublishResponse(Consumer<ServiceMgmtIntegrationServerPublishResponse> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtIntegrationServerPublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtIntegrationServerPublishResponse(Consumer)} instead.
     * @param description Represents the status of the publish operation of the API to the service registry eg: Publish successful, Publish failed, etc
     * @param failureReason Provides the reason for the failure when the publish operation is not successful
     * @param integrationServerId Id i.e, UDDI key of the service registry
     * @param integrationServerName integrationServerName
     * @param status Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     * @param success Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @ApiStatus.Internal
    public ServiceMgmtIntegrationServerPublishResponse(String description, String failureReason, String integrationServerId, String integrationServerName, String status, Boolean success) {
        this.description = description;
        this.failureReason = failureReason;
        this.integrationServerId = integrationServerId;
        this.integrationServerName = integrationServerName;
        this.status = status;
        this.success = success;
    }
}

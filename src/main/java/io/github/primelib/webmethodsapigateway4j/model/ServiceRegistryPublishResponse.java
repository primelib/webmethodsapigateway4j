package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryPublishResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "failureReason",
    "gatewayEndpoints",
    "serviceRegistryId",
    "serviceRegistryName",
    "status",
    "success"
})
@JsonTypeName("ServiceRegistryPublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishResponse {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryPublishResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishResponse(Consumer<ServiceRegistryPublishResponse> spec) {
        spec.accept(this);
    }

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
     * List of API endpoints of the API. Each element contains an endpoint and the information about the publish status of that endpoint for the current service registry.
     */
    @JsonProperty("gatewayEndpoints")
    protected Set<Endpoints> gatewayEndpoints;

    /**
     * Id i.e, UDDI key of the service registry
     */
    @JsonProperty("serviceRegistryId")
    protected String serviceRegistryId;

    /**
     * Name of the service registry
     */
    @JsonProperty("serviceRegistryName")
    protected String serviceRegistryName;

    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @JsonProperty("success")
    protected Boolean success;


    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}

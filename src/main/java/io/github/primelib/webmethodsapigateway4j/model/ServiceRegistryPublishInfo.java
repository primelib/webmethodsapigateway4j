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
 * ServiceRegistryPublishInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "gatewayEndpoints",
    "name",
    "serviceRegistryId",
    "status"
})
@JsonTypeName("ServiceRegistryPublishInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishInfo {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryPublishInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishInfo(Consumer<ServiceRegistryPublishInfo> spec) {
        spec.accept(this);
    }

    /**
     * List of API endpoints of the API. Each element contains an endpoint and the information about the publish status of that endpoint for the current service registry.
     */
    @JsonProperty("gatewayEndpoints")
    protected Set<Endpoints> gatewayEndpoints;

    /**
     * Name of the service registry. This field is shown only in response and should not be sent by clients in requests. Only the serviceRegistryId is considered for uniquely identifying the registry.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Uddi key of the service registry created in API Gateway. This field is required.
     */
    @JsonProperty("serviceRegistryId")
    protected String serviceRegistryId;

    /**
     * Publish Status of the API for this service registry. This field is shown only in response and should not be sent by clients in requests. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @JsonProperty("status")
    protected StatusEnum status;


    /**
     * Publish Status of the API for this service registry. This field is shown only in response and should not be sent by clients in requests. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}

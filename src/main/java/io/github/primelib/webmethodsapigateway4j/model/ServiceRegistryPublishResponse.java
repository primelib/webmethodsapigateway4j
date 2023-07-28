package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServiceRegistryPublishResponse
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
     * Constructs a validated instance of {@link ServiceRegistryPublishResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryPublishResponse(Consumer<ServiceRegistryPublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryPublishResponse(Consumer)} instead.
     * @param description Represents the status of the publish operation of the API to the service registry eg: Publish successful, Publish failed, etc
     * @param failureReason Provides the reason for the failure when the publish operation is not successful
     * @param gatewayEndpoints List of API endpoints of the API. Each element contains an endpoint and the information about the publish status of that endpoint for the current service registry.
     * @param serviceRegistryId Id i.e, UDDI key of the service registry
     * @param serviceRegistryName Name of the service registry
     * @param status Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     * @param success Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishResponse(String description, String failureReason, Set<Endpoints> gatewayEndpoints, String serviceRegistryId, String serviceRegistryName, StatusEnum status, Boolean success) {
        this.description = description;
        this.failureReason = failureReason;
        this.gatewayEndpoints = gatewayEndpoints;
        this.serviceRegistryId = serviceRegistryId;
        this.serviceRegistryName = serviceRegistryName;
        this.status = status;
        this.success = success;
    }

    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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

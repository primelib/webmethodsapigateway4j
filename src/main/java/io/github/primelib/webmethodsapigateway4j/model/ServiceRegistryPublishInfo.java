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
 * ServiceRegistryPublishInfo
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
    "gatewayEndpoints",
    "name",
    "serviceRegistryId",
    "status"
})
@JsonTypeName("ServiceRegistryPublishInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishInfo {

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
     * Constructs a validated instance of {@link ServiceRegistryPublishInfo}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryPublishInfo(Consumer<ServiceRegistryPublishInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryPublishInfo(Consumer)} instead.
     * @param gatewayEndpoints List of API endpoints of the API. Each element contains an endpoint and the information about the publish status of that endpoint for the current service registry.
     * @param name Name of the service registry. This field is shown only in response and should not be sent by clients in requests. Only the serviceRegistryId is considered for uniquely identifying the registry.
     * @param serviceRegistryId Uddi key of the service registry created in API Gateway. This field is required.
     * @param status Publish Status of the API for this service registry. This field is shown only in response and should not be sent by clients in requests. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishInfo(Set<Endpoints> gatewayEndpoints, String name, String serviceRegistryId, StatusEnum status) {
        this.gatewayEndpoints = gatewayEndpoints;
        this.name = name;
        this.serviceRegistryId = serviceRegistryId;
        this.status = status;
    }

    /**
     * Publish Status of the API for this service registry. This field is shown only in response and should not be sent by clients in requests. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
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

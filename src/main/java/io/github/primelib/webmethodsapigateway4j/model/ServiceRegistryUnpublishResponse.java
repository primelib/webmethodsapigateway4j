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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryUnpublishResponse
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
    "serviceRegistryId",
    "serviceRegistryName",
    "success"
})
@JsonTypeName("ServiceRegistryUnpublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryUnpublishResponse {

    /**
     * Represents the status of the unpublish operation of the API from the service registry eg: Unpublish successful, Unpublish failed, etc
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Provides the reason for the failure when the unpublish operation is not successful
     */
    @JsonProperty("failureReason")
    protected String failureReason;

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
     * Represents whether the unpublish operation of API from the service registry is success. Possible values: true/false
     */
    @JsonProperty("success")
    protected Boolean success;

    /**
     * Constructs a validated instance of {@link ServiceRegistryUnpublishResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryUnpublishResponse(Consumer<ServiceRegistryUnpublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryUnpublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryUnpublishResponse(Consumer)} instead.
     * @param description Represents the status of the unpublish operation of the API from the service registry eg: Unpublish successful, Unpublish failed, etc
     * @param failureReason Provides the reason for the failure when the unpublish operation is not successful
     * @param serviceRegistryId Id i.e, UDDI key of the service registry
     * @param serviceRegistryName Name of the service registry
     * @param success Represents whether the unpublish operation of API from the service registry is success. Possible values: true/false
     */
    @ApiStatus.Internal
    public ServiceRegistryUnpublishResponse(String description, String failureReason, String serviceRegistryId, String serviceRegistryName, Boolean success) {
        this.description = description;
        this.failureReason = failureReason;
        this.serviceRegistryId = serviceRegistryId;
        this.serviceRegistryName = serviceRegistryName;
        this.success = success;
    }

}

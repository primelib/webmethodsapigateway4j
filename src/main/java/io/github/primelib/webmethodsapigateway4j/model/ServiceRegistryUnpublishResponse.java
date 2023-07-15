package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryUnpublishResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ServiceRegistryUnpublishResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryUnpublishResponse(Consumer<ServiceRegistryUnpublishResponse> spec) {
        spec.accept(this);
    }

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


}

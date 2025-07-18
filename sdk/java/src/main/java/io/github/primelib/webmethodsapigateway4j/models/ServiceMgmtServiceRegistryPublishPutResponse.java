// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
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
 * ServiceMgmtServiceRegistryPublishPutResponse
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtServiceRegistryPublishPutResponse")
@JsonPropertyOrder({
    "publishResponse",
    "publishResponses"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtServiceRegistryPublishPutResponse {

    @JsonProperty("publishResponse")
    protected ServiceMgmtPublishResponse publishResponse;

    /**
     * This contains the service registry publish status for requests publishing more than one API to one or more service registries.
     */
    @JsonProperty("publishResponses")
    protected List<ServiceMgmtPublishResponse> publishResponses;

    /**
     * Constructs a validated instance of {@link ServiceMgmtServiceRegistryPublishPutResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtServiceRegistryPublishPutResponse(Consumer<ServiceMgmtServiceRegistryPublishPutResponse> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtServiceRegistryPublishPutResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtServiceRegistryPublishPutResponse(Consumer)} instead.
     * @param publishResponse publishResponse
     * @param publishResponses This contains the service registry publish status for requests publishing more than one API to one or more service registries.
     */
    @ApiStatus.Internal
    public ServiceMgmtServiceRegistryPublishPutResponse(ServiceMgmtPublishResponse publishResponse, List<ServiceMgmtPublishResponse> publishResponses) {
        this.publishResponse = publishResponse;
        this.publishResponses = publishResponses;
    }
}

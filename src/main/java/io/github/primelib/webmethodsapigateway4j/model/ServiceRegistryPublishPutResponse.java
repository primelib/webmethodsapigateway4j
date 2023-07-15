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
 * ServiceRegistryPublishPutResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "publishResponse",
    "publishResponses"
})
@JsonTypeName("ServiceRegistryPublishPutResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishPutResponse {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryPublishPutResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishPutResponse(Consumer<ServiceRegistryPublishPutResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("publishResponse")
    protected PublishResponse publishResponse;

    /**
     * This contains the service registry publish status for requests publishing more than one API to one or more service registries.
     */
    @JsonProperty("publishResponses")
    protected List<PublishResponse> publishResponses;


}

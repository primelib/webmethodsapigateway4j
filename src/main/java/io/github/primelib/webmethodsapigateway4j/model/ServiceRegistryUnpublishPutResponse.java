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
 * ServiceRegistryUnpublishPutResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "unpublishResponse",
    "unpublishResponses"
})
@JsonTypeName("ServiceRegistryUnpublishPutResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryUnpublishPutResponse {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryUnpublishPutResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryUnpublishPutResponse(Consumer<ServiceRegistryUnpublishPutResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("unpublishResponse")
    protected UnpublishResponse unpublishResponse;

    /**
     * This contains the service registry unpublish status for requests unpublishing more than one API from one or more service registries.
     */
    @JsonProperty("unpublishResponses")
    protected List<UnpublishResponse> unpublishResponses;


}

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryUnpublishPutResponse
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
    "unpublishResponse",
    "unpublishResponses"
})
@JsonTypeName("ServiceRegistryUnpublishPutResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryUnpublishPutResponse {

    @JsonProperty("unpublishResponse")
    protected UnpublishResponse unpublishResponse;

    /**
     * This contains the service registry unpublish status for requests unpublishing more than one API from one or more service registries.
     */
    @JsonProperty("unpublishResponses")
    protected List<UnpublishResponse> unpublishResponses;

    /**
     * Constructs a validated instance of {@link ServiceRegistryUnpublishPutResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryUnpublishPutResponse(Consumer<ServiceRegistryUnpublishPutResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryUnpublishPutResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryUnpublishPutResponse(Consumer)} instead.
     * @param unpublishResponse var.name
     * @param unpublishResponses This contains the service registry unpublish status for requests unpublishing more than one API from one or more service registries.
     */
    @ApiStatus.Internal
    public ServiceRegistryUnpublishPutResponse(UnpublishResponse unpublishResponse, List<UnpublishResponse> unpublishResponses) {
        this.unpublishResponse = unpublishResponse;
        this.unpublishResponses = unpublishResponses;
    }

}

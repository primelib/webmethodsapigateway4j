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
 * ServiceRegistryPublishPutResponse
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
    "publishResponse",
    "publishResponses"
})
@JsonTypeName("ServiceRegistryPublishPutResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishPutResponse {

    @JsonProperty("publishResponse")
    protected PublishResponse publishResponse;

    /**
     * This contains the service registry publish status for requests publishing more than one API to one or more service registries.
     */
    @JsonProperty("publishResponses")
    protected List<PublishResponse> publishResponses;

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishPutResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryPublishPutResponse(Consumer<ServiceRegistryPublishPutResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishPutResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryPublishPutResponse(Consumer)} instead.
     * @param publishResponse publishResponse
     * @param publishResponses This contains the service registry publish status for requests publishing more than one API to one or more service registries.
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishPutResponse(PublishResponse publishResponse, List<PublishResponse> publishResponses) {
        this.publishResponse = publishResponse;
        this.publishResponses = publishResponses;
    }

}

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
 * PublishPayload
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "integrationServerPublishInfo",
    "serviceRegistryPublishInfo"
})
@JsonTypeName("PublishPayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishPayload {

    /**
     * Constructs a validated implementation of {@link PublishPayload}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PublishPayload(Consumer<PublishPayload> spec) {
        spec.accept(this);
    }

    /**
     * API id for the API to be published. This field is required. The API will be published to the service registry with the value configured in 'Service registry display name' field of the API
     */
    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("integrationServerPublishInfo")
    protected List<IntegrationServerPublishInfo> integrationServerPublishInfo;

    /**
     * List of service registry publish information for the API. Each element of the list contains the publish information of the API for one service registry.
     */
    @JsonProperty("serviceRegistryPublishInfo")
    protected List<ServiceRegistryPublishInfo> serviceRegistryPublishInfo;


}

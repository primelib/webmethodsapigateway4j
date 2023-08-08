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
 * PublishPayload
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
    "apiId",
    "integrationServerPublishInfo",
    "serviceRegistryPublishInfo"
})
@JsonTypeName("PublishPayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishPayload {

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

    /**
     * Constructs a validated instance of {@link PublishPayload}.
     *
     * @param spec the specification to process
     */
    public PublishPayload(Consumer<PublishPayload> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PublishPayload}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PublishPayload(Consumer)} instead.
     * @param apiId API id for the API to be published. This field is required. The API will be published to the service registry with the value configured in 'Service registry display name' field of the API
     * @param integrationServerPublishInfo integrationServerPublishInfo
     * @param serviceRegistryPublishInfo List of service registry publish information for the API. Each element of the list contains the publish information of the API for one service registry.
     */
    @ApiStatus.Internal
    public PublishPayload(String apiId, List<IntegrationServerPublishInfo> integrationServerPublishInfo, List<ServiceRegistryPublishInfo> serviceRegistryPublishInfo) {
        this.apiId = apiId;
        this.integrationServerPublishInfo = integrationServerPublishInfo;
        this.serviceRegistryPublishInfo = serviceRegistryPublishInfo;
    }

}

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
 * PublishResponse
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
    "apiName",
    "apiVersion",
    "integrationServerPublishResponses",
    "serviceRegistryPublishResponses"
})
@JsonTypeName("PublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishResponse {

    /**
     * API id of the API published.
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * API name of the API published.
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * API version of the API published.
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("integrationServerPublishResponses")
    protected List<IntegrationServerPublishResponse> integrationServerPublishResponses;

    /**
     * Contains publish status of the API for each service registry in the request.
     */
    @JsonProperty("serviceRegistryPublishResponses")
    protected List<ServiceRegistryPublishResponse> serviceRegistryPublishResponses;

    /**
     * Constructs a validated instance of {@link PublishResponse}.
     *
     * @param spec the specification to process
     */
    public PublishResponse(Consumer<PublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PublishResponse(Consumer)} instead.
     * @param apiId API id of the API published.
     * @param apiName API name of the API published.
     * @param apiVersion API version of the API published.
     * @param integrationServerPublishResponses integrationServerPublishResponses
     * @param serviceRegistryPublishResponses Contains publish status of the API for each service registry in the request.
     */
    @ApiStatus.Internal
    public PublishResponse(String apiId, String apiName, String apiVersion, List<IntegrationServerPublishResponse> integrationServerPublishResponses, List<ServiceRegistryPublishResponse> serviceRegistryPublishResponses) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.integrationServerPublishResponses = integrationServerPublishResponses;
        this.serviceRegistryPublishResponses = serviceRegistryPublishResponses;
    }

}

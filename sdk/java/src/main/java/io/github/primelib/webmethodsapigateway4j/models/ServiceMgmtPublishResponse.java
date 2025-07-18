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
 * ServiceMgmtPublishResponse
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtPublishResponse")
@JsonPropertyOrder({
    "apiId",
    "apiName",
    "apiVersion",
    "integrationServerPublishResponses",
    "serviceRegistryPublishResponses"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtPublishResponse {

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
    protected List<ServiceMgmtIntegrationServerPublishResponse> integrationServerPublishResponses;

    /**
     * Contains publish status of the API for each service registry in the request.
     */
    @JsonProperty("serviceRegistryPublishResponses")
    protected List<ServiceMgmtServiceRegistryPublishResponse> serviceRegistryPublishResponses;

    /**
     * Constructs a validated instance of {@link ServiceMgmtPublishResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtPublishResponse(Consumer<ServiceMgmtPublishResponse> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtPublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtPublishResponse(Consumer)} instead.
     * @param apiId API id of the API published.
     * @param apiName API name of the API published.
     * @param apiVersion API version of the API published.
     * @param integrationServerPublishResponses integrationServerPublishResponses
     * @param serviceRegistryPublishResponses Contains publish status of the API for each service registry in the request.
     */
    @ApiStatus.Internal
    public ServiceMgmtPublishResponse(String apiId, String apiName, String apiVersion, List<ServiceMgmtIntegrationServerPublishResponse> integrationServerPublishResponses, List<ServiceMgmtServiceRegistryPublishResponse> serviceRegistryPublishResponses) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.integrationServerPublishResponses = integrationServerPublishResponses;
        this.serviceRegistryPublishResponses = serviceRegistryPublishResponses;
    }
}

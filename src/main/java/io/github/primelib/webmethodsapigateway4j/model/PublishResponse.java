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
 * PublishResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PublishResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PublishResponse(Consumer<PublishResponse> spec) {
        spec.accept(this);
    }

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


}

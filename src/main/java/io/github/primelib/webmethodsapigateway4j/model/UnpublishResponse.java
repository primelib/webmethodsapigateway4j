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
 * UnpublishResponse
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
    "serviceRegistryUnpublishResponses"
})
@JsonTypeName("UnpublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnpublishResponse {

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

    /**
     * Contains unpublish status of the API for each service registry in the request.
     */
    @JsonProperty("serviceRegistryUnpublishResponses")
    protected List<ServiceRegistryUnpublishResponse> serviceRegistryUnpublishResponses;

    /**
     * Constructs a validated instance of {@link UnpublishResponse}.
     *
     * @param spec the specification to process
     */
    public UnpublishResponse(Consumer<UnpublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UnpublishResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UnpublishResponse(Consumer)} instead.
     * @param apiId API id of the API published.
     * @param apiName API name of the API published.
     * @param apiVersion API version of the API published.
     * @param serviceRegistryUnpublishResponses Contains unpublish status of the API for each service registry in the request.
     */
    @ApiStatus.Internal
    public UnpublishResponse(String apiId, String apiName, String apiVersion, List<ServiceRegistryUnpublishResponse> serviceRegistryUnpublishResponses) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.serviceRegistryUnpublishResponses = serviceRegistryUnpublishResponses;
    }

}

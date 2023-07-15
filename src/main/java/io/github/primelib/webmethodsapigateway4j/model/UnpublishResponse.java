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
 * UnpublishResponse
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
    "serviceRegistryUnpublishResponses"
})
@JsonTypeName("UnpublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnpublishResponse {

    /**
     * Constructs a validated implementation of {@link UnpublishResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnpublishResponse(Consumer<UnpublishResponse> spec) {
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

    /**
     * Contains unpublish status of the API for each service registry in the request.
     */
    @JsonProperty("serviceRegistryUnpublishResponses")
    protected List<ServiceRegistryUnpublishResponse> serviceRegistryUnpublishResponses;


}

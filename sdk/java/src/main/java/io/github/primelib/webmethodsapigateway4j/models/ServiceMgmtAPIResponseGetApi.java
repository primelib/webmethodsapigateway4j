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
 * ServiceMgmtAPIResponseGetApi
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtAPIResponseGetApi")
@JsonPropertyOrder({
    "api",
    "apiId",
    "errorReason",
    "gatewayEndPoints",
    "responseStatus",
    "versions"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtAPIResponseGetApi {

    @JsonProperty("api")
    protected ServiceMgmtGatewayApi api;

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("gatewayEndPoints")
    protected List<String> gatewayEndPoints;

    /**
     * Response status
     */
    @JsonProperty("responseStatus")
    protected String responseStatus;

    @JsonProperty("versions")
    protected List<ServiceMgmtVersion> versions;

    /**
     * Constructs a validated instance of {@link ServiceMgmtAPIResponseGetApi}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtAPIResponseGetApi(Consumer<ServiceMgmtAPIResponseGetApi> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtAPIResponseGetApi}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtAPIResponseGetApi(Consumer)} instead.
     * @param api api
     * @param apiId apiId
     * @param errorReason errorReason
     * @param gatewayEndPoints gatewayEndPoints
     * @param responseStatus Response status
     * @param versions versions
     */
    @ApiStatus.Internal
    public ServiceMgmtAPIResponseGetApi(ServiceMgmtGatewayApi api, String apiId, String errorReason, List<String> gatewayEndPoints, String responseStatus, List<ServiceMgmtVersion> versions) {
        this.api = api;
        this.apiId = apiId;
        this.errorReason = errorReason;
        this.gatewayEndPoints = gatewayEndPoints;
        this.responseStatus = responseStatus;
        this.versions = versions;
    }
}

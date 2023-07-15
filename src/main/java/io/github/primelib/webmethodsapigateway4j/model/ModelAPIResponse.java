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
 * ModelAPIResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "api",
    "apiId",
    "errorReason",
    "gatewayEndPointList",
    "gatewayEndPoints",
    "microgatewayEndPoints",
    "portalGatewayDataEntries",
    "pubSOAPFlavor",
    "reason",
    "responseStatus",
    "restrictViewAsset",
    "rootFileLocation",
    "teams"
})
@JsonTypeName("APIResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ModelAPIResponse {

    /**
     * Constructs a validated implementation of {@link ModelAPIResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ModelAPIResponse(Consumer<ModelAPIResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("api")
    protected GatewayAPI api;

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("gatewayEndPointList")
    protected List<APIResponseGatewayEndpoint> gatewayEndPointList;

    @JsonProperty("gatewayEndPoints")
    protected List<String> gatewayEndPoints;

    @JsonProperty("microgatewayEndPoints")
    protected List<String> microgatewayEndPoints;

    @JsonProperty("portalGatewayDataEntries")
    protected Object portalGatewayDataEntries;

    @JsonProperty("pubSOAPFlavor")
    protected String pubSOAPFlavor;

    @JsonProperty("reason")
    protected Object reason;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    @JsonProperty("restrictViewAsset")
    protected Boolean restrictViewAsset;

    @JsonProperty("rootFileLocation")
    protected String rootFileLocation;

    @JsonProperty("teams")
    protected List<Team> teams;


    @AllArgsConstructor
    public enum ResponseStatusEnum {
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        NOT_FOUND("NOT_FOUND"),
        BAD_REQUEST("BAD_REQUEST"),
        PARTIAL_SUCCESS("PARTIAL_SUCCESS");

        private final String value;
    }

}

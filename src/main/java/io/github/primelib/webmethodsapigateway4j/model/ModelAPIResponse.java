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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ModelAPIResponse
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

    /**
     * Constructs a validated instance of {@link ModelAPIResponse}.
     *
     * @param spec the specification to process
     */
    public ModelAPIResponse(Consumer<ModelAPIResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ModelAPIResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ModelAPIResponse(Consumer)} instead.
     * @param api var.name
     * @param apiId var.name
     * @param errorReason var.name
     * @param gatewayEndPointList var.name
     * @param gatewayEndPoints var.name
     * @param microgatewayEndPoints var.name
     * @param portalGatewayDataEntries var.name
     * @param pubSOAPFlavor var.name
     * @param reason var.name
     * @param responseStatus var.name
     * @param restrictViewAsset var.name
     * @param rootFileLocation var.name
     * @param teams var.name
     */
    @ApiStatus.Internal
    public ModelAPIResponse(GatewayAPI api, String apiId, String errorReason, List<APIResponseGatewayEndpoint> gatewayEndPointList, List<String> gatewayEndPoints, List<String> microgatewayEndPoints, Object portalGatewayDataEntries, String pubSOAPFlavor, Object reason, ResponseStatusEnum responseStatus, Boolean restrictViewAsset, String rootFileLocation, List<Team> teams) {
        this.api = api;
        this.apiId = apiId;
        this.errorReason = errorReason;
        this.gatewayEndPointList = gatewayEndPointList;
        this.gatewayEndPoints = gatewayEndPoints;
        this.microgatewayEndPoints = microgatewayEndPoints;
        this.portalGatewayDataEntries = portalGatewayDataEntries;
        this.pubSOAPFlavor = pubSOAPFlavor;
        this.reason = reason;
        this.responseStatus = responseStatus;
        this.restrictViewAsset = restrictViewAsset;
        this.rootFileLocation = rootFileLocation;
        this.teams = teams;
    }

    @AllArgsConstructor
    public enum ResponseStatusEnum {
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        NOT_FOUND("NOT_FOUND"),
        BAD_REQUEST("BAD_REQUEST"),
        PARTIAL_SUCCESS("PARTIAL_SUCCESS");

        private static final ResponseStatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ResponseStatusEnum of(String input) {
            if (input != null) {
                for (ResponseStatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

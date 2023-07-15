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
 * APIResponseGetAPI
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
    "gatewayEndPoints",
    "responseStatus",
    "versions"
})
@JsonTypeName("APIResponseGetAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseGetAPI {

    /**
     * Constructs a validated implementation of {@link APIResponseGetAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponseGetAPI(Consumer<APIResponseGetAPI> spec) {
        spec.accept(this);
    }

    @JsonProperty("api")
    protected GatewayAPI api;

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("gatewayEndPoints")
    protected List<String> gatewayEndPoints;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    @JsonProperty("versions")
    protected List<Version> versions;


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

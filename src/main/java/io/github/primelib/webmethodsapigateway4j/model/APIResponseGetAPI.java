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
 * APIResponseGetAPI
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
    "gatewayEndPoints",
    "responseStatus",
    "versions"
})
@JsonTypeName("APIResponseGetAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseGetAPI {

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

    /**
     * Constructs a validated instance of {@link APIResponseGetAPI}.
     *
     * @param spec the specification to process
     */
    public APIResponseGetAPI(Consumer<APIResponseGetAPI> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseGetAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseGetAPI(Consumer)} instead.
     * @param api var.name
     * @param apiId var.name
     * @param errorReason var.name
     * @param gatewayEndPoints var.name
     * @param responseStatus var.name
     * @param versions var.name
     */
    @ApiStatus.Internal
    public APIResponseGetAPI(GatewayAPI api, String apiId, String errorReason, List<String> gatewayEndPoints, ResponseStatusEnum responseStatus, List<Version> versions) {
        this.api = api;
        this.apiId = apiId;
        this.errorReason = errorReason;
        this.gatewayEndPoints = gatewayEndPoints;
        this.responseStatus = responseStatus;
        this.versions = versions;
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

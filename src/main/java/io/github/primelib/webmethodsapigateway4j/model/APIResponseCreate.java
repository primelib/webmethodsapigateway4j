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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIResponseCreate
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
    "responseStatus"
})
@JsonTypeName("APIResponseCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseCreate {

    @JsonProperty("api")
    protected GatewayAPI api;

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    /**
     * Constructs a validated instance of {@link APIResponseCreate}.
     *
     * @param spec the specification to process
     */
    public APIResponseCreate(Consumer<APIResponseCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseCreate(Consumer)} instead.
     * @param api var.name
     * @param apiId var.name
     * @param errorReason var.name
     * @param responseStatus var.name
     */
    @ApiStatus.Internal
    public APIResponseCreate(GatewayAPI api, String apiId, String errorReason, ResponseStatusEnum responseStatus) {
        this.api = api;
        this.apiId = apiId;
        this.errorReason = errorReason;
        this.responseStatus = responseStatus;
    }

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

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIResponseCreate
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
    "responseStatus"
})
@JsonTypeName("APIResponseCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseCreate {

    /**
     * Constructs a validated implementation of {@link APIResponseCreate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponseCreate(Consumer<APIResponseCreate> spec) {
        spec.accept(this);
    }

    @JsonProperty("api")
    protected GatewayAPI api;

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;


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

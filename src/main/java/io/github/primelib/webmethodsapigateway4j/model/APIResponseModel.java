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
 * APIResponseModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "api",
    "responseStatus"
})
@JsonTypeName("APIResponseModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseModel {

    /**
     * Constructs a validated implementation of {@link APIResponseModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponseModel(Consumer<APIResponseModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("api")
    protected APIResponseGetAPIs api;

    /**
     * Response status
     */
    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;


    /**
     * Response status
     */
    @AllArgsConstructor
    public enum ResponseStatusEnum {
        CREATED("CREATED"),
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        UNEXPECTED_ERROR("UNEXPECTED_ERROR"),
        NOT_FOUND("NOT_FOUND"),
        NO_CONTENT("NO_CONTENT"),
        LOCKED("LOCKED"),
        UPDATED("UPDATED"),
        ACTIVATED("ACTIVATED"),
        DEACTIVATED("DEACTIVATED"),
        PUBLISHED("PUBLISHED"),
        UNPUBLISHED("UNPUBLISHED");

        private final String value;
    }

}

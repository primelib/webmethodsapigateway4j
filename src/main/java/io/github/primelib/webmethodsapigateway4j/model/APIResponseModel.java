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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * APIResponseModel
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
    "responseStatus"
})
@JsonTypeName("APIResponseModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseModel {

    @JsonProperty("api")
    protected APIResponseGetAPIs api;

    /**
     * Response status
     */
    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    /**
     * Constructs a validated instance of {@link APIResponseModel}.
     *
     * @param spec the specification to process
     */
    public APIResponseModel(Consumer<APIResponseModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseModel(Consumer)} instead.
     * @param api api
     * @param responseStatus Response status
     */
    @ApiStatus.Internal
    public APIResponseModel(APIResponseGetAPIs api, ResponseStatusEnum responseStatus) {
        this.api = api;
        this.responseStatus = responseStatus;
    }

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

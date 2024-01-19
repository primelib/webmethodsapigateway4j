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
 * APIResponseDelete
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
    "apiId",
    "errorReason",
    "responseStatus"
})
@JsonTypeName("APIResponseDelete")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseDelete {

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    /**
     * Constructs a validated instance of {@link APIResponseDelete}.
     *
     * @param spec the specification to process
     */
    public APIResponseDelete(Consumer<APIResponseDelete> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseDelete}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseDelete(Consumer)} instead.
     * @param apiId apiId
     * @param errorReason errorReason
     * @param responseStatus responseStatus
     */
    @ApiStatus.Internal
    public APIResponseDelete(String apiId, String errorReason, ResponseStatusEnum responseStatus) {
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

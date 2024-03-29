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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ChangeOwnerResponse
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
    "matchingAssets",
    "message",
    "status"
})
@JsonTypeName("ChangeOwnerResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeOwnerResponse {

    @JsonProperty("matchingAssets")
    protected Map<String, Object> matchingAssets;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Constructs a validated instance of {@link ChangeOwnerResponse}.
     *
     * @param spec the specification to process
     */
    public ChangeOwnerResponse(Consumer<ChangeOwnerResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeOwnerResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeOwnerResponse(Consumer)} instead.
     * @param matchingAssets matchingAssets
     * @param message message
     * @param status status
     */
    @ApiStatus.Internal
    public ChangeOwnerResponse(Map<String, Object> matchingAssets, String message, StatusEnum status) {
        this.matchingAssets = matchingAssets;
        this.message = message;
        this.status = status;
    }

    @AllArgsConstructor
    public enum StatusEnum {
        PENDING_APPROVAL("PENDING_APPROVAL"),
        OK("OK");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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

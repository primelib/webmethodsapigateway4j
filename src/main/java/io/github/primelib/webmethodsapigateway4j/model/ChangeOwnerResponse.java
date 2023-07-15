package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeOwnerResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "matchingAssets",
    "message",
    "status"
})
@JsonTypeName("ChangeOwnerResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeOwnerResponse {

    /**
     * Constructs a validated implementation of {@link ChangeOwnerResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeOwnerResponse(Consumer<ChangeOwnerResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("matchingAssets")
    protected Map<String, Object> matchingAssets = new HashMap<>();

    @JsonProperty("message")
    protected String message;

    @JsonProperty("status")
    protected StatusEnum status;


    @AllArgsConstructor
    public enum StatusEnum {
        PENDING_APPROVAL("PENDING_APPROVAL"),
        OK("OK");

        private final String value;
    }

}

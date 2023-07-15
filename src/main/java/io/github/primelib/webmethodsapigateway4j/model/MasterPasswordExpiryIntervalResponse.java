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
 * MasterPasswordExpiryIntervalResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message",
    "result"
})
@JsonTypeName("MasterPasswordExpiryIntervalResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordExpiryIntervalResponse {

    /**
     * Constructs a validated implementation of {@link MasterPasswordExpiryIntervalResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordExpiryIntervalResponse(Consumer<MasterPasswordExpiryIntervalResponse> spec) {
        spec.accept(this);
    }

    /**
     * The response message from the server when the master password expiry interval is updated
     */
    @JsonProperty("message")
    protected String message;

    /**
     * This is the updated master password expiry interval(in days)
     */
    @JsonProperty("result")
    protected String result;


}

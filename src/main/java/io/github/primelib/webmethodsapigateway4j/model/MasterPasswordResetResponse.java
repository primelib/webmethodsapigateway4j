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
 * MasterPasswordResetResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "handleCount",
    "message"
})
@JsonTypeName("MasterPasswordResetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordResetResponse {

    /**
     * Constructs a validated implementation of {@link MasterPasswordResetResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordResetResponse(Consumer<MasterPasswordResetResponse> spec) {
        spec.accept(this);
    }

    /**
     * The number of passwords that are updated during master password reset
     */
    @JsonProperty("handleCount")
    protected String handleCount;

    /**
     * The response message from the server when the master password is reset
     */
    @JsonProperty("message")
    protected String message;


}

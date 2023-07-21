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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordResetResponse
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
    "handleCount",
    "message"
})
@JsonTypeName("MasterPasswordResetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordResetResponse {

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

    /**
     * Constructs a validated instance of {@link MasterPasswordResetResponse}.
     *
     * @param spec the specification to process
     */
    public MasterPasswordResetResponse(Consumer<MasterPasswordResetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MasterPasswordResetResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MasterPasswordResetResponse(Consumer)} instead.
     * @param handleCount The number of passwords that are updated during master password reset
     * @param message The response message from the server when the master password is reset
     */
    @ApiStatus.Internal
    public MasterPasswordResetResponse(String handleCount, String message) {
        this.handleCount = handleCount;
        this.message = message;
    }

}

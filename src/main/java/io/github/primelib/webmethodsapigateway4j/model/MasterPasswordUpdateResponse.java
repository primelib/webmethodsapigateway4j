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
 * MasterPasswordUpdateResponse
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
    "message"
})
@JsonTypeName("MasterPasswordUpdateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordUpdateResponse {

    /**
     * The response message from the server when the master password is updated
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link MasterPasswordUpdateResponse}.
     *
     * @param spec the specification to process
     */
    public MasterPasswordUpdateResponse(Consumer<MasterPasswordUpdateResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MasterPasswordUpdateResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MasterPasswordUpdateResponse(Consumer)} instead.
     * @param message The response message from the server when the master password is updated
     */
    @ApiStatus.Internal
    public MasterPasswordUpdateResponse(String message) {
        this.message = message;
    }

}

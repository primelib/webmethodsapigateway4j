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
 * MasterPasswordUpdateResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message"
})
@JsonTypeName("MasterPasswordUpdateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordUpdateResponse {

    /**
     * Constructs a validated implementation of {@link MasterPasswordUpdateResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordUpdateResponse(Consumer<MasterPasswordUpdateResponse> spec) {
        spec.accept(this);
    }

    /**
     * The response message from the server when the master password is updated
     */
    @JsonProperty("message")
    protected String message;


}

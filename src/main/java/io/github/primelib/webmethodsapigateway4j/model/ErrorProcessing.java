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
 * ErrorProcessing
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultErrorMessage",
    "fallbackErrorMessage",
    "sendNativeProviderFault"
})
@JsonTypeName("ErrorProcessing")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ErrorProcessing {

    /**
     * Constructs a validated implementation of {@link ErrorProcessing}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ErrorProcessing(Consumer<ErrorProcessing> spec) {
        spec.accept(this);
    }

    @JsonProperty("defaultErrorMessage")
    protected String defaultErrorMessage;

    @JsonProperty("fallbackErrorMessage")
    protected String fallbackErrorMessage;

    @JsonProperty("sendNativeProviderFault")
    protected String sendNativeProviderFault;


}

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
 * ErrorProcessing
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
    "defaultErrorMessage",
    "fallbackErrorMessage",
    "sendNativeProviderFault"
})
@JsonTypeName("ErrorProcessing")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ErrorProcessing {

    @JsonProperty("defaultErrorMessage")
    protected String defaultErrorMessage;

    @JsonProperty("fallbackErrorMessage")
    protected String fallbackErrorMessage;

    @JsonProperty("sendNativeProviderFault")
    protected String sendNativeProviderFault;

    /**
     * Constructs a validated instance of {@link ErrorProcessing}.
     *
     * @param spec the specification to process
     */
    public ErrorProcessing(Consumer<ErrorProcessing> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ErrorProcessing}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ErrorProcessing(Consumer)} instead.
     * @param defaultErrorMessage var.name
     * @param fallbackErrorMessage var.name
     * @param sendNativeProviderFault var.name
     */
    @ApiStatus.Internal
    public ErrorProcessing(String defaultErrorMessage, String fallbackErrorMessage, String sendNativeProviderFault) {
        this.defaultErrorMessage = defaultErrorMessage;
        this.fallbackErrorMessage = fallbackErrorMessage;
        this.sendNativeProviderFault = sendNativeProviderFault;
    }

}

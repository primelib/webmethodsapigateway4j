package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorProcessing
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "defaultErrorMessage",
    "fallbackErrorMessage",
    "sendNativeProviderFault"
})
@JsonTypeName("ErrorProcessing")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ErrorProcessing {

    @JsonProperty("defaultErrorMessage")
    private String defaultErrorMessage;

    @JsonProperty("fallbackErrorMessage")
    private String fallbackErrorMessage;

    @JsonProperty("sendNativeProviderFault")
    private String sendNativeProviderFault;


}

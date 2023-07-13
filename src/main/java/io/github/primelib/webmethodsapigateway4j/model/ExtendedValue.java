package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtendedValue
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "endpointType",
    "key",
    "value"
})
@JsonTypeName("ExtendedValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedValue {

    /**
     * Type of endpoint for which the additional header needs to sent
     */
    @JsonProperty("endpointType")
    private EndpointTypeEnum endpointType;

    /**
     * Header name
     */
    @JsonProperty("key")
    private String key;

    /**
     * Header value
     */
    @JsonProperty("value")
    private String value;


public enum EndpointTypeEnum {
        CLIENT_REGISTRATION("CLIENT_REGISTRATION"), // Type of endpoint for which the additional header needs to sent
        CLIENT_UPDATE("CLIENT_UPDATE"), // Type of endpoint for which the additional header needs to sent
        CLIENT_DELETE("CLIENT_DELETE"), // Type of endpoint for which the additional header needs to sent
        CLIENT_READ("CLIENT_READ"), // Type of endpoint for which the additional header needs to sent
        SCOPE_CREATE("SCOPE_CREATE"), // Type of endpoint for which the additional header needs to sent
        SCOPE_READ("SCOPE_READ"), // Type of endpoint for which the additional header needs to sent
        SCOPE_DELETE("SCOPE_DELETE"), // Type of endpoint for which the additional header needs to sent
        SCOPE_UPDATE("SCOPE_UPDATE"); // Type of endpoint for which the additional header needs to sent
    
    private final String text;

    /**
     * @param text
     */
    EndpointTypeEnum(final String text) {
        this.text = text;
    }

}
}

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


    /**
     * Type of endpoint for which the additional header needs to sent
     */
    @AllArgsConstructor
    public enum EndpointTypeEnum {
        CLIENT_REGISTRATION("CLIENT_REGISTRATION"),
        CLIENT_UPDATE("CLIENT_UPDATE"),
        CLIENT_DELETE("CLIENT_DELETE"),
        CLIENT_READ("CLIENT_READ"),
        SCOPE_CREATE("SCOPE_CREATE"),
        SCOPE_READ("SCOPE_READ"),
        SCOPE_DELETE("SCOPE_DELETE"),
        SCOPE_UPDATE("SCOPE_UPDATE");

        private final String value;
    }

}

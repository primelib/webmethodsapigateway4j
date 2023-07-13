package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Endpoint
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "endpoint",
    "headers",
    "https",
    "keyAlias",
    "keyStoreAlias"
})
@JsonTypeName("OAuth2Endpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Endpoint {

    /**
     * Client registration endpoint in the authorization server
     */
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("headers")
    private Map<String, String> headers = new HashMap<>();

    @JsonProperty("https")
    private Boolean https;

    /**
     * The key alias is the private key that is used sign the request sent to the authorization server
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     */
    @JsonProperty("keyStoreAlias")
    private String keyStoreAlias;


}

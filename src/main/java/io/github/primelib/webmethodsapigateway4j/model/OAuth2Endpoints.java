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
 * OAuth2Endpoints
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "endpoints",
    "keyAlias",
    "keyStoreAlias"
})
@JsonTypeName("OAuth2Endpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Endpoints {

    @JsonProperty("endpoints")
    private Map<String, OAuth2Endpoint> endpoints = new HashMap<>();

    @JsonProperty("keyAlias")
    private String keyAlias;

    @JsonProperty("keyStoreAlias")
    private String keyStoreAlias;


}

package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DynamicClientRegistrationEndpoint
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "authInfo",
    "clientRegistrationEndpoint"
})
@JsonTypeName("DynamicClientRegistrationEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicClientRegistrationEndpoint {

    @JsonProperty("authInfo")
    private Object authInfo;

    @JsonProperty("clientRegistrationEndpoint")
    private OAuth2Endpoint clientRegistrationEndpoint;


}

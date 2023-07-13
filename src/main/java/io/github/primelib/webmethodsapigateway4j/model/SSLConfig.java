package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSLConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "keyAlias",
    "keyStoreAlias",
    "trustStoreAlias"
})
@JsonTypeName("SSLConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SSLConfig {

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

    /**
     * The truststore to be used by API Gateway when validating the incoming response from the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;


}

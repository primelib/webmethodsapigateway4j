package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SignAndEncryptConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "certificateAlias",
    "keyAlias",
    "keyStoreAlias",
    "truststoreAlias"
})
@JsonTypeName("SignAndEncryptConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SignAndEncryptConfig {

    /**
     * Select the certificate from the truststore that is used to validate the request that is sent to the native API.
     */
    @JsonProperty("certificateAlias")
    private String certificateAlias;

    /**
     * The key alias is the private key that is used sign the request sent to the native API
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * Specify the keystore that needs to be used by API Gateway while sending the request to the native API. A keystore is a repository of private key and its corresponding public certificate
     */
    @JsonProperty("keyStoreAlias")
    private String keyStoreAlias;

    /**
     * The truststore to be used by API Gateway when sending the request to the native API. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("truststoreAlias")
    private String truststoreAlias;


}

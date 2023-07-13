package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LocalIntrospectionConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "certificateAlias",
    "description",
    "issuer",
    "jwksuri",
    "trustStoreAlias"
})
@JsonTypeName("LocalIntrospectionConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LocalIntrospectionConfig {

    /**
     * Select the certificate from the truststore that is used to validate the token.
     */
    @JsonProperty("certificateAlias")
    private String certificateAlias;

    /**
     * Third party issuer description
     */
    @JsonProperty("description")
    private String description;

    /**
     * Third party issuer name
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * JSON Web Key URI
     */
    @JsonProperty("jwksuri")
    private String jwksuri;

    /**
     * The truststore to be used by API Gateway when validating the token issued by the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;


}

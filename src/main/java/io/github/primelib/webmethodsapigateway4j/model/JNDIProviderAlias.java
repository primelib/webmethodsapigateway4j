package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JNDIProviderAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "description",
    "initialContextFactory",
    "isSSL",
    "jndiAliasName",
    "jndiProviderAliasId",
    "keyAlias",
    "keyStoreAlias",
    "keyStoreFormatProp",
    "keyStoreProp",
    "keyStorePwdProp",
    "otherProps",
    "privateKeyProp",
    "providerURL",
    "providerURLFailoverList",
    "securityCredentials",
    "securityPrincipal",
    "trustStoreAlias",
    "trustStoreProp",
    "trustStorePwdProp"
})
@JsonTypeName("JNDIProviderAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JNDIProviderAlias {

    /**
     * The description of the JNDIProviderAlias configuration
     */
    @JsonProperty("description")
    private String description;

    /**
     * The IntialContextFactoryName for JNDI lookup
     */
    @JsonProperty("initialContextFactory")
    private String initialContextFactory;

    /**
     * Secure communication between Integration Server and the JNDI provider
     */
    @JsonProperty("isSSL")
    private String isSSL;

    /**
     * The name of the JNDIProviderAlias configuration
     */
    @JsonProperty("jndiAliasName")
    private String jndiAliasName;

    /**
     * A unique ID for the jndiProviderAlias
     */
    @JsonProperty("jndiProviderAliasId")
    private String jndiProviderAliasId;

    /**
     * The alias to the key that contains the private key for connecting to the JNDI provider. 
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * The alias for the keystore that contains the client certificates for Integration Server to use when connecting to the JNDI provider.
     */
    @JsonProperty("keyStoreAlias")
    private String keyStoreAlias;

    /**
     * The JNDI property name for storing the keystore format.
     */
    @JsonProperty("keyStoreFormatProp")
    private String keyStoreFormatProp;

    /**
     * The JNDI property name for storing the keystore location.
     */
    @JsonProperty("keyStoreProp")
    private String keyStoreProp;

    /**
     * The JNDI property name for storing the keystore password.
     */
    @JsonProperty("keyStorePwdProp")
    private String keyStorePwdProp;

    /**
     * Any other properties you would like to mention, Provide the values as comma separated
     */
    @JsonProperty("otherProps")
    private String otherProps;

    /**
     * The JNDI property name for storing the private key name.
     */
    @JsonProperty("privateKeyProp")
    private String privateKeyProp;

    /**
     * Message broker details
     */
    @JsonProperty("providerURL")
    private String providerURL;

    /**
     * Fall backs URL's of providerURL
     */
    @JsonProperty("providerURLFailoverList")
    private String providerURLFailoverList;

    /**
     * securityCredentials in case of SSL connection
     */
    @JsonProperty("securityCredentials")
    private String securityCredentials;

    /**
     * SecurityPrincipal in case of SSL connection
     */
    @JsonProperty("securityPrincipal")
    private String securityPrincipal;

    /**
     * The alias for the truststore that contains the certificates of the Certificate Authority (CA) for the JNDI provider.
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;

    /**
     * The JNDI property name for storing the truststore location.
     */
    @JsonProperty("trustStoreProp")
    private String trustStoreProp;

    /**
     * The JNDI property name for storing the truststore password.
     */
    @JsonProperty("trustStorePwdProp")
    private String trustStorePwdProp;


}

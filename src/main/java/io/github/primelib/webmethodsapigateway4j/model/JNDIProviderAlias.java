package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JNDIProviderAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JNDIProviderAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JNDIProviderAlias(Consumer<JNDIProviderAlias> spec) {
        spec.accept(this);
    }

    /**
     * The description of the JNDIProviderAlias configuration
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The IntialContextFactoryName for JNDI lookup
     */
    @JsonProperty("initialContextFactory")
    protected String initialContextFactory;

    /**
     * Secure communication between Integration Server and the JNDI provider
     */
    @JsonProperty("isSSL")
    protected String isSSL;

    /**
     * The name of the JNDIProviderAlias configuration
     */
    @JsonProperty("jndiAliasName")
    protected String jndiAliasName;

    /**
     * A unique ID for the jndiProviderAlias
     */
    @JsonProperty("jndiProviderAliasId")
    protected String jndiProviderAliasId;

    /**
     * The alias to the key that contains the private key for connecting to the JNDI provider. 
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * The alias for the keystore that contains the client certificates for Integration Server to use when connecting to the JNDI provider.
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * The JNDI property name for storing the keystore format.
     */
    @JsonProperty("keyStoreFormatProp")
    protected String keyStoreFormatProp;

    /**
     * The JNDI property name for storing the keystore location.
     */
    @JsonProperty("keyStoreProp")
    protected String keyStoreProp;

    /**
     * The JNDI property name for storing the keystore password.
     */
    @JsonProperty("keyStorePwdProp")
    protected String keyStorePwdProp;

    /**
     * Any other properties you would like to mention, Provide the values as comma separated
     */
    @JsonProperty("otherProps")
    protected String otherProps;

    /**
     * The JNDI property name for storing the private key name.
     */
    @JsonProperty("privateKeyProp")
    protected String privateKeyProp;

    /**
     * Message broker details
     */
    @JsonProperty("providerURL")
    protected String providerURL;

    /**
     * Fall backs URL's of providerURL
     */
    @JsonProperty("providerURLFailoverList")
    protected String providerURLFailoverList;

    /**
     * securityCredentials in case of SSL connection
     */
    @JsonProperty("securityCredentials")
    protected String securityCredentials;

    /**
     * SecurityPrincipal in case of SSL connection
     */
    @JsonProperty("securityPrincipal")
    protected String securityPrincipal;

    /**
     * The alias for the truststore that contains the certificates of the Certificate Authority (CA) for the JNDI provider.
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;

    /**
     * The JNDI property name for storing the truststore location.
     */
    @JsonProperty("trustStoreProp")
    protected String trustStoreProp;

    /**
     * The JNDI property name for storing the truststore password.
     */
    @JsonProperty("trustStorePwdProp")
    protected String trustStorePwdProp;


}

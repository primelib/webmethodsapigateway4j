// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AdminJndiprovIDErAlias
 * <p>
 * This model contains JNDI configuration details
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminJndiprovIDErAlias")
@JsonPropertyOrder({
    "description",
    "initialContextFactory",
    "isSsl",
    "jndiAliasName",
    "jndiProviderAliasId",
    "keyAlias",
    "keyStoreAlias",
    "keyStoreFormatProp",
    "keyStoreProp",
    "keyStorePwdProp",
    "otherProps",
    "privateKeyProp",
    "providerUrl",
    "providerUrlfailoverList",
    "securityCredentials",
    "securityPrincipal",
    "trustStoreAlias",
    "trustStoreProp",
    "trustStorePwdProp"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AdminJndiprovIDErAlias {

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
    protected String isSsl;

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
    protected String providerUrl;

    /**
     * Fall backs URL's of providerURL
     */
    @JsonProperty("providerURLFailoverList")
    protected String providerUrlfailoverList;

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

    /**
     * Constructs a validated instance of {@link AdminJndiprovIDErAlias}.
     *
     * @param spec the specification to process
     */
    public AdminJndiprovIDErAlias(Consumer<AdminJndiprovIDErAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminJndiprovIDErAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminJndiprovIDErAlias(Consumer)} instead.
     * @param description The description of the JNDIProviderAlias configuration
     * @param initialContextFactory The IntialContextFactoryName for JNDI lookup
     * @param isSsl Secure communication between Integration Server and the JNDI provider
     * @param jndiAliasName The name of the JNDIProviderAlias configuration
     * @param jndiProviderAliasId A unique ID for the jndiProviderAlias
     * @param keyAlias The alias to the key that contains the private key for connecting to the JNDI provider. 
     * @param keyStoreAlias The alias for the keystore that contains the client certificates for Integration Server to use when connecting to the JNDI provider.
     * @param keyStoreFormatProp The JNDI property name for storing the keystore format.
     * @param keyStoreProp The JNDI property name for storing the keystore location.
     * @param keyStorePwdProp The JNDI property name for storing the keystore password.
     * @param otherProps Any other properties you would like to mention, Provide the values as comma separated
     * @param privateKeyProp The JNDI property name for storing the private key name.
     * @param providerUrl Message broker details
     * @param providerUrlfailoverList Fall backs URL's of providerURL
     * @param securityCredentials securityCredentials in case of SSL connection
     * @param securityPrincipal SecurityPrincipal in case of SSL connection
     * @param trustStoreAlias The alias for the truststore that contains the certificates of the Certificate Authority (CA) for the JNDI provider.
     * @param trustStoreProp The JNDI property name for storing the truststore location.
     * @param trustStorePwdProp The JNDI property name for storing the truststore password.
     */
    @ApiStatus.Internal
    public AdminJndiprovIDErAlias(String description, String initialContextFactory, String isSsl, String jndiAliasName, String jndiProviderAliasId, String keyAlias, String keyStoreAlias, String keyStoreFormatProp, String keyStoreProp, String keyStorePwdProp, String otherProps, String privateKeyProp, String providerUrl, String providerUrlfailoverList, String securityCredentials, String securityPrincipal, String trustStoreAlias, String trustStoreProp, String trustStorePwdProp) {
        this.description = description;
        this.initialContextFactory = initialContextFactory;
        this.isSsl = isSsl;
        this.jndiAliasName = jndiAliasName;
        this.jndiProviderAliasId = jndiProviderAliasId;
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
        this.keyStoreFormatProp = keyStoreFormatProp;
        this.keyStoreProp = keyStoreProp;
        this.keyStorePwdProp = keyStorePwdProp;
        this.otherProps = otherProps;
        this.privateKeyProp = privateKeyProp;
        this.providerUrl = providerUrl;
        this.providerUrlfailoverList = providerUrlfailoverList;
        this.securityCredentials = securityCredentials;
        this.securityPrincipal = securityPrincipal;
        this.trustStoreAlias = trustStoreAlias;
        this.trustStoreProp = trustStoreProp;
        this.trustStorePwdProp = trustStorePwdProp;
    }
}

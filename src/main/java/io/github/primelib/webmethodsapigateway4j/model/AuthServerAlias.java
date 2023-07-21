package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuthServerAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "authServerType",
    "dcrEndpoint",
    "localIntrospectionConfig",
    "metadata",
    "providerName",
    "remoteISConfig",
    "remoteIntrospectionConfig",
    "scopes",
    "sslConfig",
    "supportedGrantTypes",
    "tokenGeneratorConfig"
})
@JsonTypeName("AuthServerAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuthServerAlias extends Alias {

    /**
     * Type of the authorization server
     */
    @JsonProperty("authServerType")
    protected AuthServerTypeEnum authServerType;

    @JsonProperty("dcrEndpoint")
    protected DynamicClientRegistrationEndpoint dcrEndpoint;

    @JsonProperty("localIntrospectionConfig")
    protected LocalIntrospectionConfig localIntrospectionConfig;

    @JsonProperty("metadata")
    protected Metadata metadata;

    /**
     * Name of the provider which was created using ClientMetadataMapping alias, used in the Dynamic client registration
     */
    @JsonProperty("providerName")
    protected String providerName;

    @JsonProperty("remoteISConfig")
    protected RemoteISConfig remoteISConfig;

    @JsonProperty("remoteIntrospectionConfig")
    protected RemoteIntrospectionConfig remoteIntrospectionConfig;

    /**
     * List of scopes available in the authorization server
     */
    @JsonProperty("scopes")
    protected Set<Scope> scopes;

    @JsonProperty("sslConfig")
    protected SSLConfig sslConfig;

    /**
     * List of grant types supported by the authorization server
     */
    @JsonProperty("supportedGrantTypes")
    protected List<String> supportedGrantTypes;

    @JsonProperty("tokenGeneratorConfig")
    protected TokenGeneratorConfig tokenGeneratorConfig;

    /**
     * Constructs a validated instance of {@link AuthServerAlias}.
     *
     * @param spec the specification to process
     */
    public AuthServerAlias(Consumer<AuthServerAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuthServerAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuthServerAlias(Consumer)} instead.
     * @param authServerType Type of the authorization server
     * @param dcrEndpoint var.name
     * @param localIntrospectionConfig var.name
     * @param metadata var.name
     * @param providerName Name of the provider which was created using ClientMetadataMapping alias, used in the Dynamic client registration
     * @param remoteISConfig var.name
     * @param remoteIntrospectionConfig var.name
     * @param scopes List of scopes available in the authorization server
     * @param sslConfig var.name
     * @param supportedGrantTypes List of grant types supported by the authorization server
     * @param tokenGeneratorConfig var.name
     */
    @ApiStatus.Internal
    public AuthServerAlias(AuthServerTypeEnum authServerType, DynamicClientRegistrationEndpoint dcrEndpoint, LocalIntrospectionConfig localIntrospectionConfig, Metadata metadata, String providerName, RemoteISConfig remoteISConfig, RemoteIntrospectionConfig remoteIntrospectionConfig, Set<Scope> scopes, SSLConfig sslConfig, List<String> supportedGrantTypes, TokenGeneratorConfig tokenGeneratorConfig) {
        this.authServerType = authServerType;
        this.dcrEndpoint = dcrEndpoint;
        this.localIntrospectionConfig = localIntrospectionConfig;
        this.metadata = metadata;
        this.providerName = providerName;
        this.remoteISConfig = remoteISConfig;
        this.remoteIntrospectionConfig = remoteIntrospectionConfig;
        this.scopes = scopes;
        this.sslConfig = sslConfig;
        this.supportedGrantTypes = supportedGrantTypes;
        this.tokenGeneratorConfig = tokenGeneratorConfig;
    }

    /**
     * Type of the authorization server
     */
    @AllArgsConstructor
    public enum AuthServerTypeEnum {
        LOCAL_IS("LOCAL_IS"),
        REMOTE_IS("REMOTE_IS"),
        EXTERNAL("EXTERNAL");

        private final String value;
    }

}

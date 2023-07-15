package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
     * Constructs a validated implementation of {@link AuthServerAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuthServerAlias(Consumer<AuthServerAlias> spec) {
        spec.accept(this);
    }

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

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * Type of the authorization server
     */
    @JsonProperty("authServerType")
    private AuthServerTypeEnum authServerType;

    @JsonProperty("dcrEndpoint")
    private DynamicClientRegistrationEndpoint dcrEndpoint;

    @JsonProperty("localIntrospectionConfig")
    private LocalIntrospectionConfig localIntrospectionConfig;

    @JsonProperty("metadata")
    private Metadata metadata;

    /**
     * Name of the provider which was created using ClientMetadataMapping alias, used in the Dynamic client registration
     */
    @JsonProperty("providerName")
    private String providerName;

    @JsonProperty("remoteISConfig")
    private RemoteISConfig remoteISConfig;

    @JsonProperty("remoteIntrospectionConfig")
    private RemoteIntrospectionConfig remoteIntrospectionConfig;

    /**
     * List of scopes available in the authorization server
     */
    @JsonProperty("scopes")
    private Set<Scope> scopes;

    @JsonProperty("sslConfig")
    private SSLConfig sslConfig;

    /**
     * List of grant types supported by the authorization server
     */
    @JsonProperty("supportedGrantTypes")
    private List<String> supportedGrantTypes;

    @JsonProperty("tokenGeneratorConfig")
    private TokenGeneratorConfig tokenGeneratorConfig;


public enum AuthServerTypeEnum {
        LOCAL_IS("LOCAL_IS"), // Type of the authorization server
        REMOTE_IS("REMOTE_IS"), // Type of the authorization server
        EXTERNAL("EXTERNAL"); // Type of the authorization server
    
    private final String text;

    /**
     * @param text
     */
    AuthServerTypeEnum(final String text) {
        this.text = text;
    }

}
}

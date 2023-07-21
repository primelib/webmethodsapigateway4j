package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DynamicClientRegistrationConfig
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "allowedGrantTypes",
    "applicationType",
    "clientId",
    "clientName",
    "clientSecret",
    "clientType",
    "clientVersion",
    "expirationInterval",
    "pkceType",
    "redirectUris",
    "refreshCount",
    "scopes"
})
@JsonTypeName("DynamicClientRegistrationConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicClientRegistrationConfig {

    /**
     * grant types to be allowed for this client
     */
    @JsonProperty("allowedGrantTypes")
    protected List<AllowedGrantTypesEnum> allowedGrantTypes;

    /**
     * type of the application
     */
    @JsonProperty("applicationType")
    protected String applicationType;

    /**
     * The client id
     */
    @JsonProperty("clientId")
    protected String clientId;

    /**
     * The client name
     */
    @JsonProperty("clientName")
    protected String clientName;

    /**
     * The client secret
     */
    @JsonProperty("clientSecret")
    protected String clientSecret;

    /**
     * specifies whether the client is either public or confidential client
     */
    @JsonProperty("clientType")
    protected ClientTypeEnum clientType;

    /**
     * The client version
     */
    @JsonProperty("clientVersion")
    protected String clientVersion;

    /**
     * Token expiry time
     */
    @JsonProperty("expirationInterval")
    protected String expirationInterval;

    /**
     * OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     */
    @JsonProperty("pkceType")
    protected PkceTypeEnum pkceType;

    /**
     * The redirect uris
     */
    @JsonProperty("redirectUris")
    protected List<String> redirectUris;

    /**
     * The number of times token can be refreshed
     */
    @JsonProperty("refreshCount")
    protected String refreshCount;

    /**
     * The scopes associated with this client
     */
    @JsonProperty("scopes")
    protected List<String> scopes;

    /**
     * Constructs a validated instance of {@link DynamicClientRegistrationConfig}.
     *
     * @param spec the specification to process
     */
    public DynamicClientRegistrationConfig(Consumer<DynamicClientRegistrationConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DynamicClientRegistrationConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DynamicClientRegistrationConfig(Consumer)} instead.
     * @param allowedGrantTypes grant types to be allowed for this client
     * @param applicationType type of the application
     * @param clientId The client id
     * @param clientName The client name
     * @param clientSecret The client secret
     * @param clientType specifies whether the client is either public or confidential client
     * @param clientVersion The client version
     * @param expirationInterval Token expiry time
     * @param pkceType OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     * @param redirectUris The redirect uris
     * @param refreshCount The number of times token can be refreshed
     * @param scopes The scopes associated with this client
     */
    @ApiStatus.Internal
    public DynamicClientRegistrationConfig(List<AllowedGrantTypesEnum> allowedGrantTypes, String applicationType, String clientId, String clientName, String clientSecret, ClientTypeEnum clientType, String clientVersion, String expirationInterval, PkceTypeEnum pkceType, List<String> redirectUris, String refreshCount, List<String> scopes) {
        this.allowedGrantTypes = allowedGrantTypes;
        this.applicationType = applicationType;
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSecret = clientSecret;
        this.clientType = clientType;
        this.clientVersion = clientVersion;
        this.expirationInterval = expirationInterval;
        this.pkceType = pkceType;
        this.redirectUris = redirectUris;
        this.refreshCount = refreshCount;
        this.scopes = scopes;
    }

    /**
     * grant types to be allowed for this client
     */
    @AllArgsConstructor
    public enum AllowedGrantTypesEnum {
        AUTHORIZATION_CODE("authorization_code"),
        PASSWORD("password"),
        CLIENT_CREDENTIALS("client_credentials"),
        REFRESH_TOKEN("refresh_token"),
        IMPLICIT("implicit");

        private final String value;
    }

    /**
     * specifies whether the client is either public or confidential client
     */
    @AllArgsConstructor
    public enum ClientTypeEnum {
        PUBLIC("PUBLIC"),
        CONFIDENTIAL("CONFIDENTIAL");

        private final String value;
    }

    /**
     * OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     */
    @AllArgsConstructor
    public enum PkceTypeEnum {
        NOT_ENFORCED("NOT_ENFORCED"),
        ENFORCED("ENFORCED"),
        USE_GLOBAL_SETTING("USE_GLOBAL_SETTING");

        private final String value;
    }

}

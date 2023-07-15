package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DynamicClientRegistrationConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link DynamicClientRegistrationConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DynamicClientRegistrationConfig(Consumer<DynamicClientRegistrationConfig> spec) {
        spec.accept(this);
    }

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

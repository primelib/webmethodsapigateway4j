package io.github.primelib.webmethodsapigateway4j.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OpenIDProviderAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "authorizationEndpoint",
    "clientId",
    "clientSecret",
    "includeUserinfoClaims",
    "issuer",
    "jwksUri",
    "maxAge",
    "openIDDisplayValue",
    "openIDGrantType",
    "openIDResponseType",
    "openIDScopes",
    "openIDTokenEndpointAuthMode",
    "prompt",
    "redirectionEndpointHost",
    "redirectionEndpointPort",
    "tokenEndpoint",
    "trustStoreAlias",
    "uiLocales",
    "userinfoEndpoint"
})
@JsonTypeName("OpenIDProviderAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OpenIDProviderAlias extends Alias {

    @JsonProperty("authorizationEndpoint")
    protected String authorizationEndpoint;

    @JsonProperty("clientId")
    protected String clientId;

    @JsonProperty("clientSecret")
    protected String clientSecret;

    @JsonProperty("includeUserinfoClaims")
    protected Boolean includeUserinfoClaims;

    @JsonProperty("issuer")
    protected String issuer;

    @JsonProperty("jwksUri")
    protected String jwksUri;

    @JsonProperty("maxAge")
    protected String maxAge;

    @JsonProperty("openIDDisplayValue")
    protected OpenIDDisplayValueEnum openIDDisplayValue;

    @JsonProperty("openIDGrantType")
    protected OpenIDGrantTypeEnum openIDGrantType;

    @JsonProperty("openIDResponseType")
    protected OpenIDResponseTypeEnum openIDResponseType;

    @JsonProperty("openIDScopes")
    protected List<String> openIDScopes;

    @JsonProperty("openIDTokenEndpointAuthMode")
    protected OpenIDTokenEndpointAuthModeEnum openIDTokenEndpointAuthMode;

    @JsonProperty("prompt")
    protected PromptEnum prompt;

    @JsonProperty("redirectionEndpointHost")
    protected String redirectionEndpointHost;

    @JsonProperty("redirectionEndpointPort")
    protected String redirectionEndpointPort;

    @JsonProperty("tokenEndpoint")
    protected String tokenEndpoint;

    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;

    @JsonProperty("uiLocales")
    protected String uiLocales;

    @JsonProperty("userinfoEndpoint")
    protected String userinfoEndpoint;

    /**
     * Constructs a validated instance of {@link OpenIDProviderAlias}.
     *
     * @param spec the specification to process
     */
    public OpenIDProviderAlias(Consumer<OpenIDProviderAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OpenIDProviderAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OpenIDProviderAlias(Consumer)} instead.
     * @param authorizationEndpoint authorizationEndpoint
     * @param clientId clientId
     * @param clientSecret clientSecret
     * @param includeUserinfoClaims includeUserinfoClaims
     * @param issuer issuer
     * @param jwksUri jwksUri
     * @param maxAge maxAge
     * @param openIDDisplayValue openIDDisplayValue
     * @param openIDGrantType openIDGrantType
     * @param openIDResponseType openIDResponseType
     * @param openIDScopes openIDScopes
     * @param openIDTokenEndpointAuthMode openIDTokenEndpointAuthMode
     * @param prompt prompt
     * @param redirectionEndpointHost redirectionEndpointHost
     * @param redirectionEndpointPort redirectionEndpointPort
     * @param tokenEndpoint tokenEndpoint
     * @param trustStoreAlias trustStoreAlias
     * @param uiLocales uiLocales
     * @param userinfoEndpoint userinfoEndpoint
     */
    @ApiStatus.Internal
    public OpenIDProviderAlias(String authorizationEndpoint, String clientId, String clientSecret, Boolean includeUserinfoClaims, String issuer, String jwksUri, String maxAge, OpenIDDisplayValueEnum openIDDisplayValue, OpenIDGrantTypeEnum openIDGrantType, OpenIDResponseTypeEnum openIDResponseType, List<String> openIDScopes, OpenIDTokenEndpointAuthModeEnum openIDTokenEndpointAuthMode, PromptEnum prompt, String redirectionEndpointHost, String redirectionEndpointPort, String tokenEndpoint, String trustStoreAlias, String uiLocales, String userinfoEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.includeUserinfoClaims = includeUserinfoClaims;
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.maxAge = maxAge;
        this.openIDDisplayValue = openIDDisplayValue;
        this.openIDGrantType = openIDGrantType;
        this.openIDResponseType = openIDResponseType;
        this.openIDScopes = openIDScopes;
        this.openIDTokenEndpointAuthMode = openIDTokenEndpointAuthMode;
        this.prompt = prompt;
        this.redirectionEndpointHost = redirectionEndpointHost;
        this.redirectionEndpointPort = redirectionEndpointPort;
        this.tokenEndpoint = tokenEndpoint;
        this.trustStoreAlias = trustStoreAlias;
        this.uiLocales = uiLocales;
        this.userinfoEndpoint = userinfoEndpoint;
    }

    @AllArgsConstructor
    public enum OpenIDDisplayValueEnum {
        NONE("none"),
        PAGE("page"),
        POPUP("popup"),
        TOUCH("touch"),
        WAP("wap");

        private static final OpenIDDisplayValueEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OpenIDDisplayValueEnum of(String input) {
            if (input != null) {
                for (OpenIDDisplayValueEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum OpenIDGrantTypeEnum {
        AUTHORIZATION_CODE("authorization_code");

        private static final OpenIDGrantTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OpenIDGrantTypeEnum of(String input) {
            if (input != null) {
                for (OpenIDGrantTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum OpenIDResponseTypeEnum {
        CODE("code"),
        ID_TOKEN("id_token"),
        TOKEN_ID_TOKEN("token id_token"),
        ID_TOKEN_TOKEN("id_token token");

        private static final OpenIDResponseTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OpenIDResponseTypeEnum of(String input) {
            if (input != null) {
                for (OpenIDResponseTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum OpenIDTokenEndpointAuthModeEnum {
        CLIENT_SECRET_BASIC("client_secret_basic"),
        CLIENT_SECRET_POST("client_secret_post"),
        NONE("none");

        private static final OpenIDTokenEndpointAuthModeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OpenIDTokenEndpointAuthModeEnum of(String input) {
            if (input != null) {
                for (OpenIDTokenEndpointAuthModeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum PromptEnum {
        NONE("none"),
        LOGIN("login"),
        CONSENT("consent"),
        SELECT_ACCOUNT("select_account");

        private static final PromptEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PromptEnum of(String input) {
            if (input != null) {
                for (PromptEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

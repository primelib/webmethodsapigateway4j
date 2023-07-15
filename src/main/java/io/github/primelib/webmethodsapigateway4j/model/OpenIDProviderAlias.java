package io.github.primelib.webmethodsapigateway4j.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OpenIDProviderAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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

    /**
     * Constructs a validated implementation of {@link OpenIDProviderAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OpenIDProviderAlias(Consumer<OpenIDProviderAlias> spec) {
        spec.accept(this);
    }

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


    @AllArgsConstructor
    public enum OpenIDDisplayValueEnum {
        NONE("none"),
        PAGE("page"),
        POPUP("popup"),
        TOUCH("touch"),
        WAP("wap");

        private final String value;
    }

    @AllArgsConstructor
    public enum OpenIDGrantTypeEnum {
        AUTHORIZATION_CODE("authorization_code");

        private final String value;
    }

    @AllArgsConstructor
    public enum OpenIDResponseTypeEnum {
        CODE("code"),
        ID_TOKEN("id_token"),
        TOKEN_ID_TOKEN("token id_token"),
        ID_TOKEN_TOKEN("id_token token");

        private final String value;
    }

    @AllArgsConstructor
    public enum OpenIDTokenEndpointAuthModeEnum {
        CLIENT_SECRET_BASIC("client_secret_basic"),
        CLIENT_SECRET_POST("client_secret_post"),
        NONE("none");

        private final String value;
    }

    @AllArgsConstructor
    public enum PromptEnum {
        NONE("none"),
        LOGIN("login"),
        CONSENT("consent"),
        SELECT_ACCOUNT("select_account");

        private final String value;
    }

}

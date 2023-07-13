package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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

    @JsonProperty("authorizationEndpoint")
    private String authorizationEndpoint;

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("clientSecret")
    private String clientSecret;

    @JsonProperty("includeUserinfoClaims")
    private Boolean includeUserinfoClaims;

    @JsonProperty("issuer")
    private String issuer;

    @JsonProperty("jwksUri")
    private String jwksUri;

    @JsonProperty("maxAge")
    private String maxAge;

    @JsonProperty("openIDDisplayValue")
    private OpenIDDisplayValueEnum openIDDisplayValue;

    @JsonProperty("openIDGrantType")
    private OpenIDGrantTypeEnum openIDGrantType;

    @JsonProperty("openIDResponseType")
    private OpenIDResponseTypeEnum openIDResponseType;

    @JsonProperty("openIDScopes")
    private List<String> openIDScopes;

    @JsonProperty("openIDTokenEndpointAuthMode")
    private OpenIDTokenEndpointAuthModeEnum openIDTokenEndpointAuthMode;

    @JsonProperty("prompt")
    private PromptEnum prompt;

    @JsonProperty("redirectionEndpointHost")
    private String redirectionEndpointHost;

    @JsonProperty("redirectionEndpointPort")
    private String redirectionEndpointPort;

    @JsonProperty("tokenEndpoint")
    private String tokenEndpoint;

    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;

    @JsonProperty("uiLocales")
    private String uiLocales;

    @JsonProperty("userinfoEndpoint")
    private String userinfoEndpoint;


public enum OpenIDDisplayValueEnum {
        NONE("none"),
        PAGE("page"),
        POPUP("popup"),
        TOUCH("touch"),
        WAP("wap");
    
    private final String text;

    /**
     * @param text
     */
    OpenIDDisplayValueEnum(final String text) {
        this.text = text;
    }

}
public enum OpenIDGrantTypeEnum {
        AUTHORIZATION_CODE("authorization_code");
    
    private final String text;

    /**
     * @param text
     */
    OpenIDGrantTypeEnum(final String text) {
        this.text = text;
    }

}
public enum OpenIDResponseTypeEnum {
        CODE("code"),
        ID_TOKEN("id_token"),
        TOKEN_ID_TOKEN("token id_token"),
        ID_TOKEN_TOKEN("id_token token");
    
    private final String text;

    /**
     * @param text
     */
    OpenIDResponseTypeEnum(final String text) {
        this.text = text;
    }

}
public enum OpenIDTokenEndpointAuthModeEnum {
        CLIENT_SECRET_BASIC("client_secret_basic"),
        CLIENT_SECRET_POST("client_secret_post"),
        NONE("none");
    
    private final String text;

    /**
     * @param text
     */
    OpenIDTokenEndpointAuthModeEnum(final String text) {
        this.text = text;
    }

}
public enum PromptEnum {
        NONE("none"),
        LOGIN("login"),
        CONSENT("consent"),
        SELECT_ACCOUNT("select_account");
    
    private final String text;

    /**
     * @param text
     */
    PromptEnum(final String text) {
        this.text = text;
    }

}
}

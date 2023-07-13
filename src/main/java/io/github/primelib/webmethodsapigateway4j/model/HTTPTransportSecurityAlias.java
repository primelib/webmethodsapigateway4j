package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTPTransportSecurityAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "authMode",
    "authType",
    "httpAuthCredentials",
    "kerberosCredentials",
    "oauth2Token"
})
@JsonTypeName("HTTPTransportSecurityAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HTTPTransportSecurityAlias extends Alias {

    /**
     * Mode of authentication that needs to be used
     */
    @JsonProperty("authMode")
    private AuthModeEnum authMode;

    /**
     * type of authentication you want to use while communicating with the native API
     */
    @JsonProperty("authType")
    private AuthTypeEnum authType;

    @JsonProperty("httpAuthCredentials")
    private Credentials httpAuthCredentials;

    @JsonProperty("kerberosCredentials")
    private KerberosCredentials kerberosCredentials;

    /**
     * Specify a base64 encoded OAuth2 token that is used for authentication
     */
    @JsonProperty("oauth2Token")
    private String oauth2Token;


public enum AuthModeEnum {
        NEW("NEW"), // Mode of authentication that needs to be used
        INCOMING_HTTP_BASIC_AUTH("INCOMING_HTTP_BASIC_AUTH"), // Mode of authentication that needs to be used
        INCOMING_WSS_USER("INCOMING_WSS_USER"), // Mode of authentication that needs to be used
        INCOMING_X509("INCOMING_X509"), // Mode of authentication that needs to be used
        DELEGATE_INCOMING("DELEGATE_INCOMING"), // Mode of authentication that needs to be used
        INCOMING_OAUTH_TOKEN("INCOMING_OAUTH_TOKEN"), // Mode of authentication that needs to be used
        INCOMING_JWT("INCOMING_JWT"), // Mode of authentication that needs to be used
        TRANSPARENT("TRANSPARENT"), // Mode of authentication that needs to be used
        INCOMING_KERBEROS("INCOMING_KERBEROS"); // Mode of authentication that needs to be used
    
    private final String text;

    /**
     * @param text
     */
    AuthModeEnum(final String text) {
        this.text = text;
    }

}
public enum AuthTypeEnum {
        HTTP_BASIC("HTTP_BASIC"), // type of authentication you want to use while communicating with the native API
        NTLM("NTLM"), // type of authentication you want to use while communicating with the native API
        OAUTH2("OAUTH2"), // type of authentication you want to use while communicating with the native API
        KERBEROS("KERBEROS"), // type of authentication you want to use while communicating with the native API
        JWT("JWT"), // type of authentication you want to use while communicating with the native API
        ALIAS("ALIAS"), // type of authentication you want to use while communicating with the native API
        REMOVE_INCOMING_HTTP_HEADERS("REMOVE_INCOMING_HTTP_HEADERS"); // type of authentication you want to use while communicating with the native API
    
    private final String text;

    /**
     * @param text
     */
    AuthTypeEnum(final String text) {
        this.text = text;
    }

}
}

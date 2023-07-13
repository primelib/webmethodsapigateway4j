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
 * SOAPMessageSecurityAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "authMode",
    "authType",
    "kerberosCredentials",
    "samlIssuerConfig",
    "signAndEncryptConfig",
    "wssCredentials"
})
@JsonTypeName("SOAPMessageSecurityAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPMessageSecurityAlias extends Alias {

    /**
     * Mode of authentication
     */
    @JsonProperty("authMode")
    private AuthModeEnum authMode;

    /**
     * Type of authentication that needs to be used
     */
    @JsonProperty("authType")
    private AuthTypeEnum authType;

    @JsonProperty("kerberosCredentials")
    private KerberosCredentials kerberosCredentials;

    /**
     * Saml issuer configuration name
     */
    @JsonProperty("samlIssuerConfig")
    private String samlIssuerConfig;

    @JsonProperty("signAndEncryptConfig")
    private SignAndEncryptConfig signAndEncryptConfig;

    @JsonProperty("wssCredentials")
    private WssCredentials wssCredentials;


public enum AuthModeEnum {
        NEW("NEW"), // Mode of authentication
        INCOMING_HTTP_BASIC_AUTH("INCOMING_HTTP_BASIC_AUTH"), // Mode of authentication
        INCOMING_WSS_USER("INCOMING_WSS_USER"), // Mode of authentication
        INCOMING_X509("INCOMING_X509"), // Mode of authentication
        DELEGATE_INCOMING("DELEGATE_INCOMING"), // Mode of authentication
        INCOMING_OAUTH_TOKEN("INCOMING_OAUTH_TOKEN"), // Mode of authentication
        INCOMING_JWT("INCOMING_JWT"), // Mode of authentication
        TRANSPARENT("TRANSPARENT"), // Mode of authentication
        INCOMING_KERBEROS("INCOMING_KERBEROS"); // Mode of authentication
    
    private final String text;

    /**
     * @param text
     */
    AuthModeEnum(final String text) {
        this.text = text;
    }

}
public enum AuthTypeEnum {
        WSS_USERNAME("WSS_USERNAME"), // Type of authentication that needs to be used
        SAML("SAML"), // Type of authentication that needs to be used
        KERBEROS("KERBEROS"), // Type of authentication that needs to be used
        ALIAS("ALIAS"), // Type of authentication that needs to be used
        REMOVE_WSS_HEADERS("REMOVE_WSS_HEADERS"), // Type of authentication that needs to be used
        NONE("NONE"); // Type of authentication that needs to be used
    
    private final String text;

    /**
     * @param text
     */
    AuthTypeEnum(final String text) {
        this.text = text;
    }

}
}

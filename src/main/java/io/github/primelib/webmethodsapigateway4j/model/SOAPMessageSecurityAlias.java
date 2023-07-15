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


    /**
     * Mode of authentication
     */
    @AllArgsConstructor
    public enum AuthModeEnum {
        NEW("NEW"),
        INCOMING_HTTP_BASIC_AUTH("INCOMING_HTTP_BASIC_AUTH"),
        INCOMING_WSS_USER("INCOMING_WSS_USER"),
        INCOMING_X509("INCOMING_X509"),
        DELEGATE_INCOMING("DELEGATE_INCOMING"),
        INCOMING_OAUTH_TOKEN("INCOMING_OAUTH_TOKEN"),
        INCOMING_JWT("INCOMING_JWT"),
        TRANSPARENT("TRANSPARENT"),
        INCOMING_KERBEROS("INCOMING_KERBEROS");

        private final String value;
    }

    /**
     * Type of authentication that needs to be used
     */
    @AllArgsConstructor
    public enum AuthTypeEnum {
        WSS_USERNAME("WSS_USERNAME"),
        SAML("SAML"),
        KERBEROS("KERBEROS"),
        ALIAS("ALIAS"),
        REMOVE_WSS_HEADERS("REMOVE_WSS_HEADERS"),
        NONE("NONE");

        private final String value;
    }

}

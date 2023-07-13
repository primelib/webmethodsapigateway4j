package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SAMLIssuerAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "appliesTo",
    "assertionId",
    "endpoint",
    "extendedParameters",
    "issuerAuthMode",
    "issuerAuthScheme",
    "issuerCommunicationMode",
    "issuerPolicy",
    "kerberosCredentials",
    "samlVersion",
    "signAndEncryptConfig",
    "wsTrustVersion",
    "wssCredentials"
})
@JsonTypeName("SAMLIssuerAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SAMLIssuerAlias extends Alias {

    /**
     * Specify the scope for which this security token is required
     */
    @JsonProperty("appliesTo")
    private String appliesTo;

    @JsonProperty("assertionId")
    private String assertionId;

    /**
     * The endpoint URI of the STS
     */
    @JsonProperty("endpoint")
    private String endpoint;

    /**
     * Extensions to the &amp;lt;wst:RequestSecurityToken&amp;gt; element for requesting specific types of keys, algorithms, or key and algorithms, as specified by a given policy in the return token(s)
     */
    @JsonProperty("extendedParameters")
    private Map<String, String> extendedParameters = new HashMap<>();

    /**
     * Mode of communication
     */
    @JsonProperty("issuerAuthMode")
    private IssuerAuthModeEnum issuerAuthMode;

    /**
     * The authentication type used for communicating to STS
     */
    @JsonProperty("issuerAuthScheme")
    private IssuerAuthSchemeEnum issuerAuthScheme;

    /**
     * Mode of communication to the STS
     */
    @JsonProperty("issuerCommunicationMode")
    private IssuerCommunicationModeEnum issuerCommunicationMode;

    /**
     * The webMethods Integration Server service name
     */
    @JsonProperty("issuerPolicy")
    private String issuerPolicy;

    @JsonProperty("kerberosCredentials")
    private KerberosCredentials kerberosCredentials;

    /**
     * SAML version to be used for authentication
     */
    @JsonProperty("samlVersion")
    private SamlVersionEnum samlVersion;

    @JsonProperty("signAndEncryptConfig")
    private SignAndEncryptConfig signAndEncryptConfig;

    /**
     * WS-Trust version that API Gateway must use to send the RST to the SAML issuer
     */
    @JsonProperty("wsTrustVersion")
    private WsTrustVersionEnum wsTrustVersion;

    @JsonProperty("wssCredentials")
    private WssCredentials wssCredentials;


public enum IssuerAuthModeEnum {
        NEW("NEW"), // Mode of communication
        INCOMING_HTTP_BASIC_AUTH("INCOMING_HTTP_BASIC_AUTH"), // Mode of communication
        INCOMING_WSS_USER("INCOMING_WSS_USER"), // Mode of communication
        INCOMING_X509("INCOMING_X509"), // Mode of communication
        DELEGATE_INCOMING("DELEGATE_INCOMING"), // Mode of communication
        INCOMING_OAUTH_TOKEN("INCOMING_OAUTH_TOKEN"), // Mode of communication
        INCOMING_JWT("INCOMING_JWT"), // Mode of communication
        TRANSPARENT("TRANSPARENT"), // Mode of communication
        INCOMING_KERBEROS("INCOMING_KERBEROS"); // Mode of communication
    
    private final String text;

    /**
     * @param text
     */
    IssuerAuthModeEnum(final String text) {
        this.text = text;
    }

}
public enum IssuerAuthSchemeEnum {
        BASIC_AUTH("BASIC_AUTH"), // The authentication type used for communicating to STS
        WSS_USERNAME("WSS_USERNAME"), // The authentication type used for communicating to STS
        KERBEROS("KERBEROS"), // The authentication type used for communicating to STS
        X509("X509"); // The authentication type used for communicating to STS
    
    private final String text;

    /**
     * @param text
     */
    IssuerAuthSchemeEnum(final String text) {
        this.text = text;
    }

}
public enum IssuerCommunicationModeEnum {
        NORMAL_CLIENT("NORMAL_CLIENT"), // Mode of communication to the STS
        ACT_AS_DELEGATION("ACT_AS_DELEGATION"); // Mode of communication to the STS
    
    private final String text;

    /**
     * @param text
     */
    IssuerCommunicationModeEnum(final String text) {
        this.text = text;
    }

}
public enum SamlVersionEnum {
        SAML1_1("SAML1_1"), // SAML version to be used for authentication
        SAML_2_0("SAML_2_0"); // SAML version to be used for authentication
    
    private final String text;

    /**
     * @param text
     */
    SamlVersionEnum(final String text) {
        this.text = text;
    }

}
public enum WsTrustVersionEnum {
        _0("WS_TRUST_1_0"), // WS-Trust version that API Gateway must use to send the RST to the SAML issuer
        _3("WS_TRUST_1_3"); // WS-Trust version that API Gateway must use to send the RST to the SAML issuer
    
    private final String text;

    /**
     * @param text
     */
    WsTrustVersionEnum(final String text) {
        this.text = text;
    }

}
}

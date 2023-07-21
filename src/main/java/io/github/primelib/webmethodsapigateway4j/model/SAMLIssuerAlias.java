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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SAMLIssuerAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected String appliesTo;

    @JsonProperty("assertionId")
    protected String assertionId;

    /**
     * The endpoint URI of the STS
     */
    @JsonProperty("endpoint")
    protected String endpoint;

    /**
     * Extensions to the &amp;lt;wst:RequestSecurityToken&amp;gt; element for requesting specific types of keys, algorithms, or key and algorithms, as specified by a given policy in the return token(s)
     */
    @JsonProperty("extendedParameters")
    protected Map<String, String> extendedParameters;

    /**
     * Mode of communication
     */
    @JsonProperty("issuerAuthMode")
    protected IssuerAuthModeEnum issuerAuthMode;

    /**
     * The authentication type used for communicating to STS
     */
    @JsonProperty("issuerAuthScheme")
    protected IssuerAuthSchemeEnum issuerAuthScheme;

    /**
     * Mode of communication to the STS
     */
    @JsonProperty("issuerCommunicationMode")
    protected IssuerCommunicationModeEnum issuerCommunicationMode;

    /**
     * The webMethods Integration Server service name
     */
    @JsonProperty("issuerPolicy")
    protected String issuerPolicy;

    @JsonProperty("kerberosCredentials")
    protected KerberosCredentials kerberosCredentials;

    /**
     * SAML version to be used for authentication
     */
    @JsonProperty("samlVersion")
    protected SamlVersionEnum samlVersion;

    @JsonProperty("signAndEncryptConfig")
    protected SignAndEncryptConfig signAndEncryptConfig;

    /**
     * WS-Trust version that API Gateway must use to send the RST to the SAML issuer
     */
    @JsonProperty("wsTrustVersion")
    protected WsTrustVersionEnum wsTrustVersion;

    @JsonProperty("wssCredentials")
    protected WssCredentials wssCredentials;

    /**
     * Constructs a validated instance of {@link SAMLIssuerAlias}.
     *
     * @param spec the specification to process
     */
    public SAMLIssuerAlias(Consumer<SAMLIssuerAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SAMLIssuerAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SAMLIssuerAlias(Consumer)} instead.
     * @param appliesTo Specify the scope for which this security token is required
     * @param assertionId var.name
     * @param endpoint The endpoint URI of the STS
     * @param extendedParameters Extensions to the &amp;lt;wst:RequestSecurityToken&amp;gt; element for requesting specific types of keys, algorithms, or key and algorithms, as specified by a given policy in the return token(s)
     * @param issuerAuthMode Mode of communication
     * @param issuerAuthScheme The authentication type used for communicating to STS
     * @param issuerCommunicationMode Mode of communication to the STS
     * @param issuerPolicy The webMethods Integration Server service name
     * @param kerberosCredentials var.name
     * @param samlVersion SAML version to be used for authentication
     * @param signAndEncryptConfig var.name
     * @param wsTrustVersion WS-Trust version that API Gateway must use to send the RST to the SAML issuer
     * @param wssCredentials var.name
     */
    @ApiStatus.Internal
    public SAMLIssuerAlias(String appliesTo, String assertionId, String endpoint, Map<String, String> extendedParameters, IssuerAuthModeEnum issuerAuthMode, IssuerAuthSchemeEnum issuerAuthScheme, IssuerCommunicationModeEnum issuerCommunicationMode, String issuerPolicy, KerberosCredentials kerberosCredentials, SamlVersionEnum samlVersion, SignAndEncryptConfig signAndEncryptConfig, WsTrustVersionEnum wsTrustVersion, WssCredentials wssCredentials) {
        this.appliesTo = appliesTo;
        this.assertionId = assertionId;
        this.endpoint = endpoint;
        this.extendedParameters = extendedParameters;
        this.issuerAuthMode = issuerAuthMode;
        this.issuerAuthScheme = issuerAuthScheme;
        this.issuerCommunicationMode = issuerCommunicationMode;
        this.issuerPolicy = issuerPolicy;
        this.kerberosCredentials = kerberosCredentials;
        this.samlVersion = samlVersion;
        this.signAndEncryptConfig = signAndEncryptConfig;
        this.wsTrustVersion = wsTrustVersion;
        this.wssCredentials = wssCredentials;
    }

    /**
     * Mode of communication
     */
    @AllArgsConstructor
    public enum IssuerAuthModeEnum {
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
     * The authentication type used for communicating to STS
     */
    @AllArgsConstructor
    public enum IssuerAuthSchemeEnum {
        BASIC_AUTH("BASIC_AUTH"),
        WSS_USERNAME("WSS_USERNAME"),
        KERBEROS("KERBEROS"),
        X509("X509");

        private final String value;
    }

    /**
     * Mode of communication to the STS
     */
    @AllArgsConstructor
    public enum IssuerCommunicationModeEnum {
        NORMAL_CLIENT("NORMAL_CLIENT"),
        ACT_AS_DELEGATION("ACT_AS_DELEGATION");

        private final String value;
    }

    /**
     * SAML version to be used for authentication
     */
    @AllArgsConstructor
    public enum SamlVersionEnum {
        SAML1_1("SAML1_1"),
        SAML_2_0("SAML_2_0");

        private final String value;
    }

    /**
     * WS-Trust version that API Gateway must use to send the RST to the SAML issuer
     */
    @AllArgsConstructor
    public enum WsTrustVersionEnum {
        _0("WS_TRUST_1_0"),
        _3("WS_TRUST_1_3");

        private final String value;
    }

}

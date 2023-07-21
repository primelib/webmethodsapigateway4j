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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPMessageSecurityAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected AuthModeEnum authMode;

    /**
     * Type of authentication that needs to be used
     */
    @JsonProperty("authType")
    protected AuthTypeEnum authType;

    @JsonProperty("kerberosCredentials")
    protected KerberosCredentials kerberosCredentials;

    /**
     * Saml issuer configuration name
     */
    @JsonProperty("samlIssuerConfig")
    protected String samlIssuerConfig;

    @JsonProperty("signAndEncryptConfig")
    protected SignAndEncryptConfig signAndEncryptConfig;

    @JsonProperty("wssCredentials")
    protected WssCredentials wssCredentials;

    /**
     * Constructs a validated instance of {@link SOAPMessageSecurityAlias}.
     *
     * @param spec the specification to process
     */
    public SOAPMessageSecurityAlias(Consumer<SOAPMessageSecurityAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPMessageSecurityAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPMessageSecurityAlias(Consumer)} instead.
     * @param authMode Mode of authentication
     * @param authType Type of authentication that needs to be used
     * @param kerberosCredentials var.name
     * @param samlIssuerConfig Saml issuer configuration name
     * @param signAndEncryptConfig var.name
     * @param wssCredentials var.name
     */
    @ApiStatus.Internal
    public SOAPMessageSecurityAlias(AuthModeEnum authMode, AuthTypeEnum authType, KerberosCredentials kerberosCredentials, String samlIssuerConfig, SignAndEncryptConfig signAndEncryptConfig, WssCredentials wssCredentials) {
        this.authMode = authMode;
        this.authType = authType;
        this.kerberosCredentials = kerberosCredentials;
        this.samlIssuerConfig = samlIssuerConfig;
        this.signAndEncryptConfig = signAndEncryptConfig;
        this.wssCredentials = wssCredentials;
    }

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

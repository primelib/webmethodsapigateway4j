package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSOConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupMapping",
    "idpFilename",
    "idpMetadataContent",
    "idpUrl",
    "keystoreAlias",
    "saml_assertion_signed",
    "saml_authreq_signed",
    "saml_defaultkey_alias",
    "saml_enabled",
    "saml_encrypkey_alias",
    "saml_redirect",
    "saml_signkey_alias",
    "saml_sp_id",
    "useSSOLoginByDefault",
    "userProfileMapping"
})
@JsonTypeName("SSOConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SSOConfiguration {

    /**
     * Constructs a validated implementation of {@link SSOConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SSOConfiguration(Consumer<SSOConfiguration> spec) {
        spec.accept(this);
    }

    @JsonProperty("groupMapping")
    protected GroupMapping groupMapping;

    /**
     * Specifies the file name of identity provider metadata.
     */
    @JsonProperty("idpFilename")
    protected String idpFilename;

    /**
     * Specifies base64 encoded file content of identity provider metadata.
     */
    @JsonProperty("idpMetadataContent")
    protected String idpMetadataContent;

    /**
     * Specifies the identity provider metadata URL.
     */
    @JsonProperty("idpUrl")
    protected String idpUrl;

    /**
     * Specifies the keystore alias to be used to generate service provider metadata.
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    /**
     * Specifies whether SAML assertion is to be signed from the identity provider.
     */
    @JsonProperty("saml_assertion_signed")
    protected String samlAssertionSigned;

    /**
     * Specifies whether auth request should signed by the service provider.
     */
    @JsonProperty("saml_authreq_signed")
    protected String samlAuthreqSigned;

    /**
     * Specifies the key alias to be used for signing and encryption.
     */
    @JsonProperty("saml_defaultkey_alias")
    protected String samlDefaultkeyAlias;

    /**
     * Specifies whether SSO should be enabled or not.
     */
    @JsonProperty("saml_enabled")
    protected String samlEnabled;

    /**
     * Specifies the key alias to be used for encryption.
     */
    @JsonProperty("saml_encrypkey_alias")
    protected String samlEncrypkeyAlias;

    /**
     * Specifies the service provider SSO URL.
     */
    @JsonProperty("saml_redirect")
    protected String samlRedirect;

    /**
     * Specifies the key alias to be used for signing.
     */
    @JsonProperty("saml_signkey_alias")
    protected String samlSignkeyAlias;

    /**
     * Specifies the service provider entity ID.
     */
    @JsonProperty("saml_sp_id")
    protected String samlSpId;

    /**
     * Specifies whether SSO login page is redirected by default.
     */
    @JsonProperty("useSSOLoginByDefault")
    protected String useSSOLoginByDefault;

    @JsonProperty("userProfileMapping")
    protected UserProfileMapping userProfileMapping;


}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSOConfiguration
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link SSOConfiguration}.
     *
     * @param spec the specification to process
     */
    public SSOConfiguration(Consumer<SSOConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SSOConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SSOConfiguration(Consumer)} instead.
     * @param groupMapping var.name
     * @param idpFilename Specifies the file name of identity provider metadata.
     * @param idpMetadataContent Specifies base64 encoded file content of identity provider metadata.
     * @param idpUrl Specifies the identity provider metadata URL.
     * @param keystoreAlias Specifies the keystore alias to be used to generate service provider metadata.
     * @param samlAssertionSigned Specifies whether SAML assertion is to be signed from the identity provider.
     * @param samlAuthreqSigned Specifies whether auth request should signed by the service provider.
     * @param samlDefaultkeyAlias Specifies the key alias to be used for signing and encryption.
     * @param samlEnabled Specifies whether SSO should be enabled or not.
     * @param samlEncrypkeyAlias Specifies the key alias to be used for encryption.
     * @param samlRedirect Specifies the service provider SSO URL.
     * @param samlSignkeyAlias Specifies the key alias to be used for signing.
     * @param samlSpId Specifies the service provider entity ID.
     * @param useSSOLoginByDefault Specifies whether SSO login page is redirected by default.
     * @param userProfileMapping var.name
     */
    @ApiStatus.Internal
    public SSOConfiguration(GroupMapping groupMapping, String idpFilename, String idpMetadataContent, String idpUrl, String keystoreAlias, String samlAssertionSigned, String samlAuthreqSigned, String samlDefaultkeyAlias, String samlEnabled, String samlEncrypkeyAlias, String samlRedirect, String samlSignkeyAlias, String samlSpId, String useSSOLoginByDefault, UserProfileMapping userProfileMapping) {
        this.groupMapping = groupMapping;
        this.idpFilename = idpFilename;
        this.idpMetadataContent = idpMetadataContent;
        this.idpUrl = idpUrl;
        this.keystoreAlias = keystoreAlias;
        this.samlAssertionSigned = samlAssertionSigned;
        this.samlAuthreqSigned = samlAuthreqSigned;
        this.samlDefaultkeyAlias = samlDefaultkeyAlias;
        this.samlEnabled = samlEnabled;
        this.samlEncrypkeyAlias = samlEncrypkeyAlias;
        this.samlRedirect = samlRedirect;
        this.samlSignkeyAlias = samlSignkeyAlias;
        this.samlSpId = samlSpId;
        this.useSSOLoginByDefault = useSSOLoginByDefault;
        this.userProfileMapping = userProfileMapping;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSOConfiguration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private GroupMapping groupMapping;

    /**
     * Specifies the file name of identity provider metadata.
     */
    @JsonProperty("idpFilename")
    private String idpFilename;

    /**
     * Specifies base64 encoded file content of identity provider metadata.
     */
    @JsonProperty("idpMetadataContent")
    private String idpMetadataContent;

    /**
     * Specifies the identity provider metadata URL.
     */
    @JsonProperty("idpUrl")
    private String idpUrl;

    /**
     * Specifies the keystore alias to be used to generate service provider metadata.
     */
    @JsonProperty("keystoreAlias")
    private String keystoreAlias;

    /**
     * Specifies whether SAML assertion is to be signed from the identity provider.
     */
    @JsonProperty("saml_assertion_signed")
    private String samlAssertionSigned;

    /**
     * Specifies whether auth request should signed by the service provider.
     */
    @JsonProperty("saml_authreq_signed")
    private String samlAuthreqSigned;

    /**
     * Specifies the key alias to be used for signing and encryption.
     */
    @JsonProperty("saml_defaultkey_alias")
    private String samlDefaultkeyAlias;

    /**
     * Specifies whether SSO should be enabled or not.
     */
    @JsonProperty("saml_enabled")
    private String samlEnabled;

    /**
     * Specifies the key alias to be used for encryption.
     */
    @JsonProperty("saml_encrypkey_alias")
    private String samlEncrypkeyAlias;

    /**
     * Specifies the service provider SSO URL.
     */
    @JsonProperty("saml_redirect")
    private String samlRedirect;

    /**
     * Specifies the key alias to be used for signing.
     */
    @JsonProperty("saml_signkey_alias")
    private String samlSignkeyAlias;

    /**
     * Specifies the service provider entity ID.
     */
    @JsonProperty("saml_sp_id")
    private String samlSpId;

    /**
     * Specifies whether SSO login page is redirected by default.
     */
    @JsonProperty("useSSOLoginByDefault")
    private String useSSOLoginByDefault;

    @JsonProperty("userProfileMapping")
    private UserProfileMapping userProfileMapping;


}

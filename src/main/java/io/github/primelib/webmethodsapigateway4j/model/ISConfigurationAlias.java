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
 * ISConfigurationAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "contentModelComplianceForWSDL",
    "enableMTOM",
    "enforceWSICompliance",
    "folderName",
    "importSwaggerBasedOnTags",
    "keyAlias",
    "keystoreAlias",
    "packageName",
    "password",
    "skipCustomScalarTypes",
    "url",
    "username",
    "validateSchemaWithXerces"
})
@JsonTypeName("ISConfigurationAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ISConfigurationAlias extends Alias {

    @JsonProperty("contentModelComplianceForWSDL")
    private ContentModelComplianceForWSDLEnum contentModelComplianceForWSDL;

    @JsonProperty("enableMTOM")
    private Boolean enableMTOM;

    @JsonProperty("enforceWSICompliance")
    private Boolean enforceWSICompliance;

    @JsonProperty("folderName")
    private String folderName;

    @JsonProperty("importSwaggerBasedOnTags")
    private Boolean importSwaggerBasedOnTags;

    /**
     * The alias of the private key that is stored in the keystore specified by the keystore alias. The Key alias field contains a list of the available aliases in the selected keystore. If there are no configured keystores, this field is empty
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * The Keystore alias field contains a list of the available keystore aliases in API Gateway. If there are no configured keystore aliases, this field lists the default Integration Server keystore, DEFAULT_IS_KEYSTORE .
     */
    @JsonProperty("keystoreAlias")
    private String keystoreAlias;

    @JsonProperty("packageName")
    private String packageName;

    /**
     * A valid password of the Integration Server user identified by the attribute Username
     */
    @JsonProperty("password")
    private String password;

    @JsonProperty("skipCustomScalarTypes")
    private Boolean skipCustomScalarTypes;

    @JsonProperty("url")
    private String url;

    /**
     * The username of a registered Integration Server user who has the functional privilege to create the service
     */
    @JsonProperty("username")
    private String username;

    @JsonProperty("validateSchemaWithXerces")
    private Boolean validateSchemaWithXerces;


    @AllArgsConstructor
    public enum ContentModelComplianceForWSDLEnum {
        STRICT("Strict"),
        LAX("Lax"),
        NONE("None");

        private final String value;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ISConfigurationAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ISConfigurationAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ISConfigurationAlias(Consumer<ISConfigurationAlias> spec) {
        spec.accept(this);
    }

    @JsonProperty("contentModelComplianceForWSDL")
    protected ContentModelComplianceForWSDLEnum contentModelComplianceForWSDL;

    @JsonProperty("enableMTOM")
    protected Boolean enableMTOM;

    @JsonProperty("enforceWSICompliance")
    protected Boolean enforceWSICompliance;

    @JsonProperty("folderName")
    protected String folderName;

    @JsonProperty("importSwaggerBasedOnTags")
    protected Boolean importSwaggerBasedOnTags;

    /**
     * The alias of the private key that is stored in the keystore specified by the keystore alias. The Key alias field contains a list of the available aliases in the selected keystore. If there are no configured keystores, this field is empty
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * The Keystore alias field contains a list of the available keystore aliases in API Gateway. If there are no configured keystore aliases, this field lists the default Integration Server keystore, DEFAULT_IS_KEYSTORE .
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    @JsonProperty("packageName")
    protected String packageName;

    /**
     * A valid password of the Integration Server user identified by the attribute Username
     */
    @JsonProperty("password")
    protected String password;

    @JsonProperty("skipCustomScalarTypes")
    protected Boolean skipCustomScalarTypes;

    @JsonProperty("url")
    protected String url;

    /**
     * The username of a registered Integration Server user who has the functional privilege to create the service
     */
    @JsonProperty("username")
    protected String username;

    @JsonProperty("validateSchemaWithXerces")
    protected Boolean validateSchemaWithXerces;


    @AllArgsConstructor
    public enum ContentModelComplianceForWSDLEnum {
        STRICT("Strict"),
        LAX("Lax"),
        NONE("None");

        private final String value;
    }

}

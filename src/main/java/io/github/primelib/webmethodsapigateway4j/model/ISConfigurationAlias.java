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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISConfigurationAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated instance of {@link ISConfigurationAlias}.
     *
     * @param spec the specification to process
     */
    public ISConfigurationAlias(Consumer<ISConfigurationAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ISConfigurationAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ISConfigurationAlias(Consumer)} instead.
     * @param contentModelComplianceForWSDL contentModelComplianceForWSDL
     * @param enableMTOM enableMTOM
     * @param enforceWSICompliance enforceWSICompliance
     * @param folderName folderName
     * @param importSwaggerBasedOnTags importSwaggerBasedOnTags
     * @param keyAlias The alias of the private key that is stored in the keystore specified by the keystore alias. The Key alias field contains a list of the available aliases in the selected keystore. If there are no configured keystores, this field is empty
     * @param keystoreAlias The Keystore alias field contains a list of the available keystore aliases in API Gateway. If there are no configured keystore aliases, this field lists the default Integration Server keystore, DEFAULT_IS_KEYSTORE .
     * @param packageName packageName
     * @param password A valid password of the Integration Server user identified by the attribute Username
     * @param skipCustomScalarTypes skipCustomScalarTypes
     * @param url url
     * @param username The username of a registered Integration Server user who has the functional privilege to create the service
     * @param validateSchemaWithXerces validateSchemaWithXerces
     */
    @ApiStatus.Internal
    public ISConfigurationAlias(ContentModelComplianceForWSDLEnum contentModelComplianceForWSDL, Boolean enableMTOM, Boolean enforceWSICompliance, String folderName, Boolean importSwaggerBasedOnTags, String keyAlias, String keystoreAlias, String packageName, String password, Boolean skipCustomScalarTypes, String url, String username, Boolean validateSchemaWithXerces) {
        this.contentModelComplianceForWSDL = contentModelComplianceForWSDL;
        this.enableMTOM = enableMTOM;
        this.enforceWSICompliance = enforceWSICompliance;
        this.folderName = folderName;
        this.importSwaggerBasedOnTags = importSwaggerBasedOnTags;
        this.keyAlias = keyAlias;
        this.keystoreAlias = keystoreAlias;
        this.packageName = packageName;
        this.password = password;
        this.skipCustomScalarTypes = skipCustomScalarTypes;
        this.url = url;
        this.username = username;
        this.validateSchemaWithXerces = validateSchemaWithXerces;
    }

    @AllArgsConstructor
    public enum ContentModelComplianceForWSDLEnum {
        STRICT("Strict"),
        LAX("Lax"),
        NONE("None");

        private static final ContentModelComplianceForWSDLEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ContentModelComplianceForWSDLEnum of(String input) {
            if (input != null) {
                for (ContentModelComplianceForWSDLEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

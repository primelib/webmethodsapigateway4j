package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateKeystoreAliasesRequest
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
    "keyStoreDescription",
    "keyStoreType",
    "keyStoreProvider",
    "keyStorePassword",
    "uploadFileName",
    "fileContent",
    "pkAliasesList",
    "pkPasswordsList",
    "nullPKpasswds",
    "isPwdBase64Encoded"
})
@JsonTypeName("UpdateKeystoreAliases_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateKeystoreAliasesRequest {

    /**
     * The description for the keystore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The certificate file format of the keystore.
     */
    @JsonProperty("keyStoreType")
    protected KeyStoreTypeEnum keyStoreType;

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @JsonProperty("keyStoreProvider")
    protected KeyStoreProviderEnum keyStoreProvider;

    /**
     * The keystore password that is defined at the time of keystore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    protected String keyStorePassword;

    /**
     * The name of the keystore file that will be used to save the keystore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    protected String uploadFileName;

    /**
     * The contents of the keystore file.
     */
    @JsonProperty("fileContent")
    protected File fileContent;

    /**
     * Comma separated list of alias names in the uploaded keystore file.
     */
    @JsonProperty("pkAliasesList")
    protected String pkAliasesList;

    /**
     * Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     */
    @JsonProperty("pkPasswordsList")
    protected String pkPasswordsList;

    /**
     * Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     */
    @JsonProperty("nullPKpasswds")
    protected String nullPKpasswds;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @JsonProperty("isPwdBase64Encoded")
    protected String isPwdBase64Encoded;

    /**
     * Constructs a validated instance of {@link UpdateKeystoreAliasesRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateKeystoreAliasesRequest(Consumer<UpdateKeystoreAliasesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateKeystoreAliasesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateKeystoreAliasesRequest(Consumer)} instead.
     * @param keyStoreDescription The description for the keystore.
     * @param keyStoreType The certificate file format of the keystore.
     * @param keyStoreProvider The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     * @param keyStorePassword The keystore password that is defined at the time of keystore creation using a keystore utility.
     * @param uploadFileName The name of the keystore file that will be used to save the keystore internally in API Gateway.
     * @param fileContent The contents of the keystore file.
     * @param pkAliasesList Comma separated list of alias names in the uploaded keystore file.
     * @param pkPasswordsList Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     * @param nullPKpasswds Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     * @param isPwdBase64Encoded Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public UpdateKeystoreAliasesRequest(String keyStoreDescription, KeyStoreTypeEnum keyStoreType, KeyStoreProviderEnum keyStoreProvider, String keyStorePassword, String uploadFileName, File fileContent, String pkAliasesList, String pkPasswordsList, String nullPKpasswds, String isPwdBase64Encoded) {
        this.keyStoreDescription = keyStoreDescription;
        this.keyStoreType = keyStoreType;
        this.keyStoreProvider = keyStoreProvider;
        this.keyStorePassword = keyStorePassword;
        this.uploadFileName = uploadFileName;
        this.fileContent = fileContent;
        this.pkAliasesList = pkAliasesList;
        this.pkPasswordsList = pkPasswordsList;
        this.nullPKpasswds = nullPKpasswds;
        this.isPwdBase64Encoded = isPwdBase64Encoded;
    }

    /**
     * The certificate file format of the keystore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS"),
        PKCS12("PKCS12");

        private static final KeyStoreTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeyStoreTypeEnum of(String input) {
            if (input != null) {
                for (KeyStoreTypeEnum v : VALUES) {
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

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @AllArgsConstructor
    public enum KeyStoreProviderEnum {
        SUN("SUN"),
        SUNJSSE("SunJSSE");

        private static final KeyStoreProviderEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeyStoreProviderEnum of(String input) {
            if (input != null) {
                for (KeyStoreProviderEnum v : VALUES) {
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

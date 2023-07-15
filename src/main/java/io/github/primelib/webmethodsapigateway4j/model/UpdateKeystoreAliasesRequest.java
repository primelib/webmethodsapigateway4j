package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateKeystoreAliasesRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link UpdateKeystoreAliasesRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateKeystoreAliasesRequest(Consumer<UpdateKeystoreAliasesRequest> spec) {
        spec.accept(this);
    }

    /**
     * The description for the keystore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The certificate file format of the keystore.
     */
    @JsonProperty("keyStoreType")
    protected KeyStoreTypeEnum keyStoreType = KeyStoreTypeEnum.JKS;

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @JsonProperty("keyStoreProvider")
    protected KeyStoreProviderEnum keyStoreProvider = KeyStoreProviderEnum.SUN;

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
     * The certificate file format of the keystore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS"),
        PKCS12("PKCS12");

        private final String value;
    }

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @AllArgsConstructor
    public enum KeyStoreProviderEnum {
        SUN("SUN"),
        SUNJSSE("SunJSSE");

        private final String value;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String keyStoreDescription;

    /**
     * The certificate file format of the keystore.
     */
    @JsonProperty("keyStoreType")
    private KeyStoreTypeEnum keyStoreType = KeyStoreTypeEnum.JKS;

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @JsonProperty("keyStoreProvider")
    private KeyStoreProviderEnum keyStoreProvider = KeyStoreProviderEnum.SUN;

    /**
     * The keystore password that is defined at the time of keystore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    private String keyStorePassword;

    /**
     * The name of the keystore file that will be used to save the keystore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    private String uploadFileName;

    /**
     * The contents of the keystore file.
     */
    @JsonProperty("fileContent")
    private File fileContent;

    /**
     * Comma separated list of alias names in the uploaded keystore file.
     */
    @JsonProperty("pkAliasesList")
    private String pkAliasesList;

    /**
     * Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     */
    @JsonProperty("pkPasswordsList")
    private String pkPasswordsList;

    /**
     * Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     */
    @JsonProperty("nullPKpasswds")
    private String nullPKpasswds;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @JsonProperty("isPwdBase64Encoded")
    private String isPwdBase64Encoded;


public enum KeyStoreTypeEnum {
        JKS("JKS"), // The certificate file format of the keystore.
        PKCS12("PKCS12"); // The certificate file format of the keystore.
    
    private final String text;

    /**
     * @param text
     */
    KeyStoreTypeEnum(final String text) {
        this.text = text;
    }

}
public enum KeyStoreProviderEnum {
        SUN("SUN"), // The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
        SUNJSSE("SunJSSE"); // The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
    
    private final String text;

    /**
     * @param text
     */
    KeyStoreProviderEnum(final String text) {
        this.text = text;
    }

}
}

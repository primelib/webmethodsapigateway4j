package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KeyStore
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "bitarray",
    "fileContent",
    "isLoaded",
    "isWarning",
    "keyStoreDescription",
    "keyStoreName",
    "keyStorePassword",
    "keyStoreProvider",
    "keyStoreType",
    "message",
    "nullPKpasswds",
    "pkAliasesList",
    "pkPasswordsList",
    "uploadFileName"
})
@JsonTypeName("KeyStore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KeyStore {

    /**
     * Comma separated list of bits (1/0) indicating whether the particular key alias has been successfully configured in API Gateway or not. For each key alias, 1 indicates that the key alias was loaded successfully and 0 indicates that the key alias was not loaded/configured.
     */
    @JsonProperty("bitarray")
    private String bitarray;

    /**
     * The contents of the keystore file.
     */
    @JsonProperty("fileContent")
    private String fileContent;

    /**
     * Indicates whether the keystore is loaded or not. A keystore may not be loaded if there are errors while reading the keystore file or its key aliases.
     */
    @JsonProperty("isLoaded")
    private Boolean isLoaded;

    /**
     * Indicates whether a warning is thrown by the API Gateway while persisting the keystore.
     */
    @JsonProperty("isWarning")
    private Boolean isWarning;

    /**
     * The description for the keystore.
     */
    @JsonProperty("keyStoreDescription")
    private String keyStoreDescription;

    /**
     * The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     */
    @JsonProperty("keyStoreName")
    private String keyStoreName;

    /**
     * The keystore password that is defined at the time of keystore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    private String keyStorePassword;

    @JsonProperty("keyStoreProvider")
    private String keyStoreProvider;

    /**
     * The certificate file format of the keystore.
     */
    @JsonProperty("keyStoreType")
    private KeyStoreTypeEnum keyStoreType;

    /**
     * The error or warning or success message from persisting the keystore in API Gateway. If there are failures in loading a keystore or a key alias, then the reasons for the failures are indicated by this message.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Comma separated list of boolean values (false/true) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     */
    @JsonProperty("nullPKpasswds")
    private String nullPKpasswds;

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
     * The name of the keystore file that will be used to save the keystore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    private String uploadFileName;


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
}

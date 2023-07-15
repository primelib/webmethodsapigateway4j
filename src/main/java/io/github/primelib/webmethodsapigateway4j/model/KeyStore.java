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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KeyStore
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link KeyStore}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public KeyStore(Consumer<KeyStore> spec) {
        spec.accept(this);
    }

    /**
     * Comma separated list of bits (1/0) indicating whether the particular key alias has been successfully configured in API Gateway or not. For each key alias, 1 indicates that the key alias was loaded successfully and 0 indicates that the key alias was not loaded/configured.
     */
    @JsonProperty("bitarray")
    protected String bitarray;

    /**
     * The contents of the keystore file.
     */
    @JsonProperty("fileContent")
    protected String fileContent;

    /**
     * Indicates whether the keystore is loaded or not. A keystore may not be loaded if there are errors while reading the keystore file or its key aliases.
     */
    @JsonProperty("isLoaded")
    protected Boolean isLoaded;

    /**
     * Indicates whether a warning is thrown by the API Gateway while persisting the keystore.
     */
    @JsonProperty("isWarning")
    protected Boolean isWarning;

    /**
     * The description for the keystore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     */
    @JsonProperty("keyStoreName")
    protected String keyStoreName;

    /**
     * The keystore password that is defined at the time of keystore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    protected String keyStorePassword;

    @JsonProperty("keyStoreProvider")
    protected String keyStoreProvider;

    /**
     * The certificate file format of the keystore.
     */
    @JsonProperty("keyStoreType")
    protected KeyStoreTypeEnum keyStoreType;

    /**
     * The error or warning or success message from persisting the keystore in API Gateway. If there are failures in loading a keystore or a key alias, then the reasons for the failures are indicated by this message.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Comma separated list of boolean values (false/true) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     */
    @JsonProperty("nullPKpasswds")
    protected String nullPKpasswds;

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
     * The name of the keystore file that will be used to save the keystore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    protected String uploadFileName;


    /**
     * The certificate file format of the keystore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS"),
        PKCS12("PKCS12");

        private final String value;
    }

}

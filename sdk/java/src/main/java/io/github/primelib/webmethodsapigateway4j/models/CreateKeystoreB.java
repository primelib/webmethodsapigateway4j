// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * CreateKeystoreB
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("CreateKeystoreB")
@JsonPropertyOrder({
    "keyStoreName",
    "keyStoreDescription",
    "keyStoreType",
    "keyStorePassword",
    "uploadFileName",
    "fileContent",
    "pkAliasesList",
    "pkPasswordsList",
    "nullPkpasswds",
    "isPwdBase64Encoded"
})
@Generated(value = "io.github.primelib.primecodegen")
public class CreateKeystoreB {

    /**
     * The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     */
    @JsonProperty("keyStoreName")
    protected String keyStoreName;

    /**
     * The description for the keystore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The certificate file format of the truststore.
     */
    @JsonProperty("keyStoreType")
    protected String keyStoreType;

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
     * The contents of the truststore file.
     */
    @JsonProperty("fileContent")
    protected Byte[] fileContent;

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
    protected String nullPkpasswds;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @JsonProperty("isPwdBase64Encoded")
    protected String isPwdBase64Encoded;

    /**
     * Constructs a validated instance of {@link CreateKeystoreB}.
     *
     * @param spec the specification to process
     */
    public CreateKeystoreB(Consumer<CreateKeystoreB> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateKeystoreB}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateKeystoreB(Consumer)} instead.
     * @param keyStoreName The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     * @param keyStoreDescription The description for the keystore.
     * @param keyStoreType The certificate file format of the truststore.
     * @param keyStorePassword The keystore password that is defined at the time of keystore creation using a keystore utility.
     * @param uploadFileName The name of the keystore file that will be used to save the keystore internally in API Gateway.
     * @param fileContent The contents of the truststore file.
     * @param pkAliasesList Comma separated list of alias names in the uploaded keystore file.
     * @param pkPasswordsList Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     * @param nullPkpasswds Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     * @param isPwdBase64Encoded Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public CreateKeystoreB(String keyStoreName, String keyStoreDescription, String keyStoreType, String keyStorePassword, String uploadFileName, Byte[] fileContent, String pkAliasesList, String pkPasswordsList, String nullPkpasswds, String isPwdBase64Encoded) {
        this.keyStoreName = keyStoreName;
        this.keyStoreDescription = keyStoreDescription;
        this.keyStoreType = keyStoreType;
        this.keyStorePassword = keyStorePassword;
        this.uploadFileName = uploadFileName;
        this.fileContent = fileContent;
        this.pkAliasesList = pkAliasesList;
        this.pkPasswordsList = pkPasswordsList;
        this.nullPkpasswds = nullPkpasswds;
        this.isPwdBase64Encoded = isPwdBase64Encoded;
    }
}

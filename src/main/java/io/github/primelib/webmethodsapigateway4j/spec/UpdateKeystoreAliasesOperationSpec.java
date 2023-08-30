package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
import java.io.File;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateKeystoreAliasesSpec
 * <p>
 * Specification for the UpdateKeystoreAliases operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateKeystoreAliasesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     */
    @NotNull 
    private String keyStoreName;

    /**
     * The certificate file format of the keystore.
     */
    @NotNull 
    private String keyStoreType;

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @NotNull 
    private String keyStoreProvider;

    /**
     * The keystore password that is defined at the time of keystore creation using a keystore utility.
     */
    @NotNull 
    private String keyStorePassword;

    /**
     * The name of the keystore file that will be used to save the keystore internally in API Gateway.
     */
    @NotNull 
    private String uploadFileName;

    /**
     * The contents of the keystore file.
     */
    @NotNull 
    private File fileContent;

    /**
     * The description for the keystore.
     */
    @Nullable 
    private String keyStoreDescription;

    /**
     * Comma separated list of alias names in the uploaded keystore file.
     */
    @Nullable 
    private String pkAliasesList;

    /**
     * Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     */
    @Nullable 
    private String pkPasswordsList;

    /**
     * Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     */
    @Nullable 
    private String nullPKpasswds;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @Nullable 
    private String isPwdBase64Encoded;

    /**
     * Constructs a validated instance of {@link UpdateKeystoreAliasesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateKeystoreAliasesOperationSpec(Consumer<UpdateKeystoreAliasesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateKeystoreAliasesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param keyStoreName         The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.
     * @param keyStoreType         The certificate file format of the keystore.
     * @param keyStoreProvider     The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     * @param keyStorePassword     The keystore password that is defined at the time of keystore creation using a keystore utility.
     * @param uploadFileName       The name of the keystore file that will be used to save the keystore internally in API Gateway.
     * @param fileContent          The contents of the keystore file.
     * @param keyStoreDescription  The description for the keystore.
     * @param pkAliasesList        Comma separated list of alias names in the uploaded keystore file.
     * @param pkPasswordsList      Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.
     * @param nullPKpasswds        Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public UpdateKeystoreAliasesOperationSpec(String keyStoreName, String keyStoreType, String keyStoreProvider, String keyStorePassword, String uploadFileName, File fileContent, String keyStoreDescription, String pkAliasesList, String pkPasswordsList, String nullPKpasswds, String isPwdBase64Encoded) {
        this.keyStoreName = keyStoreName;
        this.keyStoreType = keyStoreType;
        this.keyStoreProvider = keyStoreProvider;
        this.keyStorePassword = keyStorePassword;
        this.uploadFileName = uploadFileName;
        this.fileContent = fileContent;
        this.keyStoreDescription = keyStoreDescription;
        this.pkAliasesList = pkAliasesList;
        this.pkPasswordsList = pkPasswordsList;
        this.nullPKpasswds = nullPKpasswds;
        this.isPwdBase64Encoded = isPwdBase64Encoded;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(keyStoreName, "keyStoreName is a required parameter!");
        Objects.requireNonNull(keyStoreType, "keyStoreType is a required parameter!");
        Objects.requireNonNull(keyStoreProvider, "keyStoreProvider is a required parameter!");
        Objects.requireNonNull(keyStorePassword, "keyStorePassword is a required parameter!");
        Objects.requireNonNull(uploadFileName, "uploadFileName is a required parameter!");
        Objects.requireNonNull(fileContent, "fileContent is a required parameter!");
    }
}

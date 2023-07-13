package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
import java.io.File;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateKeystoreAliasesSpec
 * <p>
 * Specification for the UpdateKeystoreAliases operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private String keyStoreType = "JKS";

    /**
     * The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.
     */
    @NotNull 
    private String keyStoreProvider = "SUN";

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
     * Constructs a validated implementation of {@link UpdateKeystoreAliasesOperationSpec}.
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

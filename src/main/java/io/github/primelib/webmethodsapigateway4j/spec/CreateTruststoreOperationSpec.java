package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * CreateTruststoreSpec
 * <p>
 * Specification for the CreateTruststore operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTruststoreOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.
     */
    @NotNull 
    private String keyStoreName;

    /**
     * The certificate file format of the truststore.
     */
    @NotNull 
    private String keyStoreType;

    /**
     * The truststore password that is defined at the time of truststore creation using a keystore utility.
     */
    @NotNull 
    private String keyStorePassword;

    /**
     * The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @NotNull 
    private String uploadFileName;

    /**
     * The contents of the truststore file.
     */
    @NotNull 
    private File fileContent;

    /**
     * The description for the truststore.
     */
    @Nullable 
    private String keyStoreDescription;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @Nullable 
    private String isPwdBase64Encoded;

    /**
     * Constructs a validated instance of {@link CreateTruststoreOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateTruststoreOperationSpec(Consumer<CreateTruststoreOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateTruststoreOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param keyStoreName         The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.
     * @param keyStoreType         The certificate file format of the truststore.
     * @param keyStorePassword     The truststore password that is defined at the time of truststore creation using a keystore utility.
     * @param uploadFileName       The name of the truststore file that will be used to save the truststore internally in API Gateway.
     * @param fileContent          The contents of the truststore file.
     * @param keyStoreDescription  The description for the truststore.
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public CreateTruststoreOperationSpec(String keyStoreName, String keyStoreType, String keyStorePassword, String uploadFileName, File fileContent, String keyStoreDescription, String isPwdBase64Encoded) {
        this.keyStoreName = keyStoreName;
        this.keyStoreType = keyStoreType;
        this.keyStorePassword = keyStorePassword;
        this.uploadFileName = uploadFileName;
        this.fileContent = fileContent;
        this.keyStoreDescription = keyStoreDescription;
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
        Objects.requireNonNull(keyStorePassword, "keyStorePassword is a required parameter!");
        Objects.requireNonNull(uploadFileName, "uploadFileName is a required parameter!");
        Objects.requireNonNull(fileContent, "fileContent is a required parameter!");
    }
}

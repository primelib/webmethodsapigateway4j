package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.io.File;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateTruststoreSpec
 * <p>
 * Specification for the CreateTruststore operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private String keyStoreType = "JKS";

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
     * Constructs a validated implementation of {@link CreateTruststoreOperationSpec}.
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

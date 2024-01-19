package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * GetKeystoreSpec
 * <p>
 * Specification for the GetKeystore operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetKeystoreOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Keystore name to identify the corresponding Keystore
     */
    @NotNull 
    private String keyStoreName;

    /**
     * Constructs a validated instance of {@link GetKeystoreOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetKeystoreOperationSpec(Consumer<GetKeystoreOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetKeystoreOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param keyStoreName         Keystore name to identify the corresponding Keystore
     */
    @ApiStatus.Internal
    public GetKeystoreOperationSpec(String keyStoreName) {
        this.keyStoreName = keyStoreName;

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
    }
}

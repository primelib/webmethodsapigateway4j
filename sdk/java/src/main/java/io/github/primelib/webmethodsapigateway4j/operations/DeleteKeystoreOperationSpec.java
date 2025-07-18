// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NonNull;

/**
 * DeleteKeystore
 * <p>
 * Deletes keystore matching the specified name in API Gateway.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class DeleteKeystoreOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Keystore name to identify the corresponding Keystore
     *
     */
    @NonNull
    private String keyStoreName;

    /**
     * Constructs a validated instance of {@link DeleteKeystoreOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteKeystoreOperationSpec(Consumer<DeleteKeystoreOperationSpec> spec) {
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
    }
}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.AccessModeServices;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateAccessModeSpec
 * <p>
 * Specification for the UpdateAccessMode operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAccessModeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.
     */
    @NotNull 
    private String listenerKey;

    /**
     * The request contains the updated services access mode information.
     */
    @NotNull 
    private AccessModeServices body;

    /**
     * Constructs a validated implementation of {@link UpdateAccessModeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAccessModeOperationSpec(Consumer<UpdateAccessModeOperationSpec> spec) {
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
        Objects.requireNonNull(listenerKey, "listenerKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}

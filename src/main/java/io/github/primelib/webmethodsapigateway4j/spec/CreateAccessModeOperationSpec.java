package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.AccessModeType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateAccessModeSpec
 * <p>
 * Specification for the CreateAccessMode operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAccessModeOperationSpec {
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
     * The request contains the access mode information.
     */
    @NotNull 
    private AccessModeType body;

    /**
     * Constructs a validated implementation of {@link CreateAccessModeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAccessModeOperationSpec(Consumer<CreateAccessModeOperationSpec> spec) {
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

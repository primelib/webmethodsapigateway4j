package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Port;
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
 * DeletePortSpec
 * <p>
 * Specification for the DeletePort operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeletePortOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot.
     */
    @Nullable 
    private String pkg;

    /**
     * The listenerKey parameter uniquely identifies a port configuration within a package.
     */
    @Nullable 
    private String listenerKey;

    /**
     * Constructs a validated instance of {@link DeletePortOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeletePortOperationSpec(Consumer<DeletePortOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeletePortOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param pkg                  The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot.
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within a package.
     */
    @ApiStatus.Internal
    public DeletePortOperationSpec(String pkg, String listenerKey) {
        this.pkg = pkg;
        this.listenerKey = listenerKey;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}

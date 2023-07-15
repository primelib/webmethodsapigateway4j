package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UnPublishPackageByPackageIdSpec
 * <p>
 * Specification for the UnPublishPackageByPackageId operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnPublishPackageByPackageIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * package id which needs to be unpublished from portal
     */
    @NotNull 
    private String packageId;

    /**
     * Constructs a validated implementation of {@link UnPublishPackageByPackageIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnPublishPackageByPackageIdOperationSpec(Consumer<UnPublishPackageByPackageIdOperationSpec> spec) {
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
        Objects.requireNonNull(packageId, "packageId is a required parameter!");
    }

}

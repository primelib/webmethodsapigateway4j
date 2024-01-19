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
 * ActivatePackageByPackageIdSpec
 * <p>
 * Specification for the ActivatePackageByPackageId operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActivatePackageByPackageIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * package id which needs to be activated
     */
    @NotNull 
    private String packageId;

    /**
     * Constructs a validated instance of {@link ActivatePackageByPackageIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ActivatePackageByPackageIdOperationSpec(Consumer<ActivatePackageByPackageIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ActivatePackageByPackageIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param packageId            package id which needs to be activated
     */
    @ApiStatus.Internal
    public ActivatePackageByPackageIdOperationSpec(String packageId) {
        this.packageId = packageId;

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

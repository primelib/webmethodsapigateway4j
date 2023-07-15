package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ActivateGlobalPolicyByPolicyIDSpec
 * <p>
 * Specification for the ActivateGlobalPolicyByPolicyID operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActivateGlobalPolicyByPolicyIDOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter should be the policy id of global policy that needs to be activated. If the policy id is not belongs to a global policy then error will be reported
     */
    @NotNull 
    private String policyId;

    /**
     * Constructs a validated implementation of {@link ActivateGlobalPolicyByPolicyIDOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ActivateGlobalPolicyByPolicyIDOperationSpec(Consumer<ActivateGlobalPolicyByPolicyIDOperationSpec> spec) {
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
        Objects.requireNonNull(policyId, "policyId is a required parameter!");
    }

}

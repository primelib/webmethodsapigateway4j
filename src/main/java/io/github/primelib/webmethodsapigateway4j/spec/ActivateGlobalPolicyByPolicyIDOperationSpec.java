package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
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
 * ActivateGlobalPolicyByPolicyIDSpec
 * <p>
 * Specification for the ActivateGlobalPolicyByPolicyID operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link ActivateGlobalPolicyByPolicyIDOperationSpec}.
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
     * Constructs a validated instance of {@link ActivateGlobalPolicyByPolicyIDOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyId             The path parameter should be the policy id of global policy that needs to be activated. If the policy id is not belongs to a global policy then error will be reported
     */
    @ApiStatus.Internal
    public ActivateGlobalPolicyByPolicyIDOperationSpec(String policyId) {
        this.policyId = policyId;

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

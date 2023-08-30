package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.Rule;
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
 * DisableThreatProtectionRuleByPolicyIDSpec
 * <p>
 * Specification for the DisableThreatProtectionRuleByPolicyID operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DisableThreatProtectionRuleByPolicyIDOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the policy id of the threat protection policy which needs to be disabled
     */
    @NotNull 
    private String policyId;

    /**
     * Constructs a validated instance of {@link DisableThreatProtectionRuleByPolicyIDOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DisableThreatProtectionRuleByPolicyIDOperationSpec(Consumer<DisableThreatProtectionRuleByPolicyIDOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DisableThreatProtectionRuleByPolicyIDOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyId             This path parameter is used to specify the policy id of the threat protection policy which needs to be disabled
     */
    @ApiStatus.Internal
    public DisableThreatProtectionRuleByPolicyIDOperationSpec(String policyId) {
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

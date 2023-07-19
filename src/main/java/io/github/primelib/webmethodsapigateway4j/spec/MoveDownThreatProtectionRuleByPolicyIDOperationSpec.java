package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.Rule;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MoveDownThreatProtectionRuleByPolicyIDSpec
 * <p>
 * Specification for the MoveDownThreatProtectionRuleByPolicyID operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveDownThreatProtectionRuleByPolicyIDOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the policy id of the threat protection whose execution order needs to be moved down 
     */
    @NotNull 
    private String policyId;

    /**
     * Constructs a validated implementation of {@link MoveDownThreatProtectionRuleByPolicyIDOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MoveDownThreatProtectionRuleByPolicyIDOperationSpec(Consumer<MoveDownThreatProtectionRuleByPolicyIDOperationSpec> spec) {
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
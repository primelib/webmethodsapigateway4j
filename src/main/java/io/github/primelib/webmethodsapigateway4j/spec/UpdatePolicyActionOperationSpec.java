package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.PolicyAction;
import io.github.primelib.webmethodsapigateway4j.model.PolicyActionWrapper;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdatePolicyActionSpec
 * <p>
 * Specification for the UpdatePolicyAction operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePolicyActionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the policy action id which needs to be updated.
     */
    @NotNull 
    private String policyActionId;

    /**
     * Contains the policy action details which needs to be updated.
     */
    @NotNull 
    private PolicyActionWrapper body;

    /**
     * Constructs a validated implementation of {@link UpdatePolicyActionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatePolicyActionOperationSpec(Consumer<UpdatePolicyActionOperationSpec> spec) {
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
        Objects.requireNonNull(policyActionId, "policyActionId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}

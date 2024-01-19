package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * PoliciesPostSpec
 * <p>
 * Specification for the PoliciesPost operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PoliciesPostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private Policy body;

    /**
     *  This query parameter represents the action user want to perform. Currently user can only clone the policy. Hence the allowed value for this parameter would be "clone". Cloning is duplication of one or more policies in to a single policy. All the policy actions specified inside the policies are also be duplicated while creating the duplicate policy.The effective policy is not calculated for this until this policy is referred from the API.
     */
    @Nullable 
    private String action;

    /**
     * This query parameter represents the list of policies from which the new clone policy is created. If you specify list of policies then the newly
     * created policy has all the policy action from all the policies.
     */
    @Nullable 
    private String policyIds;

    /**
     * This query parameter represents the policy scope of cloned policy. We can clone policy from one policy scope to another policy scope. Allowed policy scope values are global,service,template &amp; scope
     */
    @Nullable 
    private String policyScope;

    /**
     * Constructs a validated instance of {@link PoliciesPostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PoliciesPostOperationSpec(Consumer<PoliciesPostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PoliciesPostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param body                 
     * @param action                This query parameter represents the action user want to perform. Currently user can only clone the policy. Hence the allowed value for this parameter would be "clone". Cloning is duplication of one or more policies in to a single policy. All the policy actions specified inside the policies are also be duplicated while creating the duplicate policy.The effective policy is not calculated for this until this policy is referred from the API.
     * @param policyIds            This query parameter represents the list of policies from which the new clone policy is created. If you specify list of policies then the newly  created policy has all the policy action from all the policies.
     * @param policyScope          This query parameter represents the policy scope of cloned policy. We can clone policy from one policy scope to another policy scope. Allowed policy scope values are global,service,template &amp; scope
     */
    @ApiStatus.Internal
    public PoliciesPostOperationSpec(Policy body, String action, String policyIds, String policyScope) {
        this.body = body;
        this.action = action;
        this.policyIds = policyIds;
        this.policyScope = policyScope;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

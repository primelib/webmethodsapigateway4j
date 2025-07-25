// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;

/**
 * GetAllPolicyActions
 * <p>
 * This request will return all the policy actions from API Gateway
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetAllPolicyActionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is a query parameter. Provide comma separated Policy Action ids to get the policy action details for specified policy action ids
     *
     */
    @Nullable
    private String policyActionIds;

    /**
     * Constructs a validated instance of {@link GetAllPolicyActionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllPolicyActionsOperationSpec(Consumer<GetAllPolicyActionsOperationSpec> spec) {
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
    }
}

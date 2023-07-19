package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CheckConflictForGlobalPolicySpec
 * <p>
 * Specification for the CheckConflictForGlobalPolicy operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CheckConflictForGlobalPolicyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the global policy id to which we need to conflicting case for a global policy
     */
    @NotNull 
    private String policyId;

    /**
     * This is a query parameter. It is used to get conflicting case for a global policy. If the value for this parameter is 'false' then it will return conflicting scenario for all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return conflicting case only for the list of applicable active APIs alone
     */
    @Nullable 
    private String active;

    /**
     * Constructs a validated implementation of {@link CheckConflictForGlobalPolicyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CheckConflictForGlobalPolicyOperationSpec(Consumer<CheckConflictForGlobalPolicyOperationSpec> spec) {
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
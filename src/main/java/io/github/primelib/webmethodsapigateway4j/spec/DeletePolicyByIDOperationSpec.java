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
 * DeletePolicyByIDSpec
 * <p>
 * Specification for the DeletePolicyByID operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeletePolicyByIDOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the policy id that needs to be deleted. If the policy id specified is global policy then it needs to be in inactive state to delete. Active global policy and global policy with systemPolicy property set to true cannot be deleted.
     */
    @NotNull 
    private String policyId;

    /**
     * Constructs a validated instance of {@link DeletePolicyByIDOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeletePolicyByIDOperationSpec(Consumer<DeletePolicyByIDOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeletePolicyByIDOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyId             This path parameter is used to specify the policy id that needs to be deleted. If the policy id specified is global policy then it needs to be in inactive state to delete. Active global policy and global policy with systemPolicy property set to true cannot be deleted.
     */
    @ApiStatus.Internal
    public DeletePolicyByIDOperationSpec(String policyId) {
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

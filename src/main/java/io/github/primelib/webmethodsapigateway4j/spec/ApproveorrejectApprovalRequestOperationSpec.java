package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.ApprovalPutRequest;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ApproveorrejectApprovalRequestSpec
 * <p>
 * Specification for the ApproveorrejectApprovalRequest operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApproveorrejectApprovalRequestOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * ApprovalId for the Approval Request to be approved
     */
    @NotNull 
    private String approvalId;

    /**
     * Action for the Approval Request to be approved/rejected
     */
    @NotNull 
    private String action;

    /**
     * Approval Request payload
     */
    @Nullable 
    private ApprovalPutRequest body;

    /**
     * Constructs a validated implementation of {@link ApproveorrejectApprovalRequestOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApproveorrejectApprovalRequestOperationSpec(Consumer<ApproveorrejectApprovalRequestOperationSpec> spec) {
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
        Objects.requireNonNull(approvalId, "approvalId is a required parameter!");
        Objects.requireNonNull(action, "action is a required parameter!");
    }

}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.ApprovalPutRequest;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalRequest;
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
 * ApproveorrejectApprovalRequestSpec
 * <p>
 * Specification for the ApproveorrejectApprovalRequest operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link ApproveorrejectApprovalRequestOperationSpec}.
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
     * Constructs a validated instance of {@link ApproveorrejectApprovalRequestOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param approvalId           ApprovalId for the Approval Request to be approved
     * @param action               Action for the Approval Request to be approved/rejected
     * @param body                 Approval Request payload
     */
    @ApiStatus.Internal
    public ApproveorrejectApprovalRequestOperationSpec(String approvalId, String action, ApprovalPutRequest body) {
        this.approvalId = approvalId;
        this.action = action;
        this.body = body;

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

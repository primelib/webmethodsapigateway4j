package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApprovalConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "approvalMode",
    "approvedEmailConfiguration",
    "approversGroupId",
    "autoApproval",
    "eventType",
    "id",
    "initiateApprovalRequestEmailConfiguration",
    "isEnabled",
    "rejectedEmailConfiguration",
    "teamApprovers"
})
@JsonTypeName("ApprovalConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalConfiguration {

    /**
     * Constructs a validated implementation of {@link ApprovalConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApprovalConfiguration(Consumer<ApprovalConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Only possible value is anyone. This implies that, any one user associated with the approvers team can approve or reject the requests. The requester need not wait for the approval of each approver in the approvers group.
     */
    @JsonProperty("approvalMode")
    protected String approvalMode;

    @JsonProperty("approvedEmailConfiguration")
    protected EmailConfiguration approvedEmailConfiguration;

    /**
     * Approvers Accessprofile Identifier. Whoever belongs to the selected team will be considered as Approvers
     */
    @JsonProperty("approversGroupId")
    protected String approversGroupId;

    /**
     * The created request will be auto-approved when the requester is a valid approver and the value is true. Default value is true.
     */
    @JsonProperty("autoApproval")
    protected Boolean autoApproval;

    /**
     * Event Type: Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
     */
    @JsonProperty("eventType")
    protected String eventType;

    /**
     * Unique identifier of a Approval Configuration. Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("initiateApprovalRequestEmailConfiguration")
    protected EmailConfiguration initiateApprovalRequestEmailConfiguration;

    /**
     * true/false. true value enforces approvals for the mentioned eventtype
     */
    @JsonProperty("isEnabled")
    protected Boolean isEnabled;

    @JsonProperty("rejectedEmailConfiguration")
    protected EmailConfiguration rejectedEmailConfiguration;

    /**
     * The asset specific team approvers will be the approvers when the value is true. Default value is false.
     */
    @JsonProperty("teamApprovers")
    protected Boolean teamApprovers;


}

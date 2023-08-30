package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApprovalConfiguration
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link ApprovalConfiguration}.
     *
     * @param spec the specification to process
     */
    public ApprovalConfiguration(Consumer<ApprovalConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApprovalConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApprovalConfiguration(Consumer)} instead.
     * @param approvalMode Only possible value is anyone. This implies that, any one user associated with the approvers team can approve or reject the requests. The requester need not wait for the approval of each approver in the approvers group.
     * @param approvedEmailConfiguration approvedEmailConfiguration
     * @param approversGroupId Approvers Accessprofile Identifier. Whoever belongs to the selected team will be considered as Approvers
     * @param autoApproval The created request will be auto-approved when the requester is a valid approver and the value is true. Default value is true.
     * @param eventType Event Type: Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
     * @param id Unique identifier of a Approval Configuration. Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
     * @param initiateApprovalRequestEmailConfiguration initiateApprovalRequestEmailConfiguration
     * @param isEnabled true/false. true value enforces approvals for the mentioned eventtype
     * @param rejectedEmailConfiguration rejectedEmailConfiguration
     * @param teamApprovers The asset specific team approvers will be the approvers when the value is true. Default value is false.
     */
    @ApiStatus.Internal
    public ApprovalConfiguration(String approvalMode, EmailConfiguration approvedEmailConfiguration, String approversGroupId, Boolean autoApproval, String eventType, String id, EmailConfiguration initiateApprovalRequestEmailConfiguration, Boolean isEnabled, EmailConfiguration rejectedEmailConfiguration, Boolean teamApprovers) {
        this.approvalMode = approvalMode;
        this.approvedEmailConfiguration = approvedEmailConfiguration;
        this.approversGroupId = approversGroupId;
        this.autoApproval = autoApproval;
        this.eventType = eventType;
        this.id = id;
        this.initiateApprovalRequestEmailConfiguration = initiateApprovalRequestEmailConfiguration;
        this.isEnabled = isEnabled;
        this.rejectedEmailConfiguration = rejectedEmailConfiguration;
        this.teamApprovers = teamApprovers;
    }

}

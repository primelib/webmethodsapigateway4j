// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// ApprovalMgmtApprovalConfiguration This model contains details about an ApprovalConfiguration in API Gateway

type ApprovalMgmtApprovalConfiguration struct {
	ApprovalMode                              *string                         `json:"approvalMode" form:"name=approvalMode"`                                                                // Only possible value is anyone. This implies that, any one user associated with the approvers team can approve or reject the requests. The requester need not wait for the approval of each approver in the approvers group.
	ApprovedEmailConfiguration                *ApprovalMgmtEmailConfiguration `json:"approvedEmailConfiguration" form:"name=approvedEmailConfiguration,json"`                               // This model contains details about an EmailConfiguration configured in Approvals of API Gateway
	ApproversGroupId                          *string                         `json:"approversGroupId" form:"name=approversGroupId"`                                                        // Approvers Accessprofile Identifier. Whoever belongs to the selected team will be considered as Approvers
	AutoApproval                              *bool                           `json:"autoApproval" form:"name=autoApproval"`                                                                // The created request will be auto-approved when the requester is a valid approver and the value is true. Default value is true.
	EventType                                 *string                         `json:"eventType" form:"name=eventType"`                                                                      // Event Type: Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
	Id                                        *string                         `json:"id" form:"name=id"`                                                                                    // Unique identifier of a Approval Configuration. Any of 'createApplication', 'updateApplication', 'registerApplication', 'subscribePackage' and 'changeOwner'
	InitiateApprovalRequestEmailConfiguration *ApprovalMgmtEmailConfiguration `json:"initiateApprovalRequestEmailConfiguration" form:"name=initiateApprovalRequestEmailConfiguration,json"` // This model contains details about an EmailConfiguration configured in Approvals of API Gateway
	IsEnabled                                 *bool                           `json:"isEnabled" form:"name=isEnabled"`                                                                      // true/false. true value enforces approvals for the mentioned eventtype
	OwningTeamApprovalRequired                *bool                           `json:"owningTeamApprovalRequired" form:"name=owningTeamApprovalRequired"`                                    // The asset specific team approvers will be the approvers when the value is true. Default value is false.
	RejectedEmailConfiguration                *ApprovalMgmtEmailConfiguration `json:"rejectedEmailConfiguration" form:"name=rejectedEmailConfiguration,json"`                               // This model contains details about an EmailConfiguration configured in Approvals of API Gateway
}

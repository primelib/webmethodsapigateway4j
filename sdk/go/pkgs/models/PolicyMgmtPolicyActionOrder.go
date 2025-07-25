// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// PolicyMgmtPolicyActionOrder PolicyActionOrder is used to specify the policy enforcement order in its respective stage

type PolicyMgmtPolicyActionOrder struct {
	IsCustomOrderSupported *bool     `json:"isCustomOrderSupported" form:"name=isCustomOrderSupported"`
	OrderPosition          *string   `json:"orderPosition" form:"name=orderPosition"`              // Order of the policy enforcement.   1. First - policy enforcement needs to be added in its respective stage.   2. Last - policy enforcement needs to be added as last in its respective stage.   3. Before First occurrence - Policy needs to be added before the first occurrence of policyTemplateIds specified.   4. After last occurrence - Policy needs to be added after last occurrence of policyTemplateIds specified
	PolicyTemplateIDS      []*string `json:"policyTemplateIDs" form:"name=policyTemplateIDs,json"` // List of policy template ids needed to process the order before first occurrence and after last occurrence
	Sequence               []*string `json:"sequence" form:"name=sequence,json"`                   // Sequence of the policy enforcement.  1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.   2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.   3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error
}

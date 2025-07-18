// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// PolicyMgmtPolicyEnforcements This model contains the list of policy action id specific to a stage.

type PolicyMgmtPolicyEnforcements struct {
	Enforcements []*PolicyMgmtEnforcement `json:"enforcements" form:"name=enforcements,json"`
	StageKey     *string                  `json:"stageKey" form:"name=stageKey"` // Policy stage. User can refer resource /policyStages to get the list stages can be added here
}

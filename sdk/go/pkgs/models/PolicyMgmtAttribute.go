// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// PolicyMgmtAttribute An Attribute contains the field of the an API or resource or operation and the value to be processed on the fields based on the operation specified. If attribute specifies any Http Method then operation wont have any significance.

type PolicyMgmtAttribute struct {
	AttributeName *string `json:"attributeName" form:"name=attributeName"` // The field name on which needs to be satisfied by the APIs.
	Operation     *string `json:"operation" form:"name=operation"`         // Operation that needs to performed on the field specified.
	Value         *string `json:"value" form:"name=value"`                 // Value the needs to processed on the field and operation specified.
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type MonetizationSecuritySchemeDescriptor struct {
	Headers         *Headers         `json:"headers" form:"name=headers,json"`
	QueryParameters *QueryParameters `json:"queryParameters" form:"name=queryParameters,json"` // Incoming query parameters
	Responses       *Responses       `json:"responses" form:"name=responses,json"`
}

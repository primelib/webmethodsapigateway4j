// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type MonetizationContact struct {
	Email *string `json:"email" form:"name=email"` // The email address of the contact person/organization
	Name  *string `json:"name" form:"name=name"`   // The identifying name of the contact person/organization
	Url   *string `json:"url" form:"name=url"`     // The URL pointing to the contact information
}

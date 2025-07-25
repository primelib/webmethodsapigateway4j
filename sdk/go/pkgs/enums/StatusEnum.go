// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package enums

// StatusEnum Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
type StatusEnum string

const (
	StatusEnumNew       StatusEnum = "NEW"
	StatusEnumPublished StatusEnum = "PUBLISHED"
	StatusEnumSuspended StatusEnum = "SUSPENDED"
)

func (e StatusEnum) ToPointer() *StatusEnum {
	return &e
}

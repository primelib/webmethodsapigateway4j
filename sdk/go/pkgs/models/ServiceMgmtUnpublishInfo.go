// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtUnpublishInfo struct {
	APIId              *string   `json:"apiId" form:"name=apiId"`                                // API id for the API to be unpublished. This field is required.
	ServiceRegistryIDS []*string `json:"serviceRegistryIds" form:"name=serviceRegistryIds,json"` // List of ids of the service registries from which the API has to be unpublished. This field is required.
}

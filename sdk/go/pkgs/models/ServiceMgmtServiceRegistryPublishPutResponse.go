// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtServiceRegistryPublishPutResponse struct {
	PublishResponse  *ServiceMgmtPublishResponse   `json:"publishResponse" form:"name=publishResponse,json"`
	PublishResponses []*ServiceMgmtPublishResponse `json:"publishResponses" form:"name=publishResponses,json"` // This contains the service registry publish status for requests publishing more than one API to one or more service registries.
}

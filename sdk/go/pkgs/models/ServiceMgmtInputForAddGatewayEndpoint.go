// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// ServiceMgmtInputForAddGatewayEndpoint To add a new Gateway endpoint of this API

type ServiceMgmtInputForAddGatewayEndpoint struct {
	EndpointName    *string `json:"endpointName" form:"name=endpointName"`       // Name of the endpoint
	GatewayEndpoint *string `json:"gatewayEndpoint" form:"name=gatewayEndpoint"` // Gateway endpoint value
}

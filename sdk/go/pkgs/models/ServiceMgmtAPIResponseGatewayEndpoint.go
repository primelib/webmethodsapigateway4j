// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtAPIResponseGatewayEndpoint struct {
	Endpoint            *string   `json:"endpoint" form:"name=endpoint"`
	EndpointDisplayName *string   `json:"endpointDisplayName" form:"name=endpointDisplayName"`
	EndpointName        *string   `json:"endpointName" form:"name=endpointName"`
	EndpointType        *string   `json:"endpointType" form:"name=endpointType"`
	EndpointUrls        []*string `json:"endpointUrls" form:"name=endpointUrls,json"`
}

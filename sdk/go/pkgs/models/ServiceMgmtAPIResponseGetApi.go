// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtAPIResponseGetApi struct {
	Api              *ServiceMgmtGatewayApi `json:"api" form:"name=api,json"`
	APIId            *string                `json:"apiId" form:"name=apiId"`
	ErrorReason      *string                `json:"errorReason" form:"name=errorReason"`
	GatewayEndPoints []*string              `json:"gatewayEndPoints" form:"name=gatewayEndPoints,json"`
	ResponseStatus   *string                `json:"responseStatus" form:"name=responseStatus"` // Response status
	Versions         []*ServiceMgmtVersion  `json:"versions" form:"name=versions,json"`
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type LicenseDetail struct {
	APIGateway         *APIGateway         `json:"API Gateway" form:"name=API Gateway,json"`
	SalesInformation   *SalesInformation   `json:"Sales Information" form:"name=Sales Information,json"`
	IntegrationServer  *IntegrationServer  `json:"integrationServer" form:"name=integrationServer,json"`
	LicenseInformation *LicenseInformation `json:"licenseInformation" form:"name=licenseInformation,json"`
	ProductInformation *ProductInformation `json:"productInformation" form:"name=productInformation,json"`
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package enums

type EndpointTypeEnum string

const (
	EndpointTypeEnumAPILevel     EndpointTypeEnum = "API_LEVEL"
	EndpointTypeEnumDefault      EndpointTypeEnum = "DEFAULT"
	EndpointTypeEnumGlobal       EndpointTypeEnum = "GLOBAL"
	EndpointTypeEnumMicroGateway EndpointTypeEnum = "MICRO_GATEWAY"
)

func (e EndpointTypeEnum) ToPointer() *EndpointTypeEnum {
	return &e
}

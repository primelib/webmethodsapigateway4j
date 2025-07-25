// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package enums

// FilterTypeEnum This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
type FilterTypeEnum string

const (
	FilterTypeEnumApi        FilterTypeEnum = "API"
	FilterTypeEnumHttpMethod FilterTypeEnum = "HTTP_METHOD"
)

func (e FilterTypeEnum) ToPointer() *FilterTypeEnum {
	return &e
}

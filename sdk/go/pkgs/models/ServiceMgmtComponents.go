// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtComponents struct {
	Callbacks        *Callbacks        `json:"callbacks" form:"name=callbacks,json"` // An optional, string description, intended to apply to all operations in this path
	Examples         *Examples         `json:"examples" form:"name=examples,json"`   // Examples of the media type. Each example SHOULD contain a value in the correct format as specified in the parameter encoding. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
	Headers          *Headers          `json:"headers" form:"name=headers,json"`
	Links            *Links            `json:"links" form:"name=links,json"` // A map of operations links that can be followed from the response. The key of the map is a short name for the link, following the naming constraints of the names for Component Objects.
	Parameters       *Parameters       `json:"parameters" form:"name=parameters,json"`
	RequestBodies    *RequestBodies    `json:"requestBodies" form:"name=requestBodies,json"` // An object to hold reusable requestBody objects
	Responses        *Responses        `json:"responses" form:"name=responses,json"`
	Schemas          *Schemas          `json:"schemas" form:"name=schemas,json"`                 // An object to hold reusable schema objects
	SecuritySchemes  *SecuritySchemes  `json:"securitySchemes" form:"name=securitySchemes,json"` // An object to hold reusable securityScheme objects
	VendorExtensions *VendorExtensions `json:"vendorExtensions" form:"name=vendorExtensions,json"`
}

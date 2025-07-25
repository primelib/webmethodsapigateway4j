// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type MonetizationMediaType struct {
	Example          *interface{}        `json:"example" form:"name=example,json"`   // A free-form property to include an example of an instance for this schema. To represent examples that cannot be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where necessary
	Examples         *Examples           `json:"examples" form:"name=examples,json"` // Examples of the media type. Each example SHOULD contain a value in the correct format as specified in the parameter encoding. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
	Schema           *MonetizationSchema `json:"schema" form:"name=schema,json"`
	VendorExtensions *VendorExtensions   `json:"vendorExtensions" form:"name=vendorExtensions,json"`
}

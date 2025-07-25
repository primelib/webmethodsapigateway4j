// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtXml struct {
	Attribute        *bool             `json:"attribute" form:"name=attribute"` // Declares whether the property definition translates to an attribute instead of an element. Default value is false
	Name             *string           `json:"name" form:"name=name"`           // Replaces the name of the element/attribute used for the described schema property. When defined within items, it will affect the name of the individual XML elements within the list. When defined alongside type being array (outside the items), it will affect the wrapping element and only if wrapped is true. If wrapped is false, it will be ignored
	Namespace        *string           `json:"namespace" form:"name=namespace"` // The URI of the namespace definition
	Prefix           *string           `json:"prefix" form:"name=prefix"`       // The prefix to be used for the name
	VendorExtensions *VendorExtensions `json:"vendorExtensions" form:"name=vendorExtensions,json"`
	Wrapped          *bool             `json:"wrapped" form:"name=wrapped"` // MAY be used only for an array definition. Signifies whether the array is wrapped (for example, <books><book/><book/></books>) or unwrapped (<book/><book/>). Default value is false
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtCallback struct {
	CallbacksMap     *CallbacksMap     `json:"callbacksMap" form:"name=callbacksMap,json"` // A Path Item Object used to define a callback request and expected responses
	Getref           *string           `json:"get$ref" form:"name=get$ref"`
	VendorExtensions *VendorExtensions `json:"vendorExtensions" form:"name=vendorExtensions,json"`
}

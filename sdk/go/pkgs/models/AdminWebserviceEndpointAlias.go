// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type AdminWebserviceEndpointAlias struct {
	WebserviceEndpointAliasId  *string `json:"WebserviceEndpointAliasId" form:"name=WebserviceEndpointAliasId"`   // A unique ID for the WebserviceEndpointAlias
	Alias                      *string `json:"alias" form:"name=alias"`                                           // The name of the WebserviceEndpointAlias
	AliasType                  *string `json:"aliasType" form:"name=aliasType"`                                   // The property specifies the aliasType, Either it should be Provider or Consumer
	Description                *string `json:"description" form:"name=description"`                               // The description of the WebserviceEndpointAlias
	KeyAlias                   *string `json:"keyAlias" form:"name=keyAlias"`                                     // this property specifies the keyalias name
	KeyStoreAlias              *string `json:"keyStoreAlias" form:"name=keyStoreAlias"`                           // this property specifies the keystorealias name
	TimestampMaximumSkew       *string `json:"timestampMaximumSkew" form:"name=timestampMaximumSkew"`             // this property specifies the timestampMaximumSkew value
	TimestampPrecisionInMillis *string `json:"timestampPrecisionInMillis" form:"name=timestampPrecisionInMillis"` // this property specifies the timestampPrecisionInMillis
	TimestampTimeToLive        *string `json:"timestampTimeToLive" form:"name=timestampTimeToLive"`               // this property specifies the timestampTimeToLive value
	TransportType              *string `json:"transportType" form:"name=transportType"`                           // this defines the transport type. The supported transport type is JMS
	TrustStoreAlias            *string `json:"trustStoreAlias" form:"name=trustStoreAlias"`                       // this property specifies the trustStoreAlias name
}

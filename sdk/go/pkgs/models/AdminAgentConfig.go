// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// AdminAgentConfig This defines the Control Plane Agent configuration of API Gateway.

type AdminAgentConfig struct {
	ControlPlaneConfig *AdminControlPlaneConfig `json:"controlPlaneConfig" form:"name=controlPlaneConfig,json"`
	Enabled            *bool                    `json:"enabled" form:"name=enabled"` // Denotes the communication between API Gateway and Control Plane
	EntityId           *string                  `json:"entityId" form:"name=entityId"`
	ExternalConfig     *bool                    `json:"externalConfig" form:"name=externalConfig"`
	Id                 *string                  `json:"id" form:"name=id"` // Agent configuration object ID in API Gateway.
	RuntimeConfig      *AdminRuntimeConfig      `json:"runtimeConfig" form:"name=runtimeConfig,json"`
}

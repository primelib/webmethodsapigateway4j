// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type AdminControlPlaneConfig struct {
	ControlPlaneUrl *string     `json:"controlPlaneURL" form:"name=controlPlaneURL"`
	CpToken         *string     `json:"cpToken" form:"name=cpToken"`
	Password        *string     `json:"password" form:"name=password"`
	Retry           *AdminRetry `json:"retry" form:"name=retry,json"`
	Username        *string     `json:"username" form:"name=username"`
}

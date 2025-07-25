// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type SystemInfo struct {
	CpuCores      *string `json:"CPU.cores" form:"name=CPU.cores"`
	CpuType       *string `json:"CPU.type" form:"name=CPU.type"`
	HwMemoryGb    *string `json:"HW.memory[GB]" form:"name=HW.memory[GB]"`
	Hostname      *string `json:"Hostname" form:"name=Hostname"`
	OsName        *string `json:"OS.Name" form:"name=OS.Name"`
	OsRelease     *string `json:"OS.Release" form:"name=OS.Release"`
	OsServicePack *string `json:"OS.Service.Pack" form:"name=OS.Service.Pack"`
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package enums

type ActivateDcR200 string

const (
	ActivateDcR200ActiveRing ActivateDcR200 = "ACTIVE_RING"
	ActivateDcR200Broadcast  ActivateDcR200 = "BROADCAST"
	ActivateDcR200Standalone ActivateDcR200 = "STANDALONE"
	ActivateDcR200Standby    ActivateDcR200 = "STANDBY"
)

func (e ActivateDcR200) ToPointer() *ActivateDcR200 {
	return &e
}

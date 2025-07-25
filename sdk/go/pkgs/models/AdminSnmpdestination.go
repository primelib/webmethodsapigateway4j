// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// AdminSnmpdestination This defines the configurations required for the SNMP destination.

type AdminSnmpdestination struct {
	Hostname                 *string `json:"hostname" form:"name=hostname"`                                 // Flag to enable save of the life cycle events.
	Port                     *string `json:"port" form:"name=port"`                                         // The SNMP trap receiver port that is listening for SNMP requests and packets.
	SendErrorEvent           *string `json:"sendErrorEvent" form:"name=sendErrorEvent"`                     // Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
	SendLifecycleEvent       *string `json:"sendLifecycleEvent" form:"name=sendLifecycleEvent"`             // Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
	SendPolicyViolationEvent *string `json:"sendPolicyViolationEvent" form:"name=sendPolicyViolationEvent"` // Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
	SnmpTargetType           *string `json:"snmpTargetType" form:"name=snmpTargetType"`                     // Specifies target type of the SNMP server.
	Transport                *string `json:"transport" form:"name=transport"`                               // The protocol used by SNMP to send traps. The available options are: TCP and UDP. By default, TCP is selected.
	UseAuthorization         *string `json:"useAuthorization" form:"name=useAuthorization"`                 // Specifies whether an authorization key is required.
	UsePrivacy               *string `json:"usePrivacy" form:"name=usePrivacy"`                             // Specifies whether a privacy (encryption) key is required.
	Username                 *string `json:"username" form:"name=username"`                                 // If User is selected as the SNMP target type, then the Username field specifies the SNMPv3 user name to use when connecting to the receiver.
}

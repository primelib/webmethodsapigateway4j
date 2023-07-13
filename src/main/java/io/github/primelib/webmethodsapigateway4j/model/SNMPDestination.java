package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SNMPDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "hostname",
    "port",
    "sendErrorEvent",
    "sendLifecycleEvent",
    "sendPolicyViolationEvent",
    "snmpTargetType",
    "transport",
    "useAuthorization",
    "usePrivacy",
    "username"
})
@JsonTypeName("SNMPDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SNMPDestination {

    /**
     * Flag to enable save of the life cycle events.
     */
    @JsonProperty("hostname")
    private String hostname;

    /**
     * The SNMP trap receiver port that is listening for SNMP requests and packets.
     */
    @JsonProperty("port")
    private String port;

    /**
     * Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     */
    @JsonProperty("sendErrorEvent")
    private String sendErrorEvent;

    /**
     * Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     */
    @JsonProperty("sendLifecycleEvent")
    private String sendLifecycleEvent;

    /**
     * Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     */
    @JsonProperty("sendPolicyViolationEvent")
    private String sendPolicyViolationEvent;

    /**
     * Specifies target type of the SNMP server.
     */
    @JsonProperty("snmpTargetType")
    private String snmpTargetType;

    /**
     * The protocol used by SNMP to send traps. The available options are: TCP and UDP. By default, TCP is selected.
     */
    @JsonProperty("transport")
    private String transport;

    /**
     * Specifies whether an authorization key is required. 
     */
    @JsonProperty("useAuthorization")
    private String useAuthorization;

    /**
     * Specifies whether a privacy (encryption) key is required.
     */
    @JsonProperty("usePrivacy")
    private String usePrivacy;

    /**
     * If User is selected as the SNMP target type, then the Username field specifies the SNMPv3 user name to use when connecting to the receiver.
     */
    @JsonProperty("username")
    private String username;


}

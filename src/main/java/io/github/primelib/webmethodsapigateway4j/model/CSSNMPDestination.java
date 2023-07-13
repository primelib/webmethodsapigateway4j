package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CSSNMPDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "authorizationPassword",
    "authorizationProtocol",
    "hostname",
    "port",
    "privacyPassword",
    "privacyProtocol",
    "sendTRAPsToCentrasite",
    "transport",
    "username"
})
@JsonTypeName("CSSNMPDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CSSNMPDestination {

    /**
     * Specifies the password to be used for authorization protocol.
     */
    @JsonProperty("authorizationPassword")
    private String authorizationPassword;

    /**
     * Specifies the authorization protocol that is used by the SNMP Listener for decoding the incoming trap.
     */
    @JsonProperty("authorizationProtocol")
    private String authorizationProtocol;

    /**
     * Specifies the CentraSite host name or IP address to which the SNMP listener binds.
     */
    @JsonProperty("hostname")
    private String hostname;

    /**
     * Specifies the port to which the SNMP listener binds. The default port number for CentraSite's SNMP server is 8181.
     */
    @JsonProperty("port")
    private String port;

    /**
     * Specifies the password to be used for privacy protocol.
     */
    @JsonProperty("privacyPassword")
    private String privacyPassword;

    /**
     * Specifies the privacy protocol that is used by the SNMP Listener for decoding the incoming trap.
     */
    @JsonProperty("privacyProtocol")
    private String privacyProtocol;

    /**
     * Specifies whether the events has to be sent from API Gateway to CentraSite.
     */
    @JsonProperty("sendTRAPsToCentrasite")
    private String sendTRAPsToCentrasite;

    /**
     * Specifies the wire transport protocol that is used by the SNMP Listener.
     */
    @JsonProperty("transport")
    private String transport;

    /**
     * Specifies the SecurityName that is used by the SNMP Listener.
     */
    @JsonProperty("username")
    private String username;


}

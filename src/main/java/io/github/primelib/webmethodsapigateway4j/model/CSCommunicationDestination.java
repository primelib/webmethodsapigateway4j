package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CSCommunicationDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "gatewayAssetId",
    "hostname",
    "password",
    "protocol",
    "targetname",
    "uddiPort",
    "username"
})
@JsonTypeName("CSCommunicationDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CSCommunicationDestination {

    /**
     * Specifies the registered API Gateway ID.
     */
    @JsonProperty("gatewayAssetId")
    private String gatewayAssetId;

    /**
     * Specifies the host name or IP address of the machine on which CentraSite Application Server Tier (CAST) is running.
     */
    @JsonProperty("hostname")
    private String hostname;

    /**
     * Specifies the password for authenticating CentraSite when API Gateway communicates with CentraSite.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Specifies the communication protocol used to establish communication between API Gateway and CentraSite.
     */
    @JsonProperty("protocol")
    private String protocol;

    /**
     * Specifies the name of the API Gateway asset as defined in CentraSite.
     */
    @JsonProperty("targetname")
    private String targetname;

    /**
     * Specifies the port on which CAST is listening. The default port number for CAST is 53307.
     */
    @JsonProperty("uddiPort")
    private String uddiPort;

    /**
     * Specifies the CentraSite user ID for authenticating CentraSite when API Gateway communicates with CentraSite. This implies the user ID of a user who has the CentraSite Administrator role or the API Gateway Administrator role in CentraSite.
     */
    @JsonProperty("username")
    private String username;


}

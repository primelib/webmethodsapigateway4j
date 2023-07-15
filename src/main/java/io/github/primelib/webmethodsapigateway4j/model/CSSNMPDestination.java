package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CSSNMPDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CSSNMPDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CSSNMPDestination(Consumer<CSSNMPDestination> spec) {
        spec.accept(this);
    }

    /**
     * Specifies the password to be used for authorization protocol.
     */
    @JsonProperty("authorizationPassword")
    protected String authorizationPassword;

    /**
     * Specifies the authorization protocol that is used by the SNMP Listener for decoding the incoming trap.
     */
    @JsonProperty("authorizationProtocol")
    protected String authorizationProtocol;

    /**
     * Specifies the CentraSite host name or IP address to which the SNMP listener binds.
     */
    @JsonProperty("hostname")
    protected String hostname;

    /**
     * Specifies the port to which the SNMP listener binds. The default port number for CentraSite's SNMP server is 8181.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * Specifies the password to be used for privacy protocol.
     */
    @JsonProperty("privacyPassword")
    protected String privacyPassword;

    /**
     * Specifies the privacy protocol that is used by the SNMP Listener for decoding the incoming trap.
     */
    @JsonProperty("privacyProtocol")
    protected String privacyProtocol;

    /**
     * Specifies whether the events has to be sent from API Gateway to CentraSite.
     */
    @JsonProperty("sendTRAPsToCentrasite")
    protected String sendTRAPsToCentrasite;

    /**
     * Specifies the wire transport protocol that is used by the SNMP Listener.
     */
    @JsonProperty("transport")
    protected String transport;

    /**
     * Specifies the SecurityName that is used by the SNMP Listener.
     */
    @JsonProperty("username")
    protected String username;


}

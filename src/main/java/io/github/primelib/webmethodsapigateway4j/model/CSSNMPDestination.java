package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CSSNMPDestination
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link CSSNMPDestination}.
     *
     * @param spec the specification to process
     */
    public CSSNMPDestination(Consumer<CSSNMPDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CSSNMPDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CSSNMPDestination(Consumer)} instead.
     * @param authorizationPassword Specifies the password to be used for authorization protocol.
     * @param authorizationProtocol Specifies the authorization protocol that is used by the SNMP Listener for decoding the incoming trap.
     * @param hostname Specifies the CentraSite host name or IP address to which the SNMP listener binds.
     * @param port Specifies the port to which the SNMP listener binds. The default port number for CentraSite's SNMP server is 8181.
     * @param privacyPassword Specifies the password to be used for privacy protocol.
     * @param privacyProtocol Specifies the privacy protocol that is used by the SNMP Listener for decoding the incoming trap.
     * @param sendTRAPsToCentrasite Specifies whether the events has to be sent from API Gateway to CentraSite.
     * @param transport Specifies the wire transport protocol that is used by the SNMP Listener.
     * @param username Specifies the SecurityName that is used by the SNMP Listener.
     */
    @ApiStatus.Internal
    public CSSNMPDestination(String authorizationPassword, String authorizationProtocol, String hostname, String port, String privacyPassword, String privacyProtocol, String sendTRAPsToCentrasite, String transport, String username) {
        this.authorizationPassword = authorizationPassword;
        this.authorizationProtocol = authorizationProtocol;
        this.hostname = hostname;
        this.port = port;
        this.privacyPassword = privacyPassword;
        this.privacyProtocol = privacyProtocol;
        this.sendTRAPsToCentrasite = sendTRAPsToCentrasite;
        this.transport = transport;
        this.username = username;
    }

}

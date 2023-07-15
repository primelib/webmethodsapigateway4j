package io.github.primelib.webmethodsapigateway4j.model;

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
 * SNMPDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link SNMPDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SNMPDestination(Consumer<SNMPDestination> spec) {
        spec.accept(this);
    }

    /**
     * Flag to enable save of the life cycle events.
     */
    @JsonProperty("hostname")
    protected String hostname;

    /**
     * The SNMP trap receiver port that is listening for SNMP requests and packets.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     */
    @JsonProperty("sendErrorEvent")
    protected String sendErrorEvent;

    /**
     * Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     */
    @JsonProperty("sendLifecycleEvent")
    protected String sendLifecycleEvent;

    /**
     * Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     */
    @JsonProperty("sendPolicyViolationEvent")
    protected String sendPolicyViolationEvent;

    /**
     * Specifies target type of the SNMP server.
     */
    @JsonProperty("snmpTargetType")
    protected String snmpTargetType;

    /**
     * The protocol used by SNMP to send traps. The available options are: TCP and UDP. By default, TCP is selected.
     */
    @JsonProperty("transport")
    protected String transport;

    /**
     * Specifies whether an authorization key is required. 
     */
    @JsonProperty("useAuthorization")
    protected String useAuthorization;

    /**
     * Specifies whether a privacy (encryption) key is required.
     */
    @JsonProperty("usePrivacy")
    protected String usePrivacy;

    /**
     * If User is selected as the SNMP target type, then the Username field specifies the SNMPv3 user name to use when connecting to the receiver.
     */
    @JsonProperty("username")
    protected String username;


}

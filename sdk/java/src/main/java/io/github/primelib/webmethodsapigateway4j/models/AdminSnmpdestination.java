// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AdminSnmpdestination
 * <p>
 * This defines the configurations required for the SNMP destination.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminSnmpdestination")
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
@Generated(value = "io.github.primelib.primecodegen")
public class AdminSnmpdestination {

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

    /**
     * Constructs a validated instance of {@link AdminSnmpdestination}.
     *
     * @param spec the specification to process
     */
    public AdminSnmpdestination(Consumer<AdminSnmpdestination> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminSnmpdestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminSnmpdestination(Consumer)} instead.
     * @param hostname Flag to enable save of the life cycle events.
     * @param port The SNMP trap receiver port that is listening for SNMP requests and packets.
     * @param sendErrorEvent Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     * @param sendLifecycleEvent Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     * @param sendPolicyViolationEvent Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     * @param snmpTargetType Specifies target type of the SNMP server.
     * @param transport The protocol used by SNMP to send traps. The available options are: TCP and UDP. By default, TCP is selected.
     * @param useAuthorization Specifies whether an authorization key is required. 
     * @param usePrivacy Specifies whether a privacy (encryption) key is required.
     * @param username If User is selected as the SNMP target type, then the Username field specifies the SNMPv3 user name to use when connecting to the receiver.
     */
    @ApiStatus.Internal
    public AdminSnmpdestination(String hostname, String port, String sendErrorEvent, String sendLifecycleEvent, String sendPolicyViolationEvent, String snmpTargetType, String transport, String useAuthorization, String usePrivacy, String username) {
        this.hostname = hostname;
        this.port = port;
        this.sendErrorEvent = sendErrorEvent;
        this.sendLifecycleEvent = sendLifecycleEvent;
        this.sendPolicyViolationEvent = sendPolicyViolationEvent;
        this.snmpTargetType = snmpTargetType;
        this.transport = transport;
        this.useAuthorization = useAuthorization;
        this.usePrivacy = usePrivacy;
        this.username = username;
    }
}

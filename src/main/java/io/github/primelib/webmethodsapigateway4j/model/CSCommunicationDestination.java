package io.github.primelib.webmethodsapigateway4j.model;

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
 * CSCommunicationDestination
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
    protected String gatewayAssetId;

    /**
     * Specifies the host name or IP address of the machine on which CentraSite Application Server Tier (CAST) is running.
     */
    @JsonProperty("hostname")
    protected String hostname;

    /**
     * Specifies the password for authenticating CentraSite when API Gateway communicates with CentraSite.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Specifies the communication protocol used to establish communication between API Gateway and CentraSite.
     */
    @JsonProperty("protocol")
    protected String protocol;

    /**
     * Specifies the name of the API Gateway asset as defined in CentraSite.
     */
    @JsonProperty("targetname")
    protected String targetname;

    /**
     * Specifies the port on which CAST is listening. The default port number for CAST is 53307.
     */
    @JsonProperty("uddiPort")
    protected String uddiPort;

    /**
     * Specifies the CentraSite user ID for authenticating CentraSite when API Gateway communicates with CentraSite. This implies the user ID of a user who has the CentraSite Administrator role or the API Gateway Administrator role in CentraSite.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link CSCommunicationDestination}.
     *
     * @param spec the specification to process
     */
    public CSCommunicationDestination(Consumer<CSCommunicationDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CSCommunicationDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CSCommunicationDestination(Consumer)} instead.
     * @param gatewayAssetId Specifies the registered API Gateway ID.
     * @param hostname Specifies the host name or IP address of the machine on which CentraSite Application Server Tier (CAST) is running.
     * @param password Specifies the password for authenticating CentraSite when API Gateway communicates with CentraSite.
     * @param protocol Specifies the communication protocol used to establish communication between API Gateway and CentraSite.
     * @param targetname Specifies the name of the API Gateway asset as defined in CentraSite.
     * @param uddiPort Specifies the port on which CAST is listening. The default port number for CAST is 53307.
     * @param username Specifies the CentraSite user ID for authenticating CentraSite when API Gateway communicates with CentraSite. This implies the user ID of a user who has the CentraSite Administrator role or the API Gateway Administrator role in CentraSite.
     */
    @ApiStatus.Internal
    public CSCommunicationDestination(String gatewayAssetId, String hostname, String password, String protocol, String targetname, String uddiPort, String username) {
        this.gatewayAssetId = gatewayAssetId;
        this.hostname = hostname;
        this.password = password;
        this.protocol = protocol;
        this.targetname = targetname;
        this.uddiPort = uddiPort;
        this.username = username;
    }

}

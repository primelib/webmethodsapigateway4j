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
 * AnalyticsDataStoreDestination
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
    "clientHttpResponseSize",
    "connectionTimeout",
    "hostname",
    "httpsEnabled",
    "httpsEnforceHostnameVerification",
    "keepAlive",
    "keepAliveMaxConnections",
    "keepAliveMaxConnectionsPerRoute",
    "keystoreAlias",
    "keystoreName",
    "keystorePassword",
    "maxRetryTimeout",
    "outboundProxyAlias",
    "outboundProxyEnabled",
    "password",
    "port",
    "protocol",
    "sniffEnabled",
    "sniffTimeInterval",
    "socketTimeout",
    "tenantId",
    "truststoreName",
    "truststorePassword",
    "username"
})
@JsonTypeName("AnalyticsDataStoreDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsDataStoreDestination {

    /**
     * Maximum Response payload size in mb.
     */
    @JsonProperty("clientHttpResponseSize")
    protected String clientHttpResponseSize;

    /**
     * Connection timeout in milli seconds between API Gateway and Analytics Data Store.
     */
    @JsonProperty("connectionTimeout")
    protected String connectionTimeout;

    /**
     * Specifies the host name or IP address of the machine on which Analytics Data Store Server is running.
     */
    @JsonProperty("hostname")
    protected String hostname;

    /**
     * Enable secure connection between API Gateway and Analytics Data Store.
     */
    @JsonProperty("httpsEnabled")
    protected String httpsEnabled;

    /**
     * Property to enforce hostname verification.
     */
    @JsonProperty("httpsEnforceHostnameVerification")
    protected String httpsEnforceHostnameVerification;

    /**
     * To use persistent connection between APIGateway and Analytics Data Store.
     */
    @JsonProperty("keepAlive")
    protected String keepAlive;

    /**
     * Maximum number of persistent connections that can be maintained between API Gateway and cluster of Analytics Data Store.
     */
    @JsonProperty("keepAliveMaxConnections")
    protected String keepAliveMaxConnections;

    /**
     * Maximum number of persistent connections that can be maintained between API Gateway and single Analytics Data Store for single HTTP route.
     */
    @JsonProperty("keepAliveMaxConnectionsPerRoute")
    protected String keepAliveMaxConnectionsPerRoute;

    /**
     * Alias name of the certificate that needs to be used from keystore.
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    /**
     * Keystore location for client authentication.
     */
    @JsonProperty("keystoreName")
    protected String keystoreName;

    /**
     * Keystore password.
     */
    @JsonProperty("keystorePassword")
    protected String keystorePassword;

    /**
     * Time out in milli seconds to wait for retries.
     */
    @JsonProperty("maxRetryTimeout")
    protected String maxRetryTimeout;

    /**
     * Outbound proxy alias name that is created in API Gateway.
     */
    @JsonProperty("outboundProxyAlias")
    protected String outboundProxyAlias;

    /**
     * Enable
     * outbound proxy settings between API Gateway and Analytics Data Store.
     */
    @JsonProperty("outboundProxyEnabled")
    protected String outboundProxyEnabled;

    /**
     * The password for the Analytics Data Store server instance.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Specifies the port on which the Analytics Data Store server runs.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * Specifies the communication protocol used to establish communication between API Gateway and Analytics Data Store.
     */
    @JsonProperty("protocol")
    protected String protocol;

    /**
     * Enable sniffer.
     */
    @JsonProperty("sniffEnabled")
    protected String sniffEnabled;

    /**
     * Time interval to refresh Elasticsearch node details in milliseconds.
     */
    @JsonProperty("sniffTimeInterval")
    protected String sniffTimeInterval;

    /**
     * Read timeout in milli seconds between API Gateway and Analytics Data Store.
     */
    @JsonProperty("socketTimeout")
    protected String socketTimeout;

    /**
     * Tenant name.
     */
    @JsonProperty("tenantId")
    protected String tenantId;

    /**
     * Truststore location contains Analytics Data Store certificate details.
     */
    @JsonProperty("truststoreName")
    protected String truststoreName;

    /**
     * Truststore password.
     */
    @JsonProperty("truststorePassword")
    protected String truststorePassword;

    /**
     * The username for the Analytics Data Store server instance.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link AnalyticsDataStoreDestination}.
     *
     * @param spec the specification to process
     */
    public AnalyticsDataStoreDestination(Consumer<AnalyticsDataStoreDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsDataStoreDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsDataStoreDestination(Consumer)} instead.
     * @param clientHttpResponseSize Maximum Response payload size in mb.
     * @param connectionTimeout Connection timeout in milli seconds between API Gateway and Analytics Data Store.
     * @param hostname Specifies the host name or IP address of the machine on which Analytics Data Store Server is running.
     * @param httpsEnabled Enable secure connection between API Gateway and Analytics Data Store.
     * @param httpsEnforceHostnameVerification Property to enforce hostname verification.
     * @param keepAlive To use persistent connection between APIGateway and Analytics Data Store.
     * @param keepAliveMaxConnections Maximum number of persistent connections that can be maintained between API Gateway and cluster of Analytics Data Store.
     * @param keepAliveMaxConnectionsPerRoute Maximum number of persistent connections that can be maintained between API Gateway and single Analytics Data Store for single HTTP route.
     * @param keystoreAlias Alias name of the certificate that needs to be used from keystore.
     * @param keystoreName Keystore location for client authentication.
     * @param keystorePassword Keystore password.
     * @param maxRetryTimeout Time out in milli seconds to wait for retries.
     * @param outboundProxyAlias Outbound proxy alias name that is created in API Gateway.
     * @param outboundProxyEnabled Enable  outbound proxy settings between API Gateway and Analytics Data Store.
     * @param password The password for the Analytics Data Store server instance.
     * @param port Specifies the port on which the Analytics Data Store server runs.
     * @param protocol Specifies the communication protocol used to establish communication between API Gateway and Analytics Data Store.
     * @param sniffEnabled Enable sniffer.
     * @param sniffTimeInterval Time interval to refresh Elasticsearch node details in milliseconds.
     * @param socketTimeout Read timeout in milli seconds between API Gateway and Analytics Data Store.
     * @param tenantId Tenant name.
     * @param truststoreName Truststore location contains Analytics Data Store certificate details.
     * @param truststorePassword Truststore password.
     * @param username The username for the Analytics Data Store server instance.
     */
    @ApiStatus.Internal
    public AnalyticsDataStoreDestination(String clientHttpResponseSize, String connectionTimeout, String hostname, String httpsEnabled, String httpsEnforceHostnameVerification, String keepAlive, String keepAliveMaxConnections, String keepAliveMaxConnectionsPerRoute, String keystoreAlias, String keystoreName, String keystorePassword, String maxRetryTimeout, String outboundProxyAlias, String outboundProxyEnabled, String password, String port, String protocol, String sniffEnabled, String sniffTimeInterval, String socketTimeout, String tenantId, String truststoreName, String truststorePassword, String username) {
        this.clientHttpResponseSize = clientHttpResponseSize;
        this.connectionTimeout = connectionTimeout;
        this.hostname = hostname;
        this.httpsEnabled = httpsEnabled;
        this.httpsEnforceHostnameVerification = httpsEnforceHostnameVerification;
        this.keepAlive = keepAlive;
        this.keepAliveMaxConnections = keepAliveMaxConnections;
        this.keepAliveMaxConnectionsPerRoute = keepAliveMaxConnectionsPerRoute;
        this.keystoreAlias = keystoreAlias;
        this.keystoreName = keystoreName;
        this.keystorePassword = keystorePassword;
        this.maxRetryTimeout = maxRetryTimeout;
        this.outboundProxyAlias = outboundProxyAlias;
        this.outboundProxyEnabled = outboundProxyEnabled;
        this.password = password;
        this.port = port;
        this.protocol = protocol;
        this.sniffEnabled = sniffEnabled;
        this.sniffTimeInterval = sniffTimeInterval;
        this.socketTimeout = socketTimeout;
        this.tenantId = tenantId;
        this.truststoreName = truststoreName;
        this.truststorePassword = truststorePassword;
        this.username = username;
    }

}

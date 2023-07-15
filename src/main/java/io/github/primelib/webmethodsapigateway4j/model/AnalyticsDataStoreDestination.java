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
 * AnalyticsDataStoreDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AnalyticsDataStoreDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyticsDataStoreDestination(Consumer<AnalyticsDataStoreDestination> spec) {
        spec.accept(this);
    }

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


}

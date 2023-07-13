package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsDataStoreDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String clientHttpResponseSize;

    /**
     * Connection timeout in milli seconds between API Gateway and Analytics Data Store.
     */
    @JsonProperty("connectionTimeout")
    private String connectionTimeout;

    /**
     * Specifies the host name or IP address of the machine on which Analytics Data Store Server is running.
     */
    @JsonProperty("hostname")
    private String hostname;

    /**
     * Enable secure connection between API Gateway and Analytics Data Store.
     */
    @JsonProperty("httpsEnabled")
    private String httpsEnabled;

    /**
     * Property to enforce hostname verification.
     */
    @JsonProperty("httpsEnforceHostnameVerification")
    private String httpsEnforceHostnameVerification;

    /**
     * To use persistent connection between APIGateway and Analytics Data Store.
     */
    @JsonProperty("keepAlive")
    private String keepAlive;

    /**
     * Maximum number of persistent connections that can be maintained between API Gateway and cluster of Analytics Data Store.
     */
    @JsonProperty("keepAliveMaxConnections")
    private String keepAliveMaxConnections;

    /**
     * Maximum number of persistent connections that can be maintained between API Gateway and single Analytics Data Store for single HTTP route.
     */
    @JsonProperty("keepAliveMaxConnectionsPerRoute")
    private String keepAliveMaxConnectionsPerRoute;

    /**
     * Alias name of the certificate that needs to be used from keystore.
     */
    @JsonProperty("keystoreAlias")
    private String keystoreAlias;

    /**
     * Keystore location for client authentication.
     */
    @JsonProperty("keystoreName")
    private String keystoreName;

    /**
     * Keystore password.
     */
    @JsonProperty("keystorePassword")
    private String keystorePassword;

    /**
     * Time out in milli seconds to wait for retries.
     */
    @JsonProperty("maxRetryTimeout")
    private String maxRetryTimeout;

    /**
     * Outbound proxy alias name that is created in API Gateway.
     */
    @JsonProperty("outboundProxyAlias")
    private String outboundProxyAlias;

    /**
     * Enable
     * outbound proxy settings between API Gateway and Analytics Data Store.
     */
    @JsonProperty("outboundProxyEnabled")
    private String outboundProxyEnabled;

    /**
     * The password for the Analytics Data Store server instance.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Specifies the port on which the Analytics Data Store server runs.
     */
    @JsonProperty("port")
    private String port;

    /**
     * Specifies the communication protocol used to establish communication between API Gateway and Analytics Data Store.
     */
    @JsonProperty("protocol")
    private String protocol;

    /**
     * Enable sniffer.
     */
    @JsonProperty("sniffEnabled")
    private String sniffEnabled;

    /**
     * Time interval to refresh Elasticsearch node details in milliseconds.
     */
    @JsonProperty("sniffTimeInterval")
    private String sniffTimeInterval;

    /**
     * Read timeout in milli seconds between API Gateway and Analytics Data Store.
     */
    @JsonProperty("socketTimeout")
    private String socketTimeout;

    /**
     * Tenant name.
     */
    @JsonProperty("tenantId")
    private String tenantId;

    /**
     * Truststore location contains Analytics Data Store certificate details.
     */
    @JsonProperty("truststoreName")
    private String truststoreName;

    /**
     * Truststore password.
     */
    @JsonProperty("truststorePassword")
    private String truststorePassword;

    /**
     * The username for the Analytics Data Store server instance.
     */
    @JsonProperty("username")
    private String username;


}

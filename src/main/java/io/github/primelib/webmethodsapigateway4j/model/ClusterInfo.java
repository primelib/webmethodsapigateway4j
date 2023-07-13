package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClusterInfo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "actionOnStartupError",
    "cacheManagerName",
    "cacheName",
    "clusterAware",
    "clusterName",
    "clusterSessTimeout",
    "currentlyClustered",
    "message",
    "pendingRestart",
    "tsaURLs"
})
@JsonTypeName("ClusterInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ClusterInfo {

    /**
     * How APIGateway responds when an error at start up prevents APIGateway from joining the cluster.
     */
    @JsonProperty("actionOnStartupError")
    private String actionOnStartupError;

    /**
     * The default cache manager.
     */
    @JsonProperty("cacheManagerName")
    private String cacheManagerName;

    /**
     * The default cache.
     */
    @JsonProperty("cacheName")
    private String cacheName;

    /**
     * The property which is used to find whether APIGateway is cluster aware.
     */
    @JsonProperty("clusterAware")
    private Boolean clusterAware;

    /**
     * Name of the cluster to which this APIGateway belongs.
     */
    @JsonProperty("clusterName")
    private String clusterName;

    /**
     * Number of minutes an inactive session will be retained in the clustered session store. The default is 60.
     */
    @JsonProperty("clusterSessTimeout")
    private String clusterSessTimeout;

    /**
     * The current clustered state of APIGateway.
     */
    @JsonProperty("currentlyClustered")
    private Boolean currentlyClustered;

    /**
     * Message to be displayed to the clients.
     */
    @JsonProperty("message")
    private String message;

    /**
     * The property used to determine whether APIGateway is pending for restart for the cluster settings to take effect.
     */
    @JsonProperty("pendingRestart")
    private Boolean pendingRestart;

    /**
     * A comma separated list of the URLs for the Terracotta Server Array to be used with the cluster to which this APIGateway belongs.
     */
    @JsonProperty("tsaURLs")
    private String tsaURLs;


}

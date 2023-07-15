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
 * ClusterInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ClusterInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ClusterInfo(Consumer<ClusterInfo> spec) {
        spec.accept(this);
    }

    /**
     * How APIGateway responds when an error at start up prevents APIGateway from joining the cluster.
     */
    @JsonProperty("actionOnStartupError")
    protected String actionOnStartupError;

    /**
     * The default cache manager.
     */
    @JsonProperty("cacheManagerName")
    protected String cacheManagerName;

    /**
     * The default cache.
     */
    @JsonProperty("cacheName")
    protected String cacheName;

    /**
     * The property which is used to find whether APIGateway is cluster aware.
     */
    @JsonProperty("clusterAware")
    protected Boolean clusterAware;

    /**
     * Name of the cluster to which this APIGateway belongs.
     */
    @JsonProperty("clusterName")
    protected String clusterName;

    /**
     * Number of minutes an inactive session will be retained in the clustered session store. The default is 60.
     */
    @JsonProperty("clusterSessTimeout")
    protected String clusterSessTimeout;

    /**
     * The current clustered state of APIGateway.
     */
    @JsonProperty("currentlyClustered")
    protected Boolean currentlyClustered;

    /**
     * Message to be displayed to the clients.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The property used to determine whether APIGateway is pending for restart for the cluster settings to take effect.
     */
    @JsonProperty("pendingRestart")
    protected Boolean pendingRestart;

    /**
     * A comma separated list of the URLs for the Terracotta Server Array to be used with the cluster to which this APIGateway belongs.
     */
    @JsonProperty("tsaURLs")
    protected String tsaURLs;


}

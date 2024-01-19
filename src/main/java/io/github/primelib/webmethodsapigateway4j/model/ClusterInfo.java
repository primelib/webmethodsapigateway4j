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
 * ClusterInfo
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

    /**
     * Constructs a validated instance of {@link ClusterInfo}.
     *
     * @param spec the specification to process
     */
    public ClusterInfo(Consumer<ClusterInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ClusterInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ClusterInfo(Consumer)} instead.
     * @param actionOnStartupError How APIGateway responds when an error at start up prevents APIGateway from joining the cluster.
     * @param cacheManagerName The default cache manager.
     * @param cacheName The default cache.
     * @param clusterAware The property which is used to find whether APIGateway is cluster aware.
     * @param clusterName Name of the cluster to which this APIGateway belongs.
     * @param clusterSessTimeout Number of minutes an inactive session will be retained in the clustered session store. The default is 60.
     * @param currentlyClustered The current clustered state of APIGateway.
     * @param message Message to be displayed to the clients.
     * @param pendingRestart The property used to determine whether APIGateway is pending for restart for the cluster settings to take effect.
     * @param tsaURLs A comma separated list of the URLs for the Terracotta Server Array to be used with the cluster to which this APIGateway belongs.
     */
    @ApiStatus.Internal
    public ClusterInfo(String actionOnStartupError, String cacheManagerName, String cacheName, Boolean clusterAware, String clusterName, String clusterSessTimeout, Boolean currentlyClustered, String message, Boolean pendingRestart, String tsaURLs) {
        this.actionOnStartupError = actionOnStartupError;
        this.cacheManagerName = cacheManagerName;
        this.cacheName = cacheName;
        this.clusterAware = clusterAware;
        this.clusterName = clusterName;
        this.clusterSessTimeout = clusterSessTimeout;
        this.currentlyClustered = currentlyClustered;
        this.message = message;
        this.pendingRestart = pendingRestart;
        this.tsaURLs = tsaURLs;
    }

}

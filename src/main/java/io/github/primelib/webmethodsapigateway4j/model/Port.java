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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Port
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
    "accessMode",
    "clientAuth",
    "configURL",
    "curDelay",
    "enabled",
    "factoryKey",
    "hasAccessList",
    "hasIPAccessList",
    "hostAccessMode",
    "hostAllow",
    "hostDeny",
    "idProvider",
    "internalPort",
    "ipAccessMode",
    "jsseEnabledProtocols",
    "keepAliveTimeout",
    "key",
    "listenerType",
    "listening",
    "maxQueue",
    "maxThread",
    "minThread",
    "pkg",
    "port",
    "portAlias",
    "portDescription",
    "protocol",
    "provider",
    "ssl",
    "status",
    "stepsize",
    "suspended",
    "threadPool",
    "threadPriority",
    "uniqueID",
    "usedThreadCount"
})
@JsonTypeName("Port")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Port {

    @JsonProperty("accessMode")
    protected String accessMode;

    @JsonProperty("clientAuth")
    protected String clientAuth;

    @JsonProperty("configURL")
    protected String configURL;

    @JsonProperty("curDelay")
    protected String curDelay;

    @JsonProperty("enabled")
    protected String enabled;

    @JsonProperty("factoryKey")
    protected String factoryKey;

    @JsonProperty("hasAccessList")
    protected String hasAccessList;

    @JsonProperty("hasIPAccessList")
    protected String hasIPAccessList;

    @JsonProperty("hostAccessMode")
    protected String hostAccessMode;

    @JsonProperty("hostAllow")
    protected List<String> hostAllow;

    @JsonProperty("hostDeny")
    protected List<String> hostDeny;

    @JsonProperty("idProvider")
    protected Object idProvider;

    @JsonProperty("internalPort")
    protected Integer internalPort;

    @JsonProperty("ipAccessMode")
    protected String ipAccessMode;

    @JsonProperty("jsseEnabledProtocols")
    protected Object jsseEnabledProtocols;

    @JsonProperty("keepAliveTimeout")
    protected String keepAliveTimeout;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("listenerType")
    protected String listenerType;

    @JsonProperty("listening")
    protected String listening;

    @JsonProperty("maxQueue")
    protected String maxQueue;

    @JsonProperty("maxThread")
    protected String maxThread;

    @JsonProperty("minThread")
    protected String minThread;

    @JsonProperty("pkg")
    protected String pkg;

    @JsonProperty("port")
    protected Integer port;

    @JsonProperty("portAlias")
    protected String portAlias;

    @JsonProperty("portDescription")
    protected String portDescription;

    @JsonProperty("protocol")
    protected String protocol;

    @JsonProperty("provider")
    protected String provider;

    @JsonProperty("ssl")
    protected String ssl;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("stepsize")
    protected String stepsize;

    @JsonProperty("suspended")
    protected String suspended;

    @JsonProperty("threadPool")
    protected String threadPool;

    @JsonProperty("threadPriority")
    protected String threadPriority;

    @JsonProperty("uniqueID")
    protected String uniqueID;

    @JsonProperty("usedThreadCount")
    protected String usedThreadCount;

    /**
     * Constructs a validated instance of {@link Port}.
     *
     * @param spec the specification to process
     */
    public Port(Consumer<Port> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Port}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Port(Consumer)} instead.
     * @param accessMode accessMode
     * @param clientAuth clientAuth
     * @param configURL configURL
     * @param curDelay curDelay
     * @param enabled enabled
     * @param factoryKey factoryKey
     * @param hasAccessList hasAccessList
     * @param hasIPAccessList hasIPAccessList
     * @param hostAccessMode hostAccessMode
     * @param hostAllow hostAllow
     * @param hostDeny hostDeny
     * @param idProvider idProvider
     * @param internalPort internalPort
     * @param ipAccessMode ipAccessMode
     * @param jsseEnabledProtocols jsseEnabledProtocols
     * @param keepAliveTimeout keepAliveTimeout
     * @param key key
     * @param listenerType listenerType
     * @param listening listening
     * @param maxQueue maxQueue
     * @param maxThread maxThread
     * @param minThread minThread
     * @param pkg pkg
     * @param port port
     * @param portAlias portAlias
     * @param portDescription portDescription
     * @param protocol protocol
     * @param provider provider
     * @param ssl ssl
     * @param status status
     * @param stepsize stepsize
     * @param suspended suspended
     * @param threadPool threadPool
     * @param threadPriority threadPriority
     * @param uniqueID uniqueID
     * @param usedThreadCount usedThreadCount
     */
    @ApiStatus.Internal
    public Port(String accessMode, String clientAuth, String configURL, String curDelay, String enabled, String factoryKey, String hasAccessList, String hasIPAccessList, String hostAccessMode, List<String> hostAllow, List<String> hostDeny, Object idProvider, Integer internalPort, String ipAccessMode, Object jsseEnabledProtocols, String keepAliveTimeout, String key, String listenerType, String listening, String maxQueue, String maxThread, String minThread, String pkg, Integer port, String portAlias, String portDescription, String protocol, String provider, String ssl, String status, String stepsize, String suspended, String threadPool, String threadPriority, String uniqueID, String usedThreadCount) {
        this.accessMode = accessMode;
        this.clientAuth = clientAuth;
        this.configURL = configURL;
        this.curDelay = curDelay;
        this.enabled = enabled;
        this.factoryKey = factoryKey;
        this.hasAccessList = hasAccessList;
        this.hasIPAccessList = hasIPAccessList;
        this.hostAccessMode = hostAccessMode;
        this.hostAllow = hostAllow;
        this.hostDeny = hostDeny;
        this.idProvider = idProvider;
        this.internalPort = internalPort;
        this.ipAccessMode = ipAccessMode;
        this.jsseEnabledProtocols = jsseEnabledProtocols;
        this.keepAliveTimeout = keepAliveTimeout;
        this.key = key;
        this.listenerType = listenerType;
        this.listening = listening;
        this.maxQueue = maxQueue;
        this.maxThread = maxThread;
        this.minThread = minThread;
        this.pkg = pkg;
        this.port = port;
        this.portAlias = portAlias;
        this.portDescription = portDescription;
        this.protocol = protocol;
        this.provider = provider;
        this.ssl = ssl;
        this.status = status;
        this.stepsize = stepsize;
        this.suspended = suspended;
        this.threadPool = threadPool;
        this.threadPriority = threadPriority;
        this.uniqueID = uniqueID;
        this.usedThreadCount = usedThreadCount;
    }

}

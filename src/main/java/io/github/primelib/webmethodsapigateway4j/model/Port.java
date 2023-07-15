package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Port
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Port}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Port(Consumer<Port> spec) {
        spec.accept(this);
    }

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


}

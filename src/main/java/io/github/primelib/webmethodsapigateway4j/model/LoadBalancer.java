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
 * LoadBalancer
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "httpUrls",
    "httpsUrls",
    "webAppUrl",
    "websocketUrls"
})
@JsonTypeName("LoadBalancer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LoadBalancer {

    /**
     * Constructs a validated implementation of {@link LoadBalancer}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LoadBalancer(Consumer<LoadBalancer> spec) {
        spec.accept(this);
    }

    /**
     * HTTP URLs to be exposed for API invocation.
     */
    @JsonProperty("httpUrls")
    protected List<String> httpUrls;

    /**
     * HTTPS URLs to be exposed for API invocation.
     */
    @JsonProperty("httpsUrls")
    protected List<String> httpsUrls;

    /**
     * API Gateway UI access url
     */
    @JsonProperty("webAppUrl")
    protected String webAppUrl;

    /**
     * WebSocket URL to be exposed for Websocket APIs invocation.
     */
    @JsonProperty("websocketUrls")
    protected List<String> websocketUrls;


}

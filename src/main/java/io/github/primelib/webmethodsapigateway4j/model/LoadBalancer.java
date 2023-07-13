package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * HTTP URLs to be exposed for API invocation.
     */
    @JsonProperty("httpUrls")
    private List<String> httpUrls;

    /**
     * HTTPS URLs to be exposed for API invocation.
     */
    @JsonProperty("httpsUrls")
    private List<String> httpsUrls;

    /**
     * API Gateway UI access url
     */
    @JsonProperty("webAppUrl")
    private String webAppUrl;

    /**
     * WebSocket URL to be exposed for Websocket APIs invocation.
     */
    @JsonProperty("websocketUrls")
    private List<String> websocketUrls;


}

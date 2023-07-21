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
 * LoadBalancer
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

    /**
     * Constructs a validated instance of {@link LoadBalancer}.
     *
     * @param spec the specification to process
     */
    public LoadBalancer(Consumer<LoadBalancer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LoadBalancer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LoadBalancer(Consumer)} instead.
     * @param httpUrls HTTP URLs to be exposed for API invocation.
     * @param httpsUrls HTTPS URLs to be exposed for API invocation.
     * @param webAppUrl API Gateway UI access url
     * @param websocketUrls WebSocket URL to be exposed for Websocket APIs invocation.
     */
    @ApiStatus.Internal
    public LoadBalancer(List<String> httpUrls, List<String> httpsUrls, String webAppUrl, List<String> websocketUrls) {
        this.httpUrls = httpUrls;
        this.httpsUrls = httpsUrls;
        this.webAppUrl = webAppUrl;
        this.websocketUrls = websocketUrls;
    }

}

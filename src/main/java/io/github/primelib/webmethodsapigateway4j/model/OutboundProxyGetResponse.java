package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OutboundProxyGetResponse
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
    "proxyServerList"
})
@JsonTypeName("OutboundProxyGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OutboundProxyGetResponse {

    /**
     * Contains a map of the available outbound proxy server aliases in API Gateway with the key denoting the alias name and the value representing the corresponding outbound proxy server alias configuration.
     */
    @JsonProperty("proxyServerList")
    protected Map<String, OutboundProxySettings> proxyServerList;

    /**
     * Constructs a validated instance of {@link OutboundProxyGetResponse}.
     *
     * @param spec the specification to process
     */
    public OutboundProxyGetResponse(Consumer<OutboundProxyGetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OutboundProxyGetResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OutboundProxyGetResponse(Consumer)} instead.
     * @param proxyServerList Contains a map of the available outbound proxy server aliases in API Gateway with the key denoting the alias name and the value representing the corresponding outbound proxy server alias configuration.
     */
    @ApiStatus.Internal
    public OutboundProxyGetResponse(Map<String, OutboundProxySettings> proxyServerList) {
        this.proxyServerList = proxyServerList;
    }

}

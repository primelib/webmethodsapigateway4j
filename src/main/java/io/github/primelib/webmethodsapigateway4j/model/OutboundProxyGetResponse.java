package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OutboundProxyGetResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "proxyServerList"
})
@JsonTypeName("OutboundProxyGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OutboundProxyGetResponse {

    /**
     * Constructs a validated implementation of {@link OutboundProxyGetResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OutboundProxyGetResponse(Consumer<OutboundProxyGetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Contains a map of the available outbound proxy server aliases in API Gateway with the key denoting the alias name and the value representing the corresponding outbound proxy server alias configuration.
     */
    @JsonProperty("proxyServerList")
    protected Map<String, OutboundProxySettings> proxyServerList = new HashMap<>();


}

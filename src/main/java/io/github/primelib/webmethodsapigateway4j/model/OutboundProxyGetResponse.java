package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private Map<String, OutboundProxySettings> proxyServerList = new HashMap<>();


}

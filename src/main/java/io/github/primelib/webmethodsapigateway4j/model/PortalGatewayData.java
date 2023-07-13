package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalGatewayData
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "gatewayEndpointsList",
    "microgatewayEndpointsList",
    "portalCommunities"
})
@JsonTypeName("PortalGatewayData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayData {

    @JsonProperty("gatewayEndpointsList")
    private Set<GatewayEndpoints> gatewayEndpointsList;

    @JsonProperty("microgatewayEndpointsList")
    private Set<GatewayEndpoints> microgatewayEndpointsList;

    /**
     * List of API Portal communities to which APIs should be published.
     */
    @JsonProperty("portalCommunities")
    private Set<PortalCommunities> portalCommunities;


}

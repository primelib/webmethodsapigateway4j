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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "gatewayEndpointsList",
    "microgatewayEndpointsList",
    "portalCommunities"
})
@JsonTypeName("PortalGatewayData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayData {

    /**
     * Constructs a validated implementation of {@link PortalGatewayData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PortalGatewayData(Consumer<PortalGatewayData> spec) {
        spec.accept(this);
    }

    @JsonProperty("gatewayEndpointsList")
    protected Set<GatewayEndpoints> gatewayEndpointsList;

    @JsonProperty("microgatewayEndpointsList")
    protected Set<GatewayEndpoints> microgatewayEndpointsList;

    /**
     * List of API Portal communities to which APIs should be published.
     */
    @JsonProperty("portalCommunities")
    protected Set<PortalCommunities> portalCommunities;


}

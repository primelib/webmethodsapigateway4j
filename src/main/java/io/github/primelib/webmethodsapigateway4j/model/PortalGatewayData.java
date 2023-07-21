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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalGatewayData
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
    "gatewayEndpointsList",
    "microgatewayEndpointsList",
    "portalCommunities"
})
@JsonTypeName("PortalGatewayData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayData {

    @JsonProperty("gatewayEndpointsList")
    protected Set<GatewayEndpoints> gatewayEndpointsList;

    @JsonProperty("microgatewayEndpointsList")
    protected Set<GatewayEndpoints> microgatewayEndpointsList;

    /**
     * List of API Portal communities to which APIs should be published.
     */
    @JsonProperty("portalCommunities")
    protected Set<PortalCommunities> portalCommunities;

    /**
     * Constructs a validated instance of {@link PortalGatewayData}.
     *
     * @param spec the specification to process
     */
    public PortalGatewayData(Consumer<PortalGatewayData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortalGatewayData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortalGatewayData(Consumer)} instead.
     * @param gatewayEndpointsList var.name
     * @param microgatewayEndpointsList var.name
     * @param portalCommunities List of API Portal communities to which APIs should be published.
     */
    @ApiStatus.Internal
    public PortalGatewayData(Set<GatewayEndpoints> gatewayEndpointsList, Set<GatewayEndpoints> microgatewayEndpointsList, Set<PortalCommunities> portalCommunities) {
        this.gatewayEndpointsList = gatewayEndpointsList;
        this.microgatewayEndpointsList = microgatewayEndpointsList;
        this.portalCommunities = portalCommunities;
    }

}

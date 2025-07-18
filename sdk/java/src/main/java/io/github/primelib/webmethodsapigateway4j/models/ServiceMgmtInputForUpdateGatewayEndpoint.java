// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtInputForUpdateGatewayEndpoint
 * <p>
 * To update an existing Gateway endpoint of this API
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtInputForUpdateGatewayEndpoint")
@JsonPropertyOrder({
    "gatewayEndpoint",
    "newEndpointName",
    "oldEndpointName"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtInputForUpdateGatewayEndpoint {

    /**
     * Gateway endpoint value to be updated
     */
    @JsonProperty("gatewayEndpoint")
    protected String gatewayEndpoint;

    /**
     * New name of the endpoint
     */
    @JsonProperty("newEndpointName")
    protected String newEndpointName;

    /**
     * Existing name of the endpoint
     */
    @JsonProperty("oldEndpointName")
    protected String oldEndpointName;

    /**
     * Constructs a validated instance of {@link ServiceMgmtInputForUpdateGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtInputForUpdateGatewayEndpoint(Consumer<ServiceMgmtInputForUpdateGatewayEndpoint> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtInputForUpdateGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtInputForUpdateGatewayEndpoint(Consumer)} instead.
     * @param gatewayEndpoint Gateway endpoint value to be updated
     * @param newEndpointName New name of the endpoint
     * @param oldEndpointName Existing name of the endpoint
     */
    @ApiStatus.Internal
    public ServiceMgmtInputForUpdateGatewayEndpoint(String gatewayEndpoint, String newEndpointName, String oldEndpointName) {
        this.gatewayEndpoint = gatewayEndpoint;
        this.newEndpointName = newEndpointName;
        this.oldEndpointName = oldEndpointName;
    }
}

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputForUpdateGatewayEndpoint
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
    "gatewayEndpoint",
    "newEndpointName",
    "oldEndpointName"
})
@JsonTypeName("InputForUpdateGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForUpdateGatewayEndpoint {

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
     * Constructs a validated instance of {@link InputForUpdateGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public InputForUpdateGatewayEndpoint(Consumer<InputForUpdateGatewayEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputForUpdateGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputForUpdateGatewayEndpoint(Consumer)} instead.
     * @param gatewayEndpoint Gateway endpoint value to be updated
     * @param newEndpointName New name of the endpoint
     * @param oldEndpointName Existing name of the endpoint
     */
    @ApiStatus.Internal
    public InputForUpdateGatewayEndpoint(String gatewayEndpoint, String newEndpointName, String oldEndpointName) {
        this.gatewayEndpoint = gatewayEndpoint;
        this.newEndpointName = newEndpointName;
        this.oldEndpointName = oldEndpointName;
    }

}

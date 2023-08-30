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
 * InputForAddGatewayEndpoint
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
    "endpointName",
    "gatewayEndpoint"
})
@JsonTypeName("InputForAddGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForAddGatewayEndpoint {

    /**
     * Name of the endpoint
     */
    @JsonProperty("endpointName")
    protected String endpointName;

    /**
     * Gateway endpoint value
     */
    @JsonProperty("gatewayEndpoint")
    protected String gatewayEndpoint;

    /**
     * Constructs a validated instance of {@link InputForAddGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public InputForAddGatewayEndpoint(Consumer<InputForAddGatewayEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputForAddGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputForAddGatewayEndpoint(Consumer)} instead.
     * @param endpointName Name of the endpoint
     * @param gatewayEndpoint Gateway endpoint value
     */
    @ApiStatus.Internal
    public InputForAddGatewayEndpoint(String endpointName, String gatewayEndpoint) {
        this.endpointName = endpointName;
        this.gatewayEndpoint = gatewayEndpoint;
    }

}

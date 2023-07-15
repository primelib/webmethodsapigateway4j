package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputForUpdateGatewayEndpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "gatewayEndpoint",
    "newEndpointName",
    "oldEndpointName"
})
@JsonTypeName("InputForUpdateGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForUpdateGatewayEndpoint {

    /**
     * Constructs a validated implementation of {@link InputForUpdateGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputForUpdateGatewayEndpoint(Consumer<InputForUpdateGatewayEndpoint> spec) {
        spec.accept(this);
    }

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


}

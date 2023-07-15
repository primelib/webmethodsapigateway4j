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
 * InputForAddGatewayEndpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpointName",
    "gatewayEndpoint"
})
@JsonTypeName("InputForAddGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForAddGatewayEndpoint {

    /**
     * Constructs a validated implementation of {@link InputForAddGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputForAddGatewayEndpoint(Consumer<InputForAddGatewayEndpoint> spec) {
        spec.accept(this);
    }

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


}

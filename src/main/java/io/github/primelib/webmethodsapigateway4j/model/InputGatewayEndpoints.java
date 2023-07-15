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
 * InputGatewayEndpoints
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "gatewayEndpoints"
})
@JsonTypeName("InputGatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputGatewayEndpoints {

    /**
     * Constructs a validated implementation of {@link InputGatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputGatewayEndpoints(Consumer<InputGatewayEndpoints> spec) {
        spec.accept(this);
    }

    @JsonProperty("gatewayEndpoints")
    protected InputForGatewayEndpoints gatewayEndpoints;


}

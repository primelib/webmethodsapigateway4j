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
 * InputGatewayEndpoints
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
    "gatewayEndpoints"
})
@JsonTypeName("InputGatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputGatewayEndpoints {

    @JsonProperty("gatewayEndpoints")
    protected InputForGatewayEndpoints gatewayEndpoints;

    /**
     * Constructs a validated instance of {@link InputGatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    public InputGatewayEndpoints(Consumer<InputGatewayEndpoints> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputGatewayEndpoints}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputGatewayEndpoints(Consumer)} instead.
     * @param gatewayEndpoints var.name
     */
    @ApiStatus.Internal
    public InputGatewayEndpoints(InputForGatewayEndpoints gatewayEndpoints) {
        this.gatewayEndpoints = gatewayEndpoints;
    }

}

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
 * InputForRemoveGatewayEndpoint
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
    "endpointName"
})
@JsonTypeName("InputForRemoveGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForRemoveGatewayEndpoint {

    /**
     * Name of the endpoint
     */
    @JsonProperty("endpointName")
    protected String endpointName;

    /**
     * Constructs a validated instance of {@link InputForRemoveGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public InputForRemoveGatewayEndpoint(Consumer<InputForRemoveGatewayEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputForRemoveGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputForRemoveGatewayEndpoint(Consumer)} instead.
     * @param endpointName Name of the endpoint
     */
    @ApiStatus.Internal
    public InputForRemoveGatewayEndpoint(String endpointName) {
        this.endpointName = endpointName;
    }

}

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
 * InputForRemoveGatewayEndpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpointName"
})
@JsonTypeName("InputForRemoveGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForRemoveGatewayEndpoint {

    /**
     * Constructs a validated implementation of {@link InputForRemoveGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputForRemoveGatewayEndpoint(Consumer<InputForRemoveGatewayEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Name of the endpoint
     */
    @JsonProperty("endpointName")
    protected String endpointName;


}

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
 * GatewayEndpoints
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "gatewayEndpoint",
    "status"
})
@JsonTypeName("GatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayEndpoints {

    /**
     * Constructs a validated implementation of {@link GatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewayEndpoints(Consumer<GatewayEndpoints> spec) {
        spec.accept(this);
    }

    /**
     * API's access endpoint exposed in API Gateway.
     */
    @JsonProperty("gatewayEndpoint")
    protected String gatewayEndpoint;

    /**
     * Status of the API endpoint.
     */
    @JsonProperty("status")
    protected StatusEnum status;


    /**
     * Status of the API endpoint.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        OBSELETE("OBSELETE");

        private final String value;
    }

}

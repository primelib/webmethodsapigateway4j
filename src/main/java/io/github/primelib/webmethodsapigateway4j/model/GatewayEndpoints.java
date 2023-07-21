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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayEndpoints
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
    "status"
})
@JsonTypeName("GatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayEndpoints {

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
     * Constructs a validated instance of {@link GatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    public GatewayEndpoints(Consumer<GatewayEndpoints> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewayEndpoints}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewayEndpoints(Consumer)} instead.
     * @param gatewayEndpoint API's access endpoint exposed in API Gateway.
     * @param status Status of the API endpoint.
     */
    @ApiStatus.Internal
    public GatewayEndpoints(String gatewayEndpoint, StatusEnum status) {
        this.gatewayEndpoint = gatewayEndpoint;
        this.status = status;
    }

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

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
 * Endpoints
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
@JsonTypeName("Endpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Endpoints {

    /**
     * API's access endpoint exposed in API Gateway.
     */
    @JsonProperty("gatewayEndpoint")
    protected String gatewayEndpoint;

    /**
     * Status of the API endpoint. Shows whether this endpoint is published to the service registry.Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the endpoint is not published to the service registry. PUBLISHED represents the endpoint is published to the service registry. SUSPENDED represents the endpoint is published to service registry, but is not currently active (for example: during deactivation of API or shutdown of API Gateway or disabling ports).
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Constructs a validated instance of {@link Endpoints}.
     *
     * @param spec the specification to process
     */
    public Endpoints(Consumer<Endpoints> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Endpoints}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Endpoints(Consumer)} instead.
     * @param gatewayEndpoint API's access endpoint exposed in API Gateway.
     * @param status Status of the API endpoint. Shows whether this endpoint is published to the service registry.Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the endpoint is not published to the service registry. PUBLISHED represents the endpoint is published to the service registry. SUSPENDED represents the endpoint is published to service registry, but is not currently active (for example: during deactivation of API or shutdown of API Gateway or disabling ports).
     */
    @ApiStatus.Internal
    public Endpoints(String gatewayEndpoint, StatusEnum status) {
        this.gatewayEndpoint = gatewayEndpoint;
        this.status = status;
    }

    /**
     * Status of the API endpoint. Shows whether this endpoint is published to the service registry.Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the endpoint is not published to the service registry. PUBLISHED represents the endpoint is published to the service registry. SUSPENDED represents the endpoint is published to service registry, but is not currently active (for example: during deactivation of API or shutdown of API Gateway or disabling ports).
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}

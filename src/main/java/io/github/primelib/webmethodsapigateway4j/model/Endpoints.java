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
 * Endpoints
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
@JsonTypeName("Endpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Endpoints {

    /**
     * Constructs a validated implementation of {@link Endpoints}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Endpoints(Consumer<Endpoints> spec) {
        spec.accept(this);
    }

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

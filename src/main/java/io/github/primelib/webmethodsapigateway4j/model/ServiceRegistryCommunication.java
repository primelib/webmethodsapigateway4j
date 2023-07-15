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
 * ServiceRegistryCommunication
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "httpMethod",
    "path"
})
@JsonTypeName("ServiceRegistryCommunication")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryCommunication {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryCommunication}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryCommunication(Consumer<ServiceRegistryCommunication> spec) {
        spec.accept(this);
    }

    /**
     * HttpMethod that is used while communicating with the service registry
     */
    @JsonProperty("httpMethod")
    protected HttpMethodEnum httpMethod;

    /**
     * Resource path that will be appened with base endpoint while communicating with service registry
     */
    @JsonProperty("path")
    protected String path;


    /**
     * HttpMethod that is used while communicating with the service registry
     */
    @AllArgsConstructor
    public enum HttpMethodEnum {
        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE"),
        HEAD("HEAD"),
        PATCH("PATCH"),
        OPTIONS("OPTIONS"),
        TRACE("TRACE"),
        CUSTOM("CUSTOM");

        private final String value;
    }

}

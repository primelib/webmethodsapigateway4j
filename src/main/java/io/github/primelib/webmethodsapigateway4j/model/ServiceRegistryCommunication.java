package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryCommunication
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "httpMethod",
    "path"
})
@JsonTypeName("ServiceRegistryCommunication")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryCommunication {

    /**
     * HttpMethod that is used while communicating with the service registry
     */
    @JsonProperty("httpMethod")
    private HttpMethodEnum httpMethod;

    /**
     * Resource path that will be appened with base endpoint while communicating with service registry
     */
    @JsonProperty("path")
    private String path;


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

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


public enum HttpMethodEnum {
        GET("GET"), // HttpMethod that is used while communicating with the service registry
        POST("POST"), // HttpMethod that is used while communicating with the service registry
        PUT("PUT"), // HttpMethod that is used while communicating with the service registry
        DELETE("DELETE"), // HttpMethod that is used while communicating with the service registry
        HEAD("HEAD"), // HttpMethod that is used while communicating with the service registry
        PATCH("PATCH"), // HttpMethod that is used while communicating with the service registry
        OPTIONS("OPTIONS"), // HttpMethod that is used while communicating with the service registry
        TRACE("TRACE"), // HttpMethod that is used while communicating with the service registry
        CUSTOM("CUSTOM"); // HttpMethod that is used while communicating with the service registry
    
    private final String text;

    /**
     * @param text
     */
    HttpMethodEnum(final String text) {
        this.text = text;
    }

}
}

package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayEndpoints
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String gatewayEndpoint;

    /**
     * Status of the API endpoint.
     */
    @JsonProperty("status")
    private StatusEnum status;


public enum StatusEnum {
        NEW("NEW"), // Status of the API endpoint.
        PUBLISHED("PUBLISHED"), // Status of the API endpoint.
        OBSELETE("OBSELETE"); // Status of the API endpoint.
    
    private final String text;

    /**
     * @param text
     */
    StatusEnum(final String text) {
        this.text = text;
    }

}
}

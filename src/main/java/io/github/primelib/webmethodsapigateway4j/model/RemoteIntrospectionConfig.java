package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoteIntrospectionConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "clientId",
    "clientSecret",
    "introspectionEndpoint",
    "user"
})
@JsonTypeName("RemoteIntrospectionConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIntrospectionConfig {

    /**
     * ClientId of a client in the authorization server
     */
    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("clientSecret")
    private GatewaySecret clientSecret;

    /**
     * Endpoint of the authorization server to do the introspection
     */
    @JsonProperty("introspectionEndpoint")
    private String introspectionEndpoint;

    /**
     * A user in the API Gateway under whom the introspection endpoint is invoked
     */
    @JsonProperty("user")
    private String user;


}

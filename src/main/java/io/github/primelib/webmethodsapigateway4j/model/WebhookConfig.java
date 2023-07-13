package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "headers",
    "password",
    "truststoreAlias",
    "url",
    "username"
})
@JsonTypeName("WebhookConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookConfig {

    /**
     * The HTTP headers to be sent in the request when the event is occurred
     */
    @JsonProperty("headers")
    private Map<String, String> headers = new HashMap<>();

    /**
     * The password required to authenticate if authentication is enabled for the webhook endpoint.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Specify the truststore that needs to be used by API Gateway while sending the request to the webhook endpoint.
     */
    @JsonProperty("truststoreAlias")
    private String truststoreAlias;

    /**
     * The URL to which API Gateway sends the payload when the event is occurred
     */
    @JsonProperty("url")
    private String url;

    /**
     * The user name required to authenticate against if authentication is enabled for the webhook endpoint.
     */
    @JsonProperty("username")
    private String username;


}

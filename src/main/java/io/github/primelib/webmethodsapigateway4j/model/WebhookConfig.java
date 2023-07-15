package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WebhookConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookConfig(Consumer<WebhookConfig> spec) {
        spec.accept(this);
    }

    /**
     * The HTTP headers to be sent in the request when the event is occurred
     */
    @JsonProperty("headers")
    protected Map<String, String> headers = new HashMap<>();

    /**
     * The password required to authenticate if authentication is enabled for the webhook endpoint.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Specify the truststore that needs to be used by API Gateway while sending the request to the webhook endpoint.
     */
    @JsonProperty("truststoreAlias")
    protected String truststoreAlias;

    /**
     * The URL to which API Gateway sends the payload when the event is occurred
     */
    @JsonProperty("url")
    protected String url;

    /**
     * The user name required to authenticate against if authentication is enabled for the webhook endpoint.
     */
    @JsonProperty("username")
    protected String username;


}

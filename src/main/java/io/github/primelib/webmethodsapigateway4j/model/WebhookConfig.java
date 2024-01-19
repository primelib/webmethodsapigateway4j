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
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookConfig
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
    protected Map<String, String> headers;

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

    /**
     * Constructs a validated instance of {@link WebhookConfig}.
     *
     * @param spec the specification to process
     */
    public WebhookConfig(Consumer<WebhookConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookConfig(Consumer)} instead.
     * @param headers The HTTP headers to be sent in the request when the event is occurred
     * @param password The password required to authenticate if authentication is enabled for the webhook endpoint.
     * @param truststoreAlias Specify the truststore that needs to be used by API Gateway while sending the request to the webhook endpoint.
     * @param url The URL to which API Gateway sends the payload when the event is occurred
     * @param username The user name required to authenticate against if authentication is enabled for the webhook endpoint.
     */
    @ApiStatus.Internal
    public WebhookConfig(Map<String, String> headers, String password, String truststoreAlias, String url, String username) {
        this.headers = headers;
        this.password = password;
        this.truststoreAlias = truststoreAlias;
        this.url = url;
        this.username = username;
    }

}

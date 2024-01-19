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
 * OAuth2Endpoint
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
    "endpoint",
    "headers",
    "https",
    "keyAlias",
    "keyStoreAlias"
})
@JsonTypeName("OAuth2Endpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Endpoint {

    /**
     * Client registration endpoint in the authorization server
     */
    @JsonProperty("endpoint")
    protected String endpoint;

    @JsonProperty("headers")
    protected Map<String, String> headers;

    @JsonProperty("https")
    protected Boolean https;

    /**
     * The key alias is the private key that is used sign the request sent to the authorization server
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * Constructs a validated instance of {@link OAuth2Endpoint}.
     *
     * @param spec the specification to process
     */
    public OAuth2Endpoint(Consumer<OAuth2Endpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OAuth2Endpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OAuth2Endpoint(Consumer)} instead.
     * @param endpoint Client registration endpoint in the authorization server
     * @param headers headers
     * @param https https
     * @param keyAlias The key alias is the private key that is used sign the request sent to the authorization server
     * @param keyStoreAlias Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     */
    @ApiStatus.Internal
    public OAuth2Endpoint(String endpoint, Map<String, String> headers, Boolean https, String keyAlias, String keyStoreAlias) {
        this.endpoint = endpoint;
        this.headers = headers;
        this.https = https;
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
    }

}

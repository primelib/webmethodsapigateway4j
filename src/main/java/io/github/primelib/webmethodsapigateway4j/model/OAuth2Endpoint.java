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
 * OAuth2Endpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link OAuth2Endpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuth2Endpoint(Consumer<OAuth2Endpoint> spec) {
        spec.accept(this);
    }

    /**
     * Client registration endpoint in the authorization server
     */
    @JsonProperty("endpoint")
    protected String endpoint;

    @JsonProperty("headers")
    protected Map<String, String> headers = new HashMap<>();

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


}

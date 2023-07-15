package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Token
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "clientId",
    "clientName",
    "clientSecret",
    "expirationInterval",
    "redirectUris",
    "refreshCount",
    "scopes",
    "type"
})
@JsonTypeName("OAuth2Token")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Token {

    /**
     * Constructs a validated implementation of {@link OAuth2Token}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuth2Token(Consumer<OAuth2Token> spec) {
        spec.accept(this);
    }

    /**
     * unique identifier of the oauth2 client
     */
    @JsonProperty("clientId")
    protected String clientId;

    /**
     * the name of the client
     */
    @JsonProperty("clientName")
    protected String clientName;

    /**
     * the client secret
     */
    @JsonProperty("clientSecret")
    protected String clientSecret;

    /**
     * the expiration interval
     */
    @JsonProperty("expirationInterval")
    protected String expirationInterval;

    /**
     * list of redirect uris
     */
    @JsonProperty("redirectUris")
    protected List<String> redirectUris;

    /**
     * number of times an access token can be refreshed
     */
    @JsonProperty("refreshCount")
    protected String refreshCount;

    /**
     * the scopes associated with the client
     */
    @JsonProperty("scopes")
    protected List<String> scopes;

    /**
     * type of the oauth2 client
     */
    @JsonProperty("type")
    protected String type;


}

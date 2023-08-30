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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Token
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

    /**
     * Constructs a validated instance of {@link OAuth2Token}.
     *
     * @param spec the specification to process
     */
    public OAuth2Token(Consumer<OAuth2Token> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OAuth2Token}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OAuth2Token(Consumer)} instead.
     * @param clientId unique identifier of the oauth2 client
     * @param clientName the name of the client
     * @param clientSecret the client secret
     * @param expirationInterval the expiration interval
     * @param redirectUris list of redirect uris
     * @param refreshCount number of times an access token can be refreshed
     * @param scopes the scopes associated with the client
     * @param type type of the oauth2 client
     */
    @ApiStatus.Internal
    public OAuth2Token(String clientId, String clientName, String clientSecret, String expirationInterval, List<String> redirectUris, String refreshCount, List<String> scopes, String type) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSecret = clientSecret;
        this.expirationInterval = expirationInterval;
        this.redirectUris = redirectUris;
        this.refreshCount = refreshCount;
        this.scopes = scopes;
        this.type = type;
    }

}

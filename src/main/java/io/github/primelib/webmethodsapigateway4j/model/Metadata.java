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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata
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
    "accessTokenURL",
    "authorizeURL",
    "refreshTokenURL"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    /**
     * URL to get the access token from the authorization server
     */
    @JsonProperty("accessTokenURL")
    protected String accessTokenURL;

    /**
     * URL to get the approval from the resource owner
     */
    @JsonProperty("authorizeURL")
    protected String authorizeURL;

    /**
     * URL to get the new access token from the refresh token
     */
    @JsonProperty("refreshTokenURL")
    protected String refreshTokenURL;

    /**
     * Constructs a validated instance of {@link Metadata}.
     *
     * @param spec the specification to process
     */
    public Metadata(Consumer<Metadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Metadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Metadata(Consumer)} instead.
     * @param accessTokenURL URL to get the access token from the authorization server
     * @param authorizeURL URL to get the approval from the resource owner
     * @param refreshTokenURL URL to get the new access token from the refresh token
     */
    @ApiStatus.Internal
    public Metadata(String accessTokenURL, String authorizeURL, String refreshTokenURL) {
        this.accessTokenURL = accessTokenURL;
        this.authorizeURL = authorizeURL;
        this.refreshTokenURL = refreshTokenURL;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessTokenURL",
    "authorizeURL",
    "refreshTokenURL"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    /**
     * Constructs a validated implementation of {@link Metadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Metadata(Consumer<Metadata> spec) {
        spec.accept(this);
    }

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


}

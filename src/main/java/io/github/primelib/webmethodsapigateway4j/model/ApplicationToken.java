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
 * ApplicationToken
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
    "apiAccessKey",
    "oauth2Token"
})
@JsonTypeName("ApplicationToken")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationToken {

    @JsonProperty("apiAccessKey")
    protected APIAccessKey apiAccessKey;

    @JsonProperty("oauth2Token")
    protected OAuth2Token oauth2Token;

    /**
     * Constructs a validated instance of {@link ApplicationToken}.
     *
     * @param spec the specification to process
     */
    public ApplicationToken(Consumer<ApplicationToken> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApplicationToken}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApplicationToken(Consumer)} instead.
     * @param apiAccessKey var.name
     * @param oauth2Token var.name
     */
    @ApiStatus.Internal
    public ApplicationToken(APIAccessKey apiAccessKey, OAuth2Token oauth2Token) {
        this.apiAccessKey = apiAccessKey;
        this.oauth2Token = oauth2Token;
    }

}

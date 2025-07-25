// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * MonetizationApplicationToken
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationApplicationToken")
@JsonPropertyOrder({
    "apiAccessKey",
    "oauth2Token"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationApplicationToken {

    @JsonProperty("apiAccessKey")
    protected MonetizationAPIAccessKey apiAccessKey;

    @JsonProperty("oauth2Token")
    protected MonetizationOauth2Token oauth2Token;

    /**
     * Constructs a validated instance of {@link MonetizationApplicationToken}.
     *
     * @param spec the specification to process
     */
    public MonetizationApplicationToken(Consumer<MonetizationApplicationToken> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationApplicationToken}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationApplicationToken(Consumer)} instead.
     * @param apiAccessKey apiAccessKey
     * @param oauth2Token oauth2Token
     */
    @ApiStatus.Internal
    public MonetizationApplicationToken(MonetizationAPIAccessKey apiAccessKey, MonetizationOauth2Token oauth2Token) {
        this.apiAccessKey = apiAccessKey;
        this.oauth2Token = oauth2Token;
    }
}

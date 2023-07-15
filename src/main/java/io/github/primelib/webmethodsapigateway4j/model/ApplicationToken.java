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
 * ApplicationToken
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiAccessKey",
    "oauth2Token"
})
@JsonTypeName("ApplicationToken")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationToken {

    /**
     * Constructs a validated implementation of {@link ApplicationToken}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApplicationToken(Consumer<ApplicationToken> spec) {
        spec.accept(this);
    }

    @JsonProperty("apiAccessKey")
    protected APIAccessKey apiAccessKey;

    @JsonProperty("oauth2Token")
    protected OAuth2Token oauth2Token;


}

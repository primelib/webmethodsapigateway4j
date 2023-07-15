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
 * JWTServiceOutput
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessToken",
    "expiresIn",
    "tokenType"
})
@JsonTypeName("JWTServiceOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTServiceOutput {

    /**
     * Constructs a validated implementation of {@link JWTServiceOutput}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JWTServiceOutput(Consumer<JWTServiceOutput> spec) {
        spec.accept(this);
    }

    @JsonProperty("accessToken")
    protected String accessToken;

    /**
     * token expiry
     */
    @JsonProperty("expiresIn")
    protected Long expiresIn;

    /**
     * type of this token
     */
    @JsonProperty("tokenType")
    protected String tokenType;


}

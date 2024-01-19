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
 * JWTServiceOutput
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
    "accessToken",
    "expiresIn",
    "tokenType"
})
@JsonTypeName("JWTServiceOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTServiceOutput {

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

    /**
     * Constructs a validated instance of {@link JWTServiceOutput}.
     *
     * @param spec the specification to process
     */
    public JWTServiceOutput(Consumer<JWTServiceOutput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JWTServiceOutput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JWTServiceOutput(Consumer)} instead.
     * @param accessToken accessToken
     * @param expiresIn token expiry
     * @param tokenType type of this token
     */
    @ApiStatus.Internal
    public JWTServiceOutput(String accessToken, Long expiresIn, String tokenType) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.tokenType = tokenType;
    }

}

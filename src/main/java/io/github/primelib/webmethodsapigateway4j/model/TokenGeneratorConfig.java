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
 * TokenGeneratorConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessTokenExpInterval",
    "algorithm",
    "audience",
    "authCodeExpInterval",
    "enforcePKCE",
    "expiry"
})
@JsonTypeName("TokenGeneratorConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TokenGeneratorConfig {

    /**
     * Constructs a validated implementation of {@link TokenGeneratorConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TokenGeneratorConfig(Consumer<TokenGeneratorConfig> spec) {
        spec.accept(this);
    }

    /**
     * Expiry interval in seconds for the generated access token 
     */
    @JsonProperty("accessTokenExpInterval")
    protected Integer accessTokenExpInterval;

    /**
     * Type of algorithm that needs to be used for signing the JWT
     */
    @JsonProperty("algorithm")
    protected AlgorithmEnum algorithm;

    /**
     * Default audience value that needs to be added in the generated JWT
     */
    @JsonProperty("audience")
    protected String audience;

    /**
     * Expiry interval in seconds for the generated authorization code in Authorization code grant type
     */
    @JsonProperty("authCodeExpInterval")
    protected Integer authCodeExpInterval;

    /**
     * Global option to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server
     */
    @JsonProperty("enforcePKCE")
    protected Boolean enforcePKCE;

    /**
     * Expiry interval of the JWT in minutes
     */
    @JsonProperty("expiry")
    protected Long expiry;


    /**
     * Type of algorithm that needs to be used for signing the JWT
     */
    @AllArgsConstructor
    public enum AlgorithmEnum {
        RS256("RS256"),
        RS384("RS384"),
        RS512("RS512");

        private final String value;
    }

}

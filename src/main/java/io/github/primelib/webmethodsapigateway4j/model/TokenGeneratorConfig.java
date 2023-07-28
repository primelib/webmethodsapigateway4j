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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TokenGeneratorConfig
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
     * Constructs a validated instance of {@link TokenGeneratorConfig}.
     *
     * @param spec the specification to process
     */
    public TokenGeneratorConfig(Consumer<TokenGeneratorConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TokenGeneratorConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TokenGeneratorConfig(Consumer)} instead.
     * @param accessTokenExpInterval Expiry interval in seconds for the generated access token 
     * @param algorithm Type of algorithm that needs to be used for signing the JWT
     * @param audience Default audience value that needs to be added in the generated JWT
     * @param authCodeExpInterval Expiry interval in seconds for the generated authorization code in Authorization code grant type
     * @param enforcePKCE Global option to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server
     * @param expiry Expiry interval of the JWT in minutes
     */
    @ApiStatus.Internal
    public TokenGeneratorConfig(Integer accessTokenExpInterval, AlgorithmEnum algorithm, String audience, Integer authCodeExpInterval, Boolean enforcePKCE, Long expiry) {
        this.accessTokenExpInterval = accessTokenExpInterval;
        this.algorithm = algorithm;
        this.audience = audience;
        this.authCodeExpInterval = authCodeExpInterval;
        this.enforcePKCE = enforcePKCE;
        this.expiry = expiry;
    }

    /**
     * Type of algorithm that needs to be used for signing the JWT
     */
    @AllArgsConstructor
    public enum AlgorithmEnum {
        RS256("RS256"),
        RS384("RS384"),
        RS512("RS512");

        private static final AlgorithmEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AlgorithmEnum of(String input) {
            if (input != null) {
                for (AlgorithmEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

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
 * AliasTokenGeneratorConfig
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AliasTokenGeneratorConfig")
@JsonPropertyOrder({
    "accessTokenExpInterval",
    "algorithm",
    "audience",
    "authCodeExpInterval",
    "enforcePkce",
    "expiry"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AliasTokenGeneratorConfig {

    /**
     * Expiry interval in seconds for the generated access token 
     */
    @JsonProperty("accessTokenExpInterval")
    protected Integer accessTokenExpInterval;

    /**
     * Type of algorithm that needs to be used for signing the JWT
     */
    @JsonProperty("algorithm")
    protected String algorithm;

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
    protected Boolean enforcePkce;

    /**
     * Expiry interval of the JWT in minutes
     */
    @JsonProperty("expiry")
    protected Long expiry;

    /**
     * Constructs a validated instance of {@link AliasTokenGeneratorConfig}.
     *
     * @param spec the specification to process
     */
    public AliasTokenGeneratorConfig(Consumer<AliasTokenGeneratorConfig> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AliasTokenGeneratorConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AliasTokenGeneratorConfig(Consumer)} instead.
     * @param accessTokenExpInterval Expiry interval in seconds for the generated access token 
     * @param algorithm Type of algorithm that needs to be used for signing the JWT
     * @param audience Default audience value that needs to be added in the generated JWT
     * @param authCodeExpInterval Expiry interval in seconds for the generated authorization code in Authorization code grant type
     * @param enforcePkce Global option to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server
     * @param expiry Expiry interval of the JWT in minutes
     */
    @ApiStatus.Internal
    public AliasTokenGeneratorConfig(Integer accessTokenExpInterval, String algorithm, String audience, Integer authCodeExpInterval, Boolean enforcePkce, Long expiry) {
        this.accessTokenExpInterval = accessTokenExpInterval;
        this.algorithm = algorithm;
        this.audience = audience;
        this.authCodeExpInterval = authCodeExpInterval;
        this.enforcePkce = enforcePkce;
        this.expiry = expiry;
    }
}

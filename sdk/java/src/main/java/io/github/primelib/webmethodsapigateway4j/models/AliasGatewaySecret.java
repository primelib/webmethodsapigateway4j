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
 * AliasGatewaySecret
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AliasGatewaySecret")
@JsonPropertyOrder({
    "cachedSecret",
    "secret",
    "xrayview"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AliasGatewaySecret {

    @JsonProperty("cachedSecret")
    protected String cachedSecret;

    @JsonProperty("secret")
    protected String secret;

    @JsonProperty("xrayview")
    protected String xrayview;

    /**
     * Constructs a validated instance of {@link AliasGatewaySecret}.
     *
     * @param spec the specification to process
     */
    public AliasGatewaySecret(Consumer<AliasGatewaySecret> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AliasGatewaySecret}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AliasGatewaySecret(Consumer)} instead.
     * @param cachedSecret cachedSecret
     * @param secret secret
     * @param xrayview xrayview
     */
    @ApiStatus.Internal
    public AliasGatewaySecret(String cachedSecret, String secret, String xrayview) {
        this.cachedSecret = cachedSecret;
        this.secret = secret;
        this.xrayview = xrayview;
    }
}

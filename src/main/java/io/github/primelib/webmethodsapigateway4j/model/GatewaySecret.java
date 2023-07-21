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
 * GatewaySecret
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
    "cachedSecret",
    "secret",
    "xrayview"
})
@JsonTypeName("GatewaySecret")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewaySecret {

    @JsonProperty("cachedSecret")
    protected String cachedSecret;

    @JsonProperty("secret")
    protected String secret;

    @JsonProperty("xrayview")
    protected String xrayview;

    /**
     * Constructs a validated instance of {@link GatewaySecret}.
     *
     * @param spec the specification to process
     */
    public GatewaySecret(Consumer<GatewaySecret> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewaySecret}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewaySecret(Consumer)} instead.
     * @param cachedSecret var.name
     * @param secret var.name
     * @param xrayview var.name
     */
    @ApiStatus.Internal
    public GatewaySecret(String cachedSecret, String secret, String xrayview) {
        this.cachedSecret = cachedSecret;
        this.secret = secret;
        this.xrayview = xrayview;
    }

}

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
 * GatewaySecret
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "cachedSecret",
    "secret",
    "xrayview"
})
@JsonTypeName("GatewaySecret")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewaySecret {

    /**
     * Constructs a validated implementation of {@link GatewaySecret}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewaySecret(Consumer<GatewaySecret> spec) {
        spec.accept(this);
    }

    @JsonProperty("cachedSecret")
    protected String cachedSecret;

    @JsonProperty("secret")
    protected String secret;

    @JsonProperty("xrayview")
    protected String xrayview;


}

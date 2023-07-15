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
 * KeystoreTruststore
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configId",
    "keystoreName",
    "outboundKeyAlias",
    "outboundKeystoreName",
    "outboundTruststoreName",
    "signingAlias",
    "truststoreName"
})
@JsonTypeName("KeystoreTruststore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KeystoreTruststore {

    /**
     * Constructs a validated implementation of {@link KeystoreTruststore}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public KeystoreTruststore(Consumer<KeystoreTruststore> spec) {
        spec.accept(this);
    }

    @JsonProperty("configId")
    protected String configId;

    @JsonProperty("keystoreName")
    protected String keystoreName;

    @JsonProperty("outboundKeyAlias")
    protected String outboundKeyAlias;

    @JsonProperty("outboundKeystoreName")
    protected String outboundKeystoreName;

    @JsonProperty("outboundTruststoreName")
    protected String outboundTruststoreName;

    @JsonProperty("signingAlias")
    protected String signingAlias;

    @JsonProperty("truststoreName")
    protected String truststoreName;


}

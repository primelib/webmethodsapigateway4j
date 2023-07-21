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
 * KeystoreTruststore
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

    /**
     * Constructs a validated instance of {@link KeystoreTruststore}.
     *
     * @param spec the specification to process
     */
    public KeystoreTruststore(Consumer<KeystoreTruststore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link KeystoreTruststore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #KeystoreTruststore(Consumer)} instead.
     * @param configId var.name
     * @param keystoreName var.name
     * @param outboundKeyAlias var.name
     * @param outboundKeystoreName var.name
     * @param outboundTruststoreName var.name
     * @param signingAlias var.name
     * @param truststoreName var.name
     */
    @ApiStatus.Internal
    public KeystoreTruststore(String configId, String keystoreName, String outboundKeyAlias, String outboundKeystoreName, String outboundTruststoreName, String signingAlias, String truststoreName) {
        this.configId = configId;
        this.keystoreName = keystoreName;
        this.outboundKeyAlias = outboundKeyAlias;
        this.outboundKeystoreName = outboundKeystoreName;
        this.outboundTruststoreName = outboundTruststoreName;
        this.signingAlias = signingAlias;
        this.truststoreName = truststoreName;
    }

}

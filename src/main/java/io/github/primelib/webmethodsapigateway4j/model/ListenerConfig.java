package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * ListenerConfig
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
    "insecureTrustManager",
    "keyAlias",
    "keyStoreAlias",
    "listener",
    "trustStoreAlias"
})
@JsonTypeName("ListenerConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListenerConfig {

    /**
     * Use insecure trust manager, to support self signed certificates
     */
    @JsonProperty("insecureTrustManager")
    protected Boolean insecureTrustManager;

    /**
     * Key alias to be used for the GRPC Channel
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * Key store alias to be used for the GRPC Channel
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    @JsonProperty("listener")
    protected RemotePortConfig listener;

    /**
     * Truststore alias to be used for the GRPC Channel
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;

    /**
     * Constructs a validated instance of {@link ListenerConfig}.
     *
     * @param spec the specification to process
     */
    public ListenerConfig(Consumer<ListenerConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListenerConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListenerConfig(Consumer)} instead.
     * @param insecureTrustManager Use insecure trust manager, to support self signed certificates
     * @param keyAlias Key alias to be used for the GRPC Channel
     * @param keyStoreAlias Key store alias to be used for the GRPC Channel
     * @param listener listener
     * @param trustStoreAlias Truststore alias to be used for the GRPC Channel
     */
    @ApiStatus.Internal
    public ListenerConfig(Boolean insecureTrustManager, String keyAlias, String keyStoreAlias, RemotePortConfig listener, String trustStoreAlias) {
        this.insecureTrustManager = insecureTrustManager;
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
        this.listener = listener;
        this.trustStoreAlias = trustStoreAlias;
    }

}

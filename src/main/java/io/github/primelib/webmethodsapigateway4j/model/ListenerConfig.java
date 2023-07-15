package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * ListenerConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ListenerConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListenerConfig(Consumer<ListenerConfig> spec) {
        spec.accept(this);
    }

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


}

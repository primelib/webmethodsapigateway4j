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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Endpoints
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
    "endpoints",
    "keyAlias",
    "keyStoreAlias"
})
@JsonTypeName("OAuth2Endpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Endpoints {

    @JsonProperty("endpoints")
    protected Map<String, OAuth2Endpoint> endpoints;

    @JsonProperty("keyAlias")
    protected String keyAlias;

    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * Constructs a validated instance of {@link OAuth2Endpoints}.
     *
     * @param spec the specification to process
     */
    public OAuth2Endpoints(Consumer<OAuth2Endpoints> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OAuth2Endpoints}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OAuth2Endpoints(Consumer)} instead.
     * @param endpoints var.name
     * @param keyAlias var.name
     * @param keyStoreAlias var.name
     */
    @ApiStatus.Internal
    public OAuth2Endpoints(Map<String, OAuth2Endpoint> endpoints, String keyAlias, String keyStoreAlias) {
        this.endpoints = endpoints;
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
    }

}

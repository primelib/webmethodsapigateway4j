package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Endpoints
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpoints",
    "keyAlias",
    "keyStoreAlias"
})
@JsonTypeName("OAuth2Endpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Endpoints {

    /**
     * Constructs a validated implementation of {@link OAuth2Endpoints}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuth2Endpoints(Consumer<OAuth2Endpoints> spec) {
        spec.accept(this);
    }

    @JsonProperty("endpoints")
    protected Map<String, OAuth2Endpoint> endpoints = new HashMap<>();

    @JsonProperty("keyAlias")
    protected String keyAlias;

    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;


}

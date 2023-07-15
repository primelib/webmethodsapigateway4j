package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayScope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiScopes",
    "audience",
    "id",
    "requiredAuthScopes",
    "scopeDescription",
    "scopeName"
})
@JsonTypeName("GatewayScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayScope {

    /**
     * Constructs a validated implementation of {@link GatewayScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewayScope(Consumer<GatewayScope> spec) {
        spec.accept(this);
    }

    /**
     * List of API IDs (or API Scope IDs) mapped the auth server scope
     */
    @JsonProperty("apiScopes")
    protected List<String> apiScopes;

    /**
     * This field is optional. This value will be used in scope level audience matching
     */
    @JsonProperty("audience")
    protected String audience;

    /**
     * A unique ID for the OAuth scope mapping
     */
    @JsonProperty("id")
    protected String id;

    /**
     * List of oauth scope entries from the authorization server definition
     */
    @JsonProperty("requiredAuthScopes")
    protected List<AuthServerScope> requiredAuthScopes;

    /**
     * Description for the OAuth scope mapping
     */
    @JsonProperty("scopeDescription")
    protected String scopeDescription;

    /**
     * Name of the OAuth scope mapping
     */
    @JsonProperty("scopeName")
    protected String scopeName;


}

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayScope
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

    /**
     * Constructs a validated instance of {@link GatewayScope}.
     *
     * @param spec the specification to process
     */
    public GatewayScope(Consumer<GatewayScope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewayScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewayScope(Consumer)} instead.
     * @param apiScopes List of API IDs (or API Scope IDs) mapped the auth server scope
     * @param audience This field is optional. This value will be used in scope level audience matching
     * @param id A unique ID for the OAuth scope mapping
     * @param requiredAuthScopes List of oauth scope entries from the authorization server definition
     * @param scopeDescription Description for the OAuth scope mapping
     * @param scopeName Name of the OAuth scope mapping
     */
    @ApiStatus.Internal
    public GatewayScope(List<String> apiScopes, String audience, String id, List<AuthServerScope> requiredAuthScopes, String scopeDescription, String scopeName) {
        this.apiScopes = apiScopes;
        this.audience = audience;
        this.id = id;
        this.requiredAuthScopes = requiredAuthScopes;
        this.scopeDescription = scopeDescription;
        this.scopeName = scopeName;
    }

}

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
 * OAuth2LocalRSIntrospectionStrategy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "audience",
    "authServerAlias",
    "clientId",
    "clientRegistration",
    "dcrConfig",
    "description",
    "id",
    "jwtAuthStrategy",
    "name",
    "primaryNode",
    "type"
})
@JsonTypeName("OAuth2LocalRSIntrospectionStrategy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2LocalRSIntrospectionStrategy {

    /**
     * Constructs a validated implementation of {@link OAuth2LocalRSIntrospectionStrategy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuth2LocalRSIntrospectionStrategy(Consumer<OAuth2LocalRSIntrospectionStrategy> spec) {
        spec.accept(this);
    }

    @JsonProperty("audience")
    protected String audience;

    /**
     * The name of the authorization server alias
     */
    @JsonProperty("authServerAlias")
    protected String authServerAlias;

    @JsonProperty("clientId")
    protected String clientId;

    @JsonProperty("clientRegistration")
    protected ClientRegistration clientRegistration;

    @JsonProperty("dcrConfig")
    protected DynamicClientRegistrationConfig dcrConfig;

    @JsonProperty("description")
    protected String description;

    /**
     * A unique ID for the strategy
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("jwtAuthStrategy")
    protected JWTAuthStrategy jwtAuthStrategy;

    /**
     * The name of the strategy
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("primaryNode")
    protected Node primaryNode;

    /**
     * The type of the strategy
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of the strategy
     */
    @AllArgsConstructor
    public enum TypeEnum {
        JWT_RSA("JWT_RSA"),
        JWT_HSA("JWT_HSA"),
        OPENID_CONNECT_RSA("OPENID_CONNECT_RSA"),
        OPENID_CONNECT_HSA("OPENID_CONNECT_HSA"),
        OAUTH2("OAUTH2"),
        OAUTH2_LOCAL_RSA("OAUTH2_LOCAL_RSA"),
        OAUTH2_LOCAL_HSA("OAUTH2_LOCAL_HSA"),
        COMPOSITE("COMPOSITE");

        private final String value;
    }

}

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OpenIDConnectRSAuthStrategy
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
@JsonTypeName("OpenIDConnectRSAuthStrategy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OpenIDConnectRSAuthStrategy {

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
     * Constructs a validated instance of {@link OpenIDConnectRSAuthStrategy}.
     *
     * @param spec the specification to process
     */
    public OpenIDConnectRSAuthStrategy(Consumer<OpenIDConnectRSAuthStrategy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OpenIDConnectRSAuthStrategy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OpenIDConnectRSAuthStrategy(Consumer)} instead.
     * @param audience var.name
     * @param authServerAlias The name of the authorization server alias
     * @param clientId var.name
     * @param clientRegistration var.name
     * @param dcrConfig var.name
     * @param description var.name
     * @param id A unique ID for the strategy
     * @param jwtAuthStrategy var.name
     * @param name The name of the strategy
     * @param primaryNode var.name
     * @param type The type of the strategy
     */
    @ApiStatus.Internal
    public OpenIDConnectRSAuthStrategy(String audience, String authServerAlias, String clientId, ClientRegistration clientRegistration, DynamicClientRegistrationConfig dcrConfig, String description, String id, JWTAuthStrategy jwtAuthStrategy, String name, Node primaryNode, TypeEnum type) {
        this.audience = audience;
        this.authServerAlias = authServerAlias;
        this.clientId = clientId;
        this.clientRegistration = clientRegistration;
        this.dcrConfig = dcrConfig;
        this.description = description;
        this.id = id;
        this.jwtAuthStrategy = jwtAuthStrategy;
        this.name = name;
        this.primaryNode = primaryNode;
        this.type = type;
    }

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

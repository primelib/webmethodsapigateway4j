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
 * JWTAuthStrategy
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
    "description",
    "id",
    "name",
    "primaryNode",
    "type"
})
@JsonTypeName("JWTAuthStrategy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTAuthStrategy {

    @JsonProperty("audience")
    protected String audience;

    /**
     * The name of the authorization server alias
     */
    @JsonProperty("authServerAlias")
    protected String authServerAlias;

    @JsonProperty("description")
    protected String description;

    /**
     * A unique ID for the strategy
     */
    @JsonProperty("id")
    protected String id;

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
     * Constructs a validated instance of {@link JWTAuthStrategy}.
     *
     * @param spec the specification to process
     */
    public JWTAuthStrategy(Consumer<JWTAuthStrategy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JWTAuthStrategy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JWTAuthStrategy(Consumer)} instead.
     * @param audience var.name
     * @param authServerAlias The name of the authorization server alias
     * @param description var.name
     * @param id A unique ID for the strategy
     * @param name The name of the strategy
     * @param primaryNode var.name
     * @param type The type of the strategy
     */
    @ApiStatus.Internal
    public JWTAuthStrategy(String audience, String authServerAlias, String description, String id, String name, Node primaryNode, TypeEnum type) {
        this.audience = audience;
        this.authServerAlias = authServerAlias;
        this.description = description;
        this.id = id;
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

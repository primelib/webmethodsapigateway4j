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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JWTHSAuthStrategy
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
    "secret",
    "type"
})
@JsonTypeName("JWTHSAuthStrategy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTHSAuthStrategy {

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

    @JsonProperty("secret")
    protected GatewaySecret secret;

    /**
     * The type of the strategy
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link JWTHSAuthStrategy}.
     *
     * @param spec the specification to process
     */
    public JWTHSAuthStrategy(Consumer<JWTHSAuthStrategy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JWTHSAuthStrategy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JWTHSAuthStrategy(Consumer)} instead.
     * @param audience audience
     * @param authServerAlias The name of the authorization server alias
     * @param description description
     * @param id A unique ID for the strategy
     * @param name The name of the strategy
     * @param primaryNode primaryNode
     * @param secret secret
     * @param type The type of the strategy
     */
    @ApiStatus.Internal
    public JWTHSAuthStrategy(String audience, String authServerAlias, String description, String id, String name, Node primaryNode, GatewaySecret secret, TypeEnum type) {
        this.audience = audience;
        this.authServerAlias = authServerAlias;
        this.description = description;
        this.id = id;
        this.name = name;
        this.primaryNode = primaryNode;
        this.secret = secret;
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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

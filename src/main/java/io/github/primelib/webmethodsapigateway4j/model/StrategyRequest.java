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
 * StrategyRequest
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
    "authServerAlias",
    "clientId",
    "clientRegistration",
    "dcrConfig",
    "description",
    "id",
    "name",
    "primaryNode",
    "type"
})
@JsonTypeName("StrategyRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StrategyRequest {

    /**
     * The name of the authorization server alias
     */
    @JsonProperty("authServerAlias")
    protected String authServerAlias;

    /**
     * The client ID for the strategy. This should be provided when the dynamic client registration is not used to generate the credentials for the strategy.
     */
    @JsonProperty("clientId")
    protected String clientId;

    @JsonProperty("clientRegistration")
    protected ClientRegistration clientRegistration;

    @JsonProperty("dcrConfig")
    protected DynamicClientRegistrationConfig dcrConfig;

    /**
     * The description of the strategy.
     */
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
     * Constructs a validated instance of {@link StrategyRequest}.
     *
     * @param spec the specification to process
     */
    public StrategyRequest(Consumer<StrategyRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StrategyRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StrategyRequest(Consumer)} instead.
     * @param authServerAlias The name of the authorization server alias
     * @param clientId The client ID for the strategy. This should be provided when the dynamic client registration is not used to generate the credentials for the strategy.
     * @param clientRegistration clientRegistration
     * @param dcrConfig dcrConfig
     * @param description The description of the strategy.
     * @param id A unique ID for the strategy
     * @param name The name of the strategy
     * @param primaryNode primaryNode
     * @param type The type of the strategy
     */
    @ApiStatus.Internal
    public StrategyRequest(String authServerAlias, String clientId, ClientRegistration clientRegistration, DynamicClientRegistrationConfig dcrConfig, String description, String id, String name, Node primaryNode, TypeEnum type) {
        this.authServerAlias = authServerAlias;
        this.clientId = clientId;
        this.clientRegistration = clientRegistration;
        this.dcrConfig = dcrConfig;
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

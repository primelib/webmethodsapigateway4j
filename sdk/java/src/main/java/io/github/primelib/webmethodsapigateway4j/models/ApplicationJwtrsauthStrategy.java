// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ApplicationJwtrsauthStrategy
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ApplicationJwtrsauthStrategy")
@JsonPropertyOrder({
    "audience",
    "authServerAlias",
    "description",
    "id",
    "name",
    "primaryNode",
    "type"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ApplicationJwtrsauthStrategy {

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
    protected ApplicationNode primaryNode;

    /**
     * Input file type
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ApplicationJwtrsauthStrategy}.
     *
     * @param spec the specification to process
     */
    public ApplicationJwtrsauthStrategy(Consumer<ApplicationJwtrsauthStrategy> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApplicationJwtrsauthStrategy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApplicationJwtrsauthStrategy(Consumer)} instead.
     * @param audience audience
     * @param authServerAlias The name of the authorization server alias
     * @param description description
     * @param id A unique ID for the strategy
     * @param name The name of the strategy
     * @param primaryNode primaryNode
     * @param type Input file type
     */
    @ApiStatus.Internal
    public ApplicationJwtrsauthStrategy(String audience, String authServerAlias, String description, String id, String name, ApplicationNode primaryNode, String type) {
        this.audience = audience;
        this.authServerAlias = authServerAlias;
        this.description = description;
        this.id = id;
        this.name = name;
        this.primaryNode = primaryNode;
        this.type = type;
    }
}

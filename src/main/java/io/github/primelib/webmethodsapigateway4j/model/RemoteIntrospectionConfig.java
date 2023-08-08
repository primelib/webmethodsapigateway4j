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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoteIntrospectionConfig
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
    "clientId",
    "clientSecret",
    "introspectionEndpoint",
    "user"
})
@JsonTypeName("RemoteIntrospectionConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIntrospectionConfig {

    /**
     * ClientId of a client in the authorization server
     */
    @JsonProperty("clientId")
    protected String clientId;

    @JsonProperty("clientSecret")
    protected GatewaySecret clientSecret;

    /**
     * Endpoint of the authorization server to do the introspection
     */
    @JsonProperty("introspectionEndpoint")
    protected String introspectionEndpoint;

    /**
     * A user in the API Gateway under whom the introspection endpoint is invoked
     */
    @JsonProperty("user")
    protected String user;

    /**
     * Constructs a validated instance of {@link RemoteIntrospectionConfig}.
     *
     * @param spec the specification to process
     */
    public RemoteIntrospectionConfig(Consumer<RemoteIntrospectionConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIntrospectionConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIntrospectionConfig(Consumer)} instead.
     * @param clientId ClientId of a client in the authorization server
     * @param clientSecret clientSecret
     * @param introspectionEndpoint Endpoint of the authorization server to do the introspection
     * @param user A user in the API Gateway under whom the introspection endpoint is invoked
     */
    @ApiStatus.Internal
    public RemoteIntrospectionConfig(String clientId, GatewaySecret clientSecret, String introspectionEndpoint, String user) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.introspectionEndpoint = introspectionEndpoint;
        this.user = user;
    }

}

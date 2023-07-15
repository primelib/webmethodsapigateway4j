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
 * RemoteIntrospectionConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link RemoteIntrospectionConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteIntrospectionConfig(Consumer<RemoteIntrospectionConfig> spec) {
        spec.accept(this);
    }

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


}

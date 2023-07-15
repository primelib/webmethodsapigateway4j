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
 * ServiceInput
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expiry",
    "gatewayScopes",
    "idToken"
})
@JsonTypeName("ServiceInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceInput {

    /**
     * Constructs a validated implementation of {@link ServiceInput}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceInput(Consumer<ServiceInput> spec) {
        spec.accept(this);
    }

    /**
     * preferred expiry of the access token
     */
    @JsonProperty("expiry")
    protected Long expiry;

    /**
     * array of gateway scopes
     */
    @JsonProperty("gatewayScopes")
    protected List<String> gatewayScopes;

    /**
     * id token
     */
    @JsonProperty("idToken")
    protected String idToken;


}

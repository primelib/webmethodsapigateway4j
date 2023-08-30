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
 * ServiceInput
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
    "expiry",
    "gatewayScopes",
    "idToken"
})
@JsonTypeName("ServiceInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceInput {

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

    /**
     * Constructs a validated instance of {@link ServiceInput}.
     *
     * @param spec the specification to process
     */
    public ServiceInput(Consumer<ServiceInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceInput(Consumer)} instead.
     * @param expiry preferred expiry of the access token
     * @param gatewayScopes array of gateway scopes
     * @param idToken id token
     */
    @ApiStatus.Internal
    public ServiceInput(Long expiry, List<String> gatewayScopes, String idToken) {
        this.expiry = expiry;
        this.gatewayScopes = gatewayScopes;
        this.idToken = idToken;
    }

}

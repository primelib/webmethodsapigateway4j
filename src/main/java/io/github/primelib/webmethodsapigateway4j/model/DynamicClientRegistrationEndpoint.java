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
 * DynamicClientRegistrationEndpoint
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
    "authInfo",
    "clientRegistrationEndpoint"
})
@JsonTypeName("DynamicClientRegistrationEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicClientRegistrationEndpoint {

    @JsonProperty("authInfo")
    protected Object authInfo;

    @JsonProperty("clientRegistrationEndpoint")
    protected OAuth2Endpoint clientRegistrationEndpoint;

    /**
     * Constructs a validated instance of {@link DynamicClientRegistrationEndpoint}.
     *
     * @param spec the specification to process
     */
    public DynamicClientRegistrationEndpoint(Consumer<DynamicClientRegistrationEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DynamicClientRegistrationEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DynamicClientRegistrationEndpoint(Consumer)} instead.
     * @param authInfo var.name
     * @param clientRegistrationEndpoint var.name
     */
    @ApiStatus.Internal
    public DynamicClientRegistrationEndpoint(Object authInfo, OAuth2Endpoint clientRegistrationEndpoint) {
        this.authInfo = authInfo;
        this.clientRegistrationEndpoint = clientRegistrationEndpoint;
    }

}

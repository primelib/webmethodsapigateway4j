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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuthFlows
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
    "authorizationCode",
    "clientCredentials",
    "implicit",
    "password",
    "vendorExtensions"
})
@JsonTypeName("OAuthFlows")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuthFlows {

    @JsonProperty("authorizationCode")
    protected OAuth2Definition authorizationCode;

    @JsonProperty("clientCredentials")
    protected OAuth2Definition clientCredentials;

    @JsonProperty("implicit")
    protected OAuth2Definition implicit;

    @JsonProperty("password")
    protected OAuth2Definition password;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link OAuthFlows}.
     *
     * @param spec the specification to process
     */
    public OAuthFlows(Consumer<OAuthFlows> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OAuthFlows}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OAuthFlows(Consumer)} instead.
     * @param authorizationCode authorizationCode
     * @param clientCredentials clientCredentials
     * @param implicit implicit
     * @param password password
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public OAuthFlows(OAuth2Definition authorizationCode, OAuth2Definition clientCredentials, OAuth2Definition implicit, OAuth2Definition password, Map<String, Object> vendorExtensions) {
        this.authorizationCode = authorizationCode;
        this.clientCredentials = clientCredentials;
        this.implicit = implicit;
        this.password = password;
        this.vendorExtensions = vendorExtensions;
    }

}

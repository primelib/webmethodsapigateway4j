package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuthFlows
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link OAuthFlows}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuthFlows(Consumer<OAuthFlows> spec) {
        spec.accept(this);
    }

    @JsonProperty("authorizationCode")
    protected OAuth2Definition authorizationCode;

    @JsonProperty("clientCredentials")
    protected OAuth2Definition clientCredentials;

    @JsonProperty("implicit")
    protected OAuth2Definition implicit;

    @JsonProperty("password")
    protected OAuth2Definition password;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

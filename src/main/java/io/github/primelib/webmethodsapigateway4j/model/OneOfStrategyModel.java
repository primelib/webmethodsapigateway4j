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
 * OneOfStrategyModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "JWT_HSA",
    "JWT_RSA",
    "OAUTH2",
    "OAUTH2_LOCAL_HSA",
    "OAUTH2_LOCAL_RSA",
    "OPENID_CONNECT_HSA",
    "OPENID_CONNECT_RSA"
})
@JsonTypeName("OneOfStrategyModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OneOfStrategyModel {

    /**
     * Constructs a validated implementation of {@link OneOfStrategyModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OneOfStrategyModel(Consumer<OneOfStrategyModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("JWT_HSA")
    protected JWTHSAuthStrategy JWT_HSA;

    @JsonProperty("JWT_RSA")
    protected JWTRSAuthStrategy JWT_RSA;

    @JsonProperty("OAUTH2")
    protected OAuth2RemoteIntrospectionAuthStrategy OAUTH2;

    @JsonProperty("OAUTH2_LOCAL_HSA")
    protected OpenIDConnectHSAuthStrategy OAUTH2_LOCAL_HSA;

    @JsonProperty("OAUTH2_LOCAL_RSA")
    protected OpenIDConnectRSAuthStrategy OAUTH2_LOCAL_RSA;

    @JsonProperty("OPENID_CONNECT_HSA")
    protected OAuth2LocalHSIntrospectionStrategy OPENID_CONNECT_HSA;

    @JsonProperty("OPENID_CONNECT_RSA")
    protected OAuth2LocalRSIntrospectionStrategy OPENID_CONNECT_RSA;


}

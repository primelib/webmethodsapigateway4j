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
 * OneOfStrategyModel
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

    /**
     * Constructs a validated instance of {@link OneOfStrategyModel}.
     *
     * @param spec the specification to process
     */
    public OneOfStrategyModel(Consumer<OneOfStrategyModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OneOfStrategyModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OneOfStrategyModel(Consumer)} instead.
     * @param JWT_HSA JWT_HSA
     * @param JWT_RSA JWT_RSA
     * @param OAUTH2 OAUTH2
     * @param OAUTH2_LOCAL_HSA OAUTH2_LOCAL_HSA
     * @param OAUTH2_LOCAL_RSA OAUTH2_LOCAL_RSA
     * @param OPENID_CONNECT_HSA OPENID_CONNECT_HSA
     * @param OPENID_CONNECT_RSA OPENID_CONNECT_RSA
     */
    @ApiStatus.Internal
    public OneOfStrategyModel(JWTHSAuthStrategy JWT_HSA, JWTRSAuthStrategy JWT_RSA, OAuth2RemoteIntrospectionAuthStrategy OAUTH2, OpenIDConnectHSAuthStrategy OAUTH2_LOCAL_HSA, OpenIDConnectRSAuthStrategy OAUTH2_LOCAL_RSA, OAuth2LocalHSIntrospectionStrategy OPENID_CONNECT_HSA, OAuth2LocalRSIntrospectionStrategy OPENID_CONNECT_RSA) {
        this.JWT_HSA = JWT_HSA;
        this.JWT_RSA = JWT_RSA;
        this.OAUTH2 = OAUTH2;
        this.OAUTH2_LOCAL_HSA = OAUTH2_LOCAL_HSA;
        this.OAUTH2_LOCAL_RSA = OAUTH2_LOCAL_RSA;
        this.OPENID_CONNECT_HSA = OPENID_CONNECT_HSA;
        this.OPENID_CONNECT_RSA = OPENID_CONNECT_RSA;
    }

}

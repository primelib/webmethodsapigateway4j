package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTPTransportSecurityAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "authMode",
    "authType",
    "httpAuthCredentials",
    "kerberosCredentials",
    "oauth2Token"
})
@JsonTypeName("HTTPTransportSecurityAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HTTPTransportSecurityAlias extends Alias {

    /**
     * Constructs a validated implementation of {@link HTTPTransportSecurityAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HTTPTransportSecurityAlias(Consumer<HTTPTransportSecurityAlias> spec) {
        spec.accept(this);
    }

    /**
     * Mode of authentication that needs to be used
     */
    @JsonProperty("authMode")
    protected AuthModeEnum authMode;

    /**
     * type of authentication you want to use while communicating with the native API
     */
    @JsonProperty("authType")
    protected AuthTypeEnum authType;

    @JsonProperty("httpAuthCredentials")
    protected Credentials httpAuthCredentials;

    @JsonProperty("kerberosCredentials")
    protected KerberosCredentials kerberosCredentials;

    /**
     * Specify a base64 encoded OAuth2 token that is used for authentication
     */
    @JsonProperty("oauth2Token")
    protected String oauth2Token;


    /**
     * Mode of authentication that needs to be used
     */
    @AllArgsConstructor
    public enum AuthModeEnum {
        NEW("NEW"),
        INCOMING_HTTP_BASIC_AUTH("INCOMING_HTTP_BASIC_AUTH"),
        INCOMING_WSS_USER("INCOMING_WSS_USER"),
        INCOMING_X509("INCOMING_X509"),
        DELEGATE_INCOMING("DELEGATE_INCOMING"),
        INCOMING_OAUTH_TOKEN("INCOMING_OAUTH_TOKEN"),
        INCOMING_JWT("INCOMING_JWT"),
        TRANSPARENT("TRANSPARENT"),
        INCOMING_KERBEROS("INCOMING_KERBEROS");

        private final String value;
    }

    /**
     * type of authentication you want to use while communicating with the native API
     */
    @AllArgsConstructor
    public enum AuthTypeEnum {
        HTTP_BASIC("HTTP_BASIC"),
        NTLM("NTLM"),
        OAUTH2("OAUTH2"),
        KERBEROS("KERBEROS"),
        JWT("JWT"),
        ALIAS("ALIAS"),
        REMOVE_INCOMING_HTTP_HEADERS("REMOVE_INCOMING_HTTP_HEADERS");

        private final String value;
    }

}

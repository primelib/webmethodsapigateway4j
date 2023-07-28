package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * HTTPTransportSecurityAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated instance of {@link HTTPTransportSecurityAlias}.
     *
     * @param spec the specification to process
     */
    public HTTPTransportSecurityAlias(Consumer<HTTPTransportSecurityAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HTTPTransportSecurityAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HTTPTransportSecurityAlias(Consumer)} instead.
     * @param authMode Mode of authentication that needs to be used
     * @param authType type of authentication you want to use while communicating with the native API
     * @param httpAuthCredentials var.name
     * @param kerberosCredentials var.name
     * @param oauth2Token Specify a base64 encoded OAuth2 token that is used for authentication
     */
    @ApiStatus.Internal
    public HTTPTransportSecurityAlias(AuthModeEnum authMode, AuthTypeEnum authType, Credentials httpAuthCredentials, KerberosCredentials kerberosCredentials, String oauth2Token) {
        this.authMode = authMode;
        this.authType = authType;
        this.httpAuthCredentials = httpAuthCredentials;
        this.kerberosCredentials = kerberosCredentials;
        this.oauth2Token = oauth2Token;
    }

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

        private static final AuthModeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AuthModeEnum of(String input) {
            if (input != null) {
                for (AuthModeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
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

        private static final AuthTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AuthTypeEnum of(String input) {
            if (input != null) {
                for (AuthTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

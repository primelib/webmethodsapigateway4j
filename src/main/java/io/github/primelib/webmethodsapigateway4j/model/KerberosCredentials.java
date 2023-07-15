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
 * KerberosCredentials
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "clientPassword",
    "clientPrincipal",
    "requestDelegateToken",
    "servicePrincipal",
    "servicePrincipalNameForm"
})
@JsonTypeName("KerberosCredentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KerberosCredentials {

    /**
     * Constructs a validated implementation of {@link KerberosCredentials}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public KerberosCredentials(Consumer<KerberosCredentials> spec) {
        spec.accept(this);
    }

    /**
     * Specify a base64 encoded password for the client principal
     */
    @JsonProperty("clientPassword")
    protected String clientPassword;

    /**
     * a unique identity to which Kerberos can assign tickets
     */
    @JsonProperty("clientPrincipal")
    protected String clientPrincipal;

    /**
     * Boolean value whether the token needs to be delegated or not
     */
    @JsonProperty("requestDelegateToken")
    protected Boolean requestDelegateToken;

    /**
     * a unique identifier of a service instance
     */
    @JsonProperty("servicePrincipal")
    protected String servicePrincipal;

    /**
     * the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @JsonProperty("servicePrincipalNameForm")
    protected ServicePrincipalNameFormEnum servicePrincipalNameForm;


    /**
     * the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @AllArgsConstructor
    public enum ServicePrincipalNameFormEnum {
        HOSTBASED("hostbased"),
        USERNAME("username");

        private final String value;
    }

}

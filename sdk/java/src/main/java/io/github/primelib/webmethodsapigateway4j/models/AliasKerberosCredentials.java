// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AliasKerberosCredentials
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AliasKerberosCredentials")
@JsonPropertyOrder({
    "clientPassword",
    "clientPrincipal",
    "requestDelegateToken",
    "servicePrincipal",
    "servicePrincipalNameForm"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AliasKerberosCredentials {

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
    protected String servicePrincipalNameForm;

    /**
     * Constructs a validated instance of {@link AliasKerberosCredentials}.
     *
     * @param spec the specification to process
     */
    public AliasKerberosCredentials(Consumer<AliasKerberosCredentials> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AliasKerberosCredentials}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AliasKerberosCredentials(Consumer)} instead.
     * @param clientPassword Specify a base64 encoded password for the client principal
     * @param clientPrincipal a unique identity to which Kerberos can assign tickets
     * @param requestDelegateToken Boolean value whether the token needs to be delegated or not
     * @param servicePrincipal a unique identifier of a service instance
     * @param servicePrincipalNameForm the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @ApiStatus.Internal
    public AliasKerberosCredentials(String clientPassword, String clientPrincipal, Boolean requestDelegateToken, String servicePrincipal, String servicePrincipalNameForm) {
        this.clientPassword = clientPassword;
        this.clientPrincipal = clientPrincipal;
        this.requestDelegateToken = requestDelegateToken;
        this.servicePrincipal = servicePrincipal;
        this.servicePrincipalNameForm = servicePrincipalNameForm;
    }
}

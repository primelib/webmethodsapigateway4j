package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KerberosCredentials
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * Specify a base64 encoded password for the client principal
     */
    @JsonProperty("clientPassword")
    private String clientPassword;

    /**
     * a unique identity to which Kerberos can assign tickets
     */
    @JsonProperty("clientPrincipal")
    private String clientPrincipal;

    /**
     * Boolean value whether the token needs to be delegated or not
     */
    @JsonProperty("requestDelegateToken")
    private Boolean requestDelegateToken;

    /**
     * a unique identifier of a service instance
     */
    @JsonProperty("servicePrincipal")
    private String servicePrincipal;

    /**
     * the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @JsonProperty("servicePrincipalNameForm")
    private ServicePrincipalNameFormEnum servicePrincipalNameForm;


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

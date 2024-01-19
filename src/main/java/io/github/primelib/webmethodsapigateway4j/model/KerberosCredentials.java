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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * KerberosCredentials
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
     * Constructs a validated instance of {@link KerberosCredentials}.
     *
     * @param spec the specification to process
     */
    public KerberosCredentials(Consumer<KerberosCredentials> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link KerberosCredentials}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #KerberosCredentials(Consumer)} instead.
     * @param clientPassword Specify a base64 encoded password for the client principal
     * @param clientPrincipal a unique identity to which Kerberos can assign tickets
     * @param requestDelegateToken Boolean value whether the token needs to be delegated or not
     * @param servicePrincipal a unique identifier of a service instance
     * @param servicePrincipalNameForm the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @ApiStatus.Internal
    public KerberosCredentials(String clientPassword, String clientPrincipal, Boolean requestDelegateToken, String servicePrincipal, ServicePrincipalNameFormEnum servicePrincipalNameForm) {
        this.clientPassword = clientPassword;
        this.clientPrincipal = clientPrincipal;
        this.requestDelegateToken = requestDelegateToken;
        this.servicePrincipal = servicePrincipal;
        this.servicePrincipalNameForm = servicePrincipalNameForm;
    }

    /**
     * the format in which you want to specify the principal name of the service that is registered with the principal database
     */
    @AllArgsConstructor
    public enum ServicePrincipalNameFormEnum {
        HOSTBASED("hostbased"),
        USERNAME("username");

        private static final ServicePrincipalNameFormEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ServicePrincipalNameFormEnum of(String input) {
            if (input != null) {
                for (ServicePrincipalNameFormEnum v : VALUES) {
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

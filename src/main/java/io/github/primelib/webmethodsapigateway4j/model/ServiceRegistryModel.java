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

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistryModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "ConnectionTimeout",
    "customHeaders",
    "deRegistrationInfo",
    "discoveryInfo",
    "endpointURI",
    "heartBeatInterval",
    "keyAlias",
    "keystoreAlias",
    "password",
    "readTimeout",
    "registrationInfo",
    "serviceRegistryType",
    "trustStoreAlias",
    "username"
})
@JsonTypeName("ServiceRegistryModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryModel extends Alias {

    /**
     * Constructs a validated implementation of {@link ServiceRegistryModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryModel(Consumer<ServiceRegistryModel> spec) {
        spec.accept(this);
    }

    /**
     * The time interval (in seconds) after which a connection attempt times out while communicating with service registry
     */
    @JsonProperty("ConnectionTimeout")
    protected Integer connectionTimeout;

    /**
     * Custom headers that needs be sent while communicating with the service registry
     */
    @JsonProperty("customHeaders")
    protected Map<String, String> customHeaders = new HashMap<>();

    @JsonProperty("deRegistrationInfo")
    protected ServiceRegistryCommunication deRegistrationInfo;

    @JsonProperty("discoveryInfo")
    protected ServiceRegistryCommunication discoveryInfo;

    /**
     * Endpoint that is used to communicate with the service registry
     */
    @JsonProperty("endpointURI")
    protected String endpointURI;

    /**
     * APIGateway will ping the service registry on the configured interval for every API
     */
    @JsonProperty("heartBeatInterval")
    protected Integer heartBeatInterval;

    /**
     * The key alias is the private key that is used for signing when using SSL communication with the Service Registry.
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * A keystore is a repository of private key. This keystore contains the private key used for the SSL communication with the Service Registry. For information on how to configure the keystore aliases, refer API Gateway Administration swagger
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    /**
     * Base64 encoded password that is used in the Basic authentication when communicating with the service registry
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The time interval (in seconds) after which a socket read attempt times out while communicating with service registry
     */
    @JsonProperty("readTimeout")
    protected Integer readTimeout;

    @JsonProperty("registrationInfo")
    protected ServiceRegistryCommunication registrationInfo;

    /**
     * It contains the information about the type of service registry
     */
    @JsonProperty("serviceRegistryType")
    protected ServiceRegistryTypeEnum serviceRegistryType;

    /**
     * A truststore is a repository of public keys. This truststore contains the public key of the Service Registry used for the SSL communication with the Service Registry. For information on how to configure the truststore aliases, refer API Gateway Administration swagger
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;

    /**
     * Username that is used in the Basic authentication when communicating with the service registry
     */
    @JsonProperty("username")
    protected String username;


    /**
     * It contains the information about the type of service registry
     */
    @AllArgsConstructor
    public enum ServiceRegistryTypeEnum {
        SERVICE_CONSUL("SERVICE_CONSUL"),
        EUREKA("EUREKA");

        private final String value;
    }

}

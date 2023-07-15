package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The time interval (in seconds) after which a connection attempt times out while communicating with service registry
     */
    @JsonProperty("ConnectionTimeout")
    private Integer connectionTimeout;

    /**
     * Custom headers that needs be sent while communicating with the service registry
     */
    @JsonProperty("customHeaders")
    private Map<String, String> customHeaders = new HashMap<>();

    @JsonProperty("deRegistrationInfo")
    private ServiceRegistryCommunication deRegistrationInfo;

    @JsonProperty("discoveryInfo")
    private ServiceRegistryCommunication discoveryInfo;

    /**
     * Endpoint that is used to communicate with the service registry
     */
    @JsonProperty("endpointURI")
    private String endpointURI;

    /**
     * APIGateway will ping the service registry on the configured interval for every API
     */
    @JsonProperty("heartBeatInterval")
    private Integer heartBeatInterval;

    /**
     * The key alias is the private key that is used for signing when using SSL communication with the Service Registry.
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * A keystore is a repository of private key. This keystore contains the private key used for the SSL communication with the Service Registry. For information on how to configure the keystore aliases, refer API Gateway Administration swagger
     */
    @JsonProperty("keystoreAlias")
    private String keystoreAlias;

    /**
     * Base64 encoded password that is used in the Basic authentication when communicating with the service registry
     */
    @JsonProperty("password")
    private String password;

    /**
     * The time interval (in seconds) after which a socket read attempt times out while communicating with service registry
     */
    @JsonProperty("readTimeout")
    private Integer readTimeout;

    @JsonProperty("registrationInfo")
    private ServiceRegistryCommunication registrationInfo;

    /**
     * It contains the information about the type of service registry
     */
    @JsonProperty("serviceRegistryType")
    private ServiceRegistryTypeEnum serviceRegistryType;

    /**
     * A truststore is a repository of public keys. This truststore contains the public key of the Service Registry used for the SSL communication with the Service Registry. For information on how to configure the truststore aliases, refer API Gateway Administration swagger
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;

    /**
     * Username that is used in the Basic authentication when communicating with the service registry
     */
    @JsonProperty("username")
    private String username;


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

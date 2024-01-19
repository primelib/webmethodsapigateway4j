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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServiceRegistryModel
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected Integer connectionTimeout;

    /**
     * Custom headers that needs be sent while communicating with the service registry
     */
    @JsonProperty("customHeaders")
    protected Map<String, String> customHeaders;

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
     * Constructs a validated instance of {@link ServiceRegistryModel}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryModel(Consumer<ServiceRegistryModel> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryModel(Consumer)} instead.
     * @param connectionTimeout The time interval (in seconds) after which a connection attempt times out while communicating with service registry
     * @param customHeaders Custom headers that needs be sent while communicating with the service registry
     * @param deRegistrationInfo deRegistrationInfo
     * @param discoveryInfo discoveryInfo
     * @param endpointURI Endpoint that is used to communicate with the service registry
     * @param heartBeatInterval APIGateway will ping the service registry on the configured interval for every API
     * @param keyAlias The key alias is the private key that is used for signing when using SSL communication with the Service Registry.
     * @param keystoreAlias A keystore is a repository of private key. This keystore contains the private key used for the SSL communication with the Service Registry. For information on how to configure the keystore aliases, refer API Gateway Administration swagger
     * @param password Base64 encoded password that is used in the Basic authentication when communicating with the service registry
     * @param readTimeout The time interval (in seconds) after which a socket read attempt times out while communicating with service registry
     * @param registrationInfo registrationInfo
     * @param serviceRegistryType It contains the information about the type of service registry
     * @param trustStoreAlias A truststore is a repository of public keys. This truststore contains the public key of the Service Registry used for the SSL communication with the Service Registry. For information on how to configure the truststore aliases, refer API Gateway Administration swagger
     * @param username Username that is used in the Basic authentication when communicating with the service registry
     */
    @ApiStatus.Internal
    public ServiceRegistryModel(Integer connectionTimeout, Map<String, String> customHeaders, ServiceRegistryCommunication deRegistrationInfo, ServiceRegistryCommunication discoveryInfo, String endpointURI, Integer heartBeatInterval, String keyAlias, String keystoreAlias, String password, Integer readTimeout, ServiceRegistryCommunication registrationInfo, ServiceRegistryTypeEnum serviceRegistryType, String trustStoreAlias, String username) {
        this.connectionTimeout = connectionTimeout;
        this.customHeaders = customHeaders;
        this.deRegistrationInfo = deRegistrationInfo;
        this.discoveryInfo = discoveryInfo;
        this.endpointURI = endpointURI;
        this.heartBeatInterval = heartBeatInterval;
        this.keyAlias = keyAlias;
        this.keystoreAlias = keystoreAlias;
        this.password = password;
        this.readTimeout = readTimeout;
        this.registrationInfo = registrationInfo;
        this.serviceRegistryType = serviceRegistryType;
        this.trustStoreAlias = trustStoreAlias;
        this.username = username;
    }

    /**
     * It contains the information about the type of service registry
     */
    @AllArgsConstructor
    public enum ServiceRegistryTypeEnum {
        SERVICE_CONSUL("SERVICE_CONSUL"),
        EUREKA("EUREKA");

        private static final ServiceRegistryTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ServiceRegistryTypeEnum of(String input) {
            if (input != null) {
                for (ServiceRegistryTypeEnum v : VALUES) {
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

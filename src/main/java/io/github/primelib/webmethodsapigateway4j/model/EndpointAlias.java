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

/**
 * EndpointAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "connectionTimeout",
    "endPointURI",
    "keyAlias",
    "keystoreAlias",
    "optimizationTechnique",
    "passSecurityHeaders",
    "readTimeout",
    "truststoreAlias"
})
@JsonTypeName("EndpointAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EndpointAlias extends Alias {

    /**
     * time interval (in seconds) after which a connection attempt times out
     */
    @JsonProperty("connectionTimeout")
    protected Integer connectionTimeout;

    /**
     * the default URI or components of the URI such as service name
     */
    @JsonProperty("endPointURI")
    protected String endPointURI;

    /**
     * Key alias in the particular keyStore
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * Keystore alias name that is used for the signing/encryption
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    /**
     * Type of optimization technique used for SOAP messages
     */
    @JsonProperty("optimizationTechnique")
    protected OptimizationTechniqueEnum optimizationTechnique;

    /**
     * Boolean value whether to pass security headers or not
     */
    @JsonProperty("passSecurityHeaders")
    protected Boolean passSecurityHeaders;

    /**
     * time interval (in seconds) after which a socket read attempt times out
     */
    @JsonProperty("readTimeout")
    protected Integer readTimeout;

    /**
     * Truststore alias name is used to validate the server certificate
     */
    @JsonProperty("truststoreAlias")
    protected String truststoreAlias;

    /**
     * Constructs a validated instance of {@link EndpointAlias}.
     *
     * @param spec the specification to process
     */
    public EndpointAlias(Consumer<EndpointAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EndpointAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EndpointAlias(Consumer)} instead.
     * @param connectionTimeout time interval (in seconds) after which a connection attempt times out
     * @param endPointURI the default URI or components of the URI such as service name
     * @param keyAlias Key alias in the particular keyStore
     * @param keystoreAlias Keystore alias name that is used for the signing/encryption
     * @param optimizationTechnique Type of optimization technique used for SOAP messages
     * @param passSecurityHeaders Boolean value whether to pass security headers or not
     * @param readTimeout time interval (in seconds) after which a socket read attempt times out
     * @param truststoreAlias Truststore alias name is used to validate the server certificate
     */
    @ApiStatus.Internal
    public EndpointAlias(Integer connectionTimeout, String endPointURI, String keyAlias, String keystoreAlias, OptimizationTechniqueEnum optimizationTechnique, Boolean passSecurityHeaders, Integer readTimeout, String truststoreAlias) {
        this.connectionTimeout = connectionTimeout;
        this.endPointURI = endPointURI;
        this.keyAlias = keyAlias;
        this.keystoreAlias = keystoreAlias;
        this.optimizationTechnique = optimizationTechnique;
        this.passSecurityHeaders = passSecurityHeaders;
        this.readTimeout = readTimeout;
        this.truststoreAlias = truststoreAlias;
    }

    /**
     * Type of optimization technique used for SOAP messages
     */
    @AllArgsConstructor
    public enum OptimizationTechniqueEnum {
        NONE("None"),
        MTOM("MTOM"),
        SWA("SwA");

        private final String value;
    }

}

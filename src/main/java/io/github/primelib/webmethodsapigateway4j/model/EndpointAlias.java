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
 * EndpointAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
     * Constructs a validated implementation of {@link EndpointAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EndpointAlias(Consumer<EndpointAlias> spec) {
        spec.accept(this);
    }

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

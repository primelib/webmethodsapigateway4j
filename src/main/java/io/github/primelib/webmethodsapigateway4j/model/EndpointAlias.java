package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EndpointAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * time interval (in seconds) after which a connection attempt times out
     */
    @JsonProperty("connectionTimeout")
    private Integer connectionTimeout;

    /**
     * the default URI or components of the URI such as service name
     */
    @JsonProperty("endPointURI")
    private String endPointURI;

    /**
     * Key alias in the particular keyStore
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * Keystore alias name that is used for the signing/encryption
     */
    @JsonProperty("keystoreAlias")
    private String keystoreAlias;

    /**
     * Type of optimization technique used for SOAP messages
     */
    @JsonProperty("optimizationTechnique")
    private OptimizationTechniqueEnum optimizationTechnique;

    /**
     * Boolean value whether to pass security headers or not
     */
    @JsonProperty("passSecurityHeaders")
    private Boolean passSecurityHeaders;

    /**
     * time interval (in seconds) after which a socket read attempt times out
     */
    @JsonProperty("readTimeout")
    private Integer readTimeout;

    /**
     * Truststore alias name is used to validate the server certificate
     */
    @JsonProperty("truststoreAlias")
    private String truststoreAlias;


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

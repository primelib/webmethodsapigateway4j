package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KeystoreTruststore
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "configId",
    "keystoreName",
    "outboundKeyAlias",
    "outboundKeystoreName",
    "outboundTruststoreName",
    "signingAlias",
    "truststoreName"
})
@JsonTypeName("KeystoreTruststore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KeystoreTruststore {

    @JsonProperty("configId")
    private String configId;

    @JsonProperty("keystoreName")
    private String keystoreName;

    @JsonProperty("outboundKeyAlias")
    private String outboundKeyAlias;

    @JsonProperty("outboundKeystoreName")
    private String outboundKeystoreName;

    @JsonProperty("outboundTruststoreName")
    private String outboundTruststoreName;

    @JsonProperty("signingAlias")
    private String signingAlias;

    @JsonProperty("truststoreName")
    private String truststoreName;


}

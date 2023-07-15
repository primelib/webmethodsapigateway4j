package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSLConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "keyAlias",
    "keyStoreAlias",
    "trustStoreAlias"
})
@JsonTypeName("SSLConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SSLConfig {

    /**
     * Constructs a validated implementation of {@link SSLConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SSLConfig(Consumer<SSLConfig> spec) {
        spec.accept(this);
    }

    /**
     * The key alias is the private key that is used sign the request sent to the authorization server
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * The truststore to be used by API Gateway when validating the incoming response from the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;


}

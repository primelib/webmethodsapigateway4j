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
 * SignAndEncryptConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "certificateAlias",
    "keyAlias",
    "keyStoreAlias",
    "truststoreAlias"
})
@JsonTypeName("SignAndEncryptConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SignAndEncryptConfig {

    /**
     * Constructs a validated implementation of {@link SignAndEncryptConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SignAndEncryptConfig(Consumer<SignAndEncryptConfig> spec) {
        spec.accept(this);
    }

    /**
     * Select the certificate from the truststore that is used to validate the request that is sent to the native API.
     */
    @JsonProperty("certificateAlias")
    protected String certificateAlias;

    /**
     * The key alias is the private key that is used sign the request sent to the native API
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * Specify the keystore that needs to be used by API Gateway while sending the request to the native API. A keystore is a repository of private key and its corresponding public certificate
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * The truststore to be used by API Gateway when sending the request to the native API. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("truststoreAlias")
    protected String truststoreAlias;


}

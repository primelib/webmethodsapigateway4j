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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSLConfig
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
    "keyAlias",
    "keyStoreAlias",
    "trustStoreAlias"
})
@JsonTypeName("SSLConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SSLConfig {

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

    /**
     * Constructs a validated instance of {@link SSLConfig}.
     *
     * @param spec the specification to process
     */
    public SSLConfig(Consumer<SSLConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SSLConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SSLConfig(Consumer)} instead.
     * @param keyAlias The key alias is the private key that is used sign the request sent to the authorization server
     * @param keyStoreAlias Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     * @param trustStoreAlias The truststore to be used by API Gateway when validating the incoming response from the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @ApiStatus.Internal
    public SSLConfig(String keyAlias, String keyStoreAlias, String trustStoreAlias) {
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
        this.trustStoreAlias = trustStoreAlias;
    }

}

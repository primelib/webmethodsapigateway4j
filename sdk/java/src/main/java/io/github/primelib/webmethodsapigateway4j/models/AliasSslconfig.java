// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AliasSslconfig
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AliasSslconfig")
@JsonPropertyOrder({
    "keyAlias",
    "keyStoreAlias",
    "trustStoreAlias"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AliasSslconfig {

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
     * Constructs a validated instance of {@link AliasSslconfig}.
     *
     * @param spec the specification to process
     */
    public AliasSslconfig(Consumer<AliasSslconfig> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AliasSslconfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AliasSslconfig(Consumer)} instead.
     * @param keyAlias The key alias is the private key that is used sign the request sent to the authorization server
     * @param keyStoreAlias Specify the keystore that needs to be used by API Gateway while sending the request to the authorization server. A keystore is a repository of private key and its corresponding public certificate
     * @param trustStoreAlias The truststore to be used by API Gateway when validating the incoming response from the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @ApiStatus.Internal
    public AliasSslconfig(String keyAlias, String keyStoreAlias, String trustStoreAlias) {
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
        this.trustStoreAlias = trustStoreAlias;
    }
}

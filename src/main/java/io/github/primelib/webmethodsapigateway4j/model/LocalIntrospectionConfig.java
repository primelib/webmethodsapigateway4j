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
 * LocalIntrospectionConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "certificateAlias",
    "description",
    "issuer",
    "jwksuri",
    "trustStoreAlias"
})
@JsonTypeName("LocalIntrospectionConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LocalIntrospectionConfig {

    /**
     * Constructs a validated implementation of {@link LocalIntrospectionConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LocalIntrospectionConfig(Consumer<LocalIntrospectionConfig> spec) {
        spec.accept(this);
    }

    /**
     * Select the certificate from the truststore that is used to validate the token.
     */
    @JsonProperty("certificateAlias")
    protected String certificateAlias;

    /**
     * Third party issuer description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Third party issuer name
     */
    @JsonProperty("issuer")
    protected String issuer;

    /**
     * JSON Web Key URI
     */
    @JsonProperty("jwksuri")
    protected String jwksuri;

    /**
     * The truststore to be used by API Gateway when validating the token issued by the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;


}

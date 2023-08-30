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
 * LocalIntrospectionConfig
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

    /**
     * Constructs a validated instance of {@link LocalIntrospectionConfig}.
     *
     * @param spec the specification to process
     */
    public LocalIntrospectionConfig(Consumer<LocalIntrospectionConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LocalIntrospectionConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LocalIntrospectionConfig(Consumer)} instead.
     * @param certificateAlias Select the certificate from the truststore that is used to validate the token.
     * @param description Third party issuer description
     * @param issuer Third party issuer name
     * @param jwksuri JSON Web Key URI
     * @param trustStoreAlias The truststore to be used by API Gateway when validating the token issued by the authorization server. Truststore is a repository that holds all the trusted public certificates
     */
    @ApiStatus.Internal
    public LocalIntrospectionConfig(String certificateAlias, String description, String issuer, String jwksuri, String trustStoreAlias) {
        this.certificateAlias = certificateAlias;
        this.description = description;
        this.issuer = issuer;
        this.jwksuri = jwksuri;
        this.trustStoreAlias = trustStoreAlias;
    }

}

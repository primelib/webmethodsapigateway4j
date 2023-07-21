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
 * Endpoint
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
    "alias",
    "connectionTimeoutDuration",
    "optimizationTechnique",
    "passSecurityHeaders",
    "uri"
})
@JsonTypeName("Endpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Endpoint {

    @JsonProperty("alias")
    protected Boolean alias;

    @JsonProperty("connectionTimeoutDuration")
    protected Integer connectionTimeoutDuration;

    @JsonProperty("optimizationTechnique")
    protected String optimizationTechnique;

    @JsonProperty("passSecurityHeaders")
    protected Boolean passSecurityHeaders;

    @JsonProperty("uri")
    protected String uri;

    /**
     * Constructs a validated instance of {@link Endpoint}.
     *
     * @param spec the specification to process
     */
    public Endpoint(Consumer<Endpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Endpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Endpoint(Consumer)} instead.
     * @param alias var.name
     * @param connectionTimeoutDuration var.name
     * @param optimizationTechnique var.name
     * @param passSecurityHeaders var.name
     * @param uri var.name
     */
    @ApiStatus.Internal
    public Endpoint(Boolean alias, Integer connectionTimeoutDuration, String optimizationTechnique, Boolean passSecurityHeaders, String uri) {
        this.alias = alias;
        this.connectionTimeoutDuration = connectionTimeoutDuration;
        this.optimizationTechnique = optimizationTechnique;
        this.passSecurityHeaders = passSecurityHeaders;
        this.uri = uri;
    }

}

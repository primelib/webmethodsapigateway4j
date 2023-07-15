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
 * Endpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Endpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Endpoint(Consumer<Endpoint> spec) {
        spec.accept(this);
    }

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


}

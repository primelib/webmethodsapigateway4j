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
 * HealthCheckEngineResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "elasticsearch",
    "is",
    "status",
    "terracotta"
})
@JsonTypeName("HealthCheckEngineResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckEngineResult {

    /**
     * Constructs a validated implementation of {@link HealthCheckEngineResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HealthCheckEngineResult(Consumer<HealthCheckEngineResult> spec) {
        spec.accept(this);
    }

    /**
     * Various values for the ElasticSearch check
     */
    @JsonProperty("elasticsearch")
    protected Object elasticsearch;

    /**
     * Various values for the Integration Server health check
     */
    @JsonProperty("is")
    protected Object is;

    /**
     * Either green, yellow or red
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Various values for the Terracotta cluster check
     */
    @JsonProperty("terracotta")
    protected Object terracotta;


}

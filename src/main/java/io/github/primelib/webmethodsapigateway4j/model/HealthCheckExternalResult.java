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
 * HealthCheckExternalResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "response_time_ms",
    "status",
    "type"
})
@JsonTypeName("HealthCheckExternalResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckExternalResult {

    /**
     * Constructs a validated implementation of {@link HealthCheckExternalResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HealthCheckExternalResult(Consumer<HealthCheckExternalResult> spec) {
        spec.accept(this);
    }

    /**
     * The name of the external resource / service
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Response check time in milli seconds
     */
    @JsonProperty("response_time_ms")
    protected Integer responseTimeMs;

    /**
     * Either green, yellow or red
     */
    @JsonProperty("status")
    protected String status;

    /**
     * The type of the external resource / service
     */
    @JsonProperty("type")
    protected String type;


}

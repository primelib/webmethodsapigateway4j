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
 * HealthCheckExternalResult
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
    "name",
    "response_time_ms",
    "status",
    "type"
})
@JsonTypeName("HealthCheckExternalResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckExternalResult {

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

    /**
     * Constructs a validated instance of {@link HealthCheckExternalResult}.
     *
     * @param spec the specification to process
     */
    public HealthCheckExternalResult(Consumer<HealthCheckExternalResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HealthCheckExternalResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HealthCheckExternalResult(Consumer)} instead.
     * @param name The name of the external resource / service
     * @param responseTimeMs Response check time in milli seconds
     * @param status Either green, yellow or red
     * @param type The type of the external resource / service
     */
    @ApiStatus.Internal
    public HealthCheckExternalResult(String name, Integer responseTimeMs, String status, String type) {
        this.name = name;
        this.responseTimeMs = responseTimeMs;
        this.status = status;
        this.type = type;
    }

}

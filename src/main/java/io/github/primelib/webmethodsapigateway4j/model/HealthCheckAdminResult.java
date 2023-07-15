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
 * HealthCheckAdminResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "kibana",
    "status",
    "ui"
})
@JsonTypeName("HealthCheckAdminResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckAdminResult {

    /**
     * Constructs a validated implementation of {@link HealthCheckAdminResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HealthCheckAdminResult(Consumer<HealthCheckAdminResult> spec) {
        spec.accept(this);
    }

    /**
     * Various values for the Kibana check
     */
    @JsonProperty("kibana")
    protected Object kibana;

    /**
     * Either green, yellow or red
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Various values for the UI health check
     */
    @JsonProperty("ui")
    protected Object ui;


}

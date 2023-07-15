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
 * HealthCheckAllResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "admin",
    "engine",
    "external"
})
@JsonTypeName("HealthCheckAllResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckAllResult {

    /**
     * Constructs a validated implementation of {@link HealthCheckAllResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HealthCheckAllResult(Consumer<HealthCheckAllResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("admin")
    protected HealthCheckAdminResult admin;

    @JsonProperty("engine")
    protected HealthCheckEngineResult engine;

    @JsonProperty("external")
    protected HealthCheckExternalResult external;


}

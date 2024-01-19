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
 * HealthCheckAllResult
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
    "admin",
    "engine",
    "external"
})
@JsonTypeName("HealthCheckAllResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckAllResult {

    @JsonProperty("admin")
    protected HealthCheckAdminResult admin;

    @JsonProperty("engine")
    protected HealthCheckEngineResult engine;

    @JsonProperty("external")
    protected HealthCheckExternalResult external;

    /**
     * Constructs a validated instance of {@link HealthCheckAllResult}.
     *
     * @param spec the specification to process
     */
    public HealthCheckAllResult(Consumer<HealthCheckAllResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HealthCheckAllResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HealthCheckAllResult(Consumer)} instead.
     * @param admin admin
     * @param engine engine
     * @param external external
     */
    @ApiStatus.Internal
    public HealthCheckAllResult(HealthCheckAdminResult admin, HealthCheckEngineResult engine, HealthCheckExternalResult external) {
        this.admin = admin;
        this.engine = engine;
        this.external = external;
    }

}

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
 * HealthCheckAdminResult
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
    "kibana",
    "status",
    "ui"
})
@JsonTypeName("HealthCheckAdminResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckAdminResult {

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

    /**
     * Constructs a validated instance of {@link HealthCheckAdminResult}.
     *
     * @param spec the specification to process
     */
    public HealthCheckAdminResult(Consumer<HealthCheckAdminResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HealthCheckAdminResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HealthCheckAdminResult(Consumer)} instead.
     * @param kibana Various values for the Kibana check
     * @param status Either green, yellow or red
     * @param ui Various values for the UI health check
     */
    @ApiStatus.Internal
    public HealthCheckAdminResult(Object kibana, String status, Object ui) {
        this.kibana = kibana;
        this.status = status;
        this.ui = ui;
    }

}

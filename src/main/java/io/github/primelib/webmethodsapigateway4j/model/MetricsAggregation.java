package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricsAggregation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "metricsType"
})
@JsonTypeName("MetricsAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetricsAggregation extends IAggregation {

    /**
     * Constructs a validated implementation of {@link MetricsAggregation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MetricsAggregation(Consumer<MetricsAggregation> spec) {
        spec.accept(this);
    }

    /**
     * Type of the metrics aggregation.
     */
    @JsonProperty("metricsType")
    protected MetricsTypeEnum metricsType;


    /**
     * Type of the metrics aggregation.
     */
    @AllArgsConstructor
    public enum MetricsTypeEnum {
        AVG("avg"),
        MIN("min"),
        MAX("max"),
        SUM("sum");

        private final String value;
    }

}

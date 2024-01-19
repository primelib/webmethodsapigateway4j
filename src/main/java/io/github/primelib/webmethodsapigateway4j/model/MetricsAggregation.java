package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MetricsAggregation
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "metricsType"
})
@JsonTypeName("MetricsAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetricsAggregation extends IAggregation {

    /**
     * Type of the metrics aggregation.
     */
    @JsonProperty("metricsType")
    protected MetricsTypeEnum metricsType;

    /**
     * Constructs a validated instance of {@link MetricsAggregation}.
     *
     * @param spec the specification to process
     */
    public MetricsAggregation(Consumer<MetricsAggregation> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MetricsAggregation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MetricsAggregation(Consumer)} instead.
     * @param metricsType Type of the metrics aggregation.
     */
    @ApiStatus.Internal
    public MetricsAggregation(MetricsTypeEnum metricsType) {
        this.metricsType = metricsType;
    }

    /**
     * Type of the metrics aggregation.
     */
    @AllArgsConstructor
    public enum MetricsTypeEnum {
        AVG("avg"),
        MIN("min"),
        MAX("max"),
        SUM("sum");

        private static final MetricsTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MetricsTypeEnum of(String input) {
            if (input != null) {
                for (MetricsTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

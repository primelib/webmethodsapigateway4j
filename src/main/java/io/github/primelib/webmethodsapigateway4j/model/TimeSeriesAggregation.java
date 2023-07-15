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
 * TimeSeriesAggregation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "interval",
    "intervalTypeAsString"
})
@JsonTypeName("TimeSeriesAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeSeriesAggregation extends IAggregation {

    /**
     * Constructs a validated implementation of {@link TimeSeriesAggregation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TimeSeriesAggregation(Consumer<TimeSeriesAggregation> spec) {
        spec.accept(this);
    }

    /**
     * Interval of the time series in aggregation.
     */
    @JsonProperty("interval")
    protected IntervalEnum interval;

    @JsonProperty("intervalTypeAsString")
    protected String intervalTypeAsString;


    /**
     * Interval of the time series in aggregation.
     */
    @AllArgsConstructor
    public enum IntervalEnum {
        SECOND("second"),
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        QUARTER("quarter"),
        YEAR("year");

        private final String value;
    }

}

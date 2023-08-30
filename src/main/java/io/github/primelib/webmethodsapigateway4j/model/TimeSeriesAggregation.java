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
 * TimeSeriesAggregation
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "interval",
    "intervalTypeAsString"
})
@JsonTypeName("TimeSeriesAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeSeriesAggregation extends IAggregation {

    /**
     * Interval of the time series in aggregation.
     */
    @JsonProperty("interval")
    protected IntervalEnum interval;

    @JsonProperty("intervalTypeAsString")
    protected String intervalTypeAsString;

    /**
     * Constructs a validated instance of {@link TimeSeriesAggregation}.
     *
     * @param spec the specification to process
     */
    public TimeSeriesAggregation(Consumer<TimeSeriesAggregation> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TimeSeriesAggregation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TimeSeriesAggregation(Consumer)} instead.
     * @param interval Interval of the time series in aggregation.
     * @param intervalTypeAsString intervalTypeAsString
     */
    @ApiStatus.Internal
    public TimeSeriesAggregation(IntervalEnum interval, String intervalTypeAsString) {
        this.interval = interval;
        this.intervalTypeAsString = intervalTypeAsString;
    }

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

        private static final IntervalEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static IntervalEnum of(String input) {
            if (input != null) {
                for (IntervalEnum v : VALUES) {
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

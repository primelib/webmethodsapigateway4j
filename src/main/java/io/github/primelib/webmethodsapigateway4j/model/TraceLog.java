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
 * TraceLog
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
    "endDate",
    "endTime",
    "originalSpanId",
    "parentId",
    "prevSpanId",
    "spanId",
    "startDate",
    "startTime",
    "trace"
})
@JsonTypeName("TraceLog")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TraceLog {

    /**
     * The epoch end timestamp of the span in milliseconds.
     */
    @JsonProperty("endDate")
    protected Long endDate;

    /**
     * The epoch end time of the span in nanoseconds.
     */
    @JsonProperty("endTime")
    protected Long endTime;

    /**
     * The spanId that is used to sequence the spans captured for tracing the event.
     */
    @JsonProperty("originalSpanId")
    protected String originalSpanId;

    /**
     * The span ID of this span's parent.
     */
    @JsonProperty("parentId")
    protected String parentId;

    /**
     * The span ID of this span's sibling to the left, sharing the same parent span ID.
     */
    @JsonProperty("prevSpanId")
    protected String prevSpanId;

    /**
     * The constructed span ID that is used to sequence the spans in order.
     */
    @JsonProperty("spanId")
    protected String spanId;

    /**
     * The epoch start timestamp of the span in milliseconds.
     */
    @JsonProperty("startDate")
    protected Long startDate;

    /**
     * The epoch start time of the span in nanoseconds.
     */
    @JsonProperty("startTime")
    protected Long startTime;

    @JsonProperty("trace")
    protected TraceInfo trace;

    /**
     * Constructs a validated instance of {@link TraceLog}.
     *
     * @param spec the specification to process
     */
    public TraceLog(Consumer<TraceLog> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TraceLog}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TraceLog(Consumer)} instead.
     * @param endDate The epoch end timestamp of the span in milliseconds.
     * @param endTime The epoch end time of the span in nanoseconds.
     * @param originalSpanId The spanId that is used to sequence the spans captured for tracing the event.
     * @param parentId The span ID of this span's parent.
     * @param prevSpanId The span ID of this span's sibling to the left, sharing the same parent span ID.
     * @param spanId The constructed span ID that is used to sequence the spans in order.
     * @param startDate The epoch start timestamp of the span in milliseconds.
     * @param startTime The epoch start time of the span in nanoseconds.
     * @param trace trace
     */
    @ApiStatus.Internal
    public TraceLog(Long endDate, Long endTime, String originalSpanId, String parentId, String prevSpanId, String spanId, Long startDate, Long startTime, TraceInfo trace) {
        this.endDate = endDate;
        this.endTime = endTime;
        this.originalSpanId = originalSpanId;
        this.parentId = parentId;
        this.prevSpanId = prevSpanId;
        this.spanId = spanId;
        this.startDate = startDate;
        this.startTime = startTime;
        this.trace = trace;
    }

}

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
 * TraceLog
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link TraceLog}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TraceLog(Consumer<TraceLog> spec) {
        spec.accept(this);
    }

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


}

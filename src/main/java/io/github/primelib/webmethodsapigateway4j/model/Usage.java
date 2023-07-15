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
 * Usage
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "applicationId",
    "applicationName",
    "endTime",
    "failureCount",
    "interval",
    "intervalUnit",
    "packageId",
    "packageName",
    "planId",
    "planName",
    "quota",
    "quotaAllowed",
    "remainingPeriod",
    "remainingPeriodInMillis",
    "restoredIntervalInSeconds",
    "startDayOfTheWeek",
    "startTime",
    "successCount",
    "usedQuota"
})
@JsonTypeName("Usage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Usage {

    /**
     * Constructs a validated implementation of {@link Usage}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Usage(Consumer<Usage> spec) {
        spec.accept(this);
    }

    /**
     * Application id of the subscription
     */
    @JsonProperty("applicationId")
    protected String applicationId;

    /**
     * Application name of the subscription
     */
    @JsonProperty("applicationName")
    protected String applicationName;

    /**
     * End time of the subscription in milli seconds for the current interval
     */
    @JsonProperty("endTime")
    protected Long endTime;

    /**
     * This will show the number of failure invokes for the current subscription in the current interval
     */
    @JsonProperty("failureCount")
    protected Integer failureCount;

    /**
     * Interval value of the subscription for current interval
     */
    @JsonProperty("interval")
    protected String interval;

    /**
     * Interval Unit of the subscription for the current interval
     */
    @JsonProperty("intervalUnit")
    protected String intervalUnit;

    /**
     * Package id of the subscription
     */
    @JsonProperty("packageId")
    protected String packageId;

    /**
     * Package name of the subscription
     */
    @JsonProperty("packageName")
    protected String packageName;

    /**
     * Plan id of the subscription
     */
    @JsonProperty("planId")
    protected String planId;

    /**
     * Plan name of the subscription
     */
    @JsonProperty("planName")
    protected String planName;

    /**
     * Quota (number of invokes) of the subscription as text for the current interval
     */
    @JsonProperty("quota")
    protected String quota;

    /**
     * Quota (number of invokes) allowed for the subscription for current interval
     */
    @JsonProperty("quotaAllowed")
    protected Long quotaAllowed;

    /**
     * Remaining period of the subscription as text for the current interval
     */
    @JsonProperty("remainingPeriod")
    protected String remainingPeriod;

    /**
     * Remaining period of the subscription in milli seconds for the current interval
     */
    @JsonProperty("remainingPeriodInMillis")
    protected Long remainingPeriodInMillis;

    /**
     * This value shows the elapses time of subscription in case of restart of the server. This end time and remaining time will be calculated based on start time, interval and restored interval.
     */
    @JsonProperty("restoredIntervalInSeconds")
    protected Integer restoredIntervalInSeconds;

    /**
     * Start of the week configured in API gateway
     */
    @JsonProperty("startDayOfTheWeek")
    protected String startDayOfTheWeek;

    /**
     * Start time of the subscription for current interval in milli seconds
     */
    @JsonProperty("startTime")
    protected Long startTime;

    /**
     * This will show the number of successful invokes for the current subscription in the current interval
     */
    @JsonProperty("successCount")
    protected Integer successCount;

    /**
     * Quota (number of invokes) used count for the subscription for current interval
     */
    @JsonProperty("usedQuota")
    protected Long usedQuota;


}

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
 * Usage
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

    /**
     * Constructs a validated instance of {@link Usage}.
     *
     * @param spec the specification to process
     */
    public Usage(Consumer<Usage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Usage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Usage(Consumer)} instead.
     * @param applicationId Application id of the subscription
     * @param applicationName Application name of the subscription
     * @param endTime End time of the subscription in milli seconds for the current interval
     * @param failureCount This will show the number of failure invokes for the current subscription in the current interval
     * @param interval Interval value of the subscription for current interval
     * @param intervalUnit Interval Unit of the subscription for the current interval
     * @param packageId Package id of the subscription
     * @param packageName Package name of the subscription
     * @param planId Plan id of the subscription
     * @param planName Plan name of the subscription
     * @param quota Quota (number of invokes) of the subscription as text for the current interval
     * @param quotaAllowed Quota (number of invokes) allowed for the subscription for current interval
     * @param remainingPeriod Remaining period of the subscription as text for the current interval
     * @param remainingPeriodInMillis Remaining period of the subscription in milli seconds for the current interval
     * @param restoredIntervalInSeconds This value shows the elapses time of subscription in case of restart of the server. This end time and remaining time will be calculated based on start time, interval and restored interval.
     * @param startDayOfTheWeek Start of the week configured in API gateway
     * @param startTime Start time of the subscription for current interval in milli seconds
     * @param successCount This will show the number of successful invokes for the current subscription in the current interval
     * @param usedQuota Quota (number of invokes) used count for the subscription for current interval
     */
    @ApiStatus.Internal
    public Usage(String applicationId, String applicationName, Long endTime, Integer failureCount, String interval, String intervalUnit, String packageId, String packageName, String planId, String planName, String quota, Long quotaAllowed, String remainingPeriod, Long remainingPeriodInMillis, Integer restoredIntervalInSeconds, String startDayOfTheWeek, Long startTime, Integer successCount, Long usedQuota) {
        this.applicationId = applicationId;
        this.applicationName = applicationName;
        this.endTime = endTime;
        this.failureCount = failureCount;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.packageId = packageId;
        this.packageName = packageName;
        this.planId = planId;
        this.planName = planName;
        this.quota = quota;
        this.quotaAllowed = quotaAllowed;
        this.remainingPeriod = remainingPeriod;
        this.remainingPeriodInMillis = remainingPeriodInMillis;
        this.restoredIntervalInSeconds = restoredIntervalInSeconds;
        this.startDayOfTheWeek = startDayOfTheWeek;
        this.startTime = startTime;
        this.successCount = successCount;
        this.usedQuota = usedQuota;
    }

}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DownloadAPITransactionSpec
 * <p>
 * Specification for the DownloadAPITransaction operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DownloadAPITransactionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter
     */
    @NotNull 
    private String startDate;

    /**
     * This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter
     */
    @NotNull 
    private String endDate;

    /**
     * This parameter is used to specify the event type to be downloaded. Specify eventType=ALL to download all the events. To download events of a specific type, specify the required event type Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan
     */
    @NotNull 
    private String eventType;

    /**
     * All the api transactions of the specified type that are older than the value specified are downloaded. Ex: duration='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days
     *  b) 1M
     * means 1 month
     *  c) 1y means 1 year. Either one of (startDate&amp;endDate) or duration is a mandatory parameter
     */
    @Nullable 
    private String duration;

    /**
     * Constructs a validated instance of {@link DownloadAPITransactionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DownloadAPITransactionOperationSpec(Consumer<DownloadAPITransactionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DownloadAPITransactionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startDate            This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter
     * @param endDate              This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter
     * @param eventType            This parameter is used to specify the event type to be downloaded. Specify eventType=ALL to download all the events. To download events of a specific type, specify the required event type Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan
     * @param duration             All the api transactions of the specified type that are older than the value specified are downloaded. Ex: duration='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year. Either one of (startDate&amp;endDate) or duration is a mandatory parameter
     */
    @ApiStatus.Internal
    public DownloadAPITransactionOperationSpec(String startDate, String endDate, String eventType, String duration) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventType = eventType;
        this.duration = duration;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(startDate, "startDate is a required parameter!");
        Objects.requireNonNull(endDate, "endDate is a required parameter!");
        Objects.requireNonNull(eventType, "eventType is a required parameter!");
    }
}

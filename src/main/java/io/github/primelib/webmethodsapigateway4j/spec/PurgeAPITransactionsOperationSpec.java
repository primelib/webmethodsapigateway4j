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
 * PurgeAPITransactionsSpec
 * <p>
 * Specification for the PurgeAPITransactions operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PurgeAPITransactionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is a date parameter. All the api transactions of the specified type, from the given date, are purged. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter
     */
    @NotNull 
    private String from;

    /**
     * This is a date parameter. All the api transactions of the specified type, until the given date, are purged. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter
     */
    @NotNull 
    private String until;

    /**
     * This parameter is used to specify the event type to be purged. Specify eventType=ALL to purge all the events. To purge a specific event type, specify the required event type. Ex: eventType=transactionalEvents. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan
     */
    @NotNull 
    private String eventType;

    /**
     * This is an optional query parameter. Sometimes it’s better to take backup before purging the data . If you specify the action value as "archiveAndPurge", API Gateway performs an archive before purging the data.
     */
    @Nullable 
    private String action;

    /**
     * All the api transactions of the specified type, that are older than the value specified, are purged. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days
     *  b) 1M
     * means 1 month
     *  c) 1y means 1 year
     */
    @Nullable 
    private String olderThan;

    /**
     * Constructs a validated instance of {@link PurgeAPITransactionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PurgeAPITransactionsOperationSpec(Consumer<PurgeAPITransactionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PurgeAPITransactionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param from                 This is a date parameter. All the api transactions of the specified type, from the given date, are purged. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter
     * @param until                This is a date parameter. All the api transactions of the specified type, until the given date, are purged. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter
     * @param eventType            This parameter is used to specify the event type to be purged. Specify eventType=ALL to purge all the events. To purge a specific event type, specify the required event type. Ex: eventType=transactionalEvents. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan
     * @param action               This is an optional query parameter. Sometimes it’s better to take backup before purging the data . If you specify the action value as "archiveAndPurge", API Gateway performs an archive before purging the data.
     * @param olderThan            All the api transactions of the specified type, that are older than the value specified, are purged. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year
     */
    @ApiStatus.Internal
    public PurgeAPITransactionsOperationSpec(String from, String until, String eventType, String action, String olderThan) {
        this.from = from;
        this.until = until;
        this.eventType = eventType;
        this.action = action;
        this.olderThan = olderThan;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(from, "from is a required parameter!");
        Objects.requireNonNull(until, "until is a required parameter!");
        Objects.requireNonNull(eventType, "eventType is a required parameter!");
    }
}

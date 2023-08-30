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
 * AuditLogDestination
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
    "destination",
    "enable",
    "guaranteed",
    "maximumQueueSize",
    "maximumRetries",
    "mode",
    "name",
    "waitBetweenRetries"
})
@JsonTypeName("AuditLogDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditLogDestination {

    /**
     * Specifies whether the logger is to write entries to a file or database.
     */
    @JsonProperty("destination")
    protected String destination;

    /**
     * Enable activation to enable the logger to start writing the log entries to the database or the file.
     */
    @JsonProperty("enable")
    protected String enable;

    /**
     * Provides data about guaranteed delivery transactions.
     */
    @JsonProperty("guaranteed")
    protected String guaranteed;

    /**
     * Specifies the maximum number of entries the queue can hold.
     */
    @JsonProperty("maximumQueueSize")
    protected String maximumQueueSize;

    /**
     * Specifies the maximum times the logger must retry writing the entry to the destination if the first attempt fails because of a transient error.
     */
    @JsonProperty("maximumRetries")
    protected String maximumRetries;

    /**
     * Specifies whether the logger is to write entries to the destination synchronously or asynchronously.
     */
    @JsonProperty("mode")
    protected String mode;

    /**
     * The default name of the audit log, API Gateway Transaction Logger.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Specifies the waiting time before the logger can reconnect and rewrite the eateries to the destination in case of failure.
     */
    @JsonProperty("waitBetweenRetries")
    protected String waitBetweenRetries;

    /**
     * Constructs a validated instance of {@link AuditLogDestination}.
     *
     * @param spec the specification to process
     */
    public AuditLogDestination(Consumer<AuditLogDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditLogDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditLogDestination(Consumer)} instead.
     * @param destination Specifies whether the logger is to write entries to a file or database.
     * @param enable Enable activation to enable the logger to start writing the log entries to the database or the file.
     * @param guaranteed Provides data about guaranteed delivery transactions.
     * @param maximumQueueSize Specifies the maximum number of entries the queue can hold.
     * @param maximumRetries Specifies the maximum times the logger must retry writing the entry to the destination if the first attempt fails because of a transient error.
     * @param mode Specifies whether the logger is to write entries to the destination synchronously or asynchronously.
     * @param name The default name of the audit log, API Gateway Transaction Logger.
     * @param waitBetweenRetries Specifies the waiting time before the logger can reconnect and rewrite the eateries to the destination in case of failure.
     */
    @ApiStatus.Internal
    public AuditLogDestination(String destination, String enable, String guaranteed, String maximumQueueSize, String maximumRetries, String mode, String name, String waitBetweenRetries) {
        this.destination = destination;
        this.enable = enable;
        this.guaranteed = guaranteed;
        this.maximumQueueSize = maximumQueueSize;
        this.maximumRetries = maximumRetries;
        this.mode = mode;
        this.name = name;
        this.waitBetweenRetries = waitBetweenRetries;
    }

}

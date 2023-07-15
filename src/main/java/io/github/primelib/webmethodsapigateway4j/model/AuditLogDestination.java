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
 * AuditLogDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AuditLogDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditLogDestination(Consumer<AuditLogDestination> spec) {
        spec.accept(this);
    }

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


}

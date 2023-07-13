package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditLogDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String destination;

    /**
     * Enable activation to enable the logger to start writing the log entries to the database or the file.
     */
    @JsonProperty("enable")
    private String enable;

    /**
     * Provides data about guaranteed delivery transactions.
     */
    @JsonProperty("guaranteed")
    private String guaranteed;

    /**
     * Specifies the maximum number of entries the queue can hold.
     */
    @JsonProperty("maximumQueueSize")
    private String maximumQueueSize;

    /**
     * Specifies the maximum times the logger must retry writing the entry to the destination if the first attempt fails because of a transient error.
     */
    @JsonProperty("maximumRetries")
    private String maximumRetries;

    /**
     * Specifies whether the logger is to write entries to the destination synchronously or asynchronously.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * The default name of the audit log, API Gateway Transaction Logger.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Specifies the waiting time before the logger can reconnect and rewrite the eateries to the destination in case of failure.
     */
    @JsonProperty("waitBetweenRetries")
    private String waitBetweenRetries;


}

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
 * JMSTrigger
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "aliasName",
    "connectionCount",
    "currentThreads",
    "destinationName",
    "destinationType",
    "durableSubscribeName",
    "enabled",
    "ignoreLocalPublished",
    "isConcurrent",
    "jmsMessageSelector",
    "jmsTriggerId",
    "maxExecutionThreads",
    "state",
    "triggerName"
})
@JsonTypeName("JMSTrigger")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JMSTrigger {

    /**
     * Constructs a validated implementation of {@link JMSTrigger}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JMSTrigger(Consumer<JMSTrigger> spec) {
        spec.accept(this);
    }

    /**
     * This property specifies JMS connection name used by the current JMS Trigger
     */
    @JsonProperty("aliasName")
    protected String aliasName;

    /**
     * This property is to specify the connectionCount
     */
    @JsonProperty("connectionCount")
    protected String connectionCount;

    /**
     * This property is to specify the currentThreads for the JMS Trigger
     */
    @JsonProperty("currentThreads")
    protected String currentThreads;

    /**
     * This property refers to input Message Queue name
     */
    @JsonProperty("destinationName")
    protected String destinationName;

    /**
     * This property specifies the destination type whether Queue or Topic
     */
    @JsonProperty("destinationType")
    protected String destinationType;

    /**
     * This property specifies the durableSubscribeName
     */
    @JsonProperty("durableSubscribeName")
    protected String durableSubscribeName;

    /**
     * This property is to enable/disable the JMS Trigger
     */
    @JsonProperty("enabled")
    protected String enabled;

    /**
     * This property specifies the status message of the JMS Trigger
     */
    @JsonProperty("ignoreLocalPublished")
    protected String ignoreLocalPublished;

    /**
     * This property is to opt for the concurrent or serial execution of the JMS Trigger
     */
    @JsonProperty("isConcurrent")
    protected String isConcurrent;

    /**
     * This property specifies the message selector for the Queue or Topic
     */
    @JsonProperty("jmsMessageSelector")
    protected String jmsMessageSelector;

    /**
     * A unique ID for the jmsTrigger
     */
    @JsonProperty("jmsTriggerId")
    protected String jmsTriggerId;

    /**
     * This property is to specify the maximum execution threads in case of concurrent execution
     */
    @JsonProperty("maxExecutionThreads")
    protected String maxExecutionThreads;

    /**
     * This property reveals the state (enabled/disable)of the JMS Trigger
     */
    @JsonProperty("state")
    protected String state;

    /**
     * The name of the JMS trigger
     */
    @JsonProperty("triggerName")
    protected String triggerName;


}

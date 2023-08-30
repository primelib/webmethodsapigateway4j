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
 * JMSTrigger
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

    /**
     * Constructs a validated instance of {@link JMSTrigger}.
     *
     * @param spec the specification to process
     */
    public JMSTrigger(Consumer<JMSTrigger> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JMSTrigger}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JMSTrigger(Consumer)} instead.
     * @param aliasName This property specifies JMS connection name used by the current JMS Trigger
     * @param connectionCount This property is to specify the connectionCount
     * @param currentThreads This property is to specify the currentThreads for the JMS Trigger
     * @param destinationName This property refers to input Message Queue name
     * @param destinationType This property specifies the destination type whether Queue or Topic
     * @param durableSubscribeName This property specifies the durableSubscribeName
     * @param enabled This property is to enable/disable the JMS Trigger
     * @param ignoreLocalPublished This property specifies the status message of the JMS Trigger
     * @param isConcurrent This property is to opt for the concurrent or serial execution of the JMS Trigger
     * @param jmsMessageSelector This property specifies the message selector for the Queue or Topic
     * @param jmsTriggerId A unique ID for the jmsTrigger
     * @param maxExecutionThreads This property is to specify the maximum execution threads in case of concurrent execution
     * @param state This property reveals the state (enabled/disable)of the JMS Trigger
     * @param triggerName The name of the JMS trigger
     */
    @ApiStatus.Internal
    public JMSTrigger(String aliasName, String connectionCount, String currentThreads, String destinationName, String destinationType, String durableSubscribeName, String enabled, String ignoreLocalPublished, String isConcurrent, String jmsMessageSelector, String jmsTriggerId, String maxExecutionThreads, String state, String triggerName) {
        this.aliasName = aliasName;
        this.connectionCount = connectionCount;
        this.currentThreads = currentThreads;
        this.destinationName = destinationName;
        this.destinationType = destinationType;
        this.durableSubscribeName = durableSubscribeName;
        this.enabled = enabled;
        this.ignoreLocalPublished = ignoreLocalPublished;
        this.isConcurrent = isConcurrent;
        this.jmsMessageSelector = jmsMessageSelector;
        this.jmsTriggerId = jmsTriggerId;
        this.maxExecutionThreads = maxExecutionThreads;
        this.state = state;
        this.triggerName = triggerName;
    }

}

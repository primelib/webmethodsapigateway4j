package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSTrigger
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String aliasName;

    /**
     * This property is to specify the connectionCount
     */
    @JsonProperty("connectionCount")
    private String connectionCount;

    /**
     * This property is to specify the currentThreads for the JMS Trigger
     */
    @JsonProperty("currentThreads")
    private String currentThreads;

    /**
     * This property refers to input Message Queue name
     */
    @JsonProperty("destinationName")
    private String destinationName;

    /**
     * This property specifies the destination type whether Queue or Topic
     */
    @JsonProperty("destinationType")
    private String destinationType;

    /**
     * This property specifies the durableSubscribeName
     */
    @JsonProperty("durableSubscribeName")
    private String durableSubscribeName;

    /**
     * This property is to enable/disable the JMS Trigger
     */
    @JsonProperty("enabled")
    private String enabled;

    /**
     * This property specifies the status message of the JMS Trigger
     */
    @JsonProperty("ignoreLocalPublished")
    private String ignoreLocalPublished;

    /**
     * This property is to opt for the concurrent or serial execution of the JMS Trigger
     */
    @JsonProperty("isConcurrent")
    private String isConcurrent;

    /**
     * This property specifies the message selector for the Queue or Topic
     */
    @JsonProperty("jmsMessageSelector")
    private String jmsMessageSelector;

    /**
     * A unique ID for the jmsTrigger
     */
    @JsonProperty("jmsTriggerId")
    private String jmsTriggerId;

    /**
     * This property is to specify the maximum execution threads in case of concurrent execution
     */
    @JsonProperty("maxExecutionThreads")
    private String maxExecutionThreads;

    /**
     * This property reveals the state (enabled/disable)of the JMS Trigger
     */
    @JsonProperty("state")
    private String state;

    /**
     * The name of the JMS trigger
     */
    @JsonProperty("triggerName")
    private String triggerName;


}

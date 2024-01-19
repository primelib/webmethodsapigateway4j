package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * JMSProviderAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "deliveryMode",
    "includeConnFactoryName",
    "includeJNDIParams",
    "jmsTriggerName",
    "priority",
    "replyToDestName",
    "replyToDestType",
    "timeToLive"
})
@JsonTypeName("JMSProviderAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JMSProviderAlias extends WebserviceEndpointAlias {

    /**
     * This property specifies the deliveryMode
     */
    @JsonProperty("deliveryMode")
    protected String deliveryMode;

    /**
     * This property enables/disables the includeConnFactoryName parameter
     */
    @JsonProperty("includeConnFactoryName")
    protected String includeConnFactoryName;

    /**
     * This property enables/disables the includeJNDIParams parameter
     */
    @JsonProperty("includeJNDIParams")
    protected String includeJNDIParams;

    /**
     * This property specifies the JMS Trigger name
     */
    @JsonProperty("jmsTriggerName")
    protected String jmsTriggerName;

    /**
     * This property specifies priority value
     */
    @JsonProperty("priority")
    protected Integer priority;

    /**
     * This property specifies the replyToDestName name
     */
    @JsonProperty("replyToDestName")
    protected String replyToDestName;

    /**
     * This property specifies the replyToDestType type
     */
    @JsonProperty("replyToDestType")
    protected String replyToDestType;

    /**
     * This property specifies the timeToLive value
     */
    @JsonProperty("timeToLive")
    protected Long timeToLive;

    /**
     * Constructs a validated instance of {@link JMSProviderAlias}.
     *
     * @param spec the specification to process
     */
    public JMSProviderAlias(Consumer<JMSProviderAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JMSProviderAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JMSProviderAlias(Consumer)} instead.
     * @param deliveryMode This property specifies the deliveryMode
     * @param includeConnFactoryName This property enables/disables the includeConnFactoryName parameter
     * @param includeJNDIParams This property enables/disables the includeJNDIParams parameter
     * @param jmsTriggerName This property specifies the JMS Trigger name
     * @param priority This property specifies priority value
     * @param replyToDestName This property specifies the replyToDestName name
     * @param replyToDestType This property specifies the replyToDestType type
     * @param timeToLive This property specifies the timeToLive value
     */
    @ApiStatus.Internal
    public JMSProviderAlias(String deliveryMode, String includeConnFactoryName, String includeJNDIParams, String jmsTriggerName, Integer priority, String replyToDestName, String replyToDestType, Long timeToLive) {
        this.deliveryMode = deliveryMode;
        this.includeConnFactoryName = includeConnFactoryName;
        this.includeJNDIParams = includeJNDIParams;
        this.jmsTriggerName = jmsTriggerName;
        this.priority = priority;
        this.replyToDestName = replyToDestName;
        this.replyToDestType = replyToDestType;
        this.timeToLive = timeToLive;
    }

}

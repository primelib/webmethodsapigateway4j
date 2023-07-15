package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSProviderAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
     * Constructs a validated implementation of {@link JMSProviderAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JMSProviderAlias(Consumer<JMSProviderAlias> spec) {
        spec.accept(this);
    }

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


}

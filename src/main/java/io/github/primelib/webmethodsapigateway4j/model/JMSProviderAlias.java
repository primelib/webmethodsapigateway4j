package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSProviderAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * This property specifies the deliveryMode
     */
    @JsonProperty("deliveryMode")
    private String deliveryMode;

    /**
     * This property enables/disables the includeConnFactoryName parameter
     */
    @JsonProperty("includeConnFactoryName")
    private String includeConnFactoryName;

    /**
     * This property enables/disables the includeJNDIParams parameter
     */
    @JsonProperty("includeJNDIParams")
    private String includeJNDIParams;

    /**
     * This property specifies the JMS Trigger name
     */
    @JsonProperty("jmsTriggerName")
    private String jmsTriggerName;

    /**
     * This property specifies priority value
     */
    @JsonProperty("priority")
    private Integer priority;

    /**
     * This property specifies the replyToDestName name
     */
    @JsonProperty("replyToDestName")
    private String replyToDestName;

    /**
     * This property specifies the replyToDestType type
     */
    @JsonProperty("replyToDestType")
    private String replyToDestType;

    /**
     * This property specifies the timeToLive value
     */
    @JsonProperty("timeToLive")
    private Long timeToLive;


}

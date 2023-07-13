package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.Objects;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSConnectionAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "aliasName",
    "allowNewConnectionPerTrigger",
    "allowReplyToConsumer",
    "associationType",
    "cacheProducersPoolMinSize",
    "cacheProducersPoolSize",
    "cacheProducersQueueList",
    "cacheProducersTopicList",
    "classLoader",
    "clientID",
    "csqDrainInOrder",
    "csqSize",
    "description",
    "enabled",
    "jmsConnectionAliasId",
    "jndi_automaticallyCreateUMAdminObjects",
    "jndi_connectionFactoryLookupName",
    "jndi_connectionFactoryPollingInterval",
    "jndi_connectionFactoryUpdateType",
    "jndi_enableFollowTheMaster",
    "jndi_jndiAliasName",
    "manageDestinations",
    "optTempQueueCreate",
    "password",
    "poolTimeout",
    "producerCachingMode",
    "producerMaxRetryAttempts",
    "producerRetryInterval",
    "producerSessionPoolMinSize",
    "producerSessionPoolSize",
    "transactionType",
    "um_loggingOutput",
    "um_producerIncludedStrings",
    "um_producerMessageTracking",
    "user"
})
@JsonTypeName("JMSConnectionAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JMSConnectionAlias {

    /**
     * The name of the JMSConnectionAlias configuration
     */
    @JsonProperty("aliasName")
    private String aliasName;

    /**
     * This property is to enable/disable the allowNewConnectionPerTrigger
     */
    @JsonProperty("allowNewConnectionPerTrigger")
    private String allowNewConnectionPerTrigger;

    /**
     * This property is to enable/disable the allowReplyToConsumer
     */
    @JsonProperty("allowReplyToConsumer")
    private String allowReplyToConsumer;

    /**
     * This property specifies whether the JMS connections has been created using JNDI or Native broker API. Value 0 refers to JNDI
     */
    @JsonProperty("associationType")
    private String associationType;

    /**
     * This property specifies the minimum size of producer cache pool
     */
    @JsonProperty("cacheProducersPoolMinSize")
    private String cacheProducersPoolMinSize;

    /**
     * This property specifies the max size of producer cache pool
     */
    @JsonProperty("cacheProducersPoolSize")
    private String cacheProducersPoolSize;

    /**
     * This property specifies the list of queues to cache
     */
    @JsonProperty("cacheProducersQueueList")
    private String cacheProducersQueueList;

    /**
     * This property specifies the list of topics to cache
     */
    @JsonProperty("cacheProducersTopicList")
    private String cacheProducersTopicList;

    /**
     * This property specifies the classloader value
     */
    @JsonProperty("classLoader")
    private String classLoader;

    /**
     * This property specifies the client id of the JMS connection
     */
    @JsonProperty("clientID")
    private String clientID;

    /**
     * This property is to enable/disable csqDrainInOrder
     */
    @JsonProperty("csqDrainInOrder")
    private String csqDrainInOrder;

    /**
     * This property specifies the csq size. Default value -1.
     */
    @JsonProperty("csqSize")
    private String csqSize;

    /**
     * The description of the JMSConnectionAlias configuration
     */
    @JsonProperty("description")
    private String description;

    /**
     * This property specifies the size of um_consumerIncludedStrings
     */
    @JsonProperty("enabled")
    private String enabled;

    /**
     * A unique ID for the jmsConnectionAlias
     */
    @JsonProperty("jmsConnectionAliasId")
    private String jmsConnectionAliasId;

    /**
     * This property specifies whether to create UM admin objects automatically
     */
    @JsonProperty("jndi_automaticallyCreateUMAdminObjects")
    private String jndiAutomaticallyCreateUMAdminObjects;

    /**
     * This property specifies the connection factory lookup name for the JMS connection
     */
    @JsonProperty("jndi_connectionFactoryLookupName")
    private String jndiConnectionFactoryLookupName;

    /**
     * This property specifies the connection factory polling interval
     */
    @JsonProperty("jndi_connectionFactoryPollingInterval")
    private String jndiConnectionFactoryPollingInterval;

    /**
     * This property specifies the connection factory update type
     */
    @JsonProperty("jndi_connectionFactoryUpdateType")
    private String jndiConnectionFactoryUpdateType;

    /**
     * This property is to enable the jndi_enableFollowTheMaster property
     */
    @JsonProperty("jndi_enableFollowTheMaster")
    private String jndiEnableFollowTheMaster;

    /**
     * Name of the JNDI that the JMS connection refers to
     */
    @JsonProperty("jndi_jndiAliasName")
    private String jndiJndiAliasName;

    /**
     * This property is to enable/disable the manageDestinations
     */
    @JsonProperty("manageDestinations")
    private String manageDestinations;

    /**
     * This property is to opt temporary queue creation
     */
    @JsonProperty("optTempQueueCreate")
    private String optTempQueueCreate;

    /**
     * This property specifies the password to create the JMS connection
     */
    @JsonProperty("password")
    private String password;

    /**
     * This property specifies the poolTimeout value
     */
    @JsonProperty("poolTimeout")
    private String poolTimeout;

    /**
     * This property is to enable/disable the producerCachingMode. 0 means disabled, 2 means Enable per destination
     */
    @JsonProperty("producerCachingMode")
    private String producerCachingMode;

    /**
     * This property specifies the max retry attempts value for the producer
     */
    @JsonProperty("producerMaxRetryAttempts")
    private String producerMaxRetryAttempts;

    /**
     * This property specifies the retry interval
     */
    @JsonProperty("producerRetryInterval")
    private String producerRetryInterval;

    /**
     * This property specifies the minimum size of producer session pool
     */
    @JsonProperty("producerSessionPoolMinSize")
    private String producerSessionPoolMinSize;

    /**
     * This property specifies the max size of producer session pool
     */
    @JsonProperty("producerSessionPoolSize")
    private String producerSessionPoolSize;

    /**
     * This property specifies the type of the transaction.Value 0 refers to NO-trans, 1 refers to Local-tran, 2 refers to XA-trans
     */
    @JsonProperty("transactionType")
    private String transactionType;

    /**
     * This property specifies the logging output value. 0 refers to server log, 1 refers to audit logging
     */
    @JsonProperty("um_loggingOutput")
    private String umLoggingOutput;

    /**
     * This property specifies the size of um_producerIncludedStrings
     */
    @JsonProperty("um_producerIncludedStrings")
    private String umProducerIncludedStrings;

    /**
     * This property is to enable/disable the um_producerMessageTracking
     */
    @JsonProperty("um_producerMessageTracking")
    private String umProducerMessageTracking;

    /**
     * This property specifies the user name to create the JMS connection
     */
    @JsonProperty("user")
    private String user;


}

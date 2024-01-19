package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import java.util.Objects;
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
 * JMSConnectionAlias
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
    protected String aliasName;

    /**
     * This property is to enable/disable the allowNewConnectionPerTrigger
     */
    @JsonProperty("allowNewConnectionPerTrigger")
    protected String allowNewConnectionPerTrigger;

    /**
     * This property is to enable/disable the allowReplyToConsumer
     */
    @JsonProperty("allowReplyToConsumer")
    protected String allowReplyToConsumer;

    /**
     * This property specifies whether the JMS connections has been created using JNDI or Native broker API. Value 0 refers to JNDI
     */
    @JsonProperty("associationType")
    protected String associationType;

    /**
     * This property specifies the minimum size of producer cache pool
     */
    @JsonProperty("cacheProducersPoolMinSize")
    protected String cacheProducersPoolMinSize;

    /**
     * This property specifies the max size of producer cache pool
     */
    @JsonProperty("cacheProducersPoolSize")
    protected String cacheProducersPoolSize;

    /**
     * This property specifies the list of queues to cache
     */
    @JsonProperty("cacheProducersQueueList")
    protected String cacheProducersQueueList;

    /**
     * This property specifies the list of topics to cache
     */
    @JsonProperty("cacheProducersTopicList")
    protected String cacheProducersTopicList;

    /**
     * This property specifies the classloader value
     */
    @JsonProperty("classLoader")
    protected String classLoader;

    /**
     * This property specifies the client id of the JMS connection
     */
    @JsonProperty("clientID")
    protected String clientID;

    /**
     * This property is to enable/disable csqDrainInOrder
     */
    @JsonProperty("csqDrainInOrder")
    protected String csqDrainInOrder;

    /**
     * This property specifies the csq size. Default value -1.
     */
    @JsonProperty("csqSize")
    protected String csqSize;

    /**
     * The description of the JMSConnectionAlias configuration
     */
    @JsonProperty("description")
    protected String description;

    /**
     * This property specifies the size of um_consumerIncludedStrings
     */
    @JsonProperty("enabled")
    protected String enabled;

    /**
     * A unique ID for the jmsConnectionAlias
     */
    @JsonProperty("jmsConnectionAliasId")
    protected String jmsConnectionAliasId;

    /**
     * This property specifies whether to create UM admin objects automatically
     */
    @JsonProperty("jndi_automaticallyCreateUMAdminObjects")
    protected String jndiAutomaticallyCreateUMAdminObjects;

    /**
     * This property specifies the connection factory lookup name for the JMS connection
     */
    @JsonProperty("jndi_connectionFactoryLookupName")
    protected String jndiConnectionFactoryLookupName;

    /**
     * This property specifies the connection factory polling interval
     */
    @JsonProperty("jndi_connectionFactoryPollingInterval")
    protected String jndiConnectionFactoryPollingInterval;

    /**
     * This property specifies the connection factory update type
     */
    @JsonProperty("jndi_connectionFactoryUpdateType")
    protected String jndiConnectionFactoryUpdateType;

    /**
     * This property is to enable the jndi_enableFollowTheMaster property
     */
    @JsonProperty("jndi_enableFollowTheMaster")
    protected String jndiEnableFollowTheMaster;

    /**
     * Name of the JNDI that the JMS connection refers to
     */
    @JsonProperty("jndi_jndiAliasName")
    protected String jndiJndiAliasName;

    /**
     * This property is to enable/disable the manageDestinations
     */
    @JsonProperty("manageDestinations")
    protected String manageDestinations;

    /**
     * This property is to opt temporary queue creation
     */
    @JsonProperty("optTempQueueCreate")
    protected String optTempQueueCreate;

    /**
     * This property specifies the password to create the JMS connection
     */
    @JsonProperty("password")
    protected String password;

    /**
     * This property specifies the poolTimeout value
     */
    @JsonProperty("poolTimeout")
    protected String poolTimeout;

    /**
     * This property is to enable/disable the producerCachingMode. 0 means disabled, 2 means Enable per destination
     */
    @JsonProperty("producerCachingMode")
    protected String producerCachingMode;

    /**
     * This property specifies the max retry attempts value for the producer
     */
    @JsonProperty("producerMaxRetryAttempts")
    protected String producerMaxRetryAttempts;

    /**
     * This property specifies the retry interval
     */
    @JsonProperty("producerRetryInterval")
    protected String producerRetryInterval;

    /**
     * This property specifies the minimum size of producer session pool
     */
    @JsonProperty("producerSessionPoolMinSize")
    protected String producerSessionPoolMinSize;

    /**
     * This property specifies the max size of producer session pool
     */
    @JsonProperty("producerSessionPoolSize")
    protected String producerSessionPoolSize;

    /**
     * This property specifies the type of the transaction.Value 0 refers to NO-trans, 1 refers to Local-tran, 2 refers to XA-trans
     */
    @JsonProperty("transactionType")
    protected String transactionType;

    /**
     * This property specifies the logging output value. 0 refers to server log, 1 refers to audit logging
     */
    @JsonProperty("um_loggingOutput")
    protected String umLoggingOutput;

    /**
     * This property specifies the size of um_producerIncludedStrings
     */
    @JsonProperty("um_producerIncludedStrings")
    protected String umProducerIncludedStrings;

    /**
     * This property is to enable/disable the um_producerMessageTracking
     */
    @JsonProperty("um_producerMessageTracking")
    protected String umProducerMessageTracking;

    /**
     * This property specifies the user name to create the JMS connection
     */
    @JsonProperty("user")
    protected String user;

    /**
     * Constructs a validated instance of {@link JMSConnectionAlias}.
     *
     * @param spec the specification to process
     */
    public JMSConnectionAlias(Consumer<JMSConnectionAlias> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JMSConnectionAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JMSConnectionAlias(Consumer)} instead.
     * @param aliasName The name of the JMSConnectionAlias configuration
     * @param allowNewConnectionPerTrigger This property is to enable/disable the allowNewConnectionPerTrigger
     * @param allowReplyToConsumer This property is to enable/disable the allowReplyToConsumer
     * @param associationType This property specifies whether the JMS connections has been created using JNDI or Native broker API. Value 0 refers to JNDI
     * @param cacheProducersPoolMinSize This property specifies the minimum size of producer cache pool
     * @param cacheProducersPoolSize This property specifies the max size of producer cache pool
     * @param cacheProducersQueueList This property specifies the list of queues to cache
     * @param cacheProducersTopicList This property specifies the list of topics to cache
     * @param classLoader This property specifies the classloader value
     * @param clientID This property specifies the client id of the JMS connection
     * @param csqDrainInOrder This property is to enable/disable csqDrainInOrder
     * @param csqSize This property specifies the csq size. Default value -1.
     * @param description The description of the JMSConnectionAlias configuration
     * @param enabled This property specifies the size of um_consumerIncludedStrings
     * @param jmsConnectionAliasId A unique ID for the jmsConnectionAlias
     * @param jndiAutomaticallyCreateUMAdminObjects This property specifies whether to create UM admin objects automatically
     * @param jndiConnectionFactoryLookupName This property specifies the connection factory lookup name for the JMS connection
     * @param jndiConnectionFactoryPollingInterval This property specifies the connection factory polling interval
     * @param jndiConnectionFactoryUpdateType This property specifies the connection factory update type
     * @param jndiEnableFollowTheMaster This property is to enable the jndi_enableFollowTheMaster property
     * @param jndiJndiAliasName Name of the JNDI that the JMS connection refers to
     * @param manageDestinations This property is to enable/disable the manageDestinations
     * @param optTempQueueCreate This property is to opt temporary queue creation
     * @param password This property specifies the password to create the JMS connection
     * @param poolTimeout This property specifies the poolTimeout value
     * @param producerCachingMode This property is to enable/disable the producerCachingMode. 0 means disabled, 2 means Enable per destination
     * @param producerMaxRetryAttempts This property specifies the max retry attempts value for the producer
     * @param producerRetryInterval This property specifies the retry interval
     * @param producerSessionPoolMinSize This property specifies the minimum size of producer session pool
     * @param producerSessionPoolSize This property specifies the max size of producer session pool
     * @param transactionType This property specifies the type of the transaction.Value 0 refers to NO-trans, 1 refers to Local-tran, 2 refers to XA-trans
     * @param umLoggingOutput This property specifies the logging output value. 0 refers to server log, 1 refers to audit logging
     * @param umProducerIncludedStrings This property specifies the size of um_producerIncludedStrings
     * @param umProducerMessageTracking This property is to enable/disable the um_producerMessageTracking
     * @param user This property specifies the user name to create the JMS connection
     */
    @ApiStatus.Internal
    public JMSConnectionAlias(String aliasName, String allowNewConnectionPerTrigger, String allowReplyToConsumer, String associationType, String cacheProducersPoolMinSize, String cacheProducersPoolSize, String cacheProducersQueueList, String cacheProducersTopicList, String classLoader, String clientID, String csqDrainInOrder, String csqSize, String description, String enabled, String jmsConnectionAliasId, String jndiAutomaticallyCreateUMAdminObjects, String jndiConnectionFactoryLookupName, String jndiConnectionFactoryPollingInterval, String jndiConnectionFactoryUpdateType, String jndiEnableFollowTheMaster, String jndiJndiAliasName, String manageDestinations, String optTempQueueCreate, String password, String poolTimeout, String producerCachingMode, String producerMaxRetryAttempts, String producerRetryInterval, String producerSessionPoolMinSize, String producerSessionPoolSize, String transactionType, String umLoggingOutput, String umProducerIncludedStrings, String umProducerMessageTracking, String user) {
        this.aliasName = aliasName;
        this.allowNewConnectionPerTrigger = allowNewConnectionPerTrigger;
        this.allowReplyToConsumer = allowReplyToConsumer;
        this.associationType = associationType;
        this.cacheProducersPoolMinSize = cacheProducersPoolMinSize;
        this.cacheProducersPoolSize = cacheProducersPoolSize;
        this.cacheProducersQueueList = cacheProducersQueueList;
        this.cacheProducersTopicList = cacheProducersTopicList;
        this.classLoader = classLoader;
        this.clientID = clientID;
        this.csqDrainInOrder = csqDrainInOrder;
        this.csqSize = csqSize;
        this.description = description;
        this.enabled = enabled;
        this.jmsConnectionAliasId = jmsConnectionAliasId;
        this.jndiAutomaticallyCreateUMAdminObjects = jndiAutomaticallyCreateUMAdminObjects;
        this.jndiConnectionFactoryLookupName = jndiConnectionFactoryLookupName;
        this.jndiConnectionFactoryPollingInterval = jndiConnectionFactoryPollingInterval;
        this.jndiConnectionFactoryUpdateType = jndiConnectionFactoryUpdateType;
        this.jndiEnableFollowTheMaster = jndiEnableFollowTheMaster;
        this.jndiJndiAliasName = jndiJndiAliasName;
        this.manageDestinations = manageDestinations;
        this.optTempQueueCreate = optTempQueueCreate;
        this.password = password;
        this.poolTimeout = poolTimeout;
        this.producerCachingMode = producerCachingMode;
        this.producerMaxRetryAttempts = producerMaxRetryAttempts;
        this.producerRetryInterval = producerRetryInterval;
        this.producerSessionPoolMinSize = producerSessionPoolMinSize;
        this.producerSessionPoolSize = producerSessionPoolSize;
        this.transactionType = transactionType;
        this.umLoggingOutput = umLoggingOutput;
        this.umProducerIncludedStrings = umProducerIncludedStrings;
        this.umProducerMessageTracking = umProducerMessageTracking;
        this.user = user;
    }

}

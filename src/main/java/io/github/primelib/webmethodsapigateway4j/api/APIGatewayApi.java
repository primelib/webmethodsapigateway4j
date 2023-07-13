package io.github.primelib.webmethodsapigateway4j.api;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;
import lombok.Data;

import io.github.primelib.webmethodsapigateway4j.model.AccountLockSettings;
import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.AnalyticsDataStoreDestination;
import io.github.primelib.webmethodsapigateway4j.model.AuditLogDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSCommunicationDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSSNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.CallbackProcessorSettings;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerRequest;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerResponse;
import io.github.primelib.webmethodsapigateway4j.model.ClusterInfo;
import io.github.primelib.webmethodsapigateway4j.model.DenyByIPForFailedAuthConfig;
import io.github.primelib.webmethodsapigateway4j.model.Destination;
import io.github.primelib.webmethodsapigateway4j.model.ElasticsearchDestination;
import io.github.primelib.webmethodsapigateway4j.model.EmailDestination;
import io.github.primelib.webmethodsapigateway4j.model.ErrorProcessing;
import io.github.primelib.webmethodsapigateway4j.model.ExtendedSettingsInput;
import io.github.primelib.webmethodsapigateway4j.model.ExtendedSettingsOutput;
import java.io.File;
import io.github.primelib.webmethodsapigateway4j.model.GatewayCacheConfig;
import io.github.primelib.webmethodsapigateway4j.model.InputLdapConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.JMSConnectionAlias;
import io.github.primelib.webmethodsapigateway4j.model.JMSTrigger;
import io.github.primelib.webmethodsapigateway4j.model.JNDIProviderAlias;
import io.github.primelib.webmethodsapigateway4j.model.KerberosSettings;
import io.github.primelib.webmethodsapigateway4j.model.KeyStore;
import io.github.primelib.webmethodsapigateway4j.model.KeystoreTruststore;
import io.github.primelib.webmethodsapigateway4j.model.LicenseDetail;
import io.github.primelib.webmethodsapigateway4j.model.LoadBalancer;
import io.github.primelib.webmethodsapigateway4j.model.LogConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryInterval;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryIntervalResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordProperties;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordResetResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdate;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdateResponse;
import io.github.primelib.webmethodsapigateway4j.model.MigrationConfig;
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxyGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxySettings;
import io.github.primelib.webmethodsapigateway4j.model.PasswordExpirySettings;
import io.github.primelib.webmethodsapigateway4j.model.PasswordRestrictions;
import io.github.primelib.webmethodsapigateway4j.model.PortalGateway;
import io.github.primelib.webmethodsapigateway4j.model.PortalGatewayCommunitiesData;
import io.github.primelib.webmethodsapigateway4j.model.ProxyBypass;
import io.github.primelib.webmethodsapigateway4j.model.QuiesceMode;
import io.github.primelib.webmethodsapigateway4j.model.Rule;
import io.github.primelib.webmethodsapigateway4j.model.SNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.SSOConfiguration;
import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.Shutdown;
import io.github.primelib.webmethodsapigateway4j.model.TrustStore;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasSettings;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasesGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.Webhook;
import io.github.primelib.webmethodsapigateway4j.model.WebserviceEndpointAlias;
import io.github.primelib.webmethodsapigateway4j.model.WhiteListedIPs;
import feign.RequestLine;
import feign.Param;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface APIGatewayApi {

    /**
     * <p>
     * This REST request is used to activate a rule and this request doesn't require any request body.
     *
     * @param ruleId               The path parameter should be the id of rule that needs to be activated. (required)
     */
    @RequestLine("PUT /rule/{ruleId}/activate")
    Rule activateRule(@Param("ruleId") @NotNull String ruleId);

    /**
     * <p>
     * This method is used to archive the runtime events and metrics. Data to be archived is filtered based on the input parameters. This method returns the job id as the response which is used to know the job status.
     *  Use GET /apitransactions/jobs/{jobId} method to know the status and file name, use POST /apitransactions/archives/{fileName} method to restore. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param from                 This is a date parameter. All the api transactions of specified type, from the given date, are archived. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter (required)
     * @param until                This is a date parameter. All the api transactions of specified type, until the given date, are archived. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter (required)
     * @param eventType            This parameter is used to specify the api transaction type.Specify eventType=ALL to archive all the events. To archive a specific event type, specify the required event type. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan (required)
     * @param olderThan            All the api transactions of specified type that are older than the value specified are archived. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days b) 1M means 1 month c) 1y means 1 year (optional)
     */
    @RequestLine("POST /apitransactions/archives?from={from}&until={until}&olderThan={olderThan}&eventType={eventType}")
    void apiTransactionsArchiveBasedOnDuration(@Param("from") @NotNull String from, @Param("until") @NotNull String until, @Param("eventType") @NotNull String eventType, @Param("olderThan") @Nullable String olderThan);

    /**
     * <p>
     * This resource is used to change the owner of APIGateway asset
     *
     * @param body                  (required)
     */
    @RequestLine("POST /assets/owner")
    ChangeOwnerResponse changeOwner( @NotNull ChangeOwnerRequest body);

    /**
     * <p>
     * This resource is used to change the team of APIGateway asset
     *
     * @param body                  (required)
     */
    @RequestLine("POST /assets/team")
    ChangeOwnerResponse changeTeam( @NotNull ChangeOwnerRequest body);

    /**
     * <p>
     * This method allows you to create the API Portal configuration in API Gateway.
     *
     * @param body                 API Portal configuration payload (required)
     */
    @RequestLine("POST /portalGateways")
    PortalGateway createAPIPortalConfiguration( @NotNull PortalGateway body);

    /**
     * <p>
     * Use this method to create an alias. There are different types of alias like Endpoint, Simple etc. Refer to the Alias schema for different type of alias that you can create. If you want to create an alias for a specific type (say Endpoint alias), refer to the corresponding schema (EndpointAlias)
     *
     * @param body                  (required)
     */
    @RequestLine("POST /alias")
    Alias createAlias( @NotNull Alias body);

    /**
     * <p>
     * The method creates a JMS connection in API Gateway. The API request body must contain the payload for the JMS connection
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/jmsConnections")
    JMSConnectionAlias createJMSConnection( @NotNull JMSConnectionAlias body);

    /**
     * <p>
     * The method creates a JNDI configuration in API Gateway. The API request body must contain the payload for the JNDI configuration
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/jndi")
    JNDIProviderAlias createJNDI( @NotNull JNDIProviderAlias body);

    /**
     * <p>
     * Creates a keystore in API Gateway.
     *
     * @param keyStoreName         The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway. (required)
     * @param keyStoreType         The certificate file format of the keystore. (required)
     * @param keyStorePassword     The keystore password that is defined at the time of keystore creation using a keystore utility. (required)
     * @param uploadFileName       The name of the keystore file that will be used to save the keystore internally in API Gateway. (required)
     * @param fileContent          The contents of the truststore file. (required)
     * @param keyStoreDescription  The description for the keystore. (optional)
     * @param pkAliasesList        Comma separated list of alias names in the uploaded keystore file. (optional)
     * @param pkPasswordsList      Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space. (optional)
     * @param nullPKpasswds        Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password. (optional)
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded. (optional)
     */
    @RequestLine("POST /is/keystore")
    KeyStore createKeystore( @NotNull String keyStoreName,  @NotNull String keyStoreType,  @NotNull String keyStorePassword,  @NotNull String uploadFileName,  @NotNull File fileContent,  @Nullable String keyStoreDescription,  @Nullable String pkAliasesList,  @Nullable String pkPasswordsList,  @Nullable String nullPKpasswds,  @Nullable String isPwdBase64Encoded);

    /**
     *
     * @param body                 The request payload of an outbound proxy server that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /is/outboundproxy")
    void createOutboundProxy( @NotNull OutboundProxySettings body);

    /**
     * <p>
     * The method creates a conditional rule in API Gateway. The API request body must contain the payload for the rule.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /rule")
    Rule createRule( @NotNull Rule body);

    /**
     * <p>
     * Creates a truststore in API Gateway.
     *
     * @param keyStoreName         The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway. (required)
     * @param keyStoreType         The certificate file format of the truststore. (required)
     * @param keyStorePassword     The truststore password that is defined at the time of truststore creation using a keystore utility. (required)
     * @param uploadFileName       The name of the truststore file that will be used to save the truststore internally in API Gateway. (required)
     * @param fileContent          The contents of the truststore file. (required)
     * @param keyStoreDescription  The description for the truststore. (optional)
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded. (optional)
     */
    @RequestLine("POST /is/truststore")
    TrustStore createTruststore( @NotNull String keyStoreName,  @NotNull String keyStoreType,  @NotNull String keyStorePassword,  @NotNull String uploadFileName,  @NotNull File fileContent,  @Nullable String keyStoreDescription,  @Nullable String isPwdBase64Encoded);

    /**
     * <p>
     * Creates a new URL Alias in API Gateway.
     *
     * @param body                 The request body for creating a new URL Alias in API Gateway. (required)
     */
    @RequestLine("POST /urlaliases")
    URLAliasSettings createURLALias( @NotNull URLAliasSettings body);

    /**
     * <p>
     * The method creates a webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be saved.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /webhooks")
    Webhook createWebhook( @NotNull Webhook body);

    /**
     * <p>
     * The method creates a Webservice endpoint in API Gateway. The API request body must contain the payload for the Webservice endpoint
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/webServiceEndpoints")
    WebserviceEndpointAlias createWebserviceEndpoint( @NotNull WebserviceEndpointAlias body);

    /**
     * <p>
     * This REST request is used to deactivate a rule and it doesn't require any request body.
     *
     * @param ruleId               The path parameter should be the id of rule that needs to be deactivated. (required)
     */
    @RequestLine("PUT /rule/{ruleId}/deactivate")
    Rule deactivateRule(@Param("ruleId") @NotNull String ruleId);

    /**
     * <p>
     * This API allows you to delete an API Portal configuration in API Gateway.
     *
     * @param portalGatewayId      Id of the API Portal configuration for delete. (required)
     */
    @RequestLine("DELETE /portalGateways/{portalGatewayId}")
    void deleteAPIPortalConfiguration(@Param("portalGatewayId") @NotNull String portalGatewayId);

    /**
     * <p>
     * The method deletes an alias from API Gateway.
     *
     * @param aliasId              The path parameter specifies the id of an alias that is to be deleted from API Gateway. (required)
     */
    @RequestLine("DELETE /alias/{aliasId}")
    void deleteAlias(@Param("aliasId") @NotNull String aliasId);

    /**
     * <p>
     * This delete request will delete the JMS connection based on the JMS connection id which is specified in path
     *
     * @param jmsConnId            This path parameter is used to specify the JMS connection id for which JMS connection needs to deleted. (required)
     */
    @RequestLine("DELETE /is/jmsConnections/{jmsConnId}")
    void deleteJMSConnection(@Param("jmsConnId") @NotNull String jmsConnId);

    /**
     * <p>
     * This delete request will delete the JNDI configuration based on the JNDI id which is specified in path
     *
     * @param jndiId               This path parameter is used to specify the JNDI id for which JNDI configuration needs to deleted. (required)
     */
    @RequestLine("DELETE /is/jndi/{jndiId}")
    void deleteJNDI(@Param("jndiId") @NotNull String jndiId);

    /**
     * <p>
     * Deletes keystore matching the specified name in API Gateway.
     *
     * @param keyStoreName         Keystore name to identify the corresponding Keystore (required)
     */
    @RequestLine("DELETE /is/keystore/{keyStoreName}")
    List<KeyStore> deleteKeystore(@Param("keyStoreName") @NotNull String keyStoreName);

    /**
     * <p>
     * Deletes the specified outbound proxy server alias from API Gateway.
     *
     * @param outboundproxyAlias   The outbound proxy server alias to be deleted (required)
     */
    @RequestLine("DELETE /is/outboundproxy/{outboundproxyAlias}")
    void deleteOutboundProxy(@Param("outboundproxyAlias") @NotNull String outboundproxyAlias);

    /**
     * <p>
     * The method deletes a rule from API Gateway.
     *
     * @param ruleId               The path parameter specifies the id of a rule that is to be deleted from API Gateway. (required)
     */
    @RequestLine("DELETE /rule/{ruleId}")
    void deleteRule(@Param("ruleId") @NotNull String ruleId);

    /**
     * <p>
     * Deletes an already existing truststore matching the name in API Gateway.
     *
     * @param trustStoreName       Truststore name to identify the corresponding trust store to delete in API Gateway (required)
     */
    @RequestLine("DELETE /is/truststore/{trustStoreName}")
    void deleteTruststore(@Param("trustStoreName") @NotNull String trustStoreName);

    /**
     * <p>
     * The method deletes an URL alias in API Gateway.
     *
     * @param alias                The name of the URL alias to be deleted. (required)
     */
    @RequestLine("DELETE /urlaliases?alias={alias}")
    void deleteURLAlias(@Param("alias") @NotNull String alias);

    /**
     * <p>
     * The method deletes a webhook resource from API Gateway.
     *
     * @param id                   This parameter specifies the id of the webhook that is to be deleted in API Gateway. (required)
     */
    @RequestLine("DELETE /webhooks/{id}")
    void deleteWebhook(@Param("id") @NotNull String id);

    /**
     * <p>
     * This delete request will delete the Webservice endpoint based on the Webservice endpoint id which is specified in path
     *
     * @param webserviceEndpointId This path parameter is used to specify the Webservice endpoint id for which Webservice endpoint needs to deleted. (required)
     */
    @RequestLine("DELETE /is/webServiceEndpoints/{webserviceEndpointId}")
    void deleteWebserviceEndpoint(@Param("webserviceEndpointId") @NotNull String webserviceEndpointId);

    /**
     * <p>
     * The method disables the specified JMS connections in API Gateway.
     *
     * @param jmsConnId            This path parameter is used to specify the JMS connection id which JMS connection needs to be disabled. (required)
     */
    @RequestLine("PUT /is/jmsConnections/{jmsConnId}/disable")
    void disableJMSConnection(@Param("jmsConnId") @NotNull String jmsConnId);

    /**
     * <p>
     * The method disables the specified JMS trigger in API Gateway.
     *
     * @param jmsTriggerId         This path parameter is used to specify the JMS trigger id which JMS trigger needs to be disabled. (required)
     */
    @RequestLine("PUT /is/jmsTriggers/{jmsTriggerId}/disable")
    void disableJMSTrigger(@Param("jmsTriggerId") @NotNull String jmsTriggerId);

    /**
     * <p>
     * Disables an already existing outbound proxy server alias in API Gateway.
     *
     * @param outboundproxyAlias   The outbound proxy server alias to be disabled (required)
     */
    @RequestLine("PUT /is/outboundproxy{outboundproxyAlias}/disable")
    void disableOutboundProxy(@Param("outboundproxyAlias") @NotNull String outboundproxyAlias);

    /**
     * <p>
     * The GET method is used to download the api transactions of the specified type. Data to be downloaded is filtered based on the input parameters. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param startDate            This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter (required)
     * @param endDate              This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter (required)
     * @param eventType            This parameter is used to specify the event type to be downloaded. Specify eventType=ALL to download all the events. To download events of a specific type, specify the required event type Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan (required)
     * @param duration             All the api transactions of the specified type that are older than the value specified are downloaded. Ex: duration='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year. Either one of (startDate&amp;endDate) or duration is a mandatory parameter (optional)
     */
    @RequestLine("GET /apitransactions?duration={duration}&startDate={startDate}&endDate={endDate}&eventType={eventType}")
    void downloadAPITransaction(@Param("startDate") @NotNull String startDate, @Param("endDate") @NotNull String endDate, @Param("eventType") @NotNull String eventType, @Param("duration") @Nullable String duration);

    /**
     * <p>
     * This resource is used to download logs from different components used by APIGateway, server configurations and thread dumps.
     *
     */
    @RequestLine("GET /logAggregation/downloadLogs")
    void downloadLogs();

    /**
     * <p>
     * The method enables the specified JMS connections in API Gateway.
     *
     * @param jmsConnId            This path parameter is used to specify the JMS connection id which JMS connection needs to be enabled. (required)
     */
    @RequestLine("PUT /is/jmsConnections/{jmsConnId}/enable")
    void enableJMSConnection(@Param("jmsConnId") @NotNull String jmsConnId);

    /**
     * <p>
     * The method enables the specified JMS trigger in API Gateway.
     *
     * @param jmsTriggerId         This path parameter is used to specify the JMS trigger id which JMS trigger needs to be enabled. (required)
     */
    @RequestLine("PUT /is/jmsTriggers/{jmsTriggerId}/enable")
    void enableJMSTrigger(@Param("jmsTriggerId") @NotNull String jmsTriggerId);

    /**
     * <p>
     * Enables an already existing outbound proxy server alias in API Gateway.
     *
     * @param outboundproxyAlias   The outbound proxy server alias to be enabled (required)
     */
    @RequestLine("PUT /is/outboundproxy{outboundproxyAlias}/enable")
    void enableOutboundProxy(@Param("outboundproxyAlias") @NotNull String outboundproxyAlias);

    /**
     * <p>
     * The method retrieves list of all JNDI templates in API Gateway.
     *
     */
    @RequestLine("GET /is/jndi/template")
    void fetchJNDITemplates();

    /**
     * <p>
     * This method retrieves the API callback processor settings from API Gateway.
     *
     */
    @RequestLine("GET /configurations/apiCallBackSettings")
    CallbackProcessorSettings getAPICallbackProcessorSettings();

    /**
     * <p>
     * The method retrieves the details of the API Portal destination configurations. API Gateway can publish events and performance metrics data. By default, error events, lifecycle events, policy violation event, and performance data are published to API Portal.
     *
     */
    @RequestLine("GET /configurations/apiPortalDestinationConfig")
    Destination getAPIPortalAsDestination();

    /**
     * <p>
     * This API allows you to retrieve an API Portal configuration in API Gateway.
     *
     * @param portalGatewayId      Id of the API Portal configuration for retrieval (required)
     */
    @RequestLine("GET /portalGateways/{portalGatewayId}")
    PortalGateway getAPIPortalConfiguration(@Param("portalGatewayId") @NotNull String portalGatewayId);

    /**
     * <p>
     * This API allows you to retrieve the details about communities in API Portal. An API can be published from API Gateway to any of the communities available in API Portal
     *
     * @param portalGatewayId      Id of the API Portal configuration for retrieval of the community information (required)
     * @param apiId                Id of the API published from API Gateway to API Portal (required)
     */
    @RequestLine("GET /portalGateways/communities?portalGatewayId={portalGatewayId}&apiId={apiId}")
    PortalGatewayCommunitiesData getAPIPortalMetadata(@Param("portalGatewayId") @NotNull String portalGatewayId, @Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * Retrieves the account lock settings configured in API Gateway
     *
     */
    @RequestLine("GET /configurations/accountLockSettings")
    AccountLockSettings getAccountLockSettings();

    /**
     * <p>
     * The method retrieves the details of an alias in API Gateway.
     *
     * @param aliasId              The path parameter specifies the id of an alias whose details are to be retrieved. (required)
     */
    @RequestLine("GET /alias/{aliasId}")
    Alias getAlias(@Param("aliasId") @NotNull String aliasId);

    /**
     * <p>
     * This API allows you to retrieve API Portal configurations available in API Gateway.
     *
     */
    @RequestLine("GET /portalGateways")
    PortalGateway getAllAPIPortalConfiguration();

    /**
     * <p>
     * The method retrieves a list of all aliases in API Gateway.
     *
     */
    @RequestLine("GET /alias")
    List<Alias> getAllAlias();

    /**
     * <p>
     * The method retrieves list of all the JMS connections in API Gateway.
     *
     */
    @RequestLine("GET /is/jmsConnections")
    void getAllJMSConnections();

    /**
     * <p>
     * The method retrieves list of all JMS triggers in API Gateway.
     *
     */
    @RequestLine("GET /is/jmsTriggers")
    void getAllJMSTriggers();

    /**
     * <p>
     * The method retrieves list of all rules in API Gateway.
     *
     * @param ruleType             ruleType : if supplied, returns the rules of this particular ruleType only (optional)
     * @param active               active : if supplied, returns the active rules only (optional)
     */
    @RequestLine("GET /rule?ruleType={ruleType}&active={active}")
    List<Rule> getAllRule(@Param("ruleType") @Nullable String ruleType, @Param("active") @Nullable String active);

    /**
     * <p>
     * The method retrieves the list of all webhooks in API Gateway.
     *
     */
    @RequestLine("GET /webhooks")
    List<Webhook> getAllWebhooks();

    /**
     * <p>
     * The method retrieves list of all Webservice endpoints in API Gateway.
     *
     */
    @RequestLine("GET /is/webServiceEndpoints")
    void getAllWebserviceEndpoints();

    /**
     *
     */
    @RequestLine("GET /configurations/analyticsDataStoreDestinationConfig")
    AnalyticsDataStoreDestination getAnalyticsDataStoreAsDestination();

    /**
     * <p>
     * The method retrieves the details of the Transaction Logger destination in API Gateway. Transaction Logger captures the API runtime invocations performed in API Gateway. The transaction logger data is written to a file or a database based on the configurations. Transactions events are written to the transaction logger only when the Transaction Logger is selected as a destination in Log Invocation Policy.
     *
     */
    @RequestLine("GET /configurations/auditlogDestinationConfig")
    AuditLogDestination getAuditLogAsDestination();

    /**
     *
     */
    @RequestLine("GET /configurations/cache")
    GatewayCacheConfig getCacheConfig();

    /**
     * <p>
     * The method retrieves the communication details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     *
     */
    @RequestLine("GET /configurations/centraSiteDestinationCommunicationConfig")
    CSCommunicationDestination getCentraSiteCommunicationAsDestination();

    /**
     * <p>
     * The method retrieves the SNMP details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     *
     */
    @RequestLine("GET /configurations/centraSiteDestinationSNMPConfig")
    CSSNMPDestination getCentraSiteSNMPAsDestination();

    /**
     * <p>
     * Retrieves the configured cluster settings from API Gateway.
     *
     */
    @RequestLine("GET /is/cluster")
    ClusterInfo getClusterSetting();

    /**
     * <p>
     * This REST method is used to get the configured custom content types in API Gateway. Custom content types can be defined for base types XML,JSON and Text.These Custom types can be then used for payload processing in policies like Content based routing,Identify and access and Conditional error processing
     *
     */
    @RequestLine("GET /configurations/customContentTypes")
    Object getCustomContentTypes();

    /**
     * <p>
     * The method retrieves the details of the Database destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Database destination.
     *
     */
    @RequestLine("GET /configurations/jdbcDestinationConfig")
    Destination getDatabaseAsDestination();

    /**
     * <p>
     * Retrieves the configuration of gloabal IP access setting for authentication based restrictions in API Gateway
     *
     */
    @RequestLine("GET /configurations/denyByIPForFailedAuthConfig")
    DenyByIPForFailedAuthConfig getDenyByIPForFailedAuthConfig();

    /**
     * <p>
     * The method retrieves the details of the Digital Events destination in API Gateway. Digital Event Services (DES) enables API Gateway to communicate by exchanging digital events. API Gateway can publish runtime events(example: policy violation,log invocation, error events etc), design time events (example: audit log events) and metrics to the configured DES destination.
     *
     */
    @RequestLine("GET /configurations/desDestinationConfig")
    Destination getDigitalEventsAsDestination();

    /**
     * <p>
     * The method retrieves the details of the Elasticsearch destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Elasticsearch destination.
     *
     */
    @RequestLine("GET /configurations/elasticsearchDestinationConfig")
    ElasticsearchDestination getElasticsearchAsDestination();

    /**
     * <p>
     * The method retrieves the details of the Email destination in API Gateway. API Gateway can send alerts to the email ID specified either in the Log Invocation, Monitor Service Performance, Monitor Service Level Agreement, (or) Throttling Traffic Optimization policies through the configured Email destination.
     *
     */
    @RequestLine("GET /configurations/emailDestinationConfig")
    EmailDestination getEmailAsDestination();

    /**
     * <p>
     * This REST method is used to get the configured error template and the value of the property - sendNativeProviderFault,which enables the server to forward the native error as it is.
     *
     */
    @RequestLine("GET /configurations/errorProcessing")
    ErrorProcessing getErrorProcessingDetails();

    /**
     * <p>
     * The method retrieves the details of the API Gateway destination. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics data. By default, error events, lifecycle events, policy violation event, audit logs and performance data are published to API Gateway.
     *
     */
    @RequestLine("GET /configurations/gatewayDestinationConfig")
    Destination getGatewayAsDestination();

    /**
     * <p>
     * The method retrieves the specified JMS connection in API Gateway.
     *
     * @param jmsConnId            This path parameter is used to specify the JMS connection id which JMS connection needs to be retrived. (required)
     */
    @RequestLine("GET /is/jmsConnections/{jmsConnId}")
    JMSConnectionAlias getJMSConnection(@Param("jmsConnId") @NotNull String jmsConnId);

    /**
     * <p>
     * The method retrieves the specified JMS trigger in API Gateway.
     *
     * @param jmsTriggerId         This path parameter is used to specify the JMS trigger id which JMS trigger needs to be retrieved. (required)
     */
    @RequestLine("GET /is/jmsTriggers/{jmsTriggerId}")
    JMSTrigger getJMSTrigger(@Param("jmsTriggerId") @NotNull String jmsTriggerId);

    /**
     * <p>
     * Retrieves the configured Kerberos settings from API Gateway.
     *
     */
    @RequestLine("GET /is/kerberos")
    KerberosSettings getKerberosSetting();

    /**
     * <p>
     * The method retrieves the details of the default keystore, truststore and alias settings in API Gateway. You might want to configure API Gateway to refer to a default keystore, truststore, or both, before deploying any SOAP message flows that require signature, encryption, X.509 authentication, and so on, as configured in the Inbound Authentication - Message policy. The default keystore and truststore are that you want API Gateway to use for the incoming secured messages
     *
     */
    @RequestLine("GET /configurations/keystore")
    KeystoreTruststore getKeyStoreTrustore();

    /**
     * <p>
     * The method gets keystore matching the name in API Gateway.
     *
     * @param keyStoreName         Keystore name to identify the corresponding Keystore (required)
     */
    @RequestLine("GET /is/keystore/{keyStoreName}")
    List<KeyStore> getKeystore(@Param("keyStoreName") @NotNull String keyStoreName);

    /**
     * <p>
     * The method gets all keystores available in API Gateway.
     *
     */
    @RequestLine("GET /is/keystore")
    List<KeyStore> getKeystores();

    /**
     * <p>
     * Retrieves the LDAP configuration settings configured in the API Gateway
     *
     */
    @RequestLine("GET /configurations/ldapConfig")
    InputLdapConfiguration getLdapConfig();

    /**
     * <p>
     * Retrieves the license details from API Gateway.
     *
     */
    @RequestLine("GET /is/license")
    LicenseDetail getLicenseDetails();

    /**
     * <p>
     * The method retrieves the details of the Load Balancer configuration in API Gateway.
     *
     */
    @RequestLine("GET /configurations/loadBalancer")
    LoadBalancer getLoadBalancers();

    /**
     * <p>
     * APIGateway has log files from different components.This method is used to retrieve the log settings of various components used by APIGateway.
     *
     */
    @RequestLine("GET /configurations/logConfig")
    LogConfiguration getLogConfig();

    /**
     * <p>
     * Returns the list of runtime event types. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs. You can use these eventType to scope the archive/purge operation.
     * The user should be part of API-Gateway-Administrators group or else should have 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     */
    @RequestLine("GET /apitransactions/typedefinitions")
    void getMappings();

    /**
     * <p>
     * This retrieves the master password properties in API Gateway.
     *
     */
    @RequestLine("GET /masterPassword")
    MasterPasswordProperties getMasterPasswordProperties();

    /**
     * <p>
     * RRetrieves the current status of the migration action which is invoked in API Gateway.
     *
     * @param action               The migration action for which the status to be sent (required)
     */
    @RequestLine("GET /migration/status?action={action}")
    void getMigrationStatus(@Param("action") @NotNull String action);

    /**
     * <p>
     * Retrieves the list of all available outbound proxy server aliases in API Gateway.
     *
     */
    @RequestLine("GET /is/outboundproxy")
    OutboundProxyGetResponse getOutboundProxies();

    /**
     * <p>
     * Retrieves the password expiry settings configured in API Gateway
     *
     */
    @RequestLine("GET /configurations/passwordExpiry")
    PasswordExpirySettings getPasswordExpirySettings();

    /**
     * <p>
     * Retrieves the password restrictions settings configured in API Gateway
     *
     */
    @RequestLine("GET /configurations/passwordRestrictions")
    PasswordRestrictions getPasswordRestrictions();

    /**
     * <p>
     * The method retrieves a list of all hostlists for which outbound proxy servers are skipped. Note: proxyBypass Id is always proxyBypass
     *
     */
    @RequestLine("GET /is/proxyBypass")
    ProxyBypass getProxyBypass();

    /**
     * <p>
     * This API allows you to retrieve the details of the published packages that the API is part of
     *
     * @param portalGatewayId      Id of the API Portal configuration for retrieval of published packages information (required)
     * @param apiId                Id of the API published from API Gateway to API Portal (required)
     */
    @RequestLine("GET /portalGateways/packages?portalGatewayId={portalGatewayId}&apiId={apiId}")
    Set<Object> getPublishedPackages(@Param("portalGatewayId") @NotNull String portalGatewayId, @Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * Returns the quiesce mode setting in API Gateway
     *
     */
    @RequestLine("GET /quiescemode")
    QuiesceMode getQuiesceMode();

    /**
     * <p>
     * The method retrieves the details of a rule in API Gateway.
     *
     * @param ruleId               The path parameter specifies the id of a rule that is to be retrieved. (required)
     */
    @RequestLine("GET /rule/{ruleId}")
    Rule getRule(@Param("ruleId") @NotNull String ruleId);

    /**
     * <p>
     * The method retrieves the details of the SNMP destination in API Gateway. API Gateway can publish events and performance metrics data to the configured 3rd party SNMP server.
     *
     */
    @RequestLine("GET /configurations/snmpDestinationConfig")
    SNMPDestination getSNMPAsDestination();

    /**
     * <p>
     * Retrieves the SSO configuration in API Gateway
     *
     */
    @RequestLine("GET /configurations/samlsso")
    SSOConfiguration getSSOConfiguration();

    /**
     * <p>
     * This method retrieves the list of extended settings and watt properties from API Gateway.
     *
     */
    @RequestLine("GET /configurations/settings")
    ExtendedSettingsOutput getSettings();

    /**
     * <p>
     * Retrieves an existing truststore matching the given name from API Gateway.
     *
     * @param trustStoreName       Truststore name to identify the corresponding trust store in API Gateway (required)
     */
    @RequestLine("GET /is/truststore/{trustStoreName}")
    List<TrustStore> getTruststore(@Param("trustStoreName") @NotNull String trustStoreName);

    /**
     * <p>
     * Retrieves all available truststores from API Gateway.
     *
     */
    @RequestLine("GET /is/truststore")
    List<TrustStore> getTruststores();

    /**
     * <p>
     * Retrieves all URL Aliases or a URL Alias with a particular ID in API Gateway (if the query parameter alias is provided).
     *
     * @param alias                The name of the URL alias to be retrieved. If this query parameter is provided, then it retrieves the URL Aliases identified by the given alias. (optional)
     */
    @RequestLine("GET /urlaliases?alias={alias}")
    URLAliasesGetResponse getURLALias(@Param("alias") @Nullable String alias);

    /**
     * <p>
     * The method retrieves the details of a webhook in API Gateway.
     *
     * @param id                   The path parameter specifies the id of a webhook whose details are to be retrieved. (required)
     */
    @RequestLine("GET /webhooks/{id}")
    Webhook getWebhook(@Param("id") @NotNull String id);

    /**
     * <p>
     * The method retrieves the specified Webservice endpoint in API Gateway.
     *
     * @param webserviceEndpointId This path parameter is used to specify the Webservice endpoint id which Webservice endpoint needs to be retrived. (required)
     */
    @RequestLine("GET /is/webServiceEndpoints/{webserviceEndpointId}")
    WebserviceEndpointAlias getWebserviceEndpoint(@Param("webserviceEndpointId") @NotNull String webserviceEndpointId);

    /**
     * <p>
     * The method retrieves the details of the whitelisting IPs configuration in API Gateway.
     *
     */
    @RequestLine("GET /configurations/whiteListingIPs")
    WhiteListedIPs getWhiteListedIPs();

    /**
     * <p>
     * This GET method is used to fetch the details of existing archive files and response of this method is the list of archive file names. Select a filename from the list of archive file names returned by this method and use the POST method /apitransactions/archives/{fileName} to restore.The user must either be a part of API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param filter                (optional)
     */
    @RequestLine("GET /apitransactions/archives?filter={filter}")
    void listAllArchives(@Param("filter") @Nullable String filter);

    /**
     * <p>
     * The method retrieves list of all JNDI configurations in API Gateway.
     *
     */
    @RequestLine("GET /is/jndi")
    void listAllJNDI();

    /**
     * <p>
     * This method returns a list of pending jobs. Every time you initiate archive, restore, or purge operation you get a job id as a response. You can use the specific job id to query the status of the initiated operation. The user must either be part of the API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param action                (optional)
     * @param status                (optional)
     */
    @RequestLine("GET /apitransactions/jobs?action={action}&status={status}")
    void listAllPendingJobs(@Param("action") @Nullable String action, @Param("status") @Nullable String status);

    /**
     * <p>
     * The method retrieves the specified JNDI configuration in API Gateway.
     *
     * @param jndiId               This path parameter is used to specify the JNDI configuration id which JNDI configuration needs to be retrived. (required)
     */
    @RequestLine("GET /is/jndi/{jndiId}")
    JNDIProviderAlias listJNDI(@Param("jndiId") @NotNull String jndiId);

    /**
     * <p>
     * Triggers a migration action and immediately returns with 202 status code. Clean action clears the data from the API Gateway data store, reindex action reindex the data from the source Elasticsearch to API Gateway data store and transform action transforms the reindexed assets in the API Gateway data store to be compatible with the current API Gateway version. The clean action should be invoked on target API Gateway server prior to invoking reindex API for core indices. The current status of the action can be retrieved using /migration/status API. A webhook event with the migration status also would be sent to the subscribed webhook clients
     *
     * @param body                  (required)
     */
    @RequestLine("POST /migration")
    void migration( @NotNull MigrationConfig body);

    /**
     * <p>
     * The DELETE method is used to purge the api transactions of the specified type. Data to be purged is filtered based on the input parameters. This method returns a job id as response and this job id is used to track the job status. See /apitransactions/jobs/{jobId} for more details. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param from                 This is a date parameter. All the api transactions of the specified type, from the given date, are purged. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter (required)
     * @param until                This is a date parameter. All the api transactions of the specified type, until the given date, are purged. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter (required)
     * @param eventType            This parameter is used to specify the event type to be purged. Specify eventType=ALL to purge all the events. To purge a specific event type, specify the required event type. Ex: eventType=transactionalEvents. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan (required)
     * @param action               This is an optional query parameter. Sometimes it’s better to take backup before purging the data . If you specify the action value as "archiveAndPurge", API Gateway performs an archive before purging the data. (optional)
     * @param olderThan            All the api transactions of the specified type, that are older than the value specified, are purged. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year (optional)
     */
    @RequestLine("DELETE /apitransactions?action={action}&from={from}&until={until}&olderThan={olderThan}&eventType={eventType}")
    void purgeAPITransactions(@Param("from") @NotNull String from, @Param("until") @NotNull String until, @Param("eventType") @NotNull String eventType, @Param("action") @Nullable String action, @Param("olderThan") @Nullable String olderThan);

    /**
     * <p>
     * This method either enables or disables the quiesce mode in API Gateway. Quiesce mode has two kinds - designtime and all. Quiesce mode for designtime will block the designtime API requests to API Gateway server and return 503 status code except the GET http method as well as few whitelisted APIs like search and this API itself. Quiesce mode for all is an extension of Integration server's Quiesce mode with the addition of flushing of API Gateway in-memory data such as performance metrics, license metrics and subscription quota to the configured data store.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /quiescemode")
    QuiesceMode quiescemode( @NotNull QuiesceMode body);

    /**
     * <p>
     * Resets the master password to the default value in API Gateway.This should be performed when the master password is lost and after a successful reset, it is recommended to change the master password again to a secure value
     *
     */
    @RequestLine("PUT /masterPassword/reset")
    MasterPasswordResetResponse resetMasterPassword();

    /**
     * <p>
     * This method is used to restore the runtime data by specifying the archive file name.For more details see GET /apitransactions/archives/ to know how to get the existing archive file names. This method returns a job id as a response to track the status. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param fileName             This parameter indicates the file name to be restored. Ex: fileName=default-2017-08-29-1504011306456. (required)
     */
    @RequestLine("POST /apitransactions/archives/{fileName}")
    void restoreData(@Param("fileName") @NotNull String fileName);

    /**
     * <p>
     * This method updates or creates API callback processor settings in API Gateway. The user should have Manage general administration configurations privilege to update the API callback processor settings.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/apiCallBackSettings")
    CallbackProcessorSettings saveAPICallbackProcessorSettings( @NotNull CallbackProcessorSettings body);

    /**
     * <p>
     * The method is used to update the details of the API Portal destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/apiPortalDestinationConfig")
    Destination saveAPIPortalAsDestination( @NotNull Destination body);

    /**
     * <p>
     * Saves the account lock settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/accountLockSettings")
    AccountLockSettings saveAccountLockSettings( @NotNull AccountLockSettings body);

    /**
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/analyticsDataStoreDestinationConfig")
    AnalyticsDataStoreDestination saveAnalyticsDataStoreAsDestination( @NotNull AnalyticsDataStoreDestination body);

    /**
     * <p>
     * The method is used to update the details of the Transaction Logger destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/auditlogDestinationConfig")
    AuditLogDestination saveAuditLogAsDestination( @NotNull AuditLogDestination body);

    /**
     * <p>
     * The method is used to update the Communication details of the CentraSite destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/centraSiteDestinationCommunicationConfig")
    CSCommunicationDestination saveCentraSiteCommunicationAsDestination( @NotNull CSCommunicationDestination body);

    /**
     * <p>
     * The method is used to update the details of the CentraSite SNMP destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/centraSiteDestinationSNMPConfig")
    CSSNMPDestination saveCentraSiteSNMPAsDestination( @NotNull CSSNMPDestination body);

    /**
     * <p>
     * This REST method is used to update the custom content types for API Gateway.The response is a set of key/value pair where key indicates the custom content type and value indicates the base type. The value can be application/xml or application/json or text/xml
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/customContentTypes")
    Object saveCustomContentTypes( @NotNull Object body);

    /**
     * <p>
     * The method is used to update the details of the Database destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/jdbcDestinationConfig")
    Destination saveDatabaseAsDestination( @NotNull Destination body);

    /**
     * <p>
     * Saves the global IP access setting for authentication based restriction settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/denyByIPForFailedAuthConfig")
    DenyByIPForFailedAuthConfig saveDenyByIPForFailedAuthConfig( @NotNull DenyByIPForFailedAuthConfig body);

    /**
     * <p>
     * The method is used to update the details of the Digital Events destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/desDestinationConfig")
    Destination saveDigitalEventsAsDestination( @NotNull Destination body);

    /**
     * <p>
     * The method is used to update the details of the Elasticsearch destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/elasticsearchDestinationConfig")
    ElasticsearchDestination saveElasticsearchAsDestination( @NotNull ElasticsearchDestination body);

    /**
     * <p>
     * The method is used to update the details of the Email destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/emailDestinationConfig")
    EmailDestination saveEmailAsDestination( @NotNull EmailDestination body);

    /**
     * <p>
     * This REST method is used to update the default error template with any custom templates and the value of the property - sendNativeProviderFault.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/errorProcessing")
    ErrorProcessing saveErrorProcessingDetails( @NotNull ErrorProcessing body);

    /**
     * <p>
     * The method is used to update the details of the API Gateway destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/gatewayDestinationConfig")
    Destination saveGatewayAsDestination( @NotNull Destination body);

    /**
     * <p>
     * The method is used to update the details of the default keystore, truststore and alias configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/keystore")
    KeystoreTruststore saveKeystoreTruststore( @NotNull KeystoreTruststore body);

    /**
     * <p>
     * Saves the LDAP configuration settings in the API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/ldapConfig")
    InputLdapConfiguration saveLdapConfig( @NotNull InputLdapConfiguration body);

    /**
     * <p>
     * The method is used to update the details of the load Balancer configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/loadBalancer")
    LoadBalancer saveLoadBalancers( @NotNull LoadBalancer body);

    /**
     * <p>
     * The method is used to update the details of the log configuration in API Gateway.
     *
     */
    @RequestLine("PUT /configurations/logConfig")
    LogConfiguration saveLogConfig();

    /**
     * <p>
     * Saves the password expiry settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/passwordExpiry")
    PasswordExpirySettings savePasswordExpirySettings( @NotNull PasswordExpirySettings body);

    /**
     * <p>
     * Saves the password restrictions settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/passwordRestrictions")
    PasswordRestrictions savePasswordRestrictions( @NotNull PasswordRestrictions body);

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     *
     * @param body                 The request payload of proxybypass server that is to be saved in API Gateway. (required)
     */
    @RequestLine("POST /is/proxyBypass")
    void saveProxyBypass( @NotNull ProxyBypass body);

    /**
     * <p>
     * The method is used to update the details of the SNMP destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/snmpDestinationConfig")
    SNMPDestination saveSNMPAsDestination( @NotNull SNMPDestination body);

    /**
     * <p>
     * The method is used to update the details of the SSO configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/samlsso")
    SSOConfiguration saveSSOConfig( @NotNull SSOConfiguration body);

    /**
     * <p>
     * This method updates or creates a list of extended settings and watt properties in API Gateway. The user should have an API Gateway administrator access to update thse settings. The user needs to send only the modified settings i.e, 'preferredSettings', in the payload.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/settings")
    ExtendedSettingsOutput saveSettings( @NotNull ExtendedSettingsInput body);

    /**
     * <p>
     * The method is used to update the details of the whitelisting IPs configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/whiteListingIPs")
    WhiteListedIPs saveWhitelistedIPs( @NotNull WhiteListedIPs body);

    /**
     * <p>
     * This method shutdowns the API Gateway server. If bounce is set as true then the server would be restarted. The option parameter specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown. Quiesce specifies the quiesce mode for all in API Gateway. A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. The default value is false.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /shutdown")
    void shutdown( @NotNull Shutdown body);

    /**
     * <p>
     * The method is to test the given JNDI configuration in API Gateway.
     *
     * @param jndiId                (required)
     */
    @RequestLine("GET /is/jndi/{jndiId}/test")
    void testJNDI(@Param("jndiId") @NotNull String jndiId);

    /**
     * <p>
     * Use this method to know the status of a specific job. This method returns the status and file name (in case of archive process) as a response. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     *
     * @param jobId                This parameter indicates the job Id. Job Id is required to identify and track the status of a job which has been initiated. Ex: jobId=1504011632215 (required)
     */
    @RequestLine("GET /apitransactions/jobs/{jobId}")
    void trackJobStatus(@Param("jobId") @NotNull String jobId);

    /**
     * <p>
     * This API allows you to update API Portal configuration information in API Gateway.
     *
     * @param portalGatewayId      Id of the API Portal configuration for update (required)
     * @param body                 API Portal configuration payload (required)
     */
    @RequestLine("PUT /portalGateways/{portalGatewayId}")
    PortalGateway updateAPIPortalConfiguration(@Param("portalGatewayId") @NotNull String portalGatewayId,  @NotNull PortalGateway body);

    /**
     * <p>
     * The method updates the details of a specified alias in API Gateway. The API request body must contain the payload of the alias that needs to be updated.
     *
     * @param aliasId              The path parameter specifies the id of an alias whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an alias that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /alias/{aliasId}")
    Alias updateAlias(@Param("aliasId") @NotNull String aliasId,  @NotNull Alias body);

    /**
     *
     */
    @RequestLine("PUT /configurations/cache")
    GatewayCacheConfig updateCacheConfig();

    /**
     * <p>
     * Updates the cluster settings in API Gateway.
     *
     * @param body                 The request payload for cluster settings in API Gateway. (required)
     */
    @RequestLine("PUT /is/cluster")
    ClusterInfo updateCluster( @NotNull ClusterInfo body);

    /**
     * <p>
     * The method updates the expiry interval of the master password in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /masterPassword/setExpiry")
    MasterPasswordExpiryIntervalResponse updateExpiryInterval( @NotNull MasterPasswordExpiryInterval body);

    /**
     * <p>
     * This REST service is used to update the JMS connection
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jmsConnections")
    JMSConnectionAlias updateJMSConnection( @NotNull JMSConnectionAlias body);

    /**
     * <p>
     * This REST service is used to update the JMS trigger
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jmsTriggers")
    JMSTrigger updateJMSTrigger( @NotNull JMSTrigger body);

    /**
     * <p>
     * This REST service is used to update the JNDI configuration
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jndi")
    JNDIProviderAlias updateJNDI( @NotNull JNDIProviderAlias body);

    /**
     *
     * @param body                 The request payload for Kerberos settings in API Gateway. (required)
     */
    @RequestLine("PUT /is/kerberos")
    void updateKerberos( @NotNull KerberosSettings body);

    /**
     * <p>
     * Updates an already existing keystore in API Gateway.
     *
     * @param keyStoreName         The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway. (required)
     * @param keyStoreType         The certificate file format of the keystore. (required)
     * @param keyStoreProvider     The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type. (required)
     * @param keyStorePassword     The keystore password that is defined at the time of keystore creation using a keystore utility. (required)
     * @param uploadFileName       The name of the keystore file that will be used to save the keystore internally in API Gateway. (required)
     * @param fileContent          The contents of the keystore file. (required)
     * @param keyStoreDescription  The description for the keystore. (optional)
     * @param pkAliasesList        Comma separated list of alias names in the uploaded keystore file. (optional)
     * @param pkPasswordsList      Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space. (optional)
     * @param nullPKpasswds        Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password. (optional)
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded. (optional)
     */
    @RequestLine("POST /is/keystore/{keyStoreName}")
    KeyStore updateKeystoreAliases(@Param("keyStoreName") @NotNull String keyStoreName,  @NotNull String keyStoreType,  @NotNull String keyStoreProvider,  @NotNull String keyStorePassword,  @NotNull String uploadFileName,  @NotNull File fileContent,  @Nullable String keyStoreDescription,  @Nullable String pkAliasesList,  @Nullable String pkPasswordsList,  @Nullable String nullPKpasswds,  @Nullable String isPwdBase64Encoded);

    /**
     *
     * @param body                 The request payload for updating license details in APIGateway. (required)
     */
    @RequestLine("PUT /is/license")
    void updateLicenseDetails( @NotNull LicenseDetail body);

    /**
     * <p>
     * The method updates the master password in API Gateway.On successful update,all the old passwords available will be encrypted using this new master password.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /masterPassword/update")
    MasterPasswordUpdateResponse updateMasterPassword( @NotNull MasterPasswordUpdate body);

    /**
     *
     * @param body                 The request payload of an outbound proxy server that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /is/outboundproxy")
    void updateOutboundProxy( @NotNull OutboundProxySettings body);

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     *
     * @param body                 The request payload of proxybypass that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /is/proxyBypass")
    void updateProxyBypass( @NotNull ProxyBypass body);

    /**
     * <p>
     * The method updates the details of a specified rule in API Gateway. The API request body must contain the payload for the updated rule.
     *
     * @param ruleId               The path parameter specifies the id of the rule that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an rule that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /rule/{ruleId}")
    Rule updateRule(@Param("ruleId") @NotNull String ruleId,  @NotNull Rule body);

    /**
     * <p>
     * Updates an already existing truststore in API Gateway.
     *
     * @param trustStoreName       The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway. (required)
     * @param keyStoreType         The certificate file format of the truststore. (required)
     * @param keyStoreProvider     The provider that is used for the truststore type. (required)
     * @param keyStorePassword     The truststore password that is defined at the time of truststore creation using a keystore utility. (required)
     * @param uploadFileName       The name of the truststore file that will be used to save the truststore internally in API Gateway. (required)
     * @param fileContent          The contents of the truststore file. (required)
     * @param keyStoreDescription  The description for the truststore. (optional)
     * @param isPwdBase64Encoded   Specifies whether password is base 64 encoded. (optional)
     */
    @RequestLine("POST /is/truststore/{trustStoreName}")
    TrustStore updateTruststore(@Param("trustStoreName") @NotNull String trustStoreName,  @NotNull String keyStoreType,  @NotNull String keyStoreProvider,  @NotNull String keyStorePassword,  @NotNull String uploadFileName,  @NotNull File fileContent,  @Nullable String keyStoreDescription,  @Nullable String isPwdBase64Encoded);

    /**
     * <p>
     * Updates an existing URL Alias in API Gateway.
     *
     * @param body                 The request body for updating an existing URL Alias in API Gateway. (required)
     */
    @RequestLine("PUT /urlaliases")
    URLAliasSettings updateURLALias( @NotNull URLAliasSettings body);

    /**
     * <p>
     * The method updates the details of a specified webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be updated.
     *
     * @param id                   The path parameter specifies the id of an webhook whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of webhook that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /webhooks/{id}")
    Webhook updateWebhook(@Param("id") @NotNull String id,  @NotNull Webhook body);

    /**
     * <p>
     * This REST service is used to update the Webservice endpoint
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/webServiceEndpoints")
    WebserviceEndpointAlias updateWebserviceEndpoint( @NotNull WebserviceEndpointAlias body);

}

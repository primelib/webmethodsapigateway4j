package io.github.primelib.webmethodsapigateway4j.api;

import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;

import io.github.primelib.webmethodsapigateway4j.model.AccountLockSettings;
import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.AnalyticsDataStoreDestination;
import io.github.primelib.webmethodsapigateway4j.model.AuditLogDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSCommunicationDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSSNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.CallbackProcessorSettings;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerResponse;
import io.github.primelib.webmethodsapigateway4j.model.ClusterInfo;
import io.github.primelib.webmethodsapigateway4j.model.DenyByIPForFailedAuthConfig;
import io.github.primelib.webmethodsapigateway4j.model.Destination;
import io.github.primelib.webmethodsapigateway4j.model.ElasticsearchDestination;
import io.github.primelib.webmethodsapigateway4j.model.EmailDestination;
import io.github.primelib.webmethodsapigateway4j.model.ErrorProcessing;
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
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxyGetResponse;
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

import java.util.function.Consumer;

import io.github.primelib.webmethodsapigateway4j.spec.ActivateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ApiTransactionsArchiveBasedOnDurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ChangeOwnerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ChangeTeamOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeactivateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteURLAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DownloadAPITransactionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DownloadLogsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.FetchJNDITemplatesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPICallbackProcessorSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIPortalAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIPortalMetadataOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAccountLockSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllJMSConnectionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllJMSTriggersOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllWebhooksOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllWebserviceEndpointsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAnalyticsDataStoreAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAuditLogAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCacheConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCentraSiteCommunicationAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCentraSiteSNMPAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetClusterSettingOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCustomContentTypesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetDatabaseAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetDenyByIPForFailedAuthConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetDigitalEventsAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetElasticsearchAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetEmailAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetErrorProcessingDetailsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetGatewayAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetKerberosSettingOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetKeyStoreTrustoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetKeystoresOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetLdapConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetLicenseDetailsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetLoadBalancersOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetLogConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetMappingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetMasterPasswordPropertiesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetMigrationStatusOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetOutboundProxiesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPasswordExpirySettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPasswordRestrictionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetProxyBypassOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPublishedPackagesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetQuiesceModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetSNMPAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetSSOConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTruststoresOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetWhiteListedIPsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListAllArchivesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListAllJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListAllPendingJobsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.MigrationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PurgeAPITransactionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.QuiescemodeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ResetMasterPasswordOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.RestoreDataOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveAPICallbackProcessorSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveAPIPortalAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveAccountLockSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveAnalyticsDataStoreAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveAuditLogAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveCentraSiteCommunicationAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveCentraSiteSNMPAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveCustomContentTypesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveDatabaseAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveDenyByIPForFailedAuthConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveDigitalEventsAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveElasticsearchAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveEmailAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveErrorProcessingDetailsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveGatewayAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveKeystoreTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveLdapConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveLoadBalancersOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveLogConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SavePasswordExpirySettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SavePasswordRestrictionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveProxyBypassOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSNMPAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSSOConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveWhitelistedIPsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ShutdownOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.TestJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.TrackJobStatusOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateCacheConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateClusterOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateExpiryIntervalOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateKerberosOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateKeystoreAliasesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateLicenseDetailsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateMasterPasswordOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateProxyBypassOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateWebserviceEndpointOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIGatewaySpecApi {
    private final APIGatewayApi api;

    public APIGatewaySpecApi(APIGatewayApi api) {
        this.api = api;
    }

    /**
     * <p>
     * This REST request is used to activate a rule and this request doesn't require any request body.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Rule activateRule(Consumer<ActivateRuleOperationSpec> spec) {
        ActivateRuleOperationSpec r = new ActivateRuleOperationSpec(spec);
        return api.activateRule(r.ruleId());
    }

    /**
     * <p>
     * This method is used to archive the runtime events and metrics. Data to be archived is filtered based on the input parameters. This method returns the job id as the response which is used to know the job status.
     *  Use GET /apitransactions/jobs/{jobId} method to know the status and file name, use POST /apitransactions/archives/{fileName} method to restore. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void apiTransactionsArchiveBasedOnDuration(Consumer<ApiTransactionsArchiveBasedOnDurationOperationSpec> spec) {
        ApiTransactionsArchiveBasedOnDurationOperationSpec r = new ApiTransactionsArchiveBasedOnDurationOperationSpec(spec);
        api.apiTransactionsArchiveBasedOnDuration(r.from(), r.until(), r.eventType(), r.olderThan());
    }

    /**
     * <p>
     * This resource is used to change the owner of APIGateway asset
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ChangeOwnerResponse changeOwner(Consumer<ChangeOwnerOperationSpec> spec) {
        ChangeOwnerOperationSpec r = new ChangeOwnerOperationSpec(spec);
        return api.changeOwner(r.body());
    }

    /**
     * <p>
     * This resource is used to change the team of APIGateway asset
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ChangeOwnerResponse changeTeam(Consumer<ChangeTeamOperationSpec> spec) {
        ChangeTeamOperationSpec r = new ChangeTeamOperationSpec(spec);
        return api.changeTeam(r.body());
    }

    /**
     * <p>
     * This method allows you to create the API Portal configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PortalGateway createAPIPortalConfiguration(Consumer<CreateAPIPortalConfigurationOperationSpec> spec) {
        CreateAPIPortalConfigurationOperationSpec r = new CreateAPIPortalConfigurationOperationSpec(spec);
        return api.createAPIPortalConfiguration(r.body());
    }

    /**
     * <p>
     * Use this method to create an alias. There are different types of alias like Endpoint, Simple etc. Refer to the Alias schema for different type of alias that you can create. If you want to create an alias for a specific type (say Endpoint alias), refer to the corresponding schema (EndpointAlias)
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Alias createAlias(Consumer<CreateAliasOperationSpec> spec) {
        CreateAliasOperationSpec r = new CreateAliasOperationSpec(spec);
        return api.createAlias(r.body());
    }

    /**
     * <p>
     * The method creates a JMS connection in API Gateway. The API request body must contain the payload for the JMS connection
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JMSConnectionAlias createJMSConnection(Consumer<CreateJMSConnectionOperationSpec> spec) {
        CreateJMSConnectionOperationSpec r = new CreateJMSConnectionOperationSpec(spec);
        return api.createJMSConnection(r.body());
    }

    /**
     * <p>
     * The method creates a JNDI configuration in API Gateway. The API request body must contain the payload for the JNDI configuration
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JNDIProviderAlias createJNDI(Consumer<CreateJNDIOperationSpec> spec) {
        CreateJNDIOperationSpec r = new CreateJNDIOperationSpec(spec);
        return api.createJNDI(r.body());
    }

    /**
     * <p>
     * Creates a keystore in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public KeyStore createKeystore(Consumer<CreateKeystoreOperationSpec> spec) {
        CreateKeystoreOperationSpec r = new CreateKeystoreOperationSpec(spec);
        return api.createKeystore(r.keyStoreName(), r.keyStoreType(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.pkAliasesList(), r.pkPasswordsList(), r.nullPKpasswds(), r.isPwdBase64Encoded());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void createOutboundProxy(Consumer<CreateOutboundProxyOperationSpec> spec) {
        CreateOutboundProxyOperationSpec r = new CreateOutboundProxyOperationSpec(spec);
        api.createOutboundProxy(r.body());
    }

    /**
     * <p>
     * The method creates a conditional rule in API Gateway. The API request body must contain the payload for the rule.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Rule createRule(Consumer<CreateRuleOperationSpec> spec) {
        CreateRuleOperationSpec r = new CreateRuleOperationSpec(spec);
        return api.createRule(r.body());
    }

    /**
     * <p>
     * Creates a truststore in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TrustStore createTruststore(Consumer<CreateTruststoreOperationSpec> spec) {
        CreateTruststoreOperationSpec r = new CreateTruststoreOperationSpec(spec);
        return api.createTruststore(r.keyStoreName(), r.keyStoreType(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.isPwdBase64Encoded());
    }

    /**
     * <p>
     * Creates a new URL Alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public URLAliasSettings createURLALias(Consumer<CreateURLALiasOperationSpec> spec) {
        CreateURLALiasOperationSpec r = new CreateURLALiasOperationSpec(spec);
        return api.createURLALias(r.body());
    }

    /**
     * <p>
     * The method creates a webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be saved.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Webhook createWebhook(Consumer<CreateWebhookOperationSpec> spec) {
        CreateWebhookOperationSpec r = new CreateWebhookOperationSpec(spec);
        return api.createWebhook(r.body());
    }

    /**
     * <p>
     * The method creates a Webservice endpoint in API Gateway. The API request body must contain the payload for the Webservice endpoint
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WebserviceEndpointAlias createWebserviceEndpoint(Consumer<CreateWebserviceEndpointOperationSpec> spec) {
        CreateWebserviceEndpointOperationSpec r = new CreateWebserviceEndpointOperationSpec(spec);
        return api.createWebserviceEndpoint(r.body());
    }

    /**
     * <p>
     * This REST request is used to deactivate a rule and it doesn't require any request body.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Rule deactivateRule(Consumer<DeactivateRuleOperationSpec> spec) {
        DeactivateRuleOperationSpec r = new DeactivateRuleOperationSpec(spec);
        return api.deactivateRule(r.ruleId());
    }

    /**
     * <p>
     * This API allows you to delete an API Portal configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteAPIPortalConfiguration(Consumer<DeleteAPIPortalConfigurationOperationSpec> spec) {
        DeleteAPIPortalConfigurationOperationSpec r = new DeleteAPIPortalConfigurationOperationSpec(spec);
        api.deleteAPIPortalConfiguration(r.portalGatewayId());
    }

    /**
     * <p>
     * The method deletes an alias from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteAlias(Consumer<DeleteAliasOperationSpec> spec) {
        DeleteAliasOperationSpec r = new DeleteAliasOperationSpec(spec);
        api.deleteAlias(r.aliasId());
    }

    /**
     * <p>
     * This delete request will delete the JMS connection based on the JMS connection id which is specified in path
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteJMSConnection(Consumer<DeleteJMSConnectionOperationSpec> spec) {
        DeleteJMSConnectionOperationSpec r = new DeleteJMSConnectionOperationSpec(spec);
        api.deleteJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * This delete request will delete the JNDI configuration based on the JNDI id which is specified in path
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteJNDI(Consumer<DeleteJNDIOperationSpec> spec) {
        DeleteJNDIOperationSpec r = new DeleteJNDIOperationSpec(spec);
        api.deleteJNDI(r.jndiId());
    }

    /**
     * <p>
     * Deletes keystore matching the specified name in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<KeyStore> deleteKeystore(Consumer<DeleteKeystoreOperationSpec> spec) {
        DeleteKeystoreOperationSpec r = new DeleteKeystoreOperationSpec(spec);
        return api.deleteKeystore(r.keyStoreName());
    }

    /**
     * <p>
     * Deletes the specified outbound proxy server alias from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteOutboundProxy(Consumer<DeleteOutboundProxyOperationSpec> spec) {
        DeleteOutboundProxyOperationSpec r = new DeleteOutboundProxyOperationSpec(spec);
        api.deleteOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * The method deletes a rule from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteRule(Consumer<DeleteRuleOperationSpec> spec) {
        DeleteRuleOperationSpec r = new DeleteRuleOperationSpec(spec);
        api.deleteRule(r.ruleId());
    }

    /**
     * <p>
     * Deletes an already existing truststore matching the name in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteTruststore(Consumer<DeleteTruststoreOperationSpec> spec) {
        DeleteTruststoreOperationSpec r = new DeleteTruststoreOperationSpec(spec);
        api.deleteTruststore(r.trustStoreName());
    }

    /**
     * <p>
     * The method deletes an URL alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteURLAlias(Consumer<DeleteURLAliasOperationSpec> spec) {
        DeleteURLAliasOperationSpec r = new DeleteURLAliasOperationSpec(spec);
        api.deleteURLAlias(r.alias());
    }

    /**
     * <p>
     * The method deletes a webhook resource from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWebhook(Consumer<DeleteWebhookOperationSpec> spec) {
        DeleteWebhookOperationSpec r = new DeleteWebhookOperationSpec(spec);
        api.deleteWebhook(r.id());
    }

    /**
     * <p>
     * This delete request will delete the Webservice endpoint based on the Webservice endpoint id which is specified in path
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWebserviceEndpoint(Consumer<DeleteWebserviceEndpointOperationSpec> spec) {
        DeleteWebserviceEndpointOperationSpec r = new DeleteWebserviceEndpointOperationSpec(spec);
        api.deleteWebserviceEndpoint(r.webserviceEndpointId());
    }

    /**
     * <p>
     * The method disables the specified JMS connections in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void disableJMSConnection(Consumer<DisableJMSConnectionOperationSpec> spec) {
        DisableJMSConnectionOperationSpec r = new DisableJMSConnectionOperationSpec(spec);
        api.disableJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method disables the specified JMS trigger in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void disableJMSTrigger(Consumer<DisableJMSTriggerOperationSpec> spec) {
        DisableJMSTriggerOperationSpec r = new DisableJMSTriggerOperationSpec(spec);
        api.disableJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * Disables an already existing outbound proxy server alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void disableOutboundProxy(Consumer<DisableOutboundProxyOperationSpec> spec) {
        DisableOutboundProxyOperationSpec r = new DisableOutboundProxyOperationSpec(spec);
        api.disableOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * The GET method is used to download the api transactions of the specified type. Data to be downloaded is filtered based on the input parameters. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void downloadAPITransaction(Consumer<DownloadAPITransactionOperationSpec> spec) {
        DownloadAPITransactionOperationSpec r = new DownloadAPITransactionOperationSpec(spec);
        api.downloadAPITransaction(r.startDate(), r.endDate(), r.eventType(), r.duration());
    }

    /**
     * <p>
     * This resource is used to download logs from different components used by APIGateway, server configurations and thread dumps.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void downloadLogs(Consumer<DownloadLogsOperationSpec> spec) {
        DownloadLogsOperationSpec r = new DownloadLogsOperationSpec(spec);
        api.downloadLogs();
    }

    /**
     * <p>
     * The method enables the specified JMS connections in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void enableJMSConnection(Consumer<EnableJMSConnectionOperationSpec> spec) {
        EnableJMSConnectionOperationSpec r = new EnableJMSConnectionOperationSpec(spec);
        api.enableJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method enables the specified JMS trigger in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void enableJMSTrigger(Consumer<EnableJMSTriggerOperationSpec> spec) {
        EnableJMSTriggerOperationSpec r = new EnableJMSTriggerOperationSpec(spec);
        api.enableJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * Enables an already existing outbound proxy server alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void enableOutboundProxy(Consumer<EnableOutboundProxyOperationSpec> spec) {
        EnableOutboundProxyOperationSpec r = new EnableOutboundProxyOperationSpec(spec);
        api.enableOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * The method retrieves list of all JNDI templates in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void fetchJNDITemplates(Consumer<FetchJNDITemplatesOperationSpec> spec) {
        FetchJNDITemplatesOperationSpec r = new FetchJNDITemplatesOperationSpec(spec);
        api.fetchJNDITemplates();
    }

    /**
     * <p>
     * This method retrieves the API callback processor settings from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CallbackProcessorSettings getAPICallbackProcessorSettings(Consumer<GetAPICallbackProcessorSettingsOperationSpec> spec) {
        GetAPICallbackProcessorSettingsOperationSpec r = new GetAPICallbackProcessorSettingsOperationSpec(spec);
        return api.getAPICallbackProcessorSettings();
    }

    /**
     * <p>
     * The method retrieves the details of the API Portal destination configurations. API Gateway can publish events and performance metrics data. By default, error events, lifecycle events, policy violation event, and performance data are published to API Portal.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination getAPIPortalAsDestination(Consumer<GetAPIPortalAsDestinationOperationSpec> spec) {
        GetAPIPortalAsDestinationOperationSpec r = new GetAPIPortalAsDestinationOperationSpec(spec);
        return api.getAPIPortalAsDestination();
    }

    /**
     * <p>
     * This API allows you to retrieve an API Portal configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PortalGateway getAPIPortalConfiguration(Consumer<GetAPIPortalConfigurationOperationSpec> spec) {
        GetAPIPortalConfigurationOperationSpec r = new GetAPIPortalConfigurationOperationSpec(spec);
        return api.getAPIPortalConfiguration(r.portalGatewayId());
    }

    /**
     * <p>
     * This API allows you to retrieve the details about communities in API Portal. An API can be published from API Gateway to any of the communities available in API Portal
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PortalGatewayCommunitiesData getAPIPortalMetadata(Consumer<GetAPIPortalMetadataOperationSpec> spec) {
        GetAPIPortalMetadataOperationSpec r = new GetAPIPortalMetadataOperationSpec(spec);
        return api.getAPIPortalMetadata(r.portalGatewayId(), r.apiId());
    }

    /**
     * <p>
     * Retrieves the account lock settings configured in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AccountLockSettings getAccountLockSettings(Consumer<GetAccountLockSettingsOperationSpec> spec) {
        GetAccountLockSettingsOperationSpec r = new GetAccountLockSettingsOperationSpec(spec);
        return api.getAccountLockSettings();
    }

    /**
     * <p>
     * The method retrieves the details of an alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Alias getAlias(Consumer<GetAliasOperationSpec> spec) {
        GetAliasOperationSpec r = new GetAliasOperationSpec(spec);
        return api.getAlias(r.aliasId());
    }

    /**
     * <p>
     * This API allows you to retrieve API Portal configurations available in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PortalGateway getAllAPIPortalConfiguration(Consumer<GetAllAPIPortalConfigurationOperationSpec> spec) {
        GetAllAPIPortalConfigurationOperationSpec r = new GetAllAPIPortalConfigurationOperationSpec(spec);
        return api.getAllAPIPortalConfiguration();
    }

    /**
     * <p>
     * The method retrieves a list of all aliases in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Alias> getAllAlias(Consumer<GetAllAliasOperationSpec> spec) {
        GetAllAliasOperationSpec r = new GetAllAliasOperationSpec(spec);
        return api.getAllAlias();
    }

    /**
     * <p>
     * The method retrieves list of all the JMS connections in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAllJMSConnections(Consumer<GetAllJMSConnectionsOperationSpec> spec) {
        GetAllJMSConnectionsOperationSpec r = new GetAllJMSConnectionsOperationSpec(spec);
        api.getAllJMSConnections();
    }

    /**
     * <p>
     * The method retrieves list of all JMS triggers in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAllJMSTriggers(Consumer<GetAllJMSTriggersOperationSpec> spec) {
        GetAllJMSTriggersOperationSpec r = new GetAllJMSTriggersOperationSpec(spec);
        api.getAllJMSTriggers();
    }

    /**
     * <p>
     * The method retrieves list of all rules in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Rule> getAllRule(Consumer<GetAllRuleOperationSpec> spec) {
        GetAllRuleOperationSpec r = new GetAllRuleOperationSpec(spec);
        return api.getAllRule(r.ruleType(), r.active());
    }

    /**
     * <p>
     * The method retrieves the list of all webhooks in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Webhook> getAllWebhooks(Consumer<GetAllWebhooksOperationSpec> spec) {
        GetAllWebhooksOperationSpec r = new GetAllWebhooksOperationSpec(spec);
        return api.getAllWebhooks();
    }

    /**
     * <p>
     * The method retrieves list of all Webservice endpoints in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAllWebserviceEndpoints(Consumer<GetAllWebserviceEndpointsOperationSpec> spec) {
        GetAllWebserviceEndpointsOperationSpec r = new GetAllWebserviceEndpointsOperationSpec(spec);
        api.getAllWebserviceEndpoints();
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AnalyticsDataStoreDestination getAnalyticsDataStoreAsDestination(Consumer<GetAnalyticsDataStoreAsDestinationOperationSpec> spec) {
        GetAnalyticsDataStoreAsDestinationOperationSpec r = new GetAnalyticsDataStoreAsDestinationOperationSpec(spec);
        return api.getAnalyticsDataStoreAsDestination();
    }

    /**
     * <p>
     * The method retrieves the details of the Transaction Logger destination in API Gateway. Transaction Logger captures the API runtime invocations performed in API Gateway. The transaction logger data is written to a file or a database based on the configurations. Transactions events are written to the transaction logger only when the Transaction Logger is selected as a destination in Log Invocation Policy.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AuditLogDestination getAuditLogAsDestination(Consumer<GetAuditLogAsDestinationOperationSpec> spec) {
        GetAuditLogAsDestinationOperationSpec r = new GetAuditLogAsDestinationOperationSpec(spec);
        return api.getAuditLogAsDestination();
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public GatewayCacheConfig getCacheConfig(Consumer<GetCacheConfigOperationSpec> spec) {
        GetCacheConfigOperationSpec r = new GetCacheConfigOperationSpec(spec);
        return api.getCacheConfig();
    }

    /**
     * <p>
     * The method retrieves the communication details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CSCommunicationDestination getCentraSiteCommunicationAsDestination(Consumer<GetCentraSiteCommunicationAsDestinationOperationSpec> spec) {
        GetCentraSiteCommunicationAsDestinationOperationSpec r = new GetCentraSiteCommunicationAsDestinationOperationSpec(spec);
        return api.getCentraSiteCommunicationAsDestination();
    }

    /**
     * <p>
     * The method retrieves the SNMP details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CSSNMPDestination getCentraSiteSNMPAsDestination(Consumer<GetCentraSiteSNMPAsDestinationOperationSpec> spec) {
        GetCentraSiteSNMPAsDestinationOperationSpec r = new GetCentraSiteSNMPAsDestinationOperationSpec(spec);
        return api.getCentraSiteSNMPAsDestination();
    }

    /**
     * <p>
     * Retrieves the configured cluster settings from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ClusterInfo getClusterSetting(Consumer<GetClusterSettingOperationSpec> spec) {
        GetClusterSettingOperationSpec r = new GetClusterSettingOperationSpec(spec);
        return api.getClusterSetting();
    }

    /**
     * <p>
     * This REST method is used to get the configured custom content types in API Gateway. Custom content types can be defined for base types XML,JSON and Text.These Custom types can be then used for payload processing in policies like Content based routing,Identify and access and Conditional error processing
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object getCustomContentTypes(Consumer<GetCustomContentTypesOperationSpec> spec) {
        GetCustomContentTypesOperationSpec r = new GetCustomContentTypesOperationSpec(spec);
        return api.getCustomContentTypes();
    }

    /**
     * <p>
     * The method retrieves the details of the Database destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Database destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination getDatabaseAsDestination(Consumer<GetDatabaseAsDestinationOperationSpec> spec) {
        GetDatabaseAsDestinationOperationSpec r = new GetDatabaseAsDestinationOperationSpec(spec);
        return api.getDatabaseAsDestination();
    }

    /**
     * <p>
     * Retrieves the configuration of gloabal IP access setting for authentication based restrictions in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DenyByIPForFailedAuthConfig getDenyByIPForFailedAuthConfig(Consumer<GetDenyByIPForFailedAuthConfigOperationSpec> spec) {
        GetDenyByIPForFailedAuthConfigOperationSpec r = new GetDenyByIPForFailedAuthConfigOperationSpec(spec);
        return api.getDenyByIPForFailedAuthConfig();
    }

    /**
     * <p>
     * The method retrieves the details of the Digital Events destination in API Gateway. Digital Event Services (DES) enables API Gateway to communicate by exchanging digital events. API Gateway can publish runtime events(example: policy violation,log invocation, error events etc), design time events (example: audit log events) and metrics to the configured DES destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination getDigitalEventsAsDestination(Consumer<GetDigitalEventsAsDestinationOperationSpec> spec) {
        GetDigitalEventsAsDestinationOperationSpec r = new GetDigitalEventsAsDestinationOperationSpec(spec);
        return api.getDigitalEventsAsDestination();
    }

    /**
     * <p>
     * The method retrieves the details of the Elasticsearch destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Elasticsearch destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ElasticsearchDestination getElasticsearchAsDestination(Consumer<GetElasticsearchAsDestinationOperationSpec> spec) {
        GetElasticsearchAsDestinationOperationSpec r = new GetElasticsearchAsDestinationOperationSpec(spec);
        return api.getElasticsearchAsDestination();
    }

    /**
     * <p>
     * The method retrieves the details of the Email destination in API Gateway. API Gateway can send alerts to the email ID specified either in the Log Invocation, Monitor Service Performance, Monitor Service Level Agreement, (or) Throttling Traffic Optimization policies through the configured Email destination.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EmailDestination getEmailAsDestination(Consumer<GetEmailAsDestinationOperationSpec> spec) {
        GetEmailAsDestinationOperationSpec r = new GetEmailAsDestinationOperationSpec(spec);
        return api.getEmailAsDestination();
    }

    /**
     * <p>
     * This REST method is used to get the configured error template and the value of the property - sendNativeProviderFault,which enables the server to forward the native error as it is.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ErrorProcessing getErrorProcessingDetails(Consumer<GetErrorProcessingDetailsOperationSpec> spec) {
        GetErrorProcessingDetailsOperationSpec r = new GetErrorProcessingDetailsOperationSpec(spec);
        return api.getErrorProcessingDetails();
    }

    /**
     * <p>
     * The method retrieves the details of the API Gateway destination. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics data. By default, error events, lifecycle events, policy violation event, audit logs and performance data are published to API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination getGatewayAsDestination(Consumer<GetGatewayAsDestinationOperationSpec> spec) {
        GetGatewayAsDestinationOperationSpec r = new GetGatewayAsDestinationOperationSpec(spec);
        return api.getGatewayAsDestination();
    }

    /**
     * <p>
     * The method retrieves the specified JMS connection in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JMSConnectionAlias getJMSConnection(Consumer<GetJMSConnectionOperationSpec> spec) {
        GetJMSConnectionOperationSpec r = new GetJMSConnectionOperationSpec(spec);
        return api.getJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method retrieves the specified JMS trigger in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JMSTrigger getJMSTrigger(Consumer<GetJMSTriggerOperationSpec> spec) {
        GetJMSTriggerOperationSpec r = new GetJMSTriggerOperationSpec(spec);
        return api.getJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * Retrieves the configured Kerberos settings from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public KerberosSettings getKerberosSetting(Consumer<GetKerberosSettingOperationSpec> spec) {
        GetKerberosSettingOperationSpec r = new GetKerberosSettingOperationSpec(spec);
        return api.getKerberosSetting();
    }

    /**
     * <p>
     * The method retrieves the details of the default keystore, truststore and alias settings in API Gateway. You might want to configure API Gateway to refer to a default keystore, truststore, or both, before deploying any SOAP message flows that require signature, encryption, X.509 authentication, and so on, as configured in the Inbound Authentication - Message policy. The default keystore and truststore are that you want API Gateway to use for the incoming secured messages
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public KeystoreTruststore getKeyStoreTrustore(Consumer<GetKeyStoreTrustoreOperationSpec> spec) {
        GetKeyStoreTrustoreOperationSpec r = new GetKeyStoreTrustoreOperationSpec(spec);
        return api.getKeyStoreTrustore();
    }

    /**
     * <p>
     * The method gets keystore matching the name in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<KeyStore> getKeystore(Consumer<GetKeystoreOperationSpec> spec) {
        GetKeystoreOperationSpec r = new GetKeystoreOperationSpec(spec);
        return api.getKeystore(r.keyStoreName());
    }

    /**
     * <p>
     * The method gets all keystores available in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<KeyStore> getKeystores(Consumer<GetKeystoresOperationSpec> spec) {
        GetKeystoresOperationSpec r = new GetKeystoresOperationSpec(spec);
        return api.getKeystores();
    }

    /**
     * <p>
     * Retrieves the LDAP configuration settings configured in the API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public InputLdapConfiguration getLdapConfig(Consumer<GetLdapConfigOperationSpec> spec) {
        GetLdapConfigOperationSpec r = new GetLdapConfigOperationSpec(spec);
        return api.getLdapConfig();
    }

    /**
     * <p>
     * Retrieves the license details from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LicenseDetail getLicenseDetails(Consumer<GetLicenseDetailsOperationSpec> spec) {
        GetLicenseDetailsOperationSpec r = new GetLicenseDetailsOperationSpec(spec);
        return api.getLicenseDetails();
    }

    /**
     * <p>
     * The method retrieves the details of the Load Balancer configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LoadBalancer getLoadBalancers(Consumer<GetLoadBalancersOperationSpec> spec) {
        GetLoadBalancersOperationSpec r = new GetLoadBalancersOperationSpec(spec);
        return api.getLoadBalancers();
    }

    /**
     * <p>
     * APIGateway has log files from different components.This method is used to retrieve the log settings of various components used by APIGateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LogConfiguration getLogConfig(Consumer<GetLogConfigOperationSpec> spec) {
        GetLogConfigOperationSpec r = new GetLogConfigOperationSpec(spec);
        return api.getLogConfig();
    }

    /**
     * <p>
     * Returns the list of runtime event types. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs. You can use these eventType to scope the archive/purge operation.
     * The user should be part of API-Gateway-Administrators group or else should have 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getMappings(Consumer<GetMappingsOperationSpec> spec) {
        GetMappingsOperationSpec r = new GetMappingsOperationSpec(spec);
        api.getMappings();
    }

    /**
     * <p>
     * This retrieves the master password properties in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public MasterPasswordProperties getMasterPasswordProperties(Consumer<GetMasterPasswordPropertiesOperationSpec> spec) {
        GetMasterPasswordPropertiesOperationSpec r = new GetMasterPasswordPropertiesOperationSpec(spec);
        return api.getMasterPasswordProperties();
    }

    /**
     * <p>
     * RRetrieves the current status of the migration action which is invoked in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getMigrationStatus(Consumer<GetMigrationStatusOperationSpec> spec) {
        GetMigrationStatusOperationSpec r = new GetMigrationStatusOperationSpec(spec);
        api.getMigrationStatus(r.action());
    }

    /**
     * <p>
     * Retrieves the list of all available outbound proxy server aliases in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public OutboundProxyGetResponse getOutboundProxies(Consumer<GetOutboundProxiesOperationSpec> spec) {
        GetOutboundProxiesOperationSpec r = new GetOutboundProxiesOperationSpec(spec);
        return api.getOutboundProxies();
    }

    /**
     * <p>
     * Retrieves the password expiry settings configured in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PasswordExpirySettings getPasswordExpirySettings(Consumer<GetPasswordExpirySettingsOperationSpec> spec) {
        GetPasswordExpirySettingsOperationSpec r = new GetPasswordExpirySettingsOperationSpec(spec);
        return api.getPasswordExpirySettings();
    }

    /**
     * <p>
     * Retrieves the password restrictions settings configured in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PasswordRestrictions getPasswordRestrictions(Consumer<GetPasswordRestrictionsOperationSpec> spec) {
        GetPasswordRestrictionsOperationSpec r = new GetPasswordRestrictionsOperationSpec(spec);
        return api.getPasswordRestrictions();
    }

    /**
     * <p>
     * The method retrieves a list of all hostlists for which outbound proxy servers are skipped. Note: proxyBypass Id is always proxyBypass
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProxyBypass getProxyBypass(Consumer<GetProxyBypassOperationSpec> spec) {
        GetProxyBypassOperationSpec r = new GetProxyBypassOperationSpec(spec);
        return api.getProxyBypass();
    }

    /**
     * <p>
     * This API allows you to retrieve the details of the published packages that the API is part of
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Set<Object> getPublishedPackages(Consumer<GetPublishedPackagesOperationSpec> spec) {
        GetPublishedPackagesOperationSpec r = new GetPublishedPackagesOperationSpec(spec);
        return api.getPublishedPackages(r.portalGatewayId(), r.apiId());
    }

    /**
     * <p>
     * Returns the quiesce mode setting in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public QuiesceMode getQuiesceMode(Consumer<GetQuiesceModeOperationSpec> spec) {
        GetQuiesceModeOperationSpec r = new GetQuiesceModeOperationSpec(spec);
        return api.getQuiesceMode();
    }

    /**
     * <p>
     * The method retrieves the details of a rule in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Rule getRule(Consumer<GetRuleOperationSpec> spec) {
        GetRuleOperationSpec r = new GetRuleOperationSpec(spec);
        return api.getRule(r.ruleId());
    }

    /**
     * <p>
     * The method retrieves the details of the SNMP destination in API Gateway. API Gateway can publish events and performance metrics data to the configured 3rd party SNMP server.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SNMPDestination getSNMPAsDestination(Consumer<GetSNMPAsDestinationOperationSpec> spec) {
        GetSNMPAsDestinationOperationSpec r = new GetSNMPAsDestinationOperationSpec(spec);
        return api.getSNMPAsDestination();
    }

    /**
     * <p>
     * Retrieves the SSO configuration in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SSOConfiguration getSSOConfiguration(Consumer<GetSSOConfigurationOperationSpec> spec) {
        GetSSOConfigurationOperationSpec r = new GetSSOConfigurationOperationSpec(spec);
        return api.getSSOConfiguration();
    }

    /**
     * <p>
     * This method retrieves the list of extended settings and watt properties from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ExtendedSettingsOutput getSettings(Consumer<GetSettingsOperationSpec> spec) {
        GetSettingsOperationSpec r = new GetSettingsOperationSpec(spec);
        return api.getSettings();
    }

    /**
     * <p>
     * Retrieves an existing truststore matching the given name from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<TrustStore> getTruststore(Consumer<GetTruststoreOperationSpec> spec) {
        GetTruststoreOperationSpec r = new GetTruststoreOperationSpec(spec);
        return api.getTruststore(r.trustStoreName());
    }

    /**
     * <p>
     * Retrieves all available truststores from API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<TrustStore> getTruststores(Consumer<GetTruststoresOperationSpec> spec) {
        GetTruststoresOperationSpec r = new GetTruststoresOperationSpec(spec);
        return api.getTruststores();
    }

    /**
     * <p>
     * Retrieves all URL Aliases or a URL Alias with a particular ID in API Gateway (if the query parameter alias is provided).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public URLAliasesGetResponse getURLALias(Consumer<GetURLALiasOperationSpec> spec) {
        GetURLALiasOperationSpec r = new GetURLALiasOperationSpec(spec);
        return api.getURLALias(r.alias());
    }

    /**
     * <p>
     * The method retrieves the details of a webhook in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Webhook getWebhook(Consumer<GetWebhookOperationSpec> spec) {
        GetWebhookOperationSpec r = new GetWebhookOperationSpec(spec);
        return api.getWebhook(r.id());
    }

    /**
     * <p>
     * The method retrieves the specified Webservice endpoint in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WebserviceEndpointAlias getWebserviceEndpoint(Consumer<GetWebserviceEndpointOperationSpec> spec) {
        GetWebserviceEndpointOperationSpec r = new GetWebserviceEndpointOperationSpec(spec);
        return api.getWebserviceEndpoint(r.webserviceEndpointId());
    }

    /**
     * <p>
     * The method retrieves the details of the whitelisting IPs configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WhiteListedIPs getWhiteListedIPs(Consumer<GetWhiteListedIPsOperationSpec> spec) {
        GetWhiteListedIPsOperationSpec r = new GetWhiteListedIPsOperationSpec(spec);
        return api.getWhiteListedIPs();
    }

    /**
     * <p>
     * This GET method is used to fetch the details of existing archive files and response of this method is the list of archive file names. Select a filename from the list of archive file names returned by this method and use the POST method /apitransactions/archives/{fileName} to restore.The user must either be a part of API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void listAllArchives(Consumer<ListAllArchivesOperationSpec> spec) {
        ListAllArchivesOperationSpec r = new ListAllArchivesOperationSpec(spec);
        api.listAllArchives(r.filter());
    }

    /**
     * <p>
     * The method retrieves list of all JNDI configurations in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void listAllJNDI(Consumer<ListAllJNDIOperationSpec> spec) {
        ListAllJNDIOperationSpec r = new ListAllJNDIOperationSpec(spec);
        api.listAllJNDI();
    }

    /**
     * <p>
     * This method returns a list of pending jobs. Every time you initiate archive, restore, or purge operation you get a job id as a response. You can use the specific job id to query the status of the initiated operation. The user must either be part of the API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void listAllPendingJobs(Consumer<ListAllPendingJobsOperationSpec> spec) {
        ListAllPendingJobsOperationSpec r = new ListAllPendingJobsOperationSpec(spec);
        api.listAllPendingJobs(r.action(), r.status());
    }

    /**
     * <p>
     * The method retrieves the specified JNDI configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JNDIProviderAlias listJNDI(Consumer<ListJNDIOperationSpec> spec) {
        ListJNDIOperationSpec r = new ListJNDIOperationSpec(spec);
        return api.listJNDI(r.jndiId());
    }

    /**
     * <p>
     * Triggers a migration action and immediately returns with 202 status code. Clean action clears the data from the API Gateway data store, reindex action reindex the data from the source Elasticsearch to API Gateway data store and transform action transforms the reindexed assets in the API Gateway data store to be compatible with the current API Gateway version. The clean action should be invoked on target API Gateway server prior to invoking reindex API for core indices. The current status of the action can be retrieved using /migration/status API. A webhook event with the migration status also would be sent to the subscribed webhook clients
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void migration(Consumer<MigrationOperationSpec> spec) {
        MigrationOperationSpec r = new MigrationOperationSpec(spec);
        api.migration(r.body());
    }

    /**
     * <p>
     * The DELETE method is used to purge the api transactions of the specified type. Data to be purged is filtered based on the input parameters. This method returns a job id as response and this job id is used to track the job status. See /apitransactions/jobs/{jobId} for more details. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void purgeAPITransactions(Consumer<PurgeAPITransactionsOperationSpec> spec) {
        PurgeAPITransactionsOperationSpec r = new PurgeAPITransactionsOperationSpec(spec);
        api.purgeAPITransactions(r.from(), r.until(), r.eventType(), r.action(), r.olderThan());
    }

    /**
     * <p>
     * This method either enables or disables the quiesce mode in API Gateway. Quiesce mode has two kinds - designtime and all. Quiesce mode for designtime will block the designtime API requests to API Gateway server and return 503 status code except the GET http method as well as few whitelisted APIs like search and this API itself. Quiesce mode for all is an extension of Integration server's Quiesce mode with the addition of flushing of API Gateway in-memory data such as performance metrics, license metrics and subscription quota to the configured data store.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public QuiesceMode quiescemode(Consumer<QuiescemodeOperationSpec> spec) {
        QuiescemodeOperationSpec r = new QuiescemodeOperationSpec(spec);
        return api.quiescemode(r.body());
    }

    /**
     * <p>
     * Resets the master password to the default value in API Gateway.This should be performed when the master password is lost and after a successful reset, it is recommended to change the master password again to a secure value
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public MasterPasswordResetResponse resetMasterPassword(Consumer<ResetMasterPasswordOperationSpec> spec) {
        ResetMasterPasswordOperationSpec r = new ResetMasterPasswordOperationSpec(spec);
        return api.resetMasterPassword();
    }

    /**
     * <p>
     * This method is used to restore the runtime data by specifying the archive file name.For more details see GET /apitransactions/archives/ to know how to get the existing archive file names. This method returns a job id as a response to track the status. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void restoreData(Consumer<RestoreDataOperationSpec> spec) {
        RestoreDataOperationSpec r = new RestoreDataOperationSpec(spec);
        api.restoreData(r.fileName());
    }

    /**
     * <p>
     * This method updates or creates API callback processor settings in API Gateway. The user should have Manage general administration configurations privilege to update the API callback processor settings.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CallbackProcessorSettings saveAPICallbackProcessorSettings(Consumer<SaveAPICallbackProcessorSettingsOperationSpec> spec) {
        SaveAPICallbackProcessorSettingsOperationSpec r = new SaveAPICallbackProcessorSettingsOperationSpec(spec);
        return api.saveAPICallbackProcessorSettings(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the API Portal destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination saveAPIPortalAsDestination(Consumer<SaveAPIPortalAsDestinationOperationSpec> spec) {
        SaveAPIPortalAsDestinationOperationSpec r = new SaveAPIPortalAsDestinationOperationSpec(spec);
        return api.saveAPIPortalAsDestination(r.body());
    }

    /**
     * <p>
     * Saves the account lock settings in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AccountLockSettings saveAccountLockSettings(Consumer<SaveAccountLockSettingsOperationSpec> spec) {
        SaveAccountLockSettingsOperationSpec r = new SaveAccountLockSettingsOperationSpec(spec);
        return api.saveAccountLockSettings(r.body());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AnalyticsDataStoreDestination saveAnalyticsDataStoreAsDestination(Consumer<SaveAnalyticsDataStoreAsDestinationOperationSpec> spec) {
        SaveAnalyticsDataStoreAsDestinationOperationSpec r = new SaveAnalyticsDataStoreAsDestinationOperationSpec(spec);
        return api.saveAnalyticsDataStoreAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Transaction Logger destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AuditLogDestination saveAuditLogAsDestination(Consumer<SaveAuditLogAsDestinationOperationSpec> spec) {
        SaveAuditLogAsDestinationOperationSpec r = new SaveAuditLogAsDestinationOperationSpec(spec);
        return api.saveAuditLogAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the Communication details of the CentraSite destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CSCommunicationDestination saveCentraSiteCommunicationAsDestination(Consumer<SaveCentraSiteCommunicationAsDestinationOperationSpec> spec) {
        SaveCentraSiteCommunicationAsDestinationOperationSpec r = new SaveCentraSiteCommunicationAsDestinationOperationSpec(spec);
        return api.saveCentraSiteCommunicationAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the CentraSite SNMP destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CSSNMPDestination saveCentraSiteSNMPAsDestination(Consumer<SaveCentraSiteSNMPAsDestinationOperationSpec> spec) {
        SaveCentraSiteSNMPAsDestinationOperationSpec r = new SaveCentraSiteSNMPAsDestinationOperationSpec(spec);
        return api.saveCentraSiteSNMPAsDestination(r.body());
    }

    /**
     * <p>
     * This REST method is used to update the custom content types for API Gateway.The response is a set of key/value pair where key indicates the custom content type and value indicates the base type. The value can be application/xml or application/json or text/xml
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object saveCustomContentTypes(Consumer<SaveCustomContentTypesOperationSpec> spec) {
        SaveCustomContentTypesOperationSpec r = new SaveCustomContentTypesOperationSpec(spec);
        return api.saveCustomContentTypes(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Database destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination saveDatabaseAsDestination(Consumer<SaveDatabaseAsDestinationOperationSpec> spec) {
        SaveDatabaseAsDestinationOperationSpec r = new SaveDatabaseAsDestinationOperationSpec(spec);
        return api.saveDatabaseAsDestination(r.body());
    }

    /**
     * <p>
     * Saves the global IP access setting for authentication based restriction settings in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DenyByIPForFailedAuthConfig saveDenyByIPForFailedAuthConfig(Consumer<SaveDenyByIPForFailedAuthConfigOperationSpec> spec) {
        SaveDenyByIPForFailedAuthConfigOperationSpec r = new SaveDenyByIPForFailedAuthConfigOperationSpec(spec);
        return api.saveDenyByIPForFailedAuthConfig(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Digital Events destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination saveDigitalEventsAsDestination(Consumer<SaveDigitalEventsAsDestinationOperationSpec> spec) {
        SaveDigitalEventsAsDestinationOperationSpec r = new SaveDigitalEventsAsDestinationOperationSpec(spec);
        return api.saveDigitalEventsAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Elasticsearch destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ElasticsearchDestination saveElasticsearchAsDestination(Consumer<SaveElasticsearchAsDestinationOperationSpec> spec) {
        SaveElasticsearchAsDestinationOperationSpec r = new SaveElasticsearchAsDestinationOperationSpec(spec);
        return api.saveElasticsearchAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Email destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EmailDestination saveEmailAsDestination(Consumer<SaveEmailAsDestinationOperationSpec> spec) {
        SaveEmailAsDestinationOperationSpec r = new SaveEmailAsDestinationOperationSpec(spec);
        return api.saveEmailAsDestination(r.body());
    }

    /**
     * <p>
     * This REST method is used to update the default error template with any custom templates and the value of the property - sendNativeProviderFault.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ErrorProcessing saveErrorProcessingDetails(Consumer<SaveErrorProcessingDetailsOperationSpec> spec) {
        SaveErrorProcessingDetailsOperationSpec r = new SaveErrorProcessingDetailsOperationSpec(spec);
        return api.saveErrorProcessingDetails(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the API Gateway destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Destination saveGatewayAsDestination(Consumer<SaveGatewayAsDestinationOperationSpec> spec) {
        SaveGatewayAsDestinationOperationSpec r = new SaveGatewayAsDestinationOperationSpec(spec);
        return api.saveGatewayAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the default keystore, truststore and alias configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public KeystoreTruststore saveKeystoreTruststore(Consumer<SaveKeystoreTruststoreOperationSpec> spec) {
        SaveKeystoreTruststoreOperationSpec r = new SaveKeystoreTruststoreOperationSpec(spec);
        return api.saveKeystoreTruststore(r.body());
    }

    /**
     * <p>
     * Saves the LDAP configuration settings in the API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public InputLdapConfiguration saveLdapConfig(Consumer<SaveLdapConfigOperationSpec> spec) {
        SaveLdapConfigOperationSpec r = new SaveLdapConfigOperationSpec(spec);
        return api.saveLdapConfig(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the load Balancer configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LoadBalancer saveLoadBalancers(Consumer<SaveLoadBalancersOperationSpec> spec) {
        SaveLoadBalancersOperationSpec r = new SaveLoadBalancersOperationSpec(spec);
        return api.saveLoadBalancers(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the log configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LogConfiguration saveLogConfig(Consumer<SaveLogConfigOperationSpec> spec) {
        SaveLogConfigOperationSpec r = new SaveLogConfigOperationSpec(spec);
        return api.saveLogConfig();
    }

    /**
     * <p>
     * Saves the password expiry settings in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PasswordExpirySettings savePasswordExpirySettings(Consumer<SavePasswordExpirySettingsOperationSpec> spec) {
        SavePasswordExpirySettingsOperationSpec r = new SavePasswordExpirySettingsOperationSpec(spec);
        return api.savePasswordExpirySettings(r.body());
    }

    /**
     * <p>
     * Saves the password restrictions settings in API Gateway
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PasswordRestrictions savePasswordRestrictions(Consumer<SavePasswordRestrictionsOperationSpec> spec) {
        SavePasswordRestrictionsOperationSpec r = new SavePasswordRestrictionsOperationSpec(spec);
        return api.savePasswordRestrictions(r.body());
    }

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void saveProxyBypass(Consumer<SaveProxyBypassOperationSpec> spec) {
        SaveProxyBypassOperationSpec r = new SaveProxyBypassOperationSpec(spec);
        api.saveProxyBypass(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the SNMP destination in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SNMPDestination saveSNMPAsDestination(Consumer<SaveSNMPAsDestinationOperationSpec> spec) {
        SaveSNMPAsDestinationOperationSpec r = new SaveSNMPAsDestinationOperationSpec(spec);
        return api.saveSNMPAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the SSO configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SSOConfiguration saveSSOConfig(Consumer<SaveSSOConfigOperationSpec> spec) {
        SaveSSOConfigOperationSpec r = new SaveSSOConfigOperationSpec(spec);
        return api.saveSSOConfig(r.body());
    }

    /**
     * <p>
     * This method updates or creates a list of extended settings and watt properties in API Gateway. The user should have an API Gateway administrator access to update thse settings. The user needs to send only the modified settings i.e, 'preferredSettings', in the payload.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ExtendedSettingsOutput saveSettings(Consumer<SaveSettingsOperationSpec> spec) {
        SaveSettingsOperationSpec r = new SaveSettingsOperationSpec(spec);
        return api.saveSettings(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the whitelisting IPs configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WhiteListedIPs saveWhitelistedIPs(Consumer<SaveWhitelistedIPsOperationSpec> spec) {
        SaveWhitelistedIPsOperationSpec r = new SaveWhitelistedIPsOperationSpec(spec);
        return api.saveWhitelistedIPs(r.body());
    }

    /**
     * <p>
     * This method shutdowns the API Gateway server. If bounce is set as true then the server would be restarted. The option parameter specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown. Quiesce specifies the quiesce mode for all in API Gateway. A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. The default value is false.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void shutdown(Consumer<ShutdownOperationSpec> spec) {
        ShutdownOperationSpec r = new ShutdownOperationSpec(spec);
        api.shutdown(r.body());
    }

    /**
     * <p>
     * The method is to test the given JNDI configuration in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void testJNDI(Consumer<TestJNDIOperationSpec> spec) {
        TestJNDIOperationSpec r = new TestJNDIOperationSpec(spec);
        api.testJNDI(r.jndiId());
    }

    /**
     * <p>
     * Use this method to know the status of a specific job. This method returns the status and file name (in case of archive process) as a response. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void trackJobStatus(Consumer<TrackJobStatusOperationSpec> spec) {
        TrackJobStatusOperationSpec r = new TrackJobStatusOperationSpec(spec);
        api.trackJobStatus(r.jobId());
    }

    /**
     * <p>
     * This API allows you to update API Portal configuration information in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PortalGateway updateAPIPortalConfiguration(Consumer<UpdateAPIPortalConfigurationOperationSpec> spec) {
        UpdateAPIPortalConfigurationOperationSpec r = new UpdateAPIPortalConfigurationOperationSpec(spec);
        return api.updateAPIPortalConfiguration(r.portalGatewayId(), r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified alias in API Gateway. The API request body must contain the payload of the alias that needs to be updated.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Alias updateAlias(Consumer<UpdateAliasOperationSpec> spec) {
        UpdateAliasOperationSpec r = new UpdateAliasOperationSpec(spec);
        return api.updateAlias(r.aliasId(), r.body());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public GatewayCacheConfig updateCacheConfig(Consumer<UpdateCacheConfigOperationSpec> spec) {
        UpdateCacheConfigOperationSpec r = new UpdateCacheConfigOperationSpec(spec);
        return api.updateCacheConfig();
    }

    /**
     * <p>
     * Updates the cluster settings in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ClusterInfo updateCluster(Consumer<UpdateClusterOperationSpec> spec) {
        UpdateClusterOperationSpec r = new UpdateClusterOperationSpec(spec);
        return api.updateCluster(r.body());
    }

    /**
     * <p>
     * The method updates the expiry interval of the master password in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public MasterPasswordExpiryIntervalResponse updateExpiryInterval(Consumer<UpdateExpiryIntervalOperationSpec> spec) {
        UpdateExpiryIntervalOperationSpec r = new UpdateExpiryIntervalOperationSpec(spec);
        return api.updateExpiryInterval(r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JMS connection
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JMSConnectionAlias updateJMSConnection(Consumer<UpdateJMSConnectionOperationSpec> spec) {
        UpdateJMSConnectionOperationSpec r = new UpdateJMSConnectionOperationSpec(spec);
        return api.updateJMSConnection(r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JMS trigger
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JMSTrigger updateJMSTrigger(Consumer<UpdateJMSTriggerOperationSpec> spec) {
        UpdateJMSTriggerOperationSpec r = new UpdateJMSTriggerOperationSpec(spec);
        return api.updateJMSTrigger(r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JNDI configuration
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JNDIProviderAlias updateJNDI(Consumer<UpdateJNDIOperationSpec> spec) {
        UpdateJNDIOperationSpec r = new UpdateJNDIOperationSpec(spec);
        return api.updateJNDI(r.body());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void updateKerberos(Consumer<UpdateKerberosOperationSpec> spec) {
        UpdateKerberosOperationSpec r = new UpdateKerberosOperationSpec(spec);
        api.updateKerberos(r.body());
    }

    /**
     * <p>
     * Updates an already existing keystore in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public KeyStore updateKeystoreAliases(Consumer<UpdateKeystoreAliasesOperationSpec> spec) {
        UpdateKeystoreAliasesOperationSpec r = new UpdateKeystoreAliasesOperationSpec(spec);
        return api.updateKeystoreAliases(r.keyStoreName(), r.keyStoreType(), r.keyStoreProvider(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.pkAliasesList(), r.pkPasswordsList(), r.nullPKpasswds(), r.isPwdBase64Encoded());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void updateLicenseDetails(Consumer<UpdateLicenseDetailsOperationSpec> spec) {
        UpdateLicenseDetailsOperationSpec r = new UpdateLicenseDetailsOperationSpec(spec);
        api.updateLicenseDetails(r.body());
    }

    /**
     * <p>
     * The method updates the master password in API Gateway.On successful update,all the old passwords available will be encrypted using this new master password.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public MasterPasswordUpdateResponse updateMasterPassword(Consumer<UpdateMasterPasswordOperationSpec> spec) {
        UpdateMasterPasswordOperationSpec r = new UpdateMasterPasswordOperationSpec(spec);
        return api.updateMasterPassword(r.body());
    }

    /**
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void updateOutboundProxy(Consumer<UpdateOutboundProxyOperationSpec> spec) {
        UpdateOutboundProxyOperationSpec r = new UpdateOutboundProxyOperationSpec(spec);
        api.updateOutboundProxy(r.body());
    }

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void updateProxyBypass(Consumer<UpdateProxyBypassOperationSpec> spec) {
        UpdateProxyBypassOperationSpec r = new UpdateProxyBypassOperationSpec(spec);
        api.updateProxyBypass(r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified rule in API Gateway. The API request body must contain the payload for the updated rule.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Rule updateRule(Consumer<UpdateRuleOperationSpec> spec) {
        UpdateRuleOperationSpec r = new UpdateRuleOperationSpec(spec);
        return api.updateRule(r.ruleId(), r.body());
    }

    /**
     * <p>
     * Updates an already existing truststore in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TrustStore updateTruststore(Consumer<UpdateTruststoreOperationSpec> spec) {
        UpdateTruststoreOperationSpec r = new UpdateTruststoreOperationSpec(spec);
        return api.updateTruststore(r.trustStoreName(), r.keyStoreType(), r.keyStoreProvider(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.isPwdBase64Encoded());
    }

    /**
     * <p>
     * Updates an existing URL Alias in API Gateway.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public URLAliasSettings updateURLALias(Consumer<UpdateURLALiasOperationSpec> spec) {
        UpdateURLALiasOperationSpec r = new UpdateURLALiasOperationSpec(spec);
        return api.updateURLALias(r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be updated.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Webhook updateWebhook(Consumer<UpdateWebhookOperationSpec> spec) {
        UpdateWebhookOperationSpec r = new UpdateWebhookOperationSpec(spec);
        return api.updateWebhook(r.id(), r.body());
    }

    /**
     * <p>
     * This REST service is used to update the Webservice endpoint
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WebserviceEndpointAlias updateWebserviceEndpoint(Consumer<UpdateWebserviceEndpointOperationSpec> spec) {
        UpdateWebserviceEndpointOperationSpec r = new UpdateWebserviceEndpointOperationSpec(spec);
        return api.updateWebserviceEndpoint(r.body());
    }

}

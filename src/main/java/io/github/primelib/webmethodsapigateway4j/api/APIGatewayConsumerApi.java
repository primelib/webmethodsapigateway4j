package io.github.primelib.webmethodsapigateway4j.api;

import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.APIResponseCreate;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseDelete;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetAPI;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetAPIs;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetGlobalPolicies;
import io.github.primelib.webmethodsapigateway4j.model.APIResponsesModel;
import io.github.primelib.webmethodsapigateway4j.model.AccessModeServices;
import io.github.primelib.webmethodsapigateway4j.model.AccessModeType;
import io.github.primelib.webmethodsapigateway4j.model.AccessProfile;
import io.github.primelib.webmethodsapigateway4j.model.AccountLockSettings;
import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.AnalyticsDataStoreDestination;
import io.github.primelib.webmethodsapigateway4j.model.Application;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalPutResponse;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalRequest;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalResponsePayload;
import io.github.primelib.webmethodsapigateway4j.model.AssertionConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.AuditLogDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSCommunicationDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSSNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.CallbackProcessorSettings;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerResponse;
import io.github.primelib.webmethodsapigateway4j.model.ClusterInfo;
import io.github.primelib.webmethodsapigateway4j.model.DenyByIPForFailedAuthConfig;
import io.github.primelib.webmethodsapigateway4j.model.Destination;
import io.github.primelib.webmethodsapigateway4j.model.Document;
import io.github.primelib.webmethodsapigateway4j.model.DocumentResponse;
import io.github.primelib.webmethodsapigateway4j.model.ElasticsearchDestination;
import io.github.primelib.webmethodsapigateway4j.model.EmailDestination;
import io.github.primelib.webmethodsapigateway4j.model.ErrorProcessing;
import io.github.primelib.webmethodsapigateway4j.model.ExtendedSettingsOutput;
import java.io.File;
import io.github.primelib.webmethodsapigateway4j.model.GatewayAPI;
import io.github.primelib.webmethodsapigateway4j.model.GatewayCacheConfig;
import io.github.primelib.webmethodsapigateway4j.model.GatewayScope;
import io.github.primelib.webmethodsapigateway4j.model.Group;
import io.github.primelib.webmethodsapigateway4j.model.HealthCheckAdminResult;
import io.github.primelib.webmethodsapigateway4j.model.HealthCheckAllResult;
import io.github.primelib.webmethodsapigateway4j.model.HealthCheckEngineResult;
import io.github.primelib.webmethodsapigateway4j.model.HealthCheckExternalResult;
import io.github.primelib.webmethodsapigateway4j.model.IPAccessMode;
import io.github.primelib.webmethodsapigateway4j.model.IPAccessModeHostsList;
import io.github.primelib.webmethodsapigateway4j.model.IPAccessModeType;
import io.github.primelib.webmethodsapigateway4j.model.ImportTraceInfoResponse;
import io.github.primelib.webmethodsapigateway4j.model.InputLdapConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.JMSConnectionAlias;
import io.github.primelib.webmethodsapigateway4j.model.JMSTrigger;
import io.github.primelib.webmethodsapigateway4j.model.JNDIProviderAlias;
import io.github.primelib.webmethodsapigateway4j.model.JWT;
import io.github.primelib.webmethodsapigateway4j.model.JWTServiceOutput;
import io.github.primelib.webmethodsapigateway4j.model.KerberosSettings;
import io.github.primelib.webmethodsapigateway4j.model.KeyStore;
import io.github.primelib.webmethodsapigateway4j.model.KeystoreTruststore;
import io.github.primelib.webmethodsapigateway4j.model.LicenseDetail;
import io.github.primelib.webmethodsapigateway4j.model.ListenerConfig;
import io.github.primelib.webmethodsapigateway4j.model.Listeners;
import io.github.primelib.webmethodsapigateway4j.model.LoadBalancer;
import io.github.primelib.webmethodsapigateway4j.model.LockedAccounts;
import io.github.primelib.webmethodsapigateway4j.model.LogConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryInterval;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryIntervalResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordProperties;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordResetResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdate;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdateResponse;
import io.github.primelib.webmethodsapigateway4j.model.MessageWithPortReference;
import io.github.primelib.webmethodsapigateway4j.model.MobileApplicationConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.ModelAPIResponse;
import io.github.primelib.webmethodsapigateway4j.model.ModelPackage;
import io.github.primelib.webmethodsapigateway4j.model.Multipart;
import io.github.primelib.webmethodsapigateway4j.model.OneOfStrategyModel;
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxyGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.PackageAPIsResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.PackageGetAllResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.PackageGetResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.PackagePlansResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.PackageResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.PasswordExpirySettings;
import io.github.primelib.webmethodsapigateway4j.model.PasswordRestrictions;
import io.github.primelib.webmethodsapigateway4j.model.Plan;
import io.github.primelib.webmethodsapigateway4j.model.PlanGetAllResponse;
import io.github.primelib.webmethodsapigateway4j.model.PlanGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.PlanResponseContainer;
import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.PolicyAction;
import io.github.primelib.webmethodsapigateway4j.model.PolicyActionTemplate;
import io.github.primelib.webmethodsapigateway4j.model.PolicyActionWrapper;
import io.github.primelib.webmethodsapigateway4j.model.PolicyEnforcementStage;
import io.github.primelib.webmethodsapigateway4j.model.Port;
import io.github.primelib.webmethodsapigateway4j.model.PortReference;
import io.github.primelib.webmethodsapigateway4j.model.PortalGateway;
import io.github.primelib.webmethodsapigateway4j.model.PortalGatewayCommunitiesData;
import io.github.primelib.webmethodsapigateway4j.model.Promotion;
import io.github.primelib.webmethodsapigateway4j.model.ProxyBypass;
import io.github.primelib.webmethodsapigateway4j.model.QuiesceMode;
import io.github.primelib.webmethodsapigateway4j.model.RemotePortConfig;
import io.github.primelib.webmethodsapigateway4j.model.Rollback;
import io.github.primelib.webmethodsapigateway4j.model.Rule;
import io.github.primelib.webmethodsapigateway4j.model.SNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.SSOConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.ScopeResourceIndex;
import io.github.primelib.webmethodsapigateway4j.model.ServerInfo;
import io.github.primelib.webmethodsapigateway4j.model.ServiceOutput;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryPublishGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryPublishPutResponse;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryUnpublishPutResponse;
import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.Shutdown;
import io.github.primelib.webmethodsapigateway4j.model.Stage;
import io.github.primelib.webmethodsapigateway4j.model.TraceLog;
import io.github.primelib.webmethodsapigateway4j.model.TransactionEvent;
import io.github.primelib.webmethodsapigateway4j.model.TransactionResponse;
import io.github.primelib.webmethodsapigateway4j.model.TrustStore;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasSettings;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasesGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.Usage;
import io.github.primelib.webmethodsapigateway4j.model.User;
import io.github.primelib.webmethodsapigateway4j.model.Webhook;
import io.github.primelib.webmethodsapigateway4j.model.WebserviceEndpointAlias;
import io.github.primelib.webmethodsapigateway4j.model.WhiteListedIPs;

import java.util.function.Consumer;

import io.github.primelib.webmethodsapigateway4j.spec.ActivateAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ActivateDCOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ActivateGlobalPolicyByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ActivateNodesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ActivatePackageByPackageIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ActivateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.AggregationsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ApiTransactionsArchiveBasedOnDurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.AppendRingConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ApproveorrejectApprovalRequestOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ArchiveTraceInfoOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.AuthorizeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.AuthorizeUserOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ChangeOwnerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ChangeTeamOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CheckConflictForGlobalPolicyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ConfigureNodesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CountByTypeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAccessModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAccessProfileOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateApplicationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateApprovalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateAssertionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateGroupOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateIPAccessModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateOAuthScopeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreatePackageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreatePlanOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreatePolicyActionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreatePortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreatePromotionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateStageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateStrategyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateSubscriptionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateUserOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateVersionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.CreateWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeactivateAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeactivateGlobalPolicyByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeactivatePackageByPackageIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeactivateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAPIsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAccessProfileOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteApplicOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteApplicationsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteApprovalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteApprovalRequestOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteAssertionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteCacheDetailsByapiNameAndVersionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteCacheDetailsbyAPIIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteDeniedIPsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteDocumentOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteGroupOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteOAuthScopeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePackageByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePlanByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePolicyActionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePolicyByIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeletePromotionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteRollbackOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteStageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteStrategyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteSubscriptionBySubscriptionIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteURLAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteUserOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DeleteWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableMockAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisablePortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableThreatProtectionRuleByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DisableTracingOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DoRollbackOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DownloadAPITransactionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.DownloadProviderSpecificationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableMockAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnablePortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.EnableThreatProtectionRuleByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ExchangeIDTokenOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ExportApiGatewayAssetsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GatewayEndpointsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIPortalMetadataOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAPIsForPackageByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAccessProfileOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAccessTokenEndpointsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllPolicyActionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllSubscriptionUsageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAllSubscriptionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetApiApplicationsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetApplicableAPIsForGlobalPolicyByIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetApplicationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetApprovalOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetApprovalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAssertionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetAssociatedGlobalPoliciesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCacheDetailsByapiIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetCacheDetailsByapiNameAndVersionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetDocumentOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetGroupOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetIPAccessModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetIntegrationServerPublishInfoOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJsonWebTokenOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetJsonWebTokenNewOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetKeystoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetMigrationStatusOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetOAuthScopeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPackageByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPackagesForAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPlanByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPlansForPackageByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPoliciesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPolicyActionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPolicyByIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPortAccessModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPortsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPromotionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetPublishedPackagesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetRegisteredApisOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetRollbackOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetScopeByScopeNameOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetScopesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetServiceRegistryPublishInfoOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetSourceOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetStageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetStrategyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetSubscriptionBySubscriptionIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTracerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTransactionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTransactionsCountOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetUsageBySubscriptionIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetUserOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetVersionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.GetWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ImportExportAPIGatewayAssetsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ImportTraceInfoOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListAllArchivesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListAllPendingJobsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ListJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.MigrationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.MoveDownThreatProtectionRuleByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.MoveUpThreatProtectionRuleByPolicyIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.NotifyAPIImplementationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PatchApplicationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PatchDocumentOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PoliciesPostOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PolicyActionTemplatesGetOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PublishAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PublishPackageByPackageIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PublishToIntegrationServerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PublishToServiceRegistryOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.PurgeAPITransactionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.QuiescemodeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.RefreshCredentialsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.RegenerateAccessTokensOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.RegisterApisOperationSpec;
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
import io.github.primelib.webmethodsapigateway4j.spec.SaveMobileApplicationConfigurationsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SavePasswordExpirySettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SavePasswordRestrictionsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveProxyBypassOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSNMPAsDestinationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSSOConfigOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveSettingsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SaveWhitelistedIPsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SearchByTypeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.SetPrimaryPortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.ShutdownOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.StoreDocumentOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.TestJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.TracingEnableOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.TrackJobStatusOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UnLockUserAccountsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UnPublishPackageByPackageIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UnpublishAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UnpublishFromServiceRegistryOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAPIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAPIPortalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAccessModeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAccessProfileOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAliasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateApiKeysExpiryOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateApplicationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateApprovalConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateAssertionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateClusterOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateDocumentContentOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateExpiryIntervalOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateGroupOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJMSConnectionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJMSTriggerOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateJNDIOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateKerberosOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateKeystoreAliasesOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateLicenseDetailsOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateListenerConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateMasterPasswordOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateOAuthScopeOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateOutboundProxyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatePackageByPackageIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatePlanByPlanIdOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatePolicyActionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatePolicyByIDOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatePortOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateProxyBypassOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateRegisteredApisOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateRingConfigurationOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateRuleOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateStageOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateStrategyOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateSubscriptionOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateTruststoreOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateURLALiasOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateUserOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateWebhookOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdateWebserviceEndpointOperationSpec;
import io.github.primelib.webmethodsapigateway4j.spec.UpdatedIPAccessModeOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIGatewayConsumerApi {
    private final APIGatewayApi api;

    public APIGatewayConsumerApi(APIGatewayApi api) {
        this.api = api;
    }

    /**
     * <p>
     * Activate an API so that API is exposed to consumers
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be activated</li>
     * </ul>
     */
    public ModelAPIResponse activateAPI(Consumer<ActivateAPIOperationSpec> spec) {
        ActivateAPIOperationSpec r = new ActivateAPIOperationSpec(spec);
        return api.activateAPI(r.apiId());
    }

    /**
     * <p>
     * The method is used to activate the datacenter configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Mode to activate</li>
     * </ul>
     */
    public String activateDC(Consumer<ActivateDCOperationSpec> spec) {
        ActivateDCOperationSpec r = new ActivateDCOperationSpec(spec);
        return api.activateDC(r.body());
    }

    /**
     * <p>
     * This REST request is used to activate a global policy and this request doesn't require any request body. This request will try to activate the global policy and if any error occurs during activation it will be reported as response or if the global policy is activated then its policy details active flag set to true will be sent as response. If the global policy have any conflicts then it cannot be activated the conflicts are manually resolved.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: The path parameter should be the policy id of global policy that needs to be activated. If the policy id is not belongs to a global policy then error will be reported</li>
     * </ul>
     */
    public Policy activateGlobalPolicyByPolicyID(Consumer<ActivateGlobalPolicyByPolicyIDOperationSpec> spec) {
        ActivateGlobalPolicyByPolicyIDOperationSpec r = new ActivateGlobalPolicyByPolicyIDOperationSpec(spec);
        return api.activateGlobalPolicyByPolicyID(r.policyId());
    }

    /**
     * <p>
     * The method is used to activate all the datacenters configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Activate all nodes</li>
     * </ul>
     */
    public Object activateNodes(Consumer<ActivateNodesOperationSpec> spec) {
        ActivateNodesOperationSpec r = new ActivateNodesOperationSpec(spec);
        return api.activateNodes(r.body());
    }

    /**
     * <p>
     * This endpoint is used to activate the package. Once activated it will insert new Authentication policy for all associated APIs with API key as application identification condition. If the authentication policy already available or added to an API after activating the package, the package will add API key to that authentication policy if it is not there. It also make the condition as OR for application identification condition available in the authentication policy
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: package id which needs to be activated</li>
     * </ul>
     */
    public PackageResponseContainer activatePackageByPackageId(Consumer<ActivatePackageByPackageIdOperationSpec> spec) {
        ActivatePackageByPackageIdOperationSpec r = new ActivatePackageByPackageIdOperationSpec(spec);
        return api.activatePackageByPackageId(r.packageId());
    }

    /**
     * <p>
     * This REST request is used to activate a rule and this request doesn't require any request body.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleId: The path parameter should be the id of rule that needs to be activated.</li>
     * </ul>
     */
    public Rule activateRule(Consumer<ActivateRuleOperationSpec> spec) {
        ActivateRuleOperationSpec r = new ActivateRuleOperationSpec(spec);
        return api.activateRule(r.ruleId());
    }

    /**
     * Perform administration health check
     * <p>
     * Perform health check for administration parts of API Gateway, such as the UI accessibility and Kibana health.
     */
    public HealthCheckAdminResult adminGet() {
        return api.adminGet();
    }

    /**
     * <p>
     * This REST call is intent to get the aggregation results for the specified scope and types. Supported aggregations are grouping, metrics and timeseries.
     * Grouping aggregation is used to find the count based on grouping of certain fields.
     * Metrics aggregation is used to find the average, minimum, maximum and sum of a field.
     * Timeseries aggregation is used to find the interval based and allowed intervals are second, minute, hour, day, week, month, quarter and year. In addition to the /search payload, aggregations fields like 'name', 'type' and 'fields'. Except types, scope, condition and aggregations other attributes are not considered during the REST API call.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Search Parameters to search for specific set of results on specified types</li>
     * </ul>
     */
    public Map<String, Object> aggregations(Consumer<AggregationsOperationSpec> spec) {
        AggregationsOperationSpec r = new AggregationsOperationSpec(spec);
        return api.aggregations(r.body());
    }

    /**
     * Perform health check for all components of API Gateway
     * <p>
     * Perform health check for all components of API Gateway.
     */
    public HealthCheckAllResult allGet() {
        return api.allGet();
    }

    /**
     * <p>
     * This method is used to archive the runtime events and metrics. Data to be archived is filtered based on the input parameters. This method returns the job id as the response which is used to know the job status.
     *  Use GET /apitransactions/jobs/{jobId} method to know the status and file name, use POST /apitransactions/archives/{fileName} method to restore. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: This is a date parameter. All the api transactions of specified type, from the given date, are archived. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter</li>
     *   <li>until: This is a date parameter. All the api transactions of specified type, until the given date, are archived. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter</li>
     *   <li>eventType: This parameter is used to specify the api transaction type.Specify eventType=ALL to archive all the events. To archive a specific event type, specify the required event type. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan</li>
     *   <li>olderThan: All the api transactions of specified type that are older than the value specified are archived. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days b) 1M means 1 month c) 1y means 1 year</li>
     * </ul>
     */
    public void apiTransactionsArchiveBasedOnDuration(Consumer<ApiTransactionsArchiveBasedOnDurationOperationSpec> spec) {
        ApiTransactionsArchiveBasedOnDurationOperationSpec r = new ApiTransactionsArchiveBasedOnDurationOperationSpec(spec);
        api.apiTransactionsArchiveBasedOnDuration(r.from(), r.until(), r.eventType(), r.olderThan());
    }

    /**
     * <p>
     * The method is used to update the patch configuration in the datacenter in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Ring configuration payload</li>
     * </ul>
     */
    public RemotePortConfig appendRingConfiguration(Consumer<AppendRingConfigurationOperationSpec> spec) {
        AppendRingConfigurationOperationSpec r = new AppendRingConfigurationOperationSpec(spec);
        return api.appendRingConfiguration(r.body());
    }

    /**
     * <p>
     * Request payload for the approval request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>approvalId: ApprovalId for the Approval Request to be approved</li>
     *   <li>action: Action for the Approval Request to be approved/rejected</li>
     *   <li>body: Approval Request payload</li>
     * </ul>
     */
    public ApprovalPutResponse approveorrejectApprovalRequest(Consumer<ApproveorrejectApprovalRequestOperationSpec> spec) {
        ApproveorrejectApprovalRequestOperationSpec r = new ApproveorrejectApprovalRequestOperationSpec(spec);
        return api.approveorrejectApprovalRequest(r.approvalId(), r.action(), r.body());
    }

    /**
     * <p>
     * Request payload to archive tracer events.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Request payload to archive tracer events.</li>
     * </ul>
     */
    public void archiveTraceInfo(Consumer<ArchiveTraceInfoOperationSpec> spec) {
        ArchiveTraceInfoOperationSpec r = new ArchiveTraceInfoOperationSpec(spec);
        api.archiveTraceInfo(r.body());
    }

    /**
     * <p>
     * This HTTP request authenticates an User in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a user that is to be created in API Gateway.</li>
     * </ul>
     */
    public User authorize(Consumer<AuthorizeOperationSpec> spec) {
        AuthorizeOperationSpec r = new AuthorizeOperationSpec(spec);
        return api.authorize(r.body());
    }

    /**
     * <p>
     * This HTTP request authenticates an User in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a user that is to be created in API Gateway.</li>
     * </ul>
     */
    public User authorizeUser(Consumer<AuthorizeUserOperationSpec> spec) {
        AuthorizeUserOperationSpec r = new AuthorizeUserOperationSpec(spec);
        return api.authorizeUser(r.body());
    }

    /**
     * <p>
     * This resource is used to change the owner of APIGateway asset
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public ChangeOwnerResponse changeOwner(Consumer<ChangeOwnerOperationSpec> spec) {
        ChangeOwnerOperationSpec r = new ChangeOwnerOperationSpec(spec);
        return api.changeOwner(r.body());
    }

    /**
     * <p>
     * This resource is used to change the team of APIGateway asset
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public ChangeOwnerResponse changeTeam(Consumer<ChangeTeamOperationSpec> spec) {
        ChangeTeamOperationSpec r = new ChangeTeamOperationSpec(spec);
        return api.changeTeam(r.body());
    }

    /**
     * <p>
     * This REST Request is used to get the conflicts for a global policy. Conflicts between the policies/APIs can arise if the policies contain the conflicting policy actions. For example, a global policy that contains the Identity and Access Policy with "API Key" will conflict with another global policy that contains the Identity and Access Policy with "OAuth2". If an API satisfy more than one global policy, then all the policy actions of all applicable global policy will be added for effective policy calculation. If any policy validation error occurred it will be reported as conflict.
     * This REST request doesn't require request body. By Default it will return the conflicts for all applicable APIs and conflicts between the specified global policy and other active global policies. Additionally, we can use the query parameter to get the conflicts for active or all applicable APIs.
     *  If there is conflict, status 500 is returned along with the details on conflicting scenarios and if there is no conflict then status 200 is returned
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the global policy id to which we need to conflicting case for a global policy</li>
     *   <li>active: This is a query parameter. It is used to get conflicting case for a global policy. If the value for this parameter is 'false' then it will return conflicting scenario for all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return conflicting case only for the list of applicable active APIs alone</li>
     * </ul>
     */
    public Policy checkConflictForGlobalPolicy(Consumer<CheckConflictForGlobalPolicyOperationSpec> spec) {
        CheckConflictForGlobalPolicyOperationSpec r = new CheckConflictForGlobalPolicyOperationSpec(spec);
        return api.checkConflictForGlobalPolicy(r.policyId(), r.active());
    }

    /**
     * <p>
     * The method is used to configure the datacenters in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Dataspace configuration payload</li>
     * </ul>
     */
    public Object configureNodes(Consumer<ConfigureNodesOperationSpec> spec) {
        ConfigureNodesOperationSpec r = new ConfigureNodesOperationSpec(spec);
        return api.configureNodes(r.body());
    }

    /**
     * <p>
     * This REST call is intent to get the total number of records for the specified scope and types. If the scope is not specified it returns total number of assets for the specified type. Both /search and /search/_count shares the same payload. Except types,scope and condition other attributes are not considered during the REST API call.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Search Parameters to search for specific set of results on specified types</li>
     * </ul>
     */
    public Map<String, Integer> countByType(Consumer<CountByTypeOperationSpec> spec) {
        CountByTypeOperationSpec r = new CountByTypeOperationSpec(spec);
        return api.countByType(r.body());
    }

    /**
     * <p>
     * This REST operation is used to create an API by importing a file, url or from scratch
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public APIResponseCreate createAPI(Consumer<CreateAPIOperationSpec> spec) {
        CreateAPIOperationSpec r = new CreateAPIOperationSpec(spec);
        return api.createAPI(r.body());
    }

    /**
     * <p>
     * This method allows you to create the API Portal configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: API Portal configuration payload</li>
     * </ul>
     */
    public PortalGateway createAPIPortalConfiguration(Consumer<CreateAPIPortalConfigurationOperationSpec> spec) {
        CreateAPIPortalConfigurationOperationSpec r = new CreateAPIPortalConfigurationOperationSpec(spec);
        return api.createAPIPortalConfiguration(r.body());
    }

    /**
     * <p>
     * The POST defines the access mode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     *   <li>body: The request contains the access mode information.</li>
     * </ul>
     */
    public AccessModeType createAccessMode(Consumer<CreateAccessModeOperationSpec> spec) {
        CreateAccessModeOperationSpec r = new CreateAccessModeOperationSpec(spec);
        return api.createAccessMode(r.listenerKey(), r.body());
    }

    /**
     * <p>
     * The method creates a team in API Gateway. The API request body must contain the payload for the team. Each bit infers the applicability of the functional privilege permission. Value 1 implies permission granted for that functional privilege. Value
     * 0 implies denied permission. Function Privileges and its positions from left most bit to the right most bit. 1.Manage APIs2.Activate / Deactivate APIs3.Manage applications4.Manage aliases5.Manage global policies6.Activate / Deactivate global policies7.Manage policy templates8.Manage threat protection configurations9.Manage packages and plans10.Activate / Deactivate packages11.Publish to API Portal12.Import assets13.Export assets14.View administration configurations15.Manage general administration configurations16.Manage security configurations17.Manage destination configurations18.Manage system settings19.Manage user administration20.Manage purge and restore runtime events21.Execute service result cache APIs22.Manage Promotion23.Publish API to Service Registry24.Manage Service Registries
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a accessProfile that is to be created in API Gateway.</li>
     * </ul>
     */
    public AccessProfile createAccessProfile(Consumer<CreateAccessProfileOperationSpec> spec) {
        CreateAccessProfileOperationSpec r = new CreateAccessProfileOperationSpec(spec);
        return api.createAccessProfile(r.body());
    }

    /**
     * <p>
     * Use this method to create an alias. There are different types of alias like Endpoint, Simple etc. Refer to the Alias schema for different type of alias that you can create. If you want to create an alias for a specific type (say Endpoint alias), refer to the corresponding schema (EndpointAlias)
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Alias createAlias(Consumer<CreateAliasOperationSpec> spec) {
        CreateAliasOperationSpec r = new CreateAliasOperationSpec(spec);
        return api.createAlias(r.body());
    }

    /**
     * <p>
     * The method creates an application in API Gateway. If you want to use JWT/Oauth/OpenID credentials in your application, you can create a JWT/Oauth/OpenID auth strategy using the resource /strategies POST. You can associate the created strategies to the application using /applications/{applicationId} PUT request using the property authStrategyIds in application. To associate the application to one or more APIs, refer the resource /applications/{applicationId}/apis PUT.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of an application that is to be created in API Gateway.</li>
     * </ul>
     */
    public Application createApplication(Consumer<CreateApplicationOperationSpec> spec) {
        CreateApplicationOperationSpec r = new CreateApplicationOperationSpec(spec);
        return api.createApplication(r.body());
    }

    /**
     * <p>
     * The method creates an approval configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of an approval configuration that is to be created in API Gateway.</li>
     * </ul>
     */
    public ApprovalConfiguration createApprovalConfiguration(Consumer<CreateApprovalConfigurationOperationSpec> spec) {
        CreateApprovalConfigurationOperationSpec r = new CreateApprovalConfigurationOperationSpec(spec);
        return api.createApprovalConfiguration(r.body());
    }

    /**
     * <p>
     * Custom assertions allow the API providers to extend and provide additional security policies that are not available by default in API Gateway. In WS-Security, custom assertions are used for expressing individual security requirements, constraints, or both. The individual policy assertions can be combined to create security policies that ensure secure and reliable exchanges of SOAP messages between a client and a SOAP API. This REST service is used to create a assertion. Below are the request payloads for different types of assertions.
     * bindingAssertion: &amp;quot;{
     *  &amp;quot;configurationElement&amp;quot;: &amp;quot;&amp;lt;sp:AsymmetricBinding xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     *  &amp;lt;wsp:Policy xmlns:wsp=&amp;quot;http://schemas.xmlsoap.org/ws/2004/09/policy&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:InitiatorToken&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;sp:X509Token sp:IncludeToken=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/Never&amp;quot;&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * 
     * &amp;lt;sp:WssX509V3Token10/&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/sp:X509Token&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/sp:InitiatorToken&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:RecipientToken&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;sp:X509Token sp:IncludeToken=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/Never&amp;quot;&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * 
     * &amp;lt;sp:WssX509V3Token10/&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/sp:X509Token&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/sp:RecipientToken&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:AlgorithmSuite&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;sp:Basic256 /&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/sp:AlgorithmSuite&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:Layout&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;sp:LaxTimestampFirst/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/sp:Layout&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:ProtectTokens/&amp;gt;
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * &amp;lt;/sp:AsymmetricBinding&amp;gt;&amp;quot;,
     *  &amp;quot;configurationName&amp;quot;:&amp;quot;CustomBindingAssertion1&amp;quot;,
     *  &amp;quot;assertionType&amp;quot;:&amp;quot;bindingAssertion&amp;quot;}&amp;quot;
     * 
     * tokenAssertion: &amp;quot;{
     *  &amp;quot;configurationElement&amp;quot;: &amp;quot;&amp;lt;sp:SupportingTokens xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     *  &amp;lt;wsp:Policy xmlns:wsp=&amp;quot;http://schemas.xmlsoap.org/ws/2004/09/policy&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;sp:UsernameToken sp:IncludeToken=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient&amp;quot;/&amp;gt;
     * 
     * 
     *  &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * &amp;lt;/sp:SupportingTokens&amp;gt;&amp;quot;,
     *  &amp;quot;configurationName&amp;quot;:&amp;quot;UsernameToken&amp;quot;,
     *  &amp;quot;assertionType&amp;quot;:&amp;quot;tokenAssertion&amp;quot;}&amp;quot;
     * 
     *  policyAssertion: &amp;quot;{
     *  &amp;quot;configurationElement&amp;quot;: &amp;quot;&amp;lt;wsp:Policy wsu:Id=&amp;quot;CustomBinding_IWSTrust13Async_policy&amp;quot;
     * 
     *  xmlns:wsu=&amp;quot;http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd&amp;quot;
     * 
     *  xmlns:wsp=&amp;quot;http://schemas.xmlsoap.org/ws/2004/09/policy&amp;quot;
     * 
     * 
     * xmlns:wsaw=&amp;quot;http://www.w3.org/2006/02/addressing/wsdl&amp;quot;
     * 
     *  xmlns:sp=&amp;quot;http://schemas.xmlsoap.org/ws/2005/07/securitypolicy&amp;quot;&amp;gt;
     * 
     *  &amp;lt;wsp:ExactlyOne&amp;gt;
     * 
     * 
     * &amp;lt;wsp:All&amp;gt;
     * 
     * 
     *  &amp;lt;sp:TransportBinding xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:TransportToken&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;sp:HttpsToken/&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/sp:TransportToken&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:AlgorithmSuite&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;sp:Basic128/&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/sp:AlgorithmSuite&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:Layout&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;sp:Strict/&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/sp:Layout&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:IncludeTimestamp/&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     *  &amp;lt;/sp:TransportBinding&amp;gt;
     * 
     * 
     *  &amp;lt;sp:EndorsingSupportingTokens xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:KerberosToken sp:IncludeToken=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/Once&amp;quot;&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     * 
     *  &amp;lt;sp:WssGssKerberosV5ApReqToken11/&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/sp:KerberosToken&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:KeyValueToken sp:IncludeToken=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/Never&amp;quot; wsp:Optional=&amp;quot;true&amp;quot;/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;!--
     * 
     * 
     * 
     * 
     * &amp;lt;sp:SignedParts&amp;gt;
     * 
     * 
     * 
     * 
     * &amp;lt;sp:Header Name=&amp;quot;To&amp;quot; Namespace=&amp;quot;http://www.w3.org/2005/08/addressing&amp;quot;/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;/sp:SignedParts&amp;gt;
     * 
     * 
     * 
     *  --&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     *  &amp;lt;/sp:EndorsingSupportingTokens&amp;gt;
     * 
     * 
     *  &amp;lt;sp:Wss11 xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:MustSupportRefKeyIdentifier/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:MustSupportRefIssuerSerial/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:MustSupportRefThumbprint/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:MustSupportRefEncryptedKey/&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     *  &amp;lt;/sp:Wss11&amp;gt;
     * 
     * 
     *  &amp;lt;sp:Trust13 xmlns:sp=&amp;quot;http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702&amp;quot;&amp;gt;
     * 
     * 
     * 
     * &amp;lt;wsp:Policy&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:MustSupportIssuedTokens/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:RequireClientEntropy/&amp;gt;
     * 
     * 
     * 
     *  &amp;lt;sp:RequireServerEntropy/&amp;gt;
     * 
     * 
     * 
     * &amp;lt;/wsp:Policy&amp;gt;
     * 
     * 
     *  &amp;lt;/sp:Trust13&amp;gt;
     * 
     * 
     *  &amp;lt;wsaw:UsingAddressing/&amp;gt;
     * 
     * 
     * &amp;lt;/wsp:All&amp;gt;
     * 
     *  &amp;lt;/wsp:ExactlyOne&amp;gt;
     * 
     * &amp;lt;/wsp:Policy&amp;gt;&amp;quot;
     *  &amp;quot;configurationName&amp;quot;:&amp;quot;KerberosOverTransport&amp;quot;,
     *  &amp;quot;assertionType&amp;quot;:&amp;quot;policyAssertion&amp;quot;}&amp;quot;
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: assertion request payload</li>
     * </ul>
     */
    public AssertionConfiguration createAssertion(Consumer<CreateAssertionOperationSpec> spec) {
        CreateAssertionOperationSpec r = new CreateAssertionOperationSpec(spec);
        return api.createAssertion(r.body());
    }

    /**
     * <p>
     * The method creates a group in API Gateway. The API request body must contain the payload for the group.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a group that is to be created in API Gateway.</li>
     * </ul>
     */
    public Group createGroup(Consumer<CreateGroupOperationSpec> spec) {
        CreateGroupOperationSpec r = new CreateGroupOperationSpec(spec);
        return api.createGroup(r.body());
    }

    /**
     * <p>
     * The POST creates the ipAccessMode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     *   <li>body: The request contains the ip access mode type information.</li>
     * </ul>
     */
    public IPAccessModeType createIPAccessMode(Consumer<CreateIPAccessModeOperationSpec> spec) {
        CreateIPAccessModeOperationSpec r = new CreateIPAccessModeOperationSpec(spec);
        return api.createIPAccessMode(r.listenerKey(), r.body());
    }

    /**
     * <p>
     * The method creates a JMS connection in API Gateway. The API request body must contain the payload for the JMS connection
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public JMSConnectionAlias createJMSConnection(Consumer<CreateJMSConnectionOperationSpec> spec) {
        CreateJMSConnectionOperationSpec r = new CreateJMSConnectionOperationSpec(spec);
        return api.createJMSConnection(r.body());
    }

    /**
     * <p>
     * The method creates a JNDI configuration in API Gateway. The API request body must contain the payload for the JNDI configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public JNDIProviderAlias createJNDI(Consumer<CreateJNDIOperationSpec> spec) {
        CreateJNDIOperationSpec r = new CreateJNDIOperationSpec(spec);
        return api.createJNDI(r.body());
    }

    /**
     * <p>
     * Creates a keystore in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>keyStoreName: The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.</li>
     *   <li>keyStoreType: The certificate file format of the keystore.</li>
     *   <li>keyStorePassword: The keystore password that is defined at the time of keystore creation using a keystore utility.</li>
     *   <li>uploadFileName: The name of the keystore file that will be used to save the keystore internally in API Gateway.</li>
     *   <li>fileContent: The contents of the truststore file.</li>
     *   <li>keyStoreDescription: The description for the keystore.</li>
     *   <li>pkAliasesList: Comma separated list of alias names in the uploaded keystore file.</li>
     *   <li>pkPasswordsList: Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.</li>
     *   <li>nullPKpasswds: Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.</li>
     *   <li>isPwdBase64Encoded: Specifies whether password is base 64 encoded.</li>
     * </ul>
     */
    public KeyStore createKeystore(Consumer<CreateKeystoreOperationSpec> spec) {
        CreateKeystoreOperationSpec r = new CreateKeystoreOperationSpec(spec);
        return api.createKeystore(r.keyStoreName(), r.keyStoreType(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.pkAliasesList(), r.pkPasswordsList(), r.nullPKpasswds(), r.isPwdBase64Encoded());
    }

    /**
     * <p>
     * Use this method to create an OAuth scope mapping
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of an OAuth scope that is to be created in API Gateway.</li>
     * </ul>
     */
    public GatewayScope createOAuthScope(Consumer<CreateOAuthScopeOperationSpec> spec) {
        CreateOAuthScopeOperationSpec r = new CreateOAuthScopeOperationSpec(spec);
        return api.createOAuthScope(r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload of an outbound proxy server that is to be created in API Gateway.</li>
     * </ul>
     */
    public void createOutboundProxy(Consumer<CreateOutboundProxyOperationSpec> spec) {
        CreateOutboundProxyOperationSpec r = new CreateOutboundProxyOperationSpec(spec);
        api.createOutboundProxy(r.body());
    }

    /**
     * <p>
     * This endpoint is used to create a package in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public PackageResponseContainer createPackage(Consumer<CreatePackageOperationSpec> spec) {
        CreatePackageOperationSpec r = new CreatePackageOperationSpec(spec);
        return api.createPackage(r.body());
    }

    /**
     * <p>
     * This request is used to create the plan. During the creation of plan we can specify meta data of the plans. The rate limit and quota needs to created using a separate rest call to /policyActions. Also they need to be associated to corresponding policies created during the plan.
     * 
     *  You can also enable notifications in quota to trigger some actions such as billing or any other custom actions based on the consumption of an user.
     * 
     *  The notification can be either email or a custom destination. To receive email notification you should configure Email destination. To enable custom destination you need to create custom destination in API gateway. The link https://github.com/SoftwareAG/webmethods-api-gateway/tree/master/docs/articles/features/Custom%20Destinations contains the details on how to configure and use it. If you want to block the consumer after consuming allocated quota you should create throttle policy action as mentioned in the below example associate that to quota policy created for plan. If you want to just notify the destination with blocking the customer then you need to create monitorSLA policy action and associate that to quota policy created for plan.
     * 
     *  If you enable block on breach (throttle policy) you can receive both the policy violation event and monitor event with eventSource field as Enforce-HardLimit in custom destination. Please make sure that custom destination is enabled to receive events for policy violations events. If you dont enable block on breach (monitorSLA) in quota then monitor event with eventSource field as MonitorPolicy is sent to destinations configured.
     * 
     * 
     * Below are the examples to create rate limit in API gateway using endpoint /policyActions and associate it to the policy created for the plan.
     * 
     *  curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Traffic Optimization","locale":"en"}],"templateKey":"throttle","parameters":[{"templateKey":"throttleRule","parameters":[{"templateKey":"throttleRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["10"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["2"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["10 requests in 2 minutes breached for rate limit"]},{"templateKey":"consumerIds","values":["AnyConsumers"]}],"active":false}}'.
     * 
     * 
     * The above command will create a throttling policy action and its id in the response which you need to associate to the policy using the below example.
     *  curl -X PUT -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policies/2429ece2-96c2-4bd6-b8dc-9c13eedac42f -d '{"policy":{"id":"2429ece2-96c2-4bd6-b8dc-9c13eedac42f","policyEnforcements":[{"enforcements":[{"enforcementObjectId":"f3753917-30ef-438c-99f5-adcc204ac7b6","order":null}],"stageKey":"throttle"}]}}'.
     * 
     *  To create throttle policy for quota use the below example.
     * 
     * curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Traffic Optimization","locale":"en"}],"templateKey":"throttle","parameters":[{"templateKey":"throttleRule","parameters":[{"templateKey":"throttleRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["150"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["30"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["150 requests breached in 30 minutes for quota"]},{"templateKey":"consumerIds","values":["AnyConsumers"]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["SMTP"]},{"templateKey":"emailTo","values":["abc@xyz.com"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["CUSTOM"]},{"templateKey":"ids","values":["customDestiantion1"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["DES"]}]}],"active":false}}'.
     * 
     *  To create monitorSLA policy action for quota use the below example.
     * 
     * curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Monitor SLA","locale":"en"}],"templateKey":"monitorSLA","parameters":[{"templateKey":"monitorRules","parameters":[{"templateKey":"monitorRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["120.0"],"extendedProperties":[{"key":"quota","value":"150"},{"key":"notifyPercent","value":"80"}]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["30"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["80% vioalted for quota"]},{"templateKey":"consumerIds","values":["AnyConsumers"]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["SMTP"]},{"templateKey":"emailTo","values":["abc@xyz.com"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["CUSTOM"]},{"templateKey":"ids","values":["customDestiantion1"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["DES"]}]}],"active":false}}'.
     * 
     *  To associate create throttle and monitor policy to quota.
     * 
     *  curl -X PUT -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policies/f6e80784-d82e-491c-abda-d492ee037c2c -d {"policy":{"id":"f6e80784-d82e-491c-abda-d492ee037c2c","policyEnforcements":[{"enforcements":[{"enforcementObjectId":"2083ce29-8f4a-4e5e-b8bc-cbaaf18e4780","order":null}],"stageKey":"throttle"},{"enforcements":[{"enforcementObjectId":"7d143518-1058-4f4c-8ee1-66dd75b4c08d","order":null}],"stageKey":"monitorSLA"}]}}
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public PlanResponseContainer createPlan(Consumer<CreatePlanOperationSpec> spec) {
        CreatePlanOperationSpec r = new CreatePlanOperationSpec(spec);
        return api.createPlan(r.body());
    }

    /**
     * <p>
     * This REST request is used to create policy action. The result of this request is a policy action payload and is available in the response. To know about the policy action template and to create it
     * you can use the policyActionTemplates/{templateKey} to get the template structure of a policy action. The template key will be available in policyStage resource.
     * It's also used to create the custom destination using the templateKey 'customDestination'. For more information on custom destination, please refer the postman collections here -
     * https://github.com/SoftwareAG/webmethods-api-gateway/blob/master/apigatewayservices/postmancollections/apis/custom-destination/CustomDestination.json
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Contains the policy action details of the newly created policy action</li>
     * </ul>
     */
    public PolicyAction createPolicyAction(Consumer<CreatePolicyActionOperationSpec> spec) {
        CreatePolicyActionOperationSpec r = new CreatePolicyActionOperationSpec(spec);
        return api.createPolicyAction(r.body());
    }

    /**
     * <p>
     * The POST method creates a new port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Port createPort(Consumer<CreatePortOperationSpec> spec) {
        CreatePortOperationSpec r = new CreatePortOperationSpec(spec);
        return api.createPort(r.body());
    }

    /**
     * <p>
     * This REST operation is used to promote the API Gateway assets from the source machine to destination machine where the destination machine is configured as a stage
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Promotion request payload</li>
     *   <li>fixingMissingVersions: Option to fix the API version history. The discrepancy between the asset versions in the source and target stages, if any, are fixed. The default value is false</li>
     *   <li>overwrite: Option to overwrite the assets except aliases in the destination stage during asset promotion. The default value is false</li>
     *   <li>overwriteAlias: Option to overwrite the asset type 'alias' in the destination stage during asset promotion. The default value is 'false'. This parameter takes precedence over the 'overwrite' parameter.</li>
     * </ul>
     */
    public Promotion createPromotion(Consumer<CreatePromotionOperationSpec> spec) {
        CreatePromotionOperationSpec r = new CreatePromotionOperationSpec(spec);
        return api.createPromotion(r.body(), r.fixingMissingVersions(), r.overwrite(), r.overwriteAlias());
    }

    /**
     * <p>
     * The method creates a conditional rule in API Gateway. The API request body must contain the payload for the rule.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Rule createRule(Consumer<CreateRuleOperationSpec> spec) {
        CreateRuleOperationSpec r = new CreateRuleOperationSpec(spec);
        return api.createRule(r.body());
    }

    /**
     * <p>
     * This REST operation is used to configure a stage in the source API Gateway where promotion will be initiated. A stage is just another API Gateway instance. When the stage url is https, then keystore and keystore alias will also be expected while configuring a stage
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Stage request payload</li>
     * </ul>
     */
    public Stage createStage(Consumer<CreateStageOperationSpec> spec) {
        CreateStageOperationSpec r = new CreateStageOperationSpec(spec);
        return api.createStage(r.body());
    }

    /**
     * <p>
     * The method creates a strategy in API Gateway. The API request body must contain the payload for the strategy
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a strategy that is to be created in API Gateway.</li>
     * </ul>
     */
    public OneOfStrategyModel createStrategy(Consumer<CreateStrategyOperationSpec> spec) {
        CreateStrategyOperationSpec r = new CreateStrategyOperationSpec(spec);
        return api.createStrategy(r.body());
    }

    /**
     * <p>
     * This endpoint is used to create subscription for specified package and plan in the request. If the approval is enabled, the response will not contain the API key but the application id will be available to retrieve the API key later. A approval request will be created in API gateway to approve the subscription. Once the request is approved the application will be provided with an API key. Then you can use subscriptions/{applicationId} GET HTTP method to get the API key
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Application createSubscription(Consumer<CreateSubscriptionOperationSpec> spec) {
        CreateSubscriptionOperationSpec r = new CreateSubscriptionOperationSpec(spec);
        return api.createSubscription(r.body());
    }

    /**
     * <p>
     * Creates a truststore in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>keyStoreName: The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.</li>
     *   <li>keyStoreType: The certificate file format of the truststore.</li>
     *   <li>keyStorePassword: The truststore password that is defined at the time of truststore creation using a keystore utility.</li>
     *   <li>uploadFileName: The name of the truststore file that will be used to save the truststore internally in API Gateway.</li>
     *   <li>fileContent: The contents of the truststore file.</li>
     *   <li>keyStoreDescription: The description for the truststore.</li>
     *   <li>isPwdBase64Encoded: Specifies whether password is base 64 encoded.</li>
     * </ul>
     */
    public TrustStore createTruststore(Consumer<CreateTruststoreOperationSpec> spec) {
        CreateTruststoreOperationSpec r = new CreateTruststoreOperationSpec(spec);
        return api.createTruststore(r.keyStoreName(), r.keyStoreType(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.isPwdBase64Encoded());
    }

    /**
     * <p>
     * Creates a new URL Alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request body for creating a new URL Alias in API Gateway.</li>
     * </ul>
     */
    public URLAliasSettings createURLALias(Consumer<CreateURLALiasOperationSpec> spec) {
        CreateURLALiasOperationSpec r = new CreateURLALiasOperationSpec(spec);
        return api.createURLALias(r.body());
    }

    /**
     * <p>
     * The method creates an user in API Gateway. The API request body must contain the payload for the user.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of a user that is to be created in API Gateway.</li>
     * </ul>
     */
    public User createUser(Consumer<CreateUserOperationSpec> spec) {
        CreateUserOperationSpec r = new CreateUserOperationSpec(spec);
        return api.createUser(r.body());
    }

    /**
     * <p>
     * Create a new version of an API and retain applications if required
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be versioned</li>
     *   <li>body: Create version request payload</li>
     * </ul>
     */
    public ModelAPIResponse createVersion(Consumer<CreateVersionOperationSpec> spec) {
        CreateVersionOperationSpec r = new CreateVersionOperationSpec(spec);
        return api.createVersion(r.apiId(), r.body());
    }

    /**
     * <p>
     * The method creates a webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be saved.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Webhook createWebhook(Consumer<CreateWebhookOperationSpec> spec) {
        CreateWebhookOperationSpec r = new CreateWebhookOperationSpec(spec);
        return api.createWebhook(r.body());
    }

    /**
     * <p>
     * The method creates a Webservice endpoint in API Gateway. The API request body must contain the payload for the Webservice endpoint
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public WebserviceEndpointAlias createWebserviceEndpoint(Consumer<CreateWebserviceEndpointOperationSpec> spec) {
        CreateWebserviceEndpointOperationSpec r = new CreateWebserviceEndpointOperationSpec(spec);
        return api.createWebserviceEndpoint(r.body());
    }

    /**
     * <p>
     * Deactivate an API so that API is not exposed to consumers
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be deactivated</li>
     * </ul>
     */
    public ModelAPIResponse deactivateAPI(Consumer<DeactivateAPIOperationSpec> spec) {
        DeactivateAPIOperationSpec r = new DeactivateAPIOperationSpec(spec);
        return api.deactivateAPI(r.apiId());
    }

    /**
     * <p>
     * This REST request is used to deactivate a global policy and it doesn't require any request body. This request tries to deactivate the global policy and if any error occurs during deactivation will be reported as response or if the global policy deactivated the policy details of a global policy with active flag set to false is sent as response. An active global policy cannot have conflicts with other active global policy and hence the
     * deactivation fails only when the conflict occurs between active global policy that is specified and one or more applicable active APIs. This can happen when the applicable active API policy action
     * might depend on one or more policy action from the specified global policy. If you deactivate this policy, it would cause the active API to have an unstable state. Hence the deactivation is reported as failed in this case.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: The path parameter should be the policy id of global policy that needs to be deactivated. If the policy id is not belongs to a global policy then error will be reported</li>
     * </ul>
     */
    public Policy deactivateGlobalPolicyByPolicyID(Consumer<DeactivateGlobalPolicyByPolicyIDOperationSpec> spec) {
        DeactivateGlobalPolicyByPolicyIDOperationSpec r = new DeactivateGlobalPolicyByPolicyIDOperationSpec(spec);
        return api.deactivateGlobalPolicyByPolicyID(r.policyId());
    }

    /**
     * <p>
     * This request is used to deactivate the package. Once the package is deactivated, it will remove the authentication policy added or revert the authentication policy to original state in the API. If there are multiple packages associated to an API then the IAM policy will have the behaviour of having API key as application identification condition along with other application identification condition if any selected till last associated package is deactivated.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: package id which needs to be deactivated</li>
     * </ul>
     */
    public PackageResponseContainer deactivatePackageByPackageId(Consumer<DeactivatePackageByPackageIdOperationSpec> spec) {
        DeactivatePackageByPackageIdOperationSpec r = new DeactivatePackageByPackageIdOperationSpec(spec);
        return api.deactivatePackageByPackageId(r.packageId());
    }

    /**
     * <p>
     * This REST request is used to deactivate a rule and it doesn't require any request body.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleId: The path parameter should be the id of rule that needs to be deactivated.</li>
     * </ul>
     */
    public Rule deactivateRule(Consumer<DeactivateRuleOperationSpec> spec) {
        DeactivateRuleOperationSpec r = new DeactivateRuleOperationSpec(spec);
        return api.deactivateRule(r.ruleId());
    }

    /**
     * <p>
     * Delete the inactive API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be deleted</li>
     *   <li>forceDelete: Flag for force delete. Required when API is associated with some applications</li>
     * </ul>
     */
    public APIResponseDelete deleteAPI(Consumer<DeleteAPIOperationSpec> spec) {
        DeleteAPIOperationSpec r = new DeleteAPIOperationSpec(spec);
        return api.deleteAPI(r.apiId(), r.forceDelete());
    }

    /**
     * <p>
     * This API allows you to delete an API Portal configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>portalGatewayId: Id of the API Portal configuration for delete.</li>
     * </ul>
     */
    public void deleteAPIPortalConfiguration(Consumer<DeleteAPIPortalConfigurationOperationSpec> spec) {
        DeleteAPIPortalConfigurationOperationSpec r = new DeleteAPIPortalConfigurationOperationSpec(spec);
        api.deleteAPIPortalConfiguration(r.portalGatewayId());
    }

    /**
     * <p>
     * Delete the inactive APIs
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiIds: API Ids for the APIs to be deleted. Multiple API ids combined by comma</li>
     *   <li>forceDelete: Flag for force delete. Required when API is associated with some applications</li>
     * </ul>
     */
    public List<APIResponseDelete> deleteAPIs(Consumer<DeleteAPIsOperationSpec> spec) {
        DeleteAPIsOperationSpec r = new DeleteAPIsOperationSpec(spec);
        return api.deleteAPIs(r.apiIds(), r.forceDelete());
    }

    /**
     * <p>
     * The method deletes a team from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accessProfileId: This parameter specifies the ID of a team that is to be deleted in API Gateway.</li>
     * </ul>
     */
    public void deleteAccessProfile(Consumer<DeleteAccessProfileOperationSpec> spec) {
        DeleteAccessProfileOperationSpec r = new DeleteAccessProfileOperationSpec(spec);
        api.deleteAccessProfile(r.accessProfileId());
    }

    /**
     * <p>
     * The method deletes an alias from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>aliasId: The path parameter specifies the id of an alias that is to be deleted from API Gateway.</li>
     * </ul>
     */
    public void deleteAlias(Consumer<DeleteAliasOperationSpec> spec) {
        DeleteAliasOperationSpec r = new DeleteAliasOperationSpec(spec);
        api.deleteAlias(r.aliasId());
    }

    /**
     * <p>
     * The method deletes the specified application in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application to be deleted.</li>
     * </ul>
     */
    public void deleteApplic(Consumer<DeleteApplicOperationSpec> spec) {
        DeleteApplicOperationSpec r = new DeleteApplicOperationSpec(spec);
        api.deleteApplic(r.applicationId());
    }

    /**
     * <p>
     * The method deletes the specified applications in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: You can delete multiple applications using the query parameter 'ids' by providing the ids as comma-separated values. Example:  /applications?ids=375db639-01f7-4488-b14f-09daae622e18,afb0b5c0-0b0e-4d44-b139-e64d0dbf028c</li>
     * </ul>
     */
    public void deleteApplications(Consumer<DeleteApplicationsOperationSpec> spec) {
        DeleteApplicationsOperationSpec r = new DeleteApplicationsOperationSpec(spec);
        api.deleteApplications(r.ids());
    }

    /**
     * <p>
     * The method deletes the specified approval configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: This parameter specifies the ID of an approval configuration that is to be deleted in API Gateway.</li>
     * </ul>
     */
    public void deleteApprovalConfiguration(Consumer<DeleteApprovalConfigurationOperationSpec> spec) {
        DeleteApprovalConfigurationOperationSpec r = new DeleteApprovalConfigurationOperationSpec(spec);
        api.deleteApprovalConfiguration(r.id());
    }

    /**
     * <p>
     * Delete the Approval Request with the given approvalId
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>approvalId: Approval Request Id for the Approval Request to be deleted</li>
     * </ul>
     */
    public void deleteApprovalRequest(Consumer<DeleteApprovalRequestOperationSpec> spec) {
        DeleteApprovalRequestOperationSpec r = new DeleteApprovalRequestOperationSpec(spec);
        api.deleteApprovalRequest(r.approvalId());
    }

    /**
     * <p>
     * This delete request will delete the assertion based on the assertion id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>assertionId: This path parameter is used to specify the assertion id for which assertion needs to deleted.</li>
     * </ul>
     */
    public void deleteAssertion(Consumer<DeleteAssertionOperationSpec> spec) {
        DeleteAssertionOperationSpec r = new DeleteAssertionOperationSpec(spec);
        api.deleteAssertion(r.assertionId());
    }

    /**
     * <p>
     * This REST Request is used to request for deletion of Service Result cache for the API using apiName and apiVersion
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiName: This query parameter is used to specify the API name for which the service result cache deletion is requsted.</li>
     *   <li>apiVersion: The version of the apiName parameter specified</li>
     * </ul>
     */
    public void deleteCacheDetailsByapiNameAndVersion(Consumer<DeleteCacheDetailsByapiNameAndVersionOperationSpec> spec) {
        DeleteCacheDetailsByapiNameAndVersionOperationSpec r = new DeleteCacheDetailsByapiNameAndVersionOperationSpec(spec);
        api.deleteCacheDetailsByapiNameAndVersion(r.apiName(), r.apiVersion());
    }

    /**
     * <p>
     * This REST Request is used to request for deletion of Service Result Cache for the API using api id
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: The id of API for which the Service Result Cache deletion is requested</li>
     * </ul>
     */
    public void deleteCacheDetailsbyAPIId(Consumer<DeleteCacheDetailsbyAPIIdOperationSpec> spec) {
        DeleteCacheDetailsbyAPIIdOperationSpec r = new DeleteCacheDetailsbyAPIIdOperationSpec(spec);
        api.deleteCacheDetailsbyAPIId(r.apiId());
    }

    /**
     * <p>
     * This DELETE method is used to remove the IP from Denied IPs list. Once removed the request from IP will be processed.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>IP: </li>
     * </ul>
     */
    public void deleteDeniedIPs(Consumer<DeleteDeniedIPsOperationSpec> spec) {
        DeleteDeniedIPsOperationSpec r = new DeleteDeniedIPsOperationSpec(spec);
        api.deleteDeniedIPs(r.IP());
    }

    /**
     * <p>
     * Deletes the stored document from API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>documentId: Id of the document for deletion</li>
     * </ul>
     */
    public void deleteDocument(Consumer<DeleteDocumentOperationSpec> spec) {
        DeleteDocumentOperationSpec r = new DeleteDocumentOperationSpec(spec);
        api.deleteDocument(r.documentId());
    }

    /**
     * <p>
     * The method deletes a group from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: The path parameter specifies the id of a group that is to be deleted from API Gateway.</li>
     * </ul>
     */
    public void deleteGroup(Consumer<DeleteGroupOperationSpec> spec) {
        DeleteGroupOperationSpec r = new DeleteGroupOperationSpec(spec);
        api.deleteGroup(r.groupId());
    }

    /**
     * <p>
     * This delete request will delete the JMS connection based on the JMS connection id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsConnId: This path parameter is used to specify the JMS connection id for which JMS connection needs to deleted.</li>
     * </ul>
     */
    public void deleteJMSConnection(Consumer<DeleteJMSConnectionOperationSpec> spec) {
        DeleteJMSConnectionOperationSpec r = new DeleteJMSConnectionOperationSpec(spec);
        api.deleteJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * This delete request will delete the JNDI configuration based on the JNDI id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jndiId: This path parameter is used to specify the JNDI id for which JNDI configuration needs to deleted.</li>
     * </ul>
     */
    public void deleteJNDI(Consumer<DeleteJNDIOperationSpec> spec) {
        DeleteJNDIOperationSpec r = new DeleteJNDIOperationSpec(spec);
        api.deleteJNDI(r.jndiId());
    }

    /**
     * <p>
     * Deletes keystore matching the specified name in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>keyStoreName: Keystore name to identify the corresponding Keystore</li>
     * </ul>
     */
    public List<KeyStore> deleteKeystore(Consumer<DeleteKeystoreOperationSpec> spec) {
        DeleteKeystoreOperationSpec r = new DeleteKeystoreOperationSpec(spec);
        return api.deleteKeystore(r.keyStoreName());
    }

    /**
     * <p>
     * This method deletes the requested OAuth scope mapping.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>oauthScopeId: The path parameter specifies the id of an OAuth scope mapping that is to be deleted from API Gateway.</li>
     * </ul>
     */
    public void deleteOAuthScope(Consumer<DeleteOAuthScopeOperationSpec> spec) {
        DeleteOAuthScopeOperationSpec r = new DeleteOAuthScopeOperationSpec(spec);
        api.deleteOAuthScope(r.oauthScopeId());
    }

    /**
     * <p>
     * Deletes the specified outbound proxy server alias from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>outboundproxyAlias: The outbound proxy server alias to be deleted</li>
     * </ul>
     */
    public void deleteOutboundProxy(Consumer<DeleteOutboundProxyOperationSpec> spec) {
        DeleteOutboundProxyOperationSpec r = new DeleteOutboundProxyOperationSpec(spec);
        api.deleteOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * Deletes package from API gateway. Also deletes the association of plans and APIs to that package.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: Id of the Package</li>
     * </ul>
     */
    public void deletePackageById(Consumer<DeletePackageByIdOperationSpec> spec) {
        DeletePackageByIdOperationSpec r = new DeletePackageByIdOperationSpec(spec);
        api.deletePackageById(r.packageId());
    }

    /**
     * <p>
     * This request is used to delete the plan by plan id. Before deleting the plan, the plan should removed from all of its associated packages else API gateway will not allow the plan to be deleted. You can use /packages/{packageId} resource dis associate the plan from its corresponding packages. The associated rate limit and quota policy will be deleted automatically when the plan is deleted.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>planId: Id of a Plan</li>
     * </ul>
     */
    public void deletePlanById(Consumer<DeletePlanByIdOperationSpec> spec) {
        DeletePlanByIdOperationSpec r = new DeletePlanByIdOperationSpec(spec);
        api.deletePlanById(r.planId());
    }

    /**
     * <p>
     * This delete request will delete the policy action based on the policy action id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionId: Policy Action ID</li>
     * </ul>
     */
    public void deletePolicyAction(Consumer<DeletePolicyActionOperationSpec> spec) {
        DeletePolicyActionOperationSpec r = new DeletePolicyActionOperationSpec(spec);
        api.deletePolicyAction(r.policyActionId());
    }

    /**
     * <p>
     * This REST request is used to delete the policy from API gateway. This request will automatically delete the associated policy action for this policy
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id that needs to be deleted. If the policy id specified is global policy then it needs to be in inactive state to delete. Active global policy and global policy with systemPolicy property set to true cannot be deleted.</li>
     * </ul>
     */
    public void deletePolicyByID(Consumer<DeletePolicyByIDOperationSpec> spec) {
        DeletePolicyByIDOperationSpec r = new DeletePolicyByIDOperationSpec(spec);
        api.deletePolicyByID(r.policyId());
    }

    /**
     * <p>
     * The DELETE method removes a port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pkg: The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot.</li>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within a package.</li>
     * </ul>
     */
    public void deletePort(Consumer<DeletePortOperationSpec> spec) {
        DeletePortOperationSpec r = new DeletePortOperationSpec(spec);
        api.deletePort(r.pkg(), r.listenerKey());
    }

    /**
     * <p>
     * Delete the promotion
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>promotionId: Promotion Id for the promotion to be deleted</li>
     * </ul>
     */
    public void deletePromotion(Consumer<DeletePromotionOperationSpec> spec) {
        DeletePromotionOperationSpec r = new DeletePromotionOperationSpec(spec);
        api.deletePromotion(r.promotionId());
    }

    /**
     * <p>
     * Delete the rollback
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>rollbackId: Rollback Id for the rollback to be deleted</li>
     * </ul>
     */
    public void deleteRollback(Consumer<DeleteRollbackOperationSpec> spec) {
        DeleteRollbackOperationSpec r = new DeleteRollbackOperationSpec(spec);
        api.deleteRollback(r.rollbackId());
    }

    /**
     * <p>
     * The method deletes a rule from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleId: The path parameter specifies the id of a rule that is to be deleted from API Gateway.</li>
     * </ul>
     */
    public void deleteRule(Consumer<DeleteRuleOperationSpec> spec) {
        DeleteRuleOperationSpec r = new DeleteRuleOperationSpec(spec);
        api.deleteRule(r.ruleId());
    }

    /**
     * <p>
     * Delete the stage
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>stageId: Stage Id for the stage to be deleted</li>
     * </ul>
     */
    public void deleteStage(Consumer<DeleteStageOperationSpec> spec) {
        DeleteStageOperationSpec r = new DeleteStageOperationSpec(spec);
        api.deleteStage(r.stageId());
    }

    /**
     * <p>
     * The method deletes the specified strategy in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: This parameter specifies the ID of a strategy that is to be deleted in API Gateway.</li>
     * </ul>
     */
    public void deleteStrategy(Consumer<DeleteStrategyOperationSpec> spec) {
        DeleteStrategyOperationSpec r = new DeleteStrategyOperationSpec(spec);
        api.deleteStrategy(r.ids());
    }

    /**
     * <p>
     * This endpoint is used to deleted subscriptions created in API Gateway. If approval is enabled for deletion of subscription then the a request will be created to approve. Till the request get approved the application will be suspended. If the delete request is approved then the application will be deleted and if the delete request is rejected then the application will be resumed from suspend state. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: Application id to delete the application</li>
     * </ul>
     */
    public void deleteSubscriptionBySubscriptionID(Consumer<DeleteSubscriptionBySubscriptionIDOperationSpec> spec) {
        DeleteSubscriptionBySubscriptionIDOperationSpec r = new DeleteSubscriptionBySubscriptionIDOperationSpec(spec);
        api.deleteSubscriptionBySubscriptionID(r.applicationId());
    }

    /**
     * <p>
     * Deletes an already existing truststore matching the name in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>trustStoreName: Truststore name to identify the corresponding trust store to delete in API Gateway</li>
     * </ul>
     */
    public void deleteTruststore(Consumer<DeleteTruststoreOperationSpec> spec) {
        DeleteTruststoreOperationSpec r = new DeleteTruststoreOperationSpec(spec);
        api.deleteTruststore(r.trustStoreName());
    }

    /**
     * <p>
     * The method deletes an URL alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>alias: The name of the URL alias to be deleted.</li>
     * </ul>
     */
    public void deleteURLAlias(Consumer<DeleteURLAliasOperationSpec> spec) {
        DeleteURLAliasOperationSpec r = new DeleteURLAliasOperationSpec(spec);
        api.deleteURLAlias(r.alias());
    }

    /**
     * <p>
     * This HTTP request deletes the specified application in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: This parameter specifies the ID of an application that is to be deleted in API Gateway.</li>
     * </ul>
     */
    public void deleteUser(Consumer<DeleteUserOperationSpec> spec) {
        DeleteUserOperationSpec r = new DeleteUserOperationSpec(spec);
        api.deleteUser(r.userId());
    }

    /**
     * <p>
     * The method deletes a webhook resource from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: This parameter specifies the id of the webhook that is to be deleted in API Gateway.</li>
     * </ul>
     */
    public void deleteWebhook(Consumer<DeleteWebhookOperationSpec> spec) {
        DeleteWebhookOperationSpec r = new DeleteWebhookOperationSpec(spec);
        api.deleteWebhook(r.id());
    }

    /**
     * <p>
     * This delete request will delete the Webservice endpoint based on the Webservice endpoint id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>webserviceEndpointId: This path parameter is used to specify the Webservice endpoint id for which Webservice endpoint needs to deleted.</li>
     * </ul>
     */
    public void deleteWebserviceEndpoint(Consumer<DeleteWebserviceEndpointOperationSpec> spec) {
        DeleteWebserviceEndpointOperationSpec r = new DeleteWebserviceEndpointOperationSpec(spec);
        api.deleteWebserviceEndpoint(r.webserviceEndpointId());
    }

    /**
     * <p>
     * The method disables the specified JMS connections in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsConnId: This path parameter is used to specify the JMS connection id which JMS connection needs to be disabled.</li>
     * </ul>
     */
    public void disableJMSConnection(Consumer<DisableJMSConnectionOperationSpec> spec) {
        DisableJMSConnectionOperationSpec r = new DisableJMSConnectionOperationSpec(spec);
        api.disableJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method disables the specified JMS trigger in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsTriggerId: This path parameter is used to specify the JMS trigger id which JMS trigger needs to be disabled.</li>
     * </ul>
     */
    public void disableJMSTrigger(Consumer<DisableJMSTriggerOperationSpec> spec) {
        DisableJMSTriggerOperationSpec r = new DisableJMSTriggerOperationSpec(spec);
        api.disableJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * Once API is disabled from mocking capability, at runtime all the API invocations are redirected to the native service instead of sending the mocked response
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be deactivated</li>
     * </ul>
     */
    public ModelAPIResponse disableMockAPI(Consumer<DisableMockAPIOperationSpec> spec) {
        DisableMockAPIOperationSpec r = new DisableMockAPIOperationSpec(spec);
        return api.disableMockAPI(r.apiId());
    }

    /**
     * <p>
     * Disables an already existing outbound proxy server alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>outboundproxyAlias: The outbound proxy server alias to be disabled</li>
     * </ul>
     */
    public void disableOutboundProxy(Consumer<DisableOutboundProxyOperationSpec> spec) {
        DisableOutboundProxyOperationSpec r = new DisableOutboundProxyOperationSpec(spec);
        api.disableOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * The PUT disables the referenced port configuration. A disabled port can not be contacted.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request body references the existing port configuration to be disabled.</li>
     * </ul>
     */
    public MessageWithPortReference disablePort(Consumer<DisablePortOperationSpec> spec) {
        DisablePortOperationSpec r = new DisablePortOperationSpec(spec);
        return api.disablePort(r.body());
    }

    /**
     * <p>
     * This REST request is used to disable the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy is disabled successfully then the policy details of specified policy will be sent as response.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id of the threat protection policy which needs to be disabled</li>
     * </ul>
     */
    public Policy disableThreatProtectionRuleByPolicyID(Consumer<DisableThreatProtectionRuleByPolicyIDOperationSpec> spec) {
        DisableThreatProtectionRuleByPolicyIDOperationSpec r = new DisableThreatProtectionRuleByPolicyIDOperationSpec(spec);
        return api.disableThreatProtectionRuleByPolicyID(r.policyId());
    }

    /**
     * <p>
     * Disable tracing for an API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API for which tracing is disabled</li>
     * </ul>
     */
    public GatewayAPI disableTracing(Consumer<DisableTracingOperationSpec> spec) {
        DisableTracingOperationSpec r = new DisableTracingOperationSpec(spec);
        return api.disableTracing(r.apiId());
    }

    /**
     * <p>
     * This REST operation is used to rollback the assets to the previous state i.e the state prior to promotion. Rollback should be initiated from the local gateway instance.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>rollbackId: Rollback Id for the promotion to be rollbacked</li>
     * </ul>
     */
    public Rollback doRollback(Consumer<DoRollbackOperationSpec> spec) {
        DoRollbackOperationSpec r = new DoRollbackOperationSpec(spec);
        return api.doRollback(r.rollbackId());
    }

    /**
     * <p>
     * The GET method is used to download the api transactions of the specified type. Data to be downloaded is filtered based on the input parameters. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>startDate: This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter</li>
     *   <li>endDate: This is a date parameter. All the api transactions of the specified type which satisfies the startDate and endDate criteria are downloaded. Ex: startDate=2017-12-18 00:00:00 and endDate=2017-12-19 00:00:00. Either one of (startDate and endDate) or duration is a mandatory parameter</li>
     *   <li>eventType: This parameter is used to specify the event type to be downloaded. Specify eventType=ALL to download all the events. To download events of a specific type, specify the required event type Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan</li>
     *   <li>duration: All the api transactions of the specified type that are older than the value specified are downloaded. Ex: duration='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year. Either one of (startDate&amp;endDate) or duration is a mandatory parameter</li>
     * </ul>
     */
    public void downloadAPITransaction(Consumer<DownloadAPITransactionOperationSpec> spec) {
        DownloadAPITransactionOperationSpec r = new DownloadAPITransactionOperationSpec(spec);
        api.downloadAPITransaction(r.startDate(), r.endDate(), r.eventType(), r.duration());
    }

    /**
     * <p>
     * This resource is used to download logs from different components used by APIGateway, server configurations and thread dumps.
     */
    public void downloadLogs() {
        api.downloadLogs();
    }

    /**
     * <p>
     * Downloads the provider specification of REST, SOAP and GraphQL based APIs. Provider specification is nothing but, the specification file (in swagger, graphql or wsdl format) with out the concrete API Gateway endpoint and contains all resources/methods/operation irrespective of whether they are exposed to consumer
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to retrieve the versions</li>
     *   <li>format: Output format of the API specification. For REST APIs the value is 'swagger'; for SOAP APIs use the value as 'wsdl';for GraphQL APIs use the value as 'graphql'</li>
     * </ul>
     */
    public APIResponseGetAPI downloadProviderSpecification(Consumer<DownloadProviderSpecificationOperationSpec> spec) {
        DownloadProviderSpecificationOperationSpec r = new DownloadProviderSpecificationOperationSpec(spec);
        return api.downloadProviderSpecification(r.apiId(), r.format());
    }

    /**
     * <p>
     * The method enables the specified JMS connections in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsConnId: This path parameter is used to specify the JMS connection id which JMS connection needs to be enabled.</li>
     * </ul>
     */
    public void enableJMSConnection(Consumer<EnableJMSConnectionOperationSpec> spec) {
        EnableJMSConnectionOperationSpec r = new EnableJMSConnectionOperationSpec(spec);
        api.enableJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method enables the specified JMS trigger in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsTriggerId: This path parameter is used to specify the JMS trigger id which JMS trigger needs to be enabled.</li>
     * </ul>
     */
    public void enableJMSTrigger(Consumer<EnableJMSTriggerOperationSpec> spec) {
        EnableJMSTriggerOperationSpec r = new EnableJMSTriggerOperationSpec(spec);
        api.enableJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * In API Gateway, you can mock an API implementation. API Gateway lets you mock an API by simulating the native service. API Mocking is useful feature in API first approach, where in the provider may choose to expose the mocked API to the consumers when the actual API doesn't exist or isn't complete.
     *  In API Gateway, when you enable mocking for an API, a default mock response is created for each combination of resource, operation, status code and content-type based on the example and schema set in the API definition. As an API Provider, you can add or modify the default mock responses.
     * You can specify conditions at the operation level and configure IS services at the API level for a mocked API in the update API operation. At runtime, when the mocked API is invoked instead of calling the native service, API Gateway returns the mocked response to the consumer based on the below priorities: 1. If any of the conditions for the invoked operation satisfies, API Gateway returns the associated mocked response. 2. If no condition is specified or none of the condition for the invoked operation is satisfied, then API Gateway will return
     * a. the response from an IS service, if an IS service is configured b. default mocked response, if no IS services are configured
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be activated</li>
     *   <li>retainDefaultMockResponses: Flag to retain generated mocked responses. When this is set to true, default mocked responses will be retained. If it's set to false, new default mocked responses will be generated using the examples, schema in the API</li>
     * </ul>
     */
    public ModelAPIResponse enableMockAPI(Consumer<EnableMockAPIOperationSpec> spec) {
        EnableMockAPIOperationSpec r = new EnableMockAPIOperationSpec(spec);
        return api.enableMockAPI(r.apiId(), r.retainDefaultMockResponses());
    }

    /**
     * <p>
     * Enables an already existing outbound proxy server alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>outboundproxyAlias: The outbound proxy server alias to be enabled</li>
     * </ul>
     */
    public void enableOutboundProxy(Consumer<EnableOutboundProxyOperationSpec> spec) {
        EnableOutboundProxyOperationSpec r = new EnableOutboundProxyOperationSpec(spec);
        api.enableOutboundProxy(r.outboundproxyAlias());
    }

    /**
     * <p>
     * The PUT enables the referenced port configuration. Only enabled ports can be contacted and serve requests.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request body references the existing port configuration to be enabled.</li>
     * </ul>
     */
    public PortReference enablePort(Consumer<EnablePortOperationSpec> spec) {
        EnablePortOperationSpec r = new EnablePortOperationSpec(spec);
        return api.enablePort(r.body());
    }

    /**
     * <p>
     * This REST request is used to enable the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy is enabled successfully then the policy details of specified policy is sent as response
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id of the threat protection policy which needs to be enabled</li>
     * </ul>
     */
    public Policy enableThreatProtectionRuleByPolicyID(Consumer<EnableThreatProtectionRuleByPolicyIDOperationSpec> spec) {
        EnableThreatProtectionRuleByPolicyIDOperationSpec r = new EnableThreatProtectionRuleByPolicyIDOperationSpec(spec);
        return api.enableThreatProtectionRuleByPolicyID(r.policyId());
    }

    /**
     * Perform core health check
     * <p>
     * Perform health check for core parts of API Gateway, such as Elasticsearch store, cluster environment and Integration Server health.
     */
    public HealthCheckEngineResult engineGet() {
        return api.engineGet();
    }

    /**
     * <p>
     * Generate an access token for the given ID Token
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of an application that is to be created in API Gateway.</li>
     * </ul>
     */
    public ServiceOutput exchangeIDToken(Consumer<ExchangeIDTokenOperationSpec> spec) {
        ExchangeIDTokenOperationSpec r = new ExchangeIDTokenOperationSpec(spec);
        return api.exchangeIDToken(r.body());
    }

    /**
     * <p>
     * The GET method exports an archive. The result of the GET request is an archive in a ZIP format.
     *  This Method supports exporting API, Application, Alias,Policy, Policy Action, Keystore, Truststore, Kerberos, User, Group, Team, JMS Connection, JNDI Provider, JMS Trigger, Webservice Endpoint Alias, Approval Configuration, Outbound Proxy, URL alias, Plan and Package.
     *  This GET method can be used for exporting specific type of assets and its optional/soft dependant assets by specifying the asset name and corresponding include options in query parameter.
     *  For example, for an API, the Application assets (used by the API) are soft dependant of that API. To export the dependant applications of an API use the query param 'include-applications'.If 'include-applications' is not provided, the export archive will contains only the APIs.
     *  Refer 'Parameters' section for the usage of each include parameters.
     * 
     * Use the POST /archive method to export all the assets in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>includeApplications: This parameter indicates whether you want to export the applications associated with the APIs</li>
     *   <li>includeUsers: This parameter indicates whether you want to export users associated with the groups and/or with the password expiry settings</li>
     *   <li>includeGroups: This parameter indicates whether you want to export groups associated with the teams</li>
     *   <li>includeTruststores: This parameter indicates whether you want to export truststore alias associated with the email configuration</li>
     *   <li>policies: This parameter identifies the policies to be exported. The wildcard "*" selects all the policies.  For example a single policy can be exported with its id using the following request: GET /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a  Whereas, all the policies can be exported using the following request: GET /rest/apigateway/archive?policies=*</li>
     *   <li>apis: This parameter identifies the APIs to be exported. The wildcard "*" selects all the APIs.  For example a single API can be exported using the following request: GET /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?apis=*</li>
     *   <li>aliases: This parameter identifies the aliases to be exported.  The wildcard "*" selects all aliases. For example, a single alias can be exported using the following requrest: GET /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?alias=*</li>
     *   <li>applications: This parameter identifies the applications to be exported.  The wildcard "*" selects all applications. For example, a single application can be exported using the following requrest: GET /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the applications can be exported using the following request: GET /rest/apigateway/archive?applications=*</li>
     *   <li>policyActions: This parameter identifies the policy actions to be exported.  The wildcard "*" selects all policy actions. For example, a single policy action can be exported using the following request:  GET /rest/apigateway/archive?policyActions=20ca1e24-d6b2-430d-adf8-7a53a6cbaa53  Whereas, all the policy actions can be exported using the following request: GET /rest/apigateway/archive?policyActions=*</li>
     *   <li>approvalConfigurations: This parameter identifies the approval configurations to be exported.  The wildcard "*" selects all approval configurations. For example, a single approval configuration can be exported using the following request: GET /rest/apigateway/archive?approvalConfigurations=createApplication  Whereas, all the approval configurations can be exported using the following request:  GET /rest/apigateway/archive?approvalConfigurations=*</li>
     *   <li>outboundProxies: This parameter identifies the outbound proxy aliases to be exported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.  For example a single outbound proxy alias can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias  Whereas, all the outbound proxy aliases can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=*</li>
     *   <li>urlAliases: This parameter identifies the URL aliases to be exported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.  For example, a single URL alias can be exported using the following request: GET /rest/apigateway/archive?urlAliases=testUrlAlias  Whereas, all the URL aliases can be exported using the following request: GET /rest/apigateway/archive?testUrlAlias=*</li>
     *   <li>keyStores: This parameter identifies the keystore aliases to be exported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.  For example, a single keystore alias can be exported using the following request: GET /rest/apigateway/archive?keyStores=test_keystore  Whereas, all the keystore aliases can be exported using the following request: GET /rest/apigateway/archive?keyStores=*</li>
     *   <li>trustStores: This parameter identifies the truststore aliases to be exported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.  For example, a single truststore alias can be exported using the following request: GET /rest/apigateway/archive?trustStores=test_truststore  Whereas, all the truststore aliases can be exported using the following request: GET /rest/apigateway/archive?trustStores=*</li>
     *   <li>jnDIProviderAliases: This parameter identifies the JNDI provider aliases to be exported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias  Whereas, all the JNDI provider aliases can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=*</li>
     *   <li>jmSConnectionAliases: This parameter identifies the JMS connection aliases to be exported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias  Whereas, all the JMS connection aliases can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=*</li>
     *   <li>jmSTriggers: This parameter identifies the JMS triggers to be exported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.  For example, a single JMS trigger can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=test_jmsTrigger  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=*</li>
     *   <li>webserviceEndpointAliases: This parameter identifies the 'web service endpoint' aliases to be exported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.  For example, a single web service endpoint alias can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=*</li>
     *   <li>users: This parameter identifies the users to be exported.  The wildcard "*" selects all the users.  For example, a single user can be exported using the following request: GET /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54  Whereas, all the users can be exported using the following request: GET /rest/apigateway/archive?users=*</li>
     *   <li>groups: This parameter identifies the groups to be exported.  The wildcard "*" selects all the groups.  For example, a single group can be exported using the following request: GET /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the groups can be exported using the following request: GET /rest/apigateway/archive?groups=*</li>
     *   <li>accessProfiles: This parameter identifies the teams to be exported.  The wildcard "*" selects all the teams.  For example, a single team can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the teams can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=*</li>
     *   <li>kerberosSetting: This parameter identifies the kerberos configuration to be exported. The kerberos configuration can be exported using the following request: GET /rest/apigateway/archive?kerberosSetting=kerberosSetting</li>
     *   <li>plans: This parameter identifies the plans to be exported.  The wildcard "*" selects all the plans.  For example, a single plan can be exported using the following request: GET /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a  Whereas, all the plans can be exported using the following request: GET /rest/apigateway/archive?plans=*</li>
     *   <li>packages: This parameter identifies the packages to be exported.  The wildcard "*" selects all the packages.  For example, a single package can be exported using the following request: GET /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the packages can be exported using the following request: GET /rest/apigateway/archive?packages=*</li>
     *   <li>portalGateways: This parameter identifies the portal configurations to be exported.  The wildcard "*" selects all portal configurations. For example, a single portal configuration can be exported using the following requrest: GET /rest/apigateway/archive?portalGateways=ae196583-d109-4e9e-b593-dd7b984fe8ca  Whereas, all the portal configurations can be exported using the following request: GET /rest/apigateway/archive?portalGateways=*</li>
     *   <li>configurations: This parameter identifies the configurations to be exported.  The wildcard "*" selects all the configurations.  For example, a single configuration can be exported using the following request: GET /rest/apigateway/archive?configurations=loadBalancer,customContentTypes  Whereas, all the configurations can be exported using the following request: GET /rest/apigateway/archive?configurations=*</li>
     *   <li>gatewayScopes: This parameter identifies the oauth scopes to be exported.  The wildcard "*" selects all the oauth scopes.  For example, a single oauth scope can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the oauth scopes can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=*</li>
     * </ul>
     */
    public void exportApiGatewayAssets(Consumer<ExportApiGatewayAssetsOperationSpec> spec) {
        ExportApiGatewayAssetsOperationSpec r = new ExportApiGatewayAssetsOperationSpec(spec);
        api.exportApiGatewayAssets(r.includeApplications(), r.includeUsers(), r.includeGroups(), r.includeTruststores(), r.policies(), r.apis(), r.aliases(), r.applications(), r.policyActions(), r.approvalConfigurations(), r.outboundProxies(), r.urlAliases(), r.keyStores(), r.trustStores(), r.jnDIProviderAliases(), r.jmSConnectionAliases(), r.jmSTriggers(), r.webserviceEndpointAliases(), r.users(), r.groups(), r.accessProfiles(), r.kerberosSetting(), r.plans(), r.packages(), r.portalGateways(), r.configurations(), r.gatewayScopes());
    }

    /**
     * Perform health check on all external destinations and resources
     * <p>
     * Perform health check for configured external resources.
     */
    public HealthCheckExternalResult externalServicesGet() {
        return api.externalServicesGet();
    }

    /**
     * <p>
     * The method retrieves list of all JNDI templates in API Gateway.
     */
    public void fetchJNDITemplates() {
        api.fetchJNDITemplates();
    }

    /**
     * <p>
     * This operation can be used to create / update / delete a custom gateway endpoing of an API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be updated</li>
     *   <li>body: API Gateway endpoints request payload</li>
     * </ul>
     */
    public ModelAPIResponse gatewayEndpoints(Consumer<GatewayEndpointsOperationSpec> spec) {
        GatewayEndpointsOperationSpec r = new GatewayEndpointsOperationSpec(spec);
        return api.gatewayEndpoints(r.apiId(), r.body());
    }

    /**
     * <p>
     * Retrieve an API based on the API id.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be retrieved</li>
     *   <li>format: Output format of the API. If the value is 'swagger', you get a API definition in swagger format. If the value is 'raml', you get a raml document. If the value is 'openapi', you get a open API document. If the value is 'odata', you get a zip file holding the OData metadata and service document.</li>
     *   <li>url: User selected endpoint for API definition in swagger/raml format.</li>
     * </ul>
     */
    public APIResponseGetAPI getAPI(Consumer<GetAPIOperationSpec> spec) {
        GetAPIOperationSpec r = new GetAPIOperationSpec(spec);
        return api.getAPI(r.apiId(), r.format(), r.url());
    }

    /**
     * <p>
     * This method retrieves the API callback processor settings from API Gateway.
     */
    public CallbackProcessorSettings getAPICallbackProcessorSettings() {
        return api.getAPICallbackProcessorSettings();
    }

    /**
     * <p>
     * The method retrieves the details of the API Portal destination configurations. API Gateway can publish events and performance metrics data. By default, error events, lifecycle events, policy violation event, and performance data are published to API Portal.
     */
    public Destination getAPIPortalAsDestination() {
        return api.getAPIPortalAsDestination();
    }

    /**
     * <p>
     * This API allows you to retrieve an API Portal configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>portalGatewayId: Id of the API Portal configuration for retrieval</li>
     * </ul>
     */
    public PortalGateway getAPIPortalConfiguration(Consumer<GetAPIPortalConfigurationOperationSpec> spec) {
        GetAPIPortalConfigurationOperationSpec r = new GetAPIPortalConfigurationOperationSpec(spec);
        return api.getAPIPortalConfiguration(r.portalGatewayId());
    }

    /**
     * <p>
     * This API allows you to retrieve the details about communities in API Portal. An API can be published from API Gateway to any of the communities available in API Portal
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>portalGatewayId: Id of the API Portal configuration for retrieval of the community information</li>
     *   <li>apiId: Id of the API published from API Gateway to API Portal</li>
     * </ul>
     */
    public PortalGatewayCommunitiesData getAPIPortalMetadata(Consumer<GetAPIPortalMetadataOperationSpec> spec) {
        GetAPIPortalMetadataOperationSpec r = new GetAPIPortalMetadataOperationSpec(spec);
        return api.getAPIPortalMetadata(r.portalGatewayId(), r.apiId());
    }

    /**
     * <p>
     * Get all APIs or subset of APIs
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiIds: API Ids for the API to be retrieved</li>
     *   <li>from: Starting index from the list of APIs to be retrieved</li>
     *   <li>size: Number of APIs to be retrieved</li>
     * </ul>
     */
    public APIResponsesModel getAPIs(Consumer<GetAPIsOperationSpec> spec) {
        GetAPIsOperationSpec r = new GetAPIsOperationSpec(spec);
        return api.getAPIs(r.apiIds(), r.from(), r.size());
    }

    /**
     * <p>
     * To get list of all APIs associated for a given package id
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: Id of the Package</li>
     * </ul>
     */
    public PackageAPIsResponseContainer getAPIsForPackageById(Consumer<GetAPIsForPackageByIdOperationSpec> spec) {
        GetAPIsForPackageByIdOperationSpec r = new GetAPIsForPackageByIdOperationSpec(spec);
        return api.getAPIsForPackageById(r.packageId());
    }

    /**
     * <p>
     * The method retrieves the details of a team in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accessProfileId: The path parameter specifies the id of a team whose details are to be retrieved.</li>
     * </ul>
     */
    public AccessProfile getAccessProfile(Consumer<GetAccessProfileOperationSpec> spec) {
        GetAccessProfileOperationSpec r = new GetAccessProfileOperationSpec(spec);
        return api.getAccessProfile(r.accessProfileId());
    }

    /**
     * <p>
     * The method retrieves list of all teams in API Gateway.
     */
    public AccessProfile getAccessProfiles() {
        return api.getAccessProfiles();
    }

    /**
     * <p>
     * The method retrieves a map of access token endpoints for all the authorization servers configured
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application whose access token endpoints are to be retrieved from API Gateway.</li>
     * </ul>
     */
    public void getAccessTokenEndpoints(Consumer<GetAccessTokenEndpointsOperationSpec> spec) {
        GetAccessTokenEndpointsOperationSpec r = new GetAccessTokenEndpointsOperationSpec(spec);
        api.getAccessTokenEndpoints(r.applicationId());
    }

    /**
     * <p>
     * Retrieves the account lock settings configured in API Gateway
     */
    public AccountLockSettings getAccountLockSettings() {
        return api.getAccountLockSettings();
    }

    /**
     * <p>
     * The method retrieves the details of an alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>aliasId: The path parameter specifies the id of an alias whose details are to be retrieved.</li>
     * </ul>
     */
    public Alias getAlias(Consumer<GetAliasOperationSpec> spec) {
        GetAliasOperationSpec r = new GetAliasOperationSpec(spec);
        return api.getAlias(r.aliasId());
    }

    /**
     * <p>
     * This API allows you to retrieve API Portal configurations available in API Gateway.
     */
    public PortalGateway getAllAPIPortalConfiguration() {
        return api.getAllAPIPortalConfiguration();
    }

    /**
     * <p>
     * The method retrieves a list of all aliases in API Gateway.
     */
    public List<Alias> getAllAlias() {
        return api.getAllAlias();
    }

    /**
     * <p>
     * This request will return all the assertions from API Gateway
     */
    public AssertionConfiguration getAllAssertions() {
        return api.getAllAssertions();
    }

    /**
     * <p>
     * The method retrieves list of all the JMS connections in API Gateway.
     */
    public void getAllJMSConnections() {
        api.getAllJMSConnections();
    }

    /**
     * <p>
     * The method retrieves list of all JMS triggers in API Gateway.
     */
    public void getAllJMSTriggers() {
        api.getAllJMSTriggers();
    }

    /**
     * <p>
     * To get all package details from API Gateway
     */
    public PackageGetAllResponseContainer getAllPackages() {
        return api.getAllPackages();
    }

    /**
     * <p>
     * This REST request is used to retrieve list of all plans from API Gateway along with its rate limit and quota as policies. Also it will list down the associated packageIds for each plan in the response. You can use /policies/{policyId} to retrieve the rate limit and quota policy details and /packages/{packageId} to retrieve the package details
     */
    public PlanGetAllResponse getAllPlans() {
        return api.getAllPlans();
    }

    /**
     * <p>
     * This request will return all the policy actions from API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionIds: This is a query parameter. Provide comma separated Policy Action ids to get the policy action details for specified policy action ids</li>
     * </ul>
     */
    public List<PolicyAction> getAllPolicyActions(Consumer<GetAllPolicyActionsOperationSpec> spec) {
        GetAllPolicyActionsOperationSpec r = new GetAllPolicyActionsOperationSpec(spec);
        return api.getAllPolicyActions(r.policyActionIds());
    }

    /**
     * <p>
     * The method retrieves list of all rules in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleType: ruleType : if supplied, returns the rules of this particular ruleType only</li>
     *   <li>active: active : if supplied, returns the active rules only</li>
     * </ul>
     */
    public List<Rule> getAllRule(Consumer<GetAllRuleOperationSpec> spec) {
        GetAllRuleOperationSpec r = new GetAllRuleOperationSpec(spec);
        return api.getAllRule(r.ruleType(), r.active());
    }

    /**
     * <p>
     * This endpoint is used to list the aggregated details of each active subscription for current cycle. This can be used with filters mentioned as query parameter to fine grain the result. For example, if you want to fetch the list of usage of active subscription for package GoldPackage, then you can specify package=GoldPackage in query parameter. The result will contain usage details of subscription belongs to GoldPackage alone. You can either fetch all the records at once or use the from and size query parameter to fetch subset of details. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: Subscription name to search for usage</li>
     *   <li>_package: Package name to search for usage</li>
     *   <li>plan: Plan name to search for usage</li>
     *   <li>from: Starting index number of the usage result to fetch</li>
     *   <li>size: Number of results to be fetched for the usage result</li>
     *   <li>count: true to get the count for the search or all the usages available</li>
     * </ul>
     */
    public List<Usage> getAllSubscriptionUsage(Consumer<GetAllSubscriptionUsageOperationSpec> spec) {
        GetAllSubscriptionUsageOperationSpec r = new GetAllSubscriptionUsageOperationSpec(spec);
        return api.getAllSubscriptionUsage(r.name(), r._package(), r.plan(), r.from(), r.size(), r.count());
    }

    /**
     * <p>
     * The method retrieves all subscriptions or set of subscriptions for the specified package id and plan id specified. The response will contain the list of application details. The API key inside all the application will be masked even though the API invoker have permission to view the key.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: Specify the package id for which the subscription details is requested</li>
     *   <li>planId: Specify the plan id for which the subscription details is requested</li>
     * </ul>
     */
    public List<Application> getAllSubscriptions(Consumer<GetAllSubscriptionsOperationSpec> spec) {
        GetAllSubscriptionsOperationSpec r = new GetAllSubscriptionsOperationSpec(spec);
        return api.getAllSubscriptions(r.packageId(), r.planId());
    }

    /**
     * <p>
     * The method retrieves the list of all webhooks in API Gateway.
     */
    public List<Webhook> getAllWebhooks() {
        return api.getAllWebhooks();
    }

    /**
     * <p>
     * The method retrieves list of all Webservice endpoints in API Gateway.
     */
    public void getAllWebserviceEndpoints() {
        api.getAllWebserviceEndpoints();
    }

    /**
     */
    public AnalyticsDataStoreDestination getAnalyticsDataStoreAsDestination() {
        return api.getAnalyticsDataStoreAsDestination();
    }

    /**
     * <p>
     * Retrieves the list of registered applications of an API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to find the associated applications</li>
     * </ul>
     */
    public List<Application> getApiApplications(Consumer<GetApiApplicationsOperationSpec> spec) {
        GetApiApplicationsOperationSpec r = new GetApiApplicationsOperationSpec(spec);
        return api.getApiApplications(r.apiId());
    }

    /**
     * <p>
     * This REST request is used to get the list of applicable APIs for a global policy.
     * An API become
     * applicable API for a global policy only if it satisfies the scope specified in the global policy.
     * By default it will return the basic API details of all the applicable APIs either if the API is active or inactive for a global policy. User can use the query parameter "active" to retrieve all active APIs for a global policy or all applicable APIs regardless of its status for a global policy.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the global policy id for which we need the list of applicable APIs</li>
     *   <li>active: This is a query parameter. It is used to retrieve the list of applicable APIs for a global policy. If the value for this parameter is 'false' then it will return all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return only the list of applicable active APIs alone for the specified global policy</li>
     * </ul>
     */
    public List<APIResponseGetAPIs> getApplicableAPIsForGlobalPolicyByID(Consumer<GetApplicableAPIsForGlobalPolicyByIDOperationSpec> spec) {
        GetApplicableAPIsForGlobalPolicyByIDOperationSpec r = new GetApplicableAPIsForGlobalPolicyByIDOperationSpec(spec);
        return api.getApplicableAPIsForGlobalPolicyByID(r.policyId(), r.active());
    }

    /**
     * <p>
     * The method retrieves the details of a specified application in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application whose details are to be retrieved in API Gateway.</li>
     * </ul>
     */
    public Application getApplication(Consumer<GetApplicationOperationSpec> spec) {
        GetApplicationOperationSpec r = new GetApplicationOperationSpec(spec);
        return api.getApplication(r.applicationId());
    }

    /**
     * <p>
     * The method retrieves a list of available applications in API Gateway.
     */
    public Application getApplications() {
        return api.getApplications();
    }

    /**
     * <p>
     * Retrieve an Approval Request based on the approvalId.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>approvalId: approvalId for the Approval Request to be retrieved</li>
     * </ul>
     */
    public ApprovalRequest getApproval(Consumer<GetApprovalOperationSpec> spec) {
        GetApprovalOperationSpec r = new GetApprovalOperationSpec(spec);
        return api.getApproval(r.approvalId());
    }

    /**
     * <p>
     * The method retrieves the details of a specified approval configuration in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: This parameter specifies the ID of an approval configuration whose details are to be retrieved in API Gateway.</li>
     * </ul>
     */
    public ApprovalConfiguration getApprovalConfiguration(Consumer<GetApprovalConfigurationOperationSpec> spec) {
        GetApprovalConfigurationOperationSpec r = new GetApprovalConfigurationOperationSpec(spec);
        return api.getApprovalConfiguration(r.id());
    }

    /**
     * <p>
     * The method retrieves a list of available approval configurations in API Gateway.
     */
    public ApprovalConfiguration getApprovalConfigurations() {
        return api.getApprovalConfigurations();
    }

    /**
     * <p>
     * Retrieve all the approval requests waiting for the user. If the user is part of one or more approval team, then he/she will get the approval requests assigned for those teams.
     */
    public List<ApprovalResponsePayload> getApprovals() {
        return api.getApprovals();
    }

    /**
     * <p>
     * This request will return assertion element
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>assertionId: This path parameter is used to specify the assertion id which assertion details needs to retrieved.</li>
     * </ul>
     */
    public AssertionConfiguration getAssertion(Consumer<GetAssertionOperationSpec> spec) {
        GetAssertionOperationSpec r = new GetAssertionOperationSpec(spec);
        return api.getAssertion(r.assertionId());
    }

    /**
     * <p>
     * Retrieves the list of active global policies applicable to this API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to find the list of applicable global policies</li>
     * </ul>
     */
    public APIResponseGetGlobalPolicies getAssociatedGlobalPolicies(Consumer<GetAssociatedGlobalPoliciesOperationSpec> spec) {
        GetAssociatedGlobalPoliciesOperationSpec r = new GetAssociatedGlobalPoliciesOperationSpec(spec);
        return api.getAssociatedGlobalPolicies(r.apiId());
    }

    /**
     * <p>
     * The method retrieves the details of the Transaction Logger destination in API Gateway. Transaction Logger captures the API runtime invocations performed in API Gateway. The transaction logger data is written to a file or a database based on the configurations. Transactions events are written to the transaction logger only when the Transaction Logger is selected as a destination in Log Invocation Policy.
     */
    public AuditLogDestination getAuditLogAsDestination() {
        return api.getAuditLogAsDestination();
    }

    /**
     */
    public GatewayCacheConfig getCacheConfig() {
        return api.getCacheConfig();
    }

    /**
     * <p>
     * This REST Request is used to get the Service Result cache size for the API using apiID. An alternative REST API call for /serviceResultCache. Instead of specifying name and version, if you know API id you can directly use that id to get the number of cached responses for that API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: The id of API for which the cached response size is requested</li>
     * </ul>
     */
    public void getCacheDetailsByapiId(Consumer<GetCacheDetailsByapiIdOperationSpec> spec) {
        GetCacheDetailsByapiIdOperationSpec r = new GetCacheDetailsByapiIdOperationSpec(spec);
        api.getCacheDetailsByapiId(r.apiId());
    }

    /**
     * <p>
     * You can enable API caching in API Gateway to cache your native service's response. With caching, you can reduce the number of calls made to your endpoint and also improve the latency of the requests to your API. When you enable caching for a stage, API Gateway caches responses from your endpoint for a specified time to live period. API Gateway then responds to the request by looking up the endpoint response from the cache instead of making a request to your endpoint.
     *  Service Result cache can be configured for a API or Resource/method or Operation.
     *  This REST Request is used to get the Service Result cache size for an API using apiName and apiVersion.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiName: This query parameter is used to specify the API name for which the service result cache element size needs to be fetched.</li>
     *   <li>apiVersion: The version of the apiName parameter specified</li>
     * </ul>
     */
    public void getCacheDetailsByapiNameAndVersion(Consumer<GetCacheDetailsByapiNameAndVersionOperationSpec> spec) {
        GetCacheDetailsByapiNameAndVersionOperationSpec r = new GetCacheDetailsByapiNameAndVersionOperationSpec(spec);
        api.getCacheDetailsByapiNameAndVersion(r.apiName(), r.apiVersion());
    }

    /**
     * <p>
     * The method retrieves the communication details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     */
    public CSCommunicationDestination getCentraSiteCommunicationAsDestination() {
        return api.getCentraSiteCommunicationAsDestination();
    }

    /**
     * <p>
     * The method retrieves the SNMP details of the CentraSite destination in API Gateway. API Gateway can publish events and metrics to the configured CentraSite destination.
     */
    public CSSNMPDestination getCentraSiteSNMPAsDestination() {
        return api.getCentraSiteSNMPAsDestination();
    }

    /**
     * <p>
     * Retrieves the configured cluster settings from API Gateway.
     */
    public ClusterInfo getClusterSetting() {
        return api.getClusterSetting();
    }

    /**
     * <p>
     * This REST method is used to get the configured custom content types in API Gateway. Custom content types can be defined for base types XML,JSON and Text.These Custom types can be then used for payload processing in policies like Content based routing,Identify and access and Conditional error processing
     */
    public Object getCustomContentTypes() {
        return api.getCustomContentTypes();
    }

    /**
     * <p>
     * The method retrieves the details of the Database destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Database destination.
     */
    public Destination getDatabaseAsDestination() {
        return api.getDatabaseAsDestination();
    }

    /**
     * <p>
     * This method returns the cross dc configuration associated with the datacenter.
     */
    public RemotePortConfig getDataspaceConfiguration() {
        return api.getDataspaceConfiguration();
    }

    /**
     * <p>
     * This GET method is used to retrieve the list of IPs are denied ( IPs that violated the threat protection rules configured).
     */
    public List<String> getDeniedIPs() {
        return api.getDeniedIPs();
    }

    /**
     * <p>
     * Retrieves the configuration of gloabal IP access setting for authentication based restrictions in API Gateway
     */
    public DenyByIPForFailedAuthConfig getDenyByIPForFailedAuthConfig() {
        return api.getDenyByIPForFailedAuthConfig();
    }

    /**
     * <p>
     * The method retrieves the details of the Digital Events destination in API Gateway. Digital Event Services (DES) enables API Gateway to communicate by exchanging digital events. API Gateway can publish runtime events(example: policy violation,log invocation, error events etc), design time events (example: audit log events) and metrics to the configured DES destination.
     */
    public Destination getDigitalEventsAsDestination() {
        return api.getDigitalEventsAsDestination();
    }

    /**
     * <p>
     * Retrieves the requested document from API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>documentId: The unique identifier of the document for retrieving from API Gateway.</li>
     * </ul>
     */
    public Document getDocument(Consumer<GetDocumentOperationSpec> spec) {
        GetDocumentOperationSpec r = new GetDocumentOperationSpec(spec);
        return api.getDocument(r.documentId());
    }

    /**
     * <p>
     * The method retrieves the details of the Elasticsearch destination in API Gateway. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics to the configured Elasticsearch destination.
     */
    public ElasticsearchDestination getElasticsearchAsDestination() {
        return api.getElasticsearchAsDestination();
    }

    /**
     * <p>
     * The method retrieves the details of the Email destination in API Gateway. API Gateway can send alerts to the email ID specified either in the Log Invocation, Monitor Service Performance, Monitor Service Level Agreement, (or) Throttling Traffic Optimization policies through the configured Email destination.
     */
    public EmailDestination getEmailAsDestination() {
        return api.getEmailAsDestination();
    }

    /**
     * <p>
     * This REST method is used to get the configured error template and the value of the property - sendNativeProviderFault,which enables the server to forward the native error as it is.
     */
    public ErrorProcessing getErrorProcessingDetails() {
        return api.getErrorProcessingDetails();
    }

    /**
     * <p>
     * The method retrieves the details of the API Gateway destination. API Gateway can publish runtime events(example: policy violation, log invocation, error events etc), design time events (example: audit log events) and metrics data. By default, error events, lifecycle events, policy violation event, audit logs and performance data are published to API Gateway.
     */
    public Destination getGatewayAsDestination() {
        return api.getGatewayAsDestination();
    }

    /**
     * <p>
     * The method retrieves the details of a group in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: The path parameter specifies the id of a group whose details are to be retrieved.</li>
     * </ul>
     */
    public Group getGroup(Consumer<GetGroupOperationSpec> spec) {
        GetGroupOperationSpec r = new GetGroupOperationSpec(spec);
        return api.getGroup(r.groupId());
    }

    /**
     * <p>
     * The method retrieves list of all groups in API Gateway.
     */
    public Group getGroups() {
        return api.getGroups();
    }

    /**
     * <p>
     * The GET method retrieves the ipAccessMode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     *   <li>body: The request contains the IP access mode information.</li>
     * </ul>
     */
    public IPAccessMode getIPAccessMode(Consumer<GetIPAccessModeOperationSpec> spec) {
        GetIPAccessModeOperationSpec r = new GetIPAccessModeOperationSpec(spec);
        return api.getIPAccessMode(r.listenerKey(), r.body());
    }

    /**
     * <p>
     * The method retrieves list of installed language packs in API Gateway.
     */
    public List<String> getInstalledLanguages() {
        return api.getInstalledLanguages();
    }

    /**
     * <p>
     * Retrieve the integration server publish information for the API. Only REST and SOAP APIs are supported.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id of the API for which IntegrationServerPublishInfo is to be fetched</li>
     * </ul>
     */
    public ServiceRegistryPublishGetResponse getIntegrationServerPublishInfo(Consumer<GetIntegrationServerPublishInfoOperationSpec> spec) {
        GetIntegrationServerPublishInfoOperationSpec r = new GetIntegrationServerPublishInfoOperationSpec(spec);
        return api.getIntegrationServerPublishInfo(r.apiId());
    }

    /**
     * <p>
     * The method retrieves the specified JMS connection in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsConnId: This path parameter is used to specify the JMS connection id which JMS connection needs to be retrived.</li>
     * </ul>
     */
    public JMSConnectionAlias getJMSConnection(Consumer<GetJMSConnectionOperationSpec> spec) {
        GetJMSConnectionOperationSpec r = new GetJMSConnectionOperationSpec(spec);
        return api.getJMSConnection(r.jmsConnId());
    }

    /**
     * <p>
     * The method retrieves the specified JMS trigger in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jmsTriggerId: This path parameter is used to specify the JMS trigger id which JMS trigger needs to be retrieved.</li>
     * </ul>
     */
    public JMSTrigger getJMSTrigger(Consumer<GetJMSTriggerOperationSpec> spec) {
        GetJMSTriggerOperationSpec r = new GetJMSTriggerOperationSpec(spec);
        return api.getJMSTrigger(r.jmsTriggerId());
    }

    /**
     * <p>
     * This operation fetches JWT from APIGateway.To obtain the JWT from APIGateway the client has to has to pass the basic authentication credentials.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>appId: This parameter is used to specify an application id for which APIGateway generates a JWT</li>
     * </ul>
     */
    public JWT getJsonWebToken(Consumer<GetJsonWebTokenOperationSpec> spec) {
        GetJsonWebTokenOperationSpec r = new GetJsonWebTokenOperationSpec(spec);
        return api.getJsonWebToken(r.appId());
    }

    /**
     * <p>
     * Generate JWT token with custom claims supplied in the request
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter describes the request payload of an application that is to be created in API Gateway.</li>
     * </ul>
     */
    public JWTServiceOutput getJsonWebTokenNew(Consumer<GetJsonWebTokenNewOperationSpec> spec) {
        GetJsonWebTokenNewOperationSpec r = new GetJsonWebTokenNewOperationSpec(spec);
        return api.getJsonWebTokenNew(r.body());
    }

    /**
     * <p>
     * Retrieves the configured Kerberos settings from API Gateway.
     */
    public KerberosSettings getKerberosSetting() {
        return api.getKerberosSetting();
    }

    /**
     * <p>
     * The method retrieves the details of the default keystore, truststore and alias settings in API Gateway. You might want to configure API Gateway to refer to a default keystore, truststore, or both, before deploying any SOAP message flows that require signature, encryption, X.509 authentication, and so on, as configured in the Inbound Authentication - Message policy. The default keystore and truststore are that you want API Gateway to use for the incoming secured messages
     */
    public KeystoreTruststore getKeyStoreTrustore() {
        return api.getKeyStoreTrustore();
    }

    /**
     * <p>
     * The method gets keystore matching the name in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>keyStoreName: Keystore name to identify the corresponding Keystore</li>
     * </ul>
     */
    public List<KeyStore> getKeystore(Consumer<GetKeystoreOperationSpec> spec) {
        GetKeystoreOperationSpec r = new GetKeystoreOperationSpec(spec);
        return api.getKeystore(r.keyStoreName());
    }

    /**
     * <p>
     * The method gets all keystores available in API Gateway.
     */
    public List<KeyStore> getKeystores() {
        return api.getKeystores();
    }

    /**
     * <p>
     * Retrieves the LDAP configuration settings configured in the API Gateway
     */
    public InputLdapConfiguration getLdapConfig() {
        return api.getLdapConfig();
    }

    /**
     * <p>
     * Retrieves the license details from API Gateway.
     */
    public LicenseDetail getLicenseDetails() {
        return api.getLicenseDetails();
    }

    /**
     * <p>
     * This method returns the grpc listener configuration associated with the datacenter.
     */
    public ListenerConfig getListenerConfiguration() {
        return api.getListenerConfiguration();
    }

    /**
     * <p>
     * The method retrieves the details of the Load Balancer configuration in API Gateway.
     */
    public LoadBalancer getLoadBalancers() {
        return api.getLoadBalancers();
    }

    /**
     * <p>
     * Retrieves the locked accounts in API Gateway
     */
    public LockedAccounts getLockedAccounts() {
        return api.getLockedAccounts();
    }

    /**
     * <p>
     * APIGateway has log files from different components.This method is used to retrieve the log settings of various components used by APIGateway.
     */
    public LogConfiguration getLogConfig() {
        return api.getLogConfig();
    }

    /**
     * <p>
     * Returns the list of runtime event types. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs. You can use these eventType to scope the archive/purge operation.
     * The user should be part of API-Gateway-Administrators group or else should have 'Manage purge and restore runtime events' privilege to perform this operation.
     */
    public void getMappings() {
        api.getMappings();
    }

    /**
     * <p>
     * This retrieves the master password properties in API Gateway.
     */
    public MasterPasswordProperties getMasterPasswordProperties() {
        return api.getMasterPasswordProperties();
    }

    /**
     * <p>
     * RRetrieves the current status of the migration action which is invoked in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>action: The migration action for which the status to be sent</li>
     * </ul>
     */
    public void getMigrationStatus(Consumer<GetMigrationStatusOperationSpec> spec) {
        GetMigrationStatusOperationSpec r = new GetMigrationStatusOperationSpec(spec);
        api.getMigrationStatus(r.action());
    }

    /**
     * <p>
     * You can use API Gateway to disable access for certain mobile application versions on a predefined set of mobile platforms. By registering the required devices and applications and disabling access to these versions, you ensure that all users use the latest versions of the applications and take advantage of the latest security and functional updates.
     */
    public MobileApplicationConfiguration getMobileApplicationConfigurations() {
        return api.getMobileApplicationConfigurations();
    }

    /**
     * <p>
     * This method retrieves the requested OAuth scope mapping. OAuth scope mappings map the authorization server scope with APIs or API scopes
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>oauthScopeId: The path parameter specifies the id of an OAuth scope mapping that is to be retrieved from API Gateway.</li>
     * </ul>
     */
    public GatewayScope getOAuthScope(Consumer<GetOAuthScopeOperationSpec> spec) {
        GetOAuthScopeOperationSpec r = new GetOAuthScopeOperationSpec(spec);
        return api.getOAuthScope(r.oauthScopeId());
    }

    /**
     * <p>
     * This method retrieves a list of available OAuth scope mappings in API Gateway. OAuth scope mappings map the authorization server scope with APIs or API scopes
     */
    public GatewayScope getOAuthScopes() {
        return api.getOAuthScopes();
    }

    /**
     * <p>
     * Retrieves the list of all available outbound proxy server aliases in API Gateway.
     */
    public OutboundProxyGetResponse getOutboundProxies() {
        return api.getOutboundProxies();
    }

    /**
     * <p>
     * To get details for a given package id
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: Id of the Package</li>
     * </ul>
     */
    public PackageGetResponseContainer getPackageById(Consumer<GetPackageByIdOperationSpec> spec) {
        GetPackageByIdOperationSpec r = new GetPackageByIdOperationSpec(spec);
        return api.getPackageById(r.packageId());
    }

    /**
     * <p>
     * Retrieves the list of packages of an API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to find the associated packages</li>
     * </ul>
     */
    public List<ModelPackage> getPackagesForAPI(Consumer<GetPackagesForAPIOperationSpec> spec) {
        GetPackagesForAPIOperationSpec r = new GetPackagesForAPIOperationSpec(spec);
        return api.getPackagesForAPI(r.apiId());
    }

    /**
     * <p>
     * Retrieves the password expiry settings configured in API Gateway
     */
    public PasswordExpirySettings getPasswordExpirySettings() {
        return api.getPasswordExpirySettings();
    }

    /**
     * <p>
     * Retrieves the password restrictions settings configured in API Gateway
     */
    public PasswordRestrictions getPasswordRestrictions() {
        return api.getPasswordRestrictions();
    }

    /**
     * <p>
     * This request is used to retrieve the details of particular plan along with rate limit and quota policy ids along with associated package meta data.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>planId: Id of a Plan</li>
     * </ul>
     */
    public PlanGetResponse getPlanById(Consumer<GetPlanByIdOperationSpec> spec) {
        GetPlanByIdOperationSpec r = new GetPlanByIdOperationSpec(spec);
        return api.getPlanById(r.planId());
    }

    /**
     * <p>
     * To get list of all plans associated to the given package id
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: Id of the Package</li>
     * </ul>
     */
    public PackagePlansResponseContainer getPlansForPackageById(Consumer<GetPlansForPackageByIdOperationSpec> spec) {
        GetPlansForPackageByIdOperationSpec r = new GetPlansForPackageByIdOperationSpec(spec);
        return api.getPlansForPackageById(r.packageId());
    }

    /**
     * <p>
     * This REST request is used to retrieve list of all policies from API Gateway. This can also be used to retrieve details for particular set of policies by specifying the policy ids in the query string.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyIds: This query parameter is used to retrieve policy details of particular set of policies. The policy IDs need to be separated using ',' to specify more than one policy id</li>
     *   <li>stage: This query parameter is used to retrieve the Threat Protection policies created in API Gateway. The value of this query parameter should be threat protection, if other values specified it wont respect that value and return all the policies in the API Gateway</li>
     *   <li>policyType: This query parameter is used to retrieve policy details for a list of policies of a particular policy type. The policy type can be template or global. If the policy type is template then policy details of all the policy templates is returned. If the policy type is global then the policy details of global policies is returned.If any other policy type is specified all policies are returned</li>
     * </ul>
     */
    public List<Policy> getPolicies(Consumer<GetPoliciesOperationSpec> spec) {
        GetPoliciesOperationSpec r = new GetPoliciesOperationSpec(spec);
        return api.getPolicies(r.policyIds(), r.stage(), r.policyType());
    }

    /**
     * <p>
     * This request will return policy action details of the policy action based on the id specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionId: This path parameter is used to specify the policy action id which policy action details needs to retrieved.</li>
     * </ul>
     */
    public PolicyActionWrapper getPolicyAction(Consumer<GetPolicyActionOperationSpec> spec) {
        GetPolicyActionOperationSpec r = new GetPolicyActionOperationSpec(spec);
        return api.getPolicyAction(r.policyActionId());
    }

    /**
     * <p>
     * This REST request is used to retrieve the policy details for a specified policy in API Gateway. If policy id is available then the policy details is sent in response.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id for which the policy details needs to be retrieved</li>
     * </ul>
     */
    public Policy getPolicyById(Consumer<GetPolicyByIdOperationSpec> spec) {
        GetPolicyByIdOperationSpec r = new GetPolicyByIdOperationSpec(spec);
        return api.getPolicyById(r.policyId());
    }

    /**
     * <p>
     * This REST Request is used to get the list of policy stages available in API gateway. It will also show the list of policies (template key of each policy) associated with each stage. 
     */
    public List<PolicyEnforcementStage> getPolicyStages() {
        return api.getPolicyStages();
    }

    /**
     * <p>
     * The GET method retrieves an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     * </ul>
     */
    public Port getPort(Consumer<GetPortOperationSpec> spec) {
        GetPortOperationSpec r = new GetPortOperationSpec(spec);
        return api.getPort(r.listenerKey());
    }

    /**
     * <p>
     * The GET method retrieves the accessMode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     * </ul>
     */
    public Port getPortAccessMode(Consumer<GetPortAccessModeOperationSpec> spec) {
        GetPortAccessModeOperationSpec r = new GetPortAccessModeOperationSpec(spec);
        return api.getPortAccessMode(r.listenerKey());
    }

    /**
     * <p>
     * The GET method retrieves port configurations
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pkg: The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot.</li>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within a package.</li>
     * </ul>
     */
    public Listeners getPorts(Consumer<GetPortsOperationSpec> spec) {
        GetPortsOperationSpec r = new GetPortsOperationSpec(spec);
        return api.getPorts(r.pkg(), r.listenerKey());
    }

    /**
     * <p>
     * The GET method retrieves the definition of the primary port.
     */
    public MessageWithPortReference getPrimaryPort() {
        return api.getPrimaryPort();
    }

    /**
     * <p>
     * Retrieve a promotion based on the promotion id.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>promotionId: Promotion Id for the promotion to be retrieved</li>
     * </ul>
     */
    public Promotion getPromotion(Consumer<GetPromotionOperationSpec> spec) {
        GetPromotionOperationSpec r = new GetPromotionOperationSpec(spec);
        return api.getPromotion(r.promotionId());
    }

    /**
     * <p>
     * This REST operation is used to retrieve the promotions history with each promotion entry provides the promotion name, promoted by whom, when it's promoted and the promoted assets status
     */
    public List<Promotion> getPromotions() {
        return api.getPromotions();
    }

    /**
     * <p>
     * The method retrieves a list of all hostlists for which outbound proxy servers are skipped. Note: proxyBypass Id is always proxyBypass
     */
    public ProxyBypass getProxyBypass() {
        return api.getProxyBypass();
    }

    /**
     * <p>
     * This API allows you to retrieve the details of the published packages that the API is part of
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>portalGatewayId: Id of the API Portal configuration for retrieval of published packages information</li>
     *   <li>apiId: Id of the API published from API Gateway to API Portal</li>
     * </ul>
     */
    public Set<Object> getPublishedPackages(Consumer<GetPublishedPackagesOperationSpec> spec) {
        GetPublishedPackagesOperationSpec r = new GetPublishedPackagesOperationSpec(spec);
        return api.getPublishedPackages(r.portalGatewayId(), r.apiId());
    }

    /**
     * <p>
     * Returns the quiesce mode setting in API Gateway
     */
    public QuiesceMode getQuiesceMode() {
        return api.getQuiesceMode();
    }

    /**
     * <p>
     * The method retrieves a list of registered APIs for the specified application in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application whose registered APIs are to be retrieved in API Gateway.</li>
     * </ul>
     */
    public void getRegisteredApis(Consumer<GetRegisteredApisOperationSpec> spec) {
        GetRegisteredApisOperationSpec r = new GetRegisteredApisOperationSpec(spec);
        api.getRegisteredApis(r.applicationId());
    }

    /**
     * <p>
     * This method returns the remotes (other datacenters) configuration associated with the datacenter.
     */
    public RemotePortConfig getRingConfiguration() {
        return api.getRingConfiguration();
    }

    /**
     * <p>
     * Retrieve a rollback based on the rollback id.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>rollbackId: Rollback Id for the rollback to be retrieved</li>
     * </ul>
     */
    public Rollback getRollback(Consumer<GetRollbackOperationSpec> spec) {
        GetRollbackOperationSpec r = new GetRollbackOperationSpec(spec);
        return api.getRollback(r.rollbackId());
    }

    /**
     * <p>
     * This REST operation is used to retrieve the list of possible rollbacks a user can do from the local (target) API Gateway instance. Each rollback entry was created when a promotion of assets to the local (target) API Gateway instance from another stage
     */
    public List<Rollback> getRollbacks() {
        return api.getRollbacks();
    }

    /**
     * <p>
     * The method retrieves the details of a rule in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleId: The path parameter specifies the id of a rule that is to be retrieved.</li>
     * </ul>
     */
    public Rule getRule(Consumer<GetRuleOperationSpec> spec) {
        GetRuleOperationSpec r = new GetRuleOperationSpec(spec);
        return api.getRule(r.ruleId());
    }

    /**
     * <p>
     * The method retrieves the details of the SNMP destination in API Gateway. API Gateway can publish events and performance metrics data to the configured 3rd party SNMP server.
     */
    public SNMPDestination getSNMPAsDestination() {
        return api.getSNMPAsDestination();
    }

    /**
     * <p>
     * Retrieves the SSO configuration in API Gateway
     */
    public SSOConfiguration getSSOConfiguration() {
        return api.getSSOConfiguration();
    }

    /**
     * <p>
     * Retrieve scopes of an API based on the scope name
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to retrieve the versions</li>
     *   <li>scopeName: Name of the scope</li>
     * </ul>
     */
    public List<ScopeResourceIndex> getScopeByScopeName(Consumer<GetScopeByScopeNameOperationSpec> spec) {
        GetScopeByScopeNameOperationSpec r = new GetScopeByScopeNameOperationSpec(spec);
        return api.getScopeByScopeName(r.apiId(), r.scopeName());
    }

    /**
     * <p>
     * An API Scope is a collection of resources or operations in an API. Users can create multiple scopes for a single API. Policies can be attached to an API level or scope level. This method retrieves the scopes of an API.
     * You can create, modify or delete the scopes in the update API operation using PUT /api/{apiId}
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to retrieve the versions</li>
     * </ul>
     */
    public List<ScopeResourceIndex> getScopes(Consumer<GetScopesOperationSpec> spec) {
        GetScopesOperationSpec r = new GetScopesOperationSpec(spec);
        return api.getScopes(r.apiId());
    }

    /**
     * <p>
     * Retrieve the service registry publish information for the API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id of the API for which ServiceRegistryPublishInfo is to be fetched</li>
     * </ul>
     */
    public ServiceRegistryPublishGetResponse getServiceRegistryPublishInfo(Consumer<GetServiceRegistryPublishInfoOperationSpec> spec) {
        GetServiceRegistryPublishInfoOperationSpec r = new GetServiceRegistryPublishInfoOperationSpec(spec);
        return api.getServiceRegistryPublishInfo(r.apiId());
    }

    /**
     * <p>
     * This method retrieves the list of extended settings and watt properties from API Gateway.
     */
    public ExtendedSettingsOutput getSettings() {
        return api.getSettings();
    }

    /**
     * <p>
     * Download the API definition that was used to create the API. This is applicable only for SOAP APIs.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to download the source content</li>
     * </ul>
     */
    public List<Multipart> getSource(Consumer<GetSourceOperationSpec> spec) {
        GetSourceOperationSpec r = new GetSourceOperationSpec(spec);
        return api.getSource(r.apiId());
    }

    /**
     * <p>
     * This REST operation is used to retrieve a particular stage object based on a stage id
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>stageId: Stage Id for the stage to be retrieved</li>
     * </ul>
     */
    public Stage getStage(Consumer<GetStageOperationSpec> spec) {
        GetStageOperationSpec r = new GetStageOperationSpec(spec);
        return api.getStage(r.stageId());
    }

    /**
     * <p>
     * This REST operation is used to retrieve all the configured stages
     */
    public List<Stage> getStages() {
        return api.getStages();
    }

    /**
     * <p>
     * The method retrieves a list of all strategies in API Gateway.
     */
    public OneOfStrategyModel getStrategies() {
        return api.getStrategies();
    }

    /**
     * <p>
     * The method retrieves the details of a specified strategy in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>strategyId: This parameter specifies the ID of a strategy whose details are to be retrieved in API Gateway.</li>
     * </ul>
     */
    public OneOfStrategyModel getStrategy(Consumer<GetStrategyOperationSpec> spec) {
        GetStrategyOperationSpec r = new GetStrategyOperationSpec(spec);
        return api.getStrategy(r.strategyId());
    }

    /**
     * <p>
     * This endpoint is used to fetch the application details of the subscription.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: Application id to view the details of the application</li>
     * </ul>
     */
    public Application getSubscriptionBySubscriptionID(Consumer<GetSubscriptionBySubscriptionIDOperationSpec> spec) {
        GetSubscriptionBySubscriptionIDOperationSpec r = new GetSubscriptionBySubscriptionIDOperationSpec(spec);
        return api.getSubscriptionBySubscriptionID(r.applicationId());
    }

    /**
     * <p>
     * Retrieve trace information for an API invocation event specified by its correlationID.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>correlationID: Correlation ID of the request. Correlation ID can be retrieved from the transaction event of the request.</li>
     * </ul>
     */
    public Map<String, List<TraceLog>> getTracer(Consumer<GetTracerOperationSpec> spec) {
        GetTracerOperationSpec r = new GetTracerOperationSpec(spec);
        return api.getTracer(r.correlationID());
    }

    /**
     * <p>
     * This method can be used to retrieve the transaction events for a given API/Application/Plan/Package for a specific period of time. Multiple request parameters of this method provide options to specify the request criteria to match the expected result and most of these input parameters supports regular expression in their values. Along with the mandatory parameters - fromDate and toDate, any one of the other filter criteria should be passed in the request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fromDate: This is the date from which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter</li>
     *   <li>toDate: This is the date to which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter</li>
     *   <li>apiName: The name of the API  for which the invocation details is required.The exact name must be provided or regular expressions can be used like API_.*</li>
     *   <li>apiVersion: The version of the API</li>
     *   <li>apiId: The system generated id for an API.The id of an can be retrieved from the API details screen</li>
     *   <li>applicationName: The name of the Application for which the invocation details is required.The exact name must be provided or regular expressions can be used like APP_.*</li>
     *   <li>applicationId: The system generated id for an Application.The id of an can be retrieved from the Application details screen</li>
     *   <li>packageName: The name of the Package for which the invocation details is required.The exact name must be provided or regular expressions can be used like Package_.*</li>
     *   <li>packageId: The system generated id for a Package.The id of an can be retrieved from the Package details screen</li>
     *   <li>planName: The name of the Plan  for which the invocation details is required.The exact name must be provided or regular expressions can be used like Plan_.*</li>
     *   <li>planId: The system generated id for a Plan.The id of an can be retrieved from the Plan details screen</li>
     *   <li>from: This parameter specifies the index from which the data has to be retrieved from the store. It is mainly used during pagination where the data is retrieved in batches</li>
     *   <li>size: This parameter specifies the number of records that should be present in the response. This can be combined with the parameter - from to get the records in batches during pagination.</li>
     * </ul>
     */
    public TransactionEvent getTransactions(Consumer<GetTransactionsOperationSpec> spec) {
        GetTransactionsOperationSpec r = new GetTransactionsOperationSpec(spec);
        return api.getTransactions(r.fromDate(), r.toDate(), r.apiName(), r.apiVersion(), r.apiId(), r.applicationName(), r.applicationId(), r.packageName(), r.packageId(), r.planName(), r.planId(), r.from(), r.size());
    }

    /**
     * <p>
     * This method can be used to retrieve the number of transaction events for a given API/Application/Plan/Package for a specific period of time. Multiple request parameters of this method provide options to specify the request criteria to match the expected result and most of these input parameters supports regular expression in their values. Along with the mandatory parameters - fromDate and toDate, any one of the other filter criteria should be passed in the request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fromDate: This is the date from which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter</li>
     *   <li>toDate: This is the date to which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter</li>
     *   <li>apiName: The name of the API  for which the invocation count is required.The exact name must be provided or regular expressions can be used like API_.*</li>
     *   <li>apiVersion: The version of the API</li>
     *   <li>apiId: The system generated id for an API.The id of an can be retrieved from the API details screen</li>
     *   <li>applicationName: The name of the Application for which the invocation count is required.The exact name must be provided or regular expressions can be used like APP_.*</li>
     *   <li>applicationId: The system generated id for an Application.The id of an can be retrieved from the Application details screen</li>
     *   <li>packageName: The name of the Package for which the invocation count is required.The exact name must be provided or regular expressions can be used like Package_.*</li>
     *   <li>packageId: The system generated id for a Package.The id of an can be retrieved from the Package details screen</li>
     *   <li>planName: The name of the Plan  for which the invocation count is required.The exact name must be provided or regular expressions can be used like Plan_.*</li>
     *   <li>planId: The system generated id for a Plan.The id of an can be retrieved from the Plan details screen</li>
     * </ul>
     */
    public TransactionResponse getTransactionsCount(Consumer<GetTransactionsCountOperationSpec> spec) {
        GetTransactionsCountOperationSpec r = new GetTransactionsCountOperationSpec(spec);
        return api.getTransactionsCount(r.fromDate(), r.toDate(), r.apiName(), r.apiVersion(), r.apiId(), r.applicationName(), r.applicationId(), r.packageName(), r.packageId(), r.planName(), r.planId());
    }

    /**
     * <p>
     * Retrieves an existing truststore matching the given name from API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>trustStoreName: Truststore name to identify the corresponding trust store in API Gateway</li>
     * </ul>
     */
    public List<TrustStore> getTruststore(Consumer<GetTruststoreOperationSpec> spec) {
        GetTruststoreOperationSpec r = new GetTruststoreOperationSpec(spec);
        return api.getTruststore(r.trustStoreName());
    }

    /**
     * <p>
     * Retrieves all available truststores from API Gateway.
     */
    public List<TrustStore> getTruststores() {
        return api.getTruststores();
    }

    /**
     * <p>
     * Retrieves all URL Aliases or a URL Alias with a particular ID in API Gateway (if the query parameter alias is provided).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>alias: The name of the URL alias to be retrieved. If this query parameter is provided, then it retrieves the URL Aliases identified by the given alias.</li>
     * </ul>
     */
    public URLAliasesGetResponse getURLALias(Consumer<GetURLALiasOperationSpec> spec) {
        GetURLALiasOperationSpec r = new GetURLALiasOperationSpec(spec);
        return api.getURLALias(r.alias());
    }

    /**
     * <p>
     * This end point is used to fetch the aggregated usage of the application id for current cycle. This will return the usage only if the subscription is active. For the historic or detailed transaction wise usage details use /transactionalEvents/_search API.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: Application id to view the usage details of the application</li>
     * </ul>
     */
    public Usage getUsageBySubscriptionID(Consumer<GetUsageBySubscriptionIDOperationSpec> spec) {
        GetUsageBySubscriptionIDOperationSpec r = new GetUsageBySubscriptionIDOperationSpec(spec);
        return api.getUsageBySubscriptionID(r.applicationId());
    }

    /**
     * <p>
     * The method retrieves the details of an user in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The path parameter specifies the id of an user whose details are to be retrieved.</li>
     * </ul>
     */
    public User getUser(Consumer<GetUserOperationSpec> spec) {
        GetUserOperationSpec r = new GetUserOperationSpec(spec);
        return api.getUser(r.userId());
    }

    /**
     * <p>
     * The method retrieves list of all users in API Gateway.
     */
    public User getUsers() {
        return api.getUsers();
    }

    /**
     * <p>
     * Retrieve all the versions of the API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to retrieve the versions</li>
     * </ul>
     */
    public APIResponseGetAPIs getVersions(Consumer<GetVersionsOperationSpec> spec) {
        GetVersionsOperationSpec r = new GetVersionsOperationSpec(spec);
        return api.getVersions(r.apiId());
    }

    /**
     * <p>
     * The method retrieves the details of a webhook in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The path parameter specifies the id of a webhook whose details are to be retrieved.</li>
     * </ul>
     */
    public Webhook getWebhook(Consumer<GetWebhookOperationSpec> spec) {
        GetWebhookOperationSpec r = new GetWebhookOperationSpec(spec);
        return api.getWebhook(r.id());
    }

    /**
     * <p>
     * The method retrieves the specified Webservice endpoint in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>webserviceEndpointId: This path parameter is used to specify the Webservice endpoint id which Webservice endpoint needs to be retrived.</li>
     * </ul>
     */
    public WebserviceEndpointAlias getWebserviceEndpoint(Consumer<GetWebserviceEndpointOperationSpec> spec) {
        GetWebserviceEndpointOperationSpec r = new GetWebserviceEndpointOperationSpec(spec);
        return api.getWebserviceEndpoint(r.webserviceEndpointId());
    }

    /**
     * <p>
     * The method retrieves the details of the whitelisting IPs configuration in API Gateway.
     */
    public WhiteListedIPs getWhiteListedIPs() {
        return api.getWhiteListedIPs();
    }

    /**
     * <p>
     * This method can be used for importing the API Gateway archive as well as exporting the assets as an archive. If the request is made with x-HTTP-Method-Override HTTP header with value as GET, then this method will export asset. It will require the body param using which you can specify the filtering criteria and include options for the API Gateway assets that need to be exported.
     * 
     * If the HTTP header is not specified, then this method can be used to import the API Gateway archive. You can control the import settings with overwrite and preserveAssetState query parameters.
     *  Here are some sample payloads for different export scenarios.
     * 
     * 1. Export all API Gateway assets.
     *  Payload: {}
     * 
     * 2. Export all APIs
     *  Payload: { "types": ["api"] }
     * 
     * 3. Export all APIs with registered Application
     *  Payload: {
     * "types" : ["api"],
     * "includeOptions" :{
     * "includeApplications" :false
     * }
     * }
     * 
     * 4. Export only APIs with name contains "API Gateway"
     *  Payload: {
     * "types" : ["api"],
     * "scope" : [
     * {"attributeName" : "apiName",
     * "keyword" : ".*API Gateway.*"
     * }],
     * "includeOptions" :{
     * "includeApplications" :false
     * }
     * }
     * 
     * 5. Export API with specific ids only
     *  Payload: {
     * "types" : ["api"],
     * "scope" : [
     * {"attributeName" : "id",
     * "keyword" : "1c36033a-ecb6-41ce-ad66-bada5cebe85e|8d505388-5524-4df5-bd3c-62c4bb5f41d0"
     * }],
     * "includeOptions" :{
     * "includeApplications" :true
     * }
     * }
     * 
     * 6. Export API with name starts with API Gateway and description contains search
     *  Payload: {
     * "types" : ["api"],
     * "scope" : [
     * {"attributeName" : "apiName",
     * "keyword" : "API Gateway.*"
     * },
     * {
     * "attributeName" : "apiDescription",
     * "keyword" : ".*search.*"
     * }],
     * "condition" : "and",
     * "includeOptions" :{
     * "includeApplications" :false
     * }
     * }
     * 
     * 7. Export all Policy
     *  Payload: {
     * "types" : ["policy"]
     * }
     * 
     * 8. Global Policy Alone
     *  Payload: {
     * "types" : ["policy"],
     * "scope":[
     * {
     * "attributeName" : "policyScope",
     * "keyword" : "GLOBAL"
     * }]
     * }
     * 
     * 9. Export Threat Protection Rule
     *  Payload: {
     * "types" : ["policy"],
     * "scope":[
     * {
     * "attributeName" : "policyEnforcements.stageKey",
     * "keyword" : "threatProtection"
     * }]
     * }
     * 
     * 10. Export All Policy Actions
     *  Payload: {
     * "types" : ["policy_action"]
     * }
     * 
     * 11. Export All Threat Protection rules and policy
     *  Payload: {
     * "types" : ["policy_action", "policy"],
     * "scope":[
     * {
     * "attributeName" : "policyEnforcements.stageKey",
     * "keyword" : "threatProtection"
     * }, {
     * "attributeName" : "id",
     * "keyword" : "globalipdos|ipdos"
     * }],
     * "condition" : "or"
     * }
     * 
     * 12. Export all aliases
     *  Payload: {
     * "types" : ["alias"]
     * }
     * 
     * 13. Export all applications
     *  Payload: {
     * "types" : ["application"]
     * }
     * 
     * 14. Export all application with out including associated APIs
     *  Payload: {
     * "types" : ["application"],
     * "includeOptions" : {
     * "includeApis": false
     * }
     * }
     * 
     * 15. Export All Assertions
     *  Payload: {
     * "types" : ["assertion"]
     * }
     * 
     * 16. Export all API Plans
     *  Payload: {
     * "types" : ["plan"]
     * }
     * 
     * 17. Export all API Packages
     *  Payload: {
     * "types" : ["package"]
     * }
     * 
     * 18. Export all packages along with subscription but with out the registered Applications for the associated APIs.
     *  Payload: {
     * "types" : ["package"],
     * "includeOptions":{
     * "includeApis" : false,
     * "includeApplications" : false,
     * "includeSubscriptions" : true
     * }
     * }
     * 
     * 19. Export all subscriptions
     *  Payload: {
     * "types" : ["subscription"]
     * }
     * 
     * 20. Export all Administrator Settings
     *  Payload: {
     * "types" : ["administrator_setting"]
     * }
     * 
     * 21. Export specific Administrator Settings
     *  Payload: {
     * "types" : ["administrator_setting"]
     * ,
     * "scope" : [
     * {
     * "attributeName": "configId",
     * "keyword": "loadBalancer|gatewayDestinationConfig"
     * }
     *  ]
     * }. Available settings: loadBalancer, keystore, mobileApp, extended, samlsso, misc, dashboard, customContentTypes, errorProcessing, auditlogDestinationConfig, gatewayDestinationConfig, jdbcDestinationConfig, desDestinationConfig, elasticsearchDestinationConfig, snmpDestinationConfig, emailDestinationConfig, apiPortalDestinationConfig, samlIssuer, logConfig, passwordRestrictions, passwordExpiry, accountLockSettings, ldapConfig, settings, cache, apiCallBackSettings
     * 
     * 22. Export all approval configurations
     *  Payload: {
     * "types" : ["approval_configuration"]
     * }
     * 
     * 23. Export all outbound proxy aliases
     *  Payload: {
     * "types" : ["outbound_proxy"]
     * }
     * 
     * 24. Export all URL aliases
     *  Payload: {
     * "types" : ["url_alias"]
     * }
     * 
     * 25. Export all keystore aliases
     *  Payload: {
     * "types" : ["keystore"]
     * }
     * 
     * 26. Export all truststore aliases
     *  Payload: {
     * "types" : ["truststore"]
     * }
     * 
     * 27. Export all kerberos settings
     *  Payload: {
     * "types" : ["kerberos_setting"]
     * }
     * 
     * 28. Export all JNDI provider aliases
     *  Payload: {
     * "types" : ["jndi_provider_alias"]
     * }
     * 
     * 29. Export all JMS connection aliases
     *  Payload: {
     * "types" : ["jms_connection_alias"]
     * }
     * 
     * 30. Export all JMS triggers
     *  Payload: {
     * "types" : ["jms_trigger"]
     * }
     * 
     * 31. Export all web service endpoint aliases
     *  Payload: {
     * "types" : ["web_service_endpoint_alias"]
     * }
     * 
     * 32. Export all users
     *  Payload: {
     * "types" : ["users"]
     * }
     * 
     * 33. Export all groups
     *  Payload: {
     * "types" : ["groups"]
     * }
     * 
     * 34. Export all teams
     *  Payload: {
     * "types" : ["accessprofiles"]
     * }
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>overwrite: This parameter specifies the import option to define the artifact types that can be overwritten during import. The parameter enables you to specify overwriting of APIs, policies, policy actions, aliases, applications, configurations, approval configurations, outbound proxies, URL aliases, keyStores, trustStores, JNDI provider aliases, JMS connection aliases, JMS triggers, webservice endpoint aliases, users, groups, teams, kerberos settings, plans and packages.    The wildcard "*" enables you to specify all types. For example, the following request enables you to overwrite APIs during import: POST /rest/apigateway/archive?overwrite=apis Whereas, overwriting all asset types during import can be specified as follows: POST /rest/apigateway/archive?overwrite=*</li>
     *   <li>fixingMissingVersions: </li>
     *   <li>preserveAssetState: This parameter is used to specify whether the asset state needs to be preserved after importing the assets in to API Gateway. By default this value will be true. If false specified the assets will be imported and wont preserve asset state after importing asset.</li>
     *   <li>policies: This parameter identifies the policies to be imported. The wildcard "*" selects all the policies.  For example a single policy can be imported with its id using the following request: POST /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a  Whereas, all the policies can be imported using the following request: POST /rest/apigateway/archive?policies=*</li>
     *   <li>apis: This parameter identifies the APIs to be imported. The wildcard "*" selects all the APIs.  For example a single API can be imported using the following request: POST /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e  Whereas, all the APIs can be imported using the following request: POST /rest/apigateway/archive?apis=*</li>
     *   <li>aliases: This parameter identifies the aliases to be imported.  The wildcard "*" selects all aliases. For example, a single alias can be imported using the following requrest: POST /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the APIs can be imported using the following request: POST /rest/apigateway/archive?alias=*</li>
     *   <li>applications: This parameter identifies the applications to be imported.  The wildcard "*" selects all applications. For example, a single application can be imported using the following requrest: POST /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the applications can be imported using the following request: POST /rest/apigateway/archive?applications=*</li>
     *   <li>approvalConfigurations: This parameter identifies the approval configurations to be imported.  The wildcard "*" selects all approval configurations. For example, a single approval configuration can be imported using the following request: POST /rest/apigateway/archive?approvalConfigurations=createApplication  Whereas, all the approval configurations can be imported using the following request:  POST /rest/apigateway/archive?approvalConfigurations=*</li>
     *   <li>outboundProxies: This parameter identifies the outbound proxy aliases to be imported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.  For example a single outbound proxy alias can be imported using the following request: POST /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias  Whereas, all the outbound proxy aliases can be imported using the following request: POST /rest/apigateway/archive?outboundProxies=*</li>
     *   <li>urlAliases: This parameter identifies the URL aliases to be imported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.  For example, a single URL alias can be imported using the following request: POST /rest/apigateway/archive?urlAliases=testUrlAlias  Whereas, all the URL aliases can be imported using the following request: POST /rest/apigateway/archive?testUrlAlias=*</li>
     *   <li>keyStores: This parameter identifies the keystore aliases to be imported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.  For example, a single keystore alias can be imported using the following request: POST /rest/apigateway/archive?keyStores=test_keystore  Whereas, all the keystore aliases can be imported using the following request: POST /rest/apigateway/archive?keyStores=*</li>
     *   <li>trustStores: This parameter identifies the truststore aliases to be imported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.  For example, a single truststore alias can be imported using the following request: POST /rest/apigateway/archive?trustStores=test_truststore  Whereas, all the truststore aliases can be imported using the following request: POST /rest/apigateway/archive?trustStores=*</li>
     *   <li>jnDIProviderAliases: This parameter identifies the JNDI provider aliases to be imported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be imported using the following request: POST /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias  Whereas, all the JNDI provider aliases can be imported using the following request: POST /rest/apigateway/archive?JNDIProviderAliases=*</li>
     *   <li>jmSConnectionAliases: This parameter identifies the JMS connection aliases to be imported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be imported using the following request: POST /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias  Whereas, all the JMS connection aliases can be imported using the following request: POST /rest/apigateway/archive?JMSConnectionAliases=*</li>
     *   <li>jmSTriggers: This parameter identifies the JMS triggers to be imported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.  For example, a single JMS trigger can be imported using the following request: POST /rest/apigateway/archive?JMSTriggers=test_jmsTrigger  Whereas, all the JMS triggers can be imported using the following request: POST /rest/apigateway/archive?JMSTriggers=*</li>
     *   <li>webserviceEndpointAliases: This parameter identifies the 'web service endpoint' aliases to be imported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.  For example, a single web service endpoint alias can be imported using the following request: POST /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias  Whereas, all the JMS triggers can be imported using the following request: POST /rest/apigateway/archive?webserviceEndpointAliases=*</li>
     *   <li>users: This parameter identifies the users to be imported.  The wildcard "*" selects all the users.  For example, a single user can be imported using the following request: POST /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54  Whereas, all the users can be imported using the following request: POST /rest/apigateway/archive?users=*</li>
     *   <li>groups: This parameter identifies the groups to be imported.  The wildcard "*" selects all the groups.  For example, a single group can be imported using the following request: POST /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the groups can be imported using the following request: POST /rest/apigateway/archive?groups=*</li>
     *   <li>accessProfiles: This parameter identifies the teams to be imported.  The wildcard "*" selects all the teams.  For example, a single team can be imported using the following request: POST /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the teams can be imported using the following request: POST /rest/apigateway/archive?accessProfiles=*</li>
     *   <li>kerberosSetting: This parameter identifies the kerberos configuration to be imported. The kerberos configuration can be imported using the following request: POST /rest/apigateway/archive?kerberosSetting=kerberosSetting</li>
     *   <li>plans: This parameter identifies the plans to be imported.  The wildcard "*" selects all the plans.  For example, a single plan can be imported using the following request: POST /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a  Whereas, all the plans can be imported using the following request: POST /rest/apigateway/archive?plans=*</li>
     *   <li>packages: This parameter identifies the packages to be imported.  The wildcard "*" selects all the packages.  For example, a single package can be imported using the following request: POST /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the packages can be imported using the following request: POST /rest/apigateway/archive?packages=*</li>
     *   <li>configurations: This parameter identifies the configurations to be imported.  The wildcard "*" selects all the configurations.  For example, a single configuration can be imported using the following request: POST /rest/apigateway/archive?configurations=loadBalancer,customContentTypes  Whereas, all the configurations can be imported using the following request: POST /rest/apigateway/archive?configurations=*</li>
     *   <li>gatewayScopes: This parameter identifies the oauth scopes to be imported.  The wildcard "*" selects all the oauth scopes.  For example, a single oauth scope can be imported using the following request: POST /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the oauth scopes can be imported using the following request: POST /rest/apigateway/archive?gatewayScopes=*</li>
     *   <li>xHTTPMethodOverride: This parameter is used to specify that this REST call is an export operation. The value for this field is GET. If this is specified then you need to provide the filtering criteria in body to specify the asset. If empty payload specified then all assets will be exported. </li>
     *   <li>zipFile: Zip file that contains the API Gateway asset needs to be imported</li>
     * </ul>
     */
    public void importExportAPIGatewayAssets(Consumer<ImportExportAPIGatewayAssetsOperationSpec> spec) {
        ImportExportAPIGatewayAssetsOperationSpec r = new ImportExportAPIGatewayAssetsOperationSpec(spec);
        api.importExportAPIGatewayAssets(r.overwrite(), r.fixingMissingVersions(), r.preserveAssetState(), r.policies(), r.apis(), r.aliases(), r.applications(), r.approvalConfigurations(), r.outboundProxies(), r.urlAliases(), r.keyStores(), r.trustStores(), r.jnDIProviderAliases(), r.jmSConnectionAliases(), r.jmSTriggers(), r.webserviceEndpointAliases(), r.users(), r.groups(), r.accessProfiles(), r.kerberosSetting(), r.plans(), r.packages(), r.configurations(), r.gatewayScopes(), r.xHTTPMethodOverride(), r.zipFile());
    }

    /**
     * <p>
     * Import trace data from the given archive. This does not import the events in to the storage. It simply reads the archive and returns all the events and their tracing data in the archive.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>_file: The import archive containing the exported tracer events.</li>
     * </ul>
     */
    public ImportTraceInfoResponse importTraceInfo(Consumer<ImportTraceInfoOperationSpec> spec) {
        ImportTraceInfoOperationSpec r = new ImportTraceInfoOperationSpec(spec);
        return api.importTraceInfo(r._file());
    }

    /**
     * <p>
     * This is the JWKS uri of the API Gateway. It fetches all the public keys of APIGateway, which can be used by to validate the JWT generated by API Gateway. The response will be in the JWK format
     */
    public Object jWKSUri() {
        return api.jWKSUri();
    }

    /**
     * <p>
     * This GET method is used to fetch the details of existing archive files and response of this method is the list of archive file names. Select a filename from the list of archive file names returned by this method and use the POST method /apitransactions/archives/{fileName} to restore.The user must either be a part of API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>filter: </li>
     * </ul>
     */
    public void listAllArchives(Consumer<ListAllArchivesOperationSpec> spec) {
        ListAllArchivesOperationSpec r = new ListAllArchivesOperationSpec(spec);
        api.listAllArchives(r.filter());
    }

    /**
     * <p>
     * The method retrieves list of all JNDI configurations in API Gateway.
     */
    public void listAllJNDI() {
        api.listAllJNDI();
    }

    /**
     * <p>
     * This method returns a list of pending jobs. Every time you initiate archive, restore, or purge operation you get a job id as a response. You can use the specific job id to query the status of the initiated operation. The user must either be part of the API-Gateway-Administrators group or must have 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>action: </li>
     *   <li>status: </li>
     * </ul>
     */
    public void listAllPendingJobs(Consumer<ListAllPendingJobsOperationSpec> spec) {
        ListAllPendingJobsOperationSpec r = new ListAllPendingJobsOperationSpec(spec);
        api.listAllPendingJobs(r.action(), r.status());
    }

    /**
     * <p>
     * The method retrieves the specified JNDI configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jndiId: This path parameter is used to specify the JNDI configuration id which JNDI configuration needs to be retrived.</li>
     * </ul>
     */
    public JNDIProviderAlias listJNDI(Consumer<ListJNDIOperationSpec> spec) {
        ListJNDIOperationSpec r = new ListJNDIOperationSpec(spec);
        return api.listJNDI(r.jndiId());
    }

    /**
     * <p>
     * Triggers a migration action and immediately returns with 202 status code. Clean action clears the data from the API Gateway data store, reindex action reindex the data from the source Elasticsearch to API Gateway data store and transform action transforms the reindexed assets in the API Gateway data store to be compatible with the current API Gateway version. The clean action should be invoked on target API Gateway server prior to invoking reindex API for core indices. The current status of the action can be retrieved using /migration/status API. A webhook event with the migration status also would be sent to the subscribed webhook clients
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public void migration(Consumer<MigrationOperationSpec> spec) {
        MigrationOperationSpec r = new MigrationOperationSpec(spec);
        api.migration(r.body());
    }

    /**
     * <p>
     * This REST request is used to move down the execution order of the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy execution order is changed successfully then the policy details of specified policy will be sent as response.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id of the threat protection whose execution order needs to be moved down </li>
     * </ul>
     */
    public Policy moveDownThreatProtectionRuleByPolicyID(Consumer<MoveDownThreatProtectionRuleByPolicyIDOperationSpec> spec) {
        MoveDownThreatProtectionRuleByPolicyIDOperationSpec r = new MoveDownThreatProtectionRuleByPolicyIDOperationSpec(spec);
        return api.moveDownThreatProtectionRuleByPolicyID(r.policyId());
    }

    /**
     * <p>
     * This REST request is used to move up the execution order of the Threat protection rule created in API Gateway. This request does not require any request body. This request does not require any request body. If the threat protection policy execution order is changed successfully then the policy details of specified policy will be sent as response.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id of the threat protection whose execution order needs to be moved up </li>
     * </ul>
     */
    public Policy moveUpThreatProtectionRuleByPolicyID(Consumer<MoveUpThreatProtectionRuleByPolicyIDOperationSpec> spec) {
        MoveUpThreatProtectionRuleByPolicyIDOperationSpec r = new MoveUpThreatProtectionRuleByPolicyIDOperationSpec(spec);
        return api.moveUpThreatProtectionRuleByPolicyID(r.policyId());
    }

    /**
     * <p>
     * This operation can be used to update an API with its implementation endpoints details and optionally the corresponding maturity state after the implementation has been completed
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be updated</li>
     *   <li>maturityState: </li>
     *   <li>nativeBaseURLs: </li>
     * </ul>
     */
    public ModelAPIResponse notifyAPIImplementation(Consumer<NotifyAPIImplementationOperationSpec> spec) {
        NotifyAPIImplementationOperationSpec r = new NotifyAPIImplementationOperationSpec(spec);
        return api.notifyAPIImplementation(r.apiId(), r.maturityState(), r.nativeBaseURLs());
    }

    /**
     * <p>
     * This HTTP PATCH request suspends the specified application in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an application that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Application patchApplication(Consumer<PatchApplicationOperationSpec> spec) {
        PatchApplicationOperationSpec r = new PatchApplicationOperationSpec(spec);
        return api.patchApplication(r.applicationId(), r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>documentId: The unique identifier of the document to be patched.</li>
     *   <li>body: The request payload to patch the document in API Gateway.</li>
     * </ul>
     */
    public DocumentResponse patchDocument(Consumer<PatchDocumentOperationSpec> spec) {
        PatchDocumentOperationSpec r = new PatchDocumentOperationSpec(spec);
        return api.patchDocument(r.documentId(), r.body());
    }

    /**
     * <p>
     * This REST request is used to create a policy in API Gateway. The body of this request should contain the payload of the policy. Using this request we can create Policies of different type.
     * To create a service, scope, package and template level policy we can add the policy payload and set the corresponding policy scope.
     * To create a Global policy user should have API Gateway Administrator access. Other users cannot create global policies. To Create Global policy send the policy payload along with scope details and policy scope set to global. Similarly, to create a threat protection policy user have to send the policy along with the policy enforcement id of Threat protection policy actions. The policy actions needs to be created before adding the enforcement id of policy actions to policy. Threat protection rules are another type of global level policies which are applied to all requests and responses. The threat protection policy enforcement cannot be used in any other policies and other policy enforcement cannot be used in threat protection policies.
     * Using this request we can also clone a policy. To clone a policy user have to set the appropriate query parameters.
     * The effective policy calculation for policy(Service and scope level policy) is not calculated till it is referred in the API. But for a
     * global policy the effective policy is calculated while creating the policy itself. Policy with template as policy scope cannot be referred from any API or scope. User needs to clone the policy templates and set the policy scope to either service or scope or global before referring it from the API. Policy should have only one occurrence of any stage. Multiple policy enforcements can be added to the applicable stages. To know about the list of stages and applicable policy enforcements on that stage please refer /policyStages resource.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     *   <li>action:  This query parameter represents the action user want to perform. Currently user can only clone the policy. Hence the allowed value for this parameter would be "clone". Cloning is duplication of one or more policies in to a single policy. All the policy actions specified inside the policies are also be duplicated while creating the duplicate policy.The effective policy is not calculated for this until this policy is referred from the API.</li>
     *   <li>policyIds: This query parameter represents the list of policies from which the new clone policy is created. If you specify list of policies then the newly  created policy has all the policy action from all the policies.</li>
     *   <li>policyScope: This query parameter represents the policy scope of cloned policy. We can clone policy from one policy scope to another policy scope. Allowed policy scope values are global,service,template &amp; scope</li>
     * </ul>
     */
    public Policy policiesPost(Consumer<PoliciesPostOperationSpec> spec) {
        PoliciesPostOperationSpec r = new PoliciesPostOperationSpec(spec);
        return api.policiesPost(r.body(), r.action(), r.policyIds(), r.policyScope());
    }

    /**
     * <p>
     * This REST Request is used to get the template detail for list of policy action.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionTemplates: This is a query parameter. It will be used to fetch policy action templates for list of policy action.</li>
     * </ul>
     */
    public List<PolicyActionTemplate> policyActionTemplatesGet(Consumer<PolicyActionTemplatesGetOperationSpec> spec) {
        PolicyActionTemplatesGetOperationSpec r = new PolicyActionTemplatesGetOperationSpec(spec);
        return api.policyActionTemplatesGet(r.policyActionTemplates());
    }

    /**
     * <p>
     * This REST Request is used to get the template details of a policy action.. To retrieve the policy action template for a particular policy action, specify the policy action template name as a path parameter 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionTemplateId: This is a path parameter. It will be used to fetch policy action template of a particular template.</li>
     * </ul>
     */
    public PolicyActionTemplate policyActionTemplatesPolicyActionTemplateIdGet(Consumer<PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec> spec) {
        PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec r = new PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec(spec);
        return api.policyActionTemplatesPolicyActionTemplateIdGet(r.policyActionTemplateId());
    }

    /**
     * <p>
     * This REST operation is used to publish API to the registered API Portal
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be published</li>
     *   <li>body: API publish request payload</li>
     * </ul>
     */
    public APIResponseCreate publishAPI(Consumer<PublishAPIOperationSpec> spec) {
        PublishAPIOperationSpec r = new PublishAPIOperationSpec(spec);
        return api.publishAPI(r.apiId(), r.body());
    }

    /**
     * <p>
     * This endpoint is used to publish the packages along with its associated plans to portal. Before publishing the package, the portal configuration should be configured in API gateway. You can use the endpoint /portalGateways to configure the portal configuration. The associated APIs needs to be published before publishing the package.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: package id which needs to be published to portal</li>
     * </ul>
     */
    public PackageResponseContainer publishPackageByPackageId(Consumer<PublishPackageByPackageIdOperationSpec> spec) {
        PublishPackageByPackageIdOperationSpec r = new PublishPackageByPackageIdOperationSpec(spec);
        return api.publishPackageByPackageId(r.packageId());
    }

    /**
     * <p>
     * Publish one or more APIs to one or more integration servers. Only REST and SOAP APIs are supported.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Integration server publish payload</li>
     * </ul>
     */
    public ServiceRegistryPublishPutResponse publishToIntegrationServer(Consumer<PublishToIntegrationServerOperationSpec> spec) {
        PublishToIntegrationServerOperationSpec r = new PublishToIntegrationServerOperationSpec(spec);
        return api.publishToIntegrationServer(r.body());
    }

    /**
     * <p>
     * Publish one or more APIs to one or more service registries
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Service registry publish payload</li>
     * </ul>
     */
    public ServiceRegistryPublishPutResponse publishToServiceRegistry(Consumer<PublishToServiceRegistryOperationSpec> spec) {
        PublishToServiceRegistryOperationSpec r = new PublishToServiceRegistryOperationSpec(spec);
        return api.publishToServiceRegistry(r.body());
    }

    /**
     * <p>
     * The DELETE method is used to purge the api transactions of the specified type. Data to be purged is filtered based on the input parameters. This method returns a job id as response and this job id is used to track the job status. See /apitransactions/jobs/{jobId} for more details. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: This is a date parameter. All the api transactions of the specified type, from the given date, are purged. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter</li>
     *   <li>until: This is a date parameter. All the api transactions of the specified type, until the given date, are purged. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter</li>
     *   <li>eventType: This parameter is used to specify the event type to be purged. Specify eventType=ALL to purge all the events. To purge a specific event type, specify the required event type. Ex: eventType=transactionalEvents. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan</li>
     *   <li>action: This is an optional query parameter. Sometimes it’s better to take backup before purging the data . If you specify the action value as "archiveAndPurge", API Gateway performs an archive before purging the data.</li>
     *   <li>olderThan: All the api transactions of the specified type, that are older than the value specified, are purged. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days   b) 1M  means 1 month   c) 1y means 1 year</li>
     * </ul>
     */
    public void purgeAPITransactions(Consumer<PurgeAPITransactionsOperationSpec> spec) {
        PurgeAPITransactionsOperationSpec r = new PurgeAPITransactionsOperationSpec(spec);
        api.purgeAPITransactions(r.from(), r.until(), r.eventType(), r.action(), r.olderThan());
    }

    /**
     * <p>
     * This method either enables or disables the quiesce mode in API Gateway. Quiesce mode has two kinds - designtime and all. Quiesce mode for designtime will block the designtime API requests to API Gateway server and return 503 status code except the GET http method as well as few whitelisted APIs like search and this API itself. Quiesce mode for all is an extension of Integration server's Quiesce mode with the addition of flushing of API Gateway in-memory data such as performance metrics, license metrics and subscription quota to the configured data store.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public QuiesceMode quiescemode(Consumer<QuiescemodeOperationSpec> spec) {
        QuiescemodeOperationSpec r = new QuiescemodeOperationSpec(spec);
        return api.quiescemode(r.body());
    }

    /**
     * <p>
     * The method refreshes the credentials of a strategy in API Gateway. This is applicable only when dynamic client registration (generate credentials) is enabled in the strategy.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>strategyId: This parameter specifies the ID of a strategy that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload for the strategy to be refreshed in API Gateway.</li>
     * </ul>
     */
    public OneOfStrategyModel refreshCredentials(Consumer<RefreshCredentialsOperationSpec> spec) {
        RefreshCredentialsOperationSpec r = new RefreshCredentialsOperationSpec(spec);
        return api.refreshCredentials(r.strategyId(), r.body());
    }

    /**
     * <p>
     * The method regenarates the access tokens of an application. Possible values for type - apiAccessKeyCredentials for API Key regenaration and oAuthCredentials for Oauth credentials regenaration.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application for generating the access Tokens in API Gateway.</li>
     *   <li>body: This parameter specifies the type of token to be regenerated.</li>
     * </ul>
     */
    public void regenerateAccessTokens(Consumer<RegenerateAccessTokensOperationSpec> spec) {
        RegenerateAccessTokensOperationSpec r = new RegenerateAccessTokensOperationSpec(spec);
        api.regenerateAccessTokens(r.applicationId(), r.body());
    }

    /**
     * <p>
     * This method is to be used to update the registered APIs list for an application. To add a new api to an application which is already registered with other APIs, you should send the complete list of apiIds including the old apiIds and the new apiId(s) to be added. To remove all APIs from the application, send an empty array for the apiIds field in the request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application for registering APIs in API Gateway.</li>
     *   <li>body: This parameter specifies the IDs of the APIs for registering in an application in API Gateway.</li>
     * </ul>
     */
    public void registerApis(Consumer<RegisterApisOperationSpec> spec) {
        RegisterApisOperationSpec r = new RegisterApisOperationSpec(spec);
        api.registerApis(r.applicationId(), r.body());
    }

    /**
     * <p>
     * Resets the master password to the default value in API Gateway.This should be performed when the master password is lost and after a successful reset, it is recommended to change the master password again to a secure value
     */
    public MasterPasswordResetResponse resetMasterPassword() {
        return api.resetMasterPassword();
    }

    /**
     * <p>
     * This method is used to restore the runtime data by specifying the archive file name.For more details see GET /apitransactions/archives/ to know how to get the existing archive file names. This method returns a job id as a response to track the status. The user must either be a part of API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fileName: This parameter indicates the file name to be restored. Ex: fileName=default-2017-08-29-1504011306456.</li>
     * </ul>
     */
    public void restoreData(Consumer<RestoreDataOperationSpec> spec) {
        RestoreDataOperationSpec r = new RestoreDataOperationSpec(spec);
        api.restoreData(r.fileName());
    }

    /**
     * <p>
     * This method updates or creates API callback processor settings in API Gateway. The user should have Manage general administration configurations privilege to update the API callback processor settings.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CallbackProcessorSettings saveAPICallbackProcessorSettings(Consumer<SaveAPICallbackProcessorSettingsOperationSpec> spec) {
        SaveAPICallbackProcessorSettingsOperationSpec r = new SaveAPICallbackProcessorSettingsOperationSpec(spec);
        return api.saveAPICallbackProcessorSettings(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the API Portal destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Destination saveAPIPortalAsDestination(Consumer<SaveAPIPortalAsDestinationOperationSpec> spec) {
        SaveAPIPortalAsDestinationOperationSpec r = new SaveAPIPortalAsDestinationOperationSpec(spec);
        return api.saveAPIPortalAsDestination(r.body());
    }

    /**
     * <p>
     * Saves the account lock settings in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public AccountLockSettings saveAccountLockSettings(Consumer<SaveAccountLockSettingsOperationSpec> spec) {
        SaveAccountLockSettingsOperationSpec r = new SaveAccountLockSettingsOperationSpec(spec);
        return api.saveAccountLockSettings(r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public AnalyticsDataStoreDestination saveAnalyticsDataStoreAsDestination(Consumer<SaveAnalyticsDataStoreAsDestinationOperationSpec> spec) {
        SaveAnalyticsDataStoreAsDestinationOperationSpec r = new SaveAnalyticsDataStoreAsDestinationOperationSpec(spec);
        return api.saveAnalyticsDataStoreAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Transaction Logger destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public AuditLogDestination saveAuditLogAsDestination(Consumer<SaveAuditLogAsDestinationOperationSpec> spec) {
        SaveAuditLogAsDestinationOperationSpec r = new SaveAuditLogAsDestinationOperationSpec(spec);
        return api.saveAuditLogAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the Communication details of the CentraSite destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CSCommunicationDestination saveCentraSiteCommunicationAsDestination(Consumer<SaveCentraSiteCommunicationAsDestinationOperationSpec> spec) {
        SaveCentraSiteCommunicationAsDestinationOperationSpec r = new SaveCentraSiteCommunicationAsDestinationOperationSpec(spec);
        return api.saveCentraSiteCommunicationAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the CentraSite SNMP destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CSSNMPDestination saveCentraSiteSNMPAsDestination(Consumer<SaveCentraSiteSNMPAsDestinationOperationSpec> spec) {
        SaveCentraSiteSNMPAsDestinationOperationSpec r = new SaveCentraSiteSNMPAsDestinationOperationSpec(spec);
        return api.saveCentraSiteSNMPAsDestination(r.body());
    }

    /**
     * <p>
     * This REST method is used to update the custom content types for API Gateway.The response is a set of key/value pair where key indicates the custom content type and value indicates the base type. The value can be application/xml or application/json or text/xml
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Object saveCustomContentTypes(Consumer<SaveCustomContentTypesOperationSpec> spec) {
        SaveCustomContentTypesOperationSpec r = new SaveCustomContentTypesOperationSpec(spec);
        return api.saveCustomContentTypes(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Database destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Destination saveDatabaseAsDestination(Consumer<SaveDatabaseAsDestinationOperationSpec> spec) {
        SaveDatabaseAsDestinationOperationSpec r = new SaveDatabaseAsDestinationOperationSpec(spec);
        return api.saveDatabaseAsDestination(r.body());
    }

    /**
     * <p>
     * Saves the global IP access setting for authentication based restriction settings in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public DenyByIPForFailedAuthConfig saveDenyByIPForFailedAuthConfig(Consumer<SaveDenyByIPForFailedAuthConfigOperationSpec> spec) {
        SaveDenyByIPForFailedAuthConfigOperationSpec r = new SaveDenyByIPForFailedAuthConfigOperationSpec(spec);
        return api.saveDenyByIPForFailedAuthConfig(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Digital Events destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Destination saveDigitalEventsAsDestination(Consumer<SaveDigitalEventsAsDestinationOperationSpec> spec) {
        SaveDigitalEventsAsDestinationOperationSpec r = new SaveDigitalEventsAsDestinationOperationSpec(spec);
        return api.saveDigitalEventsAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Elasticsearch destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public ElasticsearchDestination saveElasticsearchAsDestination(Consumer<SaveElasticsearchAsDestinationOperationSpec> spec) {
        SaveElasticsearchAsDestinationOperationSpec r = new SaveElasticsearchAsDestinationOperationSpec(spec);
        return api.saveElasticsearchAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the Email destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public EmailDestination saveEmailAsDestination(Consumer<SaveEmailAsDestinationOperationSpec> spec) {
        SaveEmailAsDestinationOperationSpec r = new SaveEmailAsDestinationOperationSpec(spec);
        return api.saveEmailAsDestination(r.body());
    }

    /**
     * <p>
     * This REST method is used to update the default error template with any custom templates and the value of the property - sendNativeProviderFault.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public ErrorProcessing saveErrorProcessingDetails(Consumer<SaveErrorProcessingDetailsOperationSpec> spec) {
        SaveErrorProcessingDetailsOperationSpec r = new SaveErrorProcessingDetailsOperationSpec(spec);
        return api.saveErrorProcessingDetails(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the API Gateway destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Destination saveGatewayAsDestination(Consumer<SaveGatewayAsDestinationOperationSpec> spec) {
        SaveGatewayAsDestinationOperationSpec r = new SaveGatewayAsDestinationOperationSpec(spec);
        return api.saveGatewayAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the default keystore, truststore and alias configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public KeystoreTruststore saveKeystoreTruststore(Consumer<SaveKeystoreTruststoreOperationSpec> spec) {
        SaveKeystoreTruststoreOperationSpec r = new SaveKeystoreTruststoreOperationSpec(spec);
        return api.saveKeystoreTruststore(r.body());
    }

    /**
     * <p>
     * Saves the LDAP configuration settings in the API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public InputLdapConfiguration saveLdapConfig(Consumer<SaveLdapConfigOperationSpec> spec) {
        SaveLdapConfigOperationSpec r = new SaveLdapConfigOperationSpec(spec);
        return api.saveLdapConfig(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the load Balancer configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public LoadBalancer saveLoadBalancers(Consumer<SaveLoadBalancersOperationSpec> spec) {
        SaveLoadBalancersOperationSpec r = new SaveLoadBalancersOperationSpec(spec);
        return api.saveLoadBalancers(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the log configuration in API Gateway.
     */
    public LogConfiguration saveLogConfig() {
        return api.saveLogConfig();
    }

    /**
     * <p>
     * The method is used to update the details of the Mobile Applications configuration in API Gateway.You can use API Gateway to disable access for certain mobile application versions on a predefined set of mobile platforms. By registering the required devices and applications and disabling access to these versions, you ensure that all users use the latest versions of the applications and take advantage of the latest security and functional updates.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public MobileApplicationConfiguration saveMobileApplicationConfigurations(Consumer<SaveMobileApplicationConfigurationsOperationSpec> spec) {
        SaveMobileApplicationConfigurationsOperationSpec r = new SaveMobileApplicationConfigurationsOperationSpec(spec);
        return api.saveMobileApplicationConfigurations(r.body());
    }

    /**
     * <p>
     * Saves the password expiry settings in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public PasswordExpirySettings savePasswordExpirySettings(Consumer<SavePasswordExpirySettingsOperationSpec> spec) {
        SavePasswordExpirySettingsOperationSpec r = new SavePasswordExpirySettingsOperationSpec(spec);
        return api.savePasswordExpirySettings(r.body());
    }

    /**
     * <p>
     * Saves the password restrictions settings in API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload of proxybypass server that is to be saved in API Gateway.</li>
     * </ul>
     */
    public void saveProxyBypass(Consumer<SaveProxyBypassOperationSpec> spec) {
        SaveProxyBypassOperationSpec r = new SaveProxyBypassOperationSpec(spec);
        api.saveProxyBypass(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the SNMP destination in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public SNMPDestination saveSNMPAsDestination(Consumer<SaveSNMPAsDestinationOperationSpec> spec) {
        SaveSNMPAsDestinationOperationSpec r = new SaveSNMPAsDestinationOperationSpec(spec);
        return api.saveSNMPAsDestination(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the SSO configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public SSOConfiguration saveSSOConfig(Consumer<SaveSSOConfigOperationSpec> spec) {
        SaveSSOConfigOperationSpec r = new SaveSSOConfigOperationSpec(spec);
        return api.saveSSOConfig(r.body());
    }

    /**
     * <p>
     * This method updates or creates a list of extended settings and watt properties in API Gateway. The user should have an API Gateway administrator access to update thse settings. The user needs to send only the modified settings i.e, 'preferredSettings', in the payload.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public ExtendedSettingsOutput saveSettings(Consumer<SaveSettingsOperationSpec> spec) {
        SaveSettingsOperationSpec r = new SaveSettingsOperationSpec(spec);
        return api.saveSettings(r.body());
    }

    /**
     * <p>
     * The method is used to update the details of the whitelisting IPs configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public WhiteListedIPs saveWhitelistedIPs(Consumer<SaveWhitelistedIPsOperationSpec> spec) {
        SaveWhitelistedIPsOperationSpec r = new SaveWhitelistedIPsOperationSpec(spec);
        return api.saveWhitelistedIPs(r.body());
    }

    /**
     * <p>
     * The search API allows you to execute a search query in API Gateway and get back search results that match the query. You can perform search across different objects such as API, Application, Alias, Assertions, Policies, Administrator Settings, Policy Action, Packages, Plans, Subscriptions, Users, User Groups, Transactional events, Lifecycle events, Policy violation events, Monitor events, Error events, Threat protection events, Performance metrics and Audit logs. Following are the type of searches that does not require scope or fields.
     *  1. Users - This type is used to get the list of users from IS.
     *  2. User Groups - This type is used to get the list of user groups from IS.
     * 
     * Following are the type of searches for which you can specify the
     * scope and fields.
     *  1. API - This type is used to search the APIs in API Gateway.
     *  2. Application - This type is used to search the Applications created in API Gateway.
     *  3. Alias - This type is used to search aliases created in API Gateway.
     *  4. Assertions - This type is used to search custom assertions created in API Gateway.
     *  5. Policy - This type is used to search policies in API Gateway.
     *  6. Policy Action - This type is used to search policy actions in API Gateway.
     *  7. Package - This type is used to search packages in API Gateway.
     *  8. Plan - This type is used to search plans in API Gateway.
     *  9. Administrator Setting - This type is used to search the administrator settings in API Gateway.
     *  10. Subscription - This type is used to search subscriptions in API Gateway.
     *  11. Transactional events - This type is used to search transactional events generated in API Gateway.
     *  12. Lifecycle events - This type is used to search lifecycle events in API Gateway.
     * 
     * 13. Policy violation events - This type is used to search policy violation events generated in API Gateway.
     *  14. Monitor events - This type is used to search monitor events generated in API Gateway.
     *  15. Error events - This type is used to search error events generated in API Gateway.
     *  16. Threat protection events - This type is used to search threat protection events generated in API Gateway.
     *  17. Performance metrics - This type is used to search performance metrics generated in API Gateway.
     * 18. Audit log events - This type is used to search audit logs events generated in API Gateway.
     * 
     * For the above eighteen types, if a scope is specified, then the scope is applicable for all types regardless whether it is applicable for that or not. Also if the required fields are specified and it is not available in any other types, then the search result corresponds to that type does not have the fields.
     *  If from and size are specified then it skips first n records specified in from for all types and it fetches the number of records specified in size.
     *  examples:
     * 1. Fetch All APIs contains run as substring
     * Payload : { "types" : ["api"], "scope":[ { "attributeName" : "apiName", "keyword" : ".*run.*" }] }
     * The above payload will fetch all APIs contains run as substring in API name. The response will contains APIs with some fields populated with default values.
     *  2. Fetch All APIs contains run as substring and specific set of fields in the response
     * Payload : { "types" : ["api"], "scope":[ { "attributeName" : "apiName", "keyword" : ".*run.*" }], "responseFields" : ["apiName", "type", "isActive", "systemVersion", "policies","publishedPortals","apiVersion","id"]}
     * To fetch all fields, user can use "*" in responseFields. It will fetch all the fields in the response.
     * Payload : { "types" : ["api"], "scope":[ { "attributeName" : "apiName", "keyword" : ".*run.*" }], "responseFields" : ["*"]}
     *  The above payload will fetch all APIs contains run as substring in API name and corresponding fields mentioned in responseFields section.
     * The responseFields can be identified from schema definition using below table for some of the main used types
     * Asset type: API ,Swagger file: APIGatewayServiceManagement.json ,Definition: #/definitions/GatewayAPI Asset type: POLICY ,Swagger file: APIGatewayPolicyManagement.json ,Definition: #/definitions/Policy Asset type: POLICY_ACTION ,Swagger file: APIGatewayPolicyManagement.json ,Definition: #/definitions/PolicyAction Asset type: ALIAS ,Swagger file: APIGatewayAlias.json
     * ,Definition: #/definitions/Alias Asset type: APPLICATION ,Swagger file:APIGatewayApplication.json ,Definition: #/definitions/Application Asset type: USERS ,Swagger file: APIGatewayUserManagementSwagger.json ,Definition: #/definitions/User Asset type: GROUPS ,Swagger file: APIGatewayUserManagementSwagger.json ,Definition: #/definitions/Group Asset type: ACCESSPROFILES ,Swagger file: APIGatewayUserManagementSwagger.json ,Definition: #/definitions/AccessProfile Asset type: API_DOCUMENT ,Swagger file: APIGatewayDocumentManagement.json ,Definition: #/definitions/Document Asset type: KEYSTORE ,Swagger file: APIGatewayAdministration.json ,Definition: #/definitions/KeyStore Asset type: TRUSTSTORE ,Swagger file: APIGatewayAdministration.json ,Definition: #/definitions/TrustStore
     * For other types user can use "*" in responseFields section to get all the fields. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Search Parameters to search for specific set of results on specified types</li>
     * </ul>
     */
    public Map<String, Object> searchByType(Consumer<SearchByTypeOperationSpec> spec) {
        SearchByTypeOperationSpec r = new SearchByTypeOperationSpec(spec);
        return api.searchByType(r.body());
    }

    /**
     */
    public ServerInfo serverInformation() {
        return api.serverInformation();
    }

    /**
     * <p>
     * The PUT method updates the primary port configuration to the referenced existing port configuration.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request body references the existing port configuration to be defined as the primary port.</li>
     * </ul>
     */
    public PortReference setPrimaryPort(Consumer<SetPrimaryPortOperationSpec> spec) {
        SetPrimaryPortOperationSpec r = new SetPrimaryPortOperationSpec(spec);
        return api.setPrimaryPort(r.body());
    }

    /**
     * <p>
     * This method shutdowns the API Gateway server. If bounce is set as true then the server would be restarted. The option parameter specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown. Quiesce specifies the quiesce mode for all in API Gateway. A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. The default value is false.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public void shutdown(Consumer<ShutdownOperationSpec> spec) {
        ShutdownOperationSpec r = new ShutdownOperationSpec(spec);
        api.shutdown(r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload to store the document in API Gateway.</li>
     * </ul>
     */
    public DocumentResponse storeDocument(Consumer<StoreDocumentOperationSpec> spec) {
        StoreDocumentOperationSpec r = new StoreDocumentOperationSpec(spec);
        return api.storeDocument(r.body());
    }

    /**
     * <p>
     * The method is to test the given JNDI configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jndiId: </li>
     * </ul>
     */
    public void testJNDI(Consumer<TestJNDIOperationSpec> spec) {
        TestJNDIOperationSpec r = new TestJNDIOperationSpec(spec);
        api.testJNDI(r.jndiId());
    }

    /**
     * <p>
     * Enable tracing for an API
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id of the API for which tracing should be enabled.</li>
     * </ul>
     */
    public GatewayAPI tracingEnable(Consumer<TracingEnableOperationSpec> spec) {
        TracingEnableOperationSpec r = new TracingEnableOperationSpec(spec);
        return api.tracingEnable(r.apiId());
    }

    /**
     * <p>
     * Use this method to know the status of a specific job. This method returns the status and file name (in case of archive process) as a response. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>jobId: This parameter indicates the job Id. Job Id is required to identify and track the status of a job which has been initiated. Ex: jobId=1504011632215</li>
     * </ul>
     */
    public void trackJobStatus(Consumer<TrackJobStatusOperationSpec> spec) {
        TrackJobStatusOperationSpec r = new TrackJobStatusOperationSpec(spec);
        api.trackJobStatus(r.jobId());
    }

    /**
     * <p>
     * Unlock user account(s) locked by API Gateway
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public LockedAccounts unLockUserAccounts(Consumer<UnLockUserAccountsOperationSpec> spec) {
        UnLockUserAccountsOperationSpec r = new UnLockUserAccountsOperationSpec(spec);
        return api.unLockUserAccounts(r.body());
    }

    /**
     * <p>
     * This endpoint is used to un publish the
     * package and its associated plan from portal. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: package id which needs to be unpublished from portal</li>
     * </ul>
     */
    public PackageResponseContainer unPublishPackageByPackageId(Consumer<UnPublishPackageByPackageIdOperationSpec> spec) {
        UnPublishPackageByPackageIdOperationSpec r = new UnPublishPackageByPackageIdOperationSpec(spec);
        return api.unPublishPackageByPackageId(r.packageId());
    }

    /**
     * <p>
     * Unpublish API from the registered API Portal
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be unpublished</li>
     * </ul>
     */
    public APIResponseCreate unpublishAPI(Consumer<UnpublishAPIOperationSpec> spec) {
        UnpublishAPIOperationSpec r = new UnpublishAPIOperationSpec(spec);
        return api.unpublishAPI(r.apiId());
    }

    /**
     * <p>
     * Unpublish one or more APIs from one or more service registries
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Service registry unpublish payload</li>
     * </ul>
     */
    public ServiceRegistryUnpublishPutResponse unpublishFromServiceRegistry(Consumer<UnpublishFromServiceRegistryOperationSpec> spec) {
        UnpublishFromServiceRegistryOperationSpec r = new UnpublishFromServiceRegistryOperationSpec(spec);
        return api.unpublishFromServiceRegistry(r.body());
    }

    /**
     * <p>
     * This REST operation is used to update an API by importing a file, url or inline.
     * While updating the API, visibility of the operations can be set by enabling or disabling the operations. Disabled operations will not be exposed to the customers. By default, all the operations are exposed to the consumers.
     * When updating the API using file or url, API Gateway overwrite the resources/operations for the API. But it will retain the maturity state, scopes, visibility and if API mocking is enabled, then default mocked responses, mocked conditions and IS services will also be retained.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>apiId: API Id for the API to be updated</li>
     *   <li>body: </li>
     *   <li>overwriteTags: When an API is updated using a URL / file, the existing tags will be overwritten if this value is true.</li>
     * </ul>
     */
    public APIResponseCreate updateAPI(Consumer<UpdateAPIOperationSpec> spec) {
        UpdateAPIOperationSpec r = new UpdateAPIOperationSpec(spec);
        return api.updateAPI(r.apiId(), r.body(), r.overwriteTags());
    }

    /**
     * <p>
     * This API allows you to update API Portal configuration information in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>portalGatewayId: Id of the API Portal configuration for update</li>
     *   <li>body: API Portal configuration payload</li>
     * </ul>
     */
    public PortalGateway updateAPIPortalConfiguration(Consumer<UpdateAPIPortalConfigurationOperationSpec> spec) {
        UpdateAPIPortalConfigurationOperationSpec r = new UpdateAPIPortalConfigurationOperationSpec(spec);
        return api.updateAPIPortalConfiguration(r.portalGatewayId(), r.body());
    }

    /**
     * <p>
     * The PUT updates the services for the access mode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     *   <li>body: The request contains the updated services access mode information.</li>
     * </ul>
     */
    public AccessModeServices updateAccessMode(Consumer<UpdateAccessModeOperationSpec> spec) {
        UpdateAccessModeOperationSpec r = new UpdateAccessModeOperationSpec(spec);
        return api.updateAccessMode(r.listenerKey(), r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified team in API Gateway. The API request body must contain the payload for the updated accessProfile.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accessProfileId: The path parameter specifies the id of a team whose detail is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of a accessProfile that is to be updated in API Gateway.</li>
     * </ul>
     */
    public AccessProfile updateAccessProfile(Consumer<UpdateAccessProfileOperationSpec> spec) {
        UpdateAccessProfileOperationSpec r = new UpdateAccessProfileOperationSpec(spec);
        return api.updateAccessProfile(r.accessProfileId(), r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified alias in API Gateway. The API request body must contain the payload of the alias that needs to be updated.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>aliasId: The path parameter specifies the id of an alias whose detail is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an alias that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Alias updateAlias(Consumer<UpdateAliasOperationSpec> spec) {
        UpdateAliasOperationSpec r = new UpdateAliasOperationSpec(spec);
        return api.updateAlias(r.aliasId(), r.body());
    }

    /**
     * <p>
     * The method updates the expiry date of all the API Keys in the instance. The new expiry date is calculated based on the extended settings property 'apiKeyExpirationPeriod'. If 'apiKeyExpirationPeriod is empty, then the expiration date for all API Keys are set as unlimited.If 'apiKeyExpirationPeriod' is set to some accepted value (say 60min), then the expiry date is calculated as current time when this method is invoked + the expiration period (60min).Since this method updates expiry date for all API keys in the instance, take caution when you invoke this! Invoke this only if absolutely necessary and take necessary precautions!For example, your system might have applications to the scale of 1M or higher - make sure to configure appropriate timeout settings, etc when invoking this!
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: This parameter specifies the type of access token for which expiry date should be updated. Currently only apiAccessKeyCredentials is supported</li>
     * </ul>
     */
    public void updateApiKeysExpiry(Consumer<UpdateApiKeysExpiryOperationSpec> spec) {
        UpdateApiKeysExpiryOperationSpec r = new UpdateApiKeysExpiryOperationSpec(spec);
        api.updateApiKeysExpiry(r.body());
    }

    /**
     * <p>
     * This HTTP request updates a specified application in API Gateway. You can use this resource to update basic information in application like name, description, version, identifiers, linked authentication strategy ids etc., but you cannot use this method to update the contents of authentication strategies, access tokens or to update associated apis. To regenerate the access tokens (API key), refer the resource /applications/{applicationId}/accessTokens POST. To update the associated apis, refer the resource /applications/{applicationId}/apis PUT. To create new authentication strategies or update the authentication strategies, refer the resource /strategies POST or /strategies/{strategyId} PUT
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an application that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Application updateApplication(Consumer<UpdateApplicationOperationSpec> spec) {
        UpdateApplicationOperationSpec r = new UpdateApplicationOperationSpec(spec);
        return api.updateApplication(r.applicationId(), r.body());
    }

    /**
     * <p>
     * The method updates the approval configuration in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: This parameter specifies the ID of an approval configuration that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an approval configuration that is to be updated in API Gateway.</li>
     * </ul>
     */
    public ApprovalConfiguration updateApprovalConfiguration(Consumer<UpdateApprovalConfigurationOperationSpec> spec) {
        UpdateApprovalConfigurationOperationSpec r = new UpdateApprovalConfigurationOperationSpec(spec);
        return api.updateApprovalConfiguration(r.id(), r.body());
    }

    /**
     * <p>
     * This REST service is used to update the assertion
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>assertionId: This path parameter is used to specify the assertion id which assertion details needs to updated.</li>
     *   <li>body: assertion request payload</li>
     * </ul>
     */
    public AssertionConfiguration updateAssertion(Consumer<UpdateAssertionOperationSpec> spec) {
        UpdateAssertionOperationSpec r = new UpdateAssertionOperationSpec(spec);
        return api.updateAssertion(r.assertionId(), r.body());
    }

    /**
     */
    public GatewayCacheConfig updateCacheConfig() {
        return api.updateCacheConfig();
    }

    /**
     * <p>
     * Updates the cluster settings in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload for cluster settings in API Gateway.</li>
     * </ul>
     */
    public ClusterInfo updateCluster(Consumer<UpdateClusterOperationSpec> spec) {
        UpdateClusterOperationSpec r = new UpdateClusterOperationSpec(spec);
        return api.updateCluster(r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>documentId: The unique identifier of the document to update</li>
     *   <li>body: The request payload to update the document in API Gateway.</li>
     * </ul>
     */
    public DocumentResponse updateDocumentContent(Consumer<UpdateDocumentContentOperationSpec> spec) {
        UpdateDocumentContentOperationSpec r = new UpdateDocumentContentOperationSpec(spec);
        return api.updateDocumentContent(r.documentId(), r.body());
    }

    /**
     * <p>
     * The method updates the expiry interval of the master password in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public MasterPasswordExpiryIntervalResponse updateExpiryInterval(Consumer<UpdateExpiryIntervalOperationSpec> spec) {
        UpdateExpiryIntervalOperationSpec r = new UpdateExpiryIntervalOperationSpec(spec);
        return api.updateExpiryInterval(r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified group in API Gateway. The API request body must contain the payload for the updated group.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: The path parameter specifies the id of a group whose detail is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of a group that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Group updateGroup(Consumer<UpdateGroupOperationSpec> spec) {
        UpdateGroupOperationSpec r = new UpdateGroupOperationSpec(spec);
        return api.updateGroup(r.groupId(), r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JMS connection
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public JMSConnectionAlias updateJMSConnection(Consumer<UpdateJMSConnectionOperationSpec> spec) {
        UpdateJMSConnectionOperationSpec r = new UpdateJMSConnectionOperationSpec(spec);
        return api.updateJMSConnection(r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JMS trigger
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public JMSTrigger updateJMSTrigger(Consumer<UpdateJMSTriggerOperationSpec> spec) {
        UpdateJMSTriggerOperationSpec r = new UpdateJMSTriggerOperationSpec(spec);
        return api.updateJMSTrigger(r.body());
    }

    /**
     * <p>
     * This REST service is used to update the JNDI configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public JNDIProviderAlias updateJNDI(Consumer<UpdateJNDIOperationSpec> spec) {
        UpdateJNDIOperationSpec r = new UpdateJNDIOperationSpec(spec);
        return api.updateJNDI(r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload for Kerberos settings in API Gateway.</li>
     * </ul>
     */
    public void updateKerberos(Consumer<UpdateKerberosOperationSpec> spec) {
        UpdateKerberosOperationSpec r = new UpdateKerberosOperationSpec(spec);
        api.updateKerberos(r.body());
    }

    /**
     * <p>
     * Updates an already existing keystore in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>keyStoreName: The name of the keystore. It cannot contain spaces or special characters. The name of the key store must be unique across all the keystores created in API Gateway.</li>
     *   <li>keyStoreType: The certificate file format of the keystore.</li>
     *   <li>keyStoreProvider: The provider that is used for the keystore type. The default is SUN for JKS type and SunJSSE for PKCS12 type.</li>
     *   <li>keyStorePassword: The keystore password that is defined at the time of keystore creation using a keystore utility.</li>
     *   <li>uploadFileName: The name of the keystore file that will be used to save the keystore internally in API Gateway.</li>
     *   <li>fileContent: The contents of the keystore file.</li>
     *   <li>keyStoreDescription: The description for the keystore.</li>
     *   <li>pkAliasesList: Comma separated list of alias names in the uploaded keystore file.</li>
     *   <li>pkPasswordsList: Comma separated list of passwords in the same order as the aliases specified in pkAliasesList. If a particular key alias does not have a password, it is denoted by space.</li>
     *   <li>nullPKpasswds: Comma separated list of boolean values (true/false) indicating whether the particular alias has a password or not in the same order as the aliases specified in pkAliasesList. For each key alias, true indicates that the key alias does not have a password and false indicates that it does have a password.</li>
     *   <li>isPwdBase64Encoded: Specifies whether password is base 64 encoded.</li>
     * </ul>
     */
    public KeyStore updateKeystoreAliases(Consumer<UpdateKeystoreAliasesOperationSpec> spec) {
        UpdateKeystoreAliasesOperationSpec r = new UpdateKeystoreAliasesOperationSpec(spec);
        return api.updateKeystoreAliases(r.keyStoreName(), r.keyStoreType(), r.keyStoreProvider(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.pkAliasesList(), r.pkPasswordsList(), r.nullPKpasswds(), r.isPwdBase64Encoded());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload for updating license details in APIGateway.</li>
     * </ul>
     */
    public void updateLicenseDetails(Consumer<UpdateLicenseDetailsOperationSpec> spec) {
        UpdateLicenseDetailsOperationSpec r = new UpdateLicenseDetailsOperationSpec(spec);
        api.updateLicenseDetails(r.body());
    }

    /**
     * <p>
     * The method is used to configure the listener in the datacenter in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Listener configuration payload</li>
     * </ul>
     */
    public ListenerConfig updateListenerConfiguration(Consumer<UpdateListenerConfigurationOperationSpec> spec) {
        UpdateListenerConfigurationOperationSpec r = new UpdateListenerConfigurationOperationSpec(spec);
        return api.updateListenerConfiguration(r.body());
    }

    /**
     * <p>
     * The method updates the master password in API Gateway.On successful update,all the old passwords available will be encrypted using this new master password.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public MasterPasswordUpdateResponse updateMasterPassword(Consumer<UpdateMasterPasswordOperationSpec> spec) {
        UpdateMasterPasswordOperationSpec r = new UpdateMasterPasswordOperationSpec(spec);
        return api.updateMasterPassword(r.body());
    }

    /**
     * <p>
     * Use this method to update an OAuth scope mapping
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>oauthScopeId: The path parameter specifies the id of an OAuth scope mapping that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an OAuth scope that is to be updated in API Gateway.</li>
     * </ul>
     */
    public GatewayScope updateOAuthScope(Consumer<UpdateOAuthScopeOperationSpec> spec) {
        UpdateOAuthScopeOperationSpec r = new UpdateOAuthScopeOperationSpec(spec);
        return api.updateOAuthScope(r.oauthScopeId(), r.body());
    }

    /**
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload of an outbound proxy server that is to be updated in API Gateway.</li>
     * </ul>
     */
    public void updateOutboundProxy(Consumer<UpdateOutboundProxyOperationSpec> spec) {
        UpdateOutboundProxyOperationSpec r = new UpdateOutboundProxyOperationSpec(spec);
        api.updateOutboundProxy(r.body());
    }

    /**
     * <p>
     * This endpoint is used to update the package metadata and
     * associate or remove APIs and plans. The package can be active while editing any details of the package. If an API is added to an active package then subscribers can start consuming the API with existing key. Similarly if the API is removed, subscribers wont be able to use the removed APIs. Removal of plan is allowed only if the plan does not have any subscribers. You need to republish the package to portal to make the updated changes available in portal.
     *  Please use /package/{packageId}/active or /package/{packageId}/deactivate to activate or deactivate as this endpoint cannot be used to activate or deactivate package.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>packageId: package id to which the update requests is sent</li>
     *   <li>body: </li>
     * </ul>
     */
    public PackageResponseContainer updatePackageByPackageId(Consumer<UpdatePackageByPackageIdOperationSpec> spec) {
        UpdatePackageByPackageIdOperationSpec r = new UpdatePackageByPackageIdOperationSpec(spec);
        return api.updatePackageByPackageId(r.packageId(), r.body());
    }

    /**
     * <p>
     * This request is used to update the plan meta data such as name, description, license details. To update the rate limit or quota use the /policies/{policyId} to get the throttling/MSLA policy action id and use /policyActions/{policyActionId} to update the rate limit or quota. To associate or dis associate a package use /packages/{packageId} end point.
     * If the rate limit or quota changes it will be automatically enforced with updated with out re activating the package.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>planId: The id of the plan whose details needs to be updated.</li>
     *   <li>body: </li>
     * </ul>
     */
    public PlanGetResponse updatePlanByPlanId(Consumer<UpdatePlanByPlanIdOperationSpec> spec) {
        UpdatePlanByPlanIdOperationSpec r = new UpdatePlanByPlanIdOperationSpec(spec);
        return api.updatePlanByPlanId(r.planId(), r.body());
    }

    /**
     * <p>
     * This put request is used to update policy action based on the policy action id which is specified in path
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyActionId: This path parameter is used to specify the policy action id which needs to be updated.</li>
     *   <li>body: Contains the policy action details which needs to be updated.</li>
     * </ul>
     */
    public PolicyActionWrapper updatePolicyAction(Consumer<UpdatePolicyActionOperationSpec> spec) {
        UpdatePolicyActionOperationSpec r = new UpdatePolicyActionOperationSpec(spec);
        return api.updatePolicyAction(r.policyActionId(), r.body());
    }

    /**
     * <p>
     * This REST request is used to update the policy details for a specific policy. For Global policy user should have API Gateway administrator access to update global policy
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>policyId: This path parameter is used to specify the policy id that needs to be updated.</li>
     *   <li>body: </li>
     * </ul>
     */
    public Policy updatePolicyByID(Consumer<UpdatePolicyByIDOperationSpec> spec) {
        UpdatePolicyByIDOperationSpec r = new UpdatePolicyByIDOperationSpec(spec);
        return api.updatePolicyByID(r.policyId(), r.body());
    }

    /**
     * <p>
     * The PUT method updates an existing port configuration. Updating an enabled port implies that it is disabled and enabled again.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public Port updatePort(Consumer<UpdatePortOperationSpec> spec) {
        UpdatePortOperationSpec r = new UpdatePortOperationSpec(spec);
        return api.updatePort(r.body());
    }

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request payload of proxybypass that is to be updated in API Gateway.</li>
     * </ul>
     */
    public void updateProxyBypass(Consumer<UpdateProxyBypassOperationSpec> spec) {
        UpdateProxyBypassOperationSpec r = new UpdateProxyBypassOperationSpec(spec);
        api.updateProxyBypass(r.body());
    }

    /**
     * <p>
     * This method is to be used to update the registered APIs list for an application. To add a new api to an application which is already registered with other APIs, you should send the complete list of apiIds including the old apiIds and the new apiId(s) to be added. To remove all APIs from the application, send an empty array for the apiIds field in the request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: This parameter specifies the ID of an application for updating the details of the registered APIs in API Gateway.</li>
     *   <li>body: This parameter specifies the ID of a registered API that is to be updated in API Gateway.</li>
     * </ul>
     */
    public void updateRegisteredApis(Consumer<UpdateRegisteredApisOperationSpec> spec) {
        UpdateRegisteredApisOperationSpec r = new UpdateRegisteredApisOperationSpec(spec);
        api.updateRegisteredApis(r.applicationId(), r.body());
    }

    /**
     * <p>
     * The method is used to configure the other datacenter connectivity information in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Ring configuration payload</li>
     * </ul>
     */
    public RemotePortConfig updateRingConfiguration(Consumer<UpdateRingConfigurationOperationSpec> spec) {
        UpdateRingConfigurationOperationSpec r = new UpdateRingConfigurationOperationSpec(spec);
        return api.updateRingConfiguration(r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified rule in API Gateway. The API request body must contain the payload for the updated rule.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ruleId: The path parameter specifies the id of the rule that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of an rule that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Rule updateRule(Consumer<UpdateRuleOperationSpec> spec) {
        UpdateRuleOperationSpec r = new UpdateRuleOperationSpec(spec);
        return api.updateRule(r.ruleId(), r.body());
    }

    /**
     * <p>
     * This REST operation is used to update a stage in the source API Gateway where promotion will be initiated. A stage is just another API Gateway instance. When the stage url is https, then keystore and keystore alias will also be expected while configuring a stage
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>stageId: Stage Id for the stage to be updated</li>
     *   <li>body: Stage request payload</li>
     * </ul>
     */
    public Stage updateStage(Consumer<UpdateStageOperationSpec> spec) {
        UpdateStageOperationSpec r = new UpdateStageOperationSpec(spec);
        return api.updateStage(r.stageId(), r.body());
    }

    /**
     * <p>
     * This REST operation is used to update a strategy
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>strategyId: This parameter specifies the ID of a strategy that is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of a strategy that is to be updated in API Gateway.</li>
     * </ul>
     */
    public OneOfStrategyModel updateStrategy(Consumer<UpdateStrategyOperationSpec> spec) {
        UpdateStrategyOperationSpec r = new UpdateStrategyOperationSpec(spec);
        return api.updateStrategy(r.strategyId(), r.body());
    }

    /**
     * <p>
     * This is used switch the subscription from one package and plan to another package and plan combination. If approval is enabled, then the request will return old application detail as response and will create a request for approver to approve the switch. Till the request get approved the user can invoke old package APIs only. After the subscription is switched, the quota for the subscription will be reset and will be able to invoke the new APIs using the same API Key. To get the history of the subscription usage use the /transactionalEvents/_search endpoint
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>applicationId: Application id to update the subscription details</li>
     *   <li>body: </li>
     * </ul>
     */
    public Application updateSubscription(Consumer<UpdateSubscriptionOperationSpec> spec) {
        UpdateSubscriptionOperationSpec r = new UpdateSubscriptionOperationSpec(spec);
        return api.updateSubscription(r.applicationId(), r.body());
    }

    /**
     * <p>
     * Updates an already existing truststore in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>trustStoreName: The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.</li>
     *   <li>keyStoreType: The certificate file format of the truststore.</li>
     *   <li>keyStoreProvider: The provider that is used for the truststore type.</li>
     *   <li>keyStorePassword: The truststore password that is defined at the time of truststore creation using a keystore utility.</li>
     *   <li>uploadFileName: The name of the truststore file that will be used to save the truststore internally in API Gateway.</li>
     *   <li>fileContent: The contents of the truststore file.</li>
     *   <li>keyStoreDescription: The description for the truststore.</li>
     *   <li>isPwdBase64Encoded: Specifies whether password is base 64 encoded.</li>
     * </ul>
     */
    public TrustStore updateTruststore(Consumer<UpdateTruststoreOperationSpec> spec) {
        UpdateTruststoreOperationSpec r = new UpdateTruststoreOperationSpec(spec);
        return api.updateTruststore(r.trustStoreName(), r.keyStoreType(), r.keyStoreProvider(), r.keyStorePassword(), r.uploadFileName(), r.fileContent(), r.keyStoreDescription(), r.isPwdBase64Encoded());
    }

    /**
     * <p>
     * Updates an existing URL Alias in API Gateway.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The request body for updating an existing URL Alias in API Gateway.</li>
     * </ul>
     */
    public URLAliasSettings updateURLALias(Consumer<UpdateURLALiasOperationSpec> spec) {
        UpdateURLALiasOperationSpec r = new UpdateURLALiasOperationSpec(spec);
        return api.updateURLALias(r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified user in API Gateway. The API request body must contain the payload for the updated user.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The path parameter specifies the id of an user whose detail is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of a user that is to be updated in API Gateway.</li>
     * </ul>
     */
    public User updateUser(Consumer<UpdateUserOperationSpec> spec) {
        UpdateUserOperationSpec r = new UpdateUserOperationSpec(spec);
        return api.updateUser(r.userId(), r.body());
    }

    /**
     * <p>
     * The method updates the details of a specified webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be updated.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The path parameter specifies the id of an webhook whose detail is to be updated in API Gateway.</li>
     *   <li>body: This parameter describes the request payload of webhook that is to be updated in API Gateway.</li>
     * </ul>
     */
    public Webhook updateWebhook(Consumer<UpdateWebhookOperationSpec> spec) {
        UpdateWebhookOperationSpec r = new UpdateWebhookOperationSpec(spec);
        return api.updateWebhook(r.id(), r.body());
    }

    /**
     * <p>
     * This REST service is used to update the Webservice endpoint
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public WebserviceEndpointAlias updateWebserviceEndpoint(Consumer<UpdateWebserviceEndpointOperationSpec> spec) {
        UpdateWebserviceEndpointOperationSpec r = new UpdateWebserviceEndpointOperationSpec(spec);
        return api.updateWebserviceEndpoint(r.body());
    }

    /**
     * <p>
     * The PUT updates the ipAccessMode for an API Gateway port configuration
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>listenerKey: The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.</li>
     *   <li>body: The request contains update the ip access mode hosts list information.</li>
     * </ul>
     */
    public IPAccessModeHostsList updatedIPAccessMode(Consumer<UpdatedIPAccessModeOperationSpec> spec) {
        UpdatedIPAccessModeOperationSpec r = new UpdatedIPAccessModeOperationSpec(spec);
        return api.updatedIPAccessMode(r.listenerKey(), r.body());
    }

}

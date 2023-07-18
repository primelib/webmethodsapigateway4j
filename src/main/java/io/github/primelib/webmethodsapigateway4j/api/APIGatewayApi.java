package io.github.primelib.webmethodsapigateway4j.api;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;
import lombok.Data;

import io.github.primelib.webmethodsapigateway4j.model.APIResponseCreate;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseDelete;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetAPI;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetAPIs;
import io.github.primelib.webmethodsapigateway4j.model.APIResponseGetGlobalPolicies;
import io.github.primelib.webmethodsapigateway4j.model.APIResponsesModel;
import io.github.primelib.webmethodsapigateway4j.model.AccessModeServices;
import io.github.primelib.webmethodsapigateway4j.model.AccessModeType;
import io.github.primelib.webmethodsapigateway4j.model.AccessProfile;
import io.github.primelib.webmethodsapigateway4j.model.AccessTokensTypeModel;
import io.github.primelib.webmethodsapigateway4j.model.AccountLockSettings;
import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.AnalyticsDataStoreDestination;
import io.github.primelib.webmethodsapigateway4j.model.Application;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalPutRequest;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalPutResponse;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalRequest;
import io.github.primelib.webmethodsapigateway4j.model.ApprovalResponsePayload;
import io.github.primelib.webmethodsapigateway4j.model.ArchiveTraceInfoRequest;
import io.github.primelib.webmethodsapigateway4j.model.AssertionConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.AuditLogDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSCommunicationDestination;
import io.github.primelib.webmethodsapigateway4j.model.CSSNMPDestination;
import io.github.primelib.webmethodsapigateway4j.model.CallbackProcessorSettings;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerRequest;
import io.github.primelib.webmethodsapigateway4j.model.ChangeOwnerResponse;
import io.github.primelib.webmethodsapigateway4j.model.ClusterInfo;
import io.github.primelib.webmethodsapigateway4j.model.CreateAPIRequest;
import io.github.primelib.webmethodsapigateway4j.model.DenyByIPForFailedAuthConfig;
import io.github.primelib.webmethodsapigateway4j.model.Destination;
import io.github.primelib.webmethodsapigateway4j.model.Document;
import io.github.primelib.webmethodsapigateway4j.model.DocumentResponse;
import io.github.primelib.webmethodsapigateway4j.model.ElasticsearchDestination;
import io.github.primelib.webmethodsapigateway4j.model.EmailDestination;
import io.github.primelib.webmethodsapigateway4j.model.ErrorProcessing;
import io.github.primelib.webmethodsapigateway4j.model.ExtendedSettingsInput;
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
import io.github.primelib.webmethodsapigateway4j.model.InputGatewayEndpoints;
import io.github.primelib.webmethodsapigateway4j.model.InputIntegrationServerPublish;
import io.github.primelib.webmethodsapigateway4j.model.InputLdapConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.InputPublish;
import io.github.primelib.webmethodsapigateway4j.model.InputServiceRegistryPublish;
import io.github.primelib.webmethodsapigateway4j.model.InputServiceRegistryUnpublish;
import io.github.primelib.webmethodsapigateway4j.model.InputVersion;
import io.github.primelib.webmethodsapigateway4j.model.JMSConnectionAlias;
import io.github.primelib.webmethodsapigateway4j.model.JMSTrigger;
import io.github.primelib.webmethodsapigateway4j.model.JNDIProviderAlias;
import io.github.primelib.webmethodsapigateway4j.model.JWT;
import io.github.primelib.webmethodsapigateway4j.model.JWTServiceInput;
import io.github.primelib.webmethodsapigateway4j.model.JWTServiceOutput;
import io.github.primelib.webmethodsapigateway4j.model.KerberosSettings;
import io.github.primelib.webmethodsapigateway4j.model.KeyStore;
import io.github.primelib.webmethodsapigateway4j.model.KeystoreTruststore;
import io.github.primelib.webmethodsapigateway4j.model.LicenseDetail;
import io.github.primelib.webmethodsapigateway4j.model.ListenerConfig;
import io.github.primelib.webmethodsapigateway4j.model.Listeners;
import io.github.primelib.webmethodsapigateway4j.model.LoadBalancer;
import java.time.LocalDate;
import io.github.primelib.webmethodsapigateway4j.model.LockedAccounts;
import io.github.primelib.webmethodsapigateway4j.model.LogConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryInterval;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordExpiryIntervalResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordProperties;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordResetResponse;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdate;
import io.github.primelib.webmethodsapigateway4j.model.MasterPasswordUpdateResponse;
import io.github.primelib.webmethodsapigateway4j.model.MessageWithPortReference;
import io.github.primelib.webmethodsapigateway4j.model.MigrationConfig;
import io.github.primelib.webmethodsapigateway4j.model.MobileApplicationConfiguration;
import io.github.primelib.webmethodsapigateway4j.model.ModelAPIResponse;
import io.github.primelib.webmethodsapigateway4j.model.ModelPackage;
import io.github.primelib.webmethodsapigateway4j.model.Multipart;
import io.github.primelib.webmethodsapigateway4j.model.OneOfStrategyModel;
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxyGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.OutboundProxySettings;
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
import io.github.primelib.webmethodsapigateway4j.model.SearchContext;
import io.github.primelib.webmethodsapigateway4j.model.ServerInfo;
import io.github.primelib.webmethodsapigateway4j.model.ServiceInput;
import io.github.primelib.webmethodsapigateway4j.model.ServiceOutput;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryPublishGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryPublishPutResponse;
import io.github.primelib.webmethodsapigateway4j.model.ServiceRegistryUnpublishPutResponse;
import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.Shutdown;
import io.github.primelib.webmethodsapigateway4j.model.Stage;
import io.github.primelib.webmethodsapigateway4j.model.StrategyRequest;
import io.github.primelib.webmethodsapigateway4j.model.SubscriptionRequest;
import io.github.primelib.webmethodsapigateway4j.model.SubscriptionUpdateRequest;
import io.github.primelib.webmethodsapigateway4j.model.TraceLog;
import io.github.primelib.webmethodsapigateway4j.model.TransactionEvent;
import io.github.primelib.webmethodsapigateway4j.model.TransactionResponse;
import io.github.primelib.webmethodsapigateway4j.model.TrustStore;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasSettings;
import io.github.primelib.webmethodsapigateway4j.model.URLAliasesGetResponse;
import io.github.primelib.webmethodsapigateway4j.model.UnlockAccountsRequest;
import io.github.primelib.webmethodsapigateway4j.model.UpdateAPIRequest;
import io.github.primelib.webmethodsapigateway4j.model.Usage;
import io.github.primelib.webmethodsapigateway4j.model.User;
import io.github.primelib.webmethodsapigateway4j.model.Webhook;
import io.github.primelib.webmethodsapigateway4j.model.WebserviceEndpointAlias;
import io.github.primelib.webmethodsapigateway4j.model.WhiteListedIPs;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface APIGatewayApi {

    /**
     * <p>
     * Activate an API so that API is exposed to consumers
     *
     * @param apiId                API Id for the API to be activated (required)
     */
    @RequestLine("PUT /apis/{apiId}/activate")
    ModelAPIResponse activateAPI(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * The method is used to activate the datacenter configuration in API Gateway.
     *
     * @param body                 Mode to activate (required)
     */
    @RequestLine("PUT /dataspace/activate")
    @Headers({
        "Content-Type: application/json"
    })
    String activateDC(@NotNull String body);

    /**
     * <p>
     * This REST request is used to activate a global policy and this request doesn't require any request body. This request will try to activate the global policy and if any error occurs during activation it will be reported as response or if the global policy is activated then its policy details active flag set to true will be sent as response. If the global policy have any conflicts then it cannot be activated the conflicts are manually resolved.
     *
     * @param policyId             The path parameter should be the policy id of global policy that needs to be activated. If the policy id is not belongs to a global policy then error will be reported (required)
     */
    @RequestLine("PUT /policies/{policyId}/activate")
    Policy activateGlobalPolicyByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * The method is used to activate all the datacenters configuration in API Gateway.
     *
     * @param body                 Activate all nodes (required)
     */
    @RequestLine("PUT /dataspace/activateAll")
    @Headers({
        "Content-Type: application/json"
    })
    Object activateNodes(@NotNull Object body);

    /**
     * <p>
     * This endpoint is used to activate the package. Once activated it will insert new Authentication policy for all associated APIs with API key as application identification condition. If the authentication policy already available or added to an API after activating the package, the package will add API key to that authentication policy if it is not there. It also make the condition as OR for application identification condition available in the authentication policy
     *
     * @param packageId            package id which needs to be activated (required)
     */
    @RequestLine("PUT /packages/{packageId}/activate")
    PackageResponseContainer activatePackageByPackageId(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * This REST request is used to activate a rule and this request doesn't require any request body.
     *
     * @param ruleId               The path parameter should be the id of rule that needs to be activated. (required)
     */
    @RequestLine("PUT /rule/{ruleId}/activate")
    Rule activateRule(@Param("ruleId") @NotNull String ruleId);

    /**
     * Perform administration health check
     * <p>
     * Perform health check for administration parts of API Gateway, such as the UI accessibility and Kibana health.
     *
     */
    @RequestLine("GET /admin")
    HealthCheckAdminResult adminGet();

    /**
     * <p>
     * This REST call is intent to get the aggregation results for the specified scope and types. Supported aggregations are grouping, metrics and timeseries.
     * Grouping aggregation is used to find the count based on grouping of certain fields.
     * Metrics aggregation is used to find the average, minimum, maximum and sum of a field.
     * Timeseries aggregation is used to find the interval based and allowed intervals are second, minute, hour, day, week, month, quarter and year. In addition to the /search payload, aggregations fields like 'name', 'type' and 'fields'. Except types, scope, condition and aggregations other attributes are not considered during the REST API call.
     *
     * @param body                 Search Parameters to search for specific set of results on specified types (required)
     */
    @RequestLine("POST /search/_aggregations")
    @Headers({
        "Content-Type: application/json"
    })
    Map<String, Object> aggregations(@NotNull SearchContext body);

    /**
     * Perform health check for all components of API Gateway
     * <p>
     * Perform health check for all components of API Gateway.
     *
     */
    @RequestLine("GET /all")
    HealthCheckAllResult allGet();

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
     * The method is used to update the patch configuration in the datacenter in API Gateway.
     *
     * @param body                 Ring configuration payload (required)
     */
    @RequestLine("PATCH /dataspace/ring")
    @Headers({
        "Content-Type: application/json"
    })
    RemotePortConfig appendRingConfiguration(@NotNull RemotePortConfig body);

    /**
     * <p>
     * Request payload for the approval request.
     *
     * @param approvalId           ApprovalId for the Approval Request to be approved (required)
     * @param action               Action for the Approval Request to be approved/rejected (required)
     * @param body                 Approval Request payload (optional)
     */
    @RequestLine("PUT /approvals/{approvalId}/{action}")
    @Headers({
        "Content-Type: application/json"
    })
    ApprovalPutResponse approveorrejectApprovalRequest(@Param("approvalId") @NotNull String approvalId, @Param("action") @NotNull String action, @Nullable ApprovalPutRequest body);

    /**
     * <p>
     * Request payload to archive tracer events.
     *
     * @param body                 Request payload to archive tracer events. (required)
     */
    @RequestLine("POST /tracer/archive")
    @Headers({
        "Content-Type: application/json"
    })
    void archiveTraceInfo(@NotNull ArchiveTraceInfoRequest body);

    /**
     * <p>
     * This HTTP request authenticates an User in API Gateway.
     *
     * @param body                 This parameter describes the request payload of a user that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /authenticate")
    @Headers({
        "Content-Type: application/json"
    })
    User authorize(@NotNull User body);

    /**
     * <p>
     * This HTTP request authenticates an User in API Gateway.
     *
     * @param body                 This parameter describes the request payload of a user that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /users/authenticate")
    @Headers({
        "Content-Type: application/json"
    })
    User authorizeUser(@NotNull User body);

    /**
     * <p>
     * This resource is used to change the owner of APIGateway asset
     *
     * @param body                  (required)
     */
    @RequestLine("POST /assets/owner")
    @Headers({
        "Content-Type: application/json"
    })
    ChangeOwnerResponse changeOwner(@NotNull ChangeOwnerRequest body);

    /**
     * <p>
     * This resource is used to change the team of APIGateway asset
     *
     * @param body                  (required)
     */
    @RequestLine("POST /assets/team")
    @Headers({
        "Content-Type: application/json"
    })
    ChangeOwnerResponse changeTeam(@NotNull ChangeOwnerRequest body);

    /**
     * <p>
     * This REST Request is used to get the conflicts for a global policy. Conflicts between the policies/APIs can arise if the policies contain the conflicting policy actions. For example, a global policy that contains the Identity and Access Policy with "API Key" will conflict with another global policy that contains the Identity and Access Policy with "OAuth2". If an API satisfy more than one global policy, then all the policy actions of all applicable global policy will be added for effective policy calculation. If any policy validation error occurred it will be reported as conflict.
     * This REST request doesn't require request body. By Default it will return the conflicts for all applicable APIs and conflicts between the specified global policy and other active global policies. Additionally, we can use the query parameter to get the conflicts for active or all applicable APIs.
     *  If there is conflict, status 500 is returned along with the details on conflicting scenarios and if there is no conflict then status 200 is returned
     *
     * @param policyId             This path parameter is used to specify the global policy id to which we need to conflicting case for a global policy (required)
     * @param active               This is a query parameter. It is used to get conflicting case for a global policy. If the value for this parameter is 'false' then it will return conflicting scenario for all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return conflicting case only for the list of applicable active APIs alone (optional)
     */
    @RequestLine("GET /policies/{policyId}/conflicts?active={active}")
    Policy checkConflictForGlobalPolicy(@Param("policyId") @NotNull String policyId, @Param("active") @Nullable String active);

    /**
     * <p>
     * The method is used to configure the datacenters in API Gateway.
     *
     * @param body                 Dataspace configuration payload (required)
     */
    @RequestLine("PUT /dataspace/configure")
    @Headers({
        "Content-Type: application/json"
    })
    Object configureNodes(@NotNull Object body);

    /**
     * <p>
     * This REST call is intent to get the total number of records for the specified scope and types. If the scope is not specified it returns total number of assets for the specified type. Both /search and /search/_count shares the same payload. Except types,scope and condition other attributes are not considered during the REST API call.
     *
     * @param body                 Search Parameters to search for specific set of results on specified types (required)
     */
    @RequestLine("POST /search/_count")
    @Headers({
        "Content-Type: application/json"
    })
    Map<String, Integer> countByType(@NotNull SearchContext body);

    /**
     * <p>
     * This REST operation is used to create an API by importing a file, url or from scratch
     *
     * @param body                  (required)
     */
    @RequestLine("POST /apis")
    @Headers({
        "Content-Type: application/json"
    })
    APIResponseCreate createAPI(@NotNull CreateAPIRequest body);

    /**
     * <p>
     * This method allows you to create the API Portal configuration in API Gateway.
     *
     * @param body                 API Portal configuration payload (required)
     */
    @RequestLine("POST /portalGateways")
    @Headers({
        "Content-Type: application/json"
    })
    PortalGateway createAPIPortalConfiguration(@NotNull PortalGateway body);

    /**
     * <p>
     * The POST defines the access mode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     * @param body                 The request contains the access mode information. (required)
     */
    @RequestLine("POST /ports/{listenerKey}/accessMode")
    @Headers({
        "Content-Type: application/json"
    })
    AccessModeType createAccessMode(@Param("listenerKey") @NotNull String listenerKey, @NotNull AccessModeType body);

    /**
     * <p>
     * The method creates a team in API Gateway. The API request body must contain the payload for the team. Each bit infers the applicability of the functional privilege permission. Value 1 implies permission granted for that functional privilege. Value
     * 0 implies denied permission. Function Privileges and its positions from left most bit to the right most bit. 1.Manage APIs2.Activate / Deactivate APIs3.Manage applications4.Manage aliases5.Manage global policies6.Activate / Deactivate global policies7.Manage policy templates8.Manage threat protection configurations9.Manage packages and plans10.Activate / Deactivate packages11.Publish to API Portal12.Import assets13.Export assets14.View administration configurations15.Manage general administration configurations16.Manage security configurations17.Manage destination configurations18.Manage system settings19.Manage user administration20.Manage purge and restore runtime events21.Execute service result cache APIs22.Manage Promotion23.Publish API to Service Registry24.Manage Service Registries
     *
     * @param body                 This parameter describes the request payload of a accessProfile that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /accessProfiles")
    @Headers({
        "Content-Type: application/json"
    })
    AccessProfile createAccessProfile(@NotNull AccessProfile body);

    /**
     * <p>
     * Use this method to create an alias. There are different types of alias like Endpoint, Simple etc. Refer to the Alias schema for different type of alias that you can create. If you want to create an alias for a specific type (say Endpoint alias), refer to the corresponding schema (EndpointAlias)
     *
     * @param body                  (required)
     */
    @RequestLine("POST /alias")
    @Headers({
        "Content-Type: application/json"
    })
    Alias createAlias(@NotNull Alias body);

    /**
     * <p>
     * The method creates an application in API Gateway. If you want to use JWT/Oauth/OpenID credentials in your application, you can create a JWT/Oauth/OpenID auth strategy using the resource /strategies POST. You can associate the created strategies to the application using /applications/{applicationId} PUT request using the property authStrategyIds in application. To associate the application to one or more APIs, refer the resource /applications/{applicationId}/apis PUT.
     *
     * @param body                 This parameter describes the request payload of an application that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /applications")
    @Headers({
        "Content-Type: application/json"
    })
    Application createApplication(@NotNull Application body);

    /**
     * <p>
     * The method creates an approval configuration in API Gateway.
     *
     * @param body                 This parameter describes the request payload of an approval configuration that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /approvalConfigurations")
    @Headers({
        "Content-Type: application/json"
    })
    ApprovalConfiguration createApprovalConfiguration(@NotNull ApprovalConfiguration body);

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
     *
     * @param body                 assertion request payload (required)
     */
    @RequestLine("POST /assertions")
    @Headers({
        "Content-Type: application/json"
    })
    AssertionConfiguration createAssertion(@NotNull AssertionConfiguration body);

    /**
     * <p>
     * The method creates a group in API Gateway. The API request body must contain the payload for the group.
     *
     * @param body                 This parameter describes the request payload of a group that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /groups")
    @Headers({
        "Content-Type: application/json"
    })
    Group createGroup(@NotNull Group body);

    /**
     * <p>
     * The POST creates the ipAccessMode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     * @param body                 The request contains the ip access mode type information. (required)
     */
    @RequestLine("POST /ports/{listenerKey}/ipAccessMode")
    @Headers({
        "Content-Type: application/json"
    })
    IPAccessModeType createIPAccessMode(@Param("listenerKey") @NotNull String listenerKey, @NotNull IPAccessModeType body);

    /**
     * <p>
     * The method creates a JMS connection in API Gateway. The API request body must contain the payload for the JMS connection
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/jmsConnections")
    @Headers({
        "Content-Type: application/json"
    })
    JMSConnectionAlias createJMSConnection(@NotNull JMSConnectionAlias body);

    /**
     * <p>
     * The method creates a JNDI configuration in API Gateway. The API request body must contain the payload for the JNDI configuration
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/jndi")
    @Headers({
        "Content-Type: application/json"
    })
    JNDIProviderAlias createJNDI(@NotNull JNDIProviderAlias body);

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
    @Headers({
        "Content-Type: multipart/form-data"
    })
    KeyStore createKeystore(@Param("keyStoreName") @NotNull String keyStoreName, @Param("keyStoreType") @NotNull String keyStoreType, @Param("keyStorePassword") @NotNull String keyStorePassword, @Param("uploadFileName") @NotNull String uploadFileName, @Param("fileContent") @NotNull File fileContent, @Param("keyStoreDescription") @Nullable String keyStoreDescription, @Param("pkAliasesList") @Nullable String pkAliasesList, @Param("pkPasswordsList") @Nullable String pkPasswordsList, @Param("nullPKpasswds") @Nullable String nullPKpasswds, @Param("isPwdBase64Encoded") @Nullable String isPwdBase64Encoded);

    /**
     * <p>
     * Use this method to create an OAuth scope mapping
     *
     * @param body                 This parameter describes the request payload of an OAuth scope that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /scopes")
    @Headers({
        "Content-Type: application/json"
    })
    GatewayScope createOAuthScope(@NotNull GatewayScope body);

    /**
     *
     * @param body                 The request payload of an outbound proxy server that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /is/outboundproxy")
    @Headers({
        "Content-Type: application/json"
    })
    void createOutboundProxy(@NotNull OutboundProxySettings body);

    /**
     * <p>
     * This endpoint is used to create a package in API Gateway.
     *
     * @param body                  (optional)
     */
    @RequestLine("POST /packages")
    @Headers({
        "Content-Type: application/json"
    })
    PackageResponseContainer createPackage(@Nullable ModelPackage body);

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
     *
     * @param body                  (optional)
     */
    @RequestLine("POST /plans")
    @Headers({
        "Content-Type: application/json"
    })
    PlanResponseContainer createPlan(@Nullable Plan body);

    /**
     * <p>
     * This REST request is used to create policy action. The result of this request is a policy action payload and is available in the response. To know about the policy action template and to create it
     * you can use the policyActionTemplates/{templateKey} to get the template structure of a policy action. The template key will be available in policyStage resource.
     * It's also used to create the custom destination using the templateKey 'customDestination'. For more information on custom destination, please refer the postman collections here -
     * https://github.com/SoftwareAG/webmethods-api-gateway/blob/master/apigatewayservices/postmancollections/apis/custom-destination/CustomDestination.json
     *
     * @param body                 Contains the policy action details of the newly created policy action (required)
     */
    @RequestLine("POST /policyActions")
    @Headers({
        "Content-Type: application/json"
    })
    PolicyAction createPolicyAction(@NotNull PolicyAction body);

    /**
     * <p>
     * The POST method creates a new port configuration
     *
     * @param body                  (optional)
     */
    @RequestLine("POST /ports")
    @Headers({
        "Content-Type: application/json"
    })
    Port createPort(@Nullable Port body);

    /**
     * <p>
     * This REST operation is used to promote the API Gateway assets from the source machine to destination machine where the destination machine is configured as a stage
     *
     * @param body                 Promotion request payload (required)
     * @param fixingMissingVersions Option to fix the API version history. The discrepancy between the asset versions in the source and target stages, if any, are fixed. The default value is false (optional)
     * @param overwrite            Option to overwrite the assets except aliases in the destination stage during asset promotion. The default value is false (optional)
     * @param overwriteAlias       Option to overwrite the asset type 'alias' in the destination stage during asset promotion. The default value is 'false'. This parameter takes precedence over the 'overwrite' parameter. (optional)
     */
    @RequestLine("POST /promotion?fixingMissingVersions={fixingMissingVersions}&overwrite={overwrite}&overwriteAlias={overwriteAlias}")
    @Headers({
        "Content-Type: application/json"
    })
    Promotion createPromotion(@NotNull Promotion body, @Param("fixingMissingVersions") @Nullable String fixingMissingVersions, @Param("overwrite") @Nullable Boolean overwrite, @Param("overwriteAlias") @Nullable Boolean overwriteAlias);

    /**
     * <p>
     * The method creates a conditional rule in API Gateway. The API request body must contain the payload for the rule.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /rule")
    @Headers({
        "Content-Type: application/json"
    })
    Rule createRule(@NotNull Rule body);

    /**
     * <p>
     * This REST operation is used to configure a stage in the source API Gateway where promotion will be initiated. A stage is just another API Gateway instance. When the stage url is https, then keystore and keystore alias will also be expected while configuring a stage
     *
     * @param body                 Stage request payload (required)
     */
    @RequestLine("POST /stages")
    @Headers({
        "Content-Type: application/json"
    })
    Stage createStage(@NotNull Stage body);

    /**
     * <p>
     * The method creates a strategy in API Gateway. The API request body must contain the payload for the strategy
     *
     * @param body                 This parameter describes the request payload of a strategy that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /strategies")
    @Headers({
        "Content-Type: application/json"
    })
    OneOfStrategyModel createStrategy(@NotNull StrategyRequest body);

    /**
     * <p>
     * This endpoint is used to create subscription for specified package and plan in the request. If the approval is enabled, the response will not contain the API key but the application id will be available to retrieve the API key later. A approval request will be created in API gateway to approve the subscription. Once the request is approved the application will be provided with an API key. Then you can use subscriptions/{applicationId} GET HTTP method to get the API key
     *
     * @param body                  (optional)
     */
    @RequestLine("POST /subscriptions")
    @Headers({
        "Content-Type: application/json"
    })
    Application createSubscription(@Nullable SubscriptionRequest body);

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
    @Headers({
        "Content-Type: multipart/form-data"
    })
    TrustStore createTruststore(@Param("keyStoreName") @NotNull String keyStoreName, @Param("keyStoreType") @NotNull String keyStoreType, @Param("keyStorePassword") @NotNull String keyStorePassword, @Param("uploadFileName") @NotNull String uploadFileName, @Param("fileContent") @NotNull File fileContent, @Param("keyStoreDescription") @Nullable String keyStoreDescription, @Param("isPwdBase64Encoded") @Nullable String isPwdBase64Encoded);

    /**
     * <p>
     * Creates a new URL Alias in API Gateway.
     *
     * @param body                 The request body for creating a new URL Alias in API Gateway. (required)
     */
    @RequestLine("POST /urlaliases")
    @Headers({
        "Content-Type: application/json"
    })
    URLAliasSettings createURLALias(@NotNull URLAliasSettings body);

    /**
     * <p>
     * The method creates an user in API Gateway. The API request body must contain the payload for the user.
     *
     * @param body                 This parameter describes the request payload of a user that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /users")
    @Headers({
        "Content-Type: application/json"
    })
    User createUser(@NotNull User body);

    /**
     * <p>
     * Create a new version of an API and retain applications if required
     *
     * @param apiId                API Id for the API to be versioned (required)
     * @param body                 Create version request payload (required)
     */
    @RequestLine("POST /apis/{apiId}/versions")
    @Headers({
        "Content-Type: application/json"
    })
    ModelAPIResponse createVersion(@Param("apiId") @NotNull String apiId, @NotNull InputVersion body);

    /**
     * <p>
     * The method creates a webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be saved.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /webhooks")
    @Headers({
        "Content-Type: application/json"
    })
    Webhook createWebhook(@NotNull Webhook body);

    /**
     * <p>
     * The method creates a Webservice endpoint in API Gateway. The API request body must contain the payload for the Webservice endpoint
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/webServiceEndpoints")
    @Headers({
        "Content-Type: application/json"
    })
    WebserviceEndpointAlias createWebserviceEndpoint(@NotNull WebserviceEndpointAlias body);

    /**
     * <p>
     * Deactivate an API so that API is not exposed to consumers
     *
     * @param apiId                API Id for the API to be deactivated (required)
     */
    @RequestLine("PUT /apis/{apiId}/deactivate")
    ModelAPIResponse deactivateAPI(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This REST request is used to deactivate a global policy and it doesn't require any request body. This request tries to deactivate the global policy and if any error occurs during deactivation will be reported as response or if the global policy deactivated the policy details of a global policy with active flag set to false is sent as response. An active global policy cannot have conflicts with other active global policy and hence the
     * deactivation fails only when the conflict occurs between active global policy that is specified and one or more applicable active APIs. This can happen when the applicable active API policy action
     * might depend on one or more policy action from the specified global policy. If you deactivate this policy, it would cause the active API to have an unstable state. Hence the deactivation is reported as failed in this case.
     *
     * @param policyId             The path parameter should be the policy id of global policy that needs to be deactivated. If the policy id is not belongs to a global policy then error will be reported (required)
     */
    @RequestLine("PUT /policies/{policyId}/deactivate")
    Policy deactivateGlobalPolicyByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * This request is used to deactivate the package. Once the package is deactivated, it will remove the authentication policy added or revert the authentication policy to original state in the API. If there are multiple packages associated to an API then the IAM policy will have the behaviour of having API key as application identification condition along with other application identification condition if any selected till last associated package is deactivated.
     *
     * @param packageId            package id which needs to be deactivated (required)
     */
    @RequestLine("PUT /packages/{packageId}/deactivate")
    PackageResponseContainer deactivatePackageByPackageId(@Param("packageId") @NotNull String packageId);

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
     * Delete the inactive API
     *
     * @param apiId                API Id for the API to be deleted (required)
     * @param forceDelete          Flag for force delete. Required when API is associated with some applications (optional, defaults to true)
     */
    @RequestLine("DELETE /apis/{apiId}?forceDelete={forceDelete}")
    APIResponseDelete deleteAPI(@Param("apiId") @NotNull String apiId, @Param("forceDelete") @Nullable Boolean forceDelete);

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
     * Delete the inactive APIs
     *
     * @param apiIds               API Ids for the APIs to be deleted. Multiple API ids combined by comma (required)
     * @param forceDelete          Flag for force delete. Required when API is associated with some applications (optional, defaults to true)
     */
    @RequestLine("DELETE /apis?apiIds={apiIds}&forceDelete={forceDelete}")
    List<APIResponseDelete> deleteAPIs(@Param("apiIds") @NotNull String apiIds, @Param("forceDelete") @Nullable Boolean forceDelete);

    /**
     * <p>
     * The method deletes a team from API Gateway.
     *
     * @param accessProfileId      This parameter specifies the ID of a team that is to be deleted in API Gateway. (required)
     */
    @RequestLine("DELETE /accessProfiles/{accessProfileId}")
    void deleteAccessProfile(@Param("accessProfileId") @NotNull String accessProfileId);

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
     * The method deletes the specified application in API Gateway.
     *
     * @param applicationId        This parameter specifies the ID of an application to be deleted. (required)
     */
    @RequestLine("DELETE /applications/{applicationId}")
    void deleteApplic(@Param("applicationId") @NotNull String applicationId);

    /**
     * <p>
     * The method deletes the specified applications in API Gateway.
     *
     * @param ids                  You can delete multiple applications using the query parameter 'ids' by providing the ids as comma-separated values. Example:  /applications?ids=375db639-01f7-4488-b14f-09daae622e18,afb0b5c0-0b0e-4d44-b139-e64d0dbf028c (optional)
     */
    @RequestLine("DELETE /applications?ids={ids}")
    void deleteApplications(@Param("ids") @Nullable String ids);

    /**
     * <p>
     * The method deletes the specified approval configuration in API Gateway.
     *
     * @param id                   This parameter specifies the ID of an approval configuration that is to be deleted in API Gateway. (required)
     */
    @RequestLine("DELETE /approvalConfigurations/{id}")
    void deleteApprovalConfiguration(@Param("id") @NotNull String id);

    /**
     * <p>
     * Delete the Approval Request with the given approvalId
     *
     * @param approvalId           Approval Request Id for the Approval Request to be deleted (required)
     */
    @RequestLine("DELETE /approvals/{approvalId}")
    void deleteApprovalRequest(@Param("approvalId") @NotNull String approvalId);

    /**
     * <p>
     * This delete request will delete the assertion based on the assertion id which is specified in path
     *
     * @param assertionId          This path parameter is used to specify the assertion id for which assertion needs to deleted. (required)
     */
    @RequestLine("DELETE /assertions/{assertionId}")
    void deleteAssertion(@Param("assertionId") @NotNull String assertionId);

    /**
     * <p>
     * This REST Request is used to request for deletion of Service Result cache for the API using apiName and apiVersion
     *
     * @param apiName              This query parameter is used to specify the API name for which the service result cache deletion is requsted. (required)
     * @param apiVersion           The version of the apiName parameter specified (required)
     */
    @RequestLine("DELETE /serviceResultCache?apiName={apiName}&apiVersion={apiVersion}")
    void deleteCacheDetailsByapiNameAndVersion(@Param("apiName") @NotNull String apiName, @Param("apiVersion") @NotNull String apiVersion);

    /**
     * <p>
     * This REST Request is used to request for deletion of Service Result Cache for the API using api id
     *
     * @param apiId                The id of API for which the Service Result Cache deletion is requested (required)
     */
    @RequestLine("DELETE /serviceResultCache/{apiId}")
    void deleteCacheDetailsbyAPIId(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This DELETE method is used to remove the IP from Denied IPs list. Once removed the request from IP will be processed.
     *
     * @param IP                    (required)
     */
    @RequestLine("DELETE /denialofservice/deniedIP?IP={IP}")
    void deleteDeniedIPs(@Param("IP") @NotNull String IP);

    /**
     * <p>
     * Deletes the stored document from API Gateway
     *
     * @param documentId           Id of the document for deletion (required)
     */
    @RequestLine("DELETE /documents/{documentId}")
    void deleteDocument(@Param("documentId") @NotNull String documentId);

    /**
     * <p>
     * The method deletes a group from API Gateway.
     *
     * @param groupId              The path parameter specifies the id of a group that is to be deleted from API Gateway. (required)
     */
    @RequestLine("DELETE /groups/{groupId}")
    void deleteGroup(@Param("groupId") @NotNull String groupId);

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
     * This method deletes the requested OAuth scope mapping.
     *
     * @param oauthScopeId         The path parameter specifies the id of an OAuth scope mapping that is to be deleted from API Gateway. (required)
     */
    @RequestLine("DELETE /scopes/{oauthScopeId}")
    void deleteOAuthScope(@Param("oauthScopeId") @NotNull String oauthScopeId);

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
     * Deletes package from API gateway. Also deletes the association of plans and APIs to that package.
     *
     * @param packageId            Id of the Package (required)
     */
    @RequestLine("DELETE /packages/{packageId}")
    void deletePackageById(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * This request is used to delete the plan by plan id. Before deleting the plan, the plan should removed from all of its associated packages else API gateway will not allow the plan to be deleted. You can use /packages/{packageId} resource dis associate the plan from its corresponding packages. The associated rate limit and quota policy will be deleted automatically when the plan is deleted.
     *
     * @param planId               Id of a Plan (required)
     */
    @RequestLine("DELETE /plans/{planId}")
    void deletePlanById(@Param("planId") @NotNull String planId);

    /**
     * <p>
     * This delete request will delete the policy action based on the policy action id which is specified in path
     *
     * @param policyActionId       Policy Action ID (required)
     */
    @RequestLine("DELETE /policyActions/{policyActionId}")
    void deletePolicyAction(@Param("policyActionId") @NotNull String policyActionId);

    /**
     * <p>
     * This REST request is used to delete the policy from API gateway. This request will automatically delete the associated policy action for this policy
     *
     * @param policyId             This path parameter is used to specify the policy id that needs to be deleted. If the policy id specified is global policy then it needs to be in inactive state to delete. Active global policy and global policy with systemPolicy property set to true cannot be deleted. (required)
     */
    @RequestLine("DELETE /policies/{policyId}")
    void deletePolicyByID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * The DELETE method removes a port configuration
     *
     * @param pkg                  The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot. (optional)
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within a package. (optional)
     */
    @RequestLine("DELETE /ports?pkg={pkg}&listenerKey={listenerKey}")
    void deletePort(@Param("pkg") @Nullable String pkg, @Param("listenerKey") @Nullable String listenerKey);

    /**
     * <p>
     * Delete the promotion
     *
     * @param promotionId          Promotion Id for the promotion to be deleted (required)
     */
    @RequestLine("DELETE /promotion/{promotionId}")
    void deletePromotion(@Param("promotionId") @NotNull String promotionId);

    /**
     * <p>
     * Delete the rollback
     *
     * @param rollbackId           Rollback Id for the rollback to be deleted (required)
     */
    @RequestLine("DELETE /rollback/{rollbackId}")
    void deleteRollback(@Param("rollbackId") @NotNull String rollbackId);

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
     * Delete the stage
     *
     * @param stageId              Stage Id for the stage to be deleted (required)
     */
    @RequestLine("DELETE /stages/{stageId}")
    void deleteStage(@Param("stageId") @NotNull String stageId);

    /**
     * <p>
     * The method deletes the specified strategy in API Gateway.
     *
     * @param ids                  This parameter specifies the ID of a strategy that is to be deleted in API Gateway. (optional)
     */
    @RequestLine("DELETE /strategies?ids={ids}")
    void deleteStrategy(@Param("ids") @Nullable String ids);

    /**
     * <p>
     * This endpoint is used to deleted subscriptions created in API Gateway. If approval is enabled for deletion of subscription then the a request will be created to approve. Till the request get approved the application will be suspended. If the delete request is approved then the application will be deleted and if the delete request is rejected then the application will be resumed from suspend state. 
     *
     * @param applicationId        Application id to delete the application (required)
     */
    @RequestLine("DELETE /subscriptions/{applicationId}")
    void deleteSubscriptionBySubscriptionID(@Param("applicationId") @NotNull String applicationId);

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
     * This HTTP request deletes the specified application in API Gateway.
     *
     * @param userId               This parameter specifies the ID of an application that is to be deleted in API Gateway. (required)
     */
    @RequestLine("DELETE /users/{userId}")
    void deleteUser(@Param("userId") @NotNull String userId);

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
     * Once API is disabled from mocking capability, at runtime all the API invocations are redirected to the native service instead of sending the mocked response
     *
     * @param apiId                API Id for the API to be deactivated (required)
     */
    @RequestLine("PUT /apis/{apiId}/mock/disable")
    ModelAPIResponse disableMockAPI(@Param("apiId") @NotNull String apiId);

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
     * The PUT disables the referenced port configuration. A disabled port can not be contacted.
     *
     * @param body                 The request body references the existing port configuration to be disabled. (required)
     */
    @RequestLine("PUT /ports/disable")
    @Headers({
        "Content-Type: application/json"
    })
    MessageWithPortReference disablePort(@NotNull PortReference body);

    /**
     * <p>
     * This REST request is used to disable the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy is disabled successfully then the policy details of specified policy will be sent as response.
     *
     * @param policyId             This path parameter is used to specify the policy id of the threat protection policy which needs to be disabled (required)
     */
    @RequestLine("PUT /policies/{policyId}/disable")
    Policy disableThreatProtectionRuleByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * Disable tracing for an API
     *
     * @param apiId                API Id for the API for which tracing is disabled (required)
     */
    @RequestLine("PUT /apis/{apiId}/tracing/disable")
    GatewayAPI disableTracing(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This REST operation is used to rollback the assets to the previous state i.e the state prior to promotion. Rollback should be initiated from the local gateway instance.
     *
     * @param rollbackId           Rollback Id for the promotion to be rollbacked (required)
     */
    @RequestLine("PUT /rollback/{rollbackId}")
    Rollback doRollback(@Param("rollbackId") @NotNull String rollbackId);

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
     * Downloads the provider specification of REST, SOAP and GraphQL based APIs. Provider specification is nothing but, the specification file (in swagger, graphql or wsdl format) with out the concrete API Gateway endpoint and contains all resources/methods/operation irrespective of whether they are exposed to consumer
     *
     * @param apiId                API Id for the API to retrieve the versions (required)
     * @param format               Output format of the API specification. For REST APIs the value is 'swagger'; for SOAP APIs use the value as 'wsdl';for GraphQL APIs use the value as 'graphql' (required)
     */
    @RequestLine("GET /apis/{apiId}/providerspecification?format={format}")
    APIResponseGetAPI downloadProviderSpecification(@Param("apiId") @NotNull String apiId, @Param("format") @NotNull String format);

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
     * In API Gateway, you can mock an API implementation. API Gateway lets you mock an API by simulating the native service. API Mocking is useful feature in API first approach, where in the provider may choose to expose the mocked API to the consumers when the actual API doesn't exist or isn't complete.
     *  In API Gateway, when you enable mocking for an API, a default mock response is created for each combination of resource, operation, status code and content-type based on the example and schema set in the API definition. As an API Provider, you can add or modify the default mock responses.
     * You can specify conditions at the operation level and configure IS services at the API level for a mocked API in the update API operation. At runtime, when the mocked API is invoked instead of calling the native service, API Gateway returns the mocked response to the consumer based on the below priorities: 1. If any of the conditions for the invoked operation satisfies, API Gateway returns the associated mocked response. 2. If no condition is specified or none of the condition for the invoked operation is satisfied, then API Gateway will return
     * a. the response from an IS service, if an IS service is configured b. default mocked response, if no IS services are configured
     *
     * @param apiId                API Id for the API to be activated (required)
     * @param retainDefaultMockResponses Flag to retain generated mocked responses. When this is set to true, default mocked responses will be retained. If it's set to false, new default mocked responses will be generated using the examples, schema in the API (optional, defaults to false)
     */
    @RequestLine("PUT /apis/{apiId}/mock/enable?retainDefaultMockResponses={retainDefaultMockResponses}")
    ModelAPIResponse enableMockAPI(@Param("apiId") @NotNull String apiId, @Param("retainDefaultMockResponses") @Nullable Boolean retainDefaultMockResponses);

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
     * The PUT enables the referenced port configuration. Only enabled ports can be contacted and serve requests.
     *
     * @param body                 The request body references the existing port configuration to be enabled. (optional)
     */
    @RequestLine("PUT /ports/enable")
    @Headers({
        "Content-Type: application/json"
    })
    PortReference enablePort(@Nullable PortReference body);

    /**
     * <p>
     * This REST request is used to enable the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy is enabled successfully then the policy details of specified policy is sent as response
     *
     * @param policyId             This path parameter is used to specify the policy id of the threat protection policy which needs to be enabled (required)
     */
    @RequestLine("PUT /policies/{policyId}/enable")
    Policy enableThreatProtectionRuleByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * Perform core health check
     * <p>
     * Perform health check for core parts of API Gateway, such as Elasticsearch store, cluster environment and Integration Server health.
     *
     */
    @RequestLine("GET /engine")
    HealthCheckEngineResult engineGet();

    /**
     * <p>
     * Generate an access token for the given ID Token
     *
     * @param body                 This parameter describes the request payload of an application that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /security/exchangeIDToken")
    @Headers({
        "Content-Type: application/json"
    })
    ServiceOutput exchangeIDToken(@NotNull ServiceInput body);

    /**
     * <p>
     * The GET method exports an archive. The result of the GET request is an archive in a ZIP format.
     *  This Method supports exporting API, Application, Alias,Policy, Policy Action, Keystore, Truststore, Kerberos, User, Group, Team, JMS Connection, JNDI Provider, JMS Trigger, Webservice Endpoint Alias, Approval Configuration, Outbound Proxy, URL alias, Plan and Package.
     *  This GET method can be used for exporting specific type of assets and its optional/soft dependant assets by specifying the asset name and corresponding include options in query parameter.
     *  For example, for an API, the Application assets (used by the API) are soft dependant of that API. To export the dependant applications of an API use the query param 'include-applications'.If 'include-applications' is not provided, the export archive will contains only the APIs.
     *  Refer 'Parameters' section for the usage of each include parameters.
     * 
     * Use the POST /archive method to export all the assets in API Gateway.
     *
     * @param includeApplications  This parameter indicates whether you want to export the applications associated with the APIs (optional)
     * @param includeUsers         This parameter indicates whether you want to export users associated with the groups and/or with the password expiry settings (optional)
     * @param includeGroups        This parameter indicates whether you want to export groups associated with the teams (optional)
     * @param includeTruststores   This parameter indicates whether you want to export truststore alias associated with the email configuration (optional)
     * @param policies             This parameter identifies the policies to be exported. The wildcard "*" selects all the policies.  For example a single policy can be exported with its id using the following request: GET /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a  Whereas, all the policies can be exported using the following request: GET /rest/apigateway/archive?policies=* (optional)
     * @param apis                 This parameter identifies the APIs to be exported. The wildcard "*" selects all the APIs.  For example a single API can be exported using the following request: GET /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?apis=* (optional)
     * @param aliases              This parameter identifies the aliases to be exported.  The wildcard "*" selects all aliases. For example, a single alias can be exported using the following requrest: GET /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?alias=* (optional)
     * @param applications         This parameter identifies the applications to be exported.  The wildcard "*" selects all applications. For example, a single application can be exported using the following requrest: GET /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the applications can be exported using the following request: GET /rest/apigateway/archive?applications=* (optional)
     * @param policyActions        This parameter identifies the policy actions to be exported.  The wildcard "*" selects all policy actions. For example, a single policy action can be exported using the following request:  GET /rest/apigateway/archive?policyActions=20ca1e24-d6b2-430d-adf8-7a53a6cbaa53  Whereas, all the policy actions can be exported using the following request: GET /rest/apigateway/archive?policyActions=* (optional)
     * @param approvalConfigurations This parameter identifies the approval configurations to be exported.  The wildcard "*" selects all approval configurations. For example, a single approval configuration can be exported using the following request: GET /rest/apigateway/archive?approvalConfigurations=createApplication  Whereas, all the approval configurations can be exported using the following request:  GET /rest/apigateway/archive?approvalConfigurations=* (optional)
     * @param outboundProxies      This parameter identifies the outbound proxy aliases to be exported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.  For example a single outbound proxy alias can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias  Whereas, all the outbound proxy aliases can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=* (optional)
     * @param urlAliases           This parameter identifies the URL aliases to be exported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.  For example, a single URL alias can be exported using the following request: GET /rest/apigateway/archive?urlAliases=testUrlAlias  Whereas, all the URL aliases can be exported using the following request: GET /rest/apigateway/archive?testUrlAlias=* (optional)
     * @param keyStores            This parameter identifies the keystore aliases to be exported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.  For example, a single keystore alias can be exported using the following request: GET /rest/apigateway/archive?keyStores=test_keystore  Whereas, all the keystore aliases can be exported using the following request: GET /rest/apigateway/archive?keyStores=* (optional)
     * @param trustStores          This parameter identifies the truststore aliases to be exported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.  For example, a single truststore alias can be exported using the following request: GET /rest/apigateway/archive?trustStores=test_truststore  Whereas, all the truststore aliases can be exported using the following request: GET /rest/apigateway/archive?trustStores=* (optional)
     * @param jnDIProviderAliases  This parameter identifies the JNDI provider aliases to be exported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias  Whereas, all the JNDI provider aliases can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=* (optional)
     * @param jmSConnectionAliases This parameter identifies the JMS connection aliases to be exported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias  Whereas, all the JMS connection aliases can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=* (optional)
     * @param jmSTriggers          This parameter identifies the JMS triggers to be exported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.  For example, a single JMS trigger can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=test_jmsTrigger  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=* (optional)
     * @param webserviceEndpointAliases This parameter identifies the 'web service endpoint' aliases to be exported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.  For example, a single web service endpoint alias can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=* (optional)
     * @param users                This parameter identifies the users to be exported.  The wildcard "*" selects all the users.  For example, a single user can be exported using the following request: GET /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54  Whereas, all the users can be exported using the following request: GET /rest/apigateway/archive?users=* (optional)
     * @param groups               This parameter identifies the groups to be exported.  The wildcard "*" selects all the groups.  For example, a single group can be exported using the following request: GET /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the groups can be exported using the following request: GET /rest/apigateway/archive?groups=* (optional)
     * @param accessProfiles       This parameter identifies the teams to be exported.  The wildcard "*" selects all the teams.  For example, a single team can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the teams can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=* (optional)
     * @param kerberosSetting      This parameter identifies the kerberos configuration to be exported. The kerberos configuration can be exported using the following request: GET /rest/apigateway/archive?kerberosSetting=kerberosSetting (optional)
     * @param plans                This parameter identifies the plans to be exported.  The wildcard "*" selects all the plans.  For example, a single plan can be exported using the following request: GET /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a  Whereas, all the plans can be exported using the following request: GET /rest/apigateway/archive?plans=* (optional)
     * @param packages             This parameter identifies the packages to be exported.  The wildcard "*" selects all the packages.  For example, a single package can be exported using the following request: GET /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the packages can be exported using the following request: GET /rest/apigateway/archive?packages=* (optional)
     * @param portalGateways       This parameter identifies the portal configurations to be exported.  The wildcard "*" selects all portal configurations. For example, a single portal configuration can be exported using the following requrest: GET /rest/apigateway/archive?portalGateways=ae196583-d109-4e9e-b593-dd7b984fe8ca  Whereas, all the portal configurations can be exported using the following request: GET /rest/apigateway/archive?portalGateways=* (optional)
     * @param configurations       This parameter identifies the configurations to be exported.  The wildcard "*" selects all the configurations.  For example, a single configuration can be exported using the following request: GET /rest/apigateway/archive?configurations=loadBalancer,customContentTypes  Whereas, all the configurations can be exported using the following request: GET /rest/apigateway/archive?configurations=* (optional)
     * @param gatewayScopes        This parameter identifies the oauth scopes to be exported.  The wildcard "*" selects all the oauth scopes.  For example, a single oauth scope can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the oauth scopes can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=* (optional)
     */
    @RequestLine("GET /archive?include-applications={includeApplications}&include-users={includeUsers}&include-groups={includeGroups}&include-truststores={includeTruststores}&policies={policies}&apis={apis}&aliases={aliases}&applications={applications}&policyActions={policyActions}&approvalConfigurations={approvalConfigurations}&outboundProxies={outboundProxies}&urlAliases={urlAliases}&keyStores={keyStores}&trustStores={trustStores}&JNDIProviderAliases={jnDIProviderAliases}&JMSConnectionAliases={jmSConnectionAliases}&JMSTriggers={jmSTriggers}&webserviceEndpointAliases={webserviceEndpointAliases}&users={users}&groups={groups}&accessProfiles={accessProfiles}&kerberosSetting={kerberosSetting}&plans={plans}&packages={packages}&portalGateways={portalGateways}&configurations={configurations}&gatewayScopes={gatewayScopes}")
    void exportApiGatewayAssets(@Param("include-applications") @Nullable String includeApplications, @Param("include-users") @Nullable String includeUsers, @Param("include-groups") @Nullable String includeGroups, @Param("include-truststores") @Nullable String includeTruststores, @Param("policies") @Nullable List<String> policies, @Param("apis") @Nullable List<String> apis, @Param("aliases") @Nullable List<String> aliases, @Param("applications") @Nullable List<String> applications, @Param("policyActions") @Nullable List<String> policyActions, @Param("approvalConfigurations") @Nullable List<String> approvalConfigurations, @Param("outboundProxies") @Nullable List<String> outboundProxies, @Param("urlAliases") @Nullable List<String> urlAliases, @Param("keyStores") @Nullable List<String> keyStores, @Param("trustStores") @Nullable List<String> trustStores, @Param("JNDIProviderAliases") @Nullable List<String> jnDIProviderAliases, @Param("JMSConnectionAliases") @Nullable List<String> jmSConnectionAliases, @Param("JMSTriggers") @Nullable List<String> jmSTriggers, @Param("webserviceEndpointAliases") @Nullable List<String> webserviceEndpointAliases, @Param("users") @Nullable List<String> users, @Param("groups") @Nullable List<String> groups, @Param("accessProfiles") @Nullable List<String> accessProfiles, @Param("kerberosSetting") @Nullable String kerberosSetting, @Param("plans") @Nullable List<String> plans, @Param("packages") @Nullable List<String> packages, @Param("portalGateways") @Nullable List<String> portalGateways, @Param("configurations") @Nullable List<String> configurations, @Param("gatewayScopes") @Nullable List<String> gatewayScopes);

    /**
     * Perform health check on all external destinations and resources
     * <p>
     * Perform health check for configured external resources.
     *
     */
    @RequestLine("GET /externalServices")
    HealthCheckExternalResult externalServicesGet();

    /**
     * <p>
     * The method retrieves list of all JNDI templates in API Gateway.
     *
     */
    @RequestLine("GET /is/jndi/template")
    void fetchJNDITemplates();

    /**
     * <p>
     * This operation can be used to create / update / delete a custom gateway endpoing of an API
     *
     * @param apiId                API Id for the API to be updated (required)
     * @param body                 API Gateway endpoints request payload (required)
     */
    @RequestLine("PUT /apis/{apiId}/gatewayEndpoints")
    @Headers({
        "Content-Type: application/json"
    })
    ModelAPIResponse gatewayEndpoints(@Param("apiId") @NotNull String apiId, @NotNull InputGatewayEndpoints body);

    /**
     * <p>
     * Retrieve an API based on the API id.
     *
     * @param apiId                API Id for the API to be retrieved (required)
     * @param format               Output format of the API. If the value is 'swagger', you get a API definition in swagger format. If the value is 'raml', you get a raml document. If the value is 'openapi', you get a open API document. If the value is 'odata', you get a zip file holding the OData metadata and service document. (optional)
     * @param url                  User selected endpoint for API definition in swagger/raml format. (optional)
     */
    @RequestLine("GET /apis/{apiId}?format={format}&url={url}")
    APIResponseGetAPI getAPI(@Param("apiId") @NotNull String apiId, @Param("format") @Nullable String format, @Param("url") @Nullable String url);

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
     * Get all APIs or subset of APIs
     *
     * @param apiIds               API Ids for the API to be retrieved (optional)
     * @param from                 Starting index from the list of APIs to be retrieved (optional)
     * @param size                 Number of APIs to be retrieved (optional)
     */
    @RequestLine("GET /apis?apiIds={apiIds}&from={from}&size={size}")
    APIResponsesModel getAPIs(@Param("apiIds") @Nullable String apiIds, @Param("from") @Nullable Integer from, @Param("size") @Nullable Integer size);

    /**
     * <p>
     * To get list of all APIs associated for a given package id
     *
     * @param packageId            Id of the Package (required)
     */
    @RequestLine("GET /packages/{packageId}/apis")
    PackageAPIsResponseContainer getAPIsForPackageById(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * The method retrieves the details of a team in API Gateway.
     *
     * @param accessProfileId      The path parameter specifies the id of a team whose details are to be retrieved. (required)
     */
    @RequestLine("GET /accessProfiles/{accessProfileId}")
    AccessProfile getAccessProfile(@Param("accessProfileId") @NotNull String accessProfileId);

    /**
     * <p>
     * The method retrieves list of all teams in API Gateway.
     *
     */
    @RequestLine("GET /accessProfiles")
    AccessProfile getAccessProfiles();

    /**
     * <p>
     * The method retrieves a map of access token endpoints for all the authorization servers configured
     *
     * @param applicationId        This parameter specifies the ID of an application whose access token endpoints are to be retrieved from API Gateway. (required)
     */
    @RequestLine("GET /applications/{applicationId}/accessTokens")
    void getAccessTokenEndpoints(@Param("applicationId") @NotNull String applicationId);

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
     * This request will return all the assertions from API Gateway
     *
     */
    @RequestLine("GET /assertions")
    AssertionConfiguration getAllAssertions();

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
     * To get all package details from API Gateway
     *
     */
    @RequestLine("GET /packages")
    PackageGetAllResponseContainer getAllPackages();

    /**
     * <p>
     * This REST request is used to retrieve list of all plans from API Gateway along with its rate limit and quota as policies. Also it will list down the associated packageIds for each plan in the response. You can use /policies/{policyId} to retrieve the rate limit and quota policy details and /packages/{packageId} to retrieve the package details
     *
     */
    @RequestLine("GET /plans")
    PlanGetAllResponse getAllPlans();

    /**
     * <p>
     * This request will return all the policy actions from API Gateway
     *
     * @param policyActionIds      This is a query parameter. Provide comma separated Policy Action ids to get the policy action details for specified policy action ids (optional)
     */
    @RequestLine("GET /policyActions?policyActionIds={policyActionIds}")
    List<PolicyAction> getAllPolicyActions(@Param("policyActionIds") @Nullable String policyActionIds);

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
     * This endpoint is used to list the aggregated details of each active subscription for current cycle. This can be used with filters mentioned as query parameter to fine grain the result. For example, if you want to fetch the list of usage of active subscription for package GoldPackage, then you can specify package=GoldPackage in query parameter. The result will contain usage details of subscription belongs to GoldPackage alone. You can either fetch all the records at once or use the from and size query parameter to fetch subset of details. 
     *
     * @param name                 Subscription name to search for usage (optional)
     * @param _package             Package name to search for usage (optional)
     * @param plan                 Plan name to search for usage (optional)
     * @param from                 Starting index number of the usage result to fetch (optional)
     * @param size                 Number of results to be fetched for the usage result (optional)
     * @param count                true to get the count for the search or all the usages available (optional, defaults to false)
     */
    @RequestLine("GET /subscriptions/usage?name={name}&package={_package}&plan={plan}&from={from}&size={size}&count={count}")
    List<Usage> getAllSubscriptionUsage(@Param("name") @Nullable String name, @Param("package") @Nullable String _package, @Param("plan") @Nullable String plan, @Param("from") @Nullable Integer from, @Param("size") @Nullable Integer size, @Param("count") @Nullable String count);

    /**
     * <p>
     * The method retrieves all subscriptions or set of subscriptions for the specified package id and plan id specified. The response will contain the list of application details. The API key inside all the application will be masked even though the API invoker have permission to view the key.
     *
     * @param packageId            Specify the package id for which the subscription details is requested (optional)
     * @param planId               Specify the plan id for which the subscription details is requested (optional)
     */
    @RequestLine("GET /subscriptions?packageId={packageId}&planId={planId}")
    List<Application> getAllSubscriptions(@Param("packageId") @Nullable String packageId, @Param("planId") @Nullable String planId);

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
     * Retrieves the list of registered applications of an API
     *
     * @param apiId                API Id for the API to find the associated applications (required)
     */
    @RequestLine("GET /apis/{apiId}/applications")
    List<Application> getApiApplications(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This REST request is used to get the list of applicable APIs for a global policy.
     * An API become
     * applicable API for a global policy only if it satisfies the scope specified in the global policy.
     * By default it will return the basic API details of all the applicable APIs either if the API is active or inactive for a global policy. User can use the query parameter "active" to retrieve all active APIs for a global policy or all applicable APIs regardless of its status for a global policy.
     *
     * @param policyId             This path parameter is used to specify the global policy id for which we need the list of applicable APIs (required)
     * @param active               This is a query parameter. It is used to retrieve the list of applicable APIs for a global policy. If the value for this parameter is 'false' then it will return all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return only the list of applicable active APIs alone for the specified global policy (optional)
     */
    @RequestLine("GET /policies/{policyId}/apis?active={active}")
    List<APIResponseGetAPIs> getApplicableAPIsForGlobalPolicyByID(@Param("policyId") @NotNull String policyId, @Param("active") @Nullable String active);

    /**
     * <p>
     * The method retrieves the details of a specified application in API Gateway
     *
     * @param applicationId        This parameter specifies the ID of an application whose details are to be retrieved in API Gateway. (required)
     */
    @RequestLine("GET /applications/{applicationId}")
    Application getApplication(@Param("applicationId") @NotNull String applicationId);

    /**
     * <p>
     * The method retrieves a list of available applications in API Gateway.
     *
     */
    @RequestLine("GET /applications")
    Application getApplications();

    /**
     * <p>
     * Retrieve an Approval Request based on the approvalId.
     *
     * @param approvalId           approvalId for the Approval Request to be retrieved (required)
     */
    @RequestLine("GET /approvals/{approvalId}")
    ApprovalRequest getApproval(@Param("approvalId") @NotNull String approvalId);

    /**
     * <p>
     * The method retrieves the details of a specified approval configuration in API Gateway
     *
     * @param id                   This parameter specifies the ID of an approval configuration whose details are to be retrieved in API Gateway. (required)
     */
    @RequestLine("GET /approvalConfigurations/{id}")
    ApprovalConfiguration getApprovalConfiguration(@Param("id") @NotNull String id);

    /**
     * <p>
     * The method retrieves a list of available approval configurations in API Gateway.
     *
     */
    @RequestLine("GET /approvalConfigurations")
    ApprovalConfiguration getApprovalConfigurations();

    /**
     * <p>
     * Retrieve all the approval requests waiting for the user. If the user is part of one or more approval team, then he/she will get the approval requests assigned for those teams.
     *
     */
    @RequestLine("GET /approvals")
    List<ApprovalResponsePayload> getApprovals();

    /**
     * <p>
     * This request will return assertion element
     *
     * @param assertionId          This path parameter is used to specify the assertion id which assertion details needs to retrieved. (required)
     */
    @RequestLine("GET /assertions/{assertionId}")
    AssertionConfiguration getAssertion(@Param("assertionId") @NotNull String assertionId);

    /**
     * <p>
     * Retrieves the list of active global policies applicable to this API
     *
     * @param apiId                API Id for the API to find the list of applicable global policies (required)
     */
    @RequestLine("GET /apis/{apiId}/globalPolicies")
    APIResponseGetGlobalPolicies getAssociatedGlobalPolicies(@Param("apiId") @NotNull String apiId);

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
     * This REST Request is used to get the Service Result cache size for the API using apiID. An alternative REST API call for /serviceResultCache. Instead of specifying name and version, if you know API id you can directly use that id to get the number of cached responses for that API
     *
     * @param apiId                The id of API for which the cached response size is requested (required)
     */
    @RequestLine("GET /serviceResultCache/{apiId}")
    void getCacheDetailsByapiId(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * You can enable API caching in API Gateway to cache your native service's response. With caching, you can reduce the number of calls made to your endpoint and also improve the latency of the requests to your API. When you enable caching for a stage, API Gateway caches responses from your endpoint for a specified time to live period. API Gateway then responds to the request by looking up the endpoint response from the cache instead of making a request to your endpoint.
     *  Service Result cache can be configured for a API or Resource/method or Operation.
     *  This REST Request is used to get the Service Result cache size for an API using apiName and apiVersion.
     *
     * @param apiName              This query parameter is used to specify the API name for which the service result cache element size needs to be fetched. (required)
     * @param apiVersion           The version of the apiName parameter specified (required)
     */
    @RequestLine("GET /serviceResultCache?apiName={apiName}&apiVersion={apiVersion}")
    void getCacheDetailsByapiNameAndVersion(@Param("apiName") @NotNull String apiName, @Param("apiVersion") @NotNull String apiVersion);

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
     * This method returns the cross dc configuration associated with the datacenter.
     *
     */
    @RequestLine("GET /dataspace")
    RemotePortConfig getDataspaceConfiguration();

    /**
     * <p>
     * This GET method is used to retrieve the list of IPs are denied ( IPs that violated the threat protection rules configured).
     *
     */
    @RequestLine("GET /denialofservice/deniedIP")
    List<String> getDeniedIPs();

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
     * Retrieves the requested document from API Gateway
     *
     * @param documentId           The unique identifier of the document for retrieving from API Gateway. (required)
     */
    @RequestLine("GET /documents/{documentId}")
    Document getDocument(@Param("documentId") @NotNull String documentId);

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
     * The method retrieves the details of a group in API Gateway.
     *
     * @param groupId              The path parameter specifies the id of a group whose details are to be retrieved. (required)
     */
    @RequestLine("GET /groups/{groupId}")
    Group getGroup(@Param("groupId") @NotNull String groupId);

    /**
     * <p>
     * The method retrieves list of all groups in API Gateway.
     *
     */
    @RequestLine("GET /groups")
    Group getGroups();

    /**
     * <p>
     * The GET method retrieves the ipAccessMode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     * @param body                 The request contains the IP access mode information. (required)
     */
    @RequestLine("GET /ports/{listenerKey}/ipAccessMode")
    @Headers({
        "Content-Type: application/json"
    })
    IPAccessMode getIPAccessMode(@Param("listenerKey") @NotNull String listenerKey, @NotNull IPAccessMode body);

    /**
     * <p>
     * The method retrieves list of installed language packs in API Gateway.
     *
     */
    @RequestLine("GET /installedLanguages")
    List<String> getInstalledLanguages();

    /**
     * <p>
     * Retrieve the integration server publish information for the API. Only REST and SOAP APIs are supported.
     *
     * @param apiId                API Id of the API for which IntegrationServerPublishInfo is to be fetched (required)
     */
    @RequestLine("GET /integrationServer/publish?apiId={apiId}")
    ServiceRegistryPublishGetResponse getIntegrationServerPublishInfo(@Param("apiId") @NotNull String apiId);

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
     * This operation fetches JWT from APIGateway.To obtain the JWT from APIGateway the client has to has to pass the basic authentication credentials.
     *
     * @param appId                This parameter is used to specify an application id for which APIGateway generates a JWT (optional)
     */
    @RequestLine("GET /jwt/getJsonWebToken?app_id={appId}")
    JWT getJsonWebToken(@Param("app_id") @Nullable String appId);

    /**
     * <p>
     * Generate JWT token with custom claims supplied in the request
     *
     * @param body                 This parameter describes the request payload of an application that is to be created in API Gateway. (required)
     */
    @RequestLine("POST /security/getJsonWebToken")
    @Headers({
        "Content-Type: application/json"
    })
    JWTServiceOutput getJsonWebTokenNew(@NotNull JWTServiceInput body);

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
     * This method returns the grpc listener configuration associated with the datacenter.
     *
     */
    @RequestLine("GET /dataspace/listener")
    ListenerConfig getListenerConfiguration();

    /**
     * <p>
     * The method retrieves the details of the Load Balancer configuration in API Gateway.
     *
     */
    @RequestLine("GET /configurations/loadBalancer")
    LoadBalancer getLoadBalancers();

    /**
     * <p>
     * Retrieves the locked accounts in API Gateway
     *
     */
    @RequestLine("GET /is/lockedAccounts")
    LockedAccounts getLockedAccounts();

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
     * You can use API Gateway to disable access for certain mobile application versions on a predefined set of mobile platforms. By registering the required devices and applications and disabling access to these versions, you ensure that all users use the latest versions of the applications and take advantage of the latest security and functional updates.
     *
     */
    @RequestLine("GET /configurations/mobileApp")
    MobileApplicationConfiguration getMobileApplicationConfigurations();

    /**
     * <p>
     * This method retrieves the requested OAuth scope mapping. OAuth scope mappings map the authorization server scope with APIs or API scopes
     *
     * @param oauthScopeId         The path parameter specifies the id of an OAuth scope mapping that is to be retrieved from API Gateway. (required)
     */
    @RequestLine("GET /scopes/{oauthScopeId}")
    GatewayScope getOAuthScope(@Param("oauthScopeId") @NotNull String oauthScopeId);

    /**
     * <p>
     * This method retrieves a list of available OAuth scope mappings in API Gateway. OAuth scope mappings map the authorization server scope with APIs or API scopes
     *
     */
    @RequestLine("GET /scopes")
    GatewayScope getOAuthScopes();

    /**
     * <p>
     * Retrieves the list of all available outbound proxy server aliases in API Gateway.
     *
     */
    @RequestLine("GET /is/outboundproxy")
    OutboundProxyGetResponse getOutboundProxies();

    /**
     * <p>
     * To get details for a given package id
     *
     * @param packageId            Id of the Package (required)
     */
    @RequestLine("GET /packages/{packageId}")
    PackageGetResponseContainer getPackageById(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * Retrieves the list of packages of an API
     *
     * @param apiId                API Id for the API to find the associated packages (required)
     */
    @RequestLine("GET /apis/{apiId}/packages")
    List<ModelPackage> getPackagesForAPI(@Param("apiId") @NotNull String apiId);

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
     * This request is used to retrieve the details of particular plan along with rate limit and quota policy ids along with associated package meta data.
     *
     * @param planId               Id of a Plan (required)
     */
    @RequestLine("GET /plans/{planId}")
    PlanGetResponse getPlanById(@Param("planId") @NotNull String planId);

    /**
     * <p>
     * To get list of all plans associated to the given package id
     *
     * @param packageId            Id of the Package (required)
     */
    @RequestLine("GET /packages/{packageId}/plans")
    PackagePlansResponseContainer getPlansForPackageById(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * This REST request is used to retrieve list of all policies from API Gateway. This can also be used to retrieve details for particular set of policies by specifying the policy ids in the query string.
     *
     * @param policyIds            This query parameter is used to retrieve policy details of particular set of policies. The policy IDs need to be separated using ',' to specify more than one policy id (optional)
     * @param stage                This query parameter is used to retrieve the Threat Protection policies created in API Gateway. The value of this query parameter should be threat protection, if other values specified it wont respect that value and return all the policies in the API Gateway (optional)
     * @param policyType           This query parameter is used to retrieve policy details for a list of policies of a particular policy type. The policy type can be template or global. If the policy type is template then policy details of all the policy templates is returned. If the policy type is global then the policy details of global policies is returned.If any other policy type is specified all policies are returned (optional)
     */
    @RequestLine("GET /policies?policyIds={policyIds}&stage={stage}&policyType={policyType}")
    List<Policy> getPolicies(@Param("policyIds") @Nullable String policyIds, @Param("stage") @Nullable String stage, @Param("policyType") @Nullable String policyType);

    /**
     * <p>
     * This request will return policy action details of the policy action based on the id specified in path
     *
     * @param policyActionId       This path parameter is used to specify the policy action id which policy action details needs to retrieved. (required)
     */
    @RequestLine("GET /policyActions/{policyActionId}")
    PolicyActionWrapper getPolicyAction(@Param("policyActionId") @NotNull String policyActionId);

    /**
     * <p>
     * This REST request is used to retrieve the policy details for a specified policy in API Gateway. If policy id is available then the policy details is sent in response.
     *
     * @param policyId             This path parameter is used to specify the policy id for which the policy details needs to be retrieved (required)
     */
    @RequestLine("GET /policies/{policyId}")
    Policy getPolicyById(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * This REST Request is used to get the list of policy stages available in API gateway. It will also show the list of policies (template key of each policy) associated with each stage. 
     *
     */
    @RequestLine("GET /policyStages")
    List<PolicyEnforcementStage> getPolicyStages();

    /**
     * <p>
     * The GET method retrieves an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     */
    @RequestLine("GET /ports/{listenerKey}")
    Port getPort(@Param("listenerKey") @NotNull String listenerKey);

    /**
     * <p>
     * The GET method retrieves the accessMode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     */
    @RequestLine("GET /ports/{listenerKey}/accessMode")
    Port getPortAccessMode(@Param("listenerKey") @NotNull String listenerKey);

    /**
     * <p>
     * The GET method retrieves port configurations
     *
     * @param pkg                  The pkg parameter points to the IS package the port is pointing to. The pkg of port configurations is restricted to the package WmRoot. (optional)
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within a package. (optional)
     */
    @RequestLine("GET /ports?pkg={pkg}&listenerKey={listenerKey}")
    Listeners getPorts(@Param("pkg") @Nullable String pkg, @Param("listenerKey") @Nullable String listenerKey);

    /**
     * <p>
     * The GET method retrieves the definition of the primary port.
     *
     */
    @RequestLine("GET /ports/primary")
    MessageWithPortReference getPrimaryPort();

    /**
     * <p>
     * Retrieve a promotion based on the promotion id.
     *
     * @param promotionId          Promotion Id for the promotion to be retrieved (required)
     */
    @RequestLine("GET /promotion/{promotionId}")
    Promotion getPromotion(@Param("promotionId") @NotNull String promotionId);

    /**
     * <p>
     * This REST operation is used to retrieve the promotions history with each promotion entry provides the promotion name, promoted by whom, when it's promoted and the promoted assets status
     *
     */
    @RequestLine("GET /promotion")
    List<Promotion> getPromotions();

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
     * The method retrieves a list of registered APIs for the specified application in API Gateway.
     *
     * @param applicationId        This parameter specifies the ID of an application whose registered APIs are to be retrieved in API Gateway. (required)
     */
    @RequestLine("GET /applications/{applicationId}/apis")
    void getRegisteredApis(@Param("applicationId") @NotNull String applicationId);

    /**
     * <p>
     * This method returns the remotes (other datacenters) configuration associated with the datacenter.
     *
     */
    @RequestLine("GET /dataspace/ring")
    RemotePortConfig getRingConfiguration();

    /**
     * <p>
     * Retrieve a rollback based on the rollback id.
     *
     * @param rollbackId           Rollback Id for the rollback to be retrieved (required)
     */
    @RequestLine("GET /rollback/{rollbackId}")
    Rollback getRollback(@Param("rollbackId") @NotNull String rollbackId);

    /**
     * <p>
     * This REST operation is used to retrieve the list of possible rollbacks a user can do from the local (target) API Gateway instance. Each rollback entry was created when a promotion of assets to the local (target) API Gateway instance from another stage
     *
     */
    @RequestLine("GET /rollback")
    List<Rollback> getRollbacks();

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
     * Retrieve scopes of an API based on the scope name
     *
     * @param apiId                API Id for the API to retrieve the versions (required)
     * @param scopeName            Name of the scope (required)
     */
    @RequestLine("GET /apis/{apiId}/scopes/{scopeName}")
    List<ScopeResourceIndex> getScopeByScopeName(@Param("apiId") @NotNull String apiId, @Param("scopeName") @NotNull String scopeName);

    /**
     * <p>
     * An API Scope is a collection of resources or operations in an API. Users can create multiple scopes for a single API. Policies can be attached to an API level or scope level. This method retrieves the scopes of an API.
     * You can create, modify or delete the scopes in the update API operation using PUT /api/{apiId}
     *
     * @param apiId                API Id for the API to retrieve the versions (required)
     */
    @RequestLine("GET /apis/{apiId}/scopes")
    List<ScopeResourceIndex> getScopes(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * Retrieve the service registry publish information for the API
     *
     * @param apiId                API Id of the API for which ServiceRegistryPublishInfo is to be fetched (required)
     */
    @RequestLine("GET /serviceRegistry/publish?apiId={apiId}")
    ServiceRegistryPublishGetResponse getServiceRegistryPublishInfo(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This method retrieves the list of extended settings and watt properties from API Gateway.
     *
     */
    @RequestLine("GET /configurations/settings")
    ExtendedSettingsOutput getSettings();

    /**
     * <p>
     * Download the API definition that was used to create the API. This is applicable only for SOAP APIs.
     *
     * @param apiId                API Id for the API to download the source content (required)
     */
    @RequestLine("GET /apis/{apiId}/source")
    List<Multipart> getSource(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * This REST operation is used to retrieve a particular stage object based on a stage id
     *
     * @param stageId              Stage Id for the stage to be retrieved (required)
     */
    @RequestLine("GET /stages/{stageId}")
    Stage getStage(@Param("stageId") @NotNull String stageId);

    /**
     * <p>
     * This REST operation is used to retrieve all the configured stages
     *
     */
    @RequestLine("GET /stages")
    List<Stage> getStages();

    /**
     * <p>
     * The method retrieves a list of all strategies in API Gateway.
     *
     */
    @RequestLine("GET /strategies")
    OneOfStrategyModel getStrategies();

    /**
     * <p>
     * The method retrieves the details of a specified strategy in API Gateway
     *
     * @param strategyId           This parameter specifies the ID of a strategy whose details are to be retrieved in API Gateway. (required)
     */
    @RequestLine("GET /strategies/{strategyId}")
    OneOfStrategyModel getStrategy(@Param("strategyId") @NotNull String strategyId);

    /**
     * <p>
     * This endpoint is used to fetch the application details of the subscription.
     *
     * @param applicationId        Application id to view the details of the application (required)
     */
    @RequestLine("GET /subscriptions/{applicationId}")
    Application getSubscriptionBySubscriptionID(@Param("applicationId") @NotNull String applicationId);

    /**
     * <p>
     * Retrieve trace information for an API invocation event specified by its correlationID.
     *
     * @param correlationID        Correlation ID of the request. Correlation ID can be retrieved from the transaction event of the request. (required)
     */
    @RequestLine("GET /tracer/{correlationID}")
    Map<String, List<TraceLog>> getTracer(@Param("correlationID") @NotNull String correlationID);

    /**
     * <p>
     * This method can be used to retrieve the transaction events for a given API/Application/Plan/Package for a specific period of time. Multiple request parameters of this method provide options to specify the request criteria to match the expected result and most of these input parameters supports regular expression in their values. Along with the mandatory parameters - fromDate and toDate, any one of the other filter criteria should be passed in the request.
     *
     * @param fromDate             This is the date from which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter (required)
     * @param toDate               This is the date to which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter (required)
     * @param apiName              The name of the API  for which the invocation details is required.The exact name must be provided or regular expressions can be used like API_.* (optional)
     * @param apiVersion           The version of the API (optional)
     * @param apiId                The system generated id for an API.The id of an can be retrieved from the API details screen (optional)
     * @param applicationName      The name of the Application for which the invocation details is required.The exact name must be provided or regular expressions can be used like APP_.* (optional)
     * @param applicationId        The system generated id for an Application.The id of an can be retrieved from the Application details screen (optional)
     * @param packageName          The name of the Package for which the invocation details is required.The exact name must be provided or regular expressions can be used like Package_.* (optional)
     * @param packageId            The system generated id for a Package.The id of an can be retrieved from the Package details screen (optional)
     * @param planName             The name of the Plan  for which the invocation details is required.The exact name must be provided or regular expressions can be used like Plan_.* (optional)
     * @param planId               The system generated id for a Plan.The id of an can be retrieved from the Plan details screen (optional)
     * @param from                 This parameter specifies the index from which the data has to be retrieved from the store. It is mainly used during pagination where the data is retrieved in batches (optional)
     * @param size                 This parameter specifies the number of records that should be present in the response. This can be combined with the parameter - from to get the records in batches during pagination. (optional)
     */
    @RequestLine("GET /transactionalEvents/_search?apiName={apiName}&apiVersion={apiVersion}&apiId={apiId}&applicationName={applicationName}&applicationId={applicationId}&packageName={packageName}&packageId={packageId}&planName={planName}&planId={planId}&from={from}&size={size}&fromDate={fromDate}&toDate={toDate}")
    TransactionEvent getTransactions(@Param("fromDate") @NotNull LocalDate fromDate, @Param("toDate") @NotNull LocalDate toDate, @Param("apiName") @Nullable String apiName, @Param("apiVersion") @Nullable String apiVersion, @Param("apiId") @Nullable String apiId, @Param("applicationName") @Nullable String applicationName, @Param("applicationId") @Nullable String applicationId, @Param("packageName") @Nullable String packageName, @Param("packageId") @Nullable String packageId, @Param("planName") @Nullable String planName, @Param("planId") @Nullable String planId, @Param("from") @Nullable Integer from, @Param("size") @Nullable Integer size);

    /**
     * <p>
     * This method can be used to retrieve the number of transaction events for a given API/Application/Plan/Package for a specific period of time. Multiple request parameters of this method provide options to specify the request criteria to match the expected result and most of these input parameters supports regular expression in their values. Along with the mandatory parameters - fromDate and toDate, any one of the other filter criteria should be passed in the request.
     *
     * @param fromDate             This is the date from which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter (required)
     * @param toDate               This is the date to which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter (required)
     * @param apiName              The name of the API  for which the invocation count is required.The exact name must be provided or regular expressions can be used like API_.* (optional)
     * @param apiVersion           The version of the API (optional)
     * @param apiId                The system generated id for an API.The id of an can be retrieved from the API details screen (optional)
     * @param applicationName      The name of the Application for which the invocation count is required.The exact name must be provided or regular expressions can be used like APP_.* (optional)
     * @param applicationId        The system generated id for an Application.The id of an can be retrieved from the Application details screen (optional)
     * @param packageName          The name of the Package for which the invocation count is required.The exact name must be provided or regular expressions can be used like Package_.* (optional)
     * @param packageId            The system generated id for a Package.The id of an can be retrieved from the Package details screen (optional)
     * @param planName             The name of the Plan  for which the invocation count is required.The exact name must be provided or regular expressions can be used like Plan_.* (optional)
     * @param planId               The system generated id for a Plan.The id of an can be retrieved from the Plan details screen (optional)
     */
    @RequestLine("GET /transactionalEvents/_count?apiName={apiName}&apiVersion={apiVersion}&apiId={apiId}&applicationName={applicationName}&applicationId={applicationId}&packageName={packageName}&packageId={packageId}&planName={planName}&planId={planId}&fromDate={fromDate}&toDate={toDate}")
    TransactionResponse getTransactionsCount(@Param("fromDate") @NotNull LocalDate fromDate, @Param("toDate") @NotNull LocalDate toDate, @Param("apiName") @Nullable String apiName, @Param("apiVersion") @Nullable String apiVersion, @Param("apiId") @Nullable String apiId, @Param("applicationName") @Nullable String applicationName, @Param("applicationId") @Nullable String applicationId, @Param("packageName") @Nullable String packageName, @Param("packageId") @Nullable String packageId, @Param("planName") @Nullable String planName, @Param("planId") @Nullable String planId);

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
     * This end point is used to fetch the aggregated usage of the application id for current cycle. This will return the usage only if the subscription is active. For the historic or detailed transaction wise usage details use /transactionalEvents/_search API.
     *
     * @param applicationId        Application id to view the usage details of the application (required)
     */
    @RequestLine("GET /subscriptions/{applicationId}/usage")
    Usage getUsageBySubscriptionID(@Param("applicationId") @NotNull String applicationId);

    /**
     * <p>
     * The method retrieves the details of an user in API Gateway.
     *
     * @param userId               The path parameter specifies the id of an user whose details are to be retrieved. (required)
     */
    @RequestLine("GET /users/{userId}")
    User getUser(@Param("userId") @NotNull String userId);

    /**
     * <p>
     * The method retrieves list of all users in API Gateway.
     *
     */
    @RequestLine("GET /users")
    User getUsers();

    /**
     * <p>
     * Retrieve all the versions of the API
     *
     * @param apiId                API Id for the API to retrieve the versions (required)
     */
    @RequestLine("GET /apis/{apiId}/versions")
    APIResponseGetAPIs getVersions(@Param("apiId") @NotNull String apiId);

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
     *
     * @param overwrite            This parameter specifies the import option to define the artifact types that can be overwritten during import. The parameter enables you to specify overwriting of APIs, policies, policy actions, aliases, applications, configurations, approval configurations, outbound proxies, URL aliases, keyStores, trustStores, JNDI provider aliases, JMS connection aliases, JMS triggers, webservice endpoint aliases, users, groups, teams, kerberos settings, plans and packages.    The wildcard "*" enables you to specify all types. For example, the following request enables you to overwrite APIs during import: POST /rest/apigateway/archive?overwrite=apis Whereas, overwriting all asset types during import can be specified as follows: POST /rest/apigateway/archive?overwrite=* (optional)
     * @param fixingMissingVersions  (optional)
     * @param preserveAssetState   This parameter is used to specify whether the asset state needs to be preserved after importing the assets in to API Gateway. By default this value will be true. If false specified the assets will be imported and wont preserve asset state after importing asset. (optional)
     * @param policies             This parameter identifies the policies to be imported. The wildcard "*" selects all the policies.  For example a single policy can be imported with its id using the following request: POST /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a  Whereas, all the policies can be imported using the following request: POST /rest/apigateway/archive?policies=* (optional)
     * @param apis                 This parameter identifies the APIs to be imported. The wildcard "*" selects all the APIs.  For example a single API can be imported using the following request: POST /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e  Whereas, all the APIs can be imported using the following request: POST /rest/apigateway/archive?apis=* (optional)
     * @param aliases              This parameter identifies the aliases to be imported.  The wildcard "*" selects all aliases. For example, a single alias can be imported using the following requrest: POST /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the APIs can be imported using the following request: POST /rest/apigateway/archive?alias=* (optional)
     * @param applications         This parameter identifies the applications to be imported.  The wildcard "*" selects all applications. For example, a single application can be imported using the following requrest: POST /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the applications can be imported using the following request: POST /rest/apigateway/archive?applications=* (optional)
     * @param approvalConfigurations This parameter identifies the approval configurations to be imported.  The wildcard "*" selects all approval configurations. For example, a single approval configuration can be imported using the following request: POST /rest/apigateway/archive?approvalConfigurations=createApplication  Whereas, all the approval configurations can be imported using the following request:  POST /rest/apigateway/archive?approvalConfigurations=* (optional)
     * @param outboundProxies      This parameter identifies the outbound proxy aliases to be imported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.  For example a single outbound proxy alias can be imported using the following request: POST /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias  Whereas, all the outbound proxy aliases can be imported using the following request: POST /rest/apigateway/archive?outboundProxies=* (optional)
     * @param urlAliases           This parameter identifies the URL aliases to be imported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.  For example, a single URL alias can be imported using the following request: POST /rest/apigateway/archive?urlAliases=testUrlAlias  Whereas, all the URL aliases can be imported using the following request: POST /rest/apigateway/archive?testUrlAlias=* (optional)
     * @param keyStores            This parameter identifies the keystore aliases to be imported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.  For example, a single keystore alias can be imported using the following request: POST /rest/apigateway/archive?keyStores=test_keystore  Whereas, all the keystore aliases can be imported using the following request: POST /rest/apigateway/archive?keyStores=* (optional)
     * @param trustStores          This parameter identifies the truststore aliases to be imported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.  For example, a single truststore alias can be imported using the following request: POST /rest/apigateway/archive?trustStores=test_truststore  Whereas, all the truststore aliases can be imported using the following request: POST /rest/apigateway/archive?trustStores=* (optional)
     * @param jnDIProviderAliases  This parameter identifies the JNDI provider aliases to be imported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be imported using the following request: POST /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias  Whereas, all the JNDI provider aliases can be imported using the following request: POST /rest/apigateway/archive?JNDIProviderAliases=* (optional)
     * @param jmSConnectionAliases This parameter identifies the JMS connection aliases to be imported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be imported using the following request: POST /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias  Whereas, all the JMS connection aliases can be imported using the following request: POST /rest/apigateway/archive?JMSConnectionAliases=* (optional)
     * @param jmSTriggers          This parameter identifies the JMS triggers to be imported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.  For example, a single JMS trigger can be imported using the following request: POST /rest/apigateway/archive?JMSTriggers=test_jmsTrigger  Whereas, all the JMS triggers can be imported using the following request: POST /rest/apigateway/archive?JMSTriggers=* (optional)
     * @param webserviceEndpointAliases This parameter identifies the 'web service endpoint' aliases to be imported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.  For example, a single web service endpoint alias can be imported using the following request: POST /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias  Whereas, all the JMS triggers can be imported using the following request: POST /rest/apigateway/archive?webserviceEndpointAliases=* (optional)
     * @param users                This parameter identifies the users to be imported.  The wildcard "*" selects all the users.  For example, a single user can be imported using the following request: POST /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54  Whereas, all the users can be imported using the following request: POST /rest/apigateway/archive?users=* (optional)
     * @param groups               This parameter identifies the groups to be imported.  The wildcard "*" selects all the groups.  For example, a single group can be imported using the following request: POST /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the groups can be imported using the following request: POST /rest/apigateway/archive?groups=* (optional)
     * @param accessProfiles       This parameter identifies the teams to be imported.  The wildcard "*" selects all the teams.  For example, a single team can be imported using the following request: POST /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the teams can be imported using the following request: POST /rest/apigateway/archive?accessProfiles=* (optional)
     * @param kerberosSetting      This parameter identifies the kerberos configuration to be imported. The kerberos configuration can be imported using the following request: POST /rest/apigateway/archive?kerberosSetting=kerberosSetting (optional)
     * @param plans                This parameter identifies the plans to be imported.  The wildcard "*" selects all the plans.  For example, a single plan can be imported using the following request: POST /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a  Whereas, all the plans can be imported using the following request: POST /rest/apigateway/archive?plans=* (optional)
     * @param packages             This parameter identifies the packages to be imported.  The wildcard "*" selects all the packages.  For example, a single package can be imported using the following request: POST /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the packages can be imported using the following request: POST /rest/apigateway/archive?packages=* (optional)
     * @param configurations       This parameter identifies the configurations to be imported.  The wildcard "*" selects all the configurations.  For example, a single configuration can be imported using the following request: POST /rest/apigateway/archive?configurations=loadBalancer,customContentTypes  Whereas, all the configurations can be imported using the following request: POST /rest/apigateway/archive?configurations=* (optional)
     * @param gatewayScopes        This parameter identifies the oauth scopes to be imported.  The wildcard "*" selects all the oauth scopes.  For example, a single oauth scope can be imported using the following request: POST /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the oauth scopes can be imported using the following request: POST /rest/apigateway/archive?gatewayScopes=* (optional)
     * @param xHTTPMethodOverride  This parameter is used to specify that this REST call is an export operation. The value for this field is GET. If this is specified then you need to provide the filtering criteria in body to specify the asset. If empty payload specified then all assets will be exported.  (optional)
     * @param zipFile              Zip file that contains the API Gateway asset needs to be imported (optional)
     */
    @RequestLine("POST /archive?overwrite={overwrite}&fixingMissingVersions={fixingMissingVersions}&preserveAssetState={preserveAssetState}&policies={policies}&apis={apis}&aliases={aliases}&applications={applications}&approvalConfigurations={approvalConfigurations}&outboundProxies={outboundProxies}&urlAliases={urlAliases}&keyStores={keyStores}&trustStores={trustStores}&JNDIProviderAliases={jnDIProviderAliases}&JMSConnectionAliases={jmSConnectionAliases}&JMSTriggers={jmSTriggers}&webserviceEndpointAliases={webserviceEndpointAliases}&users={users}&groups={groups}&accessProfiles={accessProfiles}&kerberosSetting={kerberosSetting}&plans={plans}&packages={packages}&configurations={configurations}&gatewayScopes={gatewayScopes}")
    @Headers({
        "x-HTTP-Method-Override: {xHTTPMethodOverride}", 
        "Content-Type: multipart/form-data"
    })
    void importExportAPIGatewayAssets(@Param("overwrite") @Nullable String overwrite, @Param("fixingMissingVersions") @Nullable String fixingMissingVersions, @Param("preserveAssetState") @Nullable String preserveAssetState, @Param("policies") @Nullable List<String> policies, @Param("apis") @Nullable List<String> apis, @Param("aliases") @Nullable List<String> aliases, @Param("applications") @Nullable List<String> applications, @Param("approvalConfigurations") @Nullable List<String> approvalConfigurations, @Param("outboundProxies") @Nullable List<String> outboundProxies, @Param("urlAliases") @Nullable List<String> urlAliases, @Param("keyStores") @Nullable List<String> keyStores, @Param("trustStores") @Nullable List<String> trustStores, @Param("JNDIProviderAliases") @Nullable List<String> jnDIProviderAliases, @Param("JMSConnectionAliases") @Nullable List<String> jmSConnectionAliases, @Param("JMSTriggers") @Nullable List<String> jmSTriggers, @Param("webserviceEndpointAliases") @Nullable List<String> webserviceEndpointAliases, @Param("users") @Nullable List<String> users, @Param("groups") @Nullable List<String> groups, @Param("accessProfiles") @Nullable List<String> accessProfiles, @Param("kerberosSetting") @Nullable String kerberosSetting, @Param("plans") @Nullable List<String> plans, @Param("packages") @Nullable List<String> packages, @Param("configurations") @Nullable List<String> configurations, @Param("gatewayScopes") @Nullable List<String> gatewayScopes, @Param("x-HTTP-Method-Override") @Nullable String xHTTPMethodOverride, @Param("zipFile") @Nullable File zipFile);

    /**
     * <p>
     * Import trace data from the given archive. This does not import the events in to the storage. It simply reads the archive and returns all the events and their tracing data in the archive.
     *
     * @param _file                The import archive containing the exported tracer events. (required)
     */
    @RequestLine("POST /tracer/import")
    @Headers({
        "Content-Type: multipart/form-data"
    })
    ImportTraceInfoResponse importTraceInfo(@Param("file") @NotNull File _file);

    /**
     * <p>
     * This is the JWKS uri of the API Gateway. It fetches all the public keys of APIGateway, which can be used by to validate the JWT generated by API Gateway. The response will be in the JWK format
     *
     */
    @RequestLine("GET /jwt/certs")
    Object jWKSUri();

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
    @Headers({
        "Content-Type: application/json"
    })
    void migration(@NotNull MigrationConfig body);

    /**
     * <p>
     * This REST request is used to move down the execution order of the Threat protection rule created in API Gateway. This request does not require any request body. If the threat protection policy execution order is changed successfully then the policy details of specified policy will be sent as response.
     *
     * @param policyId             This path parameter is used to specify the policy id of the threat protection whose execution order needs to be moved down  (required)
     */
    @RequestLine("PUT /policies/{policyId}/movedown")
    Policy moveDownThreatProtectionRuleByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * This REST request is used to move up the execution order of the Threat protection rule created in API Gateway. This request does not require any request body. This request does not require any request body. If the threat protection policy execution order is changed successfully then the policy details of specified policy will be sent as response.
     *
     * @param policyId             This path parameter is used to specify the policy id of the threat protection whose execution order needs to be moved up  (required)
     */
    @RequestLine("PUT /policies/{policyId}/moveup")
    Policy moveUpThreatProtectionRuleByPolicyID(@Param("policyId") @NotNull String policyId);

    /**
     * <p>
     * This operation can be used to update an API with its implementation endpoints details and optionally the corresponding maturity state after the implementation has been completed
     *
     * @param apiId                API Id for the API to be updated (required)
     * @param maturityState         (optional)
     * @param nativeBaseURLs        (optional)
     */
    @RequestLine("PUT /apis/{apiId}/implementation")
    @Headers({
        "Content-Type: multipart/form-data"
    })
    ModelAPIResponse notifyAPIImplementation(@Param("apiId") @NotNull String apiId, @Param("maturityState") @Nullable String maturityState, @Param("nativeBaseURLs") @Nullable List<String> nativeBaseURLs);

    /**
     * <p>
     * This HTTP PATCH request suspends the specified application in API Gateway.
     *
     * @param applicationId        This parameter specifies the ID of an application that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an application that is to be updated in API Gateway. (required)
     */
    @RequestLine("PATCH /applications/{applicationId}")
    @Headers({
        "Content-Type: application/json"
    })
    Application patchApplication(@Param("applicationId") @NotNull String applicationId, @NotNull Application body);

    /**
     *
     * @param documentId           The unique identifier of the document to be patched. (required)
     * @param body                 The request payload to patch the document in API Gateway. (required)
     */
    @RequestLine("PATCH /documents/{documentId}")
    @Headers({
        "Content-Type: application/json"
    })
    DocumentResponse patchDocument(@Param("documentId") @NotNull String documentId, @NotNull Document body);

    /**
     * <p>
     * This REST request is used to create a policy in API Gateway. The body of this request should contain the payload of the policy. Using this request we can create Policies of different type.
     * To create a service, scope, package and template level policy we can add the policy payload and set the corresponding policy scope.
     * To create a Global policy user should have API Gateway Administrator access. Other users cannot create global policies. To Create Global policy send the policy payload along with scope details and policy scope set to global. Similarly, to create a threat protection policy user have to send the policy along with the policy enforcement id of Threat protection policy actions. The policy actions needs to be created before adding the enforcement id of policy actions to policy. Threat protection rules are another type of global level policies which are applied to all requests and responses. The threat protection policy enforcement cannot be used in any other policies and other policy enforcement cannot be used in threat protection policies.
     * Using this request we can also clone a policy. To clone a policy user have to set the appropriate query parameters.
     * The effective policy calculation for policy(Service and scope level policy) is not calculated till it is referred in the API. But for a
     * global policy the effective policy is calculated while creating the policy itself. Policy with template as policy scope cannot be referred from any API or scope. User needs to clone the policy templates and set the policy scope to either service or scope or global before referring it from the API. Policy should have only one occurrence of any stage. Multiple policy enforcements can be added to the applicable stages. To know about the list of stages and applicable policy enforcements on that stage please refer /policyStages resource.
     *
     * @param body                  (required)
     * @param action                This query parameter represents the action user want to perform. Currently user can only clone the policy. Hence the allowed value for this parameter would be "clone". Cloning is duplication of one or more policies in to a single policy. All the policy actions specified inside the policies are also be duplicated while creating the duplicate policy.The effective policy is not calculated for this until this policy is referred from the API. (optional)
     * @param policyIds            This query parameter represents the list of policies from which the new clone policy is created. If you specify list of policies then the newly  created policy has all the policy action from all the policies. (optional)
     * @param policyScope          This query parameter represents the policy scope of cloned policy. We can clone policy from one policy scope to another policy scope. Allowed policy scope values are global,service,template &amp; scope (optional)
     */
    @RequestLine("POST /policies?action={action}&policyIds={policyIds}&policyScope={policyScope}")
    @Headers({
        "Content-Type: application/json"
    })
    Policy policiesPost(@NotNull Policy body, @Param("action") @Nullable String action, @Param("policyIds") @Nullable String policyIds, @Param("policyScope") @Nullable String policyScope);

    /**
     * <p>
     * This REST Request is used to get the template detail for list of policy action.
     *
     * @param policyActionTemplates This is a query parameter. It will be used to fetch policy action templates for list of policy action. (optional)
     */
    @RequestLine("GET /policyActionTemplates?policyActionTemplates={policyActionTemplates}")
    List<PolicyActionTemplate> policyActionTemplatesGet(@Param("policyActionTemplates") @Nullable String policyActionTemplates);

    /**
     * <p>
     * This REST Request is used to get the template details of a policy action.. To retrieve the policy action template for a particular policy action, specify the policy action template name as a path parameter 
     *
     * @param policyActionTemplateId This is a path parameter. It will be used to fetch policy action template of a particular template. (required)
     */
    @RequestLine("GET /policyActionTemplates/{policyActionTemplateId}")
    PolicyActionTemplate policyActionTemplatesPolicyActionTemplateIdGet(@Param("policyActionTemplateId") @NotNull String policyActionTemplateId);

    /**
     * <p>
     * This REST operation is used to publish API to the registered API Portal
     *
     * @param apiId                API Id for the API to be published (required)
     * @param body                 API publish request payload (required)
     */
    @RequestLine("PUT /apis/{apiId}/publish")
    @Headers({
        "Content-Type: application/json"
    })
    APIResponseCreate publishAPI(@Param("apiId") @NotNull String apiId, @NotNull InputPublish body);

    /**
     * <p>
     * This endpoint is used to publish the packages along with its associated plans to portal. Before publishing the package, the portal configuration should be configured in API gateway. You can use the endpoint /portalGateways to configure the portal configuration. The associated APIs needs to be published before publishing the package.
     *
     * @param packageId            package id which needs to be published to portal (required)
     */
    @RequestLine("PUT /packages/{packageId}/publish")
    PackageResponseContainer publishPackageByPackageId(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * Publish one or more APIs to one or more integration servers. Only REST and SOAP APIs are supported.
     *
     * @param body                 Integration server publish payload (required)
     */
    @RequestLine("PUT /integrationServer/publish")
    @Headers({
        "Content-Type: application/json"
    })
    ServiceRegistryPublishPutResponse publishToIntegrationServer(@NotNull InputIntegrationServerPublish body);

    /**
     * <p>
     * Publish one or more APIs to one or more service registries
     *
     * @param body                 Service registry publish payload (required)
     */
    @RequestLine("PUT /serviceRegistry/publish")
    @Headers({
        "Content-Type: application/json"
    })
    ServiceRegistryPublishPutResponse publishToServiceRegistry(@NotNull InputServiceRegistryPublish body);

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
    @Headers({
        "Content-Type: application/json"
    })
    QuiesceMode quiescemode(@NotNull QuiesceMode body);

    /**
     * <p>
     * The method refreshes the credentials of a strategy in API Gateway. This is applicable only when dynamic client registration (generate credentials) is enabled in the strategy.
     *
     * @param strategyId           This parameter specifies the ID of a strategy that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload for the strategy to be refreshed in API Gateway. (required)
     */
    @RequestLine("PUT /strategies/{strategyId}/refreshCredentials")
    @Headers({
        "Content-Type: application/json"
    })
    OneOfStrategyModel refreshCredentials(@Param("strategyId") @NotNull String strategyId, @NotNull StrategyRequest body);

    /**
     * <p>
     * The method regenarates the access tokens of an application. Possible values for type - apiAccessKeyCredentials for API Key regenaration and oAuthCredentials for Oauth credentials regenaration.
     *
     * @param applicationId        This parameter specifies the ID of an application for generating the access Tokens in API Gateway. (required)
     * @param body                 This parameter specifies the type of token to be regenerated. (required)
     */
    @RequestLine("POST /applications/{applicationId}/accessTokens")
    @Headers({
        "Content-Type: application/json"
    })
    void regenerateAccessTokens(@Param("applicationId") @NotNull String applicationId, @NotNull AccessTokensTypeModel body);

    /**
     * <p>
     * This method is to be used to update the registered APIs list for an application. To add a new api to an application which is already registered with other APIs, you should send the complete list of apiIds including the old apiIds and the new apiId(s) to be added. To remove all APIs from the application, send an empty array for the apiIds field in the request.
     *
     * @param applicationId        This parameter specifies the ID of an application for registering APIs in API Gateway. (required)
     * @param body                 This parameter specifies the IDs of the APIs for registering in an application in API Gateway. (required)
     */
    @RequestLine("POST /applications/{applicationId}/apis")
    @Headers({
        "Content-Type: application/json"
    })
    void registerApis(@Param("applicationId") @NotNull String applicationId, @NotNull List<String> body);

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
    @Headers({
        "Content-Type: application/json"
    })
    CallbackProcessorSettings saveAPICallbackProcessorSettings(@NotNull CallbackProcessorSettings body);

    /**
     * <p>
     * The method is used to update the details of the API Portal destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/apiPortalDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    Destination saveAPIPortalAsDestination(@NotNull Destination body);

    /**
     * <p>
     * Saves the account lock settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/accountLockSettings")
    @Headers({
        "Content-Type: application/json"
    })
    AccountLockSettings saveAccountLockSettings(@NotNull AccountLockSettings body);

    /**
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/analyticsDataStoreDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    AnalyticsDataStoreDestination saveAnalyticsDataStoreAsDestination(@NotNull AnalyticsDataStoreDestination body);

    /**
     * <p>
     * The method is used to update the details of the Transaction Logger destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/auditlogDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    AuditLogDestination saveAuditLogAsDestination(@NotNull AuditLogDestination body);

    /**
     * <p>
     * The method is used to update the Communication details of the CentraSite destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/centraSiteDestinationCommunicationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    CSCommunicationDestination saveCentraSiteCommunicationAsDestination(@NotNull CSCommunicationDestination body);

    /**
     * <p>
     * The method is used to update the details of the CentraSite SNMP destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/centraSiteDestinationSNMPConfig")
    @Headers({
        "Content-Type: application/json"
    })
    CSSNMPDestination saveCentraSiteSNMPAsDestination(@NotNull CSSNMPDestination body);

    /**
     * <p>
     * This REST method is used to update the custom content types for API Gateway.The response is a set of key/value pair where key indicates the custom content type and value indicates the base type. The value can be application/xml or application/json or text/xml
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/customContentTypes")
    @Headers({
        "Content-Type: application/json"
    })
    Object saveCustomContentTypes(@NotNull Object body);

    /**
     * <p>
     * The method is used to update the details of the Database destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/jdbcDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    Destination saveDatabaseAsDestination(@NotNull Destination body);

    /**
     * <p>
     * Saves the global IP access setting for authentication based restriction settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/denyByIPForFailedAuthConfig")
    @Headers({
        "Content-Type: application/json"
    })
    DenyByIPForFailedAuthConfig saveDenyByIPForFailedAuthConfig(@NotNull DenyByIPForFailedAuthConfig body);

    /**
     * <p>
     * The method is used to update the details of the Digital Events destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/desDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    Destination saveDigitalEventsAsDestination(@NotNull Destination body);

    /**
     * <p>
     * The method is used to update the details of the Elasticsearch destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/elasticsearchDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    ElasticsearchDestination saveElasticsearchAsDestination(@NotNull ElasticsearchDestination body);

    /**
     * <p>
     * The method is used to update the details of the Email destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/emailDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    EmailDestination saveEmailAsDestination(@NotNull EmailDestination body);

    /**
     * <p>
     * This REST method is used to update the default error template with any custom templates and the value of the property - sendNativeProviderFault.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/errorProcessing")
    @Headers({
        "Content-Type: application/json"
    })
    ErrorProcessing saveErrorProcessingDetails(@NotNull ErrorProcessing body);

    /**
     * <p>
     * The method is used to update the details of the API Gateway destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/gatewayDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    Destination saveGatewayAsDestination(@NotNull Destination body);

    /**
     * <p>
     * The method is used to update the details of the default keystore, truststore and alias configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/keystore")
    @Headers({
        "Content-Type: application/json"
    })
    KeystoreTruststore saveKeystoreTruststore(@NotNull KeystoreTruststore body);

    /**
     * <p>
     * Saves the LDAP configuration settings in the API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/ldapConfig")
    @Headers({
        "Content-Type: application/json"
    })
    InputLdapConfiguration saveLdapConfig(@NotNull InputLdapConfiguration body);

    /**
     * <p>
     * The method is used to update the details of the load Balancer configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/loadBalancer")
    @Headers({
        "Content-Type: application/json"
    })
    LoadBalancer saveLoadBalancers(@NotNull LoadBalancer body);

    /**
     * <p>
     * The method is used to update the details of the log configuration in API Gateway.
     *
     */
    @RequestLine("PUT /configurations/logConfig")
    LogConfiguration saveLogConfig();

    /**
     * <p>
     * The method is used to update the details of the Mobile Applications configuration in API Gateway.You can use API Gateway to disable access for certain mobile application versions on a predefined set of mobile platforms. By registering the required devices and applications and disabling access to these versions, you ensure that all users use the latest versions of the applications and take advantage of the latest security and functional updates.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/mobileApp")
    @Headers({
        "Content-Type: application/json"
    })
    MobileApplicationConfiguration saveMobileApplicationConfigurations(@NotNull MobileApplicationConfiguration body);

    /**
     * <p>
     * Saves the password expiry settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/passwordExpiry")
    @Headers({
        "Content-Type: application/json"
    })
    PasswordExpirySettings savePasswordExpirySettings(@NotNull PasswordExpirySettings body);

    /**
     * <p>
     * Saves the password restrictions settings in API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/passwordRestrictions")
    @Headers({
        "Content-Type: application/json"
    })
    PasswordRestrictions savePasswordRestrictions(@NotNull PasswordRestrictions body);

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     *
     * @param body                 The request payload of proxybypass server that is to be saved in API Gateway. (required)
     */
    @RequestLine("POST /is/proxyBypass")
    @Headers({
        "Content-Type: application/json"
    })
    void saveProxyBypass(@NotNull ProxyBypass body);

    /**
     * <p>
     * The method is used to update the details of the SNMP destination in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/snmpDestinationConfig")
    @Headers({
        "Content-Type: application/json"
    })
    SNMPDestination saveSNMPAsDestination(@NotNull SNMPDestination body);

    /**
     * <p>
     * The method is used to update the details of the SSO configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/samlsso")
    @Headers({
        "Content-Type: application/json"
    })
    SSOConfiguration saveSSOConfig(@NotNull SSOConfiguration body);

    /**
     * <p>
     * This method updates or creates a list of extended settings and watt properties in API Gateway. The user should have an API Gateway administrator access to update thse settings. The user needs to send only the modified settings i.e, 'preferredSettings', in the payload.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/settings")
    @Headers({
        "Content-Type: application/json"
    })
    ExtendedSettingsOutput saveSettings(@NotNull ExtendedSettingsInput body);

    /**
     * <p>
     * The method is used to update the details of the whitelisting IPs configuration in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /configurations/whiteListingIPs")
    @Headers({
        "Content-Type: application/json"
    })
    WhiteListedIPs saveWhitelistedIPs(@NotNull WhiteListedIPs body);

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
     *
     * @param body                 Search Parameters to search for specific set of results on specified types (required)
     */
    @RequestLine("POST /search")
    @Headers({
        "Content-Type: application/json"
    })
    Map<String, Object> searchByType(@NotNull SearchContext body);

    /**
     *
     */
    @RequestLine("GET /is/serverinfo")
    ServerInfo serverInformation();

    /**
     * <p>
     * The PUT method updates the primary port configuration to the referenced existing port configuration.
     *
     * @param body                 The request body references the existing port configuration to be defined as the primary port. (optional)
     */
    @RequestLine("PUT /ports/primary")
    @Headers({
        "Content-Type: application/json"
    })
    PortReference setPrimaryPort(@Nullable PortReference body);

    /**
     * <p>
     * This method shutdowns the API Gateway server. If bounce is set as true then the server would be restarted. The option parameter specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown. Quiesce specifies the quiesce mode for all in API Gateway. A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. The default value is false.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /shutdown")
    @Headers({
        "Content-Type: application/json"
    })
    void shutdown(@NotNull Shutdown body);

    /**
     *
     * @param body                 The request payload to store the document in API Gateway. (required)
     */
    @RequestLine("POST /documents")
    @Headers({
        "Content-Type: application/json"
    })
    DocumentResponse storeDocument(@NotNull Document body);

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
     * Enable tracing for an API
     *
     * @param apiId                API Id of the API for which tracing should be enabled. (required)
     */
    @RequestLine("PUT /apis/{apiId}/tracing/enable")
    GatewayAPI tracingEnable(@Param("apiId") @NotNull String apiId);

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
     * Unlock user account(s) locked by API Gateway
     *
     * @param body                  (required)
     */
    @RequestLine("POST /is/lockedAccounts")
    @Headers({
        "Content-Type: application/json"
    })
    LockedAccounts unLockUserAccounts(@NotNull UnlockAccountsRequest body);

    /**
     * <p>
     * This endpoint is used to un publish the
     * package and its associated plan from portal. 
     *
     * @param packageId            package id which needs to be unpublished from portal (required)
     */
    @RequestLine("PUT /packages/{packageId}/unpublish")
    PackageResponseContainer unPublishPackageByPackageId(@Param("packageId") @NotNull String packageId);

    /**
     * <p>
     * Unpublish API from the registered API Portal
     *
     * @param apiId                API Id for the API to be unpublished (required)
     */
    @RequestLine("PUT /apis/{apiId}/unpublish")
    APIResponseCreate unpublishAPI(@Param("apiId") @NotNull String apiId);

    /**
     * <p>
     * Unpublish one or more APIs from one or more service registries
     *
     * @param body                 Service registry unpublish payload (required)
     */
    @RequestLine("PUT /serviceRegistry/unpublish")
    @Headers({
        "Content-Type: application/json"
    })
    ServiceRegistryUnpublishPutResponse unpublishFromServiceRegistry(@NotNull InputServiceRegistryUnpublish body);

    /**
     * <p>
     * This REST operation is used to update an API by importing a file, url or inline.
     * While updating the API, visibility of the operations can be set by enabling or disabling the operations. Disabled operations will not be exposed to the customers. By default, all the operations are exposed to the consumers.
     * When updating the API using file or url, API Gateway overwrite the resources/operations for the API. But it will retain the maturity state, scopes, visibility and if API mocking is enabled, then default mocked responses, mocked conditions and IS services will also be retained.
     *
     * @param apiId                API Id for the API to be updated (required)
     * @param body                  (required)
     * @param overwriteTags        When an API is updated using a URL / file, the existing tags will be overwritten if this value is true. (optional, defaults to false)
     */
    @RequestLine("PUT /apis/{apiId}?overwriteTags={overwriteTags}")
    @Headers({
        "Content-Type: application/json"
    })
    APIResponseCreate updateAPI(@Param("apiId") @NotNull String apiId, @NotNull UpdateAPIRequest body, @Param("overwriteTags") @Nullable Boolean overwriteTags);

    /**
     * <p>
     * This API allows you to update API Portal configuration information in API Gateway.
     *
     * @param portalGatewayId      Id of the API Portal configuration for update (required)
     * @param body                 API Portal configuration payload (required)
     */
    @RequestLine("PUT /portalGateways/{portalGatewayId}")
    @Headers({
        "Content-Type: application/json"
    })
    PortalGateway updateAPIPortalConfiguration(@Param("portalGatewayId") @NotNull String portalGatewayId, @NotNull PortalGateway body);

    /**
     * <p>
     * The PUT updates the services for the access mode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     * @param body                 The request contains the updated services access mode information. (required)
     */
    @RequestLine("PUT /ports/{listenerKey}/accessMode")
    @Headers({
        "Content-Type: application/json"
    })
    AccessModeServices updateAccessMode(@Param("listenerKey") @NotNull String listenerKey, @NotNull AccessModeServices body);

    /**
     * <p>
     * The method updates the details of a specified team in API Gateway. The API request body must contain the payload for the updated accessProfile.
     *
     * @param accessProfileId      The path parameter specifies the id of a team whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of a accessProfile that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /accessProfiles/{accessProfileId}")
    @Headers({
        "Content-Type: application/json"
    })
    AccessProfile updateAccessProfile(@Param("accessProfileId") @NotNull String accessProfileId, @NotNull AccessProfile body);

    /**
     * <p>
     * The method updates the details of a specified alias in API Gateway. The API request body must contain the payload of the alias that needs to be updated.
     *
     * @param aliasId              The path parameter specifies the id of an alias whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an alias that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /alias/{aliasId}")
    @Headers({
        "Content-Type: application/json"
    })
    Alias updateAlias(@Param("aliasId") @NotNull String aliasId, @NotNull Alias body);

    /**
     * <p>
     * The method updates the expiry date of all the API Keys in the instance. The new expiry date is calculated based on the extended settings property 'apiKeyExpirationPeriod'. If 'apiKeyExpirationPeriod is empty, then the expiration date for all API Keys are set as unlimited.If 'apiKeyExpirationPeriod' is set to some accepted value (say 60min), then the expiry date is calculated as current time when this method is invoked + the expiration period (60min).Since this method updates expiry date for all API keys in the instance, take caution when you invoke this! Invoke this only if absolutely necessary and take necessary precautions!For example, your system might have applications to the scale of 1M or higher - make sure to configure appropriate timeout settings, etc when invoking this!
     *
     * @param body                 This parameter specifies the type of access token for which expiry date should be updated. Currently only apiAccessKeyCredentials is supported (required)
     */
    @RequestLine("PUT /applications/accessTokens")
    @Headers({
        "Content-Type: application/json"
    })
    void updateApiKeysExpiry(@NotNull AccessTokensTypeModel body);

    /**
     * <p>
     * This HTTP request updates a specified application in API Gateway. You can use this resource to update basic information in application like name, description, version, identifiers, linked authentication strategy ids etc., but you cannot use this method to update the contents of authentication strategies, access tokens or to update associated apis. To regenerate the access tokens (API key), refer the resource /applications/{applicationId}/accessTokens POST. To update the associated apis, refer the resource /applications/{applicationId}/apis PUT. To create new authentication strategies or update the authentication strategies, refer the resource /strategies POST or /strategies/{strategyId} PUT
     *
     * @param applicationId        This parameter specifies the ID of an application that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an application that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /applications/{applicationId}")
    @Headers({
        "Content-Type: application/json"
    })
    Application updateApplication(@Param("applicationId") @NotNull String applicationId, @NotNull Application body);

    /**
     * <p>
     * The method updates the approval configuration in API Gateway.
     *
     * @param id                   This parameter specifies the ID of an approval configuration that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an approval configuration that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /approvalConfigurations/{id}")
    @Headers({
        "Content-Type: application/json"
    })
    ApprovalConfiguration updateApprovalConfiguration(@Param("id") @NotNull String id, @NotNull ApprovalConfiguration body);

    /**
     * <p>
     * This REST service is used to update the assertion
     *
     * @param assertionId          This path parameter is used to specify the assertion id which assertion details needs to updated. (required)
     * @param body                 assertion request payload (required)
     */
    @RequestLine("PUT /assertions/{assertionId}")
    @Headers({
        "Content-Type: application/json"
    })
    AssertionConfiguration updateAssertion(@Param("assertionId") @NotNull String assertionId, @NotNull AssertionConfiguration body);

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
    @Headers({
        "Content-Type: application/json"
    })
    ClusterInfo updateCluster(@NotNull ClusterInfo body);

    /**
     *
     * @param documentId           The unique identifier of the document to update (required)
     * @param body                 The request payload to update the document in API Gateway. (required)
     */
    @RequestLine("PUT /documents/{documentId}")
    @Headers({
        "Content-Type: application/json"
    })
    DocumentResponse updateDocumentContent(@Param("documentId") @NotNull String documentId, @NotNull Document body);

    /**
     * <p>
     * The method updates the expiry interval of the master password in API Gateway.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /masterPassword/setExpiry")
    @Headers({
        "Content-Type: application/json"
    })
    MasterPasswordExpiryIntervalResponse updateExpiryInterval(@NotNull MasterPasswordExpiryInterval body);

    /**
     * <p>
     * The method updates the details of a specified group in API Gateway. The API request body must contain the payload for the updated group.
     *
     * @param groupId              The path parameter specifies the id of a group whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of a group that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /groups/{groupId}")
    @Headers({
        "Content-Type: application/json"
    })
    Group updateGroup(@Param("groupId") @NotNull String groupId, @NotNull Group body);

    /**
     * <p>
     * This REST service is used to update the JMS connection
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jmsConnections")
    @Headers({
        "Content-Type: application/json"
    })
    JMSConnectionAlias updateJMSConnection(@NotNull JMSConnectionAlias body);

    /**
     * <p>
     * This REST service is used to update the JMS trigger
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jmsTriggers")
    @Headers({
        "Content-Type: application/json"
    })
    JMSTrigger updateJMSTrigger(@NotNull JMSTrigger body);

    /**
     * <p>
     * This REST service is used to update the JNDI configuration
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/jndi")
    @Headers({
        "Content-Type: application/json"
    })
    JNDIProviderAlias updateJNDI(@NotNull JNDIProviderAlias body);

    /**
     *
     * @param body                 The request payload for Kerberos settings in API Gateway. (required)
     */
    @RequestLine("PUT /is/kerberos")
    @Headers({
        "Content-Type: application/json"
    })
    void updateKerberos(@NotNull KerberosSettings body);

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
    @Headers({
        "Content-Type: multipart/form-data"
    })
    KeyStore updateKeystoreAliases(@Param("keyStoreName") @NotNull String keyStoreName, @Param("keyStoreType") @NotNull String keyStoreType, @Param("keyStoreProvider") @NotNull String keyStoreProvider, @Param("keyStorePassword") @NotNull String keyStorePassword, @Param("uploadFileName") @NotNull String uploadFileName, @Param("fileContent") @NotNull File fileContent, @Param("keyStoreDescription") @Nullable String keyStoreDescription, @Param("pkAliasesList") @Nullable String pkAliasesList, @Param("pkPasswordsList") @Nullable String pkPasswordsList, @Param("nullPKpasswds") @Nullable String nullPKpasswds, @Param("isPwdBase64Encoded") @Nullable String isPwdBase64Encoded);

    /**
     *
     * @param body                 The request payload for updating license details in APIGateway. (required)
     */
    @RequestLine("PUT /is/license")
    @Headers({
        "Content-Type: application/json"
    })
    void updateLicenseDetails(@NotNull LicenseDetail body);

    /**
     * <p>
     * The method is used to configure the listener in the datacenter in API Gateway.
     *
     * @param body                 Listener configuration payload (required)
     */
    @RequestLine("PUT /dataspace/listener")
    @Headers({
        "Content-Type: application/json"
    })
    ListenerConfig updateListenerConfiguration(@NotNull ListenerConfig body);

    /**
     * <p>
     * The method updates the master password in API Gateway.On successful update,all the old passwords available will be encrypted using this new master password.
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /masterPassword/update")
    @Headers({
        "Content-Type: application/json"
    })
    MasterPasswordUpdateResponse updateMasterPassword(@NotNull MasterPasswordUpdate body);

    /**
     * <p>
     * Use this method to update an OAuth scope mapping
     *
     * @param oauthScopeId         The path parameter specifies the id of an OAuth scope mapping that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an OAuth scope that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /scopes/{oauthScopeId}")
    @Headers({
        "Content-Type: application/json"
    })
    GatewayScope updateOAuthScope(@Param("oauthScopeId") @NotNull String oauthScopeId, @NotNull GatewayScope body);

    /**
     *
     * @param body                 The request payload of an outbound proxy server that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /is/outboundproxy")
    @Headers({
        "Content-Type: application/json"
    })
    void updateOutboundProxy(@NotNull OutboundProxySettings body);

    /**
     * <p>
     * This endpoint is used to update the package metadata and
     * associate or remove APIs and plans. The package can be active while editing any details of the package. If an API is added to an active package then subscribers can start consuming the API with existing key. Similarly if the API is removed, subscribers wont be able to use the removed APIs. Removal of plan is allowed only if the plan does not have any subscribers. You need to republish the package to portal to make the updated changes available in portal.
     *  Please use /package/{packageId}/active or /package/{packageId}/deactivate to activate or deactivate as this endpoint cannot be used to activate or deactivate package.
     *
     * @param packageId            package id to which the update requests is sent (required)
     * @param body                  (optional)
     */
    @RequestLine("PUT /packages/{packageId}")
    @Headers({
        "Content-Type: application/json"
    })
    PackageResponseContainer updatePackageByPackageId(@Param("packageId") @NotNull String packageId, @Nullable ModelPackage body);

    /**
     * <p>
     * This request is used to update the plan meta data such as name, description, license details. To update the rate limit or quota use the /policies/{policyId} to get the throttling/MSLA policy action id and use /policyActions/{policyActionId} to update the rate limit or quota. To associate or dis associate a package use /packages/{packageId} end point.
     * If the rate limit or quota changes it will be automatically enforced with updated with out re activating the package.
     *
     * @param planId               The id of the plan whose details needs to be updated. (required)
     * @param body                  (optional)
     */
    @RequestLine("PUT /plans/{planId}")
    @Headers({
        "Content-Type: application/json"
    })
    PlanGetResponse updatePlanByPlanId(@Param("planId") @NotNull String planId, @Nullable Plan body);

    /**
     * <p>
     * This put request is used to update policy action based on the policy action id which is specified in path
     *
     * @param policyActionId       This path parameter is used to specify the policy action id which needs to be updated. (required)
     * @param body                 Contains the policy action details which needs to be updated. (required)
     */
    @RequestLine("PUT /policyActions/{policyActionId}")
    @Headers({
        "Content-Type: application/json"
    })
    PolicyActionWrapper updatePolicyAction(@Param("policyActionId") @NotNull String policyActionId, @NotNull PolicyActionWrapper body);

    /**
     * <p>
     * This REST request is used to update the policy details for a specific policy. For Global policy user should have API Gateway administrator access to update global policy
     *
     * @param policyId             This path parameter is used to specify the policy id that needs to be updated. (required)
     * @param body                  (optional)
     */
    @RequestLine("PUT /policies/{policyId}")
    @Headers({
        "Content-Type: application/json"
    })
    Policy updatePolicyByID(@Param("policyId") @NotNull String policyId, @Nullable Policy body);

    /**
     * <p>
     * The PUT method updates an existing port configuration. Updating an enabled port implies that it is disabled and enabled again.
     *
     * @param body                  (optional)
     */
    @RequestLine("PUT /ports")
    @Headers({
        "Content-Type: application/json"
    })
    Port updatePort(@Nullable Port body);

    /**
     * <p>
     * The method updates the proxyBypassAddresses to bypass the outbound proxy servers. The API request body must contain the payload. In the proxyBypassAddresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas.
     * You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type:
     * localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     *
     * @param body                 The request payload of proxybypass that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /is/proxyBypass")
    @Headers({
        "Content-Type: application/json"
    })
    void updateProxyBypass(@NotNull ProxyBypass body);

    /**
     * <p>
     * This method is to be used to update the registered APIs list for an application. To add a new api to an application which is already registered with other APIs, you should send the complete list of apiIds including the old apiIds and the new apiId(s) to be added. To remove all APIs from the application, send an empty array for the apiIds field in the request.
     *
     * @param applicationId        This parameter specifies the ID of an application for updating the details of the registered APIs in API Gateway. (required)
     * @param body                 This parameter specifies the ID of a registered API that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /applications/{applicationId}/apis")
    @Headers({
        "Content-Type: application/json"
    })
    void updateRegisteredApis(@Param("applicationId") @NotNull String applicationId, @NotNull List<String> body);

    /**
     * <p>
     * The method is used to configure the other datacenter connectivity information in API Gateway.
     *
     * @param body                 Ring configuration payload (required)
     */
    @RequestLine("PUT /dataspace/ring")
    @Headers({
        "Content-Type: application/json"
    })
    RemotePortConfig updateRingConfiguration(@NotNull RemotePortConfig body);

    /**
     * <p>
     * The method updates the details of a specified rule in API Gateway. The API request body must contain the payload for the updated rule.
     *
     * @param ruleId               The path parameter specifies the id of the rule that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of an rule that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /rule/{ruleId}")
    @Headers({
        "Content-Type: application/json"
    })
    Rule updateRule(@Param("ruleId") @NotNull String ruleId, @NotNull Rule body);

    /**
     * <p>
     * This REST operation is used to update a stage in the source API Gateway where promotion will be initiated. A stage is just another API Gateway instance. When the stage url is https, then keystore and keystore alias will also be expected while configuring a stage
     *
     * @param stageId              Stage Id for the stage to be updated (required)
     * @param body                 Stage request payload (required)
     */
    @RequestLine("PUT /stages/{stageId}")
    @Headers({
        "Content-Type: application/json"
    })
    Stage updateStage(@Param("stageId") @NotNull String stageId, @NotNull Stage body);

    /**
     * <p>
     * This REST operation is used to update a strategy
     *
     * @param strategyId           This parameter specifies the ID of a strategy that is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of a strategy that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /strategies/{strategyId}")
    @Headers({
        "Content-Type: application/json"
    })
    OneOfStrategyModel updateStrategy(@Param("strategyId") @NotNull String strategyId, @NotNull StrategyRequest body);

    /**
     * <p>
     * This is used switch the subscription from one package and plan to another package and plan combination. If approval is enabled, then the request will return old application detail as response and will create a request for approver to approve the switch. Till the request get approved the user can invoke old package APIs only. After the subscription is switched, the quota for the subscription will be reset and will be able to invoke the new APIs using the same API Key. To get the history of the subscription usage use the /transactionalEvents/_search endpoint
     *
     * @param applicationId        Application id to update the subscription details (required)
     * @param body                  (optional)
     */
    @RequestLine("PUT /subscriptions/{applicationId}")
    @Headers({
        "Content-Type: application/json"
    })
    Application updateSubscription(@Param("applicationId") @NotNull String applicationId, @Nullable SubscriptionUpdateRequest body);

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
    @Headers({
        "Content-Type: multipart/form-data"
    })
    TrustStore updateTruststore(@Param("trustStoreName") @NotNull String trustStoreName, @Param("keyStoreType") @NotNull String keyStoreType, @Param("keyStoreProvider") @NotNull String keyStoreProvider, @Param("keyStorePassword") @NotNull String keyStorePassword, @Param("uploadFileName") @NotNull String uploadFileName, @Param("fileContent") @NotNull File fileContent, @Param("keyStoreDescription") @Nullable String keyStoreDescription, @Param("isPwdBase64Encoded") @Nullable String isPwdBase64Encoded);

    /**
     * <p>
     * Updates an existing URL Alias in API Gateway.
     *
     * @param body                 The request body for updating an existing URL Alias in API Gateway. (required)
     */
    @RequestLine("PUT /urlaliases")
    @Headers({
        "Content-Type: application/json"
    })
    URLAliasSettings updateURLALias(@NotNull URLAliasSettings body);

    /**
     * <p>
     * The method updates the details of a specified user in API Gateway. The API request body must contain the payload for the updated user.
     *
     * @param userId               The path parameter specifies the id of an user whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of a user that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /users/{userId}")
    @Headers({
        "Content-Type: application/json"
    })
    User updateUser(@Param("userId") @NotNull String userId, @NotNull User body);

    /**
     * <p>
     * The method updates the details of a specified webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be updated.
     *
     * @param id                   The path parameter specifies the id of an webhook whose detail is to be updated in API Gateway. (required)
     * @param body                 This parameter describes the request payload of webhook that is to be updated in API Gateway. (required)
     */
    @RequestLine("PUT /webhooks/{id}")
    @Headers({
        "Content-Type: application/json"
    })
    Webhook updateWebhook(@Param("id") @NotNull String id, @NotNull Webhook body);

    /**
     * <p>
     * This REST service is used to update the Webservice endpoint
     *
     * @param body                  (required)
     */
    @RequestLine("PUT /is/webServiceEndpoints")
    @Headers({
        "Content-Type: application/json"
    })
    WebserviceEndpointAlias updateWebserviceEndpoint(@NotNull WebserviceEndpointAlias body);

    /**
     * <p>
     * The PUT updates the ipAccessMode for an API Gateway port configuration
     *
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package. (required)
     * @param body                 The request contains update the ip access mode hosts list information. (required)
     */
    @RequestLine("PUT /ports/{listenerKey}/ipAccessMode")
    @Headers({
        "Content-Type: application/json"
    })
    IPAccessModeHostsList updatedIPAccessMode(@Param("listenerKey") @NotNull String listenerKey, @NotNull IPAccessModeHostsList body);

}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.Application;
import io.github.primelib.webmethodsapigateway4j.model.Group;
import io.github.primelib.webmethodsapigateway4j.model.JMSConnectionAlias;
import io.github.primelib.webmethodsapigateway4j.model.JMSTrigger;
import io.github.primelib.webmethodsapigateway4j.model.JNDIProviderAlias;
import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ExportApiGatewayAssetsSpec
 * <p>
 * Specification for the ExportApiGatewayAssets operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExportApiGatewayAssetsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter indicates whether you want to export the applications associated with the APIs
     */
    @Nullable 
    private String includeApplications;

    /**
     * This parameter indicates whether you want to export users associated with the groups and/or with the password expiry settings
     */
    @Nullable 
    private String includeUsers;

    /**
     * This parameter indicates whether you want to export groups associated with the teams
     */
    @Nullable 
    private String includeGroups;

    /**
     * This parameter indicates whether you want to export truststore alias associated with the email configuration
     */
    @Nullable 
    private String includeTruststores;

    /**
     * This parameter identifies the policies to be exported. The wildcard "*" selects all the policies.
     * For example a single policy can be exported with its id using the following request: GET /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a
     * Whereas, all the policies can be exported using the following request: GET /rest/apigateway/archive?policies=*
     */
    @Nullable 
    private List<String> policies;

    /**
     * This parameter identifies the APIs to be exported. The wildcard "*" selects all the APIs.
     * For example a single API can be exported using the following request: GET /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e
     * Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?apis=*
     */
    @Nullable 
    private List<String> apis;

    /**
     * This parameter identifies the aliases to be exported.
     * The wildcard "*" selects all aliases. For example, a single alias can be exported using the following requrest: GET /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d
     * Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?alias=*
     */
    @Nullable 
    private List<String> aliases;

    /**
     * This parameter identifies the applications to be exported.
     * The wildcard "*" selects all applications. For example, a single application can be exported using the following requrest: GET /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d
     * Whereas, all the applications can be exported using the following request: GET /rest/apigateway/archive?applications=*
     */
    @Nullable 
    private List<String> applications;

    /**
     * This parameter identifies the policy actions to be exported.
     * The wildcard "*" selects all policy actions. For example, a single policy action can be exported using the following request:
     * GET /rest/apigateway/archive?policyActions=20ca1e24-d6b2-430d-adf8-7a53a6cbaa53
     * Whereas, all the policy actions can be exported using the following request: GET /rest/apigateway/archive?policyActions=*
     */
    @Nullable 
    private List<String> policyActions;

    /**
     * This parameter identifies the approval configurations to be exported.
     * The wildcard "*" selects all approval configurations. For example, a single approval configuration can be exported using the following request: GET /rest/apigateway/archive?approvalConfigurations=createApplication
     * Whereas, all the approval configurations can be exported using the following request:
     * GET /rest/apigateway/archive?approvalConfigurations=*
     */
    @Nullable 
    private List<String> approvalConfigurations;

    /**
     * This parameter identifies the outbound proxy aliases to be exported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.
     * For example a single outbound proxy alias can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias
     * Whereas, all the outbound proxy aliases can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=*
     */
    @Nullable 
    private List<String> outboundProxies;

    /**
     * This parameter identifies the URL aliases to be exported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.
     * For example, a single URL alias can be exported using the following request: GET /rest/apigateway/archive?urlAliases=testUrlAlias
     * Whereas, all the URL aliases can be exported using the following request: GET /rest/apigateway/archive?testUrlAlias=*
     */
    @Nullable 
    private List<String> urlAliases;

    /**
     * This parameter identifies the keystore aliases to be exported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.
     * For example, a single keystore alias can be exported using the following request: GET /rest/apigateway/archive?keyStores=test_keystore
     * Whereas, all the keystore aliases can be exported using the following request: GET /rest/apigateway/archive?keyStores=*
     */
    @Nullable 
    private List<String> keyStores;

    /**
     * This parameter identifies the truststore aliases to be exported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.
     * For example, a single truststore alias can be exported using the following request: GET /rest/apigateway/archive?trustStores=test_truststore
     * Whereas, all the truststore aliases can be exported using the following request: GET /rest/apigateway/archive?trustStores=*
     */
    @Nullable 
    private List<String> trustStores;

    /**
     * This parameter identifies the JNDI provider aliases to be exported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.
     * For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias
     * Whereas, all the JNDI provider aliases can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=*
     */
    @Nullable 
    private List<String> jnDIProviderAliases;

    /**
     * This parameter identifies the JMS connection aliases to be exported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.
     * For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias
     * Whereas, all the JMS connection aliases can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=*
     */
    @Nullable 
    private List<String> jmSConnectionAliases;

    /**
     * This parameter identifies the JMS triggers to be exported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.
     * For example, a single JMS trigger can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=test_jmsTrigger
     * Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=*
     */
    @Nullable 
    private List<String> jmSTriggers;

    /**
     * This parameter identifies the 'web service endpoint' aliases to be exported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.
     * For example, a single web service endpoint alias can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias
     * Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=*
     */
    @Nullable 
    private List<String> webserviceEndpointAliases;

    /**
     * This parameter identifies the users to be exported.
     * The wildcard "*" selects all the users.
     * For example, a single user can be exported using the following request: GET /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54
     * Whereas, all the users can be exported using the following request: GET /rest/apigateway/archive?users=*
     */
    @Nullable 
    private List<String> users;

    /**
     * This parameter identifies the groups to be exported.
     * The wildcard "*" selects all the groups.
     * For example, a single group can be exported using the following request: GET /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48
     * Whereas, all the groups can be exported using the following request: GET /rest/apigateway/archive?groups=*
     */
    @Nullable 
    private List<String> groups;

    /**
     * This parameter identifies the teams to be exported.
     * The wildcard "*" selects all the teams.
     * For example, a single team can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48
     * Whereas, all the teams can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=*
     */
    @Nullable 
    private List<String> accessProfiles;

    /**
     * This parameter identifies the kerberos configuration to be exported. The kerberos configuration can be exported using the following request: GET /rest/apigateway/archive?kerberosSetting=kerberosSetting
     */
    @Nullable 
    private String kerberosSetting;

    /**
     * This parameter identifies the plans to be exported.
     * The wildcard "*" selects all the plans.
     * For example, a single plan can be exported using the following request: GET /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a
     * Whereas, all the plans can be exported using the following request: GET /rest/apigateway/archive?plans=*
     */
    @Nullable 
    private List<String> plans;

    /**
     * This parameter identifies the packages to be exported.
     * The wildcard "*" selects all the packages.
     * For example, a single package can be exported using the following request: GET /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c
     * Whereas, all the packages can be exported using the following request: GET /rest/apigateway/archive?packages=*
     */
    @Nullable 
    private List<String> packages;

    /**
     * This parameter identifies the portal configurations to be exported.
     * The wildcard "*" selects all portal configurations. For example, a single portal configuration can be exported using the following requrest: GET /rest/apigateway/archive?portalGateways=ae196583-d109-4e9e-b593-dd7b984fe8ca
     * Whereas, all the portal configurations can be exported using the following request: GET /rest/apigateway/archive?portalGateways=*
     */
    @Nullable 
    private List<String> portalGateways;

    /**
     * This parameter identifies the configurations to be exported.
     * The wildcard "*" selects all the configurations.
     * For example, a single configuration can be exported using the following request: GET /rest/apigateway/archive?configurations=loadBalancer,customContentTypes
     * Whereas, all the configurations can be exported using the following request: GET /rest/apigateway/archive?configurations=*
     */
    @Nullable 
    private List<String> configurations;

    /**
     * This parameter identifies the oauth scopes to be exported.
     * The wildcard "*" selects all the oauth scopes.
     * For example, a single oauth scope can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c
     * Whereas, all the oauth scopes can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=*
     */
    @Nullable 
    private List<String> gatewayScopes;

    /**
     * Constructs a validated instance of {@link ExportApiGatewayAssetsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExportApiGatewayAssetsOperationSpec(Consumer<ExportApiGatewayAssetsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ExportApiGatewayAssetsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param includeApplications  This parameter indicates whether you want to export the applications associated with the APIs
     * @param includeUsers         This parameter indicates whether you want to export users associated with the groups and/or with the password expiry settings
     * @param includeGroups        This parameter indicates whether you want to export groups associated with the teams
     * @param includeTruststores   This parameter indicates whether you want to export truststore alias associated with the email configuration
     * @param policies             This parameter identifies the policies to be exported. The wildcard "*" selects all the policies.  For example a single policy can be exported with its id using the following request: GET /rest/apigateway/archive?policies=07b8d7b7-20b7-422e-8464-4b19d405c41a  Whereas, all the policies can be exported using the following request: GET /rest/apigateway/archive?policies=*
     * @param apis                 This parameter identifies the APIs to be exported. The wildcard "*" selects all the APIs.  For example a single API can be exported using the following request: GET /rest/apigateway/archive?apis=e2996867-af49-4ac6-98e7-cba48837c13e  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?apis=*
     * @param aliases              This parameter identifies the aliases to be exported.  The wildcard "*" selects all aliases. For example, a single alias can be exported using the following requrest: GET /rest/apigateway/archive?aliases=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the APIs can be exported using the following request: GET /rest/apigateway/archive?alias=*
     * @param applications         This parameter identifies the applications to be exported.  The wildcard "*" selects all applications. For example, a single application can be exported using the following requrest: GET /rest/apigateway/archive?applications=d1885756-9e38-39b5-87d6-ba937726b02d  Whereas, all the applications can be exported using the following request: GET /rest/apigateway/archive?applications=*
     * @param policyActions        This parameter identifies the policy actions to be exported.  The wildcard "*" selects all policy actions. For example, a single policy action can be exported using the following request:  GET /rest/apigateway/archive?policyActions=20ca1e24-d6b2-430d-adf8-7a53a6cbaa53  Whereas, all the policy actions can be exported using the following request: GET /rest/apigateway/archive?policyActions=*
     * @param approvalConfigurations This parameter identifies the approval configurations to be exported.  The wildcard "*" selects all approval configurations. For example, a single approval configuration can be exported using the following request: GET /rest/apigateway/archive?approvalConfigurations=createApplication  Whereas, all the approval configurations can be exported using the following request:  GET /rest/apigateway/archive?approvalConfigurations=*
     * @param outboundProxies      This parameter identifies the outbound proxy aliases to be exported. outbound proxy aliases are identified with it's name. The wildcard "*" selects all the outbound proxy aliases.  For example a single outbound proxy alias can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=testOutboundProxyAlias  Whereas, all the outbound proxy aliases can be exported using the following request: GET /rest/apigateway/archive?outboundProxies=*
     * @param urlAliases           This parameter identifies the URL aliases to be exported. URL aliases are identified with it's name. The wildcard "*" selects all the URL aliases.  For example, a single URL alias can be exported using the following request: GET /rest/apigateway/archive?urlAliases=testUrlAlias  Whereas, all the URL aliases can be exported using the following request: GET /rest/apigateway/archive?testUrlAlias=*
     * @param keyStores            This parameter identifies the keystore aliases to be exported. Keystore aliases are identified with it's name. The wildcard "*" selects all the keystore aliases.  For example, a single keystore alias can be exported using the following request: GET /rest/apigateway/archive?keyStores=test_keystore  Whereas, all the keystore aliases can be exported using the following request: GET /rest/apigateway/archive?keyStores=*
     * @param trustStores          This parameter identifies the truststore aliases to be exported. Truststore aliases are identified with it's name. The wildcard "*" selects all the truststore aliases.  For example, a single truststore alias can be exported using the following request: GET /rest/apigateway/archive?trustStores=test_truststore  Whereas, all the truststore aliases can be exported using the following request: GET /rest/apigateway/archive?trustStores=*
     * @param jnDIProviderAliases  This parameter identifies the JNDI provider aliases to be exported. JNDI provider aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=test_jndiProviderAlias  Whereas, all the JNDI provider aliases can be exported using the following request: GET /rest/apigateway/archive?JNDIProviderAliases=*
     * @param jmSConnectionAliases This parameter identifies the JMS connection aliases to be exported. JMS connection aliases are identified with it's name. The wildcard "*" selects all the JNDI provider aliases.  For example, a single JNDI provider alias can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=test_jmsConnectionAlias  Whereas, all the JMS connection aliases can be exported using the following request: GET /rest/apigateway/archive?JMSConnectionAliases=*
     * @param jmSTriggers          This parameter identifies the JMS triggers to be exported. JMS triggers are identified with it's name. The wildcard "*" selects all the JMS triggers.  For example, a single JMS trigger can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=test_jmsTrigger  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?JMSTriggers=*
     * @param webserviceEndpointAliases This parameter identifies the 'web service endpoint' aliases to be exported. Web service endpoint aliases are identified with it's name. The wildcard "*" selects all the web service endpoint aliases.  For example, a single web service endpoint alias can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=test_wsEndpointAlias  Whereas, all the JMS triggers can be exported using the following request: GET /rest/apigateway/archive?webserviceEndpointAliases=*
     * @param users                This parameter identifies the users to be exported.  The wildcard "*" selects all the users.  For example, a single user can be exported using the following request: GET /rest/apigateway/archive?users=7a6d3d40-44d8-4ab1-83df-5be63cdbae54  Whereas, all the users can be exported using the following request: GET /rest/apigateway/archive?users=*
     * @param groups               This parameter identifies the groups to be exported.  The wildcard "*" selects all the groups.  For example, a single group can be exported using the following request: GET /rest/apigateway/archive?groups=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the groups can be exported using the following request: GET /rest/apigateway/archive?groups=*
     * @param accessProfiles       This parameter identifies the teams to be exported.  The wildcard "*" selects all the teams.  For example, a single team can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=d6b38ff8-59a8-47bf-9fba-0bdb24ee5b48  Whereas, all the teams can be exported using the following request: GET /rest/apigateway/archive?accessProfiles=*
     * @param kerberosSetting      This parameter identifies the kerberos configuration to be exported. The kerberos configuration can be exported using the following request: GET /rest/apigateway/archive?kerberosSetting=kerberosSetting
     * @param plans                This parameter identifies the plans to be exported.  The wildcard "*" selects all the plans.  For example, a single plan can be exported using the following request: GET /rest/apigateway/archive?plans=86d58023-be4b-4735-a08f-14e78131ce4a  Whereas, all the plans can be exported using the following request: GET /rest/apigateway/archive?plans=*
     * @param packages             This parameter identifies the packages to be exported.  The wildcard "*" selects all the packages.  For example, a single package can be exported using the following request: GET /rest/apigateway/archive?packages=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the packages can be exported using the following request: GET /rest/apigateway/archive?packages=*
     * @param portalGateways       This parameter identifies the portal configurations to be exported.  The wildcard "*" selects all portal configurations. For example, a single portal configuration can be exported using the following requrest: GET /rest/apigateway/archive?portalGateways=ae196583-d109-4e9e-b593-dd7b984fe8ca  Whereas, all the portal configurations can be exported using the following request: GET /rest/apigateway/archive?portalGateways=*
     * @param configurations       This parameter identifies the configurations to be exported.  The wildcard "*" selects all the configurations.  For example, a single configuration can be exported using the following request: GET /rest/apigateway/archive?configurations=loadBalancer,customContentTypes  Whereas, all the configurations can be exported using the following request: GET /rest/apigateway/archive?configurations=*
     * @param gatewayScopes        This parameter identifies the oauth scopes to be exported.  The wildcard "*" selects all the oauth scopes.  For example, a single oauth scope can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=73c93393-1477-4a99-9e44-c9b3e679de0c  Whereas, all the oauth scopes can be exported using the following request: GET /rest/apigateway/archive?gatewayScopes=*
     */
    @ApiStatus.Internal
    public ExportApiGatewayAssetsOperationSpec(String includeApplications, String includeUsers, String includeGroups, String includeTruststores, List<String> policies, List<String> apis, List<String> aliases, List<String> applications, List<String> policyActions, List<String> approvalConfigurations, List<String> outboundProxies, List<String> urlAliases, List<String> keyStores, List<String> trustStores, List<String> jnDIProviderAliases, List<String> jmSConnectionAliases, List<String> jmSTriggers, List<String> webserviceEndpointAliases, List<String> users, List<String> groups, List<String> accessProfiles, String kerberosSetting, List<String> plans, List<String> packages, List<String> portalGateways, List<String> configurations, List<String> gatewayScopes) {
        this.includeApplications = includeApplications;
        this.includeUsers = includeUsers;
        this.includeGroups = includeGroups;
        this.includeTruststores = includeTruststores;
        this.policies = policies;
        this.apis = apis;
        this.aliases = aliases;
        this.applications = applications;
        this.policyActions = policyActions;
        this.approvalConfigurations = approvalConfigurations;
        this.outboundProxies = outboundProxies;
        this.urlAliases = urlAliases;
        this.keyStores = keyStores;
        this.trustStores = trustStores;
        this.jnDIProviderAliases = jnDIProviderAliases;
        this.jmSConnectionAliases = jmSConnectionAliases;
        this.jmSTriggers = jmSTriggers;
        this.webserviceEndpointAliases = webserviceEndpointAliases;
        this.users = users;
        this.groups = groups;
        this.accessProfiles = accessProfiles;
        this.kerberosSetting = kerberosSetting;
        this.plans = plans;
        this.packages = packages;
        this.portalGateways = portalGateways;
        this.configurations = configurations;
        this.gatewayScopes = gatewayScopes;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}

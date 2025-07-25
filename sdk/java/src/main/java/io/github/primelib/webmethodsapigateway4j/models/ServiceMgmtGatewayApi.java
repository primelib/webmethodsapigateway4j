// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtGatewayApi
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtGatewayApi")
@JsonPropertyOrder({
    "apiDefinition",
    "apiDescription",
    "apiDocuments",
    "apiEndpointPrefix",
    "apiGroups",
    "apiName",
    "apiVersion",
    "appMeshEndpoints",
    "centraSiteUrl",
    "creationDate",
    "deployments",
    "gatewayEndpoints",
    "id",
    "isActive",
    "k8SIdentifiers",
    "lastModified",
    "maturityState",
    "microgatewayEndpoints",
    "mockService",
    "nativeEndpoint",
    "nextVersion",
    "oauth2ScopeName",
    "owner",
    "policies",
    "portalApiItemIdentifier",
    "prevVersion",
    "provider",
    "publishedPortals",
    "publishedToRegistry",
    "rootFileName",
    "scopes",
    "systemVersion",
    "tracingEnabled",
    "type"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtGatewayApi {

    @JsonProperty("apiDefinition")
    protected ServiceMgmtApi apiDefinition;

    @JsonProperty("apiDescription")
    protected String apiDescription;

    @JsonProperty("apiDocuments")
    protected List<String> apiDocuments;

    @JsonProperty("apiEndpointPrefix")
    protected String apiEndpointPrefix;

    @JsonProperty("apiGroups")
    protected List<String> apiGroups;

    @JsonProperty("apiName")
    protected String apiName;

    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("appMeshEndpoints")
    protected List<String> appMeshEndpoints;

    @JsonProperty("centraSiteURL")
    protected String centraSiteUrl;

    @JsonProperty("creationDate")
    protected String creationDate;

    @JsonProperty("deployments")
    protected List<String> deployments;

    @JsonProperty("gatewayEndpoints")
    protected Map<String, String> gatewayEndpoints;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("isActive")
    protected Boolean isActive;

    @JsonProperty("k8sIdentifiers")
    protected Map<String, String> k8SIdentifiers;

    @JsonProperty("lastModified")
    protected String lastModified;

    @JsonProperty("maturityState")
    protected String maturityState;

    @JsonProperty("microgatewayEndpoints")
    protected List<ServiceMgmtEndpointInfo> microgatewayEndpoints;

    @JsonProperty("mockService")
    protected ServiceMgmtMockService mockService;

    @JsonProperty("nativeEndpoint")
    protected List<ServiceMgmtEndpoint> nativeEndpoint;

    @JsonProperty("nextVersion")
    protected String nextVersion;

    @JsonProperty("oauth2ScopeName")
    protected String oauth2ScopeName;

    @JsonProperty("owner")
    protected String owner;

    @JsonProperty("policies")
    protected List<String> policies;

    @JsonProperty("portalApiItemIdentifier")
    protected String portalApiItemIdentifier;

    @JsonProperty("prevVersion")
    protected String prevVersion;

    @JsonProperty("provider")
    protected String provider;

    @JsonProperty("publishedPortals")
    protected List<String> publishedPortals;

    @JsonProperty("publishedToRegistry")
    protected Boolean publishedToRegistry;

    @JsonProperty("rootFileName")
    protected String rootFileName;

    @JsonProperty("scopes")
    protected List<ServiceMgmtScope> scopes;

    @JsonProperty("systemVersion")
    protected Integer systemVersion;

    @JsonProperty("tracingEnabled")
    protected Boolean tracingEnabled;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ServiceMgmtGatewayApi}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtGatewayApi(Consumer<ServiceMgmtGatewayApi> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtGatewayApi}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtGatewayApi(Consumer)} instead.
     * @param apiDefinition apiDefinition
     * @param apiDescription apiDescription
     * @param apiDocuments apiDocuments
     * @param apiEndpointPrefix apiEndpointPrefix
     * @param apiGroups apiGroups
     * @param apiName apiName
     * @param apiVersion apiVersion
     * @param appMeshEndpoints appMeshEndpoints
     * @param centraSiteUrl centraSiteUrl
     * @param creationDate creationDate
     * @param deployments deployments
     * @param gatewayEndpoints gatewayEndpoints
     * @param id id
     * @param isActive isActive
     * @param k8SIdentifiers k8SIdentifiers
     * @param lastModified lastModified
     * @param maturityState maturityState
     * @param microgatewayEndpoints microgatewayEndpoints
     * @param mockService mockService
     * @param nativeEndpoint nativeEndpoint
     * @param nextVersion nextVersion
     * @param oauth2ScopeName oauth2ScopeName
     * @param owner owner
     * @param policies policies
     * @param portalApiItemIdentifier portalApiItemIdentifier
     * @param prevVersion prevVersion
     * @param provider provider
     * @param publishedPortals publishedPortals
     * @param publishedToRegistry publishedToRegistry
     * @param rootFileName rootFileName
     * @param scopes scopes
     * @param systemVersion systemVersion
     * @param tracingEnabled tracingEnabled
     * @param type type
     */
    @ApiStatus.Internal
    public ServiceMgmtGatewayApi(ServiceMgmtApi apiDefinition, String apiDescription, List<String> apiDocuments, String apiEndpointPrefix, List<String> apiGroups, String apiName, String apiVersion, List<String> appMeshEndpoints, String centraSiteUrl, String creationDate, List<String> deployments, Map<String, String> gatewayEndpoints, String id, Boolean isActive, Map<String, String> k8SIdentifiers, String lastModified, String maturityState, List<ServiceMgmtEndpointInfo> microgatewayEndpoints, ServiceMgmtMockService mockService, List<ServiceMgmtEndpoint> nativeEndpoint, String nextVersion, String oauth2ScopeName, String owner, List<String> policies, String portalApiItemIdentifier, String prevVersion, String provider, List<String> publishedPortals, Boolean publishedToRegistry, String rootFileName, List<ServiceMgmtScope> scopes, Integer systemVersion, Boolean tracingEnabled, String type) {
        this.apiDefinition = apiDefinition;
        this.apiDescription = apiDescription;
        this.apiDocuments = apiDocuments;
        this.apiEndpointPrefix = apiEndpointPrefix;
        this.apiGroups = apiGroups;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.appMeshEndpoints = appMeshEndpoints;
        this.centraSiteUrl = centraSiteUrl;
        this.creationDate = creationDate;
        this.deployments = deployments;
        this.gatewayEndpoints = gatewayEndpoints;
        this.id = id;
        this.isActive = isActive;
        this.k8SIdentifiers = k8SIdentifiers;
        this.lastModified = lastModified;
        this.maturityState = maturityState;
        this.microgatewayEndpoints = microgatewayEndpoints;
        this.mockService = mockService;
        this.nativeEndpoint = nativeEndpoint;
        this.nextVersion = nextVersion;
        this.oauth2ScopeName = oauth2ScopeName;
        this.owner = owner;
        this.policies = policies;
        this.portalApiItemIdentifier = portalApiItemIdentifier;
        this.prevVersion = prevVersion;
        this.provider = provider;
        this.publishedPortals = publishedPortals;
        this.publishedToRegistry = publishedToRegistry;
        this.rootFileName = rootFileName;
        this.scopes = scopes;
        this.systemVersion = systemVersion;
        this.tracingEnabled = tracingEnabled;
        this.type = type;
    }
}

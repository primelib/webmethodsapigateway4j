package io.github.primelib.webmethodsapigateway4j.model;

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GatewayAPI
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
    "apiDefinition",
    "apiDescription",
    "apiDocuments",
    "apiEndpointPrefix",
    "apiGroups",
    "apiName",
    "apiVersion",
    "appMeshEndpoints",
    "centraSiteURL",
    "creationDate",
    "deployments",
    "gatewayEndpoints",
    "id",
    "isActive",
    "k8sIdentifiers",
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
@JsonTypeName("GatewayAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayAPI {

    @JsonProperty("apiDefinition")
    protected API apiDefinition;

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
    protected String centraSiteURL;

    @JsonProperty("creationDate")
    protected String creationDate;

    @JsonProperty("deployments")
    protected List<DeploymentsEnum> deployments;

    @JsonProperty("gatewayEndpoints")
    protected Map<String, String> gatewayEndpoints;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("isActive")
    protected Boolean isActive;

    @JsonProperty("k8sIdentifiers")
    protected Map<String, String> k8sIdentifiers;

    @JsonProperty("lastModified")
    protected String lastModified;

    @JsonProperty("maturityState")
    protected String maturityState;

    @JsonProperty("microgatewayEndpoints")
    protected List<EndpointInfo> microgatewayEndpoints;

    @JsonProperty("mockService")
    protected MockService mockService;

    @JsonProperty("nativeEndpoint")
    protected Set<Endpoint> nativeEndpoint;

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
    protected List<Scope> scopes;

    @JsonProperty("systemVersion")
    protected Integer systemVersion;

    @JsonProperty("tracingEnabled")
    protected Boolean tracingEnabled;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link GatewayAPI}.
     *
     * @param spec the specification to process
     */
    public GatewayAPI(Consumer<GatewayAPI> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewayAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewayAPI(Consumer)} instead.
     * @param apiDefinition var.name
     * @param apiDescription var.name
     * @param apiDocuments var.name
     * @param apiEndpointPrefix var.name
     * @param apiGroups var.name
     * @param apiName var.name
     * @param apiVersion var.name
     * @param appMeshEndpoints var.name
     * @param centraSiteURL var.name
     * @param creationDate var.name
     * @param deployments var.name
     * @param gatewayEndpoints var.name
     * @param id var.name
     * @param isActive var.name
     * @param k8sIdentifiers var.name
     * @param lastModified var.name
     * @param maturityState var.name
     * @param microgatewayEndpoints var.name
     * @param mockService var.name
     * @param nativeEndpoint var.name
     * @param nextVersion var.name
     * @param oauth2ScopeName var.name
     * @param owner var.name
     * @param policies var.name
     * @param portalApiItemIdentifier var.name
     * @param prevVersion var.name
     * @param provider var.name
     * @param publishedPortals var.name
     * @param publishedToRegistry var.name
     * @param rootFileName var.name
     * @param scopes var.name
     * @param systemVersion var.name
     * @param tracingEnabled var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public GatewayAPI(API apiDefinition, String apiDescription, List<String> apiDocuments, String apiEndpointPrefix, List<String> apiGroups, String apiName, String apiVersion, List<String> appMeshEndpoints, String centraSiteURL, String creationDate, List<DeploymentsEnum> deployments, Map<String, String> gatewayEndpoints, String id, Boolean isActive, Map<String, String> k8sIdentifiers, String lastModified, String maturityState, List<EndpointInfo> microgatewayEndpoints, MockService mockService, Set<Endpoint> nativeEndpoint, String nextVersion, String oauth2ScopeName, String owner, List<String> policies, String portalApiItemIdentifier, String prevVersion, String provider, List<String> publishedPortals, Boolean publishedToRegistry, String rootFileName, List<Scope> scopes, Integer systemVersion, Boolean tracingEnabled, String type) {
        this.apiDefinition = apiDefinition;
        this.apiDescription = apiDescription;
        this.apiDocuments = apiDocuments;
        this.apiEndpointPrefix = apiEndpointPrefix;
        this.apiGroups = apiGroups;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.appMeshEndpoints = appMeshEndpoints;
        this.centraSiteURL = centraSiteURL;
        this.creationDate = creationDate;
        this.deployments = deployments;
        this.gatewayEndpoints = gatewayEndpoints;
        this.id = id;
        this.isActive = isActive;
        this.k8sIdentifiers = k8sIdentifiers;
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

    @AllArgsConstructor
    public enum DeploymentsEnum {
        APIGATEWAY("APIGateway"),
        MICROGATEWAY("Microgateway"),
        MICROGATEWAYPROXY("MicrogatewayProxy"),
        APPMESH("AppMesh");

        private static final DeploymentsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DeploymentsEnum of(String input) {
            if (input != null) {
                for (DeploymentsEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

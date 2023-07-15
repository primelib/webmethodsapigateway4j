package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link GatewayAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewayAPI(Consumer<GatewayAPI> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> gatewayEndpoints = new HashMap<>();

    @JsonProperty("id")
    protected String id;

    @JsonProperty("isActive")
    protected Boolean isActive;

    @JsonProperty("k8sIdentifiers")
    protected Map<String, String> k8sIdentifiers = new HashMap<>();

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


    @AllArgsConstructor
    public enum DeploymentsEnum {
        APIGATEWAY("APIGateway"),
        MICROGATEWAY("Microgateway"),
        MICROGATEWAYPROXY("MicrogatewayProxy"),
        APPMESH("AppMesh");

        private final String value;
    }

}

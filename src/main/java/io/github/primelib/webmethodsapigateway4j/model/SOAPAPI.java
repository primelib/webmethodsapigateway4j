package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPAPI
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "algorithmSuite",
    "apiTags",
    "baseWsdlUri",
    "isRESTInvokeEnabled",
    "nativeUri",
    "operationPolicies",
    "operationsInfo",
    "rootFileFolder",
    "serviceName",
    "serviceRegistryDisplayName",
    "soapToRestConfigurations",
    "tags",
    "wsdl"
})
@JsonTypeName("SOAPAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPAPI extends API {

    @JsonProperty("algorithmSuite")
    protected String algorithmSuite;

    /**
     * A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     */
    @JsonProperty("apiTags")
    protected List<String> apiTags;

    @JsonProperty("baseWsdlUri")
    protected String baseWsdlUri;

    @JsonProperty("isRESTInvokeEnabled")
    protected Boolean isRESTInvokeEnabled;

    @JsonProperty("nativeUri")
    protected Set<String> nativeUri;

    @JsonProperty("operationPolicies")
    protected Map<String, String> operationPolicies;

    @JsonProperty("operationsInfo")
    protected Set<SOAPOperation> operationsInfo;

    @JsonProperty("rootFileFolder")
    protected String rootFileFolder;

    @JsonProperty("serviceName")
    protected String serviceName;

    /**
     * The name of the API in service registry when the API is published to a service registry.
     */
    @JsonProperty("serviceRegistryDisplayName")
    protected String serviceRegistryDisplayName;

    @JsonProperty("soapToRestConfigurations")
    protected SOAPToRestConfigurations soapToRestConfigurations;

    /**
     * A list of tags with additional metadata
     */
    @JsonProperty("tags")
    protected List<Tag> tags;

    @JsonProperty("wsdl")
    protected String wsdl;

    /**
     * Constructs a validated instance of {@link SOAPAPI}.
     *
     * @param spec the specification to process
     */
    public SOAPAPI(Consumer<SOAPAPI> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPAPI(Consumer)} instead.
     * @param algorithmSuite algorithmSuite
     * @param apiTags A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     * @param baseWsdlUri baseWsdlUri
     * @param isRESTInvokeEnabled isRESTInvokeEnabled
     * @param nativeUri nativeUri
     * @param operationPolicies operationPolicies
     * @param operationsInfo operationsInfo
     * @param rootFileFolder rootFileFolder
     * @param serviceName serviceName
     * @param serviceRegistryDisplayName The name of the API in service registry when the API is published to a service registry.
     * @param soapToRestConfigurations soapToRestConfigurations
     * @param tags A list of tags with additional metadata
     * @param wsdl wsdl
     */
    @ApiStatus.Internal
    public SOAPAPI(String algorithmSuite, List<String> apiTags, String baseWsdlUri, Boolean isRESTInvokeEnabled, Set<String> nativeUri, Map<String, String> operationPolicies, Set<SOAPOperation> operationsInfo, String rootFileFolder, String serviceName, String serviceRegistryDisplayName, SOAPToRestConfigurations soapToRestConfigurations, List<Tag> tags, String wsdl) {
        this.algorithmSuite = algorithmSuite;
        this.apiTags = apiTags;
        this.baseWsdlUri = baseWsdlUri;
        this.isRESTInvokeEnabled = isRESTInvokeEnabled;
        this.nativeUri = nativeUri;
        this.operationPolicies = operationPolicies;
        this.operationsInfo = operationsInfo;
        this.rootFileFolder = rootFileFolder;
        this.serviceName = serviceName;
        this.serviceRegistryDisplayName = serviceRegistryDisplayName;
        this.soapToRestConfigurations = soapToRestConfigurations;
        this.tags = tags;
        this.wsdl = wsdl;
    }

}

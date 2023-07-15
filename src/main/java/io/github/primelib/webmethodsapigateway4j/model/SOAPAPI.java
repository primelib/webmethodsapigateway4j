package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * SOAPAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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

    /**
     * Constructs a validated implementation of {@link SOAPAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SOAPAPI(Consumer<SOAPAPI> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> operationPolicies = new HashMap<>();

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


}

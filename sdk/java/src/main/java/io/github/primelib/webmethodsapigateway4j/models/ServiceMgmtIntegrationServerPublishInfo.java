// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
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
 * ServiceMgmtIntegrationServerPublishInfo
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtIntegrationServerPublishInfo")
@JsonPropertyOrder({
    "apiName",
    "contentModelComplianceForWsdl",
    "enableMtom",
    "enforceWsicompliance",
    "folderName",
    "importSwaggerBasedOnTags",
    "integrationServerId",
    "integrationServerName",
    "packageAndFolders",
    "packageName",
    "skipCustomScalarTypes",
    "status",
    "updateNativeEndpointsOfApi",
    "validateSchemaWithXerces"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtIntegrationServerPublishInfo {

    @JsonProperty("apiName")
    protected String apiName;

    @JsonProperty("contentModelComplianceForWSDL")
    protected String contentModelComplianceForWsdl;

    @JsonProperty("enableMTOM")
    protected Boolean enableMtom;

    @JsonProperty("enforceWSICompliance")
    protected Boolean enforceWsicompliance;

    /**
     * Name of the folder under the package (mentioned on 'packageName' property) in which the API to be published. This field is required.
     */
    @JsonProperty("folderName")
    protected String folderName;

    @JsonProperty("importSwaggerBasedOnTags")
    protected Boolean importSwaggerBasedOnTags;

    /**
     * Uddi key of the integration server created in API Gateway. This field is required.
     */
    @JsonProperty("integrationServerId")
    protected String integrationServerId;

    @JsonProperty("integrationServerName")
    protected String integrationServerName;

    @JsonProperty("packageAndFolders")
    protected List<ServiceMgmtPackageFolderPair> packageAndFolders;

    /**
     * Name of the package in the integration server in which the API to be published. This field is required.
     */
    @JsonProperty("packageName")
    protected String packageName;

    @JsonProperty("skipCustomScalarTypes")
    protected Boolean skipCustomScalarTypes;

    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @JsonProperty("status")
    protected String status;

    @JsonProperty("updateNativeEndpointsOfAPI")
    protected Boolean updateNativeEndpointsOfApi;

    @JsonProperty("validateSchemaWithXerces")
    protected Boolean validateSchemaWithXerces;

    /**
     * Constructs a validated instance of {@link ServiceMgmtIntegrationServerPublishInfo}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtIntegrationServerPublishInfo(Consumer<ServiceMgmtIntegrationServerPublishInfo> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtIntegrationServerPublishInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtIntegrationServerPublishInfo(Consumer)} instead.
     * @param apiName apiName
     * @param contentModelComplianceForWsdl contentModelComplianceForWsdl
     * @param enableMtom enableMtom
     * @param enforceWsicompliance enforceWsicompliance
     * @param folderName Name of the folder under the package (mentioned on 'packageName' property) in which the API to be published. This field is required.
     * @param importSwaggerBasedOnTags importSwaggerBasedOnTags
     * @param integrationServerId Uddi key of the integration server created in API Gateway. This field is required.
     * @param integrationServerName integrationServerName
     * @param packageAndFolders packageAndFolders
     * @param packageName Name of the package in the integration server in which the API to be published. This field is required.
     * @param skipCustomScalarTypes skipCustomScalarTypes
     * @param status Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     * @param updateNativeEndpointsOfApi updateNativeEndpointsOfApi
     * @param validateSchemaWithXerces validateSchemaWithXerces
     */
    @ApiStatus.Internal
    public ServiceMgmtIntegrationServerPublishInfo(String apiName, String contentModelComplianceForWsdl, Boolean enableMtom, Boolean enforceWsicompliance, String folderName, Boolean importSwaggerBasedOnTags, String integrationServerId, String integrationServerName, List<ServiceMgmtPackageFolderPair> packageAndFolders, String packageName, Boolean skipCustomScalarTypes, String status, Boolean updateNativeEndpointsOfApi, Boolean validateSchemaWithXerces) {
        this.apiName = apiName;
        this.contentModelComplianceForWsdl = contentModelComplianceForWsdl;
        this.enableMtom = enableMtom;
        this.enforceWsicompliance = enforceWsicompliance;
        this.folderName = folderName;
        this.importSwaggerBasedOnTags = importSwaggerBasedOnTags;
        this.integrationServerId = integrationServerId;
        this.integrationServerName = integrationServerName;
        this.packageAndFolders = packageAndFolders;
        this.packageName = packageName;
        this.skipCustomScalarTypes = skipCustomScalarTypes;
        this.status = status;
        this.updateNativeEndpointsOfApi = updateNativeEndpointsOfApi;
        this.validateSchemaWithXerces = validateSchemaWithXerces;
    }
}

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IntegrationServerPublishInfo
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
    "apiName",
    "contentModelComplianceForWSDL",
    "enableMTOM",
    "enforceWSICompliance",
    "folderName",
    "importSwaggerBasedOnTags",
    "integrationServerId",
    "integrationServerName",
    "packageAndFolders",
    "packageName",
    "skipCustomScalarTypes",
    "status",
    "updateNativeEndpointsOfAPI",
    "validateSchemaWithXerces"
})
@JsonTypeName("IntegrationServerPublishInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegrationServerPublishInfo {

    @JsonProperty("apiName")
    protected String apiName;

    @JsonProperty("contentModelComplianceForWSDL")
    protected String contentModelComplianceForWSDL;

    @JsonProperty("enableMTOM")
    protected Boolean enableMTOM;

    @JsonProperty("enforceWSICompliance")
    protected Boolean enforceWSICompliance;

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
    protected List<PackageFolderPair> packageAndFolders;

    /**
     * Name of the package in the integration server in which the API to be published. This field is required.
     */
    @JsonProperty("packageName")
    protected String packageName;

    @JsonProperty("skipCustomScalarTypes")
    protected Boolean skipCustomScalarTypes;

    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("updateNativeEndpointsOfAPI")
    protected Boolean updateNativeEndpointsOfAPI;

    @JsonProperty("validateSchemaWithXerces")
    protected Boolean validateSchemaWithXerces;

    /**
     * Constructs a validated instance of {@link IntegrationServerPublishInfo}.
     *
     * @param spec the specification to process
     */
    public IntegrationServerPublishInfo(Consumer<IntegrationServerPublishInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IntegrationServerPublishInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IntegrationServerPublishInfo(Consumer)} instead.
     * @param apiName apiName
     * @param contentModelComplianceForWSDL contentModelComplianceForWSDL
     * @param enableMTOM enableMTOM
     * @param enforceWSICompliance enforceWSICompliance
     * @param folderName Name of the folder under the package (mentioned on 'packageName' property) in which the API to be published. This field is required.
     * @param importSwaggerBasedOnTags importSwaggerBasedOnTags
     * @param integrationServerId Uddi key of the integration server created in API Gateway. This field is required.
     * @param integrationServerName integrationServerName
     * @param packageAndFolders packageAndFolders
     * @param packageName Name of the package in the integration server in which the API to be published. This field is required.
     * @param skipCustomScalarTypes skipCustomScalarTypes
     * @param status status
     * @param updateNativeEndpointsOfAPI updateNativeEndpointsOfAPI
     * @param validateSchemaWithXerces validateSchemaWithXerces
     */
    @ApiStatus.Internal
    public IntegrationServerPublishInfo(String apiName, String contentModelComplianceForWSDL, Boolean enableMTOM, Boolean enforceWSICompliance, String folderName, Boolean importSwaggerBasedOnTags, String integrationServerId, String integrationServerName, List<PackageFolderPair> packageAndFolders, String packageName, Boolean skipCustomScalarTypes, StatusEnum status, Boolean updateNativeEndpointsOfAPI, Boolean validateSchemaWithXerces) {
        this.apiName = apiName;
        this.contentModelComplianceForWSDL = contentModelComplianceForWSDL;
        this.enableMTOM = enableMTOM;
        this.enforceWSICompliance = enforceWSICompliance;
        this.folderName = folderName;
        this.importSwaggerBasedOnTags = importSwaggerBasedOnTags;
        this.integrationServerId = integrationServerId;
        this.integrationServerName = integrationServerName;
        this.packageAndFolders = packageAndFolders;
        this.packageName = packageName;
        this.skipCustomScalarTypes = skipCustomScalarTypes;
        this.status = status;
        this.updateNativeEndpointsOfAPI = updateNativeEndpointsOfAPI;
        this.validateSchemaWithXerces = validateSchemaWithXerces;
    }

    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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

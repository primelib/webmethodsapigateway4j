package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationServerPublishInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link IntegrationServerPublishInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IntegrationServerPublishInfo(Consumer<IntegrationServerPublishInfo> spec) {
        spec.accept(this);
    }

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


    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}

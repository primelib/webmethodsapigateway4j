package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportExportAPIGatewayAssetsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "zipFile"
})
@JsonTypeName("importExportAPIGatewayAssets_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportExportAPIGatewayAssetsRequest {

    /**
     * Constructs a validated implementation of {@link ImportExportAPIGatewayAssetsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImportExportAPIGatewayAssetsRequest(Consumer<ImportExportAPIGatewayAssetsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Zip file that contains the API Gateway asset needs to be imported
     */
    @JsonProperty("zipFile")
    protected File zipFile;


}

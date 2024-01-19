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
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportExportAPIGatewayAssetsRequest
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
    "zipFile"
})
@JsonTypeName("importExportAPIGatewayAssets_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportExportAPIGatewayAssetsRequest {

    /**
     * Zip file that contains the API Gateway asset needs to be imported
     */
    @JsonProperty("zipFile")
    protected File zipFile;

    /**
     * Constructs a validated instance of {@link ImportExportAPIGatewayAssetsRequest}.
     *
     * @param spec the specification to process
     */
    public ImportExportAPIGatewayAssetsRequest(Consumer<ImportExportAPIGatewayAssetsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImportExportAPIGatewayAssetsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImportExportAPIGatewayAssetsRequest(Consumer)} instead.
     * @param zipFile Zip file that contains the API Gateway asset needs to be imported
     */
    @ApiStatus.Internal
    public ImportExportAPIGatewayAssetsRequest(File zipFile) {
        this.zipFile = zipFile;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LicenseDetail
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "API Gateway",
    "Sales Information",
    "integrationServer",
    "licenseInformation",
    "productInformation"
})
@JsonTypeName("LicenseDetail")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicenseDetail {

    /**
     * Constructs a validated implementation of {@link LicenseDetail}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LicenseDetail(Consumer<LicenseDetail> spec) {
        spec.accept(this);
    }

    @JsonProperty("API Gateway")
    protected APIGateway apIGateway;

    @JsonProperty("Sales Information")
    protected SalesInformation salesInformation;

    @JsonProperty("integrationServer")
    protected IntegrationServer integrationServer;

    @JsonProperty("licenseInformation")
    protected LicenseInformation licenseInformation;

    @JsonProperty("productInformation")
    protected ProductInformation productInformation;


}

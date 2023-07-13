package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LicenseDetail
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonProperty("API Gateway")
    private APIGateway apIGateway;

    @JsonProperty("Sales Information")
    private SalesInformation salesInformation;

    @JsonProperty("integrationServer")
    private IntegrationServer integrationServer;

    @JsonProperty("licenseInformation")
    private LicenseInformation licenseInformation;

    @JsonProperty("productInformation")
    private ProductInformation productInformation;


}

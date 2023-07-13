package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LicenseInformation
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "ExtendedRights",
    "LicenseType",
    "LicenseVersion",
    "Metering",
    "Price Quantity",
    "Price Unit",
    "TypeOfInstallation"
})
@JsonTypeName("LicenseInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicenseInformation {

    @JsonProperty("ExtendedRights")
    private String extendedRights;

    @JsonProperty("LicenseType")
    private String licenseType;

    @JsonProperty("LicenseVersion")
    private String licenseVersion;

    @JsonProperty("Metering")
    private String metering;

    @JsonProperty("Price Quantity")
    private String priceQuantity;

    @JsonProperty("Price Unit")
    private String priceUnit;

    @JsonProperty("TypeOfInstallation")
    private String typeOfInstallation;


}

package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SalesInformation
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "AutoCallHome",
    "ContractDetails",
    "ContractPosNumber",
    "Customer ID",
    "Customer Name",
    "License Key",
    "License Type Details",
    "Serial Number"
})
@JsonTypeName("SalesInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SalesInformation {

    @JsonProperty("AutoCallHome")
    private String autoCallHome;

    @JsonProperty("ContractDetails")
    private String contractDetails;

    @JsonProperty("ContractPosNumber")
    private String contractPosNumber;

    @JsonProperty("Customer ID")
    private String customerID;

    @JsonProperty("Customer Name")
    private String customerName;

    @JsonProperty("License Key")
    private String licenseKey;

    @JsonProperty("License Type Details")
    private String licenseTypeDetails;

    @JsonProperty("Serial Number")
    private String serialNumber;


}

package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProductInformation
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "Expiration Date",
    "HigherLevPosNr",
    "HigherLevProdCode",
    "HigherLevProdName",
    "Operating System",
    "Product Code",
    "Product ID",
    "Product Name",
    "Product Version",
    "RenewalDate",
    "Usage"
})
@JsonTypeName("ProductInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProductInformation {

    @JsonProperty("Expiration Date")
    private String expirationDate;

    @JsonProperty("HigherLevPosNr")
    private String higherLevPosNr;

    @JsonProperty("HigherLevProdCode")
    private String higherLevProdCode;

    @JsonProperty("HigherLevProdName")
    private String higherLevProdName;

    @JsonProperty("Operating System")
    private String operatingSystem;

    @JsonProperty("Product Code")
    private String productCode;

    @JsonProperty("Product ID")
    private String productID;

    @JsonProperty("Product Name")
    private String productName;

    @JsonProperty("Product Version")
    private String productVersion;

    @JsonProperty("RenewalDate")
    private String renewalDate;

    @JsonProperty("Usage")
    private String usage;


}

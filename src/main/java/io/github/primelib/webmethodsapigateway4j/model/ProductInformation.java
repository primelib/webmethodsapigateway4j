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
 * ProductInformation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ProductInformation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProductInformation(Consumer<ProductInformation> spec) {
        spec.accept(this);
    }

    @JsonProperty("Expiration Date")
    protected String expirationDate;

    @JsonProperty("HigherLevPosNr")
    protected String higherLevPosNr;

    @JsonProperty("HigherLevProdCode")
    protected String higherLevProdCode;

    @JsonProperty("HigherLevProdName")
    protected String higherLevProdName;

    @JsonProperty("Operating System")
    protected String operatingSystem;

    @JsonProperty("Product Code")
    protected String productCode;

    @JsonProperty("Product ID")
    protected String productID;

    @JsonProperty("Product Name")
    protected String productName;

    @JsonProperty("Product Version")
    protected String productVersion;

    @JsonProperty("RenewalDate")
    protected String renewalDate;

    @JsonProperty("Usage")
    protected String usage;


}

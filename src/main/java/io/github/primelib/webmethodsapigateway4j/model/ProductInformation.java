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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProductInformation
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

    /**
     * Constructs a validated instance of {@link ProductInformation}.
     *
     * @param spec the specification to process
     */
    public ProductInformation(Consumer<ProductInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProductInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProductInformation(Consumer)} instead.
     * @param expirationDate expirationDate
     * @param higherLevPosNr higherLevPosNr
     * @param higherLevProdCode higherLevProdCode
     * @param higherLevProdName higherLevProdName
     * @param operatingSystem operatingSystem
     * @param productCode productCode
     * @param productID productID
     * @param productName productName
     * @param productVersion productVersion
     * @param renewalDate renewalDate
     * @param usage usage
     */
    @ApiStatus.Internal
    public ProductInformation(String expirationDate, String higherLevPosNr, String higherLevProdCode, String higherLevProdName, String operatingSystem, String productCode, String productID, String productName, String productVersion, String renewalDate, String usage) {
        this.expirationDate = expirationDate;
        this.higherLevPosNr = higherLevPosNr;
        this.higherLevProdCode = higherLevProdCode;
        this.higherLevProdName = higherLevProdName;
        this.operatingSystem = operatingSystem;
        this.productCode = productCode;
        this.productID = productID;
        this.productName = productName;
        this.productVersion = productVersion;
        this.renewalDate = renewalDate;
        this.usage = usage;
    }

}

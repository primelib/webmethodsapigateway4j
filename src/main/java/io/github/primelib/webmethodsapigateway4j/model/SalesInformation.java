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
 * SalesInformation
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
    protected String autoCallHome;

    @JsonProperty("ContractDetails")
    protected String contractDetails;

    @JsonProperty("ContractPosNumber")
    protected String contractPosNumber;

    @JsonProperty("Customer ID")
    protected String customerID;

    @JsonProperty("Customer Name")
    protected String customerName;

    @JsonProperty("License Key")
    protected String licenseKey;

    @JsonProperty("License Type Details")
    protected String licenseTypeDetails;

    @JsonProperty("Serial Number")
    protected String serialNumber;

    /**
     * Constructs a validated instance of {@link SalesInformation}.
     *
     * @param spec the specification to process
     */
    public SalesInformation(Consumer<SalesInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SalesInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SalesInformation(Consumer)} instead.
     * @param autoCallHome var.name
     * @param contractDetails var.name
     * @param contractPosNumber var.name
     * @param customerID var.name
     * @param customerName var.name
     * @param licenseKey var.name
     * @param licenseTypeDetails var.name
     * @param serialNumber var.name
     */
    @ApiStatus.Internal
    public SalesInformation(String autoCallHome, String contractDetails, String contractPosNumber, String customerID, String customerName, String licenseKey, String licenseTypeDetails, String serialNumber) {
        this.autoCallHome = autoCallHome;
        this.contractDetails = contractDetails;
        this.contractPosNumber = contractPosNumber;
        this.customerID = customerID;
        this.customerName = customerName;
        this.licenseKey = licenseKey;
        this.licenseTypeDetails = licenseTypeDetails;
        this.serialNumber = serialNumber;
    }

}

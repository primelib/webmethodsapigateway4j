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
 * SalesInformation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link SalesInformation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SalesInformation(Consumer<SalesInformation> spec) {
        spec.accept(this);
    }

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


}

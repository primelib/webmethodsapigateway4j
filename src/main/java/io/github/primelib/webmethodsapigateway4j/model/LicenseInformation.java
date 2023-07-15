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
 * LicenseInformation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link LicenseInformation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LicenseInformation(Consumer<LicenseInformation> spec) {
        spec.accept(this);
    }

    @JsonProperty("ExtendedRights")
    protected String extendedRights;

    @JsonProperty("LicenseType")
    protected String licenseType;

    @JsonProperty("LicenseVersion")
    protected String licenseVersion;

    @JsonProperty("Metering")
    protected String metering;

    @JsonProperty("Price Quantity")
    protected String priceQuantity;

    @JsonProperty("Price Unit")
    protected String priceUnit;

    @JsonProperty("TypeOfInstallation")
    protected String typeOfInstallation;


}

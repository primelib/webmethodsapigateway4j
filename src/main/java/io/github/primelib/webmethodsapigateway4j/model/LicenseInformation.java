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
 * LicenseInformation
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

    /**
     * Constructs a validated instance of {@link LicenseInformation}.
     *
     * @param spec the specification to process
     */
    public LicenseInformation(Consumer<LicenseInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LicenseInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LicenseInformation(Consumer)} instead.
     * @param extendedRights extendedRights
     * @param licenseType licenseType
     * @param licenseVersion licenseVersion
     * @param metering metering
     * @param priceQuantity priceQuantity
     * @param priceUnit priceUnit
     * @param typeOfInstallation typeOfInstallation
     */
    @ApiStatus.Internal
    public LicenseInformation(String extendedRights, String licenseType, String licenseVersion, String metering, String priceQuantity, String priceUnit, String typeOfInstallation) {
        this.extendedRights = extendedRights;
        this.licenseType = licenseType;
        this.licenseVersion = licenseVersion;
        this.metering = metering;
        this.priceQuantity = priceQuantity;
        this.priceUnit = priceUnit;
        this.typeOfInstallation = typeOfInstallation;
    }

}

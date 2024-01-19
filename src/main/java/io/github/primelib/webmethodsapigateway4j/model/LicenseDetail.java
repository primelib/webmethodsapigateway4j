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
 * LicenseDetail
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
    protected APIGateway apIGateway;

    @JsonProperty("Sales Information")
    protected SalesInformation salesInformation;

    @JsonProperty("integrationServer")
    protected IntegrationServer integrationServer;

    @JsonProperty("licenseInformation")
    protected LicenseInformation licenseInformation;

    @JsonProperty("productInformation")
    protected ProductInformation productInformation;

    /**
     * Constructs a validated instance of {@link LicenseDetail}.
     *
     * @param spec the specification to process
     */
    public LicenseDetail(Consumer<LicenseDetail> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LicenseDetail}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LicenseDetail(Consumer)} instead.
     * @param apIGateway apIGateway
     * @param salesInformation salesInformation
     * @param integrationServer integrationServer
     * @param licenseInformation licenseInformation
     * @param productInformation productInformation
     */
    @ApiStatus.Internal
    public LicenseDetail(APIGateway apIGateway, SalesInformation salesInformation, IntegrationServer integrationServer, LicenseInformation licenseInformation, ProductInformation productInformation) {
        this.apIGateway = apIGateway;
        this.salesInformation = salesInformation;
        this.integrationServer = integrationServer;
        this.licenseInformation = licenseInformation;
        this.productInformation = productInformation;
    }

}

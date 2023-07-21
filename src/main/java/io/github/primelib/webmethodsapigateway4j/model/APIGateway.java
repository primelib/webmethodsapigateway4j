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
 * APIGateway
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
    "APIManagement",
    "Application Management",
    "Policy Management - Gateway",
    "Policy Management - Threat Protection"
})
@JsonTypeName("APIGateway")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIGateway {

    @JsonProperty("APIManagement")
    protected String apIManagement;

    @JsonProperty("Application Management")
    protected String applicationManagement;

    @JsonProperty("Policy Management - Gateway")
    protected String policyManagementGateway;

    @JsonProperty("Policy Management - Threat Protection")
    protected String policyManagementThreatProtection;

    /**
     * Constructs a validated instance of {@link APIGateway}.
     *
     * @param spec the specification to process
     */
    public APIGateway(Consumer<APIGateway> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIGateway}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIGateway(Consumer)} instead.
     * @param apIManagement var.name
     * @param applicationManagement var.name
     * @param policyManagementGateway var.name
     * @param policyManagementThreatProtection var.name
     */
    @ApiStatus.Internal
    public APIGateway(String apIManagement, String applicationManagement, String policyManagementGateway, String policyManagementThreatProtection) {
        this.apIManagement = apIManagement;
        this.applicationManagement = applicationManagement;
        this.policyManagementGateway = policyManagementGateway;
        this.policyManagementThreatProtection = policyManagementThreatProtection;
    }

}

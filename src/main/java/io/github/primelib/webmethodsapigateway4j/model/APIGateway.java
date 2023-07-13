package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIGateway
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String apIManagement;

    @JsonProperty("Application Management")
    private String applicationManagement;

    @JsonProperty("Policy Management - Gateway")
    private String policyManagementGateway;

    @JsonProperty("Policy Management - Threat Protection")
    private String policyManagementThreatProtection;


}

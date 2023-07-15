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
 * APIGateway
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "APIManagement",
    "Application Management",
    "Policy Management - Gateway",
    "Policy Management - Threat Protection"
})
@JsonTypeName("APIGateway")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIGateway {

    /**
     * Constructs a validated implementation of {@link APIGateway}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIGateway(Consumer<APIGateway> spec) {
        spec.accept(this);
    }

    @JsonProperty("APIManagement")
    protected String apIManagement;

    @JsonProperty("Application Management")
    protected String applicationManagement;

    @JsonProperty("Policy Management - Gateway")
    protected String policyManagementGateway;

    @JsonProperty("Policy Management - Threat Protection")
    protected String policyManagementThreatProtection;


}

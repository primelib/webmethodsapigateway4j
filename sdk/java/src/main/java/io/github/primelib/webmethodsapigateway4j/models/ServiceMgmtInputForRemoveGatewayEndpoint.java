// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtInputForRemoveGatewayEndpoint
 * <p>
 * To remove an existing Gateway endpoint of this API
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtInputForRemoveGatewayEndpoint")
@JsonPropertyOrder({
    "endpointName"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtInputForRemoveGatewayEndpoint {

    /**
     * Name of the endpoint
     */
    @JsonProperty("endpointName")
    protected String endpointName;

    /**
     * Constructs a validated instance of {@link ServiceMgmtInputForRemoveGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtInputForRemoveGatewayEndpoint(Consumer<ServiceMgmtInputForRemoveGatewayEndpoint> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtInputForRemoveGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtInputForRemoveGatewayEndpoint(Consumer)} instead.
     * @param endpointName Name of the endpoint
     */
    @ApiStatus.Internal
    public ServiceMgmtInputForRemoveGatewayEndpoint(String endpointName) {
        this.endpointName = endpointName;
    }
}

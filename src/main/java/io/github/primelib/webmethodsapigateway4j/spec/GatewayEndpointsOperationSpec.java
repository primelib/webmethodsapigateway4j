package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.InputGatewayEndpoints;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GatewayEndpointsSpec
 * <p>
 * Specification for the GatewayEndpoints operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayEndpointsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Id for the API to be updated
     */
    @NotNull 
    private String apiId;

    /**
     * API Gateway endpoints request payload
     */
    @NotNull 
    private InputGatewayEndpoints body;

    /**
     * Constructs a validated instance of {@link GatewayEndpointsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewayEndpointsOperationSpec(Consumer<GatewayEndpointsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GatewayEndpointsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiId                API Id for the API to be updated
     * @param body                 API Gateway endpoints request payload
     */
    @ApiStatus.Internal
    public GatewayEndpointsOperationSpec(String apiId, InputGatewayEndpoints body) {
        this.apiId = apiId;
        this.body = body;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(apiId, "apiId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

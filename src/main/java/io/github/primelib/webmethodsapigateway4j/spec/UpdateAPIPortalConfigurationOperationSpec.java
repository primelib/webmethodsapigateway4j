package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Port;
import io.github.primelib.webmethodsapigateway4j.model.PortalGateway;
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
 * UpdateAPIPortalConfigurationSpec
 * <p>
 * Specification for the UpdateAPIPortalConfiguration operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAPIPortalConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Id of the API Portal configuration for update
     */
    @NotNull 
    private String portalGatewayId;

    /**
     * API Portal configuration payload
     */
    @NotNull 
    private PortalGateway body;

    /**
     * Constructs a validated instance of {@link UpdateAPIPortalConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAPIPortalConfigurationOperationSpec(Consumer<UpdateAPIPortalConfigurationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAPIPortalConfigurationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param portalGatewayId      Id of the API Portal configuration for update
     * @param body                 API Portal configuration payload
     */
    @ApiStatus.Internal
    public UpdateAPIPortalConfigurationOperationSpec(String portalGatewayId, PortalGateway body) {
        this.portalGatewayId = portalGatewayId;
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
        Objects.requireNonNull(portalGatewayId, "portalGatewayId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Port;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetPublishedPackagesSpec
 * <p>
 * Specification for the GetPublishedPackages operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPublishedPackagesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Id of the API Portal configuration for retrieval of published packages information
     */
    @NotNull 
    private String portalGatewayId;

    /**
     * Id of the API published from API Gateway to API Portal
     */
    @NotNull 
    private String apiId;

    /**
     * Constructs a validated implementation of {@link GetPublishedPackagesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPublishedPackagesOperationSpec(Consumer<GetPublishedPackagesOperationSpec> spec) {
        spec.accept(this);
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
        Objects.requireNonNull(apiId, "apiId is a required parameter!");
    }

}

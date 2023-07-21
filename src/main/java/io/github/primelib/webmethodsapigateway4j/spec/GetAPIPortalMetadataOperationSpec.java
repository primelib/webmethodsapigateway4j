package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Port;
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
 * GetAPIPortalMetadataSpec
 * <p>
 * Specification for the GetAPIPortalMetadata operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAPIPortalMetadataOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Id of the API Portal configuration for retrieval of the community information
     */
    @NotNull 
    private String portalGatewayId;

    /**
     * Id of the API published from API Gateway to API Portal
     */
    @NotNull 
    private String apiId;

    /**
     * Constructs a validated instance of {@link GetAPIPortalMetadataOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAPIPortalMetadataOperationSpec(Consumer<GetAPIPortalMetadataOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAPIPortalMetadataOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param portalGatewayId      Id of the API Portal configuration for retrieval of the community information
     * @param apiId                Id of the API published from API Gateway to API Portal
     */
    @ApiStatus.Internal
    public GetAPIPortalMetadataOperationSpec(String portalGatewayId, String apiId) {
        this.portalGatewayId = portalGatewayId;
        this.apiId = apiId;

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

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DownloadProviderSpecificationSpec
 * <p>
 * Specification for the DownloadProviderSpecification operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DownloadProviderSpecificationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Id for the API to retrieve the versions
     */
    @NotNull 
    private String apiId;

    /**
     * Output format of the API specification. For REST APIs the value is 'swagger'; for SOAP APIs use the value as 'wsdl';for GraphQL APIs use the value as 'graphql'
     */
    @NotNull 
    private String format;

    /**
     * Constructs a validated implementation of {@link DownloadProviderSpecificationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DownloadProviderSpecificationOperationSpec(Consumer<DownloadProviderSpecificationOperationSpec> spec) {
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
        Objects.requireNonNull(apiId, "apiId is a required parameter!");
        Objects.requireNonNull(format, "format is a required parameter!");
    }

}

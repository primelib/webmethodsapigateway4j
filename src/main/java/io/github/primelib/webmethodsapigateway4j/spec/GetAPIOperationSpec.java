package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAPISpec
 * <p>
 * Specification for the GetAPI operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAPIOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Id for the API to be retrieved
     */
    @NotNull 
    private String apiId;

    /**
     * Output format of the API. If the value is 'swagger', you get a API definition in swagger format. If the value is 'raml', you get a raml document. If the value is 'openapi', you get a open API document. If the value is 'odata', you get a zip file holding the OData metadata and service document.
     */
    @Nullable 
    private String format;

    /**
     * User selected endpoint for API definition in swagger/raml format.
     */
    @Nullable 
    private String url;

    /**
     * Constructs a validated implementation of {@link GetAPIOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAPIOperationSpec(Consumer<GetAPIOperationSpec> spec) {
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
    }

}

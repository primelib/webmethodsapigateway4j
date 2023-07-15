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
 * GetScopeByScopeNameSpec
 * <p>
 * Specification for the GetScopeByScopeName operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetScopeByScopeNameOperationSpec {
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
     * Name of the scope
     */
    @NotNull 
    private String scopeName;

    /**
     * Constructs a validated implementation of {@link GetScopeByScopeNameOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetScopeByScopeNameOperationSpec(Consumer<GetScopeByScopeNameOperationSpec> spec) {
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
        Objects.requireNonNull(scopeName, "scopeName is a required parameter!");
    }

}

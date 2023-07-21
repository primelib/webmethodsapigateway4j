package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * DeleteCacheDetailsByapiNameAndVersionSpec
 * <p>
 * Specification for the DeleteCacheDetailsByapiNameAndVersion operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteCacheDetailsByapiNameAndVersionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This query parameter is used to specify the API name for which the service result cache deletion is requsted.
     */
    @NotNull 
    private String apiName;

    /**
     * The version of the apiName parameter specified
     */
    @NotNull 
    private String apiVersion;

    /**
     * Constructs a validated instance of {@link DeleteCacheDetailsByapiNameAndVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteCacheDetailsByapiNameAndVersionOperationSpec(Consumer<DeleteCacheDetailsByapiNameAndVersionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteCacheDetailsByapiNameAndVersionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiName              This query parameter is used to specify the API name for which the service result cache deletion is requsted.
     * @param apiVersion           The version of the apiName parameter specified
     */
    @ApiStatus.Internal
    public DeleteCacheDetailsByapiNameAndVersionOperationSpec(String apiName, String apiVersion) {
        this.apiName = apiName;
        this.apiVersion = apiVersion;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(apiName, "apiName is a required parameter!");
        Objects.requireNonNull(apiVersion, "apiVersion is a required parameter!");
    }
}

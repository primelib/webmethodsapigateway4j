package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Application;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteApplicationsSpec
 * <p>
 * Specification for the DeleteApplications operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteApplicationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * You can delete multiple applications using the query parameter 'ids' by providing the ids as comma-separated values. Example:
     * /applications?ids=375db639-01f7-4488-b14f-09daae622e18,afb0b5c0-0b0e-4d44-b139-e64d0dbf028c
     */
    @Nullable 
    private String ids;

    /**
     * Constructs a validated implementation of {@link DeleteApplicationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteApplicationsOperationSpec(Consumer<DeleteApplicationsOperationSpec> spec) {
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
    }

}

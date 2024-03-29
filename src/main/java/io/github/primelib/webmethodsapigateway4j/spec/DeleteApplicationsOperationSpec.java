package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Application;
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
 * DeleteApplicationsSpec
 * <p>
 * Specification for the DeleteApplications operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link DeleteApplicationsOperationSpec}.
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
     * Constructs a validated instance of {@link DeleteApplicationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param ids                  You can delete multiple applications using the query parameter 'ids' by providing the ids as comma-separated values. Example:  /applications?ids=375db639-01f7-4488-b14f-09daae622e18,afb0b5c0-0b0e-4d44-b139-e64d0dbf028c
     */
    @ApiStatus.Internal
    public DeleteApplicationsOperationSpec(String ids) {
        this.ids = ids;

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

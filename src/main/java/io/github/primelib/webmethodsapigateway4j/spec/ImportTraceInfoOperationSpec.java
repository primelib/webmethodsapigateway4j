package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.io.File;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ImportTraceInfoSpec
 * <p>
 * Specification for the ImportTraceInfo operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportTraceInfoOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The import archive containing the exported tracer events.
     */
    @NotNull 
    private File _file;

    /**
     * Constructs a validated implementation of {@link ImportTraceInfoOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImportTraceInfoOperationSpec(Consumer<ImportTraceInfoOperationSpec> spec) {
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
        Objects.requireNonNull(_file, "_file is a required parameter!");
    }

}
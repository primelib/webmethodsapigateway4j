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
 * RestoreDataSpec
 * <p>
 * Specification for the RestoreData operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RestoreDataOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter indicates the file name to be restored. Ex: fileName=default-2017-08-29-1504011306456.
     */
    @NotNull 
    private String fileName;

    /**
     * Constructs a validated implementation of {@link RestoreDataOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RestoreDataOperationSpec(Consumer<RestoreDataOperationSpec> spec) {
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
        Objects.requireNonNull(fileName, "fileName is a required parameter!");
    }

}

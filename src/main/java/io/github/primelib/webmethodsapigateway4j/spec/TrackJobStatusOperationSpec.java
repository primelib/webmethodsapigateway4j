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
 * TrackJobStatusSpec
 * <p>
 * Specification for the TrackJobStatus operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TrackJobStatusOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter indicates the job Id. Job Id is required to identify and track the status of a job which has been initiated. Ex: jobId=1504011632215
     */
    @NotNull 
    private String jobId;

    /**
     * Constructs a validated implementation of {@link TrackJobStatusOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TrackJobStatusOperationSpec(Consumer<TrackJobStatusOperationSpec> spec) {
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
        Objects.requireNonNull(jobId, "jobId is a required parameter!");
    }

}

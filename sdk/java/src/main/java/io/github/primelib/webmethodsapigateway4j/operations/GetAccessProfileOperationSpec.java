// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NonNull;

/**
 * GetAccessProfile
 * <p>
 * The method retrieves the details of a team in API Gateway.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetAccessProfileOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of a team whose details are to be retrieved.
     *
     */
    @NonNull
    private String accessProfileId;

    /**
     * Constructs a validated instance of {@link GetAccessProfileOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAccessProfileOperationSpec(Consumer<GetAccessProfileOperationSpec> spec) {
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
        Objects.requireNonNull(accessProfileId, "accessProfileId is a required parameter!");
    }
}

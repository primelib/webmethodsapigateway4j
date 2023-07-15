package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.AccessProfile;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateAccessProfileSpec
 * <p>
 * Specification for the UpdateAccessProfile operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAccessProfileOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of a team whose detail is to be updated in API Gateway.
     */
    @NotNull 
    private String accessProfileId;

    /**
     * This parameter describes the request payload of a accessProfile that is to be updated in API Gateway.
     */
    @NotNull 
    private AccessProfile body;

    /**
     * Constructs a validated implementation of {@link UpdateAccessProfileOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAccessProfileOperationSpec(Consumer<UpdateAccessProfileOperationSpec> spec) {
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
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}

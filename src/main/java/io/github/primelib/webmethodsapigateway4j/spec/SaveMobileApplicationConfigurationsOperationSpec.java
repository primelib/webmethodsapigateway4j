package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Application;
import io.github.primelib.webmethodsapigateway4j.model.MobileApplicationConfiguration;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SaveMobileApplicationConfigurationsSpec
 * <p>
 * Specification for the SaveMobileApplicationConfigurations operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SaveMobileApplicationConfigurationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private MobileApplicationConfiguration body;

    /**
     * Constructs a validated implementation of {@link SaveMobileApplicationConfigurationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SaveMobileApplicationConfigurationsOperationSpec(Consumer<SaveMobileApplicationConfigurationsOperationSpec> spec) {
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
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Port;
import io.github.primelib.webmethodsapigateway4j.model.RemotePortConfig;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AppendRingConfigurationSpec
 * <p>
 * Specification for the AppendRingConfiguration operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AppendRingConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Ring configuration payload
     */
    @NotNull 
    private RemotePortConfig body;

    /**
     * Constructs a validated implementation of {@link AppendRingConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AppendRingConfigurationOperationSpec(Consumer<AppendRingConfigurationOperationSpec> spec) {
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

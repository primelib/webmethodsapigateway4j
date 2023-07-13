package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DisableOutboundProxySpec
 * <p>
 * Specification for the DisableOutboundProxy operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DisableOutboundProxyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The outbound proxy server alias to be disabled
     */
    @NotNull 
    private String outboundproxyAlias;

    /**
     * Constructs a validated implementation of {@link DisableOutboundProxyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DisableOutboundProxyOperationSpec(Consumer<DisableOutboundProxyOperationSpec> spec) {
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
        Objects.requireNonNull(outboundproxyAlias, "outboundproxyAlias is a required parameter!");
    }

}

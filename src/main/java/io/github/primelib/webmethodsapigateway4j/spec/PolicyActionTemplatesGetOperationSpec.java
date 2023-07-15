package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.PolicyAction;
import io.github.primelib.webmethodsapigateway4j.model.PolicyActionTemplate;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * PolicyActionTemplatesGetSpec
 * <p>
 * Specification for the PolicyActionTemplatesGet operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionTemplatesGetOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is a query parameter. It will be used to fetch policy action templates for list of policy action.
     */
    @Nullable 
    private String policyActionTemplates;

    /**
     * Constructs a validated implementation of {@link PolicyActionTemplatesGetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionTemplatesGetOperationSpec(Consumer<PolicyActionTemplatesGetOperationSpec> spec) {
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

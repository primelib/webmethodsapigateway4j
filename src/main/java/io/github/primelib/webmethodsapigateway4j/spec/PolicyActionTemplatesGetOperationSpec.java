package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
import io.github.primelib.webmethodsapigateway4j.model.PolicyAction;
import io.github.primelib.webmethodsapigateway4j.model.PolicyActionTemplate;
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
 * PolicyActionTemplatesGetSpec
 * <p>
 * Specification for the PolicyActionTemplatesGet operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link PolicyActionTemplatesGetOperationSpec}.
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
     * Constructs a validated instance of {@link PolicyActionTemplatesGetOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyActionTemplates This is a query parameter. It will be used to fetch policy action templates for list of policy action.
     */
    @ApiStatus.Internal
    public PolicyActionTemplatesGetOperationSpec(String policyActionTemplates) {
        this.policyActionTemplates = policyActionTemplates;

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

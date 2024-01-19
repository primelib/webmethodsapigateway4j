package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * PolicyActionTemplatesPolicyActionTemplateIdGetSpec
 * <p>
 * Specification for the PolicyActionTemplatesPolicyActionTemplateIdGet operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is a path parameter. It will be used to fetch policy action template of a particular template.
     */
    @NotNull 
    private String policyActionTemplateId;

    /**
     * Constructs a validated instance of {@link PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec(Consumer<PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyActionTemplateId This is a path parameter. It will be used to fetch policy action template of a particular template.
     */
    @ApiStatus.Internal
    public PolicyActionTemplatesPolicyActionTemplateIdGetOperationSpec(String policyActionTemplateId) {
        this.policyActionTemplateId = policyActionTemplateId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(policyActionTemplateId, "policyActionTemplateId is a required parameter!");
    }
}

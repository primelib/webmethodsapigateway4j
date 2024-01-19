package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Rule;
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
 * UpdateRuleSpec
 * <p>
 * Specification for the UpdateRule operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRuleOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of the rule that is to be updated in API Gateway.
     */
    @NotNull 
    private String ruleId;

    /**
     * This parameter describes the request payload of an rule that is to be updated in API Gateway.
     */
    @NotNull 
    private Rule body;

    /**
     * Constructs a validated instance of {@link UpdateRuleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateRuleOperationSpec(Consumer<UpdateRuleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateRuleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param ruleId               The path parameter specifies the id of the rule that is to be updated in API Gateway.
     * @param body                 This parameter describes the request payload of an rule that is to be updated in API Gateway.
     */
    @ApiStatus.Internal
    public UpdateRuleOperationSpec(String ruleId, Rule body) {
        this.ruleId = ruleId;
        this.body = body;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(ruleId, "ruleId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

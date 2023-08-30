package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.StrategyRequest;
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
 * UpdateStrategySpec
 * <p>
 * Specification for the UpdateStrategy operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateStrategyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter specifies the ID of a strategy that is to be updated in API Gateway.
     */
    @NotNull 
    private String strategyId;

    /**
     * This parameter describes the request payload of a strategy that is to be updated in API Gateway.
     */
    @NotNull 
    private StrategyRequest body;

    /**
     * Constructs a validated instance of {@link UpdateStrategyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateStrategyOperationSpec(Consumer<UpdateStrategyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateStrategyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param strategyId           This parameter specifies the ID of a strategy that is to be updated in API Gateway.
     * @param body                 This parameter describes the request payload of a strategy that is to be updated in API Gateway.
     */
    @ApiStatus.Internal
    public UpdateStrategyOperationSpec(String strategyId, StrategyRequest body) {
        this.strategyId = strategyId;
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
        Objects.requireNonNull(strategyId, "strategyId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.JMSTrigger;
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
 * DisableJMSTriggerSpec
 * <p>
 * Specification for the DisableJMSTrigger operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DisableJMSTriggerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the JMS trigger id which JMS trigger needs to be disabled.
     */
    @NotNull 
    private String jmsTriggerId;

    /**
     * Constructs a validated instance of {@link DisableJMSTriggerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DisableJMSTriggerOperationSpec(Consumer<DisableJMSTriggerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DisableJMSTriggerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jmsTriggerId         This path parameter is used to specify the JMS trigger id which JMS trigger needs to be disabled.
     */
    @ApiStatus.Internal
    public DisableJMSTriggerOperationSpec(String jmsTriggerId) {
        this.jmsTriggerId = jmsTriggerId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(jmsTriggerId, "jmsTriggerId is a required parameter!");
    }
}

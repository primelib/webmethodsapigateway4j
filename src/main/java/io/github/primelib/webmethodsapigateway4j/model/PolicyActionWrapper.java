package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyActionWrapper
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "policyAction"
})
@JsonTypeName("PolicyActionWrapper")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionWrapper {

    @JsonProperty("policyAction")
    protected PolicyAction policyAction;

    /**
     * Constructs a validated instance of {@link PolicyActionWrapper}.
     *
     * @param spec the specification to process
     */
    public PolicyActionWrapper(Consumer<PolicyActionWrapper> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyActionWrapper}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyActionWrapper(Consumer)} instead.
     * @param policyAction policyAction
     */
    @ApiStatus.Internal
    public PolicyActionWrapper(PolicyAction policyAction) {
        this.policyAction = policyAction;
    }

}

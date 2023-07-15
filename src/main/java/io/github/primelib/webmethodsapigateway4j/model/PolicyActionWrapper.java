package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyActionWrapper
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "policyAction"
})
@JsonTypeName("PolicyActionWrapper")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionWrapper {

    /**
     * Constructs a validated implementation of {@link PolicyActionWrapper}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionWrapper(Consumer<PolicyActionWrapper> spec) {
        spec.accept(this);
    }

    @JsonProperty("policyAction")
    protected PolicyAction policyAction;


}

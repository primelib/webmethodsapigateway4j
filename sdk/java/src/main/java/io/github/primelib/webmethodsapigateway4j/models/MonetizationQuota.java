// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * MonetizationQuota
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationQuota")
@JsonPropertyOrder({
    "enforcementPolicy"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationQuota {

    /**
     * Policy id holding the information of throttling and monitor policy action to enforce quota limit.
     */
    @JsonProperty("enforcementPolicy")
    protected String enforcementPolicy;

    /**
     * Constructs a validated instance of {@link MonetizationQuota}.
     *
     * @param spec the specification to process
     */
    public MonetizationQuota(Consumer<MonetizationQuota> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationQuota}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationQuota(Consumer)} instead.
     * @param enforcementPolicy Policy id holding the information of throttling and monitor policy action to enforce quota limit.
     */
    @ApiStatus.Internal
    public MonetizationQuota(String enforcementPolicy) {
        this.enforcementPolicy = enforcementPolicy;
    }
}

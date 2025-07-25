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
 * MonetizationCost
 * <p>
 * Cost details of a plan. It will be used for user information only and wont be enforced.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationCost")
@JsonPropertyOrder({
    "value"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationCost {

    /**
     * Cost of the plan.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link MonetizationCost}.
     *
     * @param spec the specification to process
     */
    public MonetizationCost(Consumer<MonetizationCost> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationCost}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationCost(Consumer)} instead.
     * @param value Cost of the plan.
     */
    @ApiStatus.Internal
    public MonetizationCost(String value) {
        this.value = value;
    }
}

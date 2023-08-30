package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecimalProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "exclusiveMaximum",
    "exclusiveMinimum",
    "maximum",
    "minimum",
    "multipleOf"
})
@JsonTypeName("DecimalProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DecimalProperty extends Property {

    @JsonProperty("exclusiveMaximum")
    protected Boolean exclusiveMaximum;

    @JsonProperty("exclusiveMinimum")
    protected Boolean exclusiveMinimum;

    @JsonProperty("maximum")
    protected BigDecimal maximum;

    @JsonProperty("minimum")
    protected BigDecimal minimum;

    @JsonProperty("multipleOf")
    protected BigDecimal multipleOf;

    /**
     * Constructs a validated instance of {@link DecimalProperty}.
     *
     * @param spec the specification to process
     */
    public DecimalProperty(Consumer<DecimalProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DecimalProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DecimalProperty(Consumer)} instead.
     * @param exclusiveMaximum exclusiveMaximum
     * @param exclusiveMinimum exclusiveMinimum
     * @param maximum maximum
     * @param minimum minimum
     * @param multipleOf multipleOf
     */
    @ApiStatus.Internal
    public DecimalProperty(Boolean exclusiveMaximum, Boolean exclusiveMinimum, BigDecimal maximum, BigDecimal minimum, BigDecimal multipleOf) {
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.maximum = maximum;
        this.minimum = minimum;
        this.multipleOf = multipleOf;
    }

}

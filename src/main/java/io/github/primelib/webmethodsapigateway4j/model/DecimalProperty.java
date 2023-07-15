package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecimalProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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

    /**
     * Constructs a validated implementation of {@link DecimalProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DecimalProperty(Consumer<DecimalProperty> spec) {
        spec.accept(this);
    }

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


}

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
 * BaseIntegerProperty
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
@JsonTypeName("BaseIntegerProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BaseIntegerProperty extends Property {

    /**
     * Constructs a validated implementation of {@link BaseIntegerProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BaseIntegerProperty(Consumer<BaseIntegerProperty> spec) {
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

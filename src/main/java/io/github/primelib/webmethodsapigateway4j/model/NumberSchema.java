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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NumberSchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "default",
    "enum",
    "type"
})
@JsonTypeName("NumberSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NumberSchema extends ParameterSchema<BigDecimal> {

    /**
     * Constructs a validated implementation of {@link NumberSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NumberSchema(Consumer<NumberSchema> spec) {
        spec.accept(this);
    }

    /**
     * The default value represents what would be assumed by the consumer of the input as the value of the schema if one is not provided. Unlike JSON Schema, the value MUST conform to the defined type for the Schema Object defined at the same level. For example, if type is string, then default can be "foo" but cannot be 1
     */
    @JsonProperty("default")
    protected BigDecimal _default;

    @JsonProperty("enum")
    protected List<BigDecimal> _enum;

    @JsonProperty("type")
    protected String type;


}

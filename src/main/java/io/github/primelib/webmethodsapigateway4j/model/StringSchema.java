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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StringSchema
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
@JsonTypeName("StringSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StringSchema extends ParameterSchema<String> {

    /**
     * Constructs a validated implementation of {@link StringSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StringSchema(Consumer<StringSchema> spec) {
        spec.accept(this);
    }

    /**
     * The default value represents what would be assumed by the consumer of the input as the value of the schema if one is not provided. Unlike JSON Schema, the value MUST conform to the defined type for the Schema Object defined at the same level. For example, if type is string, then default can be "foo" but cannot be 1
     */
    @JsonProperty("default")
    protected String _default;

    @JsonProperty("enum")
    protected List<String> _enum;

    @JsonProperty("type")
    protected String type;


}

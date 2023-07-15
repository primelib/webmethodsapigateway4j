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
 * IntegerSchema
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
    "format",
    "type"
})
@JsonTypeName("IntegerSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegerSchema extends ParameterSchema<Object> {

    /**
     * Constructs a validated implementation of {@link IntegerSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IntegerSchema(Consumer<IntegerSchema> spec) {
        spec.accept(this);
    }

    @JsonProperty("default")
    protected Object _default;

    @JsonProperty("enum")
    protected List<Object> _enum;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("type")
    protected String type;


}

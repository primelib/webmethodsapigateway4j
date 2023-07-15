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
 * ComposedSchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "allOf",
    "anyOf",
    "oneOf"
})
@JsonTypeName("ComposedSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComposedSchema extends ParameterSchema {

    /**
     * Constructs a validated implementation of {@link ComposedSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComposedSchema(Consumer<ComposedSchema> spec) {
        spec.accept(this);
    }

    /**
     * Must be valid against all of the subschemas
     */
    @JsonProperty("allOf")
    protected List<ParameterSchema> allOf;

    /**
     * Must be valid against any of the subschemas
     */
    @JsonProperty("anyOf")
    protected List<ParameterSchema> anyOf;

    /**
     * Must be valid against exactly one of the subschemas
     */
    @JsonProperty("oneOf")
    protected List<ParameterSchema> oneOf;


}

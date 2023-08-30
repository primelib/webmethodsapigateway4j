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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComposedSchema
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allOf",
    "anyOf",
    "oneOf"
})
@JsonTypeName("ComposedSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComposedSchema extends ParameterSchema {

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

    /**
     * Constructs a validated instance of {@link ComposedSchema}.
     *
     * @param spec the specification to process
     */
    public ComposedSchema(Consumer<ComposedSchema> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComposedSchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComposedSchema(Consumer)} instead.
     * @param allOf Must be valid against all of the subschemas
     * @param anyOf Must be valid against any of the subschemas
     * @param oneOf Must be valid against exactly one of the subschemas
     */
    @ApiStatus.Internal
    public ComposedSchema(List<ParameterSchema> allOf, List<ParameterSchema> anyOf, List<ParameterSchema> oneOf) {
        this.allOf = allOf;
        this.anyOf = anyOf;
        this.oneOf = oneOf;
    }

}

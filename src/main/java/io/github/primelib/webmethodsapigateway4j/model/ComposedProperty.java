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
 * ComposedProperty
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
@JsonTypeName("ComposedProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComposedProperty extends Property {

    @JsonProperty("allOf")
    protected List<Property> allOf;

    @JsonProperty("anyOf")
    protected List<Property> anyOf;

    @JsonProperty("oneOf")
    protected List<Property> oneOf;

    /**
     * Constructs a validated instance of {@link ComposedProperty}.
     *
     * @param spec the specification to process
     */
    public ComposedProperty(Consumer<ComposedProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComposedProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComposedProperty(Consumer)} instead.
     * @param allOf allOf
     * @param anyOf anyOf
     * @param oneOf oneOf
     */
    @ApiStatus.Internal
    public ComposedProperty(List<Property> allOf, List<Property> anyOf, List<Property> oneOf) {
        this.allOf = allOf;
        this.anyOf = anyOf;
        this.oneOf = oneOf;
    }

}

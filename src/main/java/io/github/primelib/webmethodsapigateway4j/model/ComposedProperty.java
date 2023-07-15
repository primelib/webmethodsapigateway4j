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
 * ComposedProperty
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
@JsonTypeName("ComposedProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComposedProperty extends Property {

    /**
     * Constructs a validated implementation of {@link ComposedProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComposedProperty(Consumer<ComposedProperty> spec) {
        spec.accept(this);
    }

    @JsonProperty("allOf")
    protected List<Property> allOf;

    @JsonProperty("anyOf")
    protected List<Property> anyOf;

    @JsonProperty("oneOf")
    protected List<Property> oneOf;


}

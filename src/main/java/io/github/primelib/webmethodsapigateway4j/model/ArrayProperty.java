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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArrayProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "items",
    "maxItems",
    "minItems",
    "uniqueItems"
})
@JsonTypeName("ArrayProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArrayProperty extends Property {

    /**
     * Constructs a validated implementation of {@link ArrayProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArrayProperty(Consumer<ArrayProperty> spec) {
        spec.accept(this);
    }

    @JsonProperty("items")
    protected Property items;

    @JsonProperty("maxItems")
    protected Integer maxItems;

    @JsonProperty("minItems")
    protected Integer minItems;

    @JsonProperty("uniqueItems")
    protected Boolean uniqueItems;


}

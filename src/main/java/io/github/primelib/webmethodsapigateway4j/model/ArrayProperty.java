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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArrayProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "items",
    "maxItems",
    "minItems",
    "uniqueItems"
})
@JsonTypeName("ArrayProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArrayProperty extends Property {

    @JsonProperty("items")
    protected Property items;

    @JsonProperty("maxItems")
    protected Integer maxItems;

    @JsonProperty("minItems")
    protected Integer minItems;

    @JsonProperty("uniqueItems")
    protected Boolean uniqueItems;

    /**
     * Constructs a validated instance of {@link ArrayProperty}.
     *
     * @param spec the specification to process
     */
    public ArrayProperty(Consumer<ArrayProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArrayProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArrayProperty(Consumer)} instead.
     * @param items items
     * @param maxItems maxItems
     * @param minItems minItems
     * @param uniqueItems uniqueItems
     */
    @ApiStatus.Internal
    public ArrayProperty(Property items, Integer maxItems, Integer minItems, Boolean uniqueItems) {
        this.items = items;
        this.maxItems = maxItems;
        this.minItems = minItems;
        this.uniqueItems = uniqueItems;
    }

}

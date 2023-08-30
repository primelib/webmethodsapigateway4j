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
 * ArrayModel
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
    "minItems"
})
@JsonTypeName("ArrayModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArrayModel extends Model {

    @JsonProperty("items")
    protected Property items;

    @JsonProperty("maxItems")
    protected Integer maxItems;

    @JsonProperty("minItems")
    protected Integer minItems;

    /**
     * Constructs a validated instance of {@link ArrayModel}.
     *
     * @param spec the specification to process
     */
    public ArrayModel(Consumer<ArrayModel> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArrayModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArrayModel(Consumer)} instead.
     * @param items items
     * @param maxItems maxItems
     * @param minItems minItems
     */
    @ApiStatus.Internal
    public ArrayModel(Property items, Integer maxItems, Integer minItems) {
        this.items = items;
        this.maxItems = maxItems;
        this.minItems = minItems;
    }

}

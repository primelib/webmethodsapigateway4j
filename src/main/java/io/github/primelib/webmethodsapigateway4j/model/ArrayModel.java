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
 * ArrayModel
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
    "minItems"
})
@JsonTypeName("ArrayModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArrayModel extends Model {

    /**
     * Constructs a validated implementation of {@link ArrayModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArrayModel(Consumer<ArrayModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("items")
    protected Property items;

    @JsonProperty("maxItems")
    protected Integer maxItems;

    @JsonProperty("minItems")
    protected Integer minItems;


}

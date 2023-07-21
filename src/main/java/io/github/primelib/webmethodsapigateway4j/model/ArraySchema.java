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
 * ArraySchema
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
    "type"
})
@JsonTypeName("ArraySchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArraySchema extends ParameterSchema {

    @JsonProperty("items")
    protected ParameterSchema items;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ArraySchema}.
     *
     * @param spec the specification to process
     */
    public ArraySchema(Consumer<ArraySchema> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArraySchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArraySchema(Consumer)} instead.
     * @param items var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public ArraySchema(ParameterSchema items, String type) {
        this.items = items;
        this.type = type;
    }

}

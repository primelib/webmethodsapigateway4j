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
 * ArraySchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "items",
    "type"
})
@JsonTypeName("ArraySchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArraySchema extends ParameterSchema {

    /**
     * Constructs a validated implementation of {@link ArraySchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArraySchema(Consumer<ArraySchema> spec) {
        spec.accept(this);
    }

    @JsonProperty("items")
    protected ParameterSchema items;

    @JsonProperty("type")
    protected String type;


}

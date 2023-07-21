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
 * BooleanSchema
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("BooleanSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BooleanSchema extends ParameterSchema {

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link BooleanSchema}.
     *
     * @param spec the specification to process
     */
    public BooleanSchema(Consumer<BooleanSchema> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BooleanSchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BooleanSchema(Consumer)} instead.
     * @param type var.name
     */
    @ApiStatus.Internal
    public BooleanSchema(String type) {
        this.type = type;
    }

}

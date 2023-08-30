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
 * ObjectSchema
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
@JsonTypeName("ObjectSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ObjectSchema extends ParameterSchema {

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ObjectSchema}.
     *
     * @param spec the specification to process
     */
    public ObjectSchema(Consumer<ObjectSchema> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ObjectSchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ObjectSchema(Consumer)} instead.
     * @param type type
     */
    @ApiStatus.Internal
    public ObjectSchema(String type) {
        this.type = type;
    }

}

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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MapProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "additionalProperties",
    "maxProperties",
    "minProperties"
})
@JsonTypeName("MapProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MapProperty extends Property {

    @JsonProperty("additionalProperties")
    protected Property additionalProperties;

    @JsonProperty("maxProperties")
    protected Integer maxProperties;

    @JsonProperty("minProperties")
    protected Integer minProperties;

    /**
     * Constructs a validated instance of {@link MapProperty}.
     *
     * @param spec the specification to process
     */
    public MapProperty(Consumer<MapProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MapProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MapProperty(Consumer)} instead.
     * @param additionalProperties var.name
     * @param maxProperties var.name
     * @param minProperties var.name
     */
    @ApiStatus.Internal
    public MapProperty(Property additionalProperties, Integer maxProperties, Integer minProperties) {
        this.additionalProperties = additionalProperties;
        this.maxProperties = maxProperties;
        this.minProperties = minProperties;
    }

}

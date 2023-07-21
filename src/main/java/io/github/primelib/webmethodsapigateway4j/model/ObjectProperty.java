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
 * ObjectProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "properties"
})
@JsonTypeName("ObjectProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ObjectProperty extends Property {

    @JsonProperty("properties")
    protected Map<String, Property> properties;

    /**
     * Constructs a validated instance of {@link ObjectProperty}.
     *
     * @param spec the specification to process
     */
    public ObjectProperty(Consumer<ObjectProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ObjectProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ObjectProperty(Consumer)} instead.
     * @param properties var.name
     */
    @ApiStatus.Internal
    public ObjectProperty(Map<String, Property> properties) {
        this.properties = properties;
    }

}

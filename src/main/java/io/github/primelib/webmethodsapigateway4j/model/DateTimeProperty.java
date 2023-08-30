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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DateTimeProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enum"
})
@JsonTypeName("DateTimeProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DateTimeProperty extends Property {

    @JsonProperty("enum")
    protected List<Object> _enum;

    /**
     * Constructs a validated instance of {@link DateTimeProperty}.
     *
     * @param spec the specification to process
     */
    public DateTimeProperty(Consumer<DateTimeProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DateTimeProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DateTimeProperty(Consumer)} instead.
     * @param _enum _enum
     */
    @ApiStatus.Internal
    public DateTimeProperty(List<Object> _enum) {
        this._enum = _enum;
    }

}

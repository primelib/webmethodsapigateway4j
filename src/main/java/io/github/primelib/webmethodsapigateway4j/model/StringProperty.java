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
 * StringProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "default",
    "enum",
    "maxLength",
    "minLength",
    "pattern"
})
@JsonTypeName("StringProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StringProperty extends Property {

    @JsonProperty("default")
    protected String _default;

    @JsonProperty("enum")
    protected List<String> _enum;

    @JsonProperty("maxLength")
    protected Integer maxLength;

    @JsonProperty("minLength")
    protected Integer minLength;

    @JsonProperty("pattern")
    protected String pattern;

    /**
     * Constructs a validated instance of {@link StringProperty}.
     *
     * @param spec the specification to process
     */
    public StringProperty(Consumer<StringProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StringProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StringProperty(Consumer)} instead.
     * @param _default var.name
     * @param _enum var.name
     * @param maxLength var.name
     * @param minLength var.name
     * @param pattern var.name
     */
    @ApiStatus.Internal
    public StringProperty(String _default, List<String> _enum, Integer maxLength, Integer minLength, String pattern) {
        this._default = _default;
        this._enum = _enum;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.pattern = pattern;
    }

}

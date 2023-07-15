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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StringProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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

    /**
     * Constructs a validated implementation of {@link StringProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StringProperty(Consumer<StringProperty> spec) {
        spec.accept(this);
    }

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


}

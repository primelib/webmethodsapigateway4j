package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PossibleValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "names",
    "value"
})
@JsonTypeName("PossibleValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PossibleValue {

    /**
     * Constructs a validated implementation of {@link PossibleValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PossibleValue(Consumer<PossibleValue> spec) {
        spec.accept(this);
    }

    /**
     * Descriptive name for the value
     */
    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * value that need to be used when providing value for the respective policy action parameter
     */
    @JsonProperty("value")
    protected String value;


}

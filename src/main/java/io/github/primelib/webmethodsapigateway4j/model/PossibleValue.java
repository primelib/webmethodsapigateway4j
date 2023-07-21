package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
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
 * PossibleValue
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "names",
    "value"
})
@JsonTypeName("PossibleValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PossibleValue {

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

    /**
     * Constructs a validated instance of {@link PossibleValue}.
     *
     * @param spec the specification to process
     */
    public PossibleValue(Consumer<PossibleValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PossibleValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PossibleValue(Consumer)} instead.
     * @param names Descriptive name for the value
     * @param value value that need to be used when providing value for the respective policy action parameter
     */
    @ApiStatus.Internal
    public PossibleValue(List<InternationalizedString> names, String value) {
        this.names = names;
        this.value = value;
    }

}

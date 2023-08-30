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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cost
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
    "value"
})
@JsonTypeName("Cost")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Cost {

    /**
     * Cost of the plan.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link Cost}.
     *
     * @param spec the specification to process
     */
    public Cost(Consumer<Cost> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Cost}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Cost(Consumer)} instead.
     * @param value Cost of the plan.
     */
    @ApiStatus.Internal
    public Cost(String value) {
        this.value = value;
    }

}

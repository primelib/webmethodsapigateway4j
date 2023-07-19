package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cost
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("Cost")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Cost {

    /**
     * Constructs a validated implementation of {@link Cost}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Cost(Consumer<Cost> spec) {
        spec.accept(this);
    }

    /**
     * Cost of the plan.
     */
    @JsonProperty("value")
    protected String value;


}
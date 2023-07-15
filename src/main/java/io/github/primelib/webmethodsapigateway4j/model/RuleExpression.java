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
 * RuleExpression
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributeName",
    "attributeValue",
    "operator"
})
@JsonTypeName("RuleExpression")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleExpression {

    /**
     * Constructs a validated implementation of {@link RuleExpression}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RuleExpression(Consumer<RuleExpression> spec) {
        spec.accept(this);
    }

    @JsonProperty("attributeName")
    protected String attributeName;

    @JsonProperty("attributeValue")
    protected String attributeValue;

    @JsonProperty("operator")
    protected String operator;


}

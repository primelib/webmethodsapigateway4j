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
 * RuleExpression
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
    "attributeName",
    "attributeValue",
    "operator"
})
@JsonTypeName("RuleExpression")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleExpression {

    @JsonProperty("attributeName")
    protected String attributeName;

    @JsonProperty("attributeValue")
    protected String attributeValue;

    @JsonProperty("operator")
    protected String operator;

    /**
     * Constructs a validated instance of {@link RuleExpression}.
     *
     * @param spec the specification to process
     */
    public RuleExpression(Consumer<RuleExpression> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuleExpression}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuleExpression(Consumer)} instead.
     * @param attributeName var.name
     * @param attributeValue var.name
     * @param operator var.name
     */
    @ApiStatus.Internal
    public RuleExpression(String attributeName, String attributeValue, String operator) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
        this.operator = operator;
    }

}

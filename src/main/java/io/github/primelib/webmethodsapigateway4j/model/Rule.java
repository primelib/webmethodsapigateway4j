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
 * Rule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active",
    "attributeContexts",
    "description",
    "id",
    "name",
    "owner",
    "ruleExpressions",
    "ruleLogicalOperator",
    "ruleType"
})
@JsonTypeName("Rule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Rule {

    /**
     * Constructs a validated implementation of {@link Rule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Rule(Consumer<Rule> spec) {
        spec.accept(this);
    }

    /**
     * This rule is active
     */
    @JsonProperty("active")
    protected Boolean active;

    /**
     * Context(s) of the attribute used in rule expression
     */
    @JsonProperty("attributeContexts")
    protected List<String> attributeContexts;

    /**
     * Rule Description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * A unique ID for the rule
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Rule name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Owner of this rule asset
     */
    @JsonProperty("owner")
    protected String owner;

    /**
     * Rule condition is defined using ruleExpressions
     */
    @JsonProperty("ruleExpressions")
    protected List<RuleExpression> ruleExpressions;

    /**
     * Logical operator (AND / OR) that should be used to evaluate Rule expression
     */
    @JsonProperty("ruleLogicalOperator")
    protected String ruleLogicalOperator;

    /**
     * Type of the rule
     */
    @JsonProperty("ruleType")
    protected RuleTypeEnum ruleType;


    /**
     * Type of the rule
     */
    @AllArgsConstructor
    public enum RuleTypeEnum {
        TEAMASSIGNMENTRULE("teamAssignmentRule");

        private final String value;
    }

}

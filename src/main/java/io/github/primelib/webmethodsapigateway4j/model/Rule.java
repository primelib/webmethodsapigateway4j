package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * This rule is active
     */
    @JsonProperty("active")
    private Boolean active;

    /**
     * Context(s) of the attribute used in rule expression
     */
    @JsonProperty("attributeContexts")
    private List<String> attributeContexts;

    /**
     * Rule Description
     */
    @JsonProperty("description")
    private String description;

    /**
     * A unique ID for the rule
     */
    @JsonProperty("id")
    private String id;

    /**
     * Rule name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Owner of this rule asset
     */
    @JsonProperty("owner")
    private String owner;

    /**
     * Rule condition is defined using ruleExpressions
     */
    @JsonProperty("ruleExpressions")
    private List<RuleExpression> ruleExpressions;

    /**
     * Logical operator (AND / OR) that should be used to evaluate Rule expression
     */
    @JsonProperty("ruleLogicalOperator")
    private String ruleLogicalOperator;

    /**
     * Type of the rule
     */
    @JsonProperty("ruleType")
    private RuleTypeEnum ruleType;


public enum RuleTypeEnum {
        TEAMASSIGNMENTRULE("teamAssignmentRule"); // Type of the rule
    
    private final String text;

    /**
     * @param text
     */
    RuleTypeEnum(final String text) {
        this.text = text;
    }

}
}

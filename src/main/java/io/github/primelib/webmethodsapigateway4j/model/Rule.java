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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Rule
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
     * Constructs a validated instance of {@link Rule}.
     *
     * @param spec the specification to process
     */
    public Rule(Consumer<Rule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Rule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Rule(Consumer)} instead.
     * @param active This rule is active
     * @param attributeContexts Context(s) of the attribute used in rule expression
     * @param description Rule Description
     * @param id A unique ID for the rule
     * @param name Rule name
     * @param owner Owner of this rule asset
     * @param ruleExpressions Rule condition is defined using ruleExpressions
     * @param ruleLogicalOperator Logical operator (AND / OR) that should be used to evaluate Rule expression
     * @param ruleType Type of the rule
     */
    @ApiStatus.Internal
    public Rule(Boolean active, List<String> attributeContexts, String description, String id, String name, String owner, List<RuleExpression> ruleExpressions, String ruleLogicalOperator, RuleTypeEnum ruleType) {
        this.active = active;
        this.attributeContexts = attributeContexts;
        this.description = description;
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.ruleExpressions = ruleExpressions;
        this.ruleLogicalOperator = ruleLogicalOperator;
        this.ruleType = ruleType;
    }

    /**
     * Type of the rule
     */
    @AllArgsConstructor
    public enum RuleTypeEnum {
        TEAMASSIGNMENTRULE("teamAssignmentRule");

        private static final RuleTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RuleTypeEnum of(String input) {
            if (input != null) {
                for (RuleTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

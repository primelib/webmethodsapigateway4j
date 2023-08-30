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
 * Policy
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
    "descriptions",
    "global",
    "id",
    "names",
    "parameters",
    "policyEnforcements",
    "policyScope",
    "scope",
    "systemPolicy"
})
@JsonTypeName("Policy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Policy {

    @JsonProperty("active")
    protected Boolean active;

    /**
     * This contains list of description for the policy
     * with corresponding locale information.
     */
    @JsonProperty("descriptions")
    protected List<InternationalizedString> descriptions;

    @JsonProperty("global")
    protected Boolean global;

    /**
     * Policy ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * This contains list of names for the policy with corresponding locale information.
     */
    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * This basic details of a threat protection rule such as rule name, description, rule action, custom error message etc.will be stored in this property.
     */
    @JsonProperty("parameters")
    protected List<PolicyActionParameter> parameters;

    /**
     * This property contains list of policy (runtime) enforcement id grouped based on the stages.
     */
    @JsonProperty("policyEnforcements")
    protected List<PolicyEnforcements> policyEnforcements;

    /**
     * This property is used to refer the scope of the policy.
     */
    @JsonProperty("policyScope")
    protected PolicyScopeEnum policyScope;

    @JsonProperty("scope")
    protected Scope scope;

    @JsonProperty("systemPolicy")
    protected Boolean systemPolicy;

    /**
     * Constructs a validated instance of {@link Policy}.
     *
     * @param spec the specification to process
     */
    public Policy(Consumer<Policy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Policy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Policy(Consumer)} instead.
     * @param active active
     * @param descriptions This contains list of description for the policy  with corresponding locale information.
     * @param global global
     * @param id Policy ID
     * @param names This contains list of names for the policy with corresponding locale information.
     * @param parameters This basic details of a threat protection rule such as rule name, description, rule action, custom error message etc.will be stored in this property.
     * @param policyEnforcements This property contains list of policy (runtime) enforcement id grouped based on the stages.
     * @param policyScope This property is used to refer the scope of the policy.
     * @param scope scope
     * @param systemPolicy systemPolicy
     */
    @ApiStatus.Internal
    public Policy(Boolean active, List<InternationalizedString> descriptions, Boolean global, String id, List<InternationalizedString> names, List<PolicyActionParameter> parameters, List<PolicyEnforcements> policyEnforcements, PolicyScopeEnum policyScope, Scope scope, Boolean systemPolicy) {
        this.active = active;
        this.descriptions = descriptions;
        this.global = global;
        this.id = id;
        this.names = names;
        this.parameters = parameters;
        this.policyEnforcements = policyEnforcements;
        this.policyScope = policyScope;
        this.scope = scope;
        this.systemPolicy = systemPolicy;
    }

    /**
     * This property is used to refer the scope of the policy.
     */
    @AllArgsConstructor
    public enum PolicyScopeEnum {
        GLOBAL("GLOBAL"),
        METHOD("METHOD"),
        OPERATION("OPERATION"),
        RESOURCE("RESOURCE"),
        SERVICE("SERVICE"),
        PACKAGE("PACKAGE"),
        TEMPLATE("TEMPLATE"),
        SCOPE("SCOPE");

        private static final PolicyScopeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PolicyScopeEnum of(String input) {
            if (input != null) {
                for (PolicyScopeEnum v : VALUES) {
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

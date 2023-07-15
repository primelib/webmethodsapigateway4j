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
 * Policy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Policy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Policy(Consumer<Policy> spec) {
        spec.accept(this);
    }

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

        private final String value;
    }

}

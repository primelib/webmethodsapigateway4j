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
 * PolicyDetails
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
    "PolicyScope",
    "names",
    "policyActionsIds",
    "policyId",
    "stageKey"
})
@JsonTypeName("PolicyDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyDetails {

    /**
     * Policy Scope of the conflicting policy.
     */
    @JsonProperty("PolicyScope")
    protected PolicyScopeEnum policyScope;

    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * List of IDs of conflicting policy enforcement of this policy
     */
    @JsonProperty("policyActionsIds")
    protected List<String> policyActionsIds;

    /**
     * Id of the conflicting policy.
     */
    @JsonProperty("policyId")
    protected String policyId;

    /**
     * Stage key of the conflicting policy enforcement of this policy
     */
    @JsonProperty("stageKey")
    protected String stageKey;

    /**
     * Constructs a validated instance of {@link PolicyDetails}.
     *
     * @param spec the specification to process
     */
    public PolicyDetails(Consumer<PolicyDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyDetails(Consumer)} instead.
     * @param policyScope Policy Scope of the conflicting policy.
     * @param names var.name
     * @param policyActionsIds List of IDs of conflicting policy enforcement of this policy
     * @param policyId Id of the conflicting policy.
     * @param stageKey Stage key of the conflicting policy enforcement of this policy
     */
    @ApiStatus.Internal
    public PolicyDetails(PolicyScopeEnum policyScope, List<InternationalizedString> names, List<String> policyActionsIds, String policyId, String stageKey) {
        this.policyScope = policyScope;
        this.names = names;
        this.policyActionsIds = policyActionsIds;
        this.policyId = policyId;
        this.stageKey = stageKey;
    }

    /**
     * Policy Scope of the conflicting policy.
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

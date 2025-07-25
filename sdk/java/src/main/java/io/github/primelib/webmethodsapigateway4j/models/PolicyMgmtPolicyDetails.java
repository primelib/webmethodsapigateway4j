// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * PolicyMgmtPolicyDetails
 * <p>
 * Details of the conflicting policies and policy enforcement of the respective policy
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("PolicyMgmtPolicyDetails")
@JsonPropertyOrder({
    "policyScope",
    "names",
    "policyActionsIds",
    "policyId",
    "stageKey"
})
@Generated(value = "io.github.primelib.primecodegen")
public class PolicyMgmtPolicyDetails {

    /**
     * Policy Scope of the conflicting policy.
     */
    @JsonProperty("PolicyScope")
    protected String policyScope;

    @JsonProperty("names")
    protected List<PolicyMgmtInternationalizedString> names;

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
     * Constructs a validated instance of {@link PolicyMgmtPolicyDetails}.
     *
     * @param spec the specification to process
     */
    public PolicyMgmtPolicyDetails(Consumer<PolicyMgmtPolicyDetails> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyMgmtPolicyDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyMgmtPolicyDetails(Consumer)} instead.
     * @param policyScope Policy Scope of the conflicting policy.
     * @param names names
     * @param policyActionsIds List of IDs of conflicting policy enforcement of this policy
     * @param policyId Id of the conflicting policy.
     * @param stageKey Stage key of the conflicting policy enforcement of this policy
     */
    @ApiStatus.Internal
    public PolicyMgmtPolicyDetails(String policyScope, List<PolicyMgmtInternationalizedString> names, List<String> policyActionsIds, String policyId, String stageKey) {
        this.policyScope = policyScope;
        this.names = names;
        this.policyActionsIds = policyActionsIds;
        this.policyId = policyId;
        this.stageKey = stageKey;
    }
}

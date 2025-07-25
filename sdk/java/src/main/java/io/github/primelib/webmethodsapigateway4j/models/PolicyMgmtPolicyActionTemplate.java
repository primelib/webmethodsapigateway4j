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
 * PolicyMgmtPolicyActionTemplate
 * <p>
 * A policy action template represents the schema for a policy enforcement. 
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("PolicyMgmtPolicyActionTemplate")
@JsonPropertyOrder({
    "applicableServiceTypes",
    "canAppliedAtResourceMethodLevel",
    "dependentActions",
    "dependentActionsConnector",
    "descriptions",
    "mutuallyExclusiveActions",
    "names",
    "occurrence",
    "order",
    "parameterTemplates",
    "requiredParametersKeys",
    "stageSpecific",
    "templateKey"
})
@Generated(value = "io.github.primelib.primecodegen")
public class PolicyMgmtPolicyActionTemplate {

    /**
     * Policy enforcement only applicable for the list of service type specified here
     */
    @JsonProperty("applicableServiceTypes")
    protected List<String> applicableServiceTypes;

    /**
     * This property infers that the policy action can be applied at resource/operation or method level.
     */
    @JsonProperty("canAppliedAtResourceMethodLevel")
    protected Boolean canAppliedAtResourceMethodLevel;

    /**
     * Dependent list of policy enforcements. This policy enforcement can't be added with out the specified list of policy enforcement templates
     */
    @JsonProperty("dependentActions")
    protected List<String> dependentActions;

    @JsonProperty("dependentActionsConnector")
    protected String dependentActionsConnector;

    /**
     * Description for the policy enforcement
     */
    @JsonProperty("descriptions")
    protected List<PolicyMgmtInternationalizedString> descriptions;

    /**
     * The list contains the mutually exclusive policy enforcements with this policy enforcement
     */
    @JsonProperty("mutuallyExclusiveActions")
    protected List<String> mutuallyExclusiveActions;

    /**
     * Name of the policy enforcement along with the corresponding locale information
     */
    @JsonProperty("names")
    protected List<PolicyMgmtInternationalizedString> names;

    /**
     * Allowed occurrence for the respective policy enforcement. 
 1. Once - Policy enforcement can be added only once on the respective stage. 
 2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     */
    @JsonProperty("occurrence")
    protected String occurrence;

    /**
     * PolicyActionOrder is used to specify the policy enforcement order in its respective stage
     */
    @JsonProperty("order")
    protected PolicyMgmtPolicyActionOrder order;

    @JsonProperty("parameterTemplates")
    protected List<PolicyMgmtPolicyActionParameterTemplate> parameterTemplates;

    @JsonProperty("requiredParametersKeys")
    protected List<String> requiredParametersKeys;

    /**
     * Some policy enforcement can be added in multiple stages. This property specify it needs to be processed based on the stage it added.
     */
    @JsonProperty("stageSpecific")
    protected String stageSpecific;

    /**
     * A unique id  for this policy enforcement
     */
    @JsonProperty("templateKey")
    protected String templateKey;

    /**
     * Constructs a validated instance of {@link PolicyMgmtPolicyActionTemplate}.
     *
     * @param spec the specification to process
     */
    public PolicyMgmtPolicyActionTemplate(Consumer<PolicyMgmtPolicyActionTemplate> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyMgmtPolicyActionTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyMgmtPolicyActionTemplate(Consumer)} instead.
     * @param applicableServiceTypes Policy enforcement only applicable for the list of service type specified here
     * @param canAppliedAtResourceMethodLevel This property infers that the policy action can be applied at resource/operation or method level.
     * @param dependentActions Dependent list of policy enforcements. This policy enforcement can't be added with out the specified list of policy enforcement templates
     * @param dependentActionsConnector dependentActionsConnector
     * @param descriptions Description for the policy enforcement
     * @param mutuallyExclusiveActions The list contains the mutually exclusive policy enforcements with this policy enforcement
     * @param names Name of the policy enforcement along with the corresponding locale information
     * @param occurrence Allowed occurrence for the respective policy enforcement. 
 1. Once - Policy enforcement can be added only once on the respective stage. 
 2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     * @param order PolicyActionOrder is used to specify the policy enforcement order in its respective stage
     * @param parameterTemplates parameterTemplates
     * @param requiredParametersKeys requiredParametersKeys
     * @param stageSpecific Some policy enforcement can be added in multiple stages. This property specify it needs to be processed based on the stage it added.
     * @param templateKey A unique id  for this policy enforcement
     */
    @ApiStatus.Internal
    public PolicyMgmtPolicyActionTemplate(List<String> applicableServiceTypes, Boolean canAppliedAtResourceMethodLevel, List<String> dependentActions, String dependentActionsConnector, List<PolicyMgmtInternationalizedString> descriptions, List<String> mutuallyExclusiveActions, List<PolicyMgmtInternationalizedString> names, String occurrence, PolicyMgmtPolicyActionOrder order, List<PolicyMgmtPolicyActionParameterTemplate> parameterTemplates, List<String> requiredParametersKeys, String stageSpecific, String templateKey) {
        this.applicableServiceTypes = applicableServiceTypes;
        this.canAppliedAtResourceMethodLevel = canAppliedAtResourceMethodLevel;
        this.dependentActions = dependentActions;
        this.dependentActionsConnector = dependentActionsConnector;
        this.descriptions = descriptions;
        this.mutuallyExclusiveActions = mutuallyExclusiveActions;
        this.names = names;
        this.occurrence = occurrence;
        this.order = order;
        this.parameterTemplates = parameterTemplates;
        this.requiredParametersKeys = requiredParametersKeys;
        this.stageSpecific = stageSpecific;
        this.templateKey = templateKey;
    }
}

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
 * PolicyActionTemplate
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
@JsonTypeName("PolicyActionTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionTemplate {

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
    protected List<InternationalizedString> descriptions;

    /**
     * The list contains the mutually exclusive policy enforcements with this policy enforcement
     */
    @JsonProperty("mutuallyExclusiveActions")
    protected List<String> mutuallyExclusiveActions;

    /**
     * Name of the policy enforcement along with the corresponding locale information
     */
    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * Allowed occurrence for the respective policy enforcement.
     *  1. Once - Policy enforcement can be added only once on the respective stage.
     *  2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     */
    @JsonProperty("occurrence")
    protected OccurrenceEnum occurrence;

    @JsonProperty("order")
    protected PolicyActionOrder order;

    @JsonProperty("parameterTemplates")
    protected List<PolicyActionParameterTemplate> parameterTemplates;

    @JsonProperty("requiredParametersKeys")
    protected List<String> requiredParametersKeys;

    /**
     * Some policy enforcement can be added in multiple stages. This property specify it needs to be processed based on the stage it added.
     */
    @JsonProperty("stageSpecific")
    protected String stageSpecific;

    /**
     * A unique id
     * for this policy enforcement
     */
    @JsonProperty("templateKey")
    protected String templateKey;

    /**
     * Constructs a validated instance of {@link PolicyActionTemplate}.
     *
     * @param spec the specification to process
     */
    public PolicyActionTemplate(Consumer<PolicyActionTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyActionTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyActionTemplate(Consumer)} instead.
     * @param applicableServiceTypes Policy enforcement only applicable for the list of service type specified here
     * @param canAppliedAtResourceMethodLevel This property infers that the policy action can be applied at resource/operation or method level.
     * @param dependentActions Dependent list of policy enforcements. This policy enforcement can't be added with out the specified list of policy enforcement templates
     * @param dependentActionsConnector dependentActionsConnector
     * @param descriptions Description for the policy enforcement
     * @param mutuallyExclusiveActions The list contains the mutually exclusive policy enforcements with this policy enforcement
     * @param names Name of the policy enforcement along with the corresponding locale information
     * @param occurrence Allowed occurrence for the respective policy enforcement.   1. Once - Policy enforcement can be added only once on the respective stage.   2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     * @param order order
     * @param parameterTemplates parameterTemplates
     * @param requiredParametersKeys requiredParametersKeys
     * @param stageSpecific Some policy enforcement can be added in multiple stages. This property specify it needs to be processed based on the stage it added.
     * @param templateKey A unique id  for this policy enforcement
     */
    @ApiStatus.Internal
    public PolicyActionTemplate(List<String> applicableServiceTypes, Boolean canAppliedAtResourceMethodLevel, List<String> dependentActions, String dependentActionsConnector, List<InternationalizedString> descriptions, List<String> mutuallyExclusiveActions, List<InternationalizedString> names, OccurrenceEnum occurrence, PolicyActionOrder order, List<PolicyActionParameterTemplate> parameterTemplates, List<String> requiredParametersKeys, String stageSpecific, String templateKey) {
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

    /**
     * Allowed occurrence for the respective policy enforcement.
     *  1. Once - Policy enforcement can be added only once on the respective stage.
     *  2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     */
    @AllArgsConstructor
    public enum OccurrenceEnum {
        ONCE("once"),
        MULTIPLE("multiple");

        private static final OccurrenceEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OccurrenceEnum of(String input) {
            if (input != null) {
                for (OccurrenceEnum v : VALUES) {
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

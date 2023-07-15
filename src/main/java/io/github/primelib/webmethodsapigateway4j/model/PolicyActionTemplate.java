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
 * PolicyActionTemplate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PolicyActionTemplate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionTemplate(Consumer<PolicyActionTemplate> spec) {
        spec.accept(this);
    }

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
     * Allowed occurrence for the respective policy enforcement.
     *  1. Once - Policy enforcement can be added only once on the respective stage.
     *  2. Multiple - Policy enforcement can be added multiple times on the respective stage.
     */
    @AllArgsConstructor
    public enum OccurrenceEnum {
        ONCE("once"),
        MULTIPLE("multiple");

        private final String value;
    }

}

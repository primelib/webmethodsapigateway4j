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
 * PolicyMgmtPolicyActionParameterTemplate
 * <p>
 * A policy action parameter template defines the schema for a policy enforcement parameter. A policy enforcement can have one or more policy action parameters.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("PolicyMgmtPolicyActionParameterTemplate")
@JsonPropertyOrder({
    "applicableServiceTypes",
    "canRender",
    "defaultValues",
    "descriptions",
    "isArray",
    "isRequired",
    "names",
    "parameterTemplatesReference",
    "policyParaeterTemplates",
    "possibleValues",
    "requiredChildParameterKeys",
    "templateKey",
    "type"
})
@Generated(value = "io.github.primelib.primecodegen")
public class PolicyMgmtPolicyActionParameterTemplate {

    /**
     * List of Service type applicable for this policy action parameter
     */
    @JsonProperty("applicableServiceTypes")
    protected List<String> applicableServiceTypes;

    /**
     * UI specific property. This property infer it can be rendered on UI
     */
    @JsonProperty("canRender")
    protected Boolean canRender;

    /**
     * This contains the list of default values for this policy action parameter
     */
    @JsonProperty("defaultValues")
    protected List<Object> defaultValues;

    /**
     * Policy action parameter template description
     */
    @JsonProperty("descriptions")
    protected List<PolicyMgmtInternationalizedString> descriptions;

    /**
     * This property infers whether this policy action parameter can be an array
     */
    @JsonProperty("isArray")
    protected Boolean isArray;

    /**
     * This property infers if it is added to a policy enforcement then it is mandate to provide value for this policy action parameter
     */
    @JsonProperty("isRequired")
    protected Boolean isRequired;

    /**
     * Policy action parameter template name
     */
    @JsonProperty("names")
    protected List<PolicyMgmtInternationalizedString> names;

    @JsonProperty("parameterTemplatesReference")
    protected List<String> parameterTemplatesReference;

    @JsonProperty("policyParaeterTemplates")
    protected List<PolicyMgmtPolicyActionParameterTemplate> policyParaeterTemplates;

    @JsonProperty("possibleValues")
    protected List<PolicyMgmtPossibleValue> possibleValues;

    @JsonProperty("requiredChildParameterKeys")
    protected List<String> requiredChildParameterKeys;

    /**
     * Unique id for policy action parameter
     */
    @JsonProperty("templateKey")
    protected String templateKey;

    /**
     * Input file type
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link PolicyMgmtPolicyActionParameterTemplate}.
     *
     * @param spec the specification to process
     */
    public PolicyMgmtPolicyActionParameterTemplate(Consumer<PolicyMgmtPolicyActionParameterTemplate> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyMgmtPolicyActionParameterTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyMgmtPolicyActionParameterTemplate(Consumer)} instead.
     * @param applicableServiceTypes List of Service type applicable for this policy action parameter
     * @param canRender UI specific property. This property infer it can be rendered on UI
     * @param defaultValues This contains the list of default values for this policy action parameter
     * @param descriptions Policy action parameter template description
     * @param isArray This property infers whether this policy action parameter can be an array
     * @param isRequired This property infers if it is added to a policy enforcement then it is mandate to provide value for this policy action parameter
     * @param names Policy action parameter template name
     * @param parameterTemplatesReference parameterTemplatesReference
     * @param policyParaeterTemplates policyParaeterTemplates
     * @param possibleValues possibleValues
     * @param requiredChildParameterKeys requiredChildParameterKeys
     * @param templateKey Unique id for policy action parameter
     * @param type Input file type
     */
    @ApiStatus.Internal
    public PolicyMgmtPolicyActionParameterTemplate(List<String> applicableServiceTypes, Boolean canRender, List<Object> defaultValues, List<PolicyMgmtInternationalizedString> descriptions, Boolean isArray, Boolean isRequired, List<PolicyMgmtInternationalizedString> names, List<String> parameterTemplatesReference, List<PolicyMgmtPolicyActionParameterTemplate> policyParaeterTemplates, List<PolicyMgmtPossibleValue> possibleValues, List<String> requiredChildParameterKeys, String templateKey, String type) {
        this.applicableServiceTypes = applicableServiceTypes;
        this.canRender = canRender;
        this.defaultValues = defaultValues;
        this.descriptions = descriptions;
        this.isArray = isArray;
        this.isRequired = isRequired;
        this.names = names;
        this.parameterTemplatesReference = parameterTemplatesReference;
        this.policyParaeterTemplates = policyParaeterTemplates;
        this.possibleValues = possibleValues;
        this.requiredChildParameterKeys = requiredChildParameterKeys;
        this.templateKey = templateKey;
        this.type = type;
    }
}

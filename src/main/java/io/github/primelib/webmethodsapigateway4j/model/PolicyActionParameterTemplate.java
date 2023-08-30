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
 * PolicyActionParameterTemplate
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
@JsonTypeName("PolicyActionParameterTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionParameterTemplate {

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
    protected List<InternationalizedString> descriptions;

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
    protected List<InternationalizedString> names;

    @JsonProperty("parameterTemplatesReference")
    protected List<String> parameterTemplatesReference;

    @JsonProperty("policyParaeterTemplates")
    protected List<PolicyActionParameterTemplate> policyParaeterTemplates;

    @JsonProperty("possibleValues")
    protected List<PossibleValue> possibleValues;

    @JsonProperty("requiredChildParameterKeys")
    protected List<String> requiredChildParameterKeys;

    /**
     * Unique id for policy action parameter
     */
    @JsonProperty("templateKey")
    protected String templateKey;

    /**
     * Policy Action parameter data type.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link PolicyActionParameterTemplate}.
     *
     * @param spec the specification to process
     */
    public PolicyActionParameterTemplate(Consumer<PolicyActionParameterTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyActionParameterTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyActionParameterTemplate(Consumer)} instead.
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
     * @param type Policy Action parameter data type.
     */
    @ApiStatus.Internal
    public PolicyActionParameterTemplate(List<String> applicableServiceTypes, Boolean canRender, List<Object> defaultValues, List<InternationalizedString> descriptions, Boolean isArray, Boolean isRequired, List<InternationalizedString> names, List<String> parameterTemplatesReference, List<PolicyActionParameterTemplate> policyParaeterTemplates, List<PossibleValue> possibleValues, List<String> requiredChildParameterKeys, String templateKey, TypeEnum type) {
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

    /**
     * Policy Action parameter data type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        STRING("STRING"),
        TEXT("TEXT"),
        INT("INT"),
        LONG("LONG"),
        DOUBLE("DOUBLE"),
        BOOLEAN("BOOLEAN"),
        XPATH("XPATH"),
        FILE("FILE"),
        ESB("ESB"),
        OBJECT("OBJECT"),
        SECURESTRING("SECURESTRING");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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

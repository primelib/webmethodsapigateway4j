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
 * PolicyActionParameterTemplate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PolicyActionParameterTemplate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionParameterTemplate(Consumer<PolicyActionParameterTemplate> spec) {
        spec.accept(this);
    }

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

        private final String value;
    }

}

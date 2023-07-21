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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyActionParameter
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
    "extendedProperties",
    "parameters",
    "templateKey",
    "type",
    "values"
})
@JsonTypeName("PolicyActionParameter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionParameter {

    @JsonProperty("extendedProperties")
    protected List<ExtendedProperties> extendedProperties;

    /**
     * If this policy action parameter is complex type then array of policy action parameter will be the value for this parameter template key
     */
    @JsonProperty("parameters")
    protected List<PolicyActionParameter> parameters;

    /**
     * parameter template key.
     */
    @JsonProperty("templateKey")
    protected String templateKey;

    @JsonProperty("type")
    protected String type;

    /**
     * array of values for this parameter template key
     */
    @JsonProperty("values")
    protected List<String> values;

    /**
     * Constructs a validated instance of {@link PolicyActionParameter}.
     *
     * @param spec the specification to process
     */
    public PolicyActionParameter(Consumer<PolicyActionParameter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyActionParameter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyActionParameter(Consumer)} instead.
     * @param extendedProperties var.name
     * @param parameters If this policy action parameter is complex type then array of policy action parameter will be the value for this parameter template key
     * @param templateKey parameter template key.
     * @param type var.name
     * @param values array of values for this parameter template key
     */
    @ApiStatus.Internal
    public PolicyActionParameter(List<ExtendedProperties> extendedProperties, List<PolicyActionParameter> parameters, String templateKey, String type, List<String> values) {
        this.extendedProperties = extendedProperties;
        this.parameters = parameters;
        this.templateKey = templateKey;
        this.type = type;
        this.values = values;
    }

}

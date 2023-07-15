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
 * PolicyActionParameter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link PolicyActionParameter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionParameter(Consumer<PolicyActionParameter> spec) {
        spec.accept(this);
    }

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


}

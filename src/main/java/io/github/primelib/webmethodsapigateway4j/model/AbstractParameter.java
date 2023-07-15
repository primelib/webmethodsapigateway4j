package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AbstractParameter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allowEmptyValue",
    "description",
    "get$ref",
    "in",
    "name",
    "required",
    "vendorExtensions"
})
@JsonTypeName("AbstractParameter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AbstractParameter {

    /**
     * Constructs a validated implementation of {@link AbstractParameter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AbstractParameter(Consumer<AbstractParameter> spec) {
        spec.accept(this);
    }

    /**
     * Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value
     */
    @JsonProperty("allowEmptyValue")
    protected Boolean allowEmptyValue;

    /**
     * A brief description of the parameter. This could contain examples of use
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The available paths and operations for the API
     */
    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * The location of the parameter. Possible values are "query", "header", "path" or "cookie"
     */
    @JsonProperty("in")
    protected String in;

    /**
     * The name of the parameter. Parameter names are case sensitive
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     */
    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

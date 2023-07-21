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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AbstractParameter
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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link AbstractParameter}.
     *
     * @param spec the specification to process
     */
    public AbstractParameter(Consumer<AbstractParameter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AbstractParameter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AbstractParameter(Consumer)} instead.
     * @param allowEmptyValue Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value
     * @param description A brief description of the parameter. This could contain examples of use
     * @param get$ref The available paths and operations for the API
     * @param in The location of the parameter. Possible values are "query", "header", "path" or "cookie"
     * @param name The name of the parameter. Parameter names are case sensitive
     * @param required Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public AbstractParameter(Boolean allowEmptyValue, String description, String get$ref, String in, String name, Boolean required, Map<String, Object> vendorExtensions) {
        this.allowEmptyValue = allowEmptyValue;
        this.description = description;
        this.get$ref = get$ref;
        this.in = in;
        this.name = name;
        this.required = required;
        this.vendorExtensions = vendorExtensions;
    }

}

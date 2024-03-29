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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CookieParameter
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
    "_enum",
    "allowEmptyValue",
    "allowReserved",
    "content",
    "default",
    "deprecated",
    "description",
    "examples",
    "explode",
    "extendedExample",
    "get$ref",
    "in",
    "name",
    "parameterSchema",
    "required",
    "style",
    "vendorExtensions",
    "xpath"
})
@JsonTypeName("CookieParameter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CookieParameter {

    @JsonProperty("_enum")
    protected List<String> __enum;

    /**
     * Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value
     */
    @JsonProperty("allowEmptyValue")
    protected Boolean allowEmptyValue;

    /**
     * Determines whether the parameter value SHOULD allow reserved characters, as defined by RFC3986 :/?#[]@!$&amp;'()*+,;= to be included without percent-encoding. This property only applies to parameters with an in value of query. The default value is false
     */
    @JsonProperty("allowReserved")
    protected Boolean allowReserved;

    /**
     * A map containing the representations for the parameter. The key is the media type and the value describes it. The map MUST only contain one entry
     */
    @JsonProperty("content")
    protected Map<String, MediaType> content;

    @JsonProperty("default")
    protected String _default;

    /**
     * Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     */
    @JsonProperty("deprecated")
    protected Boolean deprecated;

    /**
     * A brief description of the parameter. This could contain examples of use
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Examples of the media type. Each example SHOULD contain a value in the correct format as specified in the parameter encoding. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
     */
    @JsonProperty("examples")
    protected Map<String, Example> examples;

    /**
     * When this is true, parameter values of type array or object generate separate parameters for each value of the array or key-value pair of the map. For other types of parameters this property has no effect. When style is form, the default value is true. For all other styles, the default value is false
     */
    @JsonProperty("explode")
    protected Boolean explode;

    /**
     * Example of the media type. The example SHOULD match the specified schema and encoding properties if present. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema. To represent examples of media types that cannot naturally be represented in JSON or YAML, a string value can contain the example with escaping where necessary
     */
    @JsonProperty("extendedExample")
    protected Object extendedExample;

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

    @JsonProperty("parameterSchema")
    protected ParameterSchema parameterSchema;

    /**
     * Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     */
    @JsonProperty("required")
    protected Boolean required;

    /**
     * Describes how the parameter value will be serialized depending on the type of the parameter value. Default values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form
     */
    @JsonProperty("style")
    protected StyleEnum style;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    @JsonProperty("xpath")
    protected Xpath xpath;

    /**
     * Constructs a validated instance of {@link CookieParameter}.
     *
     * @param spec the specification to process
     */
    public CookieParameter(Consumer<CookieParameter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CookieParameter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CookieParameter(Consumer)} instead.
     * @param __enum __enum
     * @param allowEmptyValue Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value
     * @param allowReserved Determines whether the parameter value SHOULD allow reserved characters, as defined by RFC3986 :/?#[]@!$&amp;'()*+,;= to be included without percent-encoding. This property only applies to parameters with an in value of query. The default value is false
     * @param content A map containing the representations for the parameter. The key is the media type and the value describes it. The map MUST only contain one entry
     * @param _default _default
     * @param deprecated Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     * @param description A brief description of the parameter. This could contain examples of use
     * @param examples Examples of the media type. Each example SHOULD contain a value in the correct format as specified in the parameter encoding. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema
     * @param explode When this is true, parameter values of type array or object generate separate parameters for each value of the array or key-value pair of the map. For other types of parameters this property has no effect. When style is form, the default value is true. For all other styles, the default value is false
     * @param extendedExample Example of the media type. The example SHOULD match the specified schema and encoding properties if present. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema. To represent examples of media types that cannot naturally be represented in JSON or YAML, a string value can contain the example with escaping where necessary
     * @param get$ref The available paths and operations for the API
     * @param in The location of the parameter. Possible values are "query", "header", "path" or "cookie"
     * @param name The name of the parameter. Parameter names are case sensitive
     * @param parameterSchema parameterSchema
     * @param required Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false
     * @param style Describes how the parameter value will be serialized depending on the type of the parameter value. Default values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form
     * @param vendorExtensions vendorExtensions
     * @param xpath xpath
     */
    @ApiStatus.Internal
    public CookieParameter(List<String> __enum, Boolean allowEmptyValue, Boolean allowReserved, Map<String, MediaType> content, String _default, Boolean deprecated, String description, Map<String, Example> examples, Boolean explode, Object extendedExample, String get$ref, String in, String name, ParameterSchema parameterSchema, Boolean required, StyleEnum style, Map<String, Object> vendorExtensions, Xpath xpath) {
        this.__enum = __enum;
        this.allowEmptyValue = allowEmptyValue;
        this.allowReserved = allowReserved;
        this.content = content;
        this._default = _default;
        this.deprecated = deprecated;
        this.description = description;
        this.examples = examples;
        this.explode = explode;
        this.extendedExample = extendedExample;
        this.get$ref = get$ref;
        this.in = in;
        this.name = name;
        this.parameterSchema = parameterSchema;
        this.required = required;
        this.style = style;
        this.vendorExtensions = vendorExtensions;
        this.xpath = xpath;
    }

    /**
     * Describes how the parameter value will be serialized depending on the type of the parameter value. Default values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form
     */
    @AllArgsConstructor
    public enum StyleEnum {
        MATRIX("MATRIX"),
        LABEL("LABEL"),
        FORM("FORM"),
        SIMPLE("SIMPLE"),
        SPACEDELIMITED("SPACEDELIMITED"),
        PIPEDELIMITED("PIPEDELIMITED"),
        DEEPOBJECT("DEEPOBJECT");

        private static final StyleEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StyleEnum of(String input) {
            if (input != null) {
                for (StyleEnum v : VALUES) {
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

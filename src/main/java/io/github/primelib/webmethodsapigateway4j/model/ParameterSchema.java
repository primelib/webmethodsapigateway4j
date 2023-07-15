package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ParameterSchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "additionalProperties",
    "additionalPropertiesAsBoolean",
    "default",
    "deprecated",
    "description",
    "enum",
    "example",
    "exclusiveMaximum",
    "exclusiveMinimum",
    "externalDocs",
    "format",
    "get$ref",
    "maxItems",
    "maxLength",
    "maxProperties",
    "maximum",
    "minItems",
    "minLength",
    "minProperties",
    "minimum",
    "multipleOf",
    "name",
    "not",
    "nullable",
    "pattern",
    "properties",
    "readOnly",
    "required",
    "title",
    "type",
    "uniqueItems",
    "vendorExtensions",
    "writeOnly",
    "xml"
})
@JsonTypeName("ParameterSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParameterSchema<T> {

    /**
     * Constructs a validated implementation of {@link ParameterSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ParameterSchema(Consumer<ParameterSchema> spec) {
        spec.accept(this);
    }

    @JsonProperty("additionalProperties")
    protected ParameterSchema additionalProperties;

    @JsonProperty("additionalPropertiesAsBoolean")
    protected Boolean additionalPropertiesAsBoolean;

    /**
     * The default value represents what would be assumed by the consumer of the input as the value of the schema if one is not provided. Unlike JSON Schema, the value MUST conform to the defined type for the Schema Object defined at the same level. For example, if type is string, then default can be "foo" but cannot be 1
     */
    @JsonProperty("default")
    protected Object _default;

    /**
     * Specifies that a schema is deprecated and SHOULD be transitioned out of usage. Default value is false
     */
    @JsonProperty("deprecated")
    protected Boolean deprecated;

    /**
     * Provide a more lengthy explanation about the purpose of the data described by the schema
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("enum")
    protected List<T> _enum;

    /**
     * A free-form property to include an example of an instance for this schema. To represent examples that cannot be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where necessary
     */
    @JsonProperty("example")
    protected Object example;

    /**
     * Indicate whether maximum are exclusive of the value
     */
    @JsonProperty("exclusiveMaximum")
    protected Boolean exclusiveMaximum;

    /**
     * Indicate whether minimum are exclusive of the value
     */
    @JsonProperty("exclusiveMinimum")
    protected Boolean exclusiveMinimum;

    @JsonProperty("externalDocs")
    protected ExternalDocs externalDocs;

    /**
     * The format keyword allows for basic semantic validation on certain kinds of string values that are commonly used
     */
    @JsonProperty("format")
    protected String format;

    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * The maximum length of the array can be specified
     */
    @JsonProperty("maxItems")
    protected Integer maxItems;

    /**
     * The maximum length of a string can be constrained using the minLength
     */
    @JsonProperty("maxLength")
    protected Integer maxLength;

    /**
     * The maximum number of properties on an object can be restricted
     */
    @JsonProperty("maxProperties")
    protected Integer maxProperties;

    /**
     * Upper limit in the ranges of numbers, (or exclusiveMinimum and exclusiveMaximum for expressing exclusive range)
     */
    @JsonProperty("maximum")
    protected BigDecimal maximum;

    /**
     * The minimum length of the array can be specified
     */
    @JsonProperty("minItems")
    protected Integer minItems;

    /**
     * The minimum length of a string can be constrained using the minLength
     */
    @JsonProperty("minLength")
    protected Integer minLength;

    /**
     * The minimum number of properties on an object can be restricted
     */
    @JsonProperty("minProperties")
    protected Integer minProperties;

    /**
     * Lower limit in the ranges of numbers
     */
    @JsonProperty("minimum")
    protected BigDecimal minimum;

    /**
     * Numbers can be restricted to a multiple of a given number, using the multipleOf keyword. It may be set to any positive number.
     */
    @JsonProperty("multipleOf")
    protected BigDecimal multipleOf;

    /**
     * User defined name for the property
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("not")
    protected ParameterSchema not;

    /**
     * Allows sending a null value for the defined schema. Default value is false
     */
    @JsonProperty("nullable")
    protected Boolean nullable;

    /**
     * The pattern keyword is used to restrict a string to a particular regular expression. The regular expression syntax is the one defined in JavaScript (ECMA 262 specifically)
     */
    @JsonProperty("pattern")
    protected String pattern;

    /**
     * The properties (key-value pairs) on an object are defined using the properties keyword. The value of properties is an object, where each key is the name of a property and each value is of type schema used to validate that property
     */
    @JsonProperty("properties")
    protected Map<String, ParameterSchema> properties = new HashMap<>();

    /**
     * Relevant only for Schema "properties" definitions. Declares the property as "read only". This means that it MAY be sent as part of a response but SHOULD NOT be sent as part of the request. If the property is marked as readOnly being true and is in the required list, the required will take effect on the response only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false
     */
    @JsonProperty("readOnly")
    protected Boolean readOnly;

    /**
     * By default, the properties defined by the properties keyword are not required. However, one can provide a list of required properties using the required keyword. The required keyword takes an array of zero or more strings. Each of these strings must be unique.
     */
    @JsonProperty("required")
    protected List<String> required;

    /**
     * User defined title for the property
     */
    @JsonProperty("title")
    protected String title;

    /**
     * It specifies the data type for a schema
     */
    @JsonProperty("type")
    protected String type;

    /**
     * A schema can ensure that each of the items in an array is unique. Simply set the uniqueItems keyword to true
     */
    @JsonProperty("uniqueItems")
    protected Boolean uniqueItems;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();

    /**
     * Relevant only for Schema "properties" definitions. Declares the property as "write only". Therefore, it MAY be sent as part of a request but SHOULD NOT be sent as part of the response. If the property is marked as writeOnly being true and is in the required list, the required will take effect on the request only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false
     */
    @JsonProperty("writeOnly")
    protected Boolean writeOnly;

    @JsonProperty("xml")
    protected Xml xml;


}

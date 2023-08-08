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
 * Property
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
    "access",
    "allowEmptyValue",
    "description",
    "example",
    "format",
    "name",
    "position",
    "readOnly",
    "required",
    "title",
    "type",
    "vendorExtensions",
    "xml"
})
@JsonTypeName("Property")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Property {

    @JsonProperty("access")
    protected String access;

    @JsonProperty("allowEmptyValue")
    protected Boolean allowEmptyValue;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("example")
    protected Object example;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("position")
    protected Integer position;

    @JsonProperty("readOnly")
    protected Boolean readOnly;

    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    @JsonProperty("xml")
    protected Xml xml;

    /**
     * Constructs a validated instance of {@link Property}.
     *
     * @param spec the specification to process
     */
    public Property(Consumer<Property> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Property}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Property(Consumer)} instead.
     * @param access access
     * @param allowEmptyValue allowEmptyValue
     * @param description description
     * @param example example
     * @param format format
     * @param name name
     * @param position position
     * @param readOnly readOnly
     * @param required required
     * @param title title
     * @param type type
     * @param vendorExtensions vendorExtensions
     * @param xml xml
     */
    @ApiStatus.Internal
    public Property(String access, Boolean allowEmptyValue, String description, Object example, String format, String name, Integer position, Boolean readOnly, Boolean required, String title, String type, Map<String, Object> vendorExtensions, Xml xml) {
        this.access = access;
        this.allowEmptyValue = allowEmptyValue;
        this.description = description;
        this.example = example;
        this.format = format;
        this.name = name;
        this.position = position;
        this.readOnly = readOnly;
        this.required = required;
        this.title = title;
        this.type = type;
        this.vendorExtensions = vendorExtensions;
        this.xml = xml;
    }

}

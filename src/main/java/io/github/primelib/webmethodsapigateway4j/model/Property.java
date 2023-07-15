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
 * Property
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Property}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Property(Consumer<Property> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();

    @JsonProperty("xml")
    protected Xml xml;


}

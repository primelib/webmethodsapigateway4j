package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * ModelImpl
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "additionalProperties",
    "allowEmptyValue",
    "defaultValue",
    "discriminator",
    "enum",
    "format",
    "maximum",
    "minimum",
    "name",
    "properties",
    "required",
    "uniqueItems",
    "xml"
})
@JsonTypeName("ModelImpl")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ModelImpl extends Model<Property> {

    /**
     * Constructs a validated implementation of {@link ModelImpl}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ModelImpl(Consumer<ModelImpl> spec) {
        spec.accept(this);
    }

    @JsonProperty("additionalProperties")
    protected Object additionalProperties;

    @JsonProperty("allowEmptyValue")
    protected Boolean allowEmptyValue;

    @JsonProperty("defaultValue")
    protected Object defaultValue;

    @JsonProperty("discriminator")
    protected String discriminator;

    @JsonProperty("enum")
    protected List<String> _enum;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("maximum")
    protected BigDecimal maximum;

    @JsonProperty("minimum")
    protected BigDecimal minimum;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("properties")
    protected Map<String, Property> properties = new HashMap<>();

    @JsonProperty("required")
    protected List<String> required;

    @JsonProperty("uniqueItems")
    protected Boolean uniqueItems;

    @JsonProperty("xml")
    protected Xml xml;


}

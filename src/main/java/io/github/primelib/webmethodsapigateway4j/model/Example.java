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
 * Example
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
    "description",
    "externalValue",
    "get$ref",
    "summary",
    "value",
    "vendorExtensions"
})
@JsonTypeName("Example")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Example {

    /**
     * Long description for the example
     */
    @JsonProperty("description")
    protected String description;

    /**
     * A URL that points to the literal example. This provides the capability to reference examples that cannot easily be included in JSON or YAML documents. The value field and externalValue field are mutually exclusive
     */
    @JsonProperty("externalValue")
    protected String externalValue;

    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * Short description for the example
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * Embedded literal example. The value field and externalValue field are mutually exclusive. To represent examples of media types that cannot naturally represented in JSON or YAML, use a string value to contain the example, escaping where necessary
     */
    @JsonProperty("value")
    protected Object value;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Example}.
     *
     * @param spec the specification to process
     */
    public Example(Consumer<Example> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Example}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Example(Consumer)} instead.
     * @param description Long description for the example
     * @param externalValue A URL that points to the literal example. This provides the capability to reference examples that cannot easily be included in JSON or YAML documents. The value field and externalValue field are mutually exclusive
     * @param get$ref get$ref
     * @param summary Short description for the example
     * @param value Embedded literal example. The value field and externalValue field are mutually exclusive. To represent examples of media types that cannot naturally represented in JSON or YAML, use a string value to contain the example, escaping where necessary
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Example(String description, String externalValue, String get$ref, String summary, Object value, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.externalValue = externalValue;
        this.get$ref = get$ref;
        this.summary = summary;
        this.value = value;
        this.vendorExtensions = vendorExtensions;
    }

}

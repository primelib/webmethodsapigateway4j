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
 * Example
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Example}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Example(Consumer<Example> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

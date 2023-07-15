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
 * RequestBody
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "content",
    "description",
    "get$ref",
    "required",
    "vendorExtensions"
})
@JsonTypeName("RequestBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RequestBody {

    /**
     * Constructs a validated implementation of {@link RequestBody}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RequestBody(Consumer<RequestBody> spec) {
        spec.accept(this);
    }

    /**
     * The content of the request body. The key is a media type or media type range and the value describes it
     */
    @JsonProperty("content")
    protected Map<String, MediaType> content = new HashMap<>();

    /**
     * A brief description of the request body. This could contain examples of use
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * Determines if the request body is required in the request. Defaults to false
     */
    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

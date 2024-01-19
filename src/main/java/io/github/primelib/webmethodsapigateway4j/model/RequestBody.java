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
 * RequestBody
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
     * The content of the request body. The key is a media type or media type range and the value describes it
     */
    @JsonProperty("content")
    protected Map<String, MediaType> content;

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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link RequestBody}.
     *
     * @param spec the specification to process
     */
    public RequestBody(Consumer<RequestBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RequestBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RequestBody(Consumer)} instead.
     * @param content The content of the request body. The key is a media type or media type range and the value describes it
     * @param description A brief description of the request body. This could contain examples of use
     * @param get$ref get$ref
     * @param required Determines if the request body is required in the request. Defaults to false
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public RequestBody(Map<String, MediaType> content, String description, String get$ref, Boolean required, Map<String, Object> vendorExtensions) {
        this.content = content;
        this.description = description;
        this.get$ref = get$ref;
        this.required = required;
        this.vendorExtensions = vendorExtensions;
    }

}

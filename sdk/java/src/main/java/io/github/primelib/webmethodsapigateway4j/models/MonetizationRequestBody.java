// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * MonetizationRequestBody
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationRequestBody")
@JsonPropertyOrder({
    "content",
    "description",
    "getref",
    "required",
    "vendorExtensions"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationRequestBody {

    /**
     * A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it
     */
    @JsonProperty("content")
    protected Map<String, ServiceMgmtMediaType> content;

    /**
     * A brief description of the request body. This could contain examples of use
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("get$ref")
    protected String getref;

    /**
     * Determines if the request body is required in the request. Defaults to false
     */
    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link MonetizationRequestBody}.
     *
     * @param spec the specification to process
     */
    public MonetizationRequestBody(Consumer<MonetizationRequestBody> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationRequestBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationRequestBody(Consumer)} instead.
     * @param content A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it
     * @param description A brief description of the request body. This could contain examples of use
     * @param getref getref
     * @param required Determines if the request body is required in the request. Defaults to false
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public MonetizationRequestBody(Map<String, ServiceMgmtMediaType> content, String description, String getref, Boolean required, Map<String, Object> vendorExtensions) {
        this.content = content;
        this.description = description;
        this.getref = getref;
        this.required = required;
        this.vendorExtensions = vendorExtensions;
    }
}

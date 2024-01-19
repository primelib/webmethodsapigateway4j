package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Objects;
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
 * Response
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
    "headersV3",
    "links",
    "vendorExtensions"
})
@JsonTypeName("Response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Response {

    /**
     * A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it
     */
    @JsonProperty("content")
    protected Map<String, MediaType> content;

    /**
     * A short description of the response
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("get$ref")
    protected String get$ref;

    /**
     * Maps a header name to its definition. RFC7230 states header names are case insensitive. If a response header is defined with the name "Content-Type", it SHALL be ignored
     */
    @JsonProperty("headersV3")
    protected Map<String, Header> headersV3;

    /**
     * A map of operations links that can be followed from the response. The key of the map is a short name for the link, following the naming constraints of the names for Component Objects.
     */
    @JsonProperty("links")
    protected Map<String, Link> links;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Response}.
     *
     * @param spec the specification to process
     */
    public Response(Consumer<Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Response(Consumer)} instead.
     * @param content A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it
     * @param description A short description of the response
     * @param get$ref get$ref
     * @param headersV3 Maps a header name to its definition. RFC7230 states header names are case insensitive. If a response header is defined with the name "Content-Type", it SHALL be ignored
     * @param links A map of operations links that can be followed from the response. The key of the map is a short name for the link, following the naming constraints of the names for Component Objects.
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Response(Map<String, MediaType> content, String description, String get$ref, Map<String, Header> headersV3, Map<String, Link> links, Map<String, Object> vendorExtensions) {
        this.content = content;
        this.description = description;
        this.get$ref = get$ref;
        this.headersV3 = headersV3;
        this.links = links;
        this.vendorExtensions = vendorExtensions;
    }

}

package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Objects;
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
 * Response
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
    "headersV3",
    "links",
    "vendorExtensions"
})
@JsonTypeName("Response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Response {

    /**
     * Constructs a validated implementation of {@link Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Response(Consumer<Response> spec) {
        spec.accept(this);
    }

    /**
     * A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it
     */
    @JsonProperty("content")
    protected Map<String, MediaType> content = new HashMap<>();

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
    protected Map<String, Header> headersV3 = new HashMap<>();

    /**
     * A map of operations links that can be followed from the response. The key of the map is a short name for the link, following the naming constraints of the names for Component Objects.
     */
    @JsonProperty("links")
    protected Map<String, Link> links = new HashMap<>();

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

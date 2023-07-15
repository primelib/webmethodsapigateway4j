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
 * Server
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "url",
    "variables",
    "vendorExtensions"
})
@JsonTypeName("Server")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Server {

    /**
     * Constructs a validated implementation of {@link Server}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Server(Consumer<Server> spec) {
        spec.accept(this);
    }

    /**
     * An optional string describing the host designated by the URL
     */
    @JsonProperty("description")
    protected String description;

    /**
     * A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served. Variable substitutions will be made when a variable is named in {brackets}
     */
    @JsonProperty("url")
    protected String url;

    /**
     * A map between a variable name and its value. The value is used for substitution in the server's URL template
     */
    @JsonProperty("variables")
    protected Map<String, ServerVariable> variables = new HashMap<>();

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

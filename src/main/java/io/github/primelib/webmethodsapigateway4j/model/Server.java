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
 * Server
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
    "url",
    "variables",
    "vendorExtensions"
})
@JsonTypeName("Server")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Server {

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
    protected Map<String, ServerVariable> variables;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Server}.
     *
     * @param spec the specification to process
     */
    public Server(Consumer<Server> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Server}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Server(Consumer)} instead.
     * @param description An optional string describing the host designated by the URL
     * @param url A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served. Variable substitutions will be made when a variable is named in {brackets}
     * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Server(String description, String url, Map<String, ServerVariable> variables, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.url = url;
        this.variables = variables;
        this.vendorExtensions = vendorExtensions;
    }

}

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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RestEnabledPath
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
    "delete",
    "description",
    "displayName",
    "enabled",
    "get",
    "get$ref",
    "head",
    "invokePath",
    "name",
    "options",
    "parameters",
    "patch",
    "post",
    "put",
    "scopes",
    "summary",
    "tags",
    "trace",
    "vendorExtensions"
})
@JsonTypeName("RestEnabledPath")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RestEnabledPath {

    @JsonProperty("delete")
    protected Operation delete;

    /**
     * An optional, string description, intended to apply to all operations in this path
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("displayName")
    protected String displayName;

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("get")
    protected Operation get;

    /**
     * Allows for an external definition of this path item
     */
    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("head")
    protected Operation head;

    @JsonProperty("invokePath")
    protected String invokePath;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("options")
    protected Operation options;

    /**
     * A list of parameters that are applicable for all the operations described under this path. These parameters can be overridden at the operation level, but cannot be removed there
     */
    @JsonProperty("parameters")
    protected List<Object> parameters;

    @JsonProperty("patch")
    protected Operation patch;

    @JsonProperty("post")
    protected Operation post;

    @JsonProperty("put")
    protected Operation put;

    @JsonProperty("scopes")
    protected List<String> scopes;

    /**
     * An optional, string summary, intended to apply to all operations in this path
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("tags")
    protected List<String> tags;

    @JsonProperty("trace")
    protected Operation trace;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link RestEnabledPath}.
     *
     * @param spec the specification to process
     */
    public RestEnabledPath(Consumer<RestEnabledPath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RestEnabledPath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RestEnabledPath(Consumer)} instead.
     * @param delete var.name
     * @param description An optional, string description, intended to apply to all operations in this path
     * @param displayName var.name
     * @param enabled var.name
     * @param get var.name
     * @param get$ref Allows for an external definition of this path item
     * @param head var.name
     * @param invokePath var.name
     * @param name var.name
     * @param options var.name
     * @param parameters A list of parameters that are applicable for all the operations described under this path. These parameters can be overridden at the operation level, but cannot be removed there
     * @param patch var.name
     * @param post var.name
     * @param put var.name
     * @param scopes var.name
     * @param summary An optional, string summary, intended to apply to all operations in this path
     * @param tags var.name
     * @param trace var.name
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public RestEnabledPath(Operation delete, String description, String displayName, Boolean enabled, Operation get, String get$ref, Operation head, String invokePath, String name, Operation options, List<Object> parameters, Operation patch, Operation post, Operation put, List<String> scopes, String summary, List<String> tags, Operation trace, Map<String, Object> vendorExtensions) {
        this.delete = delete;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.get = get;
        this.get$ref = get$ref;
        this.head = head;
        this.invokePath = invokePath;
        this.name = name;
        this.options = options;
        this.parameters = parameters;
        this.patch = patch;
        this.post = post;
        this.put = put;
        this.scopes = scopes;
        this.summary = summary;
        this.tags = tags;
        this.trace = trace;
        this.vendorExtensions = vendorExtensions;
    }

}

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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RestEnabledPath
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link RestEnabledPath}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RestEnabledPath(Consumer<RestEnabledPath> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

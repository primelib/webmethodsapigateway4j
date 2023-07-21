package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Objects;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RestAPI
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiTags",
    "components",
    "externalDocs",
    "info",
    "paths",
    "servers",
    "serviceRegistryDisplayName",
    "tags",
    "vendorExtensions"
})
@JsonTypeName("RestAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RestAPI extends API {

    /**
     * A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     */
    @JsonProperty("apiTags")
    protected List<String> apiTags;

    @JsonProperty("components")
    protected Components components;

    /**
     * Additional external documentation
     */
    @JsonProperty("externalDocs")
    protected List<ExternalDocs> externalDocs;

    @JsonProperty("info")
    protected Info info;

    /**
     * The available paths and operations for the API
     */
    @JsonProperty("paths")
    protected Map<String, Path> paths;

    /**
     * An array of Server Objects, which provide connectivity information to a target server
     */
    @JsonProperty("servers")
    protected List<Server> servers;

    /**
     * The name of the API in service registry when the API is published to a service registry.
     */
    @JsonProperty("serviceRegistryDisplayName")
    protected String serviceRegistryDisplayName;

    /**
     * A list of tags with additional metadata
     */
    @JsonProperty("tags")
    protected List<Tag> tags;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link RestAPI}.
     *
     * @param spec the specification to process
     */
    public RestAPI(Consumer<RestAPI> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RestAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RestAPI(Consumer)} instead.
     * @param apiTags A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     * @param components var.name
     * @param externalDocs Additional external documentation
     * @param info var.name
     * @param paths The available paths and operations for the API
     * @param servers An array of Server Objects, which provide connectivity information to a target server
     * @param serviceRegistryDisplayName The name of the API in service registry when the API is published to a service registry.
     * @param tags A list of tags with additional metadata
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public RestAPI(List<String> apiTags, Components components, List<ExternalDocs> externalDocs, Info info, Map<String, Path> paths, List<Server> servers, String serviceRegistryDisplayName, List<Tag> tags, Map<String, Object> vendorExtensions) {
        this.apiTags = apiTags;
        this.components = components;
        this.externalDocs = externalDocs;
        this.info = info;
        this.paths = paths;
        this.servers = servers;
        this.serviceRegistryDisplayName = serviceRegistryDisplayName;
        this.tags = tags;
        this.vendorExtensions = vendorExtensions;
    }

}

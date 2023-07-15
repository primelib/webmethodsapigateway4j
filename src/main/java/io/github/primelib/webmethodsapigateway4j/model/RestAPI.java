package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Objects;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * RestAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
     * Constructs a validated implementation of {@link RestAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RestAPI(Consumer<RestAPI> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Path> paths = new HashMap<>();

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

package io.github.primelib.webmethodsapigateway4j.model;

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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GraphQLAPI
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
    "nativeEndpoints",
    "sdlDefinitions",
    "serviceRegistryDisplayName",
    "tags"
})
@JsonTypeName("GraphQLAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GraphQLAPI extends API {

    /**
     * A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     */
    @JsonProperty("apiTags")
    protected List<String> apiTags;

    /**
     * Native endpoints
     */
    @JsonProperty("nativeEndpoints")
    protected List<NativeEndpoint> nativeEndpoints;

    @JsonProperty("sdlDefinitions")
    protected GqlSDLDefinitions sdlDefinitions;

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

    /**
     * Constructs a validated instance of {@link GraphQLAPI}.
     *
     * @param spec the specification to process
     */
    public GraphQLAPI(Consumer<GraphQLAPI> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GraphQLAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GraphQLAPI(Consumer)} instead.
     * @param apiTags A list of API level tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     * @param nativeEndpoints Native endpoints
     * @param sdlDefinitions var.name
     * @param serviceRegistryDisplayName The name of the API in service registry when the API is published to a service registry.
     * @param tags A list of tags with additional metadata
     */
    @ApiStatus.Internal
    public GraphQLAPI(List<String> apiTags, List<NativeEndpoint> nativeEndpoints, GqlSDLDefinitions sdlDefinitions, String serviceRegistryDisplayName, List<Tag> tags) {
        this.apiTags = apiTags;
        this.nativeEndpoints = nativeEndpoints;
        this.sdlDefinitions = sdlDefinitions;
        this.serviceRegistryDisplayName = serviceRegistryDisplayName;
        this.tags = tags;
    }

}

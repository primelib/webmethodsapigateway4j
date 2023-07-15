package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GraphQLAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
     * Constructs a validated implementation of {@link GraphQLAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GraphQLAPI(Consumer<GraphQLAPI> spec) {
        spec.accept(this);
    }

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


}

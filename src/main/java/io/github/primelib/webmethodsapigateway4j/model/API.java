package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiTags",
    "description",
    "serviceRegistryDisplayName",
    "tags",
    "title",
    "type",
    "uri",
    "version"
})
@JsonTypeName("API")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class API {

    /**
     * Constructs a validated implementation of {@link API}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public API(Consumer<API> spec) {
        spec.accept(this);
    }

    @JsonProperty("apiTags")
    protected List<String> apiTags;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("serviceRegistryDisplayName")
    protected String serviceRegistryDisplayName;

    @JsonProperty("tags")
    protected List<Tag> tags;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("uri")
    protected Set<String> uri;

    @JsonProperty("version")
    protected String version;


}

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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API
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

    /**
     * Constructs a validated instance of {@link API}.
     *
     * @param spec the specification to process
     */
    public API(Consumer<API> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link API}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #API(Consumer)} instead.
     * @param apiTags apiTags
     * @param description description
     * @param serviceRegistryDisplayName serviceRegistryDisplayName
     * @param tags tags
     * @param title title
     * @param type type
     * @param uri uri
     * @param version version
     */
    @ApiStatus.Internal
    public API(List<String> apiTags, String description, String serviceRegistryDisplayName, List<Tag> tags, String title, String type, Set<String> uri, String version) {
        this.apiTags = apiTags;
        this.description = description;
        this.serviceRegistryDisplayName = serviceRegistryDisplayName;
        this.tags = tags;
        this.title = title;
        this.type = type;
        this.uri = uri;
        this.version = version;
    }

}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtApi
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtApi")
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
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtApi {

    @JsonProperty("apiTags")
    protected List<String> apiTags;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("serviceRegistryDisplayName")
    protected String serviceRegistryDisplayName;

    @JsonProperty("tags")
    protected List<ServiceMgmtTag> tags;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("uri")
    protected List<String> uri;

    @JsonProperty("version")
    protected String version;

    /**
     * Constructs a validated instance of {@link ServiceMgmtApi}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtApi(Consumer<ServiceMgmtApi> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtApi}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtApi(Consumer)} instead.
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
    public ServiceMgmtApi(List<String> apiTags, String description, String serviceRegistryDisplayName, List<ServiceMgmtTag> tags, String title, String type, List<String> uri, String version) {
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

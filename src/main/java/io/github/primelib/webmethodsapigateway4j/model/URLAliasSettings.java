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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * URLAliasSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "alias",
    "apiId",
    "association",
    "id",
    "package",
    "portList",
    "urlPath"
})
@JsonTypeName("URLAliasSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class URLAliasSettings {

    /**
     * Constructs a validated implementation of {@link URLAliasSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public URLAliasSettings(Consumer<URLAliasSettings> spec) {
        spec.accept(this);
    }

    /**
     * The unique alias name given for the URL aliases. When invoked with this alias, the path will be substituted.
     */
    @JsonProperty("alias")
    protected String alias;

    /**
     * API linked to this URL alias; applicable only if this URL alias is specific to an API
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * Indicates how the URL Alias is created. This value is always 1.
     */
    @JsonProperty("association")
    protected String association;

    /**
     * URL Aliases ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The package to which the URL Alias is associated. Any URL Alias created through the API should always be associated with the WmAPIGateway package.
     */
    @JsonProperty("package")
    protected String _package;

    /**
     * An array of port specific mappings for paths. Each mapping in this array must be specified as port_number#url_path. Either urlPath or portList must be specified.
     */
    @JsonProperty("portList")
    protected List<String> portList;

    /**
     * The default path which must be substituted for the URL alias. If port specific mappings are provided, then this default path is considered if none of the ports are matched with the port of the incoming request. Either urlPath or portList must be specified.
     */
    @JsonProperty("urlPath")
    protected String urlPath;


}

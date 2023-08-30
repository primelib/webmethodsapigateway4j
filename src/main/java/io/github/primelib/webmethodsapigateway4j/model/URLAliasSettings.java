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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * URLAliasSettings
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

    /**
     * Constructs a validated instance of {@link URLAliasSettings}.
     *
     * @param spec the specification to process
     */
    public URLAliasSettings(Consumer<URLAliasSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link URLAliasSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #URLAliasSettings(Consumer)} instead.
     * @param alias The unique alias name given for the URL aliases. When invoked with this alias, the path will be substituted.
     * @param apiId API linked to this URL alias; applicable only if this URL alias is specific to an API
     * @param association Indicates how the URL Alias is created. This value is always 1.
     * @param id URL Aliases ID
     * @param _package The package to which the URL Alias is associated. Any URL Alias created through the API should always be associated with the WmAPIGateway package.
     * @param portList An array of port specific mappings for paths. Each mapping in this array must be specified as port_number#url_path. Either urlPath or portList must be specified.
     * @param urlPath The default path which must be substituted for the URL alias. If port specific mappings are provided, then this default path is considered if none of the ports are matched with the port of the incoming request. Either urlPath or portList must be specified.
     */
    @ApiStatus.Internal
    public URLAliasSettings(String alias, String apiId, String association, String id, String _package, List<String> portList, String urlPath) {
        this.alias = alias;
        this.apiId = apiId;
        this.association = association;
        this.id = id;
        this._package = _package;
        this.portList = portList;
        this.urlPath = urlPath;
    }

}

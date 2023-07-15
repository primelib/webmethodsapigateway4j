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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecurityScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "bearerFormat",
    "description",
    "flows",
    "get$ref",
    "in",
    "name",
    "openIdConnectUrl",
    "scheme",
    "type",
    "vendorExtensions"
})
@JsonTypeName("SecurityScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecurityScheme {

    /**
     * Constructs a validated implementation of {@link SecurityScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecurityScheme(Consumer<SecurityScheme> spec) {
        spec.accept(this);
    }

    @JsonProperty("bearerFormat")
    protected String bearerFormat;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("flows")
    protected OAuthFlows flows;

    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("in")
    protected InEnum in;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("openIdConnectUrl")
    protected String openIdConnectUrl;

    @JsonProperty("scheme")
    protected String scheme;

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


    @AllArgsConstructor
    public enum InEnum {
        COOKIE("COOKIE"),
        HEADER("HEADER"),
        QUERY("QUERY");

        private final String value;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        APIKEY("APIKEY"),
        HTTP("HTTP"),
        OAUTH2("OAUTH2"),
        OPENIDCONNECT("OPENIDCONNECT");

        private final String value;
    }

}

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SecurityScheme
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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link SecurityScheme}.
     *
     * @param spec the specification to process
     */
    public SecurityScheme(Consumer<SecurityScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecurityScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecurityScheme(Consumer)} instead.
     * @param bearerFormat bearerFormat
     * @param description description
     * @param flows flows
     * @param get$ref get$ref
     * @param in in
     * @param name name
     * @param openIdConnectUrl openIdConnectUrl
     * @param scheme scheme
     * @param type type
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public SecurityScheme(String bearerFormat, String description, OAuthFlows flows, String get$ref, InEnum in, String name, String openIdConnectUrl, String scheme, TypeEnum type, Map<String, Object> vendorExtensions) {
        this.bearerFormat = bearerFormat;
        this.description = description;
        this.flows = flows;
        this.get$ref = get$ref;
        this.in = in;
        this.name = name;
        this.openIdConnectUrl = openIdConnectUrl;
        this.scheme = scheme;
        this.type = type;
        this.vendorExtensions = vendorExtensions;
    }

    @AllArgsConstructor
    public enum InEnum {
        COOKIE("COOKIE"),
        HEADER("HEADER"),
        QUERY("QUERY");

        private static final InEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static InEnum of(String input) {
            if (input != null) {
                for (InEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum TypeEnum {
        APIKEY("APIKEY"),
        HTTP("HTTP"),
        OAUTH2("OAUTH2"),
        OPENIDCONNECT("OPENIDCONNECT");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}

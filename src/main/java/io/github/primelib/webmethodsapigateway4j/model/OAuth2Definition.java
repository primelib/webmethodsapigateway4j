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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Definition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "authorizationGrants",
    "authorizationUrl",
    "description",
    "flow",
    "refreshUrl",
    "scopes",
    "securitySchemeDescriptor",
    "tokenUrl",
    "type",
    "vendorExtensions"
})
@JsonTypeName("OAuth2Definition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OAuth2Definition {

    /**
     * Constructs a validated implementation of {@link OAuth2Definition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OAuth2Definition(Consumer<OAuth2Definition> spec) {
        spec.accept(this);
    }

    @JsonProperty("authorizationGrants")
    protected List<String> authorizationGrants;

    @JsonProperty("authorizationUrl")
    protected String authorizationUrl;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("flow")
    protected String flow;

    @JsonProperty("refreshUrl")
    protected String refreshUrl;

    @JsonProperty("scopes")
    protected Map<String, Object> scopes = new HashMap<>();

    @JsonProperty("securitySchemeDescriptor")
    protected SecuritySchemeDescriptor securitySchemeDescriptor;

    @JsonProperty("tokenUrl")
    protected String tokenUrl;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}

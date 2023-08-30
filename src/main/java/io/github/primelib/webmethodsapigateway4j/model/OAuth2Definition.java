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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2Definition
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
    protected Map<String, Object> scopes;

    @JsonProperty("securitySchemeDescriptor")
    protected SecuritySchemeDescriptor securitySchemeDescriptor;

    @JsonProperty("tokenUrl")
    protected String tokenUrl;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link OAuth2Definition}.
     *
     * @param spec the specification to process
     */
    public OAuth2Definition(Consumer<OAuth2Definition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OAuth2Definition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OAuth2Definition(Consumer)} instead.
     * @param authorizationGrants authorizationGrants
     * @param authorizationUrl authorizationUrl
     * @param description description
     * @param flow flow
     * @param refreshUrl refreshUrl
     * @param scopes scopes
     * @param securitySchemeDescriptor securitySchemeDescriptor
     * @param tokenUrl tokenUrl
     * @param type type
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public OAuth2Definition(List<String> authorizationGrants, String authorizationUrl, String description, String flow, String refreshUrl, Map<String, Object> scopes, SecuritySchemeDescriptor securitySchemeDescriptor, String tokenUrl, String type, Map<String, Object> vendorExtensions) {
        this.authorizationGrants = authorizationGrants;
        this.authorizationUrl = authorizationUrl;
        this.description = description;
        this.flow = flow;
        this.refreshUrl = refreshUrl;
        this.scopes = scopes;
        this.securitySchemeDescriptor = securitySchemeDescriptor;
        this.tokenUrl = tokenUrl;
        this.type = type;
        this.vendorExtensions = vendorExtensions;
    }

}

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
 * ClientRegistration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "approvalpgFilename",
    "approvalpgFooter",
    "approvalpgHeading",
    "approvalpgLogoFilename",
    "approvalpgTitle",
    "authCodeAllowed",
    "clScopes",
    "clientCredentialsAllowed",
    "clientId",
    "clientSecret",
    "enabled",
    "implicitAllowed",
    "name",
    "notes",
    "pkceType",
    "primaryNode",
    "redirectUris",
    "resourceOwnerAllowed",
    "shell",
    "tokenLifetime",
    "tokenRefreshLimit",
    "type",
    "version"
})
@JsonTypeName("ClientRegistration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ClientRegistration {

    /**
     * Constructs a validated implementation of {@link ClientRegistration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ClientRegistration(Consumer<ClientRegistration> spec) {
        spec.accept(this);
    }

    /**
     * Approval page file name
     */
    @JsonProperty("approvalpgFilename")
    protected String approvalpgFilename;

    /**
     * Approval page footer
     */
    @JsonProperty("approvalpgFooter")
    protected String approvalpgFooter;

    /**
     * Approval page heading
     */
    @JsonProperty("approvalpgHeading")
    protected String approvalpgHeading;

    /**
     * Approval page logo filename
     */
    @JsonProperty("approvalpgLogoFilename")
    protected String approvalpgLogoFilename;

    /**
     * Approval page title
     */
    @JsonProperty("approvalpgTitle")
    protected String approvalpgTitle;

    /**
     * Option to choose Authorization code grant type
     */
    @JsonProperty("authCodeAllowed")
    protected Boolean authCodeAllowed;

    /**
     * The scopes associated with this client
     */
    @JsonProperty("clScopes")
    protected List<String> clScopes;

    /**
     * Option to choose Client Credentials grant type
     */
    @JsonProperty("clientCredentialsAllowed")
    protected Boolean clientCredentialsAllowed;

    /**
     * The client id
     */
    @JsonProperty("clientId")
    protected String clientId;

    @JsonProperty("clientSecret")
    protected String clientSecret;

    /**
     * Is the client enabled?
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * Option to choose Implicit grant type
     */
    @JsonProperty("implicitAllowed")
    protected Boolean implicitAllowed;

    /**
     * The client name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Notes on the client
     */
    @JsonProperty("notes")
    protected String notes;

    /**
     * OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     */
    @JsonProperty("pkceType")
    protected PkceTypeEnum pkceType;

    @JsonProperty("primaryNode")
    protected Node primaryNode;

    /**
     * List of redirect urls allowed for this client
     */
    @JsonProperty("redirectUris")
    protected List<String> redirectUris;

    /**
     * Option to choose Resource Owner grant type
     */
    @JsonProperty("resourceOwnerAllowed")
    protected Boolean resourceOwnerAllowed;

    @JsonProperty("shell")
    protected Boolean shell;

    /**
     * Token life time
     */
    @JsonProperty("tokenLifetime")
    protected Integer tokenLifetime;

    /**
     * The number of times token can be refreshed
     */
    @JsonProperty("tokenRefreshLimit")
    protected Integer tokenRefreshLimit;

    /**
     * specifies whether the client is either public or confidential client
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The client version
     */
    @JsonProperty("version")
    protected String version;


    /**
     * OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     */
    @AllArgsConstructor
    public enum PkceTypeEnum {
        NOT_ENFORCED("NOT_ENFORCED"),
        ENFORCED("ENFORCED"),
        USE_GLOBAL_SETTING("USE_GLOBAL_SETTING");

        private final String value;
    }

}

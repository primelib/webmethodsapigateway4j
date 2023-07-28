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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ClientRegistration
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
     * Constructs a validated instance of {@link ClientRegistration}.
     *
     * @param spec the specification to process
     */
    public ClientRegistration(Consumer<ClientRegistration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ClientRegistration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ClientRegistration(Consumer)} instead.
     * @param approvalpgFilename Approval page file name
     * @param approvalpgFooter Approval page footer
     * @param approvalpgHeading Approval page heading
     * @param approvalpgLogoFilename Approval page logo filename
     * @param approvalpgTitle Approval page title
     * @param authCodeAllowed Option to choose Authorization code grant type
     * @param clScopes The scopes associated with this client
     * @param clientCredentialsAllowed Option to choose Client Credentials grant type
     * @param clientId The client id
     * @param clientSecret var.name
     * @param enabled Is the client enabled?
     * @param implicitAllowed Option to choose Implicit grant type
     * @param name The client name
     * @param notes Notes on the client
     * @param pkceType OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     * @param primaryNode var.name
     * @param redirectUris List of redirect urls allowed for this client
     * @param resourceOwnerAllowed Option to choose Resource Owner grant type
     * @param shell var.name
     * @param tokenLifetime Token life time
     * @param tokenRefreshLimit The number of times token can be refreshed
     * @param type specifies whether the client is either public or confidential client
     * @param version The client version
     */
    @ApiStatus.Internal
    public ClientRegistration(String approvalpgFilename, String approvalpgFooter, String approvalpgHeading, String approvalpgLogoFilename, String approvalpgTitle, Boolean authCodeAllowed, List<String> clScopes, Boolean clientCredentialsAllowed, String clientId, String clientSecret, Boolean enabled, Boolean implicitAllowed, String name, String notes, PkceTypeEnum pkceType, Node primaryNode, List<String> redirectUris, Boolean resourceOwnerAllowed, Boolean shell, Integer tokenLifetime, Integer tokenRefreshLimit, String type, String version) {
        this.approvalpgFilename = approvalpgFilename;
        this.approvalpgFooter = approvalpgFooter;
        this.approvalpgHeading = approvalpgHeading;
        this.approvalpgLogoFilename = approvalpgLogoFilename;
        this.approvalpgTitle = approvalpgTitle;
        this.authCodeAllowed = authCodeAllowed;
        this.clScopes = clScopes;
        this.clientCredentialsAllowed = clientCredentialsAllowed;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.enabled = enabled;
        this.implicitAllowed = implicitAllowed;
        this.name = name;
        this.notes = notes;
        this.pkceType = pkceType;
        this.primaryNode = primaryNode;
        this.redirectUris = redirectUris;
        this.resourceOwnerAllowed = resourceOwnerAllowed;
        this.shell = shell;
        this.tokenLifetime = tokenLifetime;
        this.tokenRefreshLimit = tokenRefreshLimit;
        this.type = type;
        this.version = version;
    }

    /**
     * OAuth client level options to apply PKCE security, for the public clients using authorization code grant type. Applicable only for local auth server.
     */
    @AllArgsConstructor
    public enum PkceTypeEnum {
        NOT_ENFORCED("NOT_ENFORCED"),
        ENFORCED("ENFORCED"),
        USE_GLOBAL_SETTING("USE_GLOBAL_SETTING");

        private static final PkceTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PkceTypeEnum of(String input) {
            if (input != null) {
                for (PkceTypeEnum v : VALUES) {
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

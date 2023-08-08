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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application
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
    "accessTokens",
    "applicationID",
    "authStrategyIds",
    "contactEmails",
    "creationDate",
    "customFields",
    "description",
    "iconbyteArray",
    "identifiers",
    "isSuspended",
    "jsOrigins",
    "lastModified",
    "lastUpdated",
    "name",
    "owner",
    "ownerType",
    "primaryNode",
    "shell",
    "siteURLs",
    "subscription",
    "version"
})
@JsonTypeName("Application")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Application {

    @JsonProperty("accessTokens")
    protected ApplicationToken accessTokens;

    /**
     * unique identifier of an application
     */
    @JsonProperty("applicationID")
    protected String applicationID;

    /**
     * Contains a list of JWT/Oauth/OpenID authentication strategy ids associated to the application
     */
    @JsonProperty("authStrategyIds")
    protected Set<String> authStrategyIds;

    /**
     * list of email contacts
     */
    @JsonProperty("contactEmails")
    protected List<String> contactEmails;

    /**
     * application creation time
     */
    @JsonProperty("creationDate")
    protected String creationDate;

    /**
     * list of all custom fields
     */
    @JsonProperty("customFields")
    protected Map<String, Object> customFields;

    /**
     * description of the application
     */
    @JsonProperty("description")
    protected String description;

    /**
     * application icon byte array
     */
    @JsonProperty("iconbyteArray")
    protected String iconbyteArray;

    /**
     * list of all application identifiers
     */
    @JsonProperty("identifiers")
    protected List<ApplicationIdentifier> identifiers;

    /**
     * holds the suspended state of an application
     */
    @JsonProperty("isSuspended")
    protected Boolean isSuspended;

    /**
     * list of all javascript origins
     */
    @JsonProperty("jsOrigins")
    protected List<String> jsOrigins;

    /**
     * last modified time of the application
     */
    @JsonProperty("lastModified")
    protected String lastModified;

    /**
     * last modified time of the application in milliseconds
     */
    @JsonProperty("lastUpdated")
    protected Long lastUpdated;

    /**
     * name of the application
     */
    @JsonProperty("name")
    protected String name;

    /**
     * owner of the application
     */
    @JsonProperty("owner")
    protected String owner;

    /**
     * The application's owner type can be user or a team. By default, its the user who created the application.
     */
    @JsonProperty("ownerType")
    protected String ownerType;

    @JsonProperty("primaryNode")
    protected Node primaryNode;

    @JsonProperty("shell")
    protected Boolean shell;

    /**
     * list of all site URLs
     */
    @JsonProperty("siteURLs")
    protected List<String> siteURLs;

    @JsonProperty("subscription")
    protected Boolean subscription;

    @JsonProperty("version")
    protected String version;

    /**
     * Constructs a validated instance of {@link Application}.
     *
     * @param spec the specification to process
     */
    public Application(Consumer<Application> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Application}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Application(Consumer)} instead.
     * @param accessTokens accessTokens
     * @param applicationID unique identifier of an application
     * @param authStrategyIds Contains a list of JWT/Oauth/OpenID authentication strategy ids associated to the application
     * @param contactEmails list of email contacts
     * @param creationDate application creation time
     * @param customFields list of all custom fields
     * @param description description of the application
     * @param iconbyteArray application icon byte array
     * @param identifiers list of all application identifiers
     * @param isSuspended holds the suspended state of an application
     * @param jsOrigins list of all javascript origins
     * @param lastModified last modified time of the application
     * @param lastUpdated last modified time of the application in milliseconds
     * @param name name of the application
     * @param owner owner of the application
     * @param ownerType The application's owner type can be user or a team. By default, its the user who created the application.
     * @param primaryNode primaryNode
     * @param shell shell
     * @param siteURLs list of all site URLs
     * @param subscription subscription
     * @param version version
     */
    @ApiStatus.Internal
    public Application(ApplicationToken accessTokens, String applicationID, Set<String> authStrategyIds, List<String> contactEmails, String creationDate, Map<String, Object> customFields, String description, String iconbyteArray, List<ApplicationIdentifier> identifiers, Boolean isSuspended, List<String> jsOrigins, String lastModified, Long lastUpdated, String name, String owner, String ownerType, Node primaryNode, Boolean shell, List<String> siteURLs, Boolean subscription, String version) {
        this.accessTokens = accessTokens;
        this.applicationID = applicationID;
        this.authStrategyIds = authStrategyIds;
        this.contactEmails = contactEmails;
        this.creationDate = creationDate;
        this.customFields = customFields;
        this.description = description;
        this.iconbyteArray = iconbyteArray;
        this.identifiers = identifiers;
        this.isSuspended = isSuspended;
        this.jsOrigins = jsOrigins;
        this.lastModified = lastModified;
        this.lastUpdated = lastUpdated;
        this.name = name;
        this.owner = owner;
        this.ownerType = ownerType;
        this.primaryNode = primaryNode;
        this.shell = shell;
        this.siteURLs = siteURLs;
        this.subscription = subscription;
        this.version = version;
    }

}

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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Application}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Application(Consumer<Application> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> customFields = new HashMap<>();

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


}

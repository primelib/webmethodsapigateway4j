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
 * Promotion
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "creationTime",
    "description",
    "destinationStages",
    "errorReason",
    "id",
    "includeApis",
    "includeApplications",
    "includeSubscriptions",
    "name",
    "owner",
    "promotedAssets",
    "promotionResults",
    "status"
})
@JsonTypeName("Promotion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Promotion {

    /**
     * Constructs a validated implementation of {@link Promotion}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Promotion(Consumer<Promotion> spec) {
        spec.accept(this);
    }

    @JsonProperty("creationTime")
    protected String creationTime;

    /**
     * Description for the promotion
     */
    @JsonProperty("description")
    protected String description;

    /**
     * List of target stages (specified by stage ids) that you want to promote the assets
     */
    @JsonProperty("destinationStages")
    protected List<String> destinationStages;

    /**
     * Reason for the promotion if it's failed
     */
    @JsonProperty("errorReason")
    protected String errorReason;

    @JsonProperty("id")
    protected String id;

    /**
     * Include the APIs associated with the applications during the promotion of applications
     */
    @JsonProperty("includeApis")
    protected Boolean includeApis;

    /**
     * Include the applications associated with the APIs during the promotion of APIs
     */
    @JsonProperty("includeApplications")
    protected Boolean includeApplications;

    /**
     * Include the subscriptions associated with the packages during the promotion of packages
     */
    @JsonProperty("includeSubscriptions")
    protected Boolean includeSubscriptions;

    /**
     * Name for the promotion
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The user who initiates this promotion
     */
    @JsonProperty("owner")
    protected String owner;

    /**
     * Map of assets with its associated asset ids to be promoted where key is the asset type and value is the list of asset ids. Possible asset types are "USER", "GROUP", "USERS", "GROUPS", "ACCESSPROFILES", "LDAPGROUPS", "CDSGROUPS", "ASSERTION", "APPLICATION", "API", "ALIAS", "POLICY", "POLICY_ACTION", "PLAN", "PACKAGE", "ADMINISTRATOR_SETTING", "PORTAL_GATEWAY", "OAUTH2_SCOPE_DATA", "SUBSCRIPTION", "API_DOCUMENT", "APPROVAL_CONFIGURATION", "OUTBOUND_PROXY", "URL_ALIAS", "KEYSTORE", "TRUSTSTORE", "KERBEROS_SETTING", "JNDI_PROVIDER_ALIAS", "JMS_CONNECTION_ALIAS", "JMS_TRIGGER", "WEB_SERVICE_ENDPOINT_ALIAS".
     */
    @JsonProperty("promotedAssets")
    protected Map<String, List<String>> promotedAssets = new HashMap<>();

    /**
     * Result of the individual assets that is promoted to all destination stages along with the reason where key is the stage name
     */
    @JsonProperty("promotionResults")
    protected Map<String, PrintArchiveResults> promotionResults = new HashMap<>();

    /**
     * Overall status of the promotion whether it's success or failure
     */
    @JsonProperty("status")
    protected String status;


}

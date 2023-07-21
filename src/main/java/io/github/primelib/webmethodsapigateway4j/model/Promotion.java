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
 * Promotion
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
    protected Map<String, List<String>> promotedAssets;

    /**
     * Result of the individual assets that is promoted to all destination stages along with the reason where key is the stage name
     */
    @JsonProperty("promotionResults")
    protected Map<String, PrintArchiveResults> promotionResults;

    /**
     * Overall status of the promotion whether it's success or failure
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link Promotion}.
     *
     * @param spec the specification to process
     */
    public Promotion(Consumer<Promotion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Promotion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Promotion(Consumer)} instead.
     * @param creationTime var.name
     * @param description Description for the promotion
     * @param destinationStages List of target stages (specified by stage ids) that you want to promote the assets
     * @param errorReason Reason for the promotion if it's failed
     * @param id var.name
     * @param includeApis Include the APIs associated with the applications during the promotion of applications
     * @param includeApplications Include the applications associated with the APIs during the promotion of APIs
     * @param includeSubscriptions Include the subscriptions associated with the packages during the promotion of packages
     * @param name Name for the promotion
     * @param owner The user who initiates this promotion
     * @param promotedAssets Map of assets with its associated asset ids to be promoted where key is the asset type and value is the list of asset ids. Possible asset types are "USER", "GROUP", "USERS", "GROUPS", "ACCESSPROFILES", "LDAPGROUPS", "CDSGROUPS", "ASSERTION", "APPLICATION", "API", "ALIAS", "POLICY", "POLICY_ACTION", "PLAN", "PACKAGE", "ADMINISTRATOR_SETTING", "PORTAL_GATEWAY", "OAUTH2_SCOPE_DATA", "SUBSCRIPTION", "API_DOCUMENT", "APPROVAL_CONFIGURATION", "OUTBOUND_PROXY", "URL_ALIAS", "KEYSTORE", "TRUSTSTORE", "KERBEROS_SETTING", "JNDI_PROVIDER_ALIAS", "JMS_CONNECTION_ALIAS", "JMS_TRIGGER", "WEB_SERVICE_ENDPOINT_ALIAS".
     * @param promotionResults Result of the individual assets that is promoted to all destination stages along with the reason where key is the stage name
     * @param status Overall status of the promotion whether it's success or failure
     */
    @ApiStatus.Internal
    public Promotion(String creationTime, String description, List<String> destinationStages, String errorReason, String id, Boolean includeApis, Boolean includeApplications, Boolean includeSubscriptions, String name, String owner, Map<String, List<String>> promotedAssets, Map<String, PrintArchiveResults> promotionResults, String status) {
        this.creationTime = creationTime;
        this.description = description;
        this.destinationStages = destinationStages;
        this.errorReason = errorReason;
        this.id = id;
        this.includeApis = includeApis;
        this.includeApplications = includeApplications;
        this.includeSubscriptions = includeSubscriptions;
        this.name = name;
        this.owner = owner;
        this.promotedAssets = promotedAssets;
        this.promotionResults = promotionResults;
        this.status = status;
    }

}

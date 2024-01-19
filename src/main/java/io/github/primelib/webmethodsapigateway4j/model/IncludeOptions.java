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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncludeOptions
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
    "includeAccessProfiles",
    "includeAll",
    "includeApis",
    "includeApplications",
    "includeDocuments",
    "includeGatewayScopes",
    "includeGroups",
    "includeRegisteredApplications",
    "includeSubscriptions",
    "includeTruststores",
    "includeUsers",
    "promotedGroupsList",
    "promotedUsersList",
    "promotion"
})
@JsonTypeName("IncludeOptions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncludeOptions {

    @JsonProperty("includeAccessProfiles")
    protected Boolean includeAccessProfiles;

    /**
     * Include all dependent assets for all asset type specified
     */
    @JsonProperty("includeAll")
    protected Boolean includeAll;

    /**
     * Include API as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeApis")
    protected Boolean includeApis;

    /**
     * Include application as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeApplications")
    protected Boolean includeApplications;

    /**
     * Include documents as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeDocuments")
    protected Boolean includeDocuments;

    @JsonProperty("includeGatewayScopes")
    protected Boolean includeGatewayScopes;

    /**
     * Include groups as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeGroups")
    protected Boolean includeGroups;

    /**
     * Include registered application as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeRegisteredApplications")
    protected Boolean includeRegisteredApplications;

    /**
     * Include subscriptions for the asset type specified if applicable
     */
    @JsonProperty("includeSubscriptions")
    protected Boolean includeSubscriptions;

    @JsonProperty("includeTruststores")
    protected Boolean includeTruststores;

    /**
     * Include users as dependent asset for asset type specified if applicable
     */
    @JsonProperty("includeUsers")
    protected Boolean includeUsers;

    @JsonProperty("promotedGroupsList")
    protected List<String> promotedGroupsList;

    @JsonProperty("promotedUsersList")
    protected List<String> promotedUsersList;

    @JsonProperty("promotion")
    protected Boolean promotion;

    /**
     * Constructs a validated instance of {@link IncludeOptions}.
     *
     * @param spec the specification to process
     */
    public IncludeOptions(Consumer<IncludeOptions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncludeOptions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncludeOptions(Consumer)} instead.
     * @param includeAccessProfiles includeAccessProfiles
     * @param includeAll Include all dependent assets for all asset type specified
     * @param includeApis Include API as dependent asset for asset type specified if applicable
     * @param includeApplications Include application as dependent asset for asset type specified if applicable
     * @param includeDocuments Include documents as dependent asset for asset type specified if applicable
     * @param includeGatewayScopes includeGatewayScopes
     * @param includeGroups Include groups as dependent asset for asset type specified if applicable
     * @param includeRegisteredApplications Include registered application as dependent asset for asset type specified if applicable
     * @param includeSubscriptions Include subscriptions for the asset type specified if applicable
     * @param includeTruststores includeTruststores
     * @param includeUsers Include users as dependent asset for asset type specified if applicable
     * @param promotedGroupsList promotedGroupsList
     * @param promotedUsersList promotedUsersList
     * @param promotion promotion
     */
    @ApiStatus.Internal
    public IncludeOptions(Boolean includeAccessProfiles, Boolean includeAll, Boolean includeApis, Boolean includeApplications, Boolean includeDocuments, Boolean includeGatewayScopes, Boolean includeGroups, Boolean includeRegisteredApplications, Boolean includeSubscriptions, Boolean includeTruststores, Boolean includeUsers, List<String> promotedGroupsList, List<String> promotedUsersList, Boolean promotion) {
        this.includeAccessProfiles = includeAccessProfiles;
        this.includeAll = includeAll;
        this.includeApis = includeApis;
        this.includeApplications = includeApplications;
        this.includeDocuments = includeDocuments;
        this.includeGatewayScopes = includeGatewayScopes;
        this.includeGroups = includeGroups;
        this.includeRegisteredApplications = includeRegisteredApplications;
        this.includeSubscriptions = includeSubscriptions;
        this.includeTruststores = includeTruststores;
        this.includeUsers = includeUsers;
        this.promotedGroupsList = promotedGroupsList;
        this.promotedUsersList = promotedUsersList;
        this.promotion = promotion;
    }

}

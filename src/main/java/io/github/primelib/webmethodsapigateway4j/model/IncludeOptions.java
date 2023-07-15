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
 * IncludeOptions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link IncludeOptions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncludeOptions(Consumer<IncludeOptions> spec) {
        spec.accept(this);
    }

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


}

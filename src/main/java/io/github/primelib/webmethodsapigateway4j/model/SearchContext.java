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
 * SearchContext
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
    "aggregations",
    "condition",
    "deploymentFilter",
    "from",
    "responseFields",
    "scope",
    "size",
    "sortByField",
    "sortOrder",
    "teamFilter",
    "types"
})
@JsonTypeName("SearchContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchContext {

    @JsonProperty("aggregations")
    protected IAggregation aggregations;

    /**
     * Condition between scope specified. The value can be either 'and' or 'or'
     */
    @JsonProperty("condition")
    protected ConditionEnum condition;

    /**
     * This filter is used for deployment types.
     */
    @JsonProperty("deploymentFilter")
    protected String deploymentFilter;

    /**
     * The starting index of the record to be fetched. Default value is 0 which fetches from the start. The index is applied to each type separately. For each type the first n records are skipped as specified in from field. If the value specified is less than zero then the default value is taken for fetching records
     */
    @JsonProperty("from")
    protected Integer from;

    /**
     * List of fields to be fetched for the specified types.
     */
    @JsonProperty("responseFields")
    protected List<String> responseFields;

    @JsonProperty("scope")
    protected SearchField scope;

    /**
     * Number of records to be fetched. Default value is -1, which fetches all the records. The size is applied to each type separately. Each type has the records less than or equal to the size specified. If the value specified is less than zero then the default value is taken for fetching records
     */
    @JsonProperty("size")
    protected Integer size;

    /**
     * Field name on which the sorting needs to be applied.
     */
    @JsonProperty("sortByField")
    protected String sortByField;

    /**
     * Sort order for the records
     */
    @JsonProperty("sortOrder")
    protected SortOrderEnum sortOrder;

    /**
     * This filter is used to specify list teams to apply on the search results.
     */
    @JsonProperty("teamFilter")
    protected List<String> teamFilter;

    /**
     * List of allowed types that can be searched across API Gateway.
     */
    @JsonProperty("types")
    protected TypesEnum types;

    /**
     * Constructs a validated instance of {@link SearchContext}.
     *
     * @param spec the specification to process
     */
    public SearchContext(Consumer<SearchContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchContext(Consumer)} instead.
     * @param aggregations aggregations
     * @param condition Condition between scope specified. The value can be either 'and' or 'or'
     * @param deploymentFilter This filter is used for deployment types.
     * @param from The starting index of the record to be fetched. Default value is 0 which fetches from the start. The index is applied to each type separately. For each type the first n records are skipped as specified in from field. If the value specified is less than zero then the default value is taken for fetching records
     * @param responseFields List of fields to be fetched for the specified types.
     * @param scope scope
     * @param size Number of records to be fetched. Default value is -1, which fetches all the records. The size is applied to each type separately. Each type has the records less than or equal to the size specified. If the value specified is less than zero then the default value is taken for fetching records
     * @param sortByField Field name on which the sorting needs to be applied.
     * @param sortOrder Sort order for the records
     * @param teamFilter This filter is used to specify list teams to apply on the search results.
     * @param types List of allowed types that can be searched across API Gateway.
     */
    @ApiStatus.Internal
    public SearchContext(IAggregation aggregations, ConditionEnum condition, String deploymentFilter, Integer from, List<String> responseFields, SearchField scope, Integer size, String sortByField, SortOrderEnum sortOrder, List<String> teamFilter, TypesEnum types) {
        this.aggregations = aggregations;
        this.condition = condition;
        this.deploymentFilter = deploymentFilter;
        this.from = from;
        this.responseFields = responseFields;
        this.scope = scope;
        this.size = size;
        this.sortByField = sortByField;
        this.sortOrder = sortOrder;
        this.teamFilter = teamFilter;
        this.types = types;
    }

    /**
     * Condition between scope specified. The value can be either 'and' or 'or'
     */
    @AllArgsConstructor
    public enum ConditionEnum {
        AND("and"),
        OR("or");

        private static final ConditionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ConditionEnum of(String input) {
            if (input != null) {
                for (ConditionEnum v : VALUES) {
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

    /**
     * Sort order for the records
     */
    @AllArgsConstructor
    public enum SortOrderEnum {
        ASC("ASC"),
        DESC("DESC");

        private static final SortOrderEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SortOrderEnum of(String input) {
            if (input != null) {
                for (SortOrderEnum v : VALUES) {
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

    /**
     * List of allowed types that can be searched across API Gateway.
     */
    @AllArgsConstructor
    public enum TypesEnum {
        USER("USER"),
        GROUP("GROUP"),
        USERS("USERS"),
        GROUPS("GROUPS"),
        ACCESSPROFILES("ACCESSPROFILES"),
        LDAPGROUPS("LDAPGROUPS"),
        CDSGROUPS("CDSGROUPS"),
        ASSERTION("ASSERTION"),
        APPLICATION("APPLICATION"),
        API("API"),
        ALIAS("ALIAS"),
        POLICY("POLICY"),
        POLICY_ACTION("POLICY_ACTION"),
        PLAN("PLAN"),
        PACKAGE("PACKAGE"),
        ADMINISTRATOR_SETTING("ADMINISTRATOR_SETTING"),
        PORTAL_GATEWAY("PORTAL_GATEWAY"),
        OAUTH2_SCOPE_DATA("OAUTH2_SCOPE_DATA"),
        SUBSCRIPTION("SUBSCRIPTION"),
        API_DOCUMENT("API_DOCUMENT"),
        APPROVAL_CONFIGURATION("APPROVAL_CONFIGURATION"),
        OUTBOUND_PROXY("OUTBOUND_PROXY"),
        PROXY_BYPASS("PROXY_BYPASS"),
        URL_ALIAS("URL_ALIAS"),
        KEYSTORE("KEYSTORE"),
        TRUSTSTORE("TRUSTSTORE"),
        KERBEROS_SETTING("KERBEROS_SETTING"),
        JNDI_PROVIDER_ALIAS("JNDI_PROVIDER_ALIAS"),
        JMS_CONNECTION_ALIAS("JMS_CONNECTION_ALIAS"),
        JMS_TRIGGER("JMS_TRIGGER"),
        WEB_SERVICE_ENDPOINT_ALIAS("WEB_SERVICE_ENDPOINT_ALIAS"),
        ACCESS_CONTROL_LIST("ACCESS_CONTROL_LIST"),
        RULE("RULE"),
        MICROGATEWAY_GROUPS("MICROGATEWAY_GROUPS"),
        GATEWAY_SCOPE("GATEWAY_SCOPE"),
        OAUTH2MATERIALIZEDTOKEN("OAUTH2MATERIALIZEDTOKEN"),
        TRANSACTION_EVENTS("TRANSACTION_EVENTS"),
        LIFECYCLE_EVENTS("LIFECYCLE_EVENTS"),
        POLICYVIOLATION_EVENTS("POLICYVIOLATION_EVENTS"),
        MONITOR_EVENTS("MONITOR_EVENTS"),
        ERROR_EVENTS("ERROR_EVENTS"),
        THREATPROTECTION_EVENTS("THREATPROTECTION_EVENTS"),
        PERFORMANCE_METRICS("PERFORMANCE_METRICS"),
        QUOTA_USAGE("QUOTA_USAGE"),
        DASHBOARD("DASHBOARD"),
        AUDIT_LOG("AUDIT_LOG"),
        REQUEST_RESPONSE_TRACE_SPANS("REQUEST_RESPONSE_TRACE_SPANS"),
        APPLICATION_LOG("APPLICATION_LOG"),
        MEDIATOR_TRACE_SPANS("MEDIATOR_TRACE_SPANS"),
        SERVER_LOG_TRACE_SPANS("SERVER_LOG_TRACE_SPANS");

        private static final TypesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypesEnum of(String input) {
            if (input != null) {
                for (TypesEnum v : VALUES) {
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

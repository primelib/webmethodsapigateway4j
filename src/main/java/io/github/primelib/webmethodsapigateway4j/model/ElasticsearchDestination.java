package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ElasticsearchDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hostname",
    "indexName",
    "metricsPublishInterval",
    "password",
    "port",
    "protocol",
    "sendAuditlogAPIManagementEvent",
    "sendAuditlogAccessProfileManagementEvent",
    "sendAuditlogAliasManagementEvent",
    "sendAuditlogApplicationManagementEvent",
    "sendAuditlogApprovalManagementEvent",
    "sendAuditlogGroupManagementEvent",
    "sendAuditlogPackageManagementEvent",
    "sendAuditlogPlanManagementEvent",
    "sendAuditlogPolicyManagementEvent",
    "sendAuditlogPromotionManagementEvent",
    "sendAuditlogRuntimeDataManagementEvent",
    "sendAuditlogUserManagementEvent",
    "sendErrorEvent",
    "sendLifecycleEvent",
    "sendPerformanceMetrics",
    "sendPolicyViolationEvent",
    "username"
})
@JsonTypeName("ElasticsearchDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ElasticsearchDestination {

    /**
     * Constructs a validated implementation of {@link ElasticsearchDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ElasticsearchDestination(Consumer<ElasticsearchDestination> spec) {
        spec.accept(this);
    }

    /**
     * Specifies the host name or IP address of the machine on which Elasticsearch Server is running.
     */
    @JsonProperty("hostname")
    protected String hostname;

    /**
     * Specifies the index name for the Elasticsearch server on which the events will be available.
     */
    @JsonProperty("indexName")
    protected String indexName;

    /**
     * The interval at which the metrics will be published to the destination. Enter a value from 1 through 60. The default is 60 minutes.
     */
    @JsonProperty("metricsPublishInterval")
    protected String metricsPublishInterval;

    /**
     * The password for the Elasticsearch server instance.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Specifies the port on which the Elasticsearch server runs.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * Specifies the communication protocol used to establish communication between API Gateway and CentraSite.
     */
    @JsonProperty("protocol")
    protected String protocol;

    /**
     * Flag to enable publish of the api management audit logs. Occurs each time an api create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAPIManagementEvent")
    protected String sendAuditlogAPIManagementEvent;

    /**
     * Flag to enable publish of the team management audit logs. Occurs each time an team create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAccessProfileManagementEvent")
    protected String sendAuditlogAccessProfileManagementEvent;

    /**
     * Flag to enable publish of the alias management audit logs. Occurs each time an alias create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAliasManagementEvent")
    protected String sendAuditlogAliasManagementEvent;

    /**
     * Flag to enable publish of the application management audit logs. Occurs each time an application create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogApplicationManagementEvent")
    protected String sendAuditlogApplicationManagementEvent;

    /**
     * Flag to enable publish of the approval management audit logs. Occurs each time an approval request create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogApprovalManagementEvent")
    protected String sendAuditlogApprovalManagementEvent;

    /**
     * Flag to enable publish of the group management audit logs. Occurs each time a group create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogGroupManagementEvent")
    protected String sendAuditlogGroupManagementEvent;

    /**
     * Flag to enable publish of the package management audit logs. Occurs each time a package create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPackageManagementEvent")
    protected String sendAuditlogPackageManagementEvent;

    /**
     * Flag to enable publish of the plan management audit logs. Occurs each time a plan create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPlanManagementEvent")
    protected String sendAuditlogPlanManagementEvent;

    /**
     * Flag to enable publish of the policy management audit logs. Occurs each time a policy create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPolicyManagementEvent")
    protected String sendAuditlogPolicyManagementEvent;

    /**
     * Flag to enable publish of the promotion management audit logs. Occurs each time a promotion create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPromotionManagementEvent")
    protected String sendAuditlogPromotionManagementEvent;

    /**
     * Flag to enable publish of the analytics management audit logs. Occurs each time an analytics data delete operation performed.
     */
    @JsonProperty("sendAuditlogRuntimeDataManagementEvent")
    protected String sendAuditlogRuntimeDataManagementEvent;

    /**
     * Flag to enable publish of the user management audit logs. Occurs each time an user create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogUserManagementEvent")
    protected String sendAuditlogUserManagementEvent;

    /**
     * Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     */
    @JsonProperty("sendErrorEvent")
    protected String sendErrorEvent;

    /**
     * Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     */
    @JsonProperty("sendLifecycleEvent")
    protected String sendLifecycleEvent;

    /**
     * Flag to enable publish of the performance metrics. The performance data provides information on average response time, total request count, fault count, and so on.
     */
    @JsonProperty("sendPerformanceMetrics")
    protected String sendPerformanceMetrics;

    /**
     * Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     */
    @JsonProperty("sendPolicyViolationEvent")
    protected String sendPolicyViolationEvent;

    /**
     * The username for the Elasticsearch server instance.
     */
    @JsonProperty("username")
    protected String username;


}

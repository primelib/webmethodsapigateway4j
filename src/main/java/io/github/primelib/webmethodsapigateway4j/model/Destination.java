package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Destination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "metricsPublishInterval",
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
    "sendPolicyViolationEvent"
})
@JsonTypeName("Destination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Destination {

    /**
     * The interval at which the metrics will be published to the destination. Enter a value from 1 through 60. The default is 60 minutes.
     */
    @JsonProperty("metricsPublishInterval")
    private String metricsPublishInterval;

    /**
     * Flag to enable publish of the api management audit logs. Occurs each time an api create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAPIManagementEvent")
    private String sendAuditlogAPIManagementEvent;

    /**
     * Flag to enable publish of the team management audit logs. Occurs each time an team create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAccessProfileManagementEvent")
    private String sendAuditlogAccessProfileManagementEvent;

    /**
     * Flag to enable publish of the alias management audit logs. Occurs each time an alias create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogAliasManagementEvent")
    private String sendAuditlogAliasManagementEvent;

    /**
     * Flag to enable publish of the application management audit logs. Occurs each time an application create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogApplicationManagementEvent")
    private String sendAuditlogApplicationManagementEvent;

    /**
     * Flag to enable publish of the approval management audit logs. Occurs each time an approval request create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogApprovalManagementEvent")
    private String sendAuditlogApprovalManagementEvent;

    /**
     * Flag to enable publish of the group management audit logs. Occurs each time a group create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogGroupManagementEvent")
    private String sendAuditlogGroupManagementEvent;

    /**
     * Flag to enable publish of the package management audit logs. Occurs each time a package create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPackageManagementEvent")
    private String sendAuditlogPackageManagementEvent;

    /**
     * Flag to enable publish of the plan management audit logs. Occurs each time a plan create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPlanManagementEvent")
    private String sendAuditlogPlanManagementEvent;

    /**
     * Flag to enable publish of the policy management audit logs. Occurs each time a policy create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPolicyManagementEvent")
    private String sendAuditlogPolicyManagementEvent;

    /**
     * Flag to enable publish of the promotion management audit logs. Occurs each time a promotion create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogPromotionManagementEvent")
    private String sendAuditlogPromotionManagementEvent;

    /**
     * Flag to enable publish of the analytics management audit logs. Occurs each time an analytics data purge operation performed.
     */
    @JsonProperty("sendAuditlogRuntimeDataManagementEvent")
    private String sendAuditlogRuntimeDataManagementEvent;

    /**
     * Flag to enable publish of the user management audit logs. Occurs each time an user create/update/delete operation performed.
     */
    @JsonProperty("sendAuditlogUserManagementEvent")
    private String sendAuditlogUserManagementEvent;

    /**
     * Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     */
    @JsonProperty("sendErrorEvent")
    private String sendErrorEvent;

    /**
     * Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     */
    @JsonProperty("sendLifecycleEvent")
    private String sendLifecycleEvent;

    /**
     * Flag to enable publish of the performance metrics. The performance data provides information on average response time, total request count, fault count, and so on.
     */
    @JsonProperty("sendPerformanceMetrics")
    private String sendPerformanceMetrics;

    /**
     * Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     */
    @JsonProperty("sendPolicyViolationEvent")
    private String sendPolicyViolationEvent;


}

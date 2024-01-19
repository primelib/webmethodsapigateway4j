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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Destination
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
    protected String metricsPublishInterval;

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
     * Flag to enable publish of the analytics management audit logs. Occurs each time an analytics data purge operation performed.
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
     * Constructs a validated instance of {@link Destination}.
     *
     * @param spec the specification to process
     */
    public Destination(Consumer<Destination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Destination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Destination(Consumer)} instead.
     * @param metricsPublishInterval The interval at which the metrics will be published to the destination. Enter a value from 1 through 60. The default is 60 minutes.
     * @param sendAuditlogAPIManagementEvent Flag to enable publish of the api management audit logs. Occurs each time an api create/update/delete operation performed.
     * @param sendAuditlogAccessProfileManagementEvent Flag to enable publish of the team management audit logs. Occurs each time an team create/update/delete operation performed.
     * @param sendAuditlogAliasManagementEvent Flag to enable publish of the alias management audit logs. Occurs each time an alias create/update/delete operation performed.
     * @param sendAuditlogApplicationManagementEvent Flag to enable publish of the application management audit logs. Occurs each time an application create/update/delete operation performed.
     * @param sendAuditlogApprovalManagementEvent Flag to enable publish of the approval management audit logs. Occurs each time an approval request create/update/delete operation performed.
     * @param sendAuditlogGroupManagementEvent Flag to enable publish of the group management audit logs. Occurs each time a group create/update/delete operation performed.
     * @param sendAuditlogPackageManagementEvent Flag to enable publish of the package management audit logs. Occurs each time a package create/update/delete operation performed.
     * @param sendAuditlogPlanManagementEvent Flag to enable publish of the plan management audit logs. Occurs each time a plan create/update/delete operation performed.
     * @param sendAuditlogPolicyManagementEvent Flag to enable publish of the policy management audit logs. Occurs each time a policy create/update/delete operation performed.
     * @param sendAuditlogPromotionManagementEvent Flag to enable publish of the promotion management audit logs. Occurs each time a promotion create/update/delete operation performed.
     * @param sendAuditlogRuntimeDataManagementEvent Flag to enable publish of the analytics management audit logs. Occurs each time an analytics data purge operation performed.
     * @param sendAuditlogUserManagementEvent Flag to enable publish of the user management audit logs. Occurs each time an user create/update/delete operation performed.
     * @param sendErrorEvent Flag to enable publish of the error events. Occurs each time an API invocation results in an error.
     * @param sendLifecycleEvent Flag to enable publish of the life cycle events. Occurs each time API Gateway is started or shut down.
     * @param sendPerformanceMetrics Flag to enable publish of the performance metrics. The performance data provides information on average response time, total request count, fault count, and so on.
     * @param sendPolicyViolationEvent Flag to enable publish of the policy violations events. Occurs each time an API invocation violates the policy enforcement that was set for the API.
     */
    @ApiStatus.Internal
    public Destination(String metricsPublishInterval, String sendAuditlogAPIManagementEvent, String sendAuditlogAccessProfileManagementEvent, String sendAuditlogAliasManagementEvent, String sendAuditlogApplicationManagementEvent, String sendAuditlogApprovalManagementEvent, String sendAuditlogGroupManagementEvent, String sendAuditlogPackageManagementEvent, String sendAuditlogPlanManagementEvent, String sendAuditlogPolicyManagementEvent, String sendAuditlogPromotionManagementEvent, String sendAuditlogRuntimeDataManagementEvent, String sendAuditlogUserManagementEvent, String sendErrorEvent, String sendLifecycleEvent, String sendPerformanceMetrics, String sendPolicyViolationEvent) {
        this.metricsPublishInterval = metricsPublishInterval;
        this.sendAuditlogAPIManagementEvent = sendAuditlogAPIManagementEvent;
        this.sendAuditlogAccessProfileManagementEvent = sendAuditlogAccessProfileManagementEvent;
        this.sendAuditlogAliasManagementEvent = sendAuditlogAliasManagementEvent;
        this.sendAuditlogApplicationManagementEvent = sendAuditlogApplicationManagementEvent;
        this.sendAuditlogApprovalManagementEvent = sendAuditlogApprovalManagementEvent;
        this.sendAuditlogGroupManagementEvent = sendAuditlogGroupManagementEvent;
        this.sendAuditlogPackageManagementEvent = sendAuditlogPackageManagementEvent;
        this.sendAuditlogPlanManagementEvent = sendAuditlogPlanManagementEvent;
        this.sendAuditlogPolicyManagementEvent = sendAuditlogPolicyManagementEvent;
        this.sendAuditlogPromotionManagementEvent = sendAuditlogPromotionManagementEvent;
        this.sendAuditlogRuntimeDataManagementEvent = sendAuditlogRuntimeDataManagementEvent;
        this.sendAuditlogUserManagementEvent = sendAuditlogUserManagementEvent;
        this.sendErrorEvent = sendErrorEvent;
        this.sendLifecycleEvent = sendLifecycleEvent;
        this.sendPerformanceMetrics = sendPerformanceMetrics;
        this.sendPolicyViolationEvent = sendPolicyViolationEvent;
    }

}

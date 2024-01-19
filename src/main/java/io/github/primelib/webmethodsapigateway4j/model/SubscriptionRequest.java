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
 * SubscriptionRequest
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
    "applicationDescription",
    "applicationName",
    "otherRequesterDetails",
    "packageId",
    "planId",
    "redirectURIs",
    "requesterComment",
    "requesterEmail",
    "requesterFirstName",
    "requesterId",
    "requesterLastName",
    "requesterName"
})
@JsonTypeName("SubscriptionRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SubscriptionRequest {

    /**
     * Application description of the subscription requested
     */
    @JsonProperty("applicationDescription")
    protected String applicationDescription;

    /**
     * Application name of the subscription requested
     */
    @JsonProperty("applicationName")
    protected String applicationName;

    /**
     * Any other information to use it in the create subscription approval request
     */
    @JsonProperty("otherRequesterDetails")
    protected Map<String, String> otherRequesterDetails;

    /**
     * Package id to which the subscription is requested
     */
    @JsonProperty("packageId")
    protected String packageId;

    /**
     * Plan id to which the subscription is requested
     */
    @JsonProperty("planId")
    protected String planId;

    /**
     * Redirect URIs to use in application created for this subscription.
     */
    @JsonProperty("redirectURIs")
    protected List<String> redirectURIs;

    /**
     * Requester comment to use in the create subscription approval request.
     */
    @JsonProperty("requesterComment")
    protected String requesterComment;

    /**
     * Email id of the requester to use in the create subscription approval request.
     */
    @JsonProperty("requesterEmail")
    protected String requesterEmail;

    /**
     * First name of the requester to use in the
     * create subscription approval request.
     */
    @JsonProperty("requesterFirstName")
    protected String requesterFirstName;

    /**
     * User id of the requester to whom the subscription is requested. This will be used as owner for Application created
     */
    @JsonProperty("requesterId")
    protected String requesterId;

    /**
     * Last name of the requester to use in the create subscription approval request.
     */
    @JsonProperty("requesterLastName")
    protected String requesterLastName;

    /**
     * Name of the requester to whom the subscription is requested. This will be used as requester name in create subscription approval request. If not specified the name of the invoking user will be used in approval request
     */
    @JsonProperty("requesterName")
    protected String requesterName;

    /**
     * Constructs a validated instance of {@link SubscriptionRequest}.
     *
     * @param spec the specification to process
     */
    public SubscriptionRequest(Consumer<SubscriptionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SubscriptionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SubscriptionRequest(Consumer)} instead.
     * @param applicationDescription Application description of the subscription requested
     * @param applicationName Application name of the subscription requested
     * @param otherRequesterDetails Any other information to use it in the create subscription approval request
     * @param packageId Package id to which the subscription is requested
     * @param planId Plan id to which the subscription is requested
     * @param redirectURIs Redirect URIs to use in application created for this subscription.
     * @param requesterComment Requester comment to use in the create subscription approval request.
     * @param requesterEmail Email id of the requester to use in the create subscription approval request.
     * @param requesterFirstName First name of the requester to use in the  create subscription approval request.
     * @param requesterId User id of the requester to whom the subscription is requested. This will be used as owner for Application created
     * @param requesterLastName Last name of the requester to use in the create subscription approval request.
     * @param requesterName Name of the requester to whom the subscription is requested. This will be used as requester name in create subscription approval request. If not specified the name of the invoking user will be used in approval request
     */
    @ApiStatus.Internal
    public SubscriptionRequest(String applicationDescription, String applicationName, Map<String, String> otherRequesterDetails, String packageId, String planId, List<String> redirectURIs, String requesterComment, String requesterEmail, String requesterFirstName, String requesterId, String requesterLastName, String requesterName) {
        this.applicationDescription = applicationDescription;
        this.applicationName = applicationName;
        this.otherRequesterDetails = otherRequesterDetails;
        this.packageId = packageId;
        this.planId = planId;
        this.redirectURIs = redirectURIs;
        this.requesterComment = requesterComment;
        this.requesterEmail = requesterEmail;
        this.requesterFirstName = requesterFirstName;
        this.requesterId = requesterId;
        this.requesterLastName = requesterLastName;
        this.requesterName = requesterName;
    }

}

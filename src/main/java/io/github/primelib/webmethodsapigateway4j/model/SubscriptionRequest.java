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
 * SubscriptionRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link SubscriptionRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SubscriptionRequest(Consumer<SubscriptionRequest> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> otherRequesterDetails = new HashMap<>();

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


}

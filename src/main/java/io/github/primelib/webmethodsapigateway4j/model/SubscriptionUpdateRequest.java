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
 * SubscriptionUpdateRequest
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
    "newPackageId",
    "newPlanId",
    "requesterComment",
    "requesterName"
})
@JsonTypeName("SubscriptionUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SubscriptionUpdateRequest {

    /**
     * Package id to which the subscription needs to be switched
     */
    @JsonProperty("newPackageId")
    protected String newPackageId;

    /**
     * Plan id to which the subscription needs to be switched
     */
    @JsonProperty("newPlanId")
    protected String newPlanId;

    /**
     * Requester comment to use in the update subscription approval request.
     */
    @JsonProperty("requesterComment")
    protected String requesterComment;

    /**
     * Name of the requester to whom the subscription is requested. This will be used as requester name in update subscription approval request. If not specified the name of the invoking user will be used in approval request
     */
    @JsonProperty("requesterName")
    protected String requesterName;

    /**
     * Constructs a validated instance of {@link SubscriptionUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public SubscriptionUpdateRequest(Consumer<SubscriptionUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SubscriptionUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SubscriptionUpdateRequest(Consumer)} instead.
     * @param newPackageId Package id to which the subscription needs to be switched
     * @param newPlanId Plan id to which the subscription needs to be switched
     * @param requesterComment Requester comment to use in the update subscription approval request.
     * @param requesterName Name of the requester to whom the subscription is requested. This will be used as requester name in update subscription approval request. If not specified the name of the invoking user will be used in approval request
     */
    @ApiStatus.Internal
    public SubscriptionUpdateRequest(String newPackageId, String newPlanId, String requesterComment, String requesterName) {
        this.newPackageId = newPackageId;
        this.newPlanId = newPlanId;
        this.requesterComment = requesterComment;
        this.requesterName = requesterName;
    }

}

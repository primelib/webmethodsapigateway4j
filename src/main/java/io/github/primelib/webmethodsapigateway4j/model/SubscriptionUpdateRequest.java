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
 * SubscriptionUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link SubscriptionUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SubscriptionUpdateRequest(Consumer<SubscriptionUpdateRequest> spec) {
        spec.accept(this);
    }

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


}

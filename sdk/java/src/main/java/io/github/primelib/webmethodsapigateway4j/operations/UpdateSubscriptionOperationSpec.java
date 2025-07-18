// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import io.github.primelib.webmethodsapigateway4j.models.MonetizationSubscriptionUpdateRequest;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NonNull;

/**
 * UpdateSubscription
 * <p>
 * This is used switch the subscription from one package and plan to another package and plan combination. If approval is enabled, then the request will return old application detail as response and will create a request for approver to approve the switch. Till the request get approved the user can invoke old package APIs only. After the subscription is switched, the quota for the subscription will be reset and will be able to invoke the new APIs using the same API Key. To get the history of the subscription usage use the /transactionalEvents/_search endpoint
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class UpdateSubscriptionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Application id to update the subscription details
     *
     */
    @NonNull
    private String applicationId;

    /**
     * payload
     *
     */
    @NonNull
    private MonetizationSubscriptionUpdateRequest payload;

    /**
     * Constructs a validated instance of {@link UpdateSubscriptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateSubscriptionOperationSpec(Consumer<UpdateSubscriptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(applicationId, "applicationId is a required parameter!");
        Objects.requireNonNull(payload, "payload is a required parameter!");
    }
}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import io.github.primelib.webmethodsapigateway4j.models.AdminWebhook;
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
 * UpdateWebhook
 * <p>
 * The method updates the details of a specified webhook in API Gateway. The API request body must contain the payload of the webhook that needs to be updated.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class UpdateWebhookOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of an webhook whose detail is to be updated in API Gateway.
     *
     */
    @NonNull
    private String id;

    /**
     * This parameter describes the request payload of webhook that is to be updated in API Gateway.
     *
     */
    @NonNull
    private AdminWebhook payload;

    /**
     * Constructs a validated instance of {@link UpdateWebhookOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWebhookOperationSpec(Consumer<UpdateWebhookOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(payload, "payload is a required parameter!");
    }
}

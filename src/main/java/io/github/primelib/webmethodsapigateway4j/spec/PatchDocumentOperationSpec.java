package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Document;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * PatchDocumentSpec
 * <p>
 * Specification for the PatchDocument operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PatchDocumentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The unique identifier of the document to be patched.
     */
    @NotNull 
    private String documentId;

    /**
     * The request payload to patch the document in API Gateway.
     */
    @NotNull 
    private Document body;

    /**
     * Constructs a validated implementation of {@link PatchDocumentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PatchDocumentOperationSpec(Consumer<PatchDocumentOperationSpec> spec) {
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
        Objects.requireNonNull(documentId, "documentId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}

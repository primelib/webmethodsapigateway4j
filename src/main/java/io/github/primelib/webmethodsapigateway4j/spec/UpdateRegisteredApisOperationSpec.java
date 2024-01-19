package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateRegisteredApisSpec
 * <p>
 * Specification for the UpdateRegisteredApis operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRegisteredApisOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter specifies the ID of an application for updating the details of the registered APIs in API Gateway.
     */
    @NotNull 
    private String applicationId;

    /**
     * This parameter specifies the ID of a registered API that is to be updated in API Gateway.
     */
    @NotNull 
    private List<String> body;

    /**
     * Constructs a validated instance of {@link UpdateRegisteredApisOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateRegisteredApisOperationSpec(Consumer<UpdateRegisteredApisOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateRegisteredApisOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param applicationId        This parameter specifies the ID of an application for updating the details of the registered APIs in API Gateway.
     * @param body                 This parameter specifies the ID of a registered API that is to be updated in API Gateway.
     */
    @ApiStatus.Internal
    public UpdateRegisteredApisOperationSpec(String applicationId, List<String> body) {
        this.applicationId = applicationId;
        this.body = body;

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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

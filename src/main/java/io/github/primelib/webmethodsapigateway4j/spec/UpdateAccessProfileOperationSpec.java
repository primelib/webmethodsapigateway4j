package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.AccessProfile;
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
 * UpdateAccessProfileSpec
 * <p>
 * Specification for the UpdateAccessProfile operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAccessProfileOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of a team whose detail is to be updated in API Gateway.
     */
    @NotNull 
    private String accessProfileId;

    /**
     * This parameter describes the request payload of a accessProfile that is to be updated in API Gateway.
     */
    @NotNull 
    private AccessProfile body;

    /**
     * Constructs a validated instance of {@link UpdateAccessProfileOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAccessProfileOperationSpec(Consumer<UpdateAccessProfileOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAccessProfileOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accessProfileId      The path parameter specifies the id of a team whose detail is to be updated in API Gateway.
     * @param body                 This parameter describes the request payload of a accessProfile that is to be updated in API Gateway.
     */
    @ApiStatus.Internal
    public UpdateAccessProfileOperationSpec(String accessProfileId, AccessProfile body) {
        this.accessProfileId = accessProfileId;
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
        Objects.requireNonNull(accessProfileId, "accessProfileId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

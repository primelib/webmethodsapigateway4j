package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Policy;
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
 * GetApplicableAPIsForGlobalPolicyByIDSpec
 * <p>
 * Specification for the GetApplicableAPIsForGlobalPolicyByID operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetApplicableAPIsForGlobalPolicyByIDOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the global policy id for which we need the list of applicable APIs
     */
    @NotNull 
    private String policyId;

    /**
     * This is a query parameter. It is used to retrieve the list of applicable APIs for a global policy. If the value for this parameter is 'false' then it will return all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return only the list of applicable active APIs alone for the specified global policy
     */
    @Nullable 
    private String active;

    /**
     * Constructs a validated instance of {@link GetApplicableAPIsForGlobalPolicyByIDOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetApplicableAPIsForGlobalPolicyByIDOperationSpec(Consumer<GetApplicableAPIsForGlobalPolicyByIDOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetApplicableAPIsForGlobalPolicyByIDOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param policyId             This path parameter is used to specify the global policy id for which we need the list of applicable APIs
     * @param active               This is a query parameter. It is used to retrieve the list of applicable APIs for a global policy. If the value for this parameter is 'false' then it will return all the APIs whether it is active or not for the specified global policy. If the value for this flag is 'true' then it will return only the list of applicable active APIs alone for the specified global policy
     */
    @ApiStatus.Internal
    public GetApplicableAPIsForGlobalPolicyByIDOperationSpec(String policyId, String active) {
        this.policyId = policyId;
        this.active = active;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(policyId, "policyId is a required parameter!");
    }
}

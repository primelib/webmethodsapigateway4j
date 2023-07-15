package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetPoliciesSpec
 * <p>
 * Specification for the GetPolicies operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPoliciesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This query parameter is used to retrieve policy details of particular set of policies. The policy IDs need to be separated using ',' to specify more than one policy id
     */
    @Nullable 
    private String policyIds;

    /**
     * This query parameter is used to retrieve the Threat Protection policies created in API Gateway. The value of this query parameter should be threat protection, if other values specified it wont respect that value and return all the policies in the API Gateway
     */
    @Nullable 
    private String stage;

    /**
     * This query parameter is used to retrieve policy details for a list of policies of a particular policy type. The policy type can be template or global. If the policy type is template then policy details of all the policy templates is returned. If the policy type is global then the policy details of global policies is returned.If any other policy type is specified all policies are returned
     */
    @Nullable 
    private String policyType;

    /**
     * Constructs a validated implementation of {@link GetPoliciesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPoliciesOperationSpec(Consumer<GetPoliciesOperationSpec> spec) {
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
    }

}

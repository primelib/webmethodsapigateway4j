// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;

/**
 * GetAllSubscriptionUsage
 * <p>
 * This endpoint is used to list the aggregated details of each active subscription for current cycle. This can be used with filters mentioned as query parameter to fine grain the result. For example, if you want to fetch the list of usage of active subscription for package GoldPackage, then you can specify package=GoldPackage in query parameter. The result will contain usage details of subscription belongs to GoldPackage alone. You can either fetch all the records at once or use the from and size query parameter to fetch subset of details. 
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetAllSubscriptionUsageOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Subscription name to search for usage
     *
     */
    @Nullable
    private String name;

    /**
     * Package name to search for usage
     *
     */
    @Nullable
    private String packageProp;

    /**
     * Plan name to search for usage
     *
     */
    @Nullable
    private String plan;

    /**
     * Starting index number of the usage result to fetch
     *
     */
    @Nullable
    private Long from;

    /**
     * Number of results to be fetched for the usage result
     *
     */
    @Nullable
    private Long size;

    /**
     * true to get the count for the search or all the usages available
     *
     */
    @Nullable
    private String count;

    /**
     * Constructs a validated instance of {@link GetAllSubscriptionUsageOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllSubscriptionUsageOperationSpec(Consumer<GetAllSubscriptionUsageOperationSpec> spec) {
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

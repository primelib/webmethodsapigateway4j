package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Plan;
import io.github.primelib.webmethodsapigateway4j.model.Usage;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllSubscriptionUsageSpec
 * <p>
 * Specification for the GetAllSubscriptionUsage operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllSubscriptionUsageOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Subscription name to search for usage
     */
    @Nullable 
    private String name;

    /**
     * Package name to search for usage
     */
    @Nullable 
    private String _package;

    /**
     * Plan name to search for usage
     */
    @Nullable 
    private String plan;

    /**
     * Starting index number of the usage result to fetch
     */
    @Nullable 
    private Integer from;

    /**
     * Number of results to be fetched for the usage result
     */
    @Nullable 
    private Integer size;

    /**
     * true to get the count for the search or all the usages available
     */
    @Nullable 
    private String count = "false";

    /**
     * Constructs a validated implementation of {@link GetAllSubscriptionUsageOperationSpec}.
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

package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Plan;
import java.util.Set;
import io.github.primelib.webmethodsapigateway4j.model.Usage;
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
 * GetAllSubscriptionUsageSpec
 * <p>
 * Specification for the GetAllSubscriptionUsage operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetAllSubscriptionUsageOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param name                 Subscription name to search for usage
     * @param _package             Package name to search for usage
     * @param plan                 Plan name to search for usage
     * @param from                 Starting index number of the usage result to fetch
     * @param size                 Number of results to be fetched for the usage result
     * @param count                true to get the count for the search or all the usages available
     */
    @ApiStatus.Internal
    public GetAllSubscriptionUsageOperationSpec(String name, String _package, String plan, Integer from, Integer size, String count) {
        this.name = name;
        this._package = _package;
        this.plan = plan;
        this.from = from;
        this.size = size;
        this.count = count;

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

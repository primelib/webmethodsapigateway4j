package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Application;
import java.time.LocalDate;
import io.github.primelib.webmethodsapigateway4j.model.Plan;
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
 * GetTransactionsSpec
 * <p>
 * Specification for the GetTransactions operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTransactionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is the date from which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     */
    @NotNull 
    private LocalDate fromDate;

    /**
     * This is the date to which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     */
    @NotNull 
    private LocalDate toDate;

    /**
     * The name of the API
     * for which the invocation details is required.The exact name must be provided or regular expressions can be used like API_.*
     */
    @Nullable 
    private String apiName;

    /**
     * The version of the API
     */
    @Nullable 
    private String apiVersion;

    /**
     * The system generated id for an API.The id of an can be retrieved from the API details screen
     */
    @Nullable 
    private String apiId;

    /**
     * The name of the Application for which the invocation details is required.The exact name must be provided or regular expressions can be used like APP_.*
     */
    @Nullable 
    private String applicationName;

    /**
     * The system generated id for an Application.The id of an can be retrieved from the Application details screen
     */
    @Nullable 
    private String applicationId;

    /**
     * The name of the Package for which the invocation details is required.The exact name must be provided or regular expressions can be used like Package_.*
     */
    @Nullable 
    private String packageName;

    /**
     * The system generated id for a Package.The id of an can be retrieved from the Package details screen
     */
    @Nullable 
    private String packageId;

    /**
     * The name of the Plan
     * for which the invocation details is required.The exact name must be provided or regular expressions can be used like Plan_.*
     */
    @Nullable 
    private String planName;

    /**
     * The system generated id for a Plan.The id of an can be retrieved from the Plan details screen
     */
    @Nullable 
    private String planId;

    /**
     * This parameter specifies the index from which the data has to be retrieved from the store. It is mainly used during pagination where the data is retrieved in batches
     */
    @Nullable 
    private Integer from;

    /**
     * This parameter specifies the number of records that should be present in the response. This can be combined with the parameter - from to get the records in batches during pagination.
     */
    @Nullable 
    private Integer size;

    /**
     * Constructs a validated instance of {@link GetTransactionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTransactionsOperationSpec(Consumer<GetTransactionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetTransactionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fromDate             This is the date from which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     * @param toDate               This is the date to which the invocation details has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     * @param apiName              The name of the API  for which the invocation details is required.The exact name must be provided or regular expressions can be used like API_.*
     * @param apiVersion           The version of the API
     * @param apiId                The system generated id for an API.The id of an can be retrieved from the API details screen
     * @param applicationName      The name of the Application for which the invocation details is required.The exact name must be provided or regular expressions can be used like APP_.*
     * @param applicationId        The system generated id for an Application.The id of an can be retrieved from the Application details screen
     * @param packageName          The name of the Package for which the invocation details is required.The exact name must be provided or regular expressions can be used like Package_.*
     * @param packageId            The system generated id for a Package.The id of an can be retrieved from the Package details screen
     * @param planName             The name of the Plan  for which the invocation details is required.The exact name must be provided or regular expressions can be used like Plan_.*
     * @param planId               The system generated id for a Plan.The id of an can be retrieved from the Plan details screen
     * @param from                 This parameter specifies the index from which the data has to be retrieved from the store. It is mainly used during pagination where the data is retrieved in batches
     * @param size                 This parameter specifies the number of records that should be present in the response. This can be combined with the parameter - from to get the records in batches during pagination.
     */
    @ApiStatus.Internal
    public GetTransactionsOperationSpec(LocalDate fromDate, LocalDate toDate, String apiName, String apiVersion, String apiId, String applicationName, String applicationId, String packageName, String packageId, String planName, String planId, Integer from, Integer size) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.apiId = apiId;
        this.applicationName = applicationName;
        this.applicationId = applicationId;
        this.packageName = packageName;
        this.packageId = packageId;
        this.planName = planName;
        this.planId = planId;
        this.from = from;
        this.size = size;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(fromDate, "fromDate is a required parameter!");
        Objects.requireNonNull(toDate, "toDate is a required parameter!");
    }
}

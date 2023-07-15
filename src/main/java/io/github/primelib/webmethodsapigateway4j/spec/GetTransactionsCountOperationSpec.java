package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Application;
import java.time.LocalDate;
import io.github.primelib.webmethodsapigateway4j.model.Plan;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetTransactionsCountSpec
 * <p>
 * Specification for the GetTransactionsCount operation.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTransactionsCountOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This is the date from which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     */
    @NotNull 
    private LocalDate fromDate;

    /**
     * This is the date to which the count has to be retrieved for the matching filter criteria.It is a mandatory parameter and it should be of the format YYYY-MM-DD. Regular expression support is not available for this parameter
     */
    @NotNull 
    private LocalDate toDate;

    /**
     * The name of the API
     * for which the invocation count is required.The exact name must be provided or regular expressions can be used like API_.*
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
     * The name of the Application for which the invocation count is required.The exact name must be provided or regular expressions can be used like APP_.*
     */
    @Nullable 
    private String applicationName;

    /**
     * The system generated id for an Application.The id of an can be retrieved from the Application details screen
     */
    @Nullable 
    private String applicationId;

    /**
     * The name of the Package for which the invocation count is required.The exact name must be provided or regular expressions can be used like Package_.*
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
     * for which the invocation count is required.The exact name must be provided or regular expressions can be used like Plan_.*
     */
    @Nullable 
    private String planName;

    /**
     * The system generated id for a Plan.The id of an can be retrieved from the Plan details screen
     */
    @Nullable 
    private String planId;

    /**
     * Constructs a validated implementation of {@link GetTransactionsCountOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTransactionsCountOperationSpec(Consumer<GetTransactionsCountOperationSpec> spec) {
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
        Objects.requireNonNull(fromDate, "fromDate is a required parameter!");
        Objects.requireNonNull(toDate, "toDate is a required parameter!");
    }

}

package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * NotifyAPIImplementationSpec
 * <p>
 * Specification for the NotifyAPIImplementation operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotifyAPIImplementationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Id for the API to be updated
     */
    @NotNull 
    private String apiId;

    /**
     */
    @Nullable 
    private String maturityState;

    /**
     */
    @Nullable 
    private List<String> nativeBaseURLs;

    /**
     * Constructs a validated instance of {@link NotifyAPIImplementationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotifyAPIImplementationOperationSpec(Consumer<NotifyAPIImplementationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link NotifyAPIImplementationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiId                API Id for the API to be updated
     * @param maturityState        
     * @param nativeBaseURLs       
     */
    @ApiStatus.Internal
    public NotifyAPIImplementationOperationSpec(String apiId, String maturityState, List<String> nativeBaseURLs) {
        this.apiId = apiId;
        this.maturityState = maturityState;
        this.nativeBaseURLs = nativeBaseURLs;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(apiId, "apiId is a required parameter!");
    }
}

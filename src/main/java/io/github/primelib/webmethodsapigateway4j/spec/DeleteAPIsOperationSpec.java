package io.github.primelib.webmethodsapigateway4j.spec;

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
 * DeleteAPIsSpec
 * <p>
 * Specification for the DeleteAPIs operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAPIsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Ids for the APIs to be deleted. Multiple API ids combined by comma
     */
    @NotNull 
    private String apiIds;

    /**
     * Flag for force delete. Required when API is associated with some applications
     */
    @Nullable 
    private Boolean forceDelete;

    /**
     * Constructs a validated instance of {@link DeleteAPIsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAPIsOperationSpec(Consumer<DeleteAPIsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteAPIsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiIds               API Ids for the APIs to be deleted. Multiple API ids combined by comma
     * @param forceDelete          Flag for force delete. Required when API is associated with some applications
     */
    @ApiStatus.Internal
    public DeleteAPIsOperationSpec(String apiIds, Boolean forceDelete) {
        this.apiIds = apiIds;
        this.forceDelete = forceDelete;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(apiIds, "apiIds is a required parameter!");
    }
}

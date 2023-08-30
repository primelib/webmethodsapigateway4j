package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
import io.github.primelib.webmethodsapigateway4j.model.Promotion;
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
 * CreatePromotionSpec
 * <p>
 * Specification for the CreatePromotion operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePromotionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Promotion request payload
     */
    @NotNull 
    private Promotion body;

    /**
     * Option to fix the API version history. The discrepancy between the asset versions in the source and target stages, if any, are fixed. The default value is false
     */
    @Nullable 
    private String fixingMissingVersions;

    /**
     * Option to overwrite the assets except aliases in the destination stage during asset promotion. The default value is false
     */
    @Nullable 
    private Boolean overwrite;

    /**
     * Option to overwrite the asset type 'alias' in the destination stage during asset promotion. The default value is 'false'. This parameter takes precedence over the 'overwrite' parameter.
     */
    @Nullable 
    private Boolean overwriteAlias;

    /**
     * Constructs a validated instance of {@link CreatePromotionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatePromotionOperationSpec(Consumer<CreatePromotionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreatePromotionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param body                 Promotion request payload
     * @param fixingMissingVersions Option to fix the API version history. The discrepancy between the asset versions in the source and target stages, if any, are fixed. The default value is false
     * @param overwrite            Option to overwrite the assets except aliases in the destination stage during asset promotion. The default value is false
     * @param overwriteAlias       Option to overwrite the asset type 'alias' in the destination stage during asset promotion. The default value is 'false'. This parameter takes precedence over the 'overwrite' parameter.
     */
    @ApiStatus.Internal
    public CreatePromotionOperationSpec(Promotion body, String fixingMissingVersions, Boolean overwrite, Boolean overwriteAlias) {
        this.body = body;
        this.fixingMissingVersions = fixingMissingVersions;
        this.overwrite = overwrite;
        this.overwriteAlias = overwriteAlias;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

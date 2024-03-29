package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.Alias;
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
 * GetAliasSpec
 * <p>
 * Specification for the GetAlias operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAliasOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of an alias whose details are to be retrieved.
     */
    @NotNull 
    private String aliasId;

    /**
     * Constructs a validated instance of {@link GetAliasOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAliasOperationSpec(Consumer<GetAliasOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAliasOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param aliasId              The path parameter specifies the id of an alias whose details are to be retrieved.
     */
    @ApiStatus.Internal
    public GetAliasOperationSpec(String aliasId) {
        this.aliasId = aliasId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(aliasId, "aliasId is a required parameter!");
    }
}

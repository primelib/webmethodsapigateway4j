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
 * UpdateAliasSpec
 * <p>
 * Specification for the UpdateAlias operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAliasOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The path parameter specifies the id of an alias whose detail is to be updated in API Gateway.
     */
    @NotNull 
    private String aliasId;

    /**
     * This parameter describes the request payload of an alias that is to be updated in API Gateway.
     */
    @NotNull 
    private Alias body;

    /**
     * Constructs a validated instance of {@link UpdateAliasOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAliasOperationSpec(Consumer<UpdateAliasOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAliasOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param aliasId              The path parameter specifies the id of an alias whose detail is to be updated in API Gateway.
     * @param body                 This parameter describes the request payload of an alias that is to be updated in API Gateway.
     */
    @ApiStatus.Internal
    public UpdateAliasOperationSpec(String aliasId, Alias body) {
        this.aliasId = aliasId;
        this.body = body;

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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

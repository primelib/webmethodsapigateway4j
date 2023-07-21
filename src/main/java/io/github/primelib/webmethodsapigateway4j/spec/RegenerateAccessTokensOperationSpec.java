package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.AccessTokensTypeModel;
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
 * RegenerateAccessTokensSpec
 * <p>
 * Specification for the RegenerateAccessTokens operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RegenerateAccessTokensOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter specifies the ID of an application for generating the access Tokens in API Gateway.
     */
    @NotNull 
    private String applicationId;

    /**
     * This parameter specifies the type of token to be regenerated.
     */
    @NotNull 
    private AccessTokensTypeModel body;

    /**
     * Constructs a validated instance of {@link RegenerateAccessTokensOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RegenerateAccessTokensOperationSpec(Consumer<RegenerateAccessTokensOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RegenerateAccessTokensOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param applicationId        This parameter specifies the ID of an application for generating the access Tokens in API Gateway.
     * @param body                 This parameter specifies the type of token to be regenerated.
     */
    @ApiStatus.Internal
    public RegenerateAccessTokensOperationSpec(String applicationId, AccessTokensTypeModel body) {
        this.applicationId = applicationId;
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
        Objects.requireNonNull(applicationId, "applicationId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

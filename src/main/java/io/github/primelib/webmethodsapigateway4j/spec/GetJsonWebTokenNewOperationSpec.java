package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.JWT;
import io.github.primelib.webmethodsapigateway4j.model.JWTServiceInput;
import io.github.primelib.webmethodsapigateway4j.model.ServiceInput;
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
 * GetJsonWebTokenNewSpec
 * <p>
 * Specification for the GetJsonWebTokenNew operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetJsonWebTokenNewOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter describes the request payload of an application that is to be created in API Gateway.
     */
    @NotNull 
    private JWTServiceInput body;

    /**
     * Constructs a validated instance of {@link GetJsonWebTokenNewOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetJsonWebTokenNewOperationSpec(Consumer<GetJsonWebTokenNewOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetJsonWebTokenNewOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param body                 This parameter describes the request payload of an application that is to be created in API Gateway.
     */
    @ApiStatus.Internal
    public GetJsonWebTokenNewOperationSpec(JWTServiceInput body) {
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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

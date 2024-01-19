package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.IPAccessMode;
import io.github.primelib.webmethodsapigateway4j.model.IPAccessModeHostsList;
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
 * UpdatedIPAccessModeSpec
 * <p>
 * Specification for the UpdatedIPAccessMode operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatedIPAccessModeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.
     */
    @NotNull 
    private String listenerKey;

    /**
     * The request contains update the ip access mode hosts list information.
     */
    @NotNull 
    private IPAccessModeHostsList body;

    /**
     * Constructs a validated instance of {@link UpdatedIPAccessModeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatedIPAccessModeOperationSpec(Consumer<UpdatedIPAccessModeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdatedIPAccessModeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param listenerKey          The listenerKey parameter uniquely identifies a port configuration within the WmRoot package.
     * @param body                 The request contains update the ip access mode hosts list information.
     */
    @ApiStatus.Internal
    public UpdatedIPAccessModeOperationSpec(String listenerKey, IPAccessModeHostsList body) {
        this.listenerKey = listenerKey;
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
        Objects.requireNonNull(listenerKey, "listenerKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}

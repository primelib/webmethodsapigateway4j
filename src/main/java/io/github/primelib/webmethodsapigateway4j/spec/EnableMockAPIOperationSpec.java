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
 * EnableMockAPISpec
 * <p>
 * Specification for the EnableMockAPI operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EnableMockAPIOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Id for the API to be activated
     */
    @NotNull 
    private String apiId;

    /**
     * Flag to retain generated mocked responses. When this is set to true, default mocked responses will be retained. If it's set to false, new default mocked responses will be generated using the examples, schema in the API
     */
    @Nullable 
    private Boolean retainDefaultMockResponses;

    /**
     * Constructs a validated instance of {@link EnableMockAPIOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EnableMockAPIOperationSpec(Consumer<EnableMockAPIOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link EnableMockAPIOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiId                API Id for the API to be activated
     * @param retainDefaultMockResponses Flag to retain generated mocked responses. When this is set to true, default mocked responses will be retained. If it's set to false, new default mocked responses will be generated using the examples, schema in the API
     */
    @ApiStatus.Internal
    public EnableMockAPIOperationSpec(String apiId, Boolean retainDefaultMockResponses) {
        this.apiId = apiId;
        this.retainDefaultMockResponses = retainDefaultMockResponses;

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

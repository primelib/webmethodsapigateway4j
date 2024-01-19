package io.github.primelib.webmethodsapigateway4j.spec;

import org.jetbrains.annotations.ApiStatus;
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
 * GetAPIsSpec
 * <p>
 * Specification for the GetAPIs operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAPIsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * API Ids for the API to be retrieved
     */
    @Nullable 
    private String apiIds;

    /**
     * Starting index from the list of APIs to be retrieved
     */
    @Nullable 
    private Integer from;

    /**
     * Number of APIs to be retrieved
     */
    @Nullable 
    private Integer size;

    /**
     * Constructs a validated instance of {@link GetAPIsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAPIsOperationSpec(Consumer<GetAPIsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAPIsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param apiIds               API Ids for the API to be retrieved
     * @param from                 Starting index from the list of APIs to be retrieved
     * @param size                 Number of APIs to be retrieved
     */
    @ApiStatus.Internal
    public GetAPIsOperationSpec(String apiIds, Integer from, Integer size) {
        this.apiIds = apiIds;
        this.from = from;
        this.size = size;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}

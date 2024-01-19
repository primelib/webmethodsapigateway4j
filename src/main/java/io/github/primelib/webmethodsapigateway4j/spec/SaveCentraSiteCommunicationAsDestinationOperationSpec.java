package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.webmethodsapigateway4j.model.CSCommunicationDestination;
import io.github.primelib.webmethodsapigateway4j.model.Destination;
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
 * SaveCentraSiteCommunicationAsDestinationSpec
 * <p>
 * Specification for the SaveCentraSiteCommunicationAsDestination operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SaveCentraSiteCommunicationAsDestinationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CSCommunicationDestination body;

    /**
     * Constructs a validated instance of {@link SaveCentraSiteCommunicationAsDestinationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SaveCentraSiteCommunicationAsDestinationOperationSpec(Consumer<SaveCentraSiteCommunicationAsDestinationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SaveCentraSiteCommunicationAsDestinationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param body                 
     */
    @ApiStatus.Internal
    public SaveCentraSiteCommunicationAsDestinationOperationSpec(CSCommunicationDestination body) {
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

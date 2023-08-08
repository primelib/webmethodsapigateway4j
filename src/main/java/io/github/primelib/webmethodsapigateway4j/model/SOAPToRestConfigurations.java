package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPToRestConfigurations
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "removeRootElement",
    "useDefaultElements",
    "useSchemaForTransformation"
})
@JsonTypeName("SOAPToRestConfigurations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPToRestConfigurations {

    @JsonProperty("removeRootElement")
    protected Boolean removeRootElement;

    @JsonProperty("useDefaultElements")
    protected Boolean useDefaultElements;

    @JsonProperty("useSchemaForTransformation")
    protected Boolean useSchemaForTransformation;

    /**
     * Constructs a validated instance of {@link SOAPToRestConfigurations}.
     *
     * @param spec the specification to process
     */
    public SOAPToRestConfigurations(Consumer<SOAPToRestConfigurations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPToRestConfigurations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPToRestConfigurations(Consumer)} instead.
     * @param removeRootElement removeRootElement
     * @param useDefaultElements useDefaultElements
     * @param useSchemaForTransformation useSchemaForTransformation
     */
    @ApiStatus.Internal
    public SOAPToRestConfigurations(Boolean removeRootElement, Boolean useDefaultElements, Boolean useSchemaForTransformation) {
        this.removeRootElement = removeRootElement;
        this.useDefaultElements = useDefaultElements;
        this.useSchemaForTransformation = useSchemaForTransformation;
    }

}

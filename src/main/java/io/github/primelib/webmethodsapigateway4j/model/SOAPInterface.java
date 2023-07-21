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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPInterface
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
    "name",
    "operations"
})
@JsonTypeName("SOAPInterface")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPInterface {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("operations")
    protected List<SOAPOperation> operations;

    /**
     * Constructs a validated instance of {@link SOAPInterface}.
     *
     * @param spec the specification to process
     */
    public SOAPInterface(Consumer<SOAPInterface> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPInterface}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPInterface(Consumer)} instead.
     * @param name var.name
     * @param operations var.name
     */
    @ApiStatus.Internal
    public SOAPInterface(String name, List<SOAPOperation> operations) {
        this.name = name;
        this.operations = operations;
    }

}

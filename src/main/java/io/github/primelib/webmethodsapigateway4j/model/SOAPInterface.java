package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPInterface
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "operations"
})
@JsonTypeName("SOAPInterface")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPInterface {

    /**
     * Constructs a validated implementation of {@link SOAPInterface}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SOAPInterface(Consumer<SOAPInterface> spec) {
        spec.accept(this);
    }

    @JsonProperty("name")
    protected String name;

    @JsonProperty("operations")
    protected List<SOAPOperation> operations;


}

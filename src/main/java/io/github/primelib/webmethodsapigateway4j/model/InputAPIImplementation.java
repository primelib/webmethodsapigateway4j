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
 * InputAPIImplementation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "maturityState",
    "nativeBaseURLs"
})
@JsonTypeName("InputAPIImplementation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputAPIImplementation {

    /**
     * Constructs a validated implementation of {@link InputAPIImplementation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputAPIImplementation(Consumer<InputAPIImplementation> spec) {
        spec.accept(this);
    }

    @JsonProperty("maturityState")
    protected String maturityState;

    @JsonProperty("nativeBaseURLs")
    protected List<String> nativeBaseURLs;


}

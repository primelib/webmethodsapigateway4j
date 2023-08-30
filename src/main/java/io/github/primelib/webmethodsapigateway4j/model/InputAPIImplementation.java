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
 * InputAPIImplementation
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
    "maturityState",
    "nativeBaseURLs"
})
@JsonTypeName("InputAPIImplementation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputAPIImplementation {

    @JsonProperty("maturityState")
    protected String maturityState;

    @JsonProperty("nativeBaseURLs")
    protected List<String> nativeBaseURLs;

    /**
     * Constructs a validated instance of {@link InputAPIImplementation}.
     *
     * @param spec the specification to process
     */
    public InputAPIImplementation(Consumer<InputAPIImplementation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputAPIImplementation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputAPIImplementation(Consumer)} instead.
     * @param maturityState maturityState
     * @param nativeBaseURLs nativeBaseURLs
     */
    @ApiStatus.Internal
    public InputAPIImplementation(String maturityState, List<String> nativeBaseURLs) {
        this.maturityState = maturityState;
        this.nativeBaseURLs = nativeBaseURLs;
    }

}

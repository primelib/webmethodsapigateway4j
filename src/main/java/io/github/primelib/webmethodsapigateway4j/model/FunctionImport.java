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
 * FunctionImport
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
    "enabled",
    "function"
})
@JsonTypeName("FunctionImport")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FunctionImport {

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("function")
    protected String function;

    /**
     * Constructs a validated instance of {@link FunctionImport}.
     *
     * @param spec the specification to process
     */
    public FunctionImport(Consumer<FunctionImport> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FunctionImport}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FunctionImport(Consumer)} instead.
     * @param enabled enabled
     * @param function function
     */
    @ApiStatus.Internal
    public FunctionImport(Boolean enabled, String function) {
        this.enabled = enabled;
        this.function = function;
    }

}

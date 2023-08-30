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
 * CallbackProcessorSettings
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
    "configuration"
})
@JsonTypeName("CallbackProcessorSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CallbackProcessorSettings {

    @JsonProperty("configuration")
    protected APICallbackSettings configuration;

    /**
     * Constructs a validated instance of {@link CallbackProcessorSettings}.
     *
     * @param spec the specification to process
     */
    public CallbackProcessorSettings(Consumer<CallbackProcessorSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CallbackProcessorSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CallbackProcessorSettings(Consumer)} instead.
     * @param configuration configuration
     */
    @ApiStatus.Internal
    public CallbackProcessorSettings(APICallbackSettings configuration) {
        this.configuration = configuration;
    }

}

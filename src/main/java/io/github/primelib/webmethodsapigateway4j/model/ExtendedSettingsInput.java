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
 * ExtendedSettingsInput
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
    "preferredSettings"
})
@JsonTypeName("ExtendedSettingsInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedSettingsInput {

    @JsonProperty("preferredSettings")
    protected Settings preferredSettings;

    /**
     * Constructs a validated instance of {@link ExtendedSettingsInput}.
     *
     * @param spec the specification to process
     */
    public ExtendedSettingsInput(Consumer<ExtendedSettingsInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExtendedSettingsInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExtendedSettingsInput(Consumer)} instead.
     * @param preferredSettings preferredSettings
     */
    @ApiStatus.Internal
    public ExtendedSettingsInput(Settings preferredSettings) {
        this.preferredSettings = preferredSettings;
    }

}

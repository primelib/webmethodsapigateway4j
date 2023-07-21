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
 * ExtendedSettingsOutput
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
    "allSettings",
    "preferredSettings"
})
@JsonTypeName("ExtendedSettingsOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedSettingsOutput {

    @JsonProperty("allSettings")
    protected Settings allSettings;

    @JsonProperty("preferredSettings")
    protected Settings preferredSettings;

    /**
     * Constructs a validated instance of {@link ExtendedSettingsOutput}.
     *
     * @param spec the specification to process
     */
    public ExtendedSettingsOutput(Consumer<ExtendedSettingsOutput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExtendedSettingsOutput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExtendedSettingsOutput(Consumer)} instead.
     * @param allSettings var.name
     * @param preferredSettings var.name
     */
    @ApiStatus.Internal
    public ExtendedSettingsOutput(Settings allSettings, Settings preferredSettings) {
        this.allSettings = allSettings;
        this.preferredSettings = preferredSettings;
    }

}

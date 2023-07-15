package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtendedSettingsOutput
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allSettings",
    "preferredSettings"
})
@JsonTypeName("ExtendedSettingsOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedSettingsOutput {

    /**
     * Constructs a validated implementation of {@link ExtendedSettingsOutput}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExtendedSettingsOutput(Consumer<ExtendedSettingsOutput> spec) {
        spec.accept(this);
    }

    @JsonProperty("allSettings")
    protected Settings allSettings;

    @JsonProperty("preferredSettings")
    protected Settings preferredSettings;


}

// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AdminExtendedSettingsOutput
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminExtendedSettingsOutput")
@JsonPropertyOrder({
    "allSettings",
    "preferredSettings"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AdminExtendedSettingsOutput {

    @JsonProperty("allSettings")
    protected AdminSettings allSettings;

    @JsonProperty("preferredSettings")
    protected AdminSettings preferredSettings;

    /**
     * Constructs a validated instance of {@link AdminExtendedSettingsOutput}.
     *
     * @param spec the specification to process
     */
    public AdminExtendedSettingsOutput(Consumer<AdminExtendedSettingsOutput> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminExtendedSettingsOutput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminExtendedSettingsOutput(Consumer)} instead.
     * @param allSettings allSettings
     * @param preferredSettings preferredSettings
     */
    @ApiStatus.Internal
    public AdminExtendedSettingsOutput(AdminSettings allSettings, AdminSettings preferredSettings) {
        this.allSettings = allSettings;
        this.preferredSettings = preferredSettings;
    }
}

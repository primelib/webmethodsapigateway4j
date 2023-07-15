package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "extendedKeys",
    "wattKeys"
})
@JsonTypeName("Settings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Settings {

    /**
     * Constructs a validated implementation of {@link Settings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Settings(Consumer<Settings> spec) {
        spec.accept(this);
    }

    /**
     * A map containing the API Gateway Extended Settings key-value pair.
     */
    @JsonProperty("extendedKeys")
    protected Map<String, String> extendedKeys = new HashMap<>();

    /**
     * A map containing the Integration Server Watt properties key-value pair.
     */
    @JsonProperty("wattKeys")
    protected Map<String, String> wattKeys = new HashMap<>();


}

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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings
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
    "extendedKeys",
    "wattKeys"
})
@JsonTypeName("Settings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Settings {

    /**
     * A map containing the API Gateway Extended Settings key-value pair.
     */
    @JsonProperty("extendedKeys")
    protected Map<String, String> extendedKeys;

    /**
     * A map containing the Integration Server Watt properties key-value pair.
     */
    @JsonProperty("wattKeys")
    protected Map<String, String> wattKeys;

    /**
     * Constructs a validated instance of {@link Settings}.
     *
     * @param spec the specification to process
     */
    public Settings(Consumer<Settings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Settings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Settings(Consumer)} instead.
     * @param extendedKeys A map containing the API Gateway Extended Settings key-value pair.
     * @param wattKeys A map containing the Integration Server Watt properties key-value pair.
     */
    @ApiStatus.Internal
    public Settings(Map<String, String> extendedKeys, Map<String, String> wattKeys) {
        this.extendedKeys = extendedKeys;
        this.wattKeys = wattKeys;
    }

}

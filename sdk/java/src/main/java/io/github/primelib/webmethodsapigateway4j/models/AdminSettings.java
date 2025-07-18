// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
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
 * AdminSettings
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminSettings")
@JsonPropertyOrder({
    "extendedKeys",
    "wattKeys"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AdminSettings {

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
     * Constructs a validated instance of {@link AdminSettings}.
     *
     * @param spec the specification to process
     */
    public AdminSettings(Consumer<AdminSettings> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminSettings(Consumer)} instead.
     * @param extendedKeys A map containing the API Gateway Extended Settings key-value pair.
     * @param wattKeys A map containing the Integration Server Watt properties key-value pair.
     */
    @ApiStatus.Internal
    public AdminSettings(Map<String, String> extendedKeys, Map<String, String> wattKeys) {
        this.extendedKeys = extendedKeys;
        this.wattKeys = wattKeys;
    }
}
